import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.guessProjectDir
import com.intellij.openapi.roots.ui.componentsList.layout.VerticalStackLayout
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.event.ActionEvent
import javax.swing.JTextField
import javax.swing.JComponent
import javax.swing.JPanel
import javax.swing.JLabel
import javax.swing.JButton
import javax.swing.BorderFactory

class CustomDialogWrapper(
    private val project: Project,
    createAction: (currentProject: Project, sdk: Int, name: String, location: String, packageName: String) -> Unit
) : DialogWrapper(true) {

    private val dialogTitle = "Create multi modules KMM project"
    private val minSdkVersion = 21
    private var name: String = "My Application"
    private var packageName = "com.example.${name.decapitalize().replace(" ", "")}"
    private var location = (project.guessProjectDir()?.toNioPath()?.parent ?: "").toString()

    private val myAppName = JTextField(name)
    private val myPackageName = JTextField(packageName)
    private val myProjectLocation = TextFieldWithBrowseButton(JTextField(location))

    private var createAction = object : OkAction() {
        override fun doAction(e: ActionEvent?) {
            super.doAction(e)
            createAction(project, minSdkVersion, myAppName.text, myProjectLocation.text, myPackageName.text)
        }
    }

    init {
        title = dialogTitle
        init()
    }

    override fun createCenterPanel(): JComponent {
        val dialogPanel = JPanel(BorderLayout())
        val labelPanel = JPanel(VerticalStackLayout())
        val dataPanel = JPanel(VerticalStackLayout())

        val nameText = JLabel("Name")
        val packageNameText = JLabel("Package name")
        val saveLocationText = JLabel("Save location")
        val minSDKText = JLabel("Min SDK")

        myAppName.addActionListener { name = myAppName.text }
        myPackageName.addActionListener { packageName = myPackageName.text }
        myProjectLocation.addActionListener { location = myProjectLocation.text }

        val chooserDescriptor = FileChooserDescriptor(false, true, false, false, false, false)
        myProjectLocation.addBrowseFolderListener(
            null,
            null,
            project,
            chooserDescriptor
        )

        // FormFactor class initialization problems, so sdk will be default
        val minSdkVersion = 24
        val myApiLevelCombo = JLabel("Permanent version $minSdkVersion")
//        val myApiLevelCombo = AndroidApiLevelComboBox()
//        val androidVersionsInfo = AndroidVersionsInfo()
//        androidVersionsInfo.loadLocalVersions()
//        myApiLevelCombo.init(FormFactor.MOBILE, androidVersionsInfo.getKnownTargetVersions(FormFactor.MOBILE, minSdkVersion))
//        androidVersionsInfo.loadRemoteTargetVersions(FormFactor.MOBILE, minSdkVersion)
//        { items -> myApiLevelCombo.init(FormFactor.MOBILE, items) }


        addComponentsToTable(labelPanel, listOf(nameText, packageNameText, saveLocationText, minSDKText), 100)
        addComponentsToTable(
            dataPanel,
            listOf(myAppName, myPackageName, myProjectLocation, myApiLevelCombo),
            250
        )

        dialogPanel.add(labelPanel, BorderLayout.WEST)
        dialogPanel.add(dataPanel, BorderLayout.AFTER_LINE_ENDS)
        dialogPanel.border = BorderFactory.createEmptyBorder(5, 5, 5, 5)
        return dialogPanel
    }

    override fun createButtonsPanel(buttons: MutableList<out JButton>): JPanel {
        return super.createButtonsPanel(buttons)
    }

    override fun createActions() = arrayOf(createAction, cancelAction)

    private fun addComponentsToTable(table: JComponent, componentList: List<JComponent>, componentWidth: Int) {
        val componentHeight = 35
        for (component in componentList) {
            component.preferredSize = Dimension(componentWidth, componentHeight)
            table.add(component)
        }
    }
}
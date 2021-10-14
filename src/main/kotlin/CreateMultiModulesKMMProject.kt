import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.impl.welcomeScreen.NewWelcomeScreen

class CreateMultiModulesKMMProject : AnAction() {

    override fun update(e: AnActionEvent) {
        NewWelcomeScreen.updateNewProjectIconIfWelcomeScreen(e)
    }

    override fun actionPerformed(event: AnActionEvent) {
        event.project?.let { project ->
            CustomDialogWrapper(project) { currentProject: Project, sdk: Int, name: String, location: String, packageName: String ->
                Project().create(currentProject, sdk, name, location, packageName)
            }.showAndGet()
        }
    }
}
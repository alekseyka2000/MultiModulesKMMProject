
import com.intellij.openapi.application.runWriteAction

class IdeaModule(parentDirectory: Directory) {
    init {
        val projectName = parentDirectory.directory.name
        val name = ".idea"
        val ideaDirectory = parentDirectory.createSubdirectory(name)

        val modulesFile = ideaDirectory.addFile("modules", Language.XML)
        modulesFile?.addNewText(MODULES_FILE.invoke(projectName))

        val modulesDirectory = ideaDirectory.createSubdirectory("modules")
        modulesDirectory.createSubdirectory("androidApp")
            .addFile("$projectName.androidApp.iml", ANDROID_APP.invoke(projectName))

        modulesDirectory.createSubdirectory("shared").apply {
            addFile("$projectName.shared.androidAndroidTestRelease.iml", ANDROID_ANDROID_TEST_RELEASE.invoke(projectName))
            addFile("$projectName.shared.commonMain.iml", COMMON_MAIN.invoke(projectName))
            addFile("$projectName.shared.commonTest.iml", COMMON_TEST.invoke(projectName))
            addFile("$projectName.shared.iml", SHARED.invoke(projectName))
            addFile("$projectName.shared.iosMain.iml", IOS_MAIN.invoke(projectName))
            addFile("$projectName.shared.iosTest.iml", IOS_TEST.invoke(projectName))
        }

        modulesDirectory.addFile("$projectName.iml", APP.invoke(projectName))
    }
}
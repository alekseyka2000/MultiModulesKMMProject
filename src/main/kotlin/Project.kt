import com.intellij.ide.SaveAndSyncHandler
import com.intellij.ide.impl.OpenProjectTask
import com.intellij.ide.impl.ProjectUtil
import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ex.ProjectManagerEx
import com.intellij.openapi.project.guessProjectDir
import com.intellij.psi.PsiManager
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.*

class Project {

    fun create(projectToClose: Project, sdk: Int, name: String, location: String, packageName: String) {
        val projectManager = ProjectManagerEx.getInstanceEx()
        val rootProjectsFilePath = Paths.get(location)
        val newName = checkProjectName(rootProjectsFilePath, name)
        val newProjectFile = rootProjectsFilePath.toString() + "\\$newName"
        val newProjectFilePath = Paths.get(newProjectFile)
        try {
            Files.createDirectories(rootProjectsFilePath)
            projectManager.newProject(newProjectFilePath, OpenProjectTask.newProject().withProjectName(newName))
                ?.let { newProject ->
                    newProject.save()
                    ProjectUtil.updateLastProjectLocation(newProjectFilePath)
                    ProjectManagerEx.getInstanceEx().openProject(
                        rootProjectsFilePath,
                        OpenProjectTask.withCreatedProject(newProject).withProjectName(newName)
                    )
                    addProjectContent(newProject, sdk, packageName)
                    if (!ApplicationManager.getApplication().isUnitTestMode) {
                        newProject.let { it1 ->
                            SaveAndSyncHandler.getInstance().scheduleProjectSave(it1)
                        }
                    }
                    projectToClose.showNotification("$name created successful!")
                }
        } catch (e: Exception) {
            projectToClose.showNotification("Error: ${e.message ?: "Create new project problem"}")
        }
    }

    private fun checkProjectName(location: Path, name: String): String {
        location.toFile().listFiles()?.let { files ->
            for (file in files) {
                if (file.name == name) {
                    val newName = changName(name)
                    return checkProjectName(location, newName)
                }
            }
        }
        return name
    }

    private fun changName(name: String): String {
        var numberInTheEnd = 0
        for (char in name.reversed()) {
            if (char.isDigit()) numberInTheEnd++ else break
        }
        return if (numberInTheEnd == 0) {
            name + "1"
        } else {
            name.take(name.length - numberInTheEnd) + name.takeLast(numberInTheEnd).toInt().inc()
        }
    }

    private fun addProjectContent(project: Project, minSdkVersion: Int, packageName: String) {
        val rootDirectory =
            project.guessProjectDir()
                ?.let { PsiManager.getInstance(project).findDirectory(it) }
                ?.let { Directory(project, it) }
        rootDirectory?.apply {
            addFile("settings.gradle", Language.KOTLIN_SCRIPT, SETTINGS_GRADLE_KTS.invoke(project.name))
            addFile("build.gradle", Language.KOTLIN_SCRIPT, BUILD_GRADLE)
            addFile("local", Language.PROPERTIES, LOCAL)
            addFile("gradle", Language.PROPERTIES, GRADLE)
            addFile("", Language.GIT_IGNORE, GITIGNOR_FILE_CONTENT1)
            addFile("gradlew", Language.FILE, GRADLEW)
            addFile("gradlew", Language.BAT, GRADLEW_BAT)
            createSubdirectory("gradle")
                .createSubdirectory("wrapper")
                .addFile("gradle-wrapper", Language.PROPERTIES, GRADLE_WRAPPER)

            IdeaModule(rootDirectory)
            SharedModule(rootDirectory, minSdkVersion, packageName)
            AndroidModule(rootDirectory, minSdkVersion, packageName)
        }
    }

    private fun Project.showNotification(message: String) {
        @Suppress("DEPRECATION")
        NotificationGroup("androidStudioNotification", NotificationDisplayType.BALLOON)
            .createNotification(
                "Create KMM project",
                message,
                NotificationType.INFORMATION,
                null
            ).notify(this)
    }
}
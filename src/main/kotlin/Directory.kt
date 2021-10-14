import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory

class Directory(private val project: Project, val directory: PsiDirectory) {

    fun findSubdirectory(name: String) =
        directory.findSubdirectory(name)?.let { Directory(project, it) }

    fun createSubdirectory(name: String) =
        this.findSubdirectory(name) ?: Directory(project, directory.createSubdirectory(name))

    fun addFile(name: String, language: Language, fileContent: String): File? {
        val newFile = addFile(name, language)
        newFile?.addText(fileContent)
        return newFile
    }

    fun addFile(name: String, fileContent: String): File? {
        val newFile = addFile(name)
        newFile?.addText(fileContent)
        return newFile
    }

    fun addFile(name: String, language: Language): File? {
        val fullFileName = File.getFullFileName(name, language)
        return addFile(fullFileName)
    }

    fun addFile(name: String): File? {
        return if (directory.findFile(name) == null) {
            File(project, directory.createFile(name))
        } else {
            null
        }
    }

    fun getFile(name: String, language: Language): File? {
        val fullFileName = File.getFullFileName(name, language)
        return getFile(fullFileName)
    }

    fun getFile(name: String) = directory.findFile(name)?.let { psiFile -> File(project, psiFile) }

    fun createModule(packageName: String) =
        createSubdirectory("kotlin").createSubdirectory(packageName)
}
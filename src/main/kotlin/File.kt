import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.fileEditor.FileDocumentManager
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.fileEditor.TextEditor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDocumentManager
import com.intellij.psi.PsiFile

class File(private val project: Project, private val file: PsiFile) {

    companion object {
        fun getFullFileName(name: String, language: Language): String = when (language) {
            Language.KOTLIN -> "$name${Language.KOTLIN.extension}"
            Language.KOTLIN_SCRIPT -> "$name${Language.KOTLIN_SCRIPT.extension}"
            Language.XML -> "$name${Language.XML.extension}"
            Language.GRADLE -> "$name${Language.GRADLE.extension}"
            Language.JSON -> "$name${Language.JSON.extension}"
            Language.PROGUARD -> "$name${Language.PROGUARD.extension}"
            Language.GIT_IGNORE -> "$name${Language.GIT_IGNORE.extension}"
            Language.PROPERTIES -> "$name${Language.PROPERTIES.extension}"
            Language.TEXT -> "$name${Language.TEXT.extension}"
            else -> "$name${Language.FILE.extension}"
        }
    }

    private val editorManager = FileEditorManager.getInstance(project)
    private val fileEditors = editorManager.openFile(file.virtualFile, true)

    fun addText(text: String) {
        for (fileEditor in fileEditors) {
            if (fileEditor is TextEditor) {
                val document = fileEditor.editor.document
                val fileContent = document.text
                document.setText(fileContent + text)
                if (ApplicationManager.getApplication().isUnitTestMode) {
                    FileDocumentManager.getInstance().saveDocument(document)
                }
                PsiDocumentManager.getInstance(project).commitDocument(document)
                break
            }
        }
    }

    fun addNewText(text: String) {
        for (fileEditor in fileEditors) {
            if (fileEditor is TextEditor) {
                val document = fileEditor.editor.document
                document.setText(text)
                if (ApplicationManager.getApplication().isUnitTestMode) {
                    FileDocumentManager.getInstance().saveDocument(document)
                }
                PsiDocumentManager.getInstance(project).commitDocument(document)
                break
            }
        }
    }
}
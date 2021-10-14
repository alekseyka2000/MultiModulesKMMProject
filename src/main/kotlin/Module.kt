class Module(parentDirectory: Directory, private val name: String) {
    init {
        val moduleDirectory = parentDirectory.apply {
            createSubdirectory(name)
            getFile("settings.gradle")?.addText("\ninclude ':$name'")
        }

        val srcAppDirectory = moduleDirectory.apply {
            createSubdirectory("src")
            addFile("", Language.GIT_IGNORE)
        }

        val mainAppDirectory = srcAppDirectory.createSubdirectory("main")
        val kotlinAppDirectory = mainAppDirectory.createSubdirectory("kotlin")
    }
}
class SharedModule(parentDirectory: Directory, minSdkVersion: Int, packageName: String) {

    init {
        val name = "shared"
        val sharedDirectory = parentDirectory.createSubdirectory(name)
        sharedDirectory.addFile(
            "build.gradle",
            Language.KOTLIN_SCRIPT,
            SHARED_MODULE_BUILD_GRADLE.invoke(minSdkVersion)
        )
        val srcDirectory = sharedDirectory.createSubdirectory("src")
        srcDirectory.apply {
            createSubdirectory("iosMain")
                .createModule(packageName)
                .addFile("Platform", Language.KOTLIN, PLATFORM_FILE_IOS.invoke(packageName))
            createSubdirectory("commonMain")
                .createModule(packageName).apply {
                    addFile("Platform", Language.KOTLIN, PLATFORM_FILE_COMMON.invoke(packageName))
                    addFile("Greeting", Language.KOTLIN, GREETING_FILE_COMMON.invoke(packageName))
                }
            createSubdirectory("androidMain").apply {
                addFile("AndroidManifest", Language.XML, MANIFEST_TEMPLATE.invoke(packageName))
                createModule(packageName)
                    .addFile("Platform", Language.KOTLIN, PLATFORM_FILE_ANDROID.invoke(packageName))
            }
        }
    }
}

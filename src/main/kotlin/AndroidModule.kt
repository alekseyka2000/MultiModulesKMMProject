class AndroidModule(parentDirectory: Directory, minSdkVersion: Int, packageName: String) {
    init {
        parentDirectory.createSubdirectory("androidApp").apply {
            addFile(
                "build.gradle",
                Language.KOTLIN_SCRIPT,
                MODULE_BUILD_GRADLE.invoke(packageName, minSdkVersion)
            )

            createSubdirectory("src")
                .createSubdirectory("main").apply {
                    createSubdirectory("kotlin")
                        .createSubdirectory("$packageName.android")
                        .addFile("MainActivity", Language.KOTLIN, MAIN_ACTIVITY.invoke(packageName))

                    createSubdirectory("res").apply {
                        createSubdirectory("layout").addFile("activity_main", Language.XML, ACTIVITY_MAIN)
                        createSubdirectory("values").apply {
                            addFile("colors", Language.XML, COLORS)
                            addFile("styles", Language.XML, STYLES)
                        }
                    }

                    addFile("AndroidManifest", Language.XML, MANIFEST_ANDROID_TEMPLATE.invoke(packageName))
                }
        }
    }
}
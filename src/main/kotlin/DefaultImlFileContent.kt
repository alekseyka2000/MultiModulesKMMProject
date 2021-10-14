val APP = { rootProjectName: String ->
    """<?xml version="1.0" encoding="UTF-8"?>
<module external.linked.project.id="$rootProjectName" external.linked.project.path="\u0024MODULE_DIR$/../.." external.root.project.path="\u0024MODULE_DIR$/../.." external.system.id="GRADLE" external.system.module.group="" external.system.module.version="unspecified" type="JAVA_MODULE" version="4">
  <component name="FacetManager">
    <facet type="java-gradle" name="Java-Gradle">
      <configuration>
        <option name="BUILDABLE" value="false" />
      </configuration>
    </facet>
  </component>
  <component name="NewModuleRootManager">
    <exclude-output />
    <content url="file://\u0024MODULE_DIR$/../..">
      <excludeFolder url="file://\u0024MODULE_DIR$/../../.gradle" />
      <excludeFolder url="file://\u0024MODULE_DIR$/../../build" />
    </content>
    <orderEntry type="inheritedJdk" />
    <orderEntry type="sourceFolder" forTests="false" />
  </component>
</module>"""
}
val ANDROID_APP = { rootProjectName: String -> """<?xml version="1.0" encoding="UTF-8"?>
<module external.linked.project.id=":androidApp" external.linked.project.path="\u0024MODULE_DIR\u0024{'$'}/../../../androidApp" external.root.project.path="\u0024MODULE_DIR\u0024{'$'}/../../.." external.system.id="GRADLE" external.system.module.group="$rootProjectName" external.system.module.version="unspecified" type="JAVA_MODULE" version="4">
  <component name="FacetManager">
    <facet type="android-gradle" name="Android-Gradle">
      <configuration>
        <option name="GRADLE_PROJECT_PATH" value=":androidApp" />
        <option name="LAST_SUCCESSFUL_SYNC_AGP_VERSION" />
        <option name="LAST_KNOWN_AGP_VERSION" value="7.0.3" />
      </configuration>
    </facet>
    <facet type="kotlin-language" name="Kotlin">
      <configuration version="4" platform="JVM 1.8" allPlatforms="JVM [1.8]" useProjectSettings="false">
        <compilerSettings>
          <option name="additionalArguments" value="-Xallow-no-source-files" />
        </compilerSettings>
        <compilerArguments>
          <option name="destination" value="\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/build/tmp/kotlin-classes/debug" />
          <option name="classpath" value="\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/build/intermediates/compile_and_runtime_not_namespaced_r_class_jar/debug/R.jar;C:/Users/37529/AndroidStudioProjects/$rootProjectName/shared/build/intermediates/compile_library_classes_jar/debug/classes.jar;C:/Users/37529/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk8/1.5.31/ff5d99aecd328872494e8921b72bf6e3af97af3e/kotlin-stdlib-jdk8-1.5.31.jar;C:/Users/37529/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk7/1.5.31/77e0f2568912e45d26c31fd417a332458508acdf/kotlin-stdlib-jdk7-1.5.31.jar;C:/Users/37529/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.5.31/6628d61d0f5603568e72d2d5915d2c034b4f1c55/kotlin-stdlib-1.5.31.jar;C:/Users/37529/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar;C:/Users/37529/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.31/43331609c7de811fed085e0dfd150874b157c32/kotlin-stdlib-common-1.5.31.jar;C:/Users/37529/.gradle/caches/transforms-3/272691d9c93c2d0182d9df544fb62b91/transformed/material-1.3.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/c1bb2d018a661aec95b2522294f68a5c/transformed/constraintlayout-2.0.4-api.jar;C:/Users/37529/.gradle/caches/transforms-3/4c15f546c031d011b506688a8ff0bd0e/transformed/appcompat-1.2.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/dd8a0756093bb38cceb5caf6fdceb41c/transformed/cardview-1.0.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/843d7ddc4bf4d981d651803eefe88f77/transformed/coordinatorlayout-1.1.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/c5350c7e3dbb797cbdc7ffc692607169/transformed/dynamicanimation-1.0.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/ed68415e200048942b8e0596c305f8a4/transformed/viewpager2-1.0.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/edf465ac694b1081f97cd832ddecefe8/transformed/fragment-1.1.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/91f9d2e4f6de62dae846b7fc9b986fe1/transformed/recyclerview-1.1.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/5702f6b227114cc568c00a865b85a700/transformed/transition-1.2.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/863b2b69ba13beb78a878d8a90246703/transformed/appcompat-resources-1.2.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/516a3268b03c59a6a3edf90bc8bc4d12/transformed/vectordrawable-animated-1.1.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/1041bc0db0462db761d29d5560f0411b/transformed/vectordrawable-1.1.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/5976c143dcd8505adeeacdbde8b2db5d/transformed/drawerlayout-1.0.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/277dd9919cf4cb71eb0d2fecacda5c12/transformed/viewpager-1.0.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/1d67358f5637e94abe39d89d0d991694/transformed/customview-1.0.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/daf03c94be92a1e70644be4813c60ec7/transformed/legacy-support-core-utils-1.0.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/d8a7beb7a69f93fcd247adc15ed9a64e/transformed/loader-1.0.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/12ef7e22761d7d46a5f67d48f12a9f0b/transformed/activity-1.0.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/3a3c1f8cf5cc51beada7d6fe850f80b3/transformed/core-1.3.1-api.jar;C:/Users/37529/.gradle/caches/transforms-3/02b8699631259e3cbe8c5789c1fc65fa/transformed/lifecycle-runtime-2.1.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/67f383d24e23ad2ca42f02712c4343ad/transformed/cursoradapter-1.0.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/a0fdaf63964d1cf77fe3dda64a71cb10/transformed/versionedparcelable-1.1.0-api.jar;C:/Users/37529/.gradle/caches/modules-2/files-2.1/androidx.collection/collection/1.1.0/1f27220b47669781457de0d600849a5de0e89909/collection-1.1.0.jar;C:/Users/37529/.gradle/caches/transforms-3/9bade2482c9c13bbb5d06e990db1d023/transformed/lifecycle-viewmodel-2.1.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/69dda2d78716339af7cb4ba9d99ba24d/transformed/savedstate-1.0.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/9c33c66925c3e935b4372dbeaadd62c1/transformed/lifecycle-livedata-2.0.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/bbf26f2e1bc893144b4525ecc499e24c/transformed/lifecycle-livedata-core-2.0.0-api.jar;C:/Users/37529/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-common/2.1.0/c67e7807d9cd6c329b9d0218b2ec4e505dd340b7/lifecycle-common-2.1.0.jar;C:/Users/37529/.gradle/caches/transforms-3/85dd3ee4752cb6f8c5b02ca2d47a1b58/transformed/core-runtime-2.0.0-api.jar;C:/Users/37529/.gradle/caches/modules-2/files-2.1/androidx.arch.core/core-common/2.1.0/b3152fc64428c9354344bd89848ecddc09b6f07e/core-common-2.1.0.jar;C:/Users/37529/.gradle/caches/transforms-3/4d770621530a54b544bdb1c3ea83b0ac/transformed/documentfile-1.0.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/945292777a5b4bc6ef10824374d028ff/transformed/localbroadcastmanager-1.0.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/b1db03f2b27a46fecca43d63105d1fb7/transformed/print-1.0.0-api.jar;C:/Users/37529/.gradle/caches/transforms-3/c70facabb7a62200c457d990a93e32d1/transformed/interpolator-1.0.0-api.jar;C:/Users/37529/.gradle/caches/modules-2/files-2.1/androidx.annotation/annotation/1.1.0/e3a6fb2f40e3a3842e6b7472628ba4ce416ea4c8/annotation-1.1.0.jar;C:/Users/37529/.gradle/caches/modules-2/files-2.1/androidx.constraintlayout/constraintlayout-solver/2.0.4/1f001d7db280a89a6c26b26a66eb064bb6d5efeb/constraintlayout-solver-2.0.4.jar;C:/Users/37529/.gradle/caches/transforms-3/d223e23aa0b875314b6a6ed425891254/transformed/annotation-experimental-1.0.0-api.jar;C:/Users/37529/AppData/Local/Android/Sdk/platforms/android-31/android.jar;C:/Users/37529/AppData/Local/Android/Sdk/build-tools/30.0.2/core-lambda-stubs.jar" />
          <option name="noStdlib" value="true" />
          <option name="noReflect" value="true" />
          <option name="moduleName" value="androidApp_debug" />
          <option name="languageVersion" value="1.5" />
          <option name="apiVersion" value="1.5" />
          <option name="pluginOptions">
            <array />
          </option>
          <option name="pluginClasspaths">
            <array />
          </option>
          <option name="errors">
            <ArgumentParseErrors />
          </option>
        </compilerArguments>
      </configuration>
    </facet>
    <facet type="android" name="Android">
      <configuration>
        <option name="SELECTED_BUILD_VARIANT" value="debug" />
        <option name="ASSEMBLE_TASK_NAME" value="assembleDebug" />
        <option name="COMPILE_JAVA_TASK_NAME" value="compileDebugSources" />
        <afterSyncTasks>
          <task>generateDebugSources</task>
        </afterSyncTasks>
        <option name="ALLOW_USER_CONFIGURATION" value="false" />
        <option name="MANIFEST_FILE_RELATIVE_PATH" value="/src/main/AndroidManifest.xml" />
        <option name="RES_FOLDER_RELATIVE_PATH" value="/src/main/res" />
        <option name="RES_FOLDERS_RELATIVE_PATH" value="file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/src/main/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/src/debug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/build/generated/res/rs/debug;file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/build/generated/res/resValues/debug" />
        <option name="TEST_RES_FOLDERS_RELATIVE_PATH" value="file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/src/androidTest/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/src/androidTestDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/build/generated/res/rs/androidTest/debug;file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/build/generated/res/resValues/androidTest/debug" />
        <option name="ASSETS_FOLDER_RELATIVE_PATH" value="/src/main/assets" />
      </configuration>
    </facet>
  </component>
  <component name="NewModuleRootManager" LANGUAGE_LEVEL="JDK_1_8">
    <output url="file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/build/intermediates/javac/debug/classes" />
    <output-test url="file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/build/intermediates/javac/debugUnitTest/classes" />
    <exclude-output />
    <content url="file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp">
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/build/generated/ap_generated_sources/debug/out" isTestSource="false" generated="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/build/generated/res/resValues/debug" type="java-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/build/generated/source/buildConfig/debug" isTestSource="false" generated="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/src/main/java" isTestSource="false" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/src/main/res" type="java-resource" />
      <excludeFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/.gradle" />
      <excludeFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../androidApp/build" />
    </content>
    <orderEntry type="jdk" jdkName="Android API 31 Platform" jdkType="Android SDK" />
    <orderEntry type="sourceFolder" forTests="false" />
    <orderEntry type="library" name="Gradle: org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.31" level="project" />
    <orderEntry type="library" name="Gradle: org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.5.31" level="project" />
    <orderEntry type="library" name="Gradle: org.jetbrains.kotlin:kotlin-stdlib:1.5.31" level="project" />
    <orderEntry type="library" name="Gradle: org.jetbrains:annotations:13.0" level="project" />
    <orderEntry type="module-library">
      <library name="Gradle: org.jetbrains.kotlin:kotlin-stdlib-common:1.5.31">
        <CLASSES>
          <root url="jar://\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.31/43331609c7de811fed085e0dfd150874b157c32/kotlin-stdlib-common-1.5.31.jar!/" />
        </CLASSES>
        <JAVADOC>
          <root url="jar://\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.31/5b8f86fea035328fc9e8c660773037a3401ce25f/kotlin-stdlib-common-1.5.31-javadoc.jar!/" />
        </JAVADOC>
        <SOURCES>
          <root url="jar://\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.31/ee22598c6d20e94e0fd08cc696f09f83e41b3935/kotlin-stdlib-common-1.5.31-sources.jar!/" />
        </SOURCES>
      </library>
    </orderEntry>
    <orderEntry type="library" name="Gradle: androidx.collection:collection:1.1.0" level="project" />
    <orderEntry type="library" name="Gradle: androidx.lifecycle:lifecycle-common:2.1.0" level="project" />
    <orderEntry type="library" name="Gradle: androidx.arch.core:core-common:2.1.0" level="project" />
    <orderEntry type="library" name="Gradle: androidx.annotation:annotation:1.1.0" level="project" />
    <orderEntry type="library" name="Gradle: androidx.constraintlayout:constraintlayout-solver:2.0.4" level="project" />
    <orderEntry type="library" name="Gradle: com.google.android.material:material:1.3.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.constraintlayout:constraintlayout:2.0.4@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.appcompat:appcompat:1.2.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.cardview:cardview:1.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.coordinatorlayout:coordinatorlayout:1.1.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.dynamicanimation:dynamicanimation:1.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.viewpager2:viewpager2:1.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.fragment:fragment:1.1.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.recyclerview:recyclerview:1.1.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.transition:transition:1.2.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.appcompat:appcompat-resources:1.2.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.vectordrawable:vectordrawable-animated:1.1.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.vectordrawable:vectordrawable:1.1.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.drawerlayout:drawerlayout:1.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.viewpager:viewpager:1.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.customview:customview:1.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.legacy:legacy-support-core-utils:1.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.loader:loader:1.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.activity:activity:1.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.core:core:1.3.1@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.lifecycle:lifecycle-runtime:2.1.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.cursoradapter:cursoradapter:1.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.versionedparcelable:versionedparcelable:1.1.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.lifecycle:lifecycle-viewmodel:2.1.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.savedstate:savedstate:1.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.lifecycle:lifecycle-livedata:2.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.lifecycle:lifecycle-livedata-core:2.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.arch.core:core-runtime:2.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.documentfile:documentfile:1.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.localbroadcastmanager:localbroadcastmanager:1.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.print:print:1.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.interpolator:interpolator:1.0.0@aar" level="project" />
    <orderEntry type="library" name="Gradle: androidx.annotation:annotation-experimental:1.0.0@aar" level="project" />
    <orderEntry type="module" module-name="$rootProjectName.shared" />
    <orderEntry type="module" module-name="$rootProjectName.shared.androidAndroidTestRelease" />
    <orderEntry type="module" module-name="$rootProjectName.shared.commonMain" />
  </component>
</module>"""}

val ANDROID_ANDROID_TEST_RELEASE = { rootProjectName: String ->
    """<?xml version="1.0" encoding="UTF-8"?>
<module external.linked.project.id=":shared:androidAndroidTestRelease" external.linked.project.path="\u0024MODULE_DIR\u0024{'$'}/../../../shared" external.root.project.path="\u0024MODULE_DIR\u0024{'$'}/../../.." external.system.id="GRADLE" external.system.module.group="$rootProjectName" external.system.module.type="sourceSet" external.system.module.version="1.0" type="JAVA_MODULE" version="4">
  <component name="FacetManager">
    <facet type="kotlin-language" name="Kotlin">
      <configuration version="4" platform="Common (experimental) " allPlatforms="JVM [1.8]/Native []/Native [general]" useProjectSettings="false" isTestModule="false" externalProjectId=":shared" pureKotlinSourceFolders="C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebug\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\debug\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\debug\java;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebugAndroidTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebugUnitTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidRelease\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\release\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\release\java;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidReleaseUnitTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\iosMain\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\iosMain\kotlin">
        <newMppModelJpsModuleKind>SOURCE_SET_HOLDER</newMppModelJpsModuleKind>
        <compilerSettings />
        <compilerArguments>
          <option name="languageVersion" value="1.5" />
          <option name="apiVersion" value="1.5" />
          <option name="pluginOptions">
            <array />
          </option>
          <option name="pluginClasspaths">
            <array>
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-scripting-jvm/1.5.31/d854edda951feb05387ada385f8f3462ec01a885/kotlin-scripting-jvm-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-scripting-common/1.5.31/512a5997987cd210dcd5442da6aef00a5c12de90/kotlin-scripting-common-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlinx/kotlinx-coroutines-core-jvm/1.5.0/d8cebccdcddd029022aa8646a5a953ff88b13ac8/kotlinx-coroutines-core-jvm-1.5.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk8/1.5.0/65fbc439df2e4aad1f3769762d54534f1b564090/kotlin-stdlib-jdk8-1.5.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk7/1.5.0/f61904618ea7be07a66e0545ffe8dc2c70a19b77/kotlin-stdlib-jdk7-1.5.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.5.31/6628d61d0f5603568e72d2d5915d2c034b4f1c55/kotlin-stdlib-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.31/43331609c7de811fed085e0dfd150874b157c32/kotlin-stdlib-common-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-script-runtime/1.5.31/aaea854be2cfc06373dfc11be5a6ba9ca5ca84a6/kotlin-script-runtime-1.5.31.jar" />
            </array>
          </option>
          <option name="multiPlatform" value="true" />
        </compilerArguments>
      </configuration>
    </facet>
    <facet type="android" name="Android">
      <configuration>
        <option name="SELECTED_BUILD_VARIANT" value="debug" />
        <option name="ASSEMBLE_TASK_NAME" value="assembleDebug" />
        <option name="COMPILE_JAVA_TASK_NAME" value="compileDebugSources" />
        <afterSyncTasks>
          <task>generateDebugSources</task>
        </afterSyncTasks>
        <option name="ALLOW_USER_CONFIGURATION" value="false" />
        <option name="MANIFEST_FILE_RELATIVE_PATH" value="/src/androidMain/AndroidManifest.xml" />
        <option name="RES_FOLDER_RELATIVE_PATH" value="/src/main/res" />
        <option name="RES_FOLDERS_RELATIVE_PATH" value="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/main/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidMain/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/debug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/rs/debug;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/resValues/debug" />
        <option name="TEST_RES_FOLDERS_RELATIVE_PATH" value="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTest/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTest/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTestDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTestDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/rs/androidTest/debug;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/resValues/androidTest/debug" />
        <option name="ASSETS_FOLDER_RELATIVE_PATH" value="/src/main/assets" />
        <option name="PROJECT_TYPE" value="1" />
      </configuration>
    </facet>
  </component>
  <component name="NewModuleRootManager" LANGUAGE_LEVEL="JDK_1_8" inherit-compiler-output="true">
    <exclude-output />
    <content url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTestRelease/kotlin" />
    <content url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTestRelease/resources" />
    <content url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTestRelease/java" />
    <content url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTestRelease/resources" />
    <orderEntry type="jdk" jdkName="Android API 31 Platform" jdkType="Android SDK" />
    <orderEntry type="sourceFolder" forTests="false" />
    <orderEntry type="module" module-name="$rootProjectName.shared.commonMain" />
    <orderEntry type="library" name="Gradle: org.jetbrains.kotlin:kotlin-stdlib-common:1.5.31" level="project" />
  </component>
</module>"""
}
val COMMON_MAIN = { rootProjectName: String ->
    """<?xml version="1.0" encoding="UTF-8"?>
<module external.linked.project.id=":shared:commonMain" external.linked.project.path="\u0024MODULE_DIR\u0024{'$'}/../../../shared" external.root.project.path="\u0024MODULE_DIR\u0024{'$'}/../../.." external.system.id="GRADLE" external.system.module.group="$rootProjectName" external.system.module.type="sourceSet" external.system.module.version="1.0" type="JAVA_MODULE" version="4">
  <component name="FacetManager">
    <facet type="kotlin-language" name="Kotlin">
      <configuration version="4" platform="Common (experimental) " allPlatforms="JS []/JVM [1.8]/Native []/Native [general]" useProjectSettings="false" isTestModule="false" externalProjectId=":shared" pureKotlinSourceFolders="C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebug\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\debug\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\debug\java;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebugAndroidTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebugUnitTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidRelease\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\release\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\release\java;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidReleaseUnitTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\iosMain\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\iosMain\kotlin">
        <newMppModelJpsModuleKind>SOURCE_SET_HOLDER</newMppModelJpsModuleKind>
        <compilerSettings />
        <compilerArguments>
          <option name="languageVersion" value="1.5" />
          <option name="apiVersion" value="1.5" />
          <option name="pluginOptions">
            <array />
          </option>
          <option name="pluginClasspaths">
            <array>
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-scripting-jvm/1.5.31/d854edda951feb05387ada385f8f3462ec01a885/kotlin-scripting-jvm-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-scripting-common/1.5.31/512a5997987cd210dcd5442da6aef00a5c12de90/kotlin-scripting-common-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlinx/kotlinx-coroutines-core-jvm/1.5.0/d8cebccdcddd029022aa8646a5a953ff88b13ac8/kotlinx-coroutines-core-jvm-1.5.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk8/1.5.0/65fbc439df2e4aad1f3769762d54534f1b564090/kotlin-stdlib-jdk8-1.5.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk7/1.5.0/f61904618ea7be07a66e0545ffe8dc2c70a19b77/kotlin-stdlib-jdk7-1.5.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.5.31/6628d61d0f5603568e72d2d5915d2c034b4f1c55/kotlin-stdlib-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.31/43331609c7de811fed085e0dfd150874b157c32/kotlin-stdlib-common-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-script-runtime/1.5.31/aaea854be2cfc06373dfc11be5a6ba9ca5ca84a6/kotlin-script-runtime-1.5.31.jar" />
            </array>
          </option>
          <option name="multiPlatform" value="true" />
        </compilerArguments>
      </configuration>
    </facet>
    <facet type="android" name="Android">
      <configuration>
        <option name="SELECTED_BUILD_VARIANT" value="debug" />
        <option name="ASSEMBLE_TASK_NAME" value="assembleDebug" />
        <option name="COMPILE_JAVA_TASK_NAME" value="compileDebugSources" />
        <afterSyncTasks>
          <task>generateDebugSources</task>
        </afterSyncTasks>
        <option name="ALLOW_USER_CONFIGURATION" value="false" />
        <option name="MANIFEST_FILE_RELATIVE_PATH" value="/src/androidMain/AndroidManifest.xml" />
        <option name="RES_FOLDER_RELATIVE_PATH" value="/src/main/res" />
        <option name="RES_FOLDERS_RELATIVE_PATH" value="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/main/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidMain/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/debug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/rs/debug;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/resValues/debug" />
        <option name="TEST_RES_FOLDERS_RELATIVE_PATH" value="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTest/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTest/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTestDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTestDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/rs/androidTest/debug;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/resValues/androidTest/debug" />
        <option name="ASSETS_FOLDER_RELATIVE_PATH" value="/src/main/assets" />
        <option name="PROJECT_TYPE" value="1" />
      </configuration>
    </facet>
  </component>
  <component name="NewModuleRootManager" LANGUAGE_LEVEL="JDK_1_8" inherit-compiler-output="true">
    <exclude-output />
    <content url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/commonMain/kotlin">
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/commonMain/kotlin" type="kotlin-source" />
    </content>
    <content url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/commonMain/resources" />
    <orderEntry type="jdk" jdkName="Android API 31 Platform" jdkType="Android SDK" />
    <orderEntry type="sourceFolder" forTests="false" />
    <orderEntry type="library" name="Gradle: org.jetbrains.kotlin:kotlin-stdlib-common:1.5.31" level="project" />
  </component>
</module>"""
}
val COMMON_TEST = { rootProjectName: String ->
    """<?xml version="1.0" encoding="UTF-8"?>
<module external.linked.project.id=":shared:commonTest" external.linked.project.path="\u0024MODULE_DIR\u0024{'$'}/../../../shared" external.root.project.path="\u0024MODULE_DIR\u0024{'$'}/../../.." external.system.id="GRADLE" external.system.module.group="$rootProjectName" external.system.module.type="sourceSet" external.system.module.version="1.0" type="JAVA_MODULE" version="4">
  <component name="FacetManager">
    <facet type="kotlin-language" name="Kotlin">
      <configuration version="4" platform="Common (experimental) " allPlatforms="JS []/JVM [1.8]/Native []/Native [general]" useProjectSettings="false" isTestModule="true" externalProjectId=":shared" pureKotlinSourceFolders="C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebug\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\debug\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\debug\java;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebugAndroidTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebugUnitTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidRelease\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\release\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\release\java;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidReleaseUnitTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\iosMain\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\iosMain\kotlin">
        <newMppModelJpsModuleKind>SOURCE_SET_HOLDER</newMppModelJpsModuleKind>
        <externalSystemTestTasks>
          <externalSystemTestTask>testDebugUnitTest|:shared:androidDebugUnitTest|android</externalSystemTestTask>
          <externalSystemTestTask>testReleaseUnitTest|:shared:androidReleaseUnitTest|android</externalSystemTestTask>
        </externalSystemTestTasks>
        <compilerSettings />
        <compilerArguments>
          <option name="languageVersion" value="1.5" />
          <option name="apiVersion" value="1.5" />
          <option name="pluginOptions">
            <array />
          </option>
          <option name="pluginClasspaths">
            <array>
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-scripting-jvm/1.5.31/d854edda951feb05387ada385f8f3462ec01a885/kotlin-scripting-jvm-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-scripting-common/1.5.31/512a5997987cd210dcd5442da6aef00a5c12de90/kotlin-scripting-common-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlinx/kotlinx-coroutines-core-jvm/1.5.0/d8cebccdcddd029022aa8646a5a953ff88b13ac8/kotlinx-coroutines-core-jvm-1.5.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk8/1.5.0/65fbc439df2e4aad1f3769762d54534f1b564090/kotlin-stdlib-jdk8-1.5.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk7/1.5.0/f61904618ea7be07a66e0545ffe8dc2c70a19b77/kotlin-stdlib-jdk7-1.5.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.5.31/6628d61d0f5603568e72d2d5915d2c034b4f1c55/kotlin-stdlib-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.31/43331609c7de811fed085e0dfd150874b157c32/kotlin-stdlib-common-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-script-runtime/1.5.31/aaea854be2cfc06373dfc11be5a6ba9ca5ca84a6/kotlin-script-runtime-1.5.31.jar" />
            </array>
          </option>
          <option name="multiPlatform" value="true" />
        </compilerArguments>
      </configuration>
    </facet>
    <facet type="android" name="Android">
      <configuration>
        <option name="SELECTED_BUILD_VARIANT" value="debug" />
        <option name="ASSEMBLE_TASK_NAME" value="assembleDebug" />
        <option name="COMPILE_JAVA_TASK_NAME" value="compileDebugSources" />
        <afterSyncTasks>
          <task>generateDebugSources</task>
        </afterSyncTasks>
        <option name="ALLOW_USER_CONFIGURATION" value="false" />
        <option name="MANIFEST_FILE_RELATIVE_PATH" value="/src/androidMain/AndroidManifest.xml" />
        <option name="RES_FOLDER_RELATIVE_PATH" value="/src/main/res" />
        <option name="RES_FOLDERS_RELATIVE_PATH" value="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/main/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidMain/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/debug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/rs/debug;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/resValues/debug" />
        <option name="TEST_RES_FOLDERS_RELATIVE_PATH" value="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTest/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTest/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTestDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTestDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/rs/androidTest/debug;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/resValues/androidTest/debug" />
        <option name="ASSETS_FOLDER_RELATIVE_PATH" value="/src/main/assets" />
        <option name="PROJECT_TYPE" value="1" />
      </configuration>
    </facet>
  </component>
  <component name="NewModuleRootManager" LANGUAGE_LEVEL="JDK_1_8" inherit-compiler-output="true">
    <exclude-output />
    <content url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/commonTest/kotlin" />
    <content url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/commonTest/resources" />
    <orderEntry type="jdk" jdkName="Android API 31 Platform" jdkType="Android SDK" />
    <orderEntry type="sourceFolder" forTests="false" />
    <orderEntry type="module" module-name="$rootProjectName.shared.commonMain" scope="TEST" />
    <orderEntry type="library" scope="TEST" name="Gradle: org.jetbrains.kotlin:kotlin-stdlib-common:1.5.31" level="project" />
    <orderEntry type="library" scope="TEST" name="Gradle: org.jetbrains.kotlin:kotlin-test-common:1.5.31" level="project" />
    <orderEntry type="library" scope="TEST" name="Gradle: org.jetbrains.kotlin:kotlin-test-annotations-common:1.5.31" level="project" />
  </component>
  <component name="TestModuleProperties" production-module="$rootProjectName.shared.commonMain" />
</module>"""
}
val SHARED = { rootProjectName: String ->
    """<?xml version="1.0" encoding="UTF-8"?>
<module external.linked.project.id=":shared" external.linked.project.path="\u0024MODULE_DIR\u0024{'$'}/../../../shared" external.root.project.path="\u0024MODULE_DIR\u0024{'$'}/../../.." external.system.id="GRADLE" external.system.module.group="$rootProjectName" external.system.module.version="1.0" type="JAVA_MODULE" version="4">
  <component name="FacetManager">
    <facet type="android-gradle" name="Android-Gradle">
      <configuration>
        <option name="GRADLE_PROJECT_PATH" value=":shared" />
        <option name="LAST_SUCCESSFUL_SYNC_AGP_VERSION" />
        <option name="LAST_KNOWN_AGP_VERSION" value="7.0.3" />
      </configuration>
    </facet>
    <facet type="kotlin-language" name="Kotlin">
      <configuration version="4" platform="JVM 1.8" allPlatforms="JVM [1.8]" useProjectSettings="false" isTestModule="false" externalProjectId=":shared" pureKotlinSourceFolders="C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebug\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\debug\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\debug\java;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebugAndroidTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebugUnitTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidRelease\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\release\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\release\java;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidReleaseUnitTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\iosMain\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\iosMain\kotlin">
        <dependsOnModuleNames>:shared:commonMain</dependsOnModuleNames>
        <sourceSets>
          <sourceSet>$rootProjectName.shared.commonMain</sourceSet>
        </sourceSets>
        <newMppModelJpsModuleKind>COMPILATION_AND_SOURCE_SET_HOLDER</newMppModelJpsModuleKind>
        <compilerSettings>
          <option name="additionalArguments" value="-Xallow-no-source-files" />
        </compilerSettings>
        <compilerArguments>
          <option name="destination" value="\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/tmp/kotlin-classes/debug" />
          <option name="classpath" value="\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/intermediates/compile_r_class_jar/debug/R.jar;C:/Users/37529/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk8/1.5.31/ff5d99aecd328872494e8921b72bf6e3af97af3e/kotlin-stdlib-jdk8-1.5.31.jar;C:/Users/37529/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk7/1.5.31/77e0f2568912e45d26c31fd417a332458508acdf/kotlin-stdlib-jdk7-1.5.31.jar;C:/Users/37529/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.5.31/6628d61d0f5603568e72d2d5915d2c034b4f1c55/kotlin-stdlib-1.5.31.jar;C:/Users/37529/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.31/43331609c7de811fed085e0dfd150874b157c32/kotlin-stdlib-common-1.5.31.jar;C:/Users/37529/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar;C:/Users/37529/AppData/Local/Android/Sdk/platforms/android-31/android.jar;C:/Users/37529/AppData/Local/Android/Sdk/build-tools/30.0.2/core-lambda-stubs.jar" />
          <option name="noStdlib" value="true" />
          <option name="noReflect" value="true" />
          <option name="moduleName" value="shared_debug" />
          <option name="languageVersion" value="1.5" />
          <option name="apiVersion" value="1.5" />
          <option name="pluginOptions">
            <array />
          </option>
          <option name="pluginClasspaths">
            <array>
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-scripting-jvm/1.5.31/d854edda951feb05387ada385f8f3462ec01a885/kotlin-scripting-jvm-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-scripting-common/1.5.31/512a5997987cd210dcd5442da6aef00a5c12de90/kotlin-scripting-common-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlinx/kotlinx-coroutines-core-jvm/1.5.0/d8cebccdcddd029022aa8646a5a953ff88b13ac8/kotlinx-coroutines-core-jvm-1.5.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk8/1.5.0/65fbc439df2e4aad1f3769762d54534f1b564090/kotlin-stdlib-jdk8-1.5.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk7/1.5.0/f61904618ea7be07a66e0545ffe8dc2c70a19b77/kotlin-stdlib-jdk7-1.5.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.5.31/6628d61d0f5603568e72d2d5915d2c034b4f1c55/kotlin-stdlib-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.31/43331609c7de811fed085e0dfd150874b157c32/kotlin-stdlib-common-1.5.31.jar" />
              <option value="\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-script-runtime/1.5.31/aaea854be2cfc06373dfc11be5a6ba9ca5ca84a6/kotlin-script-runtime-1.5.31.jar" />
            </array>
          </option>
          <option name="multiPlatform" value="true" />
          <option name="errors">
            <ArgumentParseErrors />
          </option>
        </compilerArguments>
      </configuration>
    </facet>
    <facet type="android" name="Android">
      <configuration>
        <option name="SELECTED_BUILD_VARIANT" value="debug" />
        <option name="ASSEMBLE_TASK_NAME" value="assembleDebug" />
        <option name="COMPILE_JAVA_TASK_NAME" value="compileDebugSources" />
        <afterSyncTasks>
          <task>generateDebugSources</task>
        </afterSyncTasks>
        <option name="ALLOW_USER_CONFIGURATION" value="false" />
        <option name="MANIFEST_FILE_RELATIVE_PATH" value="/src/androidMain/AndroidManifest.xml" />
        <option name="RES_FOLDER_RELATIVE_PATH" value="/src/main/res" />
        <option name="RES_FOLDERS_RELATIVE_PATH" value="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/main/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidMain/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/debug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/rs/debug;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/resValues/debug" />
        <option name="TEST_RES_FOLDERS_RELATIVE_PATH" value="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTest/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTest/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTestDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTestDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/rs/androidTest/debug;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/resValues/androidTest/debug" />
        <option name="ASSETS_FOLDER_RELATIVE_PATH" value="/src/main/assets" />
        <option name="PROJECT_TYPE" value="1" />
      </configuration>
    </facet>
  </component>
  <component name="NewModuleRootManager" LANGUAGE_LEVEL="JDK_1_8">
    <exclude-output />
    <content url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared">
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/ap_generated_sources/debug/out" isTestSource="false" generated="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/resValues/debug" type="java-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/source/buildConfig/debug" isTestSource="false" generated="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTest/kotlin" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTest/resources" type="java-test-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTestDebug/kotlin" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTestDebug/resources" type="java-test-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidDebug/kotlin" isTestSource="false" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidDebug/resources" type="java-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidDebugAndroidTest/kotlin" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidDebugAndroidTest/resources" type="java-test-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidDebugUnitTest/kotlin" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidDebugUnitTest/resources" type="java-test-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidMain/kotlin" isTestSource="false" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidMain/resources" type="java-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidRelease/kotlin" isTestSource="false" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidRelease/resources" type="java-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidReleaseUnitTest/kotlin" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidReleaseUnitTest/resources" type="java-test-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTest/java" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTest/kotlin" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTest/resources" type="java-test-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTestDebug/java" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTestDebug/kotlin" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTestDebug/resources" type="java-test-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTestRelease/kotlin" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTestRelease/resources" type="java-test-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/debug/java" isTestSource="false" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/debug/kotlin" isTestSource="false" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/debug/resources" type="java-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/main/java" isTestSource="false" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/main/kotlin" isTestSource="false" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/main/resources" type="java-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/release/java" isTestSource="false" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/release/kotlin" isTestSource="false" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/release/resources" type="java-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/test/java" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/test/kotlin" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/test/resources" type="java-test-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/testDebug/java" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/testDebug/kotlin" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/testDebug/resources" type="java-test-resource" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/testRelease/java" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/testRelease/kotlin" isTestSource="true" />
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/testRelease/resources" type="java-test-resource" />
      <excludeFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/.gradle" />
      <excludeFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build" />
    </content>
    <orderEntry type="jdk" jdkName="Android API 31 Platform" jdkType="Android SDK" />
    <orderEntry type="sourceFolder" forTests="false" />
    <orderEntry type="library" scope="TEST" name="Gradle: org.jetbrains.kotlin:kotlin-test-junit:1.5.31" level="project" />
    <orderEntry type="library" scope="TEST" name="Gradle: junit:junit:4.13.2" level="project" />
    <orderEntry type="module-library" scope="TEST">
      <library name="Gradle: org.jetbrains.kotlin:kotlin-test-common:1.5.31">
        <CLASSES>
          <root url="jar://\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-test-common/1.5.31/8207cf7b4cd4a8f0a0db5f4c8a0b9d52a8cd677a/kotlin-test-common-1.5.31.jar!/" />
        </CLASSES>
        <JAVADOC>
          <root url="jar://\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-test-common/1.5.31/5b8f86fea035328fc9e8c660773037a3401ce25f/kotlin-test-common-1.5.31-javadoc.jar!/" />
        </JAVADOC>
        <SOURCES>
          <root url="jar://\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-test-common/1.5.31/8685a38101806f06b2a859d0b9fb332dd50b937a/kotlin-test-common-1.5.31-sources.jar!/" />
        </SOURCES>
      </library>
    </orderEntry>
    <orderEntry type="module-library" scope="TEST">
      <library name="Gradle: org.jetbrains.kotlin:kotlin-test-annotations-common:1.5.31">
        <CLASSES>
          <root url="jar://\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-test-annotations-common/1.5.31/d84a7315efb8bafc46372ad281d58c0662172fd7/kotlin-test-annotations-common-1.5.31.jar!/" />
        </CLASSES>
        <JAVADOC>
          <root url="jar://\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-test-annotations-common/1.5.31/5b8f86fea035328fc9e8c660773037a3401ce25f/kotlin-test-annotations-common-1.5.31-javadoc.jar!/" />
        </JAVADOC>
        <SOURCES>
          <root url="jar://\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-test-annotations-common/1.5.31/57512e29ee20defe37d54ce19507d599b0f2113/kotlin-test-annotations-common-1.5.31-sources.jar!/" />
        </SOURCES>
      </library>
    </orderEntry>
    <orderEntry type="library" scope="TEST" name="Gradle: org.jetbrains.kotlin:kotlin-test:1.5.31" level="project" />
    <orderEntry type="library" scope="TEST" name="Gradle: org.hamcrest:hamcrest-core:1.3" level="project" />
    <orderEntry type="library" name="Gradle: org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.31" level="project" />
    <orderEntry type="library" name="Gradle: org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.5.31" level="project" />
    <orderEntry type="library" name="Gradle: org.jetbrains.kotlin:kotlin-stdlib:1.5.31" level="project" />
    <orderEntry type="module-library">
      <library name="Gradle: org.jetbrains.kotlin:kotlin-stdlib-common:1.5.31">
        <CLASSES>
          <root url="jar://\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.31/43331609c7de811fed085e0dfd150874b157c32/kotlin-stdlib-common-1.5.31.jar!/" />
        </CLASSES>
        <JAVADOC>
          <root url="jar://\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.31/5b8f86fea035328fc9e8c660773037a3401ce25f/kotlin-stdlib-common-1.5.31-javadoc.jar!/" />
        </JAVADOC>
        <SOURCES>
          <root url="jar://\u0024USER_HOME\u0024{'$'}/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.31/ee22598c6d20e94e0fd08cc696f09f83e41b3935/kotlin-stdlib-common-1.5.31-sources.jar!/" />
        </SOURCES>
      </library>
    </orderEntry>
    <orderEntry type="library" name="Gradle: org.jetbrains:annotations:13.0" level="project" />
    <orderEntry type="module" module-name="$rootProjectName.shared.androidAndroidTestRelease" scope="TEST" />
    <orderEntry type="module" module-name="$rootProjectName.shared.commonMain" />
    <orderEntry type="module" module-name="$rootProjectName.shared.commonTest" scope="TEST" production-on-test="" />
  </component>
</module>"""
}
val IOS_MAIN = { rootProjectName: String ->
    """<?xml version="1.0" encoding="UTF-8"?>
<module external.linked.project.id=":shared:iosMain" external.linked.project.path="\u0024MODULE_DIR\u0024{'$'}/../../../shared" external.root.project.path="\u0024MODULE_DIR\u0024{'$'}/../../.." external.system.id="GRADLE" external.system.module.group="$rootProjectName" external.system.module.type="sourceSet" external.system.module.version="1.0" type="JAVA_MODULE" version="4">
  <component name="FacetManager">
    <facet type="kotlin-language" name="Kotlin">
      <configuration version="4" platform="Native (ios_x64) " allPlatforms="Native []/Native [ios_x64]" useProjectSettings="false" isTestModule="false" externalProjectId=":shared" pureKotlinSourceFolders="C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebug\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\debug\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\debug\java;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebugAndroidTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebugUnitTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidRelease\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\release\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\release\java;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidReleaseUnitTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\iosMain\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\iosMain\kotlin">
        <dependsOnModuleNames>:shared:commonMain</dependsOnModuleNames>
        <sourceSets>
          <sourceSet>$rootProjectName.shared.commonMain</sourceSet>
        </sourceSets>
        <newMppModelJpsModuleKind>COMPILATION_AND_SOURCE_SET_HOLDER</newMppModelJpsModuleKind>
        <compilerSettings />
        <compilerArguments>
          <option name="languageVersion" value="1.5" />
          <option name="apiVersion" value="1.5" />
          <option name="pluginOptions">
            <array />
          </option>
          <option name="pluginClasspaths">
            <array />
          </option>
          <option name="multiPlatform" value="true" />
          <option name="errors">
            <ArgumentParseErrors />
          </option>
        </compilerArguments>
      </configuration>
    </facet>
    <facet type="android" name="Android">
      <configuration>
        <option name="SELECTED_BUILD_VARIANT" value="debug" />
        <option name="ASSEMBLE_TASK_NAME" value="assembleDebug" />
        <option name="COMPILE_JAVA_TASK_NAME" value="compileDebugSources" />
        <afterSyncTasks>
          <task>generateDebugSources</task>
        </afterSyncTasks>
        <option name="ALLOW_USER_CONFIGURATION" value="false" />
        <option name="MANIFEST_FILE_RELATIVE_PATH" value="/src/androidMain/AndroidManifest.xml" />
        <option name="RES_FOLDER_RELATIVE_PATH" value="/src/main/res" />
        <option name="RES_FOLDERS_RELATIVE_PATH" value="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/main/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidMain/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/debug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/rs/debug;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/resValues/debug" />
        <option name="TEST_RES_FOLDERS_RELATIVE_PATH" value="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTest/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTest/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTestDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTestDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/rs/androidTest/debug;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/resValues/androidTest/debug" />
        <option name="ASSETS_FOLDER_RELATIVE_PATH" value="/src/main/assets" />
        <option name="PROJECT_TYPE" value="1" />
      </configuration>
    </facet>
  </component>
  <component name="NewModuleRootManager" LANGUAGE_LEVEL="JDK_1_8">
    <output url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/classes/kotlin/ios/main/klib" />
    <exclude-output />
    <content url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/iosMain/kotlin">
      <sourceFolder url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/iosMain/kotlin" type="kotlin-source" />
    </content>
    <content url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/iosMain/resources" />
    <orderEntry type="jdk" jdkName="Android API 31 Platform" jdkType="Android SDK" />
    <orderEntry type="sourceFolder" forTests="false" />
    <orderEntry type="library" scope="PROVIDED" name="Kotlin/Native 1.5.31 - stdlib" level="project" />
    <orderEntry type="module" module-name="$rootProjectName.shared.commonMain" />
    <orderEntry type="library" name="Gradle: org.jetbrains.kotlin:kotlin-stdlib-common:1.5.31" level="project" />
  </component>
</module>"""
}
val IOS_TEST = { rootProjectName: String ->
    """<?xml version="1.0" encoding="UTF-8"?>
<module external.linked.project.id=":shared:iosTest" external.linked.project.path="\u0024MODULE_DIR\u0024{'$'}/../../../shared" external.root.project.path="\u0024MODULE_DIR\u0024{'$'}/../../.." external.system.id="GRADLE" external.system.module.group="$rootProjectName" external.system.module.type="sourceSet" external.system.module.version="1.0" type="JAVA_MODULE" version="4">
  <component name="FacetManager">
    <facet type="kotlin-language" name="Kotlin">
      <configuration version="4" platform="Native (ios_x64) " allPlatforms="Native []/Native [ios_x64]" useProjectSettings="false" isTestModule="true" externalProjectId=":shared" pureKotlinSourceFolders="C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebug\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\debug\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\debug\java;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebugAndroidTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidDebugUnitTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidRelease\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\release\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\release\java;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\androidReleaseUnitTest\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\iosMain\kotlin;C:\Users\37529\AndroidStudioProjects\$rootProjectName\shared\src\iosMain\kotlin">
        <dependsOnModuleNames>:shared:commonTest</dependsOnModuleNames>
        <sourceSets>
          <sourceSet>$rootProjectName.shared.commonTest</sourceSet>
          <sourceSet>$rootProjectName.shared.iosMain</sourceSet>
          <sourceSet>$rootProjectName.shared.commonMain</sourceSet>
        </sourceSets>
        <newMppModelJpsModuleKind>COMPILATION_AND_SOURCE_SET_HOLDER</newMppModelJpsModuleKind>
        <compilerSettings />
        <compilerArguments>
          <option name="languageVersion" value="1.5" />
          <option name="apiVersion" value="1.5" />
          <option name="pluginOptions">
            <array />
          </option>
          <option name="pluginClasspaths">
            <array />
          </option>
          <option name="multiPlatform" value="true" />
          <option name="errors">
            <ArgumentParseErrors />
          </option>
        </compilerArguments>
      </configuration>
    </facet>
    <facet type="android" name="Android">
      <configuration>
        <option name="SELECTED_BUILD_VARIANT" value="debug" />
        <option name="ASSEMBLE_TASK_NAME" value="assembleDebug" />
        <option name="COMPILE_JAVA_TASK_NAME" value="compileDebugSources" />
        <afterSyncTasks>
          <task>generateDebugSources</task>
        </afterSyncTasks>
        <option name="ALLOW_USER_CONFIGURATION" value="false" />
        <option name="MANIFEST_FILE_RELATIVE_PATH" value="/src/androidMain/AndroidManifest.xml" />
        <option name="RES_FOLDER_RELATIVE_PATH" value="/src/main/res" />
        <option name="RES_FOLDERS_RELATIVE_PATH" value="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/main/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidMain/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/debug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/rs/debug;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/resValues/debug" />
        <option name="TEST_RES_FOLDERS_RELATIVE_PATH" value="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTest/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTest/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidTestDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/androidAndroidTestDebug/res;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/rs/androidTest/debug;file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/generated/res/resValues/androidTest/debug" />
        <option name="ASSETS_FOLDER_RELATIVE_PATH" value="/src/main/assets" />
        <option name="PROJECT_TYPE" value="1" />
      </configuration>
    </facet>
  </component>
  <component name="NewModuleRootManager" LANGUAGE_LEVEL="JDK_1_8">
    <output-test url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/classes/kotlin/ios/test/klib" />
    <exclude-output />
    <content url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/iosTest/kotlin" />
    <content url="file://\u0024MODULE_DIR\u0024{'$'}/../../../shared/src/iosTest/resources" />
    <orderEntry type="jdk" jdkName="Android API 31 Platform" jdkType="Android SDK" />
    <orderEntry type="sourceFolder" forTests="false" />
    <orderEntry type="library" scope="PROVIDED" name="Kotlin/Native 1.5.31 - stdlib" level="project" />
    <orderEntry type="module" module-name="$rootProjectName.shared.commonMain" scope="TEST" />
    <orderEntry type="module" module-name="$rootProjectName.shared.commonTest" scope="TEST" production-on-test="" />
    <orderEntry type="module" module-name="$rootProjectName.shared.iosMain" scope="TEST" />
    <orderEntry type="module-library" scope="TEST">
      <library>
        <CLASSES>
          <root url="jar://\u0024MODULE_DIR\u0024{'$'}/../../../shared/build/classes/kotlin/ios/main/klib/shared.klib!/" />
        </CLASSES>
        <JAVADOC />
        <SOURCES />
      </library>
    </orderEntry>
    <orderEntry type="library" scope="TEST" name="Gradle: org.jetbrains.kotlin:kotlin-test-common:1.5.31" level="project" />
    <orderEntry type="library" scope="TEST" name="Gradle: org.jetbrains.kotlin:kotlin-test-annotations-common:1.5.31" level="project" />
    <orderEntry type="library" scope="TEST" name="Gradle: org.jetbrains.kotlin:kotlin-stdlib-common:1.5.31" level="project" />
  </component>
  <component name="TestModuleProperties" production-module="$rootProjectName.shared.iosMain" />
</module>"""
}

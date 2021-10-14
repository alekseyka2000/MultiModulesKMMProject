const val LOCAL = """## This file must *NOT* be checked into Version Control Systems,
    # as it contains information specific to your local configuration.
    #
    # Location of the SDK. This is only used by Gradle.
    # For customization when using a Version Control System, please read the
    # header note.
    #Thu Oct 14 09:55:28 MSK 2021
    sdk.dir=C\:\\Users\\37529\\AppData\\Local\\Android\\Sdk"""


const val GITIGNOR_FILE_CONTENT1 = """*.iml
    .gradle
    /local.properties
    .idea
    .DS_Store
    /build
    */build
    /captures
    .externalNativeBuild
    .cxx
    local.properties"""

const val GRADLEW = """#!/usr/bin/env sh

    #
    # Copyright 2015 the original author or authors.
    #
    # Licensed under the Apache License, Version 2.0 (the "License");
    # you may not use this file except in compliance with the License.
    # You may obtain a copy of the License at
    #
    #      https://www.apache.org/licenses/LICENSE-2.0
    #
    # Unless required by applicable law or agreed to in writing, software
    # distributed under the License is distributed on an "AS IS" BASIS,
    # WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    # See the License for the specific language governing permissions and
    # limitations under the License.
    #

    ##############################################################################
    ##
    ##  Gradle start up script for UN*X
    ##
    ##############################################################################

    # Attempt to set APP_HOME
    # Resolve links: \u0024{'\u0024'}0 may be a link
    PRG="\u0024{'\u0024'}0"
    # Need this for relative symlinks.
    while [ -h "\u0024PRG" ] ; do
    ls=`ls -ld "\u0024PRG"`
    link=`expr "\u0024ls" : '.*-> \(.*\)\u0024{'\u0024'}'`
    if expr "\u0024link" : '/.*' > /dev/null; then
    PRG="\u0024link"
    else
    PRG=`dirname "\u0024PRG"`"/\u0024link"
    fi
    done
    SAVED="`pwd`"
    cd "`dirname \"\u0024PRG\"`/" >/dev/null
    APP_HOME="`pwd -P`"
    cd "\u0024SAVED" >/dev/null

    APP_NAME="Gradle"
    APP_BASE_NAME=`basename "\u0024{'\u0024'}0"`

    # Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
    DEFAULT_JVM_OPTS='"-Xmx64m" "-Xms64m"'

    # Use the maximum available, or set MAX_FD != -1 to use that value.
    MAX_FD="maximum"

    warn () {
        echo "\u0024{'\u0024'}*"
    }

    die () {
        echo
        echo "\u0024{'\u0024'}*"
        echo
        exit 1
    }

    # OS specific support (must be 'true' or 'false').
cygwin=false
    msys=false
    darwin=false
    nonstop=false
    case "`uname`" in
    CYGWIN* )
    cygwin=true
    ;;
    Darwin* )
    darwin=true
    ;;
    MINGW* )
    msys=true
    ;;
    NONSTOP* )
    nonstop=true
    ;;
    esac

    CLASSPATH=\u0024APP_HOME/gradle/wrapper/gradle-wrapper.jar


    # Determine the Java command to use to start the JVM.
    if [ -n "\u0024JAVA_HOME" ] ; then
    if [ -x "\u0024JAVA_HOME/jre/sh/java" ] ; then
    # IBM's JDK on AIX uses strange locations for the executables
    JAVACMD="\u0024JAVA_HOME/jre/sh/java"
    else
    JAVACMD="\u0024JAVA_HOME/bin/java"
    fi
    if [ ! -x "\u0024JAVACMD" ] ; then
    die "ERROR: JAVA_HOME is set to an invalid directory: \u0024JAVA_HOME

    Please set the JAVA_HOME variable in your environment to match the
    location of your Java installation."
    fi
    else
    JAVACMD="java"
    which java >/dev/null 2>&1 || die "ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.

    Please set the JAVA_HOME variable in your environment to match the
    location of your Java installation."
    fi

    # Increase the maximum file descriptors if we can.
    if [ "\u0024cygwin" = "false" -a "\u0024darwin" = "false" -a "\u0024nonstop" = "false" ] ; then
    MAX_FD_LIMIT=`ulimit -H -n`
    if [ \u0024{'\u0024'}? -eq 0 ] ; then
    if [ "\u0024MAX_FD" = "maximum" -o "\u0024MAX_FD" = "max" ] ; then
    MAX_FD="\u0024MAX_FD_LIMIT"
    fi
    ulimit -n \u0024MAX_FD
    if [ \u0024{'\u0024'}? -ne 0 ] ; then
    warn "Could not set maximum file descriptor limit: \u0024MAX_FD"
    fi
    else
    warn "Could not query maximum file descriptor limit: \u0024MAX_FD_LIMIT"
    fi
    fi

    # For Darwin, add options to specify how the application appears in the dock
    if \u0024darwin; then
    GRADLE_OPTS="\u0024GRADLE_OPTS \"-Xdock:name=\u0024APP_NAME\" \"-Xdock:icon=\u0024APP_HOME/media/gradle.icns\""
    fi

    # For Cygwin or MSYS, switch paths to Windows format before running java
    if [ "\u0024cygwin" = "true" -o "\u0024msys" = "true" ] ; then
    APP_HOME=`cygpath --path --mixed "\u0024APP_HOME"`
    CLASSPATH=`cygpath --path --mixed "\u0024CLASSPATH"`

    JAVACMD=`cygpath --unix "\u0024JAVACMD"`

    # We build the pattern for arguments to be converted via cygpath
        ROOTDIRSRAW=`find -L / -maxdepth 1 -mindepth 1 -type d 2>/dev/null`
    SEP=""
    for dir in \u0024ROOTDIRSRAW ; do
    ROOTDIRS="\u0024ROOTDIRS\u0024SEP\u0024dir"
    SEP="|"
    done
    OURCYGPATTERN="(^(\u0024ROOTDIRS))"
    # Add a user-defined pattern to the cygpath arguments
        if [ "\u0024GRADLE_CYGPATTERN" != "" ] ; then
    OURCYGPATTERN="\u0024OURCYGPATTERN|(\u0024GRADLE_CYGPATTERN)"
    fi
    # Now convert the arguments - kludge to limit ourselves to /bin/sh
    i=0
    for arg in "\u0024{'\u0024'}@" ; do
    CHECK=`echo "\u0024arg"|egrep -c "\u0024OURCYGPATTERN" -`
    CHECK2=`echo "\u0024arg"|egrep -c "^-"`                                 ### Determine if an option

    if [ \u0024CHECK -ne 0 ] && [ \u0024CHECK2 -eq 0 ] ; then                    ### Added a condition
    eval `echo args\u0024i`=`cygpath --path --ignore --mixed "\u0024arg"`
    else
    eval `echo args\u0024i`="\"\u0024arg\""
    fi
    i=`expr \u0024i + 1`
    done
    case \u0024i in
    0) set -- ;;
    1) set -- "\u0024args0" ;;
    2) set -- "\u0024args0" "\u0024args1" ;;
    3) set -- "\u0024args0" "\u0024args1" "\u0024args2" ;;
    4) set -- "\u0024args0" "\u0024args1" "\u0024args2" "\u0024args3" ;;
    5) set -- "\u0024args0" "\u0024args1" "\u0024args2" "\u0024args3" "\u0024args4" ;;
    6) set -- "\u0024args0" "\u0024args1" "\u0024args2" "\u0024args3" "\u0024args4" "\u0024args5" ;;
    7) set -- "\u0024args0" "\u0024args1" "\u0024args2" "\u0024args3" "\u0024args4" "\u0024args5" "\u0024args6" ;;
    8) set -- "\u0024args0" "\u0024args1" "\u0024args2" "\u0024args3" "\u0024args4" "\u0024args5" "\u0024args6" "\u0024args7" ;;
    9) set -- "\u0024args0" "\u0024args1" "\u0024args2" "\u0024args3" "\u0024args4" "\u0024args5" "\u0024args6" "\u0024args7" "\u0024args8" ;;
    esac
    fi

    # Escape application args
    save () {
        for i do printf %s\\n "\u0024i" | sed "s/'/'\\\\''/g;1s/^/'/;\\u0024{'\u0024'}s/\\u0024{'\u0024'}/' \\\\/" ; done
        echo " "
    }
    APP_ARGS=`save "\u0024{'\u0024'}@"`

    # Collect all arguments for the java command, following the shell quoting and substitution rules
    eval set -- \u0024DEFAULT_JVM_OPTS \u0024JAVA_OPTS \u0024GRADLE_OPTS "\"-Dorg.gradle.appname=\u0024APP_BASE_NAME\"" -classpath "\"\u0024CLASSPATH\"" org.gradle.wrapper.GradleWrapperMain "\u0024APP_ARGS"

    exec "\u0024JAVACMD" "\u0024{'\u0024'}@"
    """

const val GRADLEW_BAT = """ @rem
    @rem Copyright 2015 the original author or authors.
    @rem
    @rem Licensed under the Apache License, Version 2.0 (the "License");
    @rem you may not use this file except in compliance with the License.
    @rem You may obtain a copy of the License at
    @rem
    @rem      https://www.apache.org/licenses/LICENSE-2.0
    @rem
    @rem Unless required by applicable law or agreed to in writing, software
    @rem distributed under the License is distributed on an "AS IS" BASIS,
    @rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @rem See the License for the specific language governing permissions and
        @rem limitations under the License.
    @rem

    @if "%DEBUG%" == "" @echo off
    @rem ##########################################################################
    @rem
    @rem  Gradle startup script for Windows
    @rem
    @rem ##########################################################################

    @rem Set local scope for the variables with windows NT shell
        if "%OS%"=="Windows_NT" setlocal

                set DIRNAME=%~dp0
                if "%DIRNAME%" == "" set DIRNAME=.
    set APP_BASE_NAME=%~n0
            set APP_HOME=%DIRNAME%

            @rem Resolve any "." and ".." in APP_HOME to make it shorter.
    for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

    @rem Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
    set DEFAULT_JVM_OPTS="-Xmx64m" "-Xms64m"

    @rem Find java.exe
            if defined JAVA_HOME goto findJavaFromJavaHome

                    set JAVA_EXE=java.exe
    %JAVA_EXE% -version >NUL 2>&1
    if "%ERRORLEVEL%" == "0" goto execute

    echo.
    echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
    echo.
    echo Please set the JAVA_HOME variable in your environment to match the
            echo location of your Java installation.

    goto fail

    :findJavaFromJavaHome
    set JAVA_HOME=%JAVA_HOME:"=%
    set JAVA_EXE=%JAVA_HOME%/bin/java.exe

            if exist "%JAVA_EXE%" goto execute

    echo.
    echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
            echo.
            echo Please set the JAVA_HOME variable in your environment to match the
            echo location of your Java installation.

    goto fail

    :execute
    @rem Setup the command line

            set CLASSPATH=%APP_HOME%\gradle\wrapper\gradle-wrapper.jar


    @rem Execute Gradle
            "%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %GRADLE_OPTS% "-Dorg.gradle.appname=%APP_BASE_NAME%" -classpath "%CLASSPATH%" org.gradle.wrapper.GradleWrapperMain %*

    :end
    @rem End local scope for the variables with windows NT shell
        if "%ERRORLEVEL%"=="0" goto mainEnd

    :fail
    rem Set variable GRADLE_EXIT_CONSOLE if you need the _script_ return code instead of
    rem the _cmd.exe /c_ return code!
    if  not "" == "%GRADLE_EXIT_CONSOLE%" exit 1
    exit /b 1

    :mainEnd
    if "%OS%"=="Windows_NT" endlocal

    :omega
    """

val MODULES_FILE = { rootProjectName: String->
    """<?xml version="1.0" encoding="UTF-8"?>
    <project version="4">
    <component name="ProjectModuleManager">
    <modules>
    <module fileurl="file://\u0024PROJECT_DIR\u0024{'$'}/.idea/$rootProjectName.iml" filepath="\u0024PROJECT_DIR\u0024{'$'}/.idea/$rootProjectName.iml" />
    <module fileurl="file://\u0024PROJECT_DIR\u0024{'$'}/.idea/modules/androidApp/$rootProjectName.androidApp.iml" filepath="\u0024PROJECT_DIR\u0024{'$'}/.idea/modules/androidApp/$rootProjectName.androidApp.iml" />
    <module fileurl="file://\u0024PROJECT_DIR\u0024{'$'}/.idea/modules/shared/$rootProjectName.shared.iml" filepath="\u0024PROJECT_DIR\u0024{'$'}/.idea/modules/shared/$rootProjectName.shared.iml" />
    <module fileurl="file://\u0024PROJECT_DIR\u0024{'$'}/.idea/modules/shared/$rootProjectName.shared.androidAndroidTestRelease.iml" filepath="\u0024PROJECT_DIR\u0024{'$'}/.idea/modules/shared/$rootProjectName.shared.androidAndroidTestRelease.iml" />
    <module fileurl="file://\u0024PROJECT_DIR\u0024{'$'}/.idea/modules/shared/$rootProjectName.shared.commonMain.iml" filepath="\u0024PROJECT_DIR\u0024{'$'}/.idea/modules/shared/$rootProjectName.shared.commonMain.iml" />
    <module fileurl="file://\u0024PROJECT_DIR\u0024{'$'}/.idea/modules/shared/$rootProjectName.shared.commonTest.iml" filepath="\u0024PROJECT_DIR\u0024{'$'}/.idea/modules/shared/$rootProjectName.shared.commonTest.iml" />
    <module fileurl="file://\u0024PROJECT_DIR\u0024{'$'}/.idea/modules/shared/$rootProjectName.shared.iosMain.iml" filepath="\u0024PROJECT_DIR\u0024{'$'}/.idea/modules/shared/$rootProjectName.shared.iosMain.iml" />
    <module fileurl="file://\u0024PROJECT_DIR\u0024{'$'}/.idea/modules/shared/$rootProjectName.shared.iosTest.iml" filepath="\u0024PROJECT_DIR\u0024{'$'}/.idea/modules/shared/$rootProjectName.shared.iosTest.iml" />
    </modules>
    </component>
    </project>"""
}

val MANIFEST_TEMPLATE = { packageName: String ->
    """<?xml version="1.0" encoding="utf-8"?>
    <manifest package="$packageName" />"""
}

val MANIFEST_ANDROID_TEMPLATE = { pack: String ->
    """<?xml version="1.0" encoding="utf-8"?>
    <manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="$pack.android">

    <application
    android:allowBackup="false"
    android:supportsRtl="true">
    android:theme="@style/AppTheme">
    <activity
    android:name=".MainActivity"
    android:exported="true">
    <intent-filter>
    <action android:name="android.intent.action.MAIN" />
    <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
    </activity>
    </application>
    </manifest>
    """
}

val PLATFORM_FILE_ANDROID = { packageName: String ->
    """package $packageName

    actual class Platform actual constructor() {
        actual val platform: String = "Kmm plugin done, blet"
    }"""
}

val PLATFORM_FILE_IOS = { packageName: String ->
    """package $packageName

    import platform.UIKit.UIDevice

            actual class Platform actual constructor() {
    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}"""
}

val PLATFORM_FILE_COMMON = { packageName: String ->
    """package $packageName

    expect class Platform() {
        val platform: String
    }"""
}

val GREETING_FILE_COMMON = { packageName: String ->
    """package $packageName

    class Greeting {
        fun greeting(): String {
            return "Done!!"
        }
    }"""
}

val MAIN_ACTIVITY = { packageName: String ->
    """package $packageName.android

    import androidx.appcompat.app.AppCompatActivity
            import android.os.Bundle
            import $packageName.Greeting
    import android.widget.TextView

    fun greet(): String {
        return Greeting().greeting()
    }

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val tv: TextView = findViewById(R.id.text_view)
            tv.text = greet()
        }
    }
    """
}

const val ACTIVITY_MAIN =
    """<?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main_view"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
    android:id="@+id/text_view"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintLeft_toLeftOf="parent"
    app:layout_constraintRight_toRightOf="parent"
    app:layout_constraintTop_toTopOf="parent"
    tools:text="Hello World!" />

    </androidx.constraintlayout.widget.ConstraintLayout>
    """



const val COLORS = """<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="colorPrimary">#6200EE</color>
    <color name="colorPrimaryDark">#3700B3</color>
    <color name="colorAccent">#03DAC5</color>
</resources>
"""


const val STYLES = """<resources>

    <style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
    </style>

</resources>"""


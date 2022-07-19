object Version {
    const val KOTLIN_VER = "1.5.21"
    const val HILT = "2.38.1"
    const val COMPOSE_VER = "1.0.1"
}

object ProjectConfig {
    const val GRADLE = "com.android.tools.build:gradle:7.0.3"
    const val KOTLIN_GRADLE_PLUGIN =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.KOTLIN_VER}"
    const val HILT_ANDROID_GRADLE_PLUGIN =
        "com.google.dagger:hilt-android-gradle-plugin:${Version.HILT}"
}

object AndroidConfig {
    const val COMPILE_SDK = 31
    const val APP_ID = "com.egiwon.composesample"
    const val MIN_SDK = 23
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0.0"
    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
}

object Dependencies {

    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Version.KOTLIN_VER}"
    const val CORE_KTX = "androidx.core:core-ktx:1.8.0"
    const val MATERIAL = "com.google.android.material:material:1.6.1"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.4"

    const val HILT_ANDROID = "com.google.dagger:hilt-android:${Version.HILT}"
    const val HILT_ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${Version.HILT}"

    const val HILT_COMPILER = "com.google.dagger:hilt-compiler:${Version.HILT}"
    const val HILT_CORE = "com.google.dagger:hilt-core:${Version.HILT}"

    const val COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"

    const val ACTIVITY_EXT = "androidx.activity:activity-ktx:1.3.1"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:1.3.6"
    const val LIFECYCLE_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:2.5.0"

    const val COMPOSE_UI = "androidx.compose.ui:ui:${Version.COMPOSE_VER}"
    const val COMPOSE_MATERIAL = "androidx.compose.material:material:${Version.COMPOSE_VER}"
    const val COMPOSE_UI_PREVIEW = "androidx.compose.ui:ui-tooling-preview:${Version.COMPOSE_VER}"
    const val COMPOSE_ACTIVITY = "androidx.activity:activity-compose:1.5.0"

}

object TestConfig {

    const val JUNIT_4 = "junit:junit:4.+"
    const val JUNIT_4_TEST_JUNIT = "androidx.test.ext:junit:1.1.3"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.4.0"
    const val JUNIT_COMPOSE = "androidx.compose.ui:ui-test-junit4:${Version.COMPOSE_VER}"
    const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling:${Version.COMPOSE_VER}"

}

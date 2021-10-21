plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()

    gradlePluginPortal()
}

dependencies {
    api("dev.icerock:mobile-multiplatform:0.12.0")
    api("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.0-RC")
    api("com.android.tools.build:gradle:7.0.0")
    api("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.18.1")
}

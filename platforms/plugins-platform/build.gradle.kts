plugins {
    id("java-platform")
}

group = "com.croman.platform"

javaPlatform.allowDependencies()

dependencies {
    constraints {
        api("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.9.0")
    }
}
dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name="build-logic"

includeBuild("../platforms")
include("kotlin-plugins")

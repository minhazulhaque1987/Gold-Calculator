pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Gold Calculator"

include(":android")

include(":app")
project(":app").projectDir = file("android/app")

include(":capacitor-android")
project(":capacitor-android").projectDir = file("node_modules/@capacitor/android/capacitor")

include(":capacitor-cordova-android-plugins")
project(":capacitor-cordova-android-plugins").projectDir = file("android/capacitor-cordova-android-plugins")

include(":capacitor-local-notifications")
project(":capacitor-local-notifications").projectDir = file("node_modules/@capacitor/local-notifications/android")
include(":app")

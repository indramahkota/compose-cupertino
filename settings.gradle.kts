rootProject.name = "compose-cupertino"

startParameter.excludedTaskNames += ":example:androidApp:build"
startParameter.excludedTaskNames += ":example:desktopApp:build"
startParameter.excludedTaskNames += ":example:webApp:build"
startParameter.excludedTaskNames += ":example:shared:build"

include(
    ":cupertino",
    ":cupertino-core",
    ":cupertino-native",
    ":cupertino-adaptive",
    ":cupertino-decompose",
    ":cupertino-icons-extended",
    ":example:androidApp",
    ":example:desktopApp",
    ":example:webApp",
    ":example:shared",
)

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("io.codearte.gradle.nexus:gradle-nexus-staging-plugin:0.30.0")
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
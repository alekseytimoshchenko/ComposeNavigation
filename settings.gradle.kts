pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ComposeNavigation"
include(":app")
include(":core_ui")
include(":feature_settings")
include(":feature_articles")
include(":feature_about")
include(":feature_article")

package com.krokosha.core_ui

sealed class MainRoute(val value: String) {
    data class Article(val articleId: String): MainRoute("article/{$articleId}") {
        companion object {
            const val navigationValue = "article/{articleIdArg}"
        }
    }
    object Articles: MainRoute("article")
    object About: MainRoute("about")
    object Settings: MainRoute("settings")
}
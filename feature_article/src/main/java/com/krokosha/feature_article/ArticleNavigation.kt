package com.krokosha.feature_article

import androidx.compose.material3.DrawerState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

private const val articleIdArg = "articleId"

fun NavGraphBuilder.articleScreen(
    drawerState: DrawerState,
    onNavigateBack: () -> Unit
) {
    composable("article/{$articleIdArg}") {
        val viewModel: ArticleViewModel = hiltViewModel()
        ArticleScreen(
            viewModel = viewModel,
            drawerState = drawerState,
            onNavigateBack = onNavigateBack
        )
    }
}

fun NavController.navigateToArticle(articleId: String) {
    this.navigate("article/$articleId")
}
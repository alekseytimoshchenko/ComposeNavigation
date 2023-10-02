package com.krokosha.feature_article

import androidx.compose.material3.DrawerState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.krokosha.core_ui.MainRoute

fun NavGraphBuilder.articleScreen(
    drawerState: DrawerState,
    onNavigateBack: () -> Unit
) {
    composable(MainRoute.Article.navigationValue) {
        val viewModel: ArticleViewModel = hiltViewModel()
        ArticleScreen(
            viewModel = viewModel,
            drawerState = drawerState,
            onNavigateBack = onNavigateBack
        )
    }
}

fun NavController.navigateToArticle(articleId: String) {
    this.navigate(MainRoute.Article(articleId = articleId).value)
}
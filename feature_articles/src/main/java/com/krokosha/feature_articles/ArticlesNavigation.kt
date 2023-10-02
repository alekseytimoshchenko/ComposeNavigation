package com.krokosha.feature_articles

import androidx.compose.material3.DrawerState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.krokosha.core_ui.MainRoute

fun NavGraphBuilder.articlesScreen(drawerState: DrawerState) {
    composable(MainRoute.Articles.value) {
        val viewModel: ArticlesViewModel = hiltViewModel()
        ArticlesScreen(
            vm = viewModel,
            drawerState = drawerState
        )
    }
}

fun NavController.navigateToArticlesScreen() {
    this.navigate(MainRoute.About.value)
}
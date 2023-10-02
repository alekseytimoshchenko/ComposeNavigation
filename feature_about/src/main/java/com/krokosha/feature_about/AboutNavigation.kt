package com.krokosha.feature_about

import androidx.compose.material3.DrawerState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.krokosha.core_ui.MainRoute

fun NavGraphBuilder.aboutScreen(drawerState: DrawerState) {
    composable(MainRoute.About.value) {
        val viewModel: AboutViewModel = hiltViewModel()
        AboutScreen(
            vm = viewModel,
            drawerState = drawerState
        )
    }
}

fun NavController.navigateToAboutScreen() {
    this.navigate(MainRoute.About.value)
}
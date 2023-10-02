package com.krokosha.feature_settings

import androidx.compose.material3.DrawerState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.krokosha.core_ui.MainRoute

fun NavGraphBuilder.settingsScreen(drawerState: DrawerState) {
    composable(MainRoute.Settings.value) {
        val viewModel: SettingsViewModel = hiltViewModel()
        SettingsScreen(
            vm = viewModel,
            drawerState = drawerState
        )
    }
}

fun NavController.navigateToSettingsScreen() {
    this.navigate(MainRoute.Settings.value)
}
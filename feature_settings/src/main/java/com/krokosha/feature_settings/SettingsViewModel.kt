package com.krokosha.feature_settings

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
internal class SettingsViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
): ViewModel()
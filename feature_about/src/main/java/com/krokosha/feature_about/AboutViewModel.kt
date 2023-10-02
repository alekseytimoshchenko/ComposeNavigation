package com.krokosha.feature_about

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
internal class AboutViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
): ViewModel()
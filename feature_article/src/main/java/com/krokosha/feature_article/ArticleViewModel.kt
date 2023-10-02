package com.krokosha.feature_article

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

private const val articleIdArg = "articleId"

internal class ArticleArgs(articleId: String) {
    constructor(savedStateHandle: SavedStateHandle) :
            this(checkNotNull(savedStateHandle[articleIdArg]) as String)
}

// ArticleViewModel.kt

@HiltViewModel
internal class ArticleViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
): ViewModel() {
    val articleArgs = ArticleArgs(savedStateHandle)
}
package com.marcomartiniano.kmpbookapp

import androidx.compose.ui.window.ComposeUIViewController
import com.marcomartiniano.kmpbookapp.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }
package com.marcomartiniano.kmpbookapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.marcomartiniano.kmpbookapp.app.App
import com.marcomartiniano.kmpbookapp.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "KMPBookApp",
        ) {
            App()
        }
    }
}
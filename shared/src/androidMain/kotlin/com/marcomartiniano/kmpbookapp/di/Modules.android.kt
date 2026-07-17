package com.marcomartiniano.kmpbookapp.di

import com.marcomartiniano.kmpbookapp.book.data.database.DatabaseFactory
import org.koin.core.module.Module
import org.koin.dsl.module
import io.ktor.client.engine.okhttp.OkHttp
import org.koin.android.ext.koin.androidApplication

actual val platformModule: Module
    get() = module {
        single { OkHttp.create() }
        single { DatabaseFactory(androidApplication()) }
    }
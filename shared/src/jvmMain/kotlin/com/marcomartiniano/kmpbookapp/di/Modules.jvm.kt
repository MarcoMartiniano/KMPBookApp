package com.marcomartiniano.kmpbookapp.di

import org.koin.core.module.Module
import org.koin.dsl.module
import io.ktor.client.engine.okhttp.OkHttp

actual val platformModule: Module
    get() = module {
        single { OkHttp.create() }
    }
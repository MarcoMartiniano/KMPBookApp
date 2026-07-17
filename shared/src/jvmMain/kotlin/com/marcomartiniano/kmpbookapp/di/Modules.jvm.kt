package com.marcomartiniano.kmpbookapp.di

import com.marcomartiniano.kmpbookapp.book.data.database.DatabaseFactory
import org.koin.core.module.Module
import org.koin.dsl.module
import io.ktor.client.engine.okhttp.OkHttp

actual val platformModule: Module
    get() = module {
        single { OkHttp.create() }
        single { DatabaseFactory() }
    }
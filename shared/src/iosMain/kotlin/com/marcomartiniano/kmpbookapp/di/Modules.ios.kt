package com.marcomartiniano.kmpbookapp.di

import com.marcomartiniano.kmpbookapp.book.data.database.DatabaseFactory
import io.ktor.client.engine.darwin.Darwin
import org.koin.core.module.Module
import org.koin.dsl.module

actual val platformModule: Module
    get() = module {
        single { Darwin.create() }
        single { DatabaseFactory() }
    }
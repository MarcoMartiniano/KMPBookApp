package com.marcomartiniano.kmpbookapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
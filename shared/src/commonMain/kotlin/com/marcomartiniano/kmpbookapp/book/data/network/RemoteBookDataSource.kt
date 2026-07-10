package com.marcomartiniano.kmpbookapp.book.data.network

import com.marcomartiniano.kmpbookapp.book.data.dto.SearchResponseDto
import com.marcomartiniano.kmpbookapp.core.domain.DataError
import com.marcomartiniano.kmpbookapp.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
      //  resultLimit: Int?
    ): Result<SearchResponseDto, DataError.Remote>
}
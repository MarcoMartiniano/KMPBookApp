package com.marcomartiniano.kmpbookapp.book.presentation.book_detail

import com.marcomartiniano.kmpbookapp.book.domain.Book

sealed interface BookDetailAction {
    data object OnBackClick: BookDetailAction
    data object OnFavoriteClick: BookDetailAction
    data class OnSelectedBookChange(val book: Book): BookDetailAction
}
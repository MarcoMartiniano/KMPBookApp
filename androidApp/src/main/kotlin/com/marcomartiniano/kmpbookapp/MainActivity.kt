package com.marcomartiniano.kmpbookapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.marcomartiniano.kmpbookapp.book.presentation.book_list.BookListScreenRoot
import com.marcomartiniano.kmpbookapp.book.presentation.book_list.BookListViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            //App()
            BookListScreenRoot(
                viewModel = remember { BookListViewModel() },
                onBookClick = {

                }
            )
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}
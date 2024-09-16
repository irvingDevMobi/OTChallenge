package com.example.otchallenge.books

import com.example.otchallenge.books.domain.Book

interface BookListContract {
    interface View {
        fun showLoader()
        fun showBooks(list: List<Book>)
        fun showError(message: String)
    }

    interface Presenter {
        fun fetchBooks()
    }
}

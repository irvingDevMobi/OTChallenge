package com.example.otchallenge.books.data

import com.example.otchallenge.books.domain.Book
import io.reactivex.Observable

interface BooksRepository {
    fun getBooks(): Observable<List<Book>>
}

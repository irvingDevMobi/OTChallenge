package com.example.otchallenge.books.data.remote

import com.example.otchallenge.BuildConfig
import com.example.otchallenge.books.domain.Book
import io.reactivex.Observable

class BookRetrofitSource(
    private val api: BooksApi
) : BooksRemoteSource {
    override fun getBooks(): Observable<List<Book>> =
        api.getBooks(BuildConfig.API_KEY).map { it.toBooks() }
}

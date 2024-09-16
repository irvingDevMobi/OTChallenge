package com.example.otchallenge.books.data.remote

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface BooksApi {

    @GET("lists/current/hardcover-fiction.json")
    fun getBooks(
        @Query("api-key") apiKey: String
    ): Observable<BookResultResponse>
}

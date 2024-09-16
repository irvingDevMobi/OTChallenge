package com.example.otchallenge.di.books

import com.example.otchallenge.books.data.BookRepositoryImpl
import com.example.otchallenge.books.data.BooksRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BookDataModule {

    @Provides
    @Singleton
    fun provideRepository(
    ): BooksRepository = BookRepositoryImpl()
}

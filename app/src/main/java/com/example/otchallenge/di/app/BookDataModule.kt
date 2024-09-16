package com.example.otchallenge.di.app

import com.example.otchallenge.BuildConfig
import com.example.otchallenge.app.data.remote.RetrofitApp
import com.example.otchallenge.books.data.BookRepositoryImpl
import com.example.otchallenge.books.data.BooksRepository
import com.example.otchallenge.books.data.remote.BookRetrofitSource
import com.example.otchallenge.books.data.remote.BooksApi
import com.example.otchallenge.books.data.remote.BooksRemoteSource
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class BookDataModule {

    @Provides
    @Singleton
    fun provideRepository(
        remoteSource: BooksRemoteSource
    ): BooksRepository = BookRepositoryImpl(remoteSource)

    @Provides
    @Singleton
    fun provideRemoteSource(
        api: BooksApi
    ): BooksRemoteSource = BookRetrofitSource(api)

    @Provides
    @Singleton
    fun provideApi(
        retrofit: Retrofit
    ): BooksApi = retrofit.create(BooksApi::class.java)

    @Provides
    @Singleton
    fun provideRetrofit(
    ): Retrofit = RetrofitApp.getInstance(BuildConfig.BASE_URL)
}

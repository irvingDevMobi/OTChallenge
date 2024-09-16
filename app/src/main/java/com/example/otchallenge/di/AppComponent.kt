package com.example.otchallenge.di

import com.example.otchallenge.di.books.BookDataModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        SchedulersModule::class,
        BookDataModule::class
    ]
)
interface AppComponent {
    fun mainActivitySubcomponent(): MainActivitySubcomponent.Builder
}

package com.example.otchallenge.di

import com.example.otchallenge.MainActivity
import com.example.otchallenge.di.books.BookListSubcomponent
import dagger.Subcomponent

@Subcomponent
interface MainActivitySubcomponent {

    fun inject(mainActivity: MainActivity)

    fun bookListSubcomponent(): BookListSubcomponent.Builder

    @Subcomponent.Builder
    interface Builder {
        fun build(): MainActivitySubcomponent
    }
}

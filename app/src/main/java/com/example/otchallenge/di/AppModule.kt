package com.example.otchallenge.di

import com.example.otchallenge.MyApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule(
    private val application: MyApplication
) {
    @Provides
    fun provideApplication(): MyApplication = application
}

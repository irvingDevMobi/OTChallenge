package com.example.otchallenge.di.app

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

package com.example.otchallenge.app

import android.app.Application
import com.example.otchallenge.di.app.AppComponent
import com.example.otchallenge.di.app.DaggerAppComponent

class MyApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }
}

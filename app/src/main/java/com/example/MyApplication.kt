package com.example

import android.app.Application
import com.example.dagger.ActivityComponent
import com.example.dagger.AppComponent
import com.example.dagger.DaggerAppComponent

class MyApplication : Application() {

    private lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
    }

    fun getAppComponent(): AppComponent {
        return appComponent
    }
}
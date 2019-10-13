package com.example.dagger

import com.example.car.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(DriverModule::class))
interface AppComponent {

    fun getActivityComponentBuilder():ActivityComponent.Builder
}
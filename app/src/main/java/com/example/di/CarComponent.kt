package com.example.di

import com.example.dagger.DiesellEngineModule
import com.example.MainActivity
import com.example.dagger.WheelsModule
import dagger.Component

/**
 * We used @Bind with Diesel and @Provide with Petrol
 */

@Component(modules = arrayOf(WheelsModule::class, DiesellEngineModule::class))
interface CarComponent {

    fun inject(activity: MainActivity)

}
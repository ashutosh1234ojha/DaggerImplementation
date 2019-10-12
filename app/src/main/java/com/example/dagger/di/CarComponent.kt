package com.example.dagger.di

import com.example.dagger.Car
import com.example.dagger.MainConceptActivity
import com.example.dagger.WheelsModule
import dagger.Component

@Component(modules = arrayOf(WheelsModule::class))
interface CarComponent {

    fun inject(activity: MainConceptActivity)

}
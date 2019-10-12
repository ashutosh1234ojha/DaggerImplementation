package com.example.dagger.di

import com.example.dagger.Car
import com.example.dagger.MainConceptActivity
import dagger.Component

@Component
interface CarComponent {

    //    fun getCar(): Car
    fun inject(activity: MainConceptActivity)

}
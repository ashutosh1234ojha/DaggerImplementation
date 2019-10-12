package com.example.dagger.di

import com.example.dagger.Car
import dagger.Component

@Component
interface CarComponent {

    fun getCar(): Car

}
package com.example.dagger

import com.example.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
 class  DriverModule {

    @Provides
    @Singleton
    fun provideDriver():Driver{
        return Driver()
    }
}
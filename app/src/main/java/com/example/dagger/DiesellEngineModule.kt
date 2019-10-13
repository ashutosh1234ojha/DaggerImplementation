package com.example.dagger

import com.example.car.DieselEngine
import com.example.car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DiesellEngineModule(horsePower: Int) {
    var horsePower: Int = horsePower

    @Provides
    fun providesDieselEngine(): Engine {
        return DieselEngine(horsePower)
    }


}
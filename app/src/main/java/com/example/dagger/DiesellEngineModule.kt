package com.example.dagger

import com.example.car.DieselEngine
import com.example.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DiesellEngineModule {

    @Binds
    abstract fun bindDieselEngine(dieselEngine: DieselEngine): Engine


}
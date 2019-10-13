package com.example.dagger

import com.example.car.Engine
import com.example.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {


    @Binds
    abstract fun providePetrolEngine(petrolEngine: PetrolEngine): Engine
}
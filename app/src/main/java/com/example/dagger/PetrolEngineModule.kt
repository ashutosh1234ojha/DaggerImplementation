package com.example.dagger

import com.example.car.Engine
import com.example.car.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun providePetrolEngine(petrolEngine: PetrolEngine): Engine {

        return petrolEngine
    }
}
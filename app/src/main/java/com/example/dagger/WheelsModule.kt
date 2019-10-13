package com.example.dagger

import com.example.car.Rims
import com.example.car.Tires
import com.example.car.Wheels
import dagger.Module
import dagger.Provides


@Module
class WheelsModule {

    @Provides
    fun proviesRims(): Rims {
        return Rims()
    }

    @Provides
    fun proviesTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun providesWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }
}


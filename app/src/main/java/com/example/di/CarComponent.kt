package com.example.di

import com.example.MainActivity
import com.example.dagger.PetrolEngineModule
import com.example.dagger.WheelsModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

/**
 * We used @Bind with Diesel and @Provide with Petrol
 */

@Component(modules = arrayOf(WheelsModule::class, PetrolEngineModule::class))
interface CarComponent {

    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

        fun build(): CarComponent
    }

}
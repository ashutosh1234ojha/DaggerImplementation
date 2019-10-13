package com.example.dagger

import com.example.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

/**
 * We used @Bind with Diesel and @Provide with Petrol
 */
@PerActivity
@Subcomponent(modules = arrayOf(WheelsModule::class, PetrolEngineModule::class))
interface ActivityComponent {

    fun inject(activity: MainActivity)


//    @Subcomponent.Builder
//    interface Builder {
//
//        @BindsInstance
//        fun horsePower(@Named("horsePower") horsePower: Int): Builder
//
//        @BindsInstance
//        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder
//
//        fun build(): ActivityComponent
//    }

    @Subcomponent.Factory
    interface Factory {

        fun create(@BindsInstance @Named("horsePower") horsePower: Int,
                   @BindsInstance @Named("engineCapacity") engineCapacity: Int): ActivityComponent
    }

}
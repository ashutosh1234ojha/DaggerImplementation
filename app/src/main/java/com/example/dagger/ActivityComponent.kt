package com.example.dagger

import com.example.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

/**
 * We used @Bind with Diesel and @Provide with Petrol
 */
@PerActivity
@Subcomponent(modules = arrayOf(WheelsModule::class, DiesellEngineModule::class))
interface ActivityComponent {

    fun inject(activity: MainActivity)


//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        fun horsePower(@Named("horsePower") horsePower: Int): Builder
//
//        @BindsInstance
//        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder
//
//        fun appComponent(component: AppComponent):Builder
//
//        fun build(): ActivityComponent
//    }

}
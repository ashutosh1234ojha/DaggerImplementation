package com.example.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horsePower") horsePower: Int,
                                       @Named("engineCapacity") engineCapacity: Int) : Engine {
    var horsePower = horsePower
    var engineCapacity = engineCapacity

    override fun start() {

        Log.d("Tag", "Petrol engine started. Horsepower :" + horsePower + " Car capacity" + engineCapacity)
    }
}
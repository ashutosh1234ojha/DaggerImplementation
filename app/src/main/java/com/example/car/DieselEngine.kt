package com.example.car

import android.util.Log
import javax.inject.Inject

//We removed the @Inject from constructor becuase we will pass the value not dagger
//class DieselEngine @Inject constructor(horsePower: Int) : Engine {
class DieselEngine @Inject constructor(horsePower: Int) : Engine {
    var horsePower = horsePower

    override fun start() {

        Log.d("Tag", "Diesel engine started. Horsepower :"+horsePower)
    }
}
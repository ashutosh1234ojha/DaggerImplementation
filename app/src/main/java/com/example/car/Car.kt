package com.example.car

import android.util.Log
import javax.inject.Inject

/**
 * Here Order will of injection will be 1st Constructor, 2nd Field, 3rd Method
 */

class Car @Inject constructor(driver: Driver, engine: Engine, wheels: Wheels) {

    var engine = engine
    var wheels = wheels
    var driver = driver

    companion object {
        private val TAG = "Car"

    }


    fun drive() {
        engine.start()
        Log.d(TAG, "$driver drives $this")

    }


}
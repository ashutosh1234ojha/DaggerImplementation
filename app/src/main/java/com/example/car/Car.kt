package com.example.car

import android.util.Log
import javax.inject.Inject

/**
 * Here Order will of injection will be 1st Constructor, 2nd Field, 3rd Method
 */

//Constructor inject
class Car @Inject constructor(engine: Engine, wheels: Wheels) {

    var engine = engine

    companion object {
        private val TAG = "Car"

    }


    fun drive() {

        engine.start()

        Log.d(TAG, "driving by field injection...")

    }


}
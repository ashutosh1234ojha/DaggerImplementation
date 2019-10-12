package com.example.dagger

import android.util.Log
import javax.inject.Inject

/**
 * Here Order will of injection will be 1st Constructor, 2nd Field, 3rd Method
 */

//Constructor inject
class Car @Inject constructor(engine: Engine, wheels: Wheels) {


    companion object {
        private val TAG = "Car"

    }


    fun drive() {

        Log.d(TAG, "driving by field injection...")

    }


}
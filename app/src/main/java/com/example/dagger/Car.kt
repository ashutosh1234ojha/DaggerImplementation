package com.example.dagger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(var wheels: Wheels, engine: Engine) {
    companion object {
        private val TAG = "Car"

    }

    fun drive() {

        Log.d(TAG,"driving by field injection...")

    }


}
package com.example.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {

    override fun start() {

        Log.d("Tag","Diesel engine started")
    }
}
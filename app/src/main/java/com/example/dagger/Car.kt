package com.example.dagger

import android.util.Log
import javax.inject.Inject

/**
 * Here Order will of injection will be 1st Constructor, 2nd Field, 3rd Method
 */

//Constructor inject
class Car @Inject constructor(engine: Engine) {

  lateinit  var remote:Remote
    //Field inject
    @Inject
    lateinit var wheels: Wheels;

    companion object {
        private val TAG = "Car"

    }

//    //Method inject
//    @Inject
//    fun enableRemote(remote: Remote) {
//        remote.setListener(this)
//    }

    //Method inject
    @Inject
    fun setRemoteVar(remote: Remote) {
        this.remote=remote
    }

    fun drive() {

        remote.setListener(this)
        Log.d(TAG, "driving by field injection...")

    }


}
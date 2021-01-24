package com.sarthak.dagger2

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

private const val TAG = "AuthActivity"

class AuthActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var abcd:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        Log.d(TAG, "onCreate: $abcd")
    }
}
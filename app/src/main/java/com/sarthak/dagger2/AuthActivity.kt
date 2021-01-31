package com.sarthak.dagger2

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.RequestManager
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

private const val TAG = "AuthActivity"

class AuthActivity : DaggerAppCompatActivity() {

    /**Below are two different ways to inject dependencies*/

    @Inject
    lateinit var logo:Drawable

    /**you must expose a field in order to allow Dagger to inject there*/
    @JvmField // expose a field
    @Inject
    var requestManager:RequestManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        setLogo()
    }

    private fun setLogo(){
        requestManager?.load(logo)
            ?.into(findViewById(R.id.image_view_logo))
    }
}
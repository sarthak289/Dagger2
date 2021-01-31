package com.sarthak.dagger2.di

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.sarthak.dagger2.R
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    /**
     * This is to store all application level dependencies which will not destroy and will be needed
     * in the whole application, like Retrofit instance, Glide instance, etc.
     * */
    companion object{
        /**
         * @Provides annotation is used to basically declare a dependency.
         * Documentations suggest to use static dependencies till it's possible as it's more efficient.a
         * */
        @Provides
        fun provideRequestOptions():RequestOptions{
            return RequestOptions()
                .placeholder(R.drawable.white_back)
                .error(R.drawable.white_back)
        }

        @Provides
        fun provideGlideInstance(application: Application,
                                 requestOptions: RequestOptions):RequestManager{
            return Glide.with(application)
                .setDefaultRequestOptions(requestOptions)
        }

        @Provides
        fun provideAppDrawable(application:Application): Drawable {
            return ContextCompat.getDrawable(application, R.drawable.s_logo)!!
        }
    }
}
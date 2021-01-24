package com.sarthak.dagger2.di

import android.app.Application
import com.sarthak.dagger2.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.AndroidSupportInjectionModule

@Component(
        modules = [AndroidSupportInjectionModule::class,
                    ActivityBuildersModule::class
        ]
)
interface AppComponent: AndroidInjector<BaseApplication>{
    /**
     * AndroidInjector<BaseApplication> tells that BaseApplication will be the client of AppComponent service.
     * */
    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent //this is overriding the regular builder and it is returning a type of AppComponent
    }
}
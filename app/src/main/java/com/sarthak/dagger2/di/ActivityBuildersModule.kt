package com.sarthak.dagger2.di

import com.sarthak.dagger2.AuthActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeAuthActivity(): AuthActivity

}
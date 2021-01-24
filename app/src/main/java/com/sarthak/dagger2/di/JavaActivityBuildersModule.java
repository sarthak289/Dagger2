package com.sarthak.dagger2.di;

import com.sarthak.dagger2.AuthActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class JavaActivityBuildersModule {
    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

    @Provides
    static String someString(){
        return "this is a test string";
    }
}

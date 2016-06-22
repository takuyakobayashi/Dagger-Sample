package com.example.android.daggersample.di.modules;

import android.content.Context;

import com.example.android.daggersample.SampleApp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module public class AppModule {
    private final SampleApp application;

    public AppModule(SampleApp application) {
        this.application = application;
    }

    @Provides @Singleton Context provideApplicationContext() {
        return this.application;
    }
}

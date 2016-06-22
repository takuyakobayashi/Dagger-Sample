package com.example.android.daggersample.di.component;

import com.example.android.daggersample.DaggerApp;
import com.example.android.daggersample.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton @Component(modules = AppModule.class) public interface AppComponent {
    void inject(DaggerApp app);
}

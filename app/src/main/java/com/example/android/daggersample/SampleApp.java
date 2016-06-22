package com.example.android.daggersample;

import android.app.Application;

import com.example.android.daggersample.di.component.AppComponent;
import com.example.android.daggersample.di.component.DaggerAppComponent;
import com.example.android.daggersample.di.modules.AppModule;

public class SampleApp extends Application {
    AppComponent appComponent;

    @Override public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}

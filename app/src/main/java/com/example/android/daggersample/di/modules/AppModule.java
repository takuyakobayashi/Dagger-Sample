package com.example.android.daggersample.di.modules;

import android.content.Context;

import com.example.android.daggersample.DaggerApp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module public class AppModule {
    private final DaggerApp application;

    public AppModule(DaggerApp application) {
        this.application = application;
    }

    @Provides @Singleton Context provideApplicationContext() {
        return this.application;
    }

//    @Provides @Singleton
//    NetworkUtil provideNetworkUtil() {
//        return new NetworkUtil(application);
//    }
//
//    @Provides @Singleton
//    Navigator provideNavigator() {
//        return new Navigator();
//    }
//
//    @Provides @Singleton
//    Executor provideThreadExecutor(ThreadExecutor executor) {
//        return executor;
//    }
//
//    @Provides @Singleton
//    MainThread providePostExecutionThread(MainThreadImpl mainThread) {
//        return mainThread;
//    }
//
//    @Provides @Singleton
//    OkHttp provideOkHttp(){
//        return new OkHttp();
//    }
//
}

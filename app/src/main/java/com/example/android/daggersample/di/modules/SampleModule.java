package com.example.android.daggersample.di.modules;

import com.example.android.daggersample.SampleView;
import com.example.android.daggersample.di.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

@Module public class SampleModule {
    SampleView view;

    public SampleModule(SampleView view) {
        this.view = view;
    }

    @Provides @PerActivity SampleView provideMainView() {
        return view;
    }
}
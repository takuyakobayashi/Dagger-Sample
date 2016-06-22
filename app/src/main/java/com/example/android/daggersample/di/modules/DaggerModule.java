package com.example.android.daggersample.di.modules;

import com.example.android.daggersample.di.presenter.DaggerPresenter;
import com.example.android.daggersample.MainActivity;
import com.example.android.daggersample.MainView;
import com.example.android.daggersample.di.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

@Module public class DaggerModule {
    MainActivity activity;

    public DaggerModule(MainActivity activity) {
        this.activity = activity;
    }

//    @Provides @PerActivity MainActivity provideActivity() {
//        return activity;
//    }

    @Provides @PerActivity MainView provideView() {
        return activity;
    }

    @Provides @PerActivity DaggerPresenter provideDaggerPrensenter() {
        return new DaggerPresenter();
    }
}

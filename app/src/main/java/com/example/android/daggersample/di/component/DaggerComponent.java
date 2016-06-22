package com.example.android.daggersample.di.component;

import com.example.android.daggersample.di.presenter.DaggerPresenter;
import com.example.android.daggersample.MainActivity;
import com.example.android.daggersample.di.modules.DaggerModule;
import com.example.android.daggersample.di.scope.PerActivity;

import dagger.Component;

@PerActivity @Component(dependencies = AppComponent.class, modules = DaggerModule.class)
public interface DaggerComponent {
    void inject(MainActivity activity);

    DaggerPresenter provideDaggerPresenter();
}

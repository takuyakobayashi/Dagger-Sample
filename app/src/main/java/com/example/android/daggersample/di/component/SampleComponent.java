package com.example.android.daggersample.di.component;

import com.example.android.daggersample.SampleActivity;
import com.example.android.daggersample.di.modules.SampleModule;
import com.example.android.daggersample.di.scope.PerActivity;

import dagger.Component;

@PerActivity @Component(dependencies = AppComponent.class, modules = SampleModule.class)
public interface SampleComponent {
    void inject(SampleActivity activity);
}

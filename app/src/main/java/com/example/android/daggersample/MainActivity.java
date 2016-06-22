package com.example.android.daggersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.android.daggersample.di.component.DaggerComponent;
import com.example.android.daggersample.di.component.DaggerDaggerComponent;
import com.example.android.daggersample.di.modules.DaggerModule;
import com.example.android.daggersample.di.presenter.DaggerPresenter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainView {

    @Inject DaggerPresenter presenter;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerComponent component = DaggerDaggerComponent.builder()
                .appComponent(((DaggerApp)getApplication()).getAppComponent())
                .daggerModule(new DaggerModule(this))
                .build();
        component.inject(this);

        Log.d("/****check", "onCreate " + this);
    }

    @Override protected void onResume() {
        super.onResume();
        presenter.resume();
    }

    @Override protected void onPause() {
        super.onPause();
        presenter.pause();
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        presenter.destroy();
    }
}

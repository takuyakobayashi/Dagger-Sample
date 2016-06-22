package com.example.android.daggersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.android.daggersample.di.component.DaggerSampleComponent;
import com.example.android.daggersample.di.component.SampleComponent;
import com.example.android.daggersample.di.modules.SampleModule;
import com.example.android.daggersample.presenter.SamplePresenter;

import javax.inject.Inject;

public class SampleActivity extends AppCompatActivity implements SampleView {

    @Inject SamplePresenter presenter;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SampleComponent component = DaggerSampleComponent.builder()
                .appComponent(((SampleApp)getApplication()).getAppComponent())
                .sampleModule(new SampleModule(this))
                .build();
        component.inject(this);

        Log.d("/**** check", "onCreate " + this);
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

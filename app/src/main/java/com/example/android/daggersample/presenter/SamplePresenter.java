package com.example.android.daggersample.presenter;

import android.util.Log;

import com.example.android.daggersample.SampleView;
import com.example.android.daggersample.Prenseter;
import com.example.android.daggersample.di.scope.PerActivity;
import com.example.android.daggersample.usecase.SampleUseCase;

import javax.inject.Inject;

@PerActivity public class SamplePresenter implements Prenseter {
    @Inject SampleUseCase daggerUseCase;
    @Inject SampleView view;

    @Inject public SamplePresenter() {
    }

    @Override public void create() {
        Log.d("/**** check", "create " + view);
    }

    @Override public void resume() {
        Log.d("/**** check", "resume " + view);
    }

    @Override public void pause() {
        Log.d("/**** check", "pause " + view);
    }

    @Override public void destroy() {
        Log.d("/**** check", "destroy " + view);
    }
}

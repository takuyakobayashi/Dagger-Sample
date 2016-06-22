package com.example.android.daggersample.di.presenter;

import android.util.Log;

import com.example.android.daggersample.MainView;
import com.example.android.daggersample.Prenseter;
import com.example.android.daggersample.di.scope.PerActivity;

import javax.inject.Inject;

@PerActivity public class DaggerPresenter implements Prenseter {
    @Inject MainView view;

    @Inject public DaggerPresenter() {
    }

    @Override public void create() {

    }

    @Override public void resume() {
        Log.d("/**** check", "resume" + view);
    }

    @Override public void pause() {
        Log.d("/**** check", "pause" + view);
    }

    @Override public void destroy() {
        Log.d("/**** check", "destroy" + view);
    }
}

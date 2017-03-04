package com.tulong.wf.architectureofmvp.inject.module;

import android.support.v7.app.AppCompatActivity;

import com.tulong.wf.architectureofmvp.inject.PerActivity;

import dagger.Module;
import dagger.Provides;


/**
 * Created by wangjianwei on 2017/2/27.
 */
@Module
public class ActivityModule {

    private final AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }
    @Provides @PerActivity
    AppCompatActivity activity() {
        return this.activity;
    }

}

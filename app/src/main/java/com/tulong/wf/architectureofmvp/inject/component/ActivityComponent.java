package com.tulong.wf.architectureofmvp.inject.component;

import android.support.v7.app.AppCompatActivity;

import com.tulong.wf.architectureofmvp.inject.PerActivity;
import com.tulong.wf.architectureofmvp.inject.module.ActivityModule;

import dagger.Component;


/**
 * Created by wangjianwei on 2017/2/27.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    AppCompatActivity activity();
}

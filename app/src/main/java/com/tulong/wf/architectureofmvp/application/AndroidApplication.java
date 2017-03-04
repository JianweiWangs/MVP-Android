package com.tulong.wf.architectureofmvp.application;

import android.app.Application;

import com.tulong.wf.architectureofmvp.inject.component.ApplicationComponent;
import com.tulong.wf.architectureofmvp.inject.component.DaggerApplicationComponent;
import com.tulong.wf.architectureofmvp.inject.module.ApplicationModule;


/**
 * Created by wangjianwei on 2017/2/27.
 */

public class AndroidApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }
    private void initializeInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }

}

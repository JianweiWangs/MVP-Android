package com.tulong.wf.architectureofmvp.inject.module;

import android.content.Context;

import com.tulong.wf.architectureofmvp.application.AndroidApplication;
import com.tulong.wf.architectureofmvp.executor.DemoExecutor;
import com.tulong.wf.architectureofmvp.executor.ThreadExecutor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wangjianwei on 2017/2/27.
 */
@Module
public class ApplicationModule {

    private final AndroidApplication application;

    public ApplicationModule(AndroidApplication application) {
        this.application = application;
    }

    @Provides @Singleton
    Context provideApplicationContext() {
        return this.application;
    }

    @Provides @Singleton
    ThreadExecutor provideThreadExecutor(DemoExecutor demoExecutor) {
        return demoExecutor;
    }

}

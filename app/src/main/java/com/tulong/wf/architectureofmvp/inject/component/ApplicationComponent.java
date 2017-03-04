package com.tulong.wf.architectureofmvp.inject.component;

import android.content.Context;

import com.tulong.wf.architectureofmvp.executor.DemoExecutor;
import com.tulong.wf.architectureofmvp.executor.ThreadExecutor;
import com.tulong.wf.architectureofmvp.navigation.Navigator;
import com.tulong.wf.architectureofmvp.view.activity.BaseActivity;
import com.tulong.wf.architectureofmvp.inject.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;


/**
 * Created by wangjianwei on 2017/2/27.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(BaseActivity baseActivity);
    Navigator navigator();
    ThreadExecutor threadExecutor();
    Context context();

}

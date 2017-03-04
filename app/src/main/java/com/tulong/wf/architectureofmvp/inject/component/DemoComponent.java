package com.tulong.wf.architectureofmvp.inject.component;



import com.tulong.wf.architectureofmvp.inject.PerActivity;
import com.tulong.wf.architectureofmvp.inject.module.ActivityModule;
import com.tulong.wf.architectureofmvp.inject.module.DemoModule;
import com.tulong.wf.architectureofmvp.view.activity.DemoActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wangjianwei on 2017/3/1.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class, DemoModule.class})
public interface DemoComponent extends ActivityComponent {

    void inject(DemoActivity demoActivity);
}

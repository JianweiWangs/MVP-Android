package com.tulong.wf.architectureofmvp.view.activity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tulong.wf.architectureofmvp.application.AndroidApplication;
import com.tulong.wf.architectureofmvp.inject.component.ApplicationComponent;
import com.tulong.wf.architectureofmvp.inject.module.ActivityModule;
import com.tulong.wf.architectureofmvp.navigation.Navigator;

import javax.inject.Inject;

import butterknife.ButterKnife;


/**
 * Created by wangjianwei on 2017/2/27.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Inject
    Navigator navigator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getApplicationComponent().inject(this);
    }

    protected void addFragment(int containerViewId, Fragment fragment) {
        final FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
        fragmentTransaction.add(containerViewId, fragment);
        fragmentTransaction.commit();
    }


    protected ApplicationComponent getApplicationComponent() {
        return ((AndroidApplication) getApplication()).getApplicationComponent();
    }


    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }



}

package com.tulong.wf.architectureofmvp.interactor;

import android.content.Context;

import com.tulong.wf.architectureofmvp.entity.DemoModel;
import com.tulong.wf.architectureofmvp.entity.EntityJsonMapper;
import com.tulong.wf.architectureofmvp.executor.DemoExecutor;
import com.tulong.wf.architectureofmvp.executor.ThreadExecutor;
import com.tulong.wf.architectureofmvp.net.DemoImp;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by wangjianwei on 2017/2/28.
 */

public class DemoCase extends Case<DemoModel, Void> {


    private final DemoImp mDemoImp;

    @Inject
    DemoCase(ThreadExecutor threadExecutor, Context context) {
        super(threadExecutor);
        mDemoImp = new DemoImp(context, new EntityJsonMapper());
    }

    @Override
    Observable<DemoModel> buildUseCaseObservable(Void aVoid) {
        return mDemoImp.demoResultList();
//        return null;
    }

}

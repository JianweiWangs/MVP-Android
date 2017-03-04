package com.tulong.wf.architectureofmvp.interactor;




import com.tulong.wf.architectureofmvp.executor.ThreadExecutor;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;



/**
 * Created by wangjianwei on 2017/2/28.
 */

public abstract class Case<T, Params> {

    private final ThreadExecutor mthreadExecutor;

    public Case(ThreadExecutor threadExecutor) {
        mthreadExecutor = threadExecutor;
    }

    abstract Observable<T> buildUseCaseObservable(Params params);

    public void execute(Observer<T> observer, Params params) {
        final Observable<T> observable = this.buildUseCaseObservable(params)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.from(mthreadExecutor));
        observable.subscribe(observer);
    }
}

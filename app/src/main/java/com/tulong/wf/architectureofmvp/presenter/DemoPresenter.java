package com.tulong.wf.architectureofmvp.presenter;

import android.support.annotation.NonNull;
import android.util.Log;

import com.tulong.wf.architectureofmvp.entity.DemoModel;
import com.tulong.wf.architectureofmvp.inject.PerActivity;
import com.tulong.wf.architectureofmvp.interactor.DefaultObserver;
import com.tulong.wf.architectureofmvp.interactor.DemoCase;
import com.tulong.wf.architectureofmvp.net.DemoImp;
import com.tulong.wf.architectureofmvp.view.DemoView;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by wangjianwei on 2017/2/28.
 */
@PerActivity
public class DemoPresenter implements Presenter {


    private DemoView demoView;


    private final DemoCase demoCase;


    @Inject
    public DemoPresenter(DemoCase demoCase) {
        this.demoCase = demoCase;
    }

    public void setView(@NonNull DemoView demoView) {
        this.demoView = demoView;
    }

    public void initialize() {
        loadDemoData();
    }

    private void loadDemoData() {
        demoCase.execute(new UserListObserver(), null);
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {

    }

    private void showDemoInView(List<DemoModel.StoriesBean> beanList) {
        this.demoView.viewDemoDataList(beanList);
    }

    private final class UserListObserver extends DefaultObserver<DemoModel> {

        @Override
        public void doNext(DemoModel demoModel) {
            Log.d("DemoModel", demoModel.toString());
            DemoPresenter.this.showDemoInView(demoModel.getStories());
        }

        @Override
        public void doCompleted() {

        }

        @Override
        public void doError(Throwable exception) {

        }
    }

}

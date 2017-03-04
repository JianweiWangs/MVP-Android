package com.tulong.wf.architectureofmvp.view.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.tulong.wf.architectureofmvp.R;
import com.tulong.wf.architectureofmvp.entity.DemoModel;
import com.tulong.wf.architectureofmvp.inject.component.DaggerDemoComponent;
import com.tulong.wf.architectureofmvp.inject.component.DemoComponent;
import com.tulong.wf.architectureofmvp.presenter.DemoPresenter;
import com.tulong.wf.architectureofmvp.view.DemoView;
import com.tulong.wf.architectureofmvp.view.adapter.DemoAdapter;
import java.util.List;
import javax.inject.Inject;
import butterknife.Bind;
import butterknife.ButterKnife;

public class DemoActivity extends BaseActivity implements DemoView {

    private static final String TAG = "Demo控制器";

    @Inject
    DemoPresenter mPresenter;

    DemoComponent demoComponent;

    @Inject
    DemoAdapter mAdapter;

    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        demoComponent = DaggerDemoComponent.builder().applicationComponent(getApplicationComponent())
                .activityModule(getActivityModule()).build();
        demoComponent.inject(this);
        mPresenter.setView(this);
        ButterKnife.bind(this);
        LinearLayoutManager manager = new LinearLayoutManager(context());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(mAdapter);
        mPresenter.initialize();
    }
    @Override
    public void viewDemoDataList(List<DemoModel.StoriesBean> demoModels) {
        this.mAdapter.setStoriesBeanList(demoModels);
    }

    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showRetry() {

    }

    @Override
    public void hideRetry() {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public Context context() {
        return this;
    }


}
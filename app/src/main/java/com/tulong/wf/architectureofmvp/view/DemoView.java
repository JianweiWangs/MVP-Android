package com.tulong.wf.architectureofmvp.view;

import com.tulong.wf.architectureofmvp.entity.DemoModel;

import java.util.Collection;
import java.util.List;

/**
 * Created by wangjianwei on 2017/2/28.
 */

public interface DemoView extends LoadDataView {
    void viewDemoDataList(List<DemoModel.StoriesBean> demoModels);
}

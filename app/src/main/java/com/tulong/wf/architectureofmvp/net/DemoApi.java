package com.tulong.wf.architectureofmvp.net;

import com.tulong.wf.architectureofmvp.entity.DemoModel;

import java.util.List;

import rx.Observable;

/**
 * Created by wangjianwei on 2017/3/1.
 */

public interface DemoApi {
    String API_BASE_URL = "http://news-at.zhihu.com";
    String API_LIST_URL = API_BASE_URL + "/api/4/stories/latest";

    Observable<DemoModel> demoResultList();




}

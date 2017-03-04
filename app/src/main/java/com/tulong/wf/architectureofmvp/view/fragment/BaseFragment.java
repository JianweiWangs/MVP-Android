package com.tulong.wf.architectureofmvp.view.fragment;

import android.support.v4.app.Fragment;

import com.tulong.wf.architectureofmvp.inject.HasComponent;

/**
 * Created by wangjianwei on 2017/2/27.
 */

public abstract class BaseFragment extends Fragment {

    @SuppressWarnings("unchecked")
    protected <C> C getComponent(Class<C> componentType) {
        return componentType.cast(((HasComponent<C>) getActivity()).getComponent());
    }
}

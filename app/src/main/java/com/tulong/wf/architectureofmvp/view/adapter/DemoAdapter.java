package com.tulong.wf.architectureofmvp.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tulong.wf.architectureofmvp.R;
import com.tulong.wf.architectureofmvp.entity.DemoModel;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by wangjianwei on 2017/2/27.
 */

public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.DemoViewHolder>{

//    public interface OnItemClickListener {
//        void onDemoItemClicked();
//    }
    private List<DemoModel.StoriesBean> storiesBeanList;
    private final LayoutInflater layoutInflater;


    @Inject
    DemoAdapter(Context context) {
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.storiesBeanList = Collections.emptyList();
    }

    public void setStoriesBeanList(List<DemoModel.StoriesBean> beanList) {
        this.storiesBeanList = beanList;
        this.notifyDataSetChanged();
    }


    @Override
    public DemoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = this.layoutInflater.inflate(R.layout.item_demo, parent, false);
        return new DemoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DemoViewHolder holder, int position) {
        final DemoModel.StoriesBean bean = this.storiesBeanList.get(position);
        holder.textViewTitle.setText(bean.getTitle());
    }

    @Override
    public int getItemCount() {
        return (this.storiesBeanList != null ? this.storiesBeanList.size() : 0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class DemoViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.item_demo_textview)
        TextView textViewTitle;

        DemoViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

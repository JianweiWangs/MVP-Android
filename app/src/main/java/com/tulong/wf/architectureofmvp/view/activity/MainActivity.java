package com.tulong.wf.architectureofmvp.view.activity;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.tulong.wf.architectureofmvp.R;

import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;

public class MainActivity extends BaseActivity {

    private static final String TAG = "主控制器";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Log.d(TAG, navigator.toString());
    }
    @OnClick(R.id.button)
    void buttonOnClick(View view) {
        startActivity(new Intent(this, DemoActivity.class));
    }
}

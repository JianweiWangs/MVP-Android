package com.tulong.wf.architectureofmvp.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.tulong.wf.architectureofmvp.entity.DemoModel;
import com.tulong.wf.architectureofmvp.entity.EntityJsonMapper;

import java.net.MalformedURLException;
import java.util.List;

import rx.Observable;

/**
 * Created by wangjianwei on 2017/3/1.
 */

public class DemoImp implements DemoApi {

    private final Context mContext;

    private final EntityJsonMapper mMapper;


    public DemoImp(Context context, EntityJsonMapper entityJsonMapper) {
        this.mContext = context.getApplicationContext();
        this.mMapper = entityJsonMapper;
    }


    @Override
    public Observable<DemoModel> demoResultList() {
        return Observable.create(subscriber -> {
            if (isThereInternetConnection()) {
                try {
                    String response = getDemoDataFromApi();
                    if (response != null) {
                        subscriber.onNext(mMapper.transformDemoModelCollection(response));
                        subscriber.onCompleted();
                    } else  {
                        subscriber.onError(new Exception());
                    }
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    subscriber.onError(new Exception(e.getCause()));
                }
            } else  {
                subscriber.onError(new Exception());
            }
        });
    }

    private String getDemoDataFromApi() throws MalformedURLException {
        return ApiConnection.createGET(API_LIST_URL).requestSyncCall();
    }

    private boolean isThereInternetConnection() {
        boolean isConnected;

        ConnectivityManager connectivityManager =
                (ConnectivityManager) this.mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        isConnected = (networkInfo != null && networkInfo.isConnectedOrConnecting());

        return isConnected;
    }

}

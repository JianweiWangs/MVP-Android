package com.tulong.wf.architectureofmvp.executor;


import android.support.annotation.NonNull;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by wangjianwei on 2017/3/1.
 */
@Singleton
public class DemoExecutor implements ThreadExecutor {

    private final ThreadPoolExecutor threadPoolExecutor;

    @Inject
    DemoExecutor() {
        threadPoolExecutor = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<>(), new DemoThreadFactory());
    }

    @Override
    public void execute(Runnable command) {
        threadPoolExecutor.execute(command);
    }

    private static class DemoThreadFactory implements ThreadFactory {
        private int counter = 0;
        @Override public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(runnable, "android_" + counter++);
        }
    }
}

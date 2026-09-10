package com.bytedance.sdk.component.fi.lr.ri;

import com.unity3d.ads.BuildConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static final TimeUnit ri = TimeUnit.SECONDS;

    public static ExecutorService ri() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, ri, new LinkedBlockingQueue(), new ri(BuildConfig.FLAVOR));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}

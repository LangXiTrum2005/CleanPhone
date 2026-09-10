package com.bytedance.sdk.component.mzz.mml.qdl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    private static final TimeUnit qdl = TimeUnit.SECONDS;

    public static ExecutorService qdl() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, qdl, new LinkedBlockingQueue(), new qdl("default"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}

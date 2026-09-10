package com.efs.sdk.base.core.util.concurrent;

import androidx.annotation.NonNull;
import com.efs.sdk.base.core.util.Log;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class WorkThreadUtil {
    public static final int DEFAULT_THREAD_POOL_MAX_CNT = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ThreadPoolExecutor f426a = new ThreadPoolExecutor(2, 2, 10, TimeUnit.MINUTES, new LinkedBlockingQueue(Integer.MAX_VALUE), new ThreadPoolExecutor.DiscardOldestPolicy());

    public static Future<?> submit(@NonNull Runnable runnable) {
        try {
            return f426a.submit(runnable);
        } catch (Throwable th) {
            Log.e("efs.util.concurrent", "submit task error!", th);
            return null;
        }
    }
}

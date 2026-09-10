package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMRTLog;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f2500a = "UMExecutor";
    private static volatile ScheduledThreadPoolExecutor b;
    private static final ThreadFactory c = new ThreadFactory() { // from class: com.umeng.analytics.pro.av.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f2501a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ccg-" + this.f2501a.incrementAndGet());
        }
    };

    private static ScheduledThreadPoolExecutor a() {
        if (b == null) {
            synchronized (av.class) {
                try {
                    if (b == null) {
                        b = new ScheduledThreadPoolExecutor(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors(), 4)), c);
                        b.setKeepAliveTime(3L, TimeUnit.SECONDS);
                        b.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static void a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            a().schedule(runnable, j, timeUnit);
        } catch (Throwable th) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "schedule error:" + th.getMessage());
        }
    }
}

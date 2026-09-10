package com.efs.sdk.net.a;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f723a = "com.efs.sdk.net.a.b";
    private static volatile ScheduledThreadPoolExecutor b;
    private static ThreadFactory c = new ThreadFactory() { // from class: com.efs.sdk.net.a.b.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AtomicInteger f724a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("NetThreadPoolExecutor" + this.f724a.addAndGet(1));
            return thread;
        }
    };

    private static ScheduledThreadPoolExecutor a() {
        if (b == null) {
            synchronized (b.class) {
                try {
                    if (b == null) {
                        b = new ScheduledThreadPoolExecutor(4, c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static void a(Runnable runnable) {
        try {
            a().execute(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

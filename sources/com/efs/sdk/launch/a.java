package com.efs.sdk.launch;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f438a = "com.efs.sdk.launch.a";
    private static volatile ScheduledThreadPoolExecutor b;
    private static ThreadFactory c = new ThreadFactory() { // from class: com.efs.sdk.launch.a.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AtomicInteger f439a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("LaunchThreadPoolExecutor" + this.f439a.addAndGet(1));
            return thread;
        }
    };

    private static ScheduledThreadPoolExecutor a() {
        if (b == null) {
            synchronized (a.class) {
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

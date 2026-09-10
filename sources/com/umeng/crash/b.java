package com.umeng.crash;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f2713a;
    private static final ThreadFactory b = new ThreadFactory() { // from class: com.umeng.crash.b.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f2714a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "UCrash #" + this.f2714a.addAndGet(1));
        }
    };

    private static ScheduledThreadPoolExecutor a() {
        if (f2713a == null) {
            synchronized (b.class) {
                try {
                    if (f2713a == null) {
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, b);
                        f2713a = scheduledThreadPoolExecutor;
                        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2713a;
    }

    public static void b(Runnable runnable) {
        try {
            a().schedule(runnable, 3L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            UCrash.a().a("UCrash.Executor", "schedule", th);
        }
    }

    public static void a(Runnable runnable) {
        try {
            a().execute(runnable);
        } catch (Throwable th) {
            UCrash.a().a("UCrash.Executor", "execute", th);
        }
    }
}

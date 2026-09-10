package com.smartdigimkt.t0;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ThreadPoolExecutor f38604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadPoolExecutor f38605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ThreadPoolExecutor f38606c;

    /* JADX INFO: renamed from: com.smartdigimkt.t0.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC0614a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("CommonThreadPool");
            return threadNewThread;
        }
    }

    public class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("ReportThreadPool");
            return threadNewThread;
        }
    }

    public class c implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("NwtThreadPool");
            return threadNewThread;
        }
    }

    public static ThreadPoolExecutor a() {
        if (f38604a == null) {
            f38604a = new ThreadPoolExecutor(5, 10, 15L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(60), new ThreadFactoryC0614a(), new ThreadPoolExecutor.DiscardPolicy());
        }
        return f38604a;
    }

    public static ThreadPoolExecutor b() {
        if (f38606c == null) {
            f38606c = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1), new c(), new ThreadPoolExecutor.DiscardPolicy());
        }
        return f38606c;
    }

    public static ThreadPoolExecutor c() {
        if (f38605b == null) {
            f38605b = new ThreadPoolExecutor(5, 200, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(60), new b(), new ThreadPoolExecutor.DiscardPolicy());
        }
        return f38605b;
    }
}

package com.lzh.easythread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DelayTaskDispatcher.java */
/* JADX INFO: loaded from: classes4.dex */
public final class beachfront {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static beachfront f23520saneness = new beachfront();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public ScheduledExecutorService f23521attabal = Executors.newScheduledThreadPool(1, new attabal());

    /* JADX INFO: compiled from: DelayTaskDispatcher.java */
    public class attabal implements ThreadFactory {
        public attabal() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("Delay-Task-Dispatcher");
            thread.setPriority(10);
            return thread;
        }
    }

    /* JADX INFO: compiled from: DelayTaskDispatcher.java */
    public class saneness implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Runnable f23523arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ ExecutorService f23524kowloon;

        public saneness(ExecutorService executorService, Runnable runnable) {
            this.f23524kowloon = executorService;
            this.f23523arytenoidectomy = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23524kowloon.execute(this.f23523arytenoidectomy);
        }
    }

    public static beachfront attabal() {
        return f23520saneness;
    }

    public void saneness(long j, ExecutorService executorService, Runnable runnable) {
        if (j == 0) {
            executorService.execute(runnable);
        } else {
            this.f23521attabal.schedule(new saneness(executorService, runnable), j, TimeUnit.MILLISECONDS);
        }
    }
}

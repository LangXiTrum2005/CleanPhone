package com.chartboost.sdk.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2 f14142a = new i2();

    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f14144b;

        public a(String prefix) {
            Intrinsics.f(prefix, "prefix");
            this.f14143a = prefix;
            this.f14144b = new AtomicInteger(1);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r) {
            Intrinsics.f(r, "r");
            return new Thread(r, this.f14143a + this.f14144b.getAndIncrement());
        }
    }

    public static final ScheduledExecutorService a(int i2, String threadPrefix) {
        Intrinsics.f(threadPrefix, "threadPrefix");
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i2, new a(threadPrefix));
        scheduledThreadPoolExecutor.prestartAllCoreThreads();
        return scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ ScheduledExecutorService a(int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 2;
        }
        if ((i3 & 2) != 0) {
            str = "CBAsync-";
        }
        return a(i2, str);
    }

    public static final ExecutorService a(int i2, long j, TimeUnit timeUnit) {
        Intrinsics.f(timeUnit, "timeUnit");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, j, timeUnit, new PriorityBlockingQueue());
        threadPoolExecutor.prestartAllCoreThreads();
        return threadPoolExecutor;
    }

    public static /* synthetic */ ExecutorService a(int i2, long j, TimeUnit timeUnit, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            j = 10;
        }
        if ((i3 & 4) != 0) {
            timeUnit = TimeUnit.SECONDS;
        }
        return a(i2, j, timeUnit);
    }
}

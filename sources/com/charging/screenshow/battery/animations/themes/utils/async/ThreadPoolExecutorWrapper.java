package com.charging.screenshow.battery.animations.themes.utils.async;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class ThreadPoolExecutorWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f13315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f13316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f13317c;

    public ThreadPoolExecutorWrapper() {
        new HashMap();
        this.f13315a = new ThreadPoolExecutor(12, 12, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f13316b = new ScheduledThreadPoolExecutor(10);
        this.f13317c = new Handler(Looper.getMainLooper());
        String name = Async.class.getName();
        TaskQueue taskQueue = new TaskQueue();
        taskQueue.X = new LinkedBlockingQueue();
        taskQueue.setName(name);
        taskQueue.start();
    }
}

package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.l7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3112l7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ScheduledExecutorService f23769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f23770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Semaphore f23771c;
    public static final AtomicBoolean d;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(5, new K5("Log", true));
        Intrinsics.e(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
        f23769a = scheduledExecutorServiceNewScheduledThreadPool;
        f23770b = Executors.newSingleThreadExecutor(new K5("LogSingle", true));
        f23771c = new Semaphore(1);
        d = new AtomicBoolean(false);
    }
}

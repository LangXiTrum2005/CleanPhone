package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class saneness implements ThreadFactory {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final ThreadFactory f16540kowloon = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final AtomicInteger f16539arytenoidectomy = new AtomicInteger(1);

    public saneness(attabal attabalVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f16539arytenoidectomy;
        Thread threadNewThread = this.f16540kowloon.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}

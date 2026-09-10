package com.google.firebase.concurrent;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
class CustomThreadFactory implements ThreadFactory {
    public static final ThreadFactory f0 = Executors.defaultThreadFactory();
    public final AtomicLong X = new AtomicLong();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f20247Y;
    public final int Z;
    public final StrictMode.ThreadPolicy e0;

    public CustomThreadFactory(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        this.f20247Y = str;
        this.Z = i2;
        this.e0 = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f0.newThread(new a(0, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f20247Y + " Thread #" + this.X.getAndIncrement());
        return threadNewThread;
    }
}

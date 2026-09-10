package com.kochava.core.task.manager.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f28086c = new Object();
    public static HandlerThread d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ExecutorService f28087e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f28088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f28089b;

    public a() {
        synchronized (f28086c) {
            try {
                HandlerThread handlerThread = d;
                if (handlerThread == null || !handlerThread.isAlive()) {
                    HandlerThread handlerThread2 = new HandlerThread("KochavaPrimaryThread");
                    d = handlerThread2;
                    handlerThread2.start();
                }
                if (f28087e == null) {
                    f28087e = Executors.newCachedThreadPool();
                }
                Looper looper = d.getLooper();
                if (looper == null) {
                    throw new RuntimeException("Failed to start KochavaPrimaryThread");
                }
                this.f28088a = new Handler(Looper.getMainLooper());
                this.f28089b = new Handler(looper);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

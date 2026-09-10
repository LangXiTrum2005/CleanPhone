package com.google.android.gms.internal.consent_sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f23019b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f23018a = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f23020c = new WeakReference(null);

    public g0() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.android.gms.internal.consent_sdk.f0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                g0 g0Var = this.f23014a;
                Thread thread = new Thread(runnable, l1.d.e(g0Var.f23018a.getAndIncrement(), "Google consent worker #"));
                g0Var.f23020c = new WeakReference(thread);
                return thread;
            }
        });
        this.f23019b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f23020c.get()) {
            runnable.run();
        } else {
            this.f23019b.execute(runnable);
        }
    }
}

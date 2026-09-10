package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.ee1;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee1 f24457b = new ee1(r0.class, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24458a;

    public r0(Object obj) {
        this.f24458a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f24458a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.s0
    public final void m(Runnable runnable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f24457b.b().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", l1.d.g("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    public final String toString() {
        return q4.a.i(super.toString(), "[status=SUCCESS, result=[", this.f24458a.toString(), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f24458a;
    }
}

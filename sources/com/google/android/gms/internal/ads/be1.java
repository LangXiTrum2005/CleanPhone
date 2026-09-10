package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class be1 implements ListenableFuture {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final be1 f12743b = new be1(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ee1 f12744c = new ee1(be1.class, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12745a;

    public be1(Object obj) {
        this.f12745a = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        ps1.e0(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            Logger loggerB = f12744c.b();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerB.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", d5.u.h(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f12745a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.f12745a);
        return d5.u.h(new StringBuilder(String.valueOf(string).length() + 25 + strValueOf.length() + 2), string, "[status=SUCCESS, result=[", strValueOf, "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f12745a;
    }
}

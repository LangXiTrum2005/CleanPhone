package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m4 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f24426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l4 f24427b = new l4(this);

    public m4(j4 j4Var) {
        this.f24426a = new WeakReference(j4Var);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        j4 j4Var = (j4) this.f24426a.get();
        boolean zCancel = this.f24427b.cancel(z10);
        if (!zCancel || j4Var == null) {
            return zCancel;
        }
        j4Var.f24384a = null;
        j4Var.f24385b = null;
        j4Var.f24386c.g(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f24427b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24427b.f24294a instanceof g1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f24427b.isDone();
    }

    @Override // com.google.android.gms.internal.play_billing.s0
    public final void m(Runnable runnable, Executor executor) {
        this.f24427b.m(runnable, executor);
    }

    public final String toString() {
        return this.f24427b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f24427b.get(j10, timeUnit);
    }
}

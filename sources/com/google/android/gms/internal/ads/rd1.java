package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rd1 extends de1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f19563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd1 f19564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Callable f19565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sd1 f19566f;

    public rd1(sd1 sd1Var, Callable callable, Executor executor) {
        this.f19566f = sd1Var;
        this.f19564d = sd1Var;
        executor.getClass();
        this.f19563c = executor;
        this.f19565e = callable;
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final Object d() {
        return this.f19565e.call();
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final String g() {
        return this.f19565e.toString();
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final boolean h() {
        return this.f19564d.isDone();
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final void i(Object obj) {
        this.f19564d.f19937p = null;
        this.f19566f.c(obj);
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final void j(Throwable th2) {
        sd1 sd1Var = this.f19564d;
        sd1Var.f19937p = null;
        if (th2 instanceof ExecutionException) {
            sd1Var.d(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            sd1Var.cancel(false);
        } else {
            sd1Var.d(th2);
        }
    }
}

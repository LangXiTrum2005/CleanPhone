package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pe1 extends ud1 implements RunnableFuture {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile de1 f18595h;

    public pe1(Callable callable) {
        this.f18595h = new oe1(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.uc1
    public final void e() {
        de1 de1Var;
        if (k() && (de1Var = this.f18595h) != null) {
            de1Var.k();
        }
        this.f18595h = null;
    }

    @Override // com.google.android.gms.internal.ads.uc1
    public final String f() {
        de1 de1Var = this.f18595h;
        if (de1Var == null) {
            return super.f();
        }
        String string = de1Var.toString();
        return q4.a.j(new StringBuilder(string.length() + 7), "task=[", string, X3.j.f27836e);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        de1 de1Var = this.f18595h;
        if (de1Var != null) {
            de1Var.run();
        }
        this.f18595h = null;
    }
}

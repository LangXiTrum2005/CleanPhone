package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l4 f8918b;

    public /* synthetic */ o9(l4 l4Var, int i10) {
        this.f8917a = i10;
        this.f8918b = l4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8917a;
        l4 l4Var = this.f8918b;
        switch (i10) {
            case 0:
                l4Var.g();
                break;
            default:
                l4Var.f();
                break;
        }
    }
}

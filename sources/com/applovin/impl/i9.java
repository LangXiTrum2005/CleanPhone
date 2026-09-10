package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4 f8179b;

    public /* synthetic */ i9(h4 h4Var, int i10) {
        this.f8178a = i10;
        this.f8179b = h4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8178a;
        h4 h4Var = this.f8179b;
        switch (i10) {
            case 0:
                h4Var.d();
                break;
            case 1:
                h4Var.c();
                break;
            default:
                h4Var.b();
                break;
        }
    }
}

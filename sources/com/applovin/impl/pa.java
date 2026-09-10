package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f8988b;

    public /* synthetic */ pa(y1 y1Var, int i10) {
        this.f8987a = i10;
        this.f8988b = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8987a;
        y1 y1Var = this.f8988b;
        switch (i10) {
            case 0:
                y1Var.j();
                break;
            default:
                y1Var.k();
                break;
        }
    }
}

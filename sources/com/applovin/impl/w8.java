package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f9975b;

    public /* synthetic */ w8(c2 c2Var, int i10) {
        this.f9974a = i10;
        this.f9975b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9974a;
        c2 c2Var = this.f9975b;
        switch (i10) {
            case 0:
                c2Var.K();
                break;
            case 1:
                c2Var.I();
                break;
            case 2:
                c2Var.J();
                break;
            case 3:
                c2Var.H();
                break;
            case 4:
                c2Var.O();
                break;
            case 5:
                c2Var.L();
                break;
            default:
                c2Var.M();
                break;
        }
    }
}

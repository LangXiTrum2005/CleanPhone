package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n4 f9226b;

    public /* synthetic */ r9(n4 n4Var, int i10) {
        this.f9225a = i10;
        this.f9226b = n4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9225a;
        n4 n4Var = this.f9226b;
        switch (i10) {
            case 0:
                n4Var.q();
                break;
            case 1:
                n4Var.u();
                break;
            case 2:
                n4Var.t();
                break;
            case 3:
                n4Var.n();
                break;
            case 4:
                n4Var.o();
                break;
            case 5:
                n4Var.l();
                break;
            case 6:
                n4Var.p();
                break;
            case 7:
                n4Var.s();
                break;
            case 8:
                n4Var.m();
                break;
            case 9:
                n4Var.k();
                break;
            default:
                n4Var.r();
                break;
        }
    }
}

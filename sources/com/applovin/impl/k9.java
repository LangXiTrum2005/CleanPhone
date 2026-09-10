package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f8313b;

    public /* synthetic */ k9(j0 j0Var, int i10) {
        this.f8312a = i10;
        this.f8313b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8312a;
        j0 j0Var = this.f8313b;
        switch (i10) {
            case 0:
                j0Var.e();
                break;
            case 1:
                j0Var.f();
                break;
            case 2:
                j0Var.a();
                break;
            default:
                j0Var.d();
                break;
        }
    }
}

package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r3 f7409b;

    public /* synthetic */ aa(r3 r3Var, int i10) {
        this.f7408a = i10;
        this.f7409b = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7408a;
        r3 r3Var = this.f7409b;
        switch (i10) {
            case 0:
                r3Var.d();
                break;
            default:
                r3Var.h();
                break;
        }
    }
}

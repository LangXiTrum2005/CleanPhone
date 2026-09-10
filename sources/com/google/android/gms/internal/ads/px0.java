package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class px0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qx0 f18833b;

    public /* synthetic */ px0(qx0 qx0Var, int i10) {
        this.f18832a = i10;
        this.f18833b = qx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18832a) {
            case 0:
                this.f18833b.l();
                break;
            case 1:
                this.f18833b.l();
                break;
            case 2:
                this.f18833b.l();
                break;
            case 3:
                this.f18833b.l();
                break;
            default:
                qx0 qx0Var = this.f18833b;
                qx0Var.f19223b.set(false);
                qx0Var.l();
                break;
        }
    }
}

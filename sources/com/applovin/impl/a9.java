package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f7407b;

    public /* synthetic */ a9(f1 f1Var, int i10) {
        this.f7406a = i10;
        this.f7407b = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7406a;
        f1 f1Var = this.f7407b;
        switch (i10) {
            case 0:
                f1Var.j();
                break;
            case 1:
                f1Var.e();
                break;
            default:
                f1Var.i();
                break;
        }
    }
}

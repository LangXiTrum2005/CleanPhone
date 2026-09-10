package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ox0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18401a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qx0 f18402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ux0 f18404d;

    public /* synthetic */ ox0(qx0 qx0Var, int i10, ux0 ux0Var) {
        this.f18402b = qx0Var;
        this.f18403c = i10;
        this.f18404d = ux0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f18401a) {
            case 0:
                this.f18402b.n(this.f18404d, this.f18403c);
                break;
            default:
                qx0 qx0Var = this.f18402b;
                int i10 = this.f18403c;
                if (i10 > 0) {
                    qx0Var.n(this.f18404d, i10);
                }
                qx0Var.k(0L);
                break;
        }
    }

    public /* synthetic */ ox0(qx0 qx0Var, ux0 ux0Var, int i10) {
        this.f18402b = qx0Var;
        this.f18404d = ux0Var;
        this.f18403c = i10;
    }
}

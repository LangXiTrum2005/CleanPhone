package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u20 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v20 f20603b;

    public /* synthetic */ u20(v20 v20Var, int i10) {
        this.f20602a = i10;
        this.f20603b = v20Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f20602a) {
            case 0:
                v20 v20Var = this.f20603b;
                d10 d10Var = v20Var.f21008e;
                if (d10Var != null) {
                    if (!v20Var.f21009f) {
                        d10Var.k();
                        v20Var.f21009f = true;
                    }
                    v20Var.f21008e.f();
                }
                break;
            case 1:
                d10 d10Var2 = this.f20603b.f21008e;
                if (d10Var2 != null) {
                    d10Var2.g();
                }
                break;
            default:
                d10 d10Var3 = this.f20603b.f21008e;
                if (d10Var3 != null) {
                    d10Var3.e();
                }
                break;
        }
    }
}

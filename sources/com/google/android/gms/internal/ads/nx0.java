package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nx0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qx0 f18018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ux0 f18019c;

    public /* synthetic */ nx0(qx0 qx0Var, ux0 ux0Var, int i10) {
        this.f18017a = i10;
        this.f18018b = qx0Var;
        this.f18019c = ux0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18017a) {
            case 0:
                this.f18018b.n(this.f18019c, 1);
                break;
            default:
                qx0 qx0Var = this.f18018b;
                if (!qx0Var.f19223b.get()) {
                    ux0 ux0Var = this.f18019c;
                    if (ux0Var.t() == 0 && ux0Var.u()) {
                        ux0Var.k();
                    }
                }
                qx0Var.k(((Long) zzba.zzc().a(am.f12109d0)).longValue());
                break;
        }
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cm0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ky0 f13211b;

    public /* synthetic */ cm0(ky0 ky0Var, int i10) {
        this.f13210a = i10;
        this.f13211b = ky0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13210a) {
            case 0:
                this.f13211b.a();
                break;
            default:
                if (((Boolean) zzba.zzc().a(am.q6)).booleanValue() && pi1.L.f17679b) {
                    this.f13211b.c();
                    break;
                }
                break;
        }
    }
}

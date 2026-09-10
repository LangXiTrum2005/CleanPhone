package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v41 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21021a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx1 f21022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f21023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fx1 f21024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hx1 f21025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kx1 f21026f;

    public v41(hx1 hx1Var, fx1 fx1Var, fx1 fx1Var2, hx1 hx1Var2, fx1 fx1Var3) {
        this.f21022b = hx1Var;
        this.f21023c = fx1Var;
        this.f21024d = fx1Var2;
        this.f21025e = hx1Var2;
        this.f21026f = fx1Var3;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f21021a) {
            case 0:
                return new s41((xd) this.f21022b.f15424a, (h41) this.f21023c.zzb(), (Map) this.f21025e.f15424a, (DisplayMetrics) this.f21024d.zzb(), (a71) this.f21026f.zzb());
            default:
                return new j41((xd) this.f21022b.f15424a, (h41) this.f21023c.zzb(), (DisplayMetrics) this.f21024d.zzb(), (View) this.f21025e.f15424a, (a71) this.f21026f.zzb());
        }
    }

    public v41(hx1 hx1Var, fx1 fx1Var, hx1 hx1Var2, fx1 fx1Var2, fx1 fx1Var3) {
        this.f21022b = hx1Var;
        this.f21023c = fx1Var;
        this.f21025e = hx1Var2;
        this.f21024d = fx1Var2;
        this.f21026f = fx1Var3;
    }
}

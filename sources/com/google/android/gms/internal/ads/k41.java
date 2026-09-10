package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k41 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx1 f16306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f16307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hx1 f16308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hx1 f16309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kx1 f16310f;

    public /* synthetic */ k41(hx1 hx1Var, fx1 fx1Var, hx1 hx1Var2, hx1 hx1Var3, fx1 fx1Var2, int i10) {
        this.f16305a = i10;
        this.f16306b = hx1Var;
        this.f16307c = fx1Var;
        this.f16308d = hx1Var2;
        this.f16309e = hx1Var3;
        this.f16310f = fx1Var2;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f16305a) {
            case 0:
                return new j41((xd) this.f16306b.f15424a, (h41) this.f16307c.zzb(), (View) this.f16308d.f15424a, (Activity) this.f16309e.f15424a, (a71) this.f16310f.zzb());
            default:
                return new j41((xd) this.f16306b.f15424a, (h41) this.f16307c.zzb(), (p21) this.f16308d.f15424a, (Map) this.f16309e.f15424a, (a71) this.f16310f.zzb());
        }
    }
}

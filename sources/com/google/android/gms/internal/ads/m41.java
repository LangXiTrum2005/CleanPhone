package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m41 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17240a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx1 f17241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f17242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hx1 f17243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f17244e;

    public m41(hx1 hx1Var, fx1 fx1Var, hx1 hx1Var2, fx1 fx1Var2) {
        this.f17241b = hx1Var;
        this.f17242c = fx1Var;
        this.f17243d = hx1Var2;
        this.f17244e = fx1Var2;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f17240a) {
            case 0:
                return new l41((xd) this.f17241b.f15424a, (Map) this.f17243d.f15424a, (h21) this.f17242c.zzb(), (a71) this.f17244e.zzb());
            default:
                return new q41((xd) this.f17241b.f15424a, (h41) this.f17242c.zzb(), (Map) this.f17243d.f15424a, (a71) this.f17244e.zzb());
        }
    }

    public m41(hx1 hx1Var, hx1 hx1Var2, hx1 hx1Var3, fx1 fx1Var) {
        this.f17241b = hx1Var;
        this.f17243d = hx1Var2;
        this.f17242c = hx1Var3;
        this.f17244e = fx1Var;
    }
}

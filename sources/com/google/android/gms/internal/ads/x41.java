package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x41 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx1 f21741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx1 f21742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hx1 f21743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fx1 f21744e;

    public /* synthetic */ x41(int i10, fx1 fx1Var, fx1 fx1Var2, hx1 hx1Var, hx1 hx1Var2) {
        this.f21740a = i10;
        this.f21741b = hx1Var;
        this.f21742c = fx1Var;
        this.f21744e = fx1Var2;
        this.f21743d = hx1Var2;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f21740a) {
            case 0:
                return new w41((Context) this.f21741b.f15424a, (a71) this.f21742c.zzb(), (y31) this.f21744e.zzb(), (h21) this.f21743d.f15424a);
            case 1:
                return new q61((Context) this.f21741b.f15424a, (h21) this.f21743d.f15424a, (a71) this.f21742c.zzb(), (fe1) this.f21744e.zzb());
            default:
                return new r61((Context) this.f21741b.f15424a, (h21) this.f21743d.f15424a, (a71) this.f21742c.zzb(), (fe1) this.f21744e.zzb());
        }
    }

    public x41(hx1 hx1Var, fx1 fx1Var, hx1 hx1Var2, fx1 fx1Var2) {
        this.f21740a = 1;
        this.f21741b = hx1Var;
        this.f21742c = fx1Var;
        this.f21743d = hx1Var2;
        this.f21744e = fx1Var2;
    }
}

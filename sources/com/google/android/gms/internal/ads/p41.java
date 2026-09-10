package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p41 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx1 f18484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f18485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f18486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f18487e;

    public /* synthetic */ p41(int i10, fx1 fx1Var, fx1 fx1Var2, hx1 hx1Var, hx1 hx1Var2) {
        this.f18483a = i10;
        this.f18484b = hx1Var;
        this.f18485c = fx1Var;
        this.f18486d = hx1Var2;
        this.f18487e = fx1Var2;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f18483a) {
            case 0:
                return new o41((xd) this.f18484b.f15424a, (h41) this.f18485c.zzb(), (Context) this.f18486d.zzb(), (a71) this.f18487e.zzb(), 0);
            case 1:
                return new q41((xd) this.f18484b.f15424a, (h41) this.f18485c.zzb(), (h21) this.f18486d.zzb(), (a71) this.f18487e.zzb());
            default:
                return new o41((xd) this.f18484b.f15424a, (h41) this.f18485c.zzb(), (Context) this.f18486d.zzb(), (a71) this.f18487e.zzb(), 1);
        }
    }
}

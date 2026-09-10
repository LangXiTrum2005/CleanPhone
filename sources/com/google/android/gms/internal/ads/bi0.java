package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bi0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12793a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f12794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lx1 f12795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fx1 f12796d;

    public bi0(fx1 fx1Var, lx1 lx1Var, fx1 fx1Var2) {
        this.f12796d = fx1Var;
        this.f12795c = lx1Var;
        this.f12794b = fx1Var2;
    }

    public hz a() {
        Context contextA = ((o40) this.f12794b).a();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new hz(contextA, k00Var, this.f12795c.zzb(), (jw0) this.f12796d.zzb());
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f12793a) {
            case 0:
                return new ai0((wh0) this.f12796d.zzb(), this.f12795c.zzb(), (p9.a) this.f12794b.zzb());
            default:
                return a();
        }
    }

    public bi0(kx1 kx1Var, lx1 lx1Var, fx1 fx1Var) {
        this.f12794b = kx1Var;
        this.f12795c = lx1Var;
        this.f12796d = fx1Var;
    }
}

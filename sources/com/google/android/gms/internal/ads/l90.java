package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l90 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16831a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f16832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z90 f16833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fx1 f16834d;

    public l90(fx1 fx1Var, z90 z90Var, fx1 fx1Var2) {
        this.f16832b = fx1Var;
        this.f16833c = z90Var;
        this.f16834d = fx1Var2;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f16831a) {
            case 0:
                return new k90((Context) this.f16834d.zzb(), ((u40) this.f16832b).a(), this.f16833c.a(), 0);
            default:
                return new dj0((lj0) this.f16832b.zzb(), this.f16833c.a(), (String) this.f16834d.zzb());
        }
    }

    public l90(fx1 fx1Var, kx1 kx1Var, z90 z90Var) {
        this.f16834d = fx1Var;
        this.f16832b = kx1Var;
        this.f16833c = z90Var;
    }
}

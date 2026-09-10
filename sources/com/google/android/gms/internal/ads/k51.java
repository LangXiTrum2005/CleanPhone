package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k51 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f16332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx1 f16333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f16334d;

    public /* synthetic */ k51(fx1 fx1Var, fx1 fx1Var2, Object obj, int i10) {
        this.f16331a = i10;
        this.f16332b = fx1Var;
        this.f16333c = fx1Var2;
        this.f16334d = (kx1) obj;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f16331a) {
            case 0:
                return new m51((File) this.f16332b.zzb(), (pz0) this.f16333c.zzb(), (a71) this.f16334d.zzb());
            default:
                dx1 dx1VarB = fx1.b(this.f16332b);
                dx1 dx1VarB2 = fx1.b(this.f16333c);
                if (true == ((h21) this.f16334d.zzb()).g0()) {
                    dx1VarB = dx1VarB2;
                }
                d61 d61Var = (d61) dx1VarB.zzb();
                ic1.h(d61Var);
                return d61Var;
        }
    }
}

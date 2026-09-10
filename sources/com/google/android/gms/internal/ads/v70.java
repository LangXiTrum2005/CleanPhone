package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v70 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21073a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f21074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f21075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t80 f21076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f21077e;

    public v70(hz hzVar, fx1 fx1Var, u40 u40Var, t80 t80Var, z90 z90Var) {
        this.f21074b = fx1Var;
        this.f21075c = u40Var;
        this.f21076d = t80Var;
        this.f21077e = z90Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f21073a) {
            case 0:
                return new nc0(new s70((Context) this.f21074b.zzb(), ((u40) this.f21075c).a(), this.f21076d.a(), ((z90) this.f21077e).a(), 0), l00.f16615h);
            default:
                return new nc0(new s70((Context) this.f21074b.zzb(), ((u40) this.f21075c).a(), this.f21076d.a(), ((z90) this.f21077e).a(), 1), l00.f16615h);
        }
    }

    public v70(fx1 fx1Var, u40 u40Var, t80 t80Var, z90 z90Var) {
        this.f21074b = fx1Var;
        this.f21075c = u40Var;
        this.f21076d = t80Var;
        this.f21077e = z90Var;
    }
}

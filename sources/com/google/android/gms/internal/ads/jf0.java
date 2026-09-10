package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jf0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zd0 f16084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f16085b;

    public jf0(zd0 zd0Var, fx1 fx1Var) {
        this.f16084a = zd0Var;
        this.f16085b = fx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        return new nc0(new sg0(this.f16084a.f22581b.a()), (Executor) this.f16085b.zzb());
    }
}

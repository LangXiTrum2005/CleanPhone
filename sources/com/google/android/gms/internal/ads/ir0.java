package com.google.android.gms.internal.ads;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ir0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx1 f15831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f15832b;

    public ir0(o40 o40Var, fx1 fx1Var) {
        this.f15831a = o40Var;
        this.f15832b = fx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jq0 zzb() {
        return new jq0(2, ((o40) this.f15831a).a(), (Intent) this.f15832b.zzb());
    }
}

package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qr0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx1 f19171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f19172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f19173c;

    public qr0(fx1 fx1Var, fx1 fx1Var2, o40 o40Var) {
        this.f19171a = fx1Var;
        this.f19172b = fx1Var2;
        this.f19173c = o40Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zp0 zzb() {
        return new zp0((ApplicationInfo) this.f19171a.zzb(), (PackageInfo) this.f19172b.zzb(), ((o40) this.f19173c).a(), 2);
    }
}

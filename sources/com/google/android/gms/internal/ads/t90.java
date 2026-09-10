package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t90 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx1 f20263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f20264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f20265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v50 f20266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f20267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fx1 f20268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kx1 f20269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fx1 f20270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bi0 f20271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z90 f20272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final fx1 f20273k;

    public t90(fx1 fx1Var, kx1 kx1Var, kx1 kx1Var2, v50 v50Var, kx1 kx1Var3, fx1 fx1Var2, kx1 kx1Var4, fx1 fx1Var3, bi0 bi0Var, z90 z90Var, fx1 fx1Var4) {
        this.f20263a = fx1Var;
        this.f20264b = kx1Var;
        this.f20265c = kx1Var2;
        this.f20266d = v50Var;
        this.f20267e = kx1Var3;
        this.f20268f = fx1Var2;
        this.f20269g = kx1Var4;
        this.f20270h = fx1Var3;
        this.f20271i = bi0Var;
        this.f20272j = z90Var;
        this.f20273k = fx1Var4;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s90 zzb() {
        yv0 yv0Var = (yv0) this.f20263a.zzb();
        VersionInfoParcel versionInfoParcelA = ((u40) this.f20264b).a();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f20265c.zzb();
        String packageName = ((o40) this.f20266d.f21035b).a().getPackageName();
        ic1.h(packageName);
        ul ulVar = am.f12058a;
        return new s90(yv0Var, versionInfoParcelA, applicationInfo, packageName, zzba.zzb().a(), (PackageInfo) this.f20267e.zzb(), fx1.b(this.f20268f), ((k40) this.f20269g).zzb(), (String) this.f20270h.zzb(), this.f20271i.a(), this.f20272j.a(), (xb0) this.f20273k.zzb());
    }
}

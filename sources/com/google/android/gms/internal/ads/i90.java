package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i90 implements mb0, vc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ou0 f15666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VersionInfoParcel f15667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzg f15668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yi0 f15669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kw0 f15670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lj0 f15671g;

    public i90(Context context, ou0 ou0Var, VersionInfoParcel versionInfoParcel, zzj zzjVar, yi0 yi0Var, kw0 kw0Var, lj0 lj0Var) {
        this.f15665a = context;
        this.f15666b = ou0Var;
        this.f15667c = versionInfoParcel;
        this.f15668d = zzjVar;
        this.f15669e = yi0Var;
        this.f15670f = kw0Var;
        this.f15671g = lj0Var;
    }

    public final void a() {
        if (((Boolean) zzba.zzc().a(am.f12081b5)).booleanValue()) {
            String str = this.f15666b.f18366g;
            c00 c00VarZzi = this.f15668d.zzi();
            zzt.zzl().zzb(this.f15665a, this.f15667c, str, c00VarZzi, this.f15670f, this.f15671g.f());
        }
        this.f15669e.a();
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void q0(mx mxVar) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.vc0
    public final void zzd(zzbc zzbcVar) {
        if (((Boolean) zzba.zzc().a(am.c5)).booleanValue()) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void z(ju0 ju0Var) {
    }

    @Override // com.google.android.gms.internal.ads.vc0
    public final void zze(String str) {
    }
}

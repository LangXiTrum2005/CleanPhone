package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xm0 implements gd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VersionInfoParcel f21929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m00 f21930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final du0 f21931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b30 f21932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ou0 f21933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rq f21934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zl0 f21936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yh0 f21937i;

    public xm0(VersionInfoParcel versionInfoParcel, m00 m00Var, du0 du0Var, b30 b30Var, ou0 ou0Var, boolean z10, rq rqVar, zl0 zl0Var, yh0 yh0Var) {
        this.f21929a = versionInfoParcel;
        this.f21930b = m00Var;
        this.f21931c = du0Var;
        this.f21932d = b30Var;
        this.f21933e = ou0Var;
        this.f21935g = z10;
        this.f21934f = rqVar;
        this.f21936h = zl0Var;
        this.f21937i = yh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    @Override // com.google.android.gms.internal.ads.gd0
    public final void c(boolean z10, Context context, ka0 ka0Var) {
        boolean z11;
        float f10;
        boolean z12;
        ou0 ou0Var = this.f21933e;
        rq rqVar = this.f21934f;
        j70 j70Var = (j70) zw1.H(this.f21930b);
        b30 b30Var = this.f21932d;
        b30Var.M(true);
        boolean z13 = this.f21935g;
        boolean zA = z13 ? rqVar.a(true) : true;
        boolean z14 = false;
        if (z13) {
            synchronized (rqVar) {
                z12 = rqVar.f19637b;
            }
            if (z12) {
                z14 = true;
                z11 = z14;
            } else {
                z11 = false;
                z14 = true;
            }
        } else {
            z11 = z14;
        }
        if (z14) {
            synchronized (rqVar) {
                f10 = rqVar.f19638c;
            }
        } else {
            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f11 = f10;
        du0 du0Var = this.f21931c;
        zzl zzlVar = new zzl(zA, true, z11, f11, -1, z10, du0Var.O, false);
        if (ka0Var != null) {
            ka0Var.X0();
        }
        zzt.zzb();
        dd0 dd0Var = (dd0) ((b50) j70Var).f12650p0.zzb();
        int i10 = du0Var.Q;
        if (i10 == -1) {
            zzx zzxVar = ou0Var.f18370k;
            if (zzxVar == null) {
                int i11 = zze.zza;
                zzo.zzd("Error setting app open orientation; no targeting orientation available.");
            } else {
                int i12 = zzxVar.zza;
                if (i12 == 1) {
                    i10 = 7;
                } else if (i12 == 2) {
                    i10 = 6;
                } else {
                    int i13 = zze.zza;
                    zzo.zzd("Error setting app open orientation; no targeting orientation available.");
                }
            }
        }
        VersionInfoParcel versionInfoParcel = this.f21929a;
        String str = du0Var.B;
        hu0 hu0Var = du0Var.f13708s;
        zzn.zza(context, new AdOverlayInfoParcel(null, dd0Var, null, b30Var, i10, versionInfoParcel, str, zzlVar, hu0Var.f15395b, hu0Var.f15394a, ou0Var.f18366g, ka0Var, du0Var.b() ? this.f21936h : null, b30Var.zzn()), true, this.f21937i);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final du0 zzb() {
        return this.f21931c;
    }
}

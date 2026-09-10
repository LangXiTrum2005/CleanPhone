package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hd0 implements ta0, zzr, na0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b30 f15258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final du0 f15259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f15260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jm0 f15261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public km0 f15262f;

    public hd0(Context context, b30 b30Var, du0 du0Var, VersionInfoParcel versionInfoParcel, jm0 jm0Var) {
        this.f15257a = context;
        this.f15258b = b30Var;
        this.f15259c = du0Var;
        this.f15260d = versionInfoParcel;
        this.f15261e = jm0Var;
    }

    public final boolean a() {
        oy0 oy0Var;
        if (!((Boolean) zzba.zzc().a(am.f12359t6)).booleanValue()) {
            return false;
        }
        jm0 jm0Var = this.f15261e;
        synchronized (jm0Var) {
            oy0Var = jm0Var.f16119f;
        }
        return oy0Var != null;
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final void k() {
        b30 b30Var;
        if (a()) {
            this.f15261e.c();
        } else {
            if (this.f15262f == null || (b30Var = this.f15258b) == null) {
                return;
            }
            if (((Boolean) zzba.zzc().a(am.f12403w6)).booleanValue()) {
                b30Var.e("onSdkImpression", new x.e(0));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i10) {
        this.f15262f = null;
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void zzg() {
        b30 b30Var;
        du0 du0Var = this.f15259c;
        if (du0Var.T && (b30Var = this.f15258b) != null && ((tc0) zzt.zzu()).d(this.f15257a)) {
            if (a()) {
                this.f15261e.b();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.f15260d;
            int i10 = versionInfoParcel.buddyApkVersion;
            int i11 = versionInfoParcel.clientJarVersion;
            int i12 = 1;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(i11).length());
            sb2.append(i10);
            sb2.append(".");
            sb2.append(i11);
            String string = sb2.toString();
            x11 x11Var = du0Var.V;
            String str = x11Var.Q() + (-1) != 1 ? "javascript" : null;
            int i13 = 2;
            if (x11Var.Q() == 1) {
                i12 = 3;
            } else {
                i13 = du0Var.Y == 2 ? 4 : 1;
            }
            km0 km0VarG = ((tc0) zzt.zzu()).g(i13, i12, b30Var.zzD(), string, str, du0Var.f13696l0);
            this.f15262f = km0VarG;
            if (km0VarG != null) {
                ky0 ky0Var = km0VarG.f16480a;
                if (((Boolean) zzba.zzc().a(am.f12343s6)).booleanValue()) {
                    ((tc0) zzt.zzu()).i(ky0Var, b30Var.zzD());
                    for (View view : b30Var.zzF()) {
                        ((tc0) zzt.zzu()).getClass();
                        tc0.o(new fm0(ky0Var, view, 0));
                    }
                } else {
                    ((tc0) zzt.zzu()).i(ky0Var, b30Var.zzE());
                }
                b30Var.a0(this.f15262f);
                ((tc0) zzt.zzu()).h(ky0Var);
                b30Var.e("onSdkLoaded", new x.e(0));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        b30 b30Var;
        if (((Boolean) zzba.zzc().a(am.f12403w6)).booleanValue() || (b30Var = this.f15258b) == null) {
            return;
        }
        if (this.f15262f != null || a()) {
            if (this.f15262f != null) {
                b30Var.e("onSdkImpression", new x.e(0));
            } else {
                this.f15261e.c();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }
}

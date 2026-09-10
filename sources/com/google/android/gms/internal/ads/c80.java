package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c80 implements ta0, na0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b30 f13087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final du0 f13088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f13089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public km0 f13090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jm0 f13092g;

    public c80(Context context, b30 b30Var, du0 du0Var, VersionInfoParcel versionInfoParcel, jm0 jm0Var) {
        this.f13086a = context;
        this.f13087b = b30Var;
        this.f13088c = du0Var;
        this.f13089d = versionInfoParcel;
        this.f13092g = jm0Var;
    }

    public final synchronized void a() {
        b30 b30Var;
        int i10;
        int i11;
        try {
            du0 du0Var = this.f13088c;
            if (du0Var.T && (b30Var = this.f13087b) != null) {
                if (((tc0) zzt.zzu()).d(this.f13086a)) {
                    VersionInfoParcel versionInfoParcel = this.f13089d;
                    int i12 = versionInfoParcel.buddyApkVersion;
                    int i13 = versionInfoParcel.clientJarVersion;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 1 + String.valueOf(i13).length());
                    sb2.append(i12);
                    sb2.append(".");
                    sb2.append(i13);
                    String string = sb2.toString();
                    x11 x11Var = du0Var.V;
                    String str = x11Var.Q() + (-1) != 1 ? "javascript" : null;
                    if (x11Var.Q() == 1) {
                        i10 = 2;
                        i11 = 3;
                    } else if (du0Var.f13683e == 1) {
                        i10 = 3;
                        i11 = 1;
                    } else {
                        i10 = 1;
                        i11 = 1;
                    }
                    km0 km0VarG = ((tc0) zzt.zzu()).g(i10, i11, b30Var.zzD(), string, str, du0Var.f13696l0);
                    this.f13090e = km0VarG;
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
                        b30Var.a0(this.f13090e);
                        ((tc0) zzt.zzu()).h(ky0Var);
                        this.f13091f = true;
                        b30Var.e("onSdkLoaded", new x.e(0));
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final synchronized void k() {
        boolean z10;
        b30 b30Var;
        if (((Boolean) zzba.zzc().a(am.f12359t6)).booleanValue()) {
            jm0 jm0Var = this.f13092g;
            synchronized (jm0Var) {
                z10 = jm0Var.f16119f != null;
            }
        }
        if (z10) {
            this.f13092g.c();
            return;
        }
        if (!this.f13091f) {
            a();
        }
        if (!this.f13088c.T || this.f13090e == null || (b30Var = this.f13087b) == null) {
            return;
        }
        b30Var.e("onSdkImpression", new x.e(0));
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final synchronized void zzg() {
        boolean z10;
        if (((Boolean) zzba.zzc().a(am.f12359t6)).booleanValue()) {
            jm0 jm0Var = this.f13092g;
            synchronized (jm0Var) {
                z10 = jm0Var.f16119f != null;
            }
        }
        if (z10) {
            this.f13092g.b();
        } else {
            if (this.f13091f) {
                return;
            }
            a();
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f16115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final du0 f16116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b30 f16117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yh0 f16118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public oy0 f16119f;

    public jm0(Context context, VersionInfoParcel versionInfoParcel, du0 du0Var, b30 b30Var, yh0 yh0Var) {
        this.f16114a = context;
        this.f16115b = versionInfoParcel;
        this.f16116c = du0Var;
        this.f16117d = b30Var;
        this.f16118e = yh0Var;
    }

    public final synchronized boolean a() {
        b30 b30Var;
        du0 du0Var = this.f16116c;
        boolean z10 = false;
        if (du0Var.T) {
            if (((Boolean) zzba.zzc().a(am.q6)).booleanValue()) {
                if (((Boolean) zzba.zzc().a(am.f12359t6)).booleanValue() && (b30Var = this.f16117d) != null) {
                    if (this.f16119f != null) {
                        int i10 = zze.zza;
                        zzo.zzi("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!((tc0) zzt.zzu()).d(this.f16114a)) {
                        int i11 = zze.zza;
                        zzo.zzi("Unable to initialize omid.");
                        return false;
                    }
                    x11 x11Var = du0Var.V;
                    x11Var.getClass();
                    if (((JSONObject) x11Var.f21703b).optBoolean((String) zzba.zzc().a(am.f12390v6), true)) {
                        VersionInfoParcel versionInfoParcel = this.f16115b;
                        im0 im0VarZzu = zzt.zzu();
                        WebView webViewZzD = b30Var.zzD();
                        ((tc0) im0VarZzu).getClass();
                        oy0 oy0Var = (oy0) tc0.n(new lj1(versionInfoParcel, z10, webViewZzD, 24));
                        if (((Boolean) zzba.zzc().a(am.u6)).booleanValue()) {
                            yh0 yh0Var = this.f16118e;
                            String str = oy0Var != null ? "1" : "0";
                            lj1 lj1VarA = yh0Var.a();
                            lj1VarA.l("omid_js_session_success", str);
                            lj1VarA.m();
                        }
                        if (oy0Var == null) {
                            int i12 = zze.zza;
                            zzo.zzi("Unable to create javascript session service.");
                            return false;
                        }
                        int i13 = zze.zza;
                        zzo.zzh("Created omid javascript session service.");
                        this.f16119f = oy0Var;
                        b30Var.T(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void b() {
        b30 b30Var;
        try {
            oy0 oy0Var = this.f16119f;
            if (oy0Var == null || (b30Var = this.f16117d) == null) {
                return;
            }
            for (View view : b30Var.zzF()) {
                ((tc0) zzt.zzu()).getClass();
                tc0.o(new gm0(1, oy0Var, view));
            }
            b30Var.e("onSdkLoaded", db1.f13484g);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        b30 b30Var;
        if (this.f16119f == null || (b30Var = this.f16117d) == null) {
            return;
        }
        b30Var.e("onSdkImpression", db1.f13484g);
    }

    public final synchronized void d(View view) {
        oy0 oy0Var = this.f16119f;
        if (oy0Var != null) {
            ((tc0) zzt.zzu()).getClass();
            tc0.o(new gm0(1, oy0Var, view));
        }
    }
}

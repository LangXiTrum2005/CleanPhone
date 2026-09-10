package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class eh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf f13969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sm f13970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f13971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zza f13972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pj f13973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jb0 f13974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zl0 f13975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pu0 f13976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yh0 f13977j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b40 f13978k;

    public eh0(Context context, qf qfVar, sm smVar, VersionInfoParcel versionInfoParcel, zza zzaVar, pj pjVar, jb0 jb0Var, zl0 zl0Var, pu0 pu0Var, yh0 yh0Var, b40 b40Var) {
        this.f13968a = context;
        this.f13969b = qfVar;
        this.f13970c = smVar;
        this.f13971d = versionInfoParcel;
        this.f13972e = zzaVar;
        this.f13973f = pjVar;
        this.f13974g = jb0Var;
        this.f13975h = zl0Var;
        this.f13976i = pu0Var;
        this.f13977j = yh0Var;
        this.f13978k = b40Var;
    }

    public final b30 a(zzr zzrVar, du0 du0Var, fu0 fu0Var) {
        b30 b30VarA = l30.a(this.f13968a, t0.a(zzrVar), zzrVar.zza, false, false, this.f13969b, this.f13970c, this.f13971d, new x11(this, 16), this.f13972e, this.f13973f, du0Var, fu0Var, this.f13975h, this.f13976i, this.f13977j);
        if (((Boolean) zzba.zzc().a(am.Lf)).booleanValue()) {
            WebView webViewZzD = b30VarA.zzD();
            if (this.f13978k.f12627a != null) {
                try {
                    WeakHashMap weakHashMap = r4.g.f49404a;
                    if (!s4.m.f50121g.a()) {
                        throw s4.m.a();
                    }
                    r4.g.b(webViewZzD).f50127a.setProfile("GMA_WEBVIEW_PROFILE");
                    zze.zza("WebViewCompat Profile is defined");
                    return b30VarA;
                } catch (IllegalStateException e10) {
                    String strConcat = "WebViewCompat error: ".concat(e10.toString());
                    int i10 = zze.zza;
                    zzo.zzi(strConcat);
                    if (((Boolean) zzba.zzc().a(am.Kf)).booleanValue()) {
                        zzt.zzh().d("WebViewCompat.setProfile", e10);
                    }
                }
            }
        }
        return b30VarA;
    }
}

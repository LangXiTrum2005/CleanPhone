package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kd0 implements da0, hc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz f16404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f16405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kz f16406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f16407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qj f16409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final du0 f16410g;

    public kd0(iz izVar, Context context, kz kzVar, WebView webView, qj qjVar, du0 du0Var) {
        this.f16404a = izVar;
        this.f16405b = context;
        this.f16406c = kzVar;
        this.f16407d = webView;
        this.f16409f = qjVar;
        this.f16410g = du0Var;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void J() {
        if (this.f16410g.G0) {
            this.f16404a.a(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Q() {
        if (this.f16410g.G0) {
            View view = this.f16407d;
            if (view != null && this.f16408e != null) {
                Context context = view.getContext();
                String str = this.f16408e;
                kz kzVar = this.f16406c;
                AtomicReference atomicReference = kzVar.f16573h;
                if (kzVar.a(context) && (context instanceof Activity) && kzVar.m(context, Constants.FID_CLASS, atomicReference, false)) {
                    ConcurrentHashMap concurrentHashMap = kzVar.f16574i;
                    Method declaredMethod = (Method) concurrentHashMap.get("setCurrentScreen");
                    if (declaredMethod == null) {
                        try {
                            declaredMethod = context.getClassLoader().loadClass(Constants.FID_CLASS).getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                            concurrentHashMap.put("setCurrentScreen", declaredMethod);
                        } catch (Exception unused) {
                            kzVar.l("setCurrentScreen", false);
                            declaredMethod = null;
                        }
                    }
                    try {
                        declaredMethod.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                    } catch (Exception unused2) {
                        kzVar.l("setCurrentScreen", false);
                    }
                }
            }
            this.f16404a.a(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void f(sx sxVar, String str, String str2) {
        kz kzVar = this.f16406c;
        Context context = this.f16405b;
        if (kzVar.a(context) && this.f16410g.G0) {
            try {
                kzVar.e(context, kzVar.d(context), this.f16404a.f15876c, sxVar.f20060b, sxVar.f20059a);
            } catch (RemoteException e10) {
                int i10 = zze.zza;
                zzo.zzj("Remote Exception to get reward item.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hc0
    public final void zzh() {
        qj qjVar = qj.APP_OPEN;
        qj qjVar2 = this.f16409f;
        if (qjVar2 != qjVar && this.f16410g.G0) {
            kz kzVar = this.f16406c;
            Context context = this.f16405b;
            String str = "";
            if (kzVar.a(context)) {
                AtomicReference atomicReference = kzVar.f16572g;
                if (kzVar.m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                    try {
                        String str2 = (String) kzVar.i(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                        if (str2 == null) {
                            str2 = (String) kzVar.i(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                        }
                        if (str2 != null) {
                            str = str2;
                        }
                    } catch (Exception unused) {
                        kzVar.l("getCurrentScreenName", false);
                    }
                }
            }
            this.f16408e = str;
            this.f16408e = String.valueOf(str).concat(qjVar2 == qj.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Z() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.hc0
    public final void zzg() {
    }
}

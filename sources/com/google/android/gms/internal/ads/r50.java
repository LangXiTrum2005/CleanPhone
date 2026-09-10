package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzfr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.ads.internal.util.zzat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r50 extends zzcx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f19391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nh0 f19392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pm0 f19393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yo0 f19394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yi0 f19395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kz f19396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ph0 f19397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lj0 f19398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final az0 f19399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kw0 f19400k;
    public final vu0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e90 f19401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yh0 f19402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ak0 f19403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f19404p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Long f19405q;

    public r50(Context context, VersionInfoParcel versionInfoParcel, nh0 nh0Var, pm0 pm0Var, yo0 yo0Var, yi0 yi0Var, kz kzVar, ph0 ph0Var, lj0 lj0Var, az0 az0Var, kw0 kw0Var, vu0 vu0Var, e90 e90Var, yh0 yh0Var, ak0 ak0Var) {
        this.f19390a = context;
        this.f19391b = versionInfoParcel;
        this.f19392c = nh0Var;
        this.f19393d = pm0Var;
        this.f19394e = yo0Var;
        this.f19395f = yi0Var;
        this.f19396g = kzVar;
        this.f19397h = ph0Var;
        this.f19398i = lj0Var;
        this.f19399j = az0Var;
        this.f19400k = kw0Var;
        this.l = vu0Var;
        this.f19401m = e90Var;
        this.f19402n = yh0Var;
        this.f19403o = ak0Var;
        ((p9.b) zzt.zzk()).getClass();
        this.f19405q = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zze() {
        if (this.f19404p) {
            int i10 = zze.zza;
            zzo.zzi("Mobile ads is initialized already.");
            return;
        }
        if (((Boolean) zzba.zzc().a(am.n3)).booleanValue()) {
            zzay.zzc();
        }
        Context context = this.f19390a;
        am.a(context);
        zzt.zzh().b(context, this.f19391b, this.f19402n);
        this.f19401m.a();
        zzt.zzj().a(context);
        final int i11 = 1;
        this.f19404p = true;
        this.f19395f.a();
        yo0 yo0Var = this.f19394e;
        yo0Var.getClass();
        final int i12 = 2;
        zzt.zzh().g().zzk(new xo0(yo0Var, 2));
        final int i13 = 0;
        yo0Var.f22336f.execute(new xo0(yo0Var, 0));
        if (((Boolean) zzba.zzc().a(am.f12114d5)).booleanValue()) {
            ph0 ph0Var = this.f19397h;
            if (!ph0Var.f18657f.getAndSet(true)) {
                zzt.zzh().g().zzk(new oh0(ph0Var, 0));
            }
            ph0Var.f18654c.execute(new oh0(ph0Var, 2));
        }
        this.f19398i.a();
        if (((Boolean) zzba.zzc().a(am.Ka)).booleanValue()) {
            final int i14 = 3;
            l00.f16608a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.p50

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r50 f18530b;

                {
                    this.f18530b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String strB;
                    switch (i14) {
                        case 0:
                            x10.g(this.f18530b.f19390a, true);
                            break;
                        case 1:
                            lm lmVarZzn = zzt.zzn();
                            r50 r50Var = this.f18530b;
                            Context context2 = r50Var.f19390a;
                            yh0 yh0Var = r50Var.f19402n;
                            if (!lmVarZzn.f17055b.getAndSet(true)) {
                                lmVarZzn.f17056c = context2;
                                lmVarZzn.f17057d = yh0Var;
                                if (lmVarZzn.f17059f == null && context2 != null && (strB = u.g.b(context2, null, false)) != null && !strB.equals(context2.getPackageName())) {
                                    u.g.a(context2, strB, lmVarZzn);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            r50 r50Var2 = this.f18530b;
                            r50Var2.getClass();
                            bx bxVar = new bx("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            az0 az0Var = r50Var2.f19399j;
                            az0Var.getClass();
                            try {
                                vn vnVar = (vn) zzs.zza(az0Var.f12553a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", s6.f19872q);
                                Parcel parcelQ = vnVar.q();
                                rh.e(parcelQ, bxVar);
                                vnVar.m0(parcelQ, 1);
                            } catch (RemoteException e10) {
                                zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                return;
                            } catch (zzr e11) {
                                zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                return;
                            }
                            break;
                        default:
                            if (zzt.zzh().g().zzJ()) {
                                String strZzL = zzt.zzh().g().zzL();
                                r50 r50Var3 = this.f18530b;
                                if (!zzt.zzo().zze(r50Var3.f19390a, strZzL, r50Var3.f19391b.afmaVersion)) {
                                    zzt.zzh().g().zzK(false);
                                    zzt.zzh().g().zzM("");
                                }
                            }
                            break;
                    }
                }
            });
        }
        if (((Boolean) zzba.zzc().a(am.Cc)).booleanValue()) {
            l00.f16608a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.p50

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r50 f18530b;

                {
                    this.f18530b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String strB;
                    switch (i12) {
                        case 0:
                            x10.g(this.f18530b.f19390a, true);
                            break;
                        case 1:
                            lm lmVarZzn = zzt.zzn();
                            r50 r50Var = this.f18530b;
                            Context context2 = r50Var.f19390a;
                            yh0 yh0Var = r50Var.f19402n;
                            if (!lmVarZzn.f17055b.getAndSet(true)) {
                                lmVarZzn.f17056c = context2;
                                lmVarZzn.f17057d = yh0Var;
                                if (lmVarZzn.f17059f == null && context2 != null && (strB = u.g.b(context2, null, false)) != null && !strB.equals(context2.getPackageName())) {
                                    u.g.a(context2, strB, lmVarZzn);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            r50 r50Var2 = this.f18530b;
                            r50Var2.getClass();
                            bx bxVar = new bx("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            az0 az0Var = r50Var2.f19399j;
                            az0Var.getClass();
                            try {
                                vn vnVar = (vn) zzs.zza(az0Var.f12553a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", s6.f19872q);
                                Parcel parcelQ = vnVar.q();
                                rh.e(parcelQ, bxVar);
                                vnVar.m0(parcelQ, 1);
                            } catch (RemoteException e10) {
                                zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                return;
                            } catch (zzr e11) {
                                zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                return;
                            }
                            break;
                        default:
                            if (zzt.zzh().g().zzJ()) {
                                String strZzL = zzt.zzh().g().zzL();
                                r50 r50Var3 = this.f18530b;
                                if (!zzt.zzo().zze(r50Var3.f19390a, strZzL, r50Var3.f19391b.afmaVersion)) {
                                    zzt.zzh().g().zzK(false);
                                    zzt.zzh().g().zzM("");
                                }
                            }
                            break;
                    }
                }
            });
        }
        if (((Boolean) zzba.zzc().a(am.f12063a4)).booleanValue()) {
            l00.f16608a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.p50

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r50 f18530b;

                {
                    this.f18530b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String strB;
                    switch (i13) {
                        case 0:
                            x10.g(this.f18530b.f19390a, true);
                            break;
                        case 1:
                            lm lmVarZzn = zzt.zzn();
                            r50 r50Var = this.f18530b;
                            Context context2 = r50Var.f19390a;
                            yh0 yh0Var = r50Var.f19402n;
                            if (!lmVarZzn.f17055b.getAndSet(true)) {
                                lmVarZzn.f17056c = context2;
                                lmVarZzn.f17057d = yh0Var;
                                if (lmVarZzn.f17059f == null && context2 != null && (strB = u.g.b(context2, null, false)) != null && !strB.equals(context2.getPackageName())) {
                                    u.g.a(context2, strB, lmVarZzn);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            r50 r50Var2 = this.f18530b;
                            r50Var2.getClass();
                            bx bxVar = new bx("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            az0 az0Var = r50Var2.f19399j;
                            az0Var.getClass();
                            try {
                                vn vnVar = (vn) zzs.zza(az0Var.f12553a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", s6.f19872q);
                                Parcel parcelQ = vnVar.q();
                                rh.e(parcelQ, bxVar);
                                vnVar.m0(parcelQ, 1);
                            } catch (RemoteException e10) {
                                zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                return;
                            } catch (zzr e11) {
                                zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                return;
                            }
                            break;
                        default:
                            if (zzt.zzh().g().zzJ()) {
                                String strZzL = zzt.zzh().g().zzL();
                                r50 r50Var3 = this.f18530b;
                                if (!zzt.zzo().zze(r50Var3.f19390a, strZzL, r50Var3.f19391b.afmaVersion)) {
                                    zzt.zzh().g().zzK(false);
                                    zzt.zzh().g().zzM("");
                                }
                            }
                            break;
                    }
                }
            });
        }
        if (((Boolean) zzba.zzc().a(am.I5)).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.J5)).booleanValue()) {
                l00.f16608a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.p50

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r50 f18530b;

                    {
                        this.f18530b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String strB;
                        switch (i11) {
                            case 0:
                                x10.g(this.f18530b.f19390a, true);
                                break;
                            case 1:
                                lm lmVarZzn = zzt.zzn();
                                r50 r50Var = this.f18530b;
                                Context context2 = r50Var.f19390a;
                                yh0 yh0Var = r50Var.f19402n;
                                if (!lmVarZzn.f17055b.getAndSet(true)) {
                                    lmVarZzn.f17056c = context2;
                                    lmVarZzn.f17057d = yh0Var;
                                    if (lmVarZzn.f17059f == null && context2 != null && (strB = u.g.b(context2, null, false)) != null && !strB.equals(context2.getPackageName())) {
                                        u.g.a(context2, strB, lmVarZzn);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                r50 r50Var2 = this.f18530b;
                                r50Var2.getClass();
                                bx bxVar = new bx("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                az0 az0Var = r50Var2.f19399j;
                                az0Var.getClass();
                                try {
                                    vn vnVar = (vn) zzs.zza(az0Var.f12553a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", s6.f19872q);
                                    Parcel parcelQ = vnVar.q();
                                    rh.e(parcelQ, bxVar);
                                    vnVar.m0(parcelQ, 1);
                                } catch (RemoteException e10) {
                                    zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                    return;
                                } catch (zzr e11) {
                                    zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                    return;
                                }
                                break;
                            default:
                                if (zzt.zzh().g().zzJ()) {
                                    String strZzL = zzt.zzh().g().zzL();
                                    r50 r50Var3 = this.f18530b;
                                    if (!zzt.zzo().zze(r50Var3.f19390a, strZzL, r50Var3.f19391b.afmaVersion)) {
                                        zzt.zzh().g().zzK(false);
                                        zzt.zzh().g().zzM("");
                                    }
                                }
                                break;
                        }
                    }
                });
            }
        }
        if (((Boolean) zzba.zzc().a(am.X5)).booleanValue()) {
            ak0 ak0Var = this.f19403o;
            k00 k00Var = l00.f16613f;
            Objects.requireNonNull(ak0Var);
            k00Var.execute(new d(ak0Var, 28));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzf(float f10) {
        zzt.zzi().zza(f10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzg(String str) {
        Context context = this.f19390a;
        am.a(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzba.zzc().a(am.f12081b5)).booleanValue()) {
                zzt.zzl().zza(context, this.f19391b, str, null, this.f19400k, null, null, this.f19398i.f());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzh(boolean z10) {
        zzt.zzi().zzc(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi(s9.a aVar, String str) {
        if (aVar == null) {
            int i10 = zze.zza;
            zzo.zzf("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) s9.b.y1(aVar);
        if (context == null) {
            int i11 = zze.zza;
            zzo.zzf("Context is null. Failed to open debug menu.");
        } else {
            zzat zzatVar = new zzat(context);
            zzatVar.zzc(str);
            zzatVar.zzd(this.f19391b.afmaVersion);
            zzatVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzj(String str, s9.a aVar) {
        String strZzr;
        q50 q50Var;
        Context context = this.f19390a;
        am.a(context);
        if (((Boolean) zzba.zzc().a(am.f12193i5)).booleanValue()) {
            try {
                zzt.zzc();
                strZzr = com.google.android.gms.ads.internal.util.zzs.zzr(context);
            } catch (RemoteException | RuntimeException e10) {
                zzt.zzh().d("NonagonMobileAdsSettingManager_AppId", e10);
                strZzr = "";
            }
        } else {
            strZzr = "";
        }
        boolean z10 = true;
        String str2 = true == TextUtils.isEmpty(strZzr) ? str : strZzr;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12081b5)).booleanValue();
        ul ulVar = am.I1;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) zzba.zzc().a(ulVar)).booleanValue();
        if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
            q50Var = new q50(this, (Runnable) s9.b.y1(aVar), 0);
        } else {
            q50Var = null;
            z10 = zBooleanValue2;
        }
        q50 q50Var2 = q50Var;
        if (z10) {
            zzt.zzl().zza(this.f19390a, this.f19391b, str2, q50Var2, this.f19400k, this.f19402n, this.f19405q, this.f19398i.f());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized float zzk() {
        return zzt.zzi().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized boolean zzl() {
        return zzt.zzi().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String zzm() {
        return this.f19391b.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(String str) {
        this.f19394e.b(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(st stVar) {
        this.l.o(stVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzp(yr yrVar) {
        yi0 yi0Var = this.f19395f;
        yi0Var.getClass();
        yi0Var.f22265e.addListener(new zd1(28, yi0Var, yrVar), yi0Var.f22270j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List zzq() {
        return this.f19395f.b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzr(zzfr zzfrVar) {
        kz kzVar = this.f19396g;
        Context context = this.f19390a;
        kzVar.getClass();
        ((ez) ((fx1) hz.f(context).f15435d).zzb()).a(-1, System.currentTimeMillis());
        if (((Boolean) zzba.zzc().a(am.h1)).booleanValue() && kzVar.a(context) && kz.g(context)) {
            synchronized (kzVar.f16575j) {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs() {
        this.f19395f.f22276q = false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(zzdk zzdkVar) {
        this.f19398i.e(zzdkVar, kj0.f16458b);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(boolean z10) throws RemoteException {
        try {
            x11.v(this.f19390a).O(z10);
        } catch (IOException e10) {
            throw new RemoteException(e10.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzv(String str) {
        if (((Boolean) zzba.zzc().a(am.Wa)).booleanValue()) {
            zzt.zzh().f14135g = str;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzw() {
        if (((Boolean) zzba.zzc().a(am.f12251m3)).booleanValue()) {
            at atVarZzr = zzt.zzr();
            synchronized (atVarZzr.f12505a) {
                try {
                    dt dtVar = atVarZzr.f12507c;
                    if (dtVar != null) {
                        ws wsVar = dtVar.f13671a;
                        vs vsVar = (vs) wsVar.f21601i;
                        if (vsVar != null) {
                            vsVar.v();
                            wsVar.f21601i = null;
                        }
                        atVarZzr.f12507c = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (((Boolean) zzba.zzc().a(am.n3)).booleanValue()) {
                zzay.zzd();
            }
        }
    }
}

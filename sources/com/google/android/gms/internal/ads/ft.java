package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.view.InputEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ft implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f14530e;

    public /* synthetic */ ft(int i10, Object obj, Object obj2, Object obj3, String str) {
        this.f14526a = i10;
        this.f14528c = obj;
        this.f14529d = obj2;
        this.f14527b = str;
        this.f14530e = obj3;
    }

    public ListenableFuture a(Object obj) {
        m00 m00Var = new m00();
        us usVarE = ((ws) this.f14530e).e();
        zze.zza("callJs > getEngine: Promise created");
        usVarE.q(new uw(this, usVarE, obj, m00Var, 4, false), new md0(this, m00Var, usVarE, 8));
        return m00Var;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final ListenableFuture zza(Object obj) {
        ListenableFuture listenableFutureL;
        be1 be1VarD;
        switch (this.f14526a) {
            case 0:
                return a(obj);
            case 1:
                m60 m60Var = (m60) this.f14528c;
                Uri.Builder builder = (Uri.Builder) this.f14529d;
                String str = (String) this.f14527b;
                InputEvent inputEvent = (InputEvent) this.f14530e;
                if (((Integer) obj).intValue() != 1) {
                    builder.appendQueryParameter((String) zzba.zzc().a(am.Qb), "10");
                    return zw1.d(builder.toString());
                }
                Uri.Builder builderBuildUpon = builder.build().buildUpon();
                builderBuildUpon.appendQueryParameter((String) zzba.zzc().a(am.Rb), "1");
                builderBuildUpon.appendQueryParameter((String) zzba.zzc().a(am.Qb), "12");
                if (str.contains((CharSequence) zzba.zzc().a(am.Sb))) {
                    builderBuildUpon.authority((String) zzba.zzc().a(am.Tb));
                }
                lm0 lm0Var = m60Var.f17307c;
                Uri uriBuild = builderBuildUpon.build();
                lm0Var.getClass();
                try {
                    b4.d dVar = lm0Var.f17060a;
                    Objects.requireNonNull(dVar);
                    listenableFutureL = dVar.d(uriBuild, inputEvent);
                    break;
                } catch (Exception e10) {
                    listenableFutureL = zw1.l(e10);
                }
                return zw1.x(vd1.r(listenableFutureL), new rr(builder, 2), m60Var.f17310f);
            case 2:
                tf0 tf0Var = (tf0) this.f14528c;
                String str2 = (String) this.f14527b;
                bz bzVar = (bz) this.f14529d;
                zzb zzbVar = (zzb) this.f14530e;
                tf0Var.getClass();
                zzt.zzd();
                b30 b30VarA = l30.a(tf0Var.f20344a, new t0(0, 0, 0), "native-omid", false, false, tf0Var.f20346c, null, tf0Var.f20347d, null, tf0Var.f20348e, tf0Var.f20349f, null, null, tf0Var.f20358p, tf0Var.f20359q, tf0Var.f20355m);
                kj kjVar = new kj(b30VarA);
                b30VarA.zzP().f14700g = new so0(kjVar, 22);
                b30VarA.loadData(Base64.encodeToString(str2.getBytes(), 1), "text/html", "base64");
                if (((Boolean) zzba.zzc().a(am.f12352sf)).booleanValue()) {
                    if (bzVar != null) {
                        b30VarA.zzP().f14717y = bzVar;
                    }
                    b30VarA.zzP().f14715w = zzbVar;
                }
                return kjVar;
            case 3:
                vu0 vu0Var = (vu0) this.f14528c;
                return zw1.x(((al0) this.f14529d).a((mx) this.f14530e), (od1) this.f14527b, (fe1) vu0Var.f21274b);
            case 4:
                fo0 fo0Var = (fo0) this.f14528c;
                du0 du0Var = (du0) this.f14529d;
                ju0 ju0Var = (ju0) this.f14530e;
                nm0 nm0Var = (nm0) this.f14527b;
                fw0 fw0VarF = fw0.f(fo0Var.f14489j, 12);
                fw0VarF.zzi(du0Var.E);
                fw0VarF.zza();
                ListenableFuture listenableFutureV = zw1.v(nm0Var.a(ju0Var, du0Var), du0Var.R, TimeUnit.MILLISECONDS, fo0Var.f14485f);
                fo0Var.f14487h.b(ju0Var, du0Var, listenableFutureV, fo0Var.f14482c);
                ps1.a0(listenableFutureV, fo0Var.f14490k, fw0VarF, false);
                return listenableFutureV;
            case 5:
                ty0 ty0Var = (ty0) this.f14528c;
                at0 at0Var = (at0) this.f14529d;
                vu0 vu0Var2 = (vu0) this.f14530e;
                bt0 bt0Var = (bt0) this.f14527b;
                fv0 fv0Var = (fv0) obj;
                synchronized (ty0Var) {
                    try {
                        ty0Var.f20529b = true;
                        fv0Var.f14567a = (u90) ((x11) at0Var.f12510b).f21703b;
                        if (ty0Var.f20528a) {
                            be1VarD = zw1.d(new lv0(fv0Var, bt0Var));
                        } else {
                            vu0Var2.m(bt0Var.f12887g, fv0Var);
                            be1VarD = be1.f12743b;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return be1VarD;
            case 6:
                return ((m31) ((f21) this.f14528c).f14180b.f18916f.get()).b((Context) this.f14529d, (View) this.f14530e, (Activity) this.f14527b);
            default:
                return ((m31) ((f21) this.f14528c).f14180b.f18916f.get()).c((Context) this.f14529d, (String) this.f14527b, (View) this.f14530e);
        }
    }

    public ft(ws wsVar, String str, ct ctVar, bt btVar) {
        this.f14526a = 0;
        this.f14530e = wsVar;
        this.f14527b = str;
        this.f14529d = ctVar;
        this.f14528c = btVar;
    }

    public /* synthetic */ ft(tf0 tf0Var, String str, zy zyVar, zzb zzbVar) {
        this.f14526a = 2;
        this.f14528c = tf0Var;
        this.f14527b = str;
        this.f14529d = zyVar;
        this.f14530e = zzbVar;
    }

    public /* synthetic */ ft(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f14526a = i10;
        this.f14528c = obj;
        this.f14529d = obj2;
        this.f14530e = obj3;
        this.f14527b = obj4;
    }
}

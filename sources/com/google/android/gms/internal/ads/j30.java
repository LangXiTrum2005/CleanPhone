package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.LinkedHashMap;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j30 implements nd1, com.google.android.gms.internal.consent_sdk.k7, ye.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f15951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f15952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f15953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f15954h;

    public /* synthetic */ j30(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.f15947a = obj;
        this.f15948b = obj2;
        this.f15949c = obj3;
        this.f15950d = obj4;
        this.f15951e = obj5;
        this.f15952f = obj6;
        this.f15953g = obj7;
        this.f15954h = obj8;
    }

    public long a() {
        wf.i iVar = (wf.i) this.f15952f;
        wf.e eVar = (wf.e) ((zc.u) this.f15949c).f54882e;
        return Math.min(eVar.k(vf.c.VIDEO) ? ((Number) iVar.h()).longValue() : Long.MAX_VALUE, eVar.k(vf.c.AUDIO) ? ((Number) iVar.b()).longValue() : Long.MAX_VALUE);
    }

    public wf.h b(vf.c cVar, int i10) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f15954h;
        wj.f fVar = new wj.f(cVar, Integer.valueOf(i10));
        Object hVar = linkedHashMap.get(fVar);
        if (hVar == null) {
            hVar = new wf.h(new ec.a(cVar.f52580a + "Interpolator" + i10 + "/" + ((wf.f) this.f15948b).l(cVar).size()), (mg.a) this.f15947a, i10 == 0 ? null : b(cVar, i10 - 1));
            linkedHashMap.put(fVar, hVar);
        }
        return (wf.h) hVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l7
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.consent_sdk.n7 zzb() {
        Application application = (Application) ((com.google.android.gms.internal.consent_sdk.g6) this.f15947a).f23023b;
        Handler handler = com.google.android.gms.internal.consent_sdk.h0.f23034a;
        com.google.android.gms.internal.consent_sdk.j0.c(handler);
        com.google.android.gms.internal.consent_sdk.g0 g0Var = com.google.android.gms.internal.consent_sdk.h0.f23035b;
        com.google.android.gms.internal.consent_sdk.j0.c(g0Var);
        return new com.google.android.gms.internal.consent_sdk.n7(application, handler, g0Var, (com.google.android.gms.internal.consent_sdk.h) ((com.google.android.gms.internal.consent_sdk.j7) this.f15949c).zzb(), (com.google.android.gms.internal.consent_sdk.q) ((com.google.android.gms.internal.consent_sdk.j7) this.f15950d).zzb(), ((com.google.android.gms.internal.consent_sdk.j4) this.f15951e).a(), ((k5.g) this.f15952f).zzb(), (com.google.android.gms.internal.consent_sdk.t0) ((com.google.android.gms.internal.consent_sdk.j7) this.f15953g).zzb(), (com.google.android.gms.internal.consent_sdk.c0) ((com.google.android.gms.internal.consent_sdk.j7) this.f15954h).zzb());
    }

    @Override // ye.g
    public void f(BiometricPrompt.AuthenticationResult authenticationResult) {
        zc.u uVar = (zc.u) this.f15953g;
        v6.c cVar = (v6.c) this.f15951e;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f15949c;
        ye.d dVar = (ye.d) this.f15954h;
        try {
            Log.d("FlutterSecureStorage", "Step 3/7: Initializing current biometric cipher...");
            com.google.android.gms.internal.measurement.nf nfVar = dVar.f54376e;
            Context context = dVar.f54373b;
            ze.e eVarI = nfVar.i(context, (Cipher) this.f15947a);
            Log.d("FlutterSecureStorage", "Step 4/7: Encrypting all data with current biometric cipher...");
            ye.d.e((HashMap) this.f15948b, sharedPreferences, eVarI);
            Log.d("FlutterSecureStorage", "Step 5/7: Deleting backup after successful re-encryption...");
            no.b.p(sharedPreferences, (SharedPreferences) this.f15950d, cVar, dVar.f54372a.f54379c);
            Log.d("FlutterSecureStorage", "Step 6/7: Updating algorithm markers to current...");
            dVar.z(cVar);
            Log.d("FlutterSecureStorage", "Step 7/7: Deleting old RSA key from Android KeyStore...");
            if (dVar.f54376e.b()) {
                try {
                    dVar.f54376e.m(context).c();
                    ((ze.e) this.f15952f).d(context);
                    Log.d("FlutterSecureStorage", "Old key deleted from KeyStore");
                } catch (Exception e10) {
                    Log.w("FlutterSecureStorage", "Failed to delete old key from KeyStore (may not exist)", e10);
                }
            }
            dVar.f54375d = eVarI;
            Log.i("FlutterSecureStorage", "Non-biometric→Biometric migration WITH BACKUP completed! Data now requires biometric authentication.");
            uVar.f(null);
        } catch (Exception e11) {
            Log.e("FlutterSecureStorage", "Failed to complete migration after authentication", e11);
            uVar.h(e11);
        }
    }

    @Override // ye.g
    public void h(Exception exc) {
        Log.e("FlutterSecureStorage", "Biometric authentication failed for migration", exc);
        ((zc.u) this.f15953g).h(new Exception("Migration cancelled: Biometric authentication failed", exc));
    }

    @Override // com.google.android.gms.internal.ads.nd1
    /* JADX INFO: renamed from: zza */
    public ListenableFuture mo162zza() {
        zzt.zzd();
        Context context = (Context) this.f15947a;
        t0 t0Var = new t0(0, 0, 0);
        zza zzaVar = (zza) this.f15950d;
        pj pjVar = new pj();
        zl0 zl0Var = (zl0) this.f15951e;
        pu0 pu0Var = (pu0) this.f15952f;
        yh0 yh0Var = (yh0) this.f15953g;
        b30 b30VarA = l30.a(context, t0Var, "", false, false, (qf) this.f15948b, null, (VersionInfoParcel) this.f15949c, null, zzaVar, pjVar, null, null, zl0Var, pu0Var, yh0Var);
        kj kjVar = new kj(b30VarA);
        b30VarA.zzP().f14700g = new i30(kjVar, 0);
        b30VarA.loadUrl((String) this.f15954h);
        return kjVar;
    }

    public /* synthetic */ j30(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, boolean z10) {
        this.f15954h = obj;
        this.f15947a = obj2;
        this.f15948b = obj3;
        this.f15949c = obj4;
        this.f15950d = obj5;
        this.f15951e = obj6;
        this.f15952f = obj7;
        this.f15953g = obj8;
    }

    public j30(mg.a interpolator, wf.f fVar, zc.u uVar, wf.e current) {
        kotlin.jvm.internal.n.f(interpolator, "interpolator");
        kotlin.jvm.internal.n.f(current, "current");
        this.f15947a = interpolator;
        this.f15948b = fVar;
        this.f15949c = uVar;
        this.f15950d = current;
        this.f15951e = new wf.i(this, 1);
        this.f15952f = new wf.i(this, 0);
        this.f15953g = new wf.i(this, 2);
        this.f15954h = new LinkedHashMap();
    }
}

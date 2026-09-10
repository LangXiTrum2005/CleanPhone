package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu0 f17826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mh0 f17827b;

    public nh0(vu0 vu0Var, mh0 mh0Var) {
        this.f17826a = vu0Var;
        this.f17827b = mh0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.st] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.google.android.gms.internal.ads.ut] */
    /* JADX WARN: Type inference failed for: r5v17, types: [com.google.android.gms.internal.ads.ju] */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.google.android.gms.internal.ads.ut] */
    /* JADX WARN: Type inference failed for: r5v19, types: [com.google.android.gms.internal.ads.ju] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.st] */
    public final wu0 a(String str, JSONObject jSONObject) {
        ?? B;
        ?? r10;
        mh0 mh0Var = this.f17827b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                B = new ju(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                B = new ju(new zzbyb());
            } else {
                B = (st) ((AtomicReference) this.f17826a.f21276d).get();
                if (B == 0) {
                    int i10 = zze.zza;
                    zzo.zzi("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        r10 = B;
                        String string = jSONObject.getString("class_name");
                        if (B.zzc(string)) {
                            B = B.b("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            B = B.f(string) ? B.b(string) : B.b("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e10) {
                        int i11 = zze.zza;
                        zzo.zzg("Invalid custom event.", e10);
                        r10 = B;
                        r10 = B;
                        B = r10.b(str);
                    }
                } else {
                    r10 = B;
                    B = r10.b(str);
                }
            }
            wu0 wu0Var = new wu0(B);
            mh0Var.a(str, wu0Var);
            return wu0Var;
        } catch (Throwable th2) {
            if (((Boolean) zzba.zzc().a(am.Sa)).booleanValue()) {
                mh0Var.a(str, null);
            }
            throw new qu0(th2);
        }
    }

    public final av b(String str) throws RemoteException {
        st stVar = (st) ((AtomicReference) this.f17826a.f21276d).get();
        if (stVar == null) {
            int i10 = zze.zza;
            zzo.zzi("Unexpected call to adapter creator.");
            throw new RemoteException();
        }
        av avVarZze = stVar.zze(str);
        mh0 mh0Var = this.f17827b;
        synchronized (mh0Var) {
            if (mh0Var.f17445a.containsKey(str)) {
                return avVarZze;
            }
            try {
                mh0Var.f17445a.put(str, new lh0(str, avVarZze.zzf(), avVarZze.zzg(), true));
                return avVarZze;
            } catch (Throwable unused) {
                return avVarZze;
            }
        }
    }
}

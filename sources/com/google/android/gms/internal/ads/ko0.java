package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ko0 implements pm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nh0 f16487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16488c;

    public ko0(vo0 vo0Var, nh0 nh0Var) {
        this.f16486a = 1;
        this.f16488c = vo0Var;
        this.f16487b = nh0Var;
    }

    @Override // com.google.android.gms.internal.ads.pm0
    public final qm0 a(String str, JSONObject jSONObject) {
        qm0 qm0Var;
        av avVarB;
        switch (this.f16486a) {
            case 0:
                synchronized (this) {
                    try {
                        HashMap map = (HashMap) this.f16488c;
                        qm0Var = (qm0) map.get(str);
                        if (qm0Var == null) {
                            qm0Var = new qm0(this.f16487b.a(str, jSONObject), new kn0(), str);
                            map.put(str, qm0Var);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return qm0Var;
            default:
                if (((Boolean) zzba.zzc().a(am.f12371u2)).booleanValue()) {
                    try {
                        avVarB = this.f16487b.b(str);
                    } catch (RemoteException e10) {
                        int i10 = zze.zza;
                        zzo.zzg("Coundn't create RTB adapter: ", e10);
                    }
                    break;
                } else {
                    ConcurrentHashMap concurrentHashMap = ((vo0) this.f16488c).f21220a;
                    avVarB = concurrentHashMap.containsKey(str) ? (av) concurrentHashMap.get(str) : null;
                }
                if (avVarB == null) {
                    return null;
                }
                return new qm0(avVarB, new jn0(), str);
        }
    }

    public ko0(nh0 nh0Var) {
        this.f16486a = 0;
        this.f16488c = new HashMap();
        this.f16487b = nh0Var;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gy0 f20062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo0 f20063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f20064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile ConnectivityManager f20065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f20066f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p9.a f20067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AtomicInteger f20068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qx0 f20069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzg f20070j;

    public sx0(gy0 gy0Var, uo0 uo0Var, Context context, p9.a aVar, qx0 qx0Var, zzj zzjVar) {
        HashMap map = new HashMap();
        this.f20061a = map;
        map.put(AdFormat.APP_OPEN_AD, new HashMap());
        map.put(AdFormat.INTERSTITIAL, new HashMap());
        map.put(AdFormat.REWARDED, new HashMap());
        this.f20062b = gy0Var;
        this.f20063c = uo0Var;
        this.f20064d = context;
        this.f20067g = aVar;
        this.f20069i = qx0Var;
        this.f20070j = zzjVar;
    }

    public final void a(boolean z10) {
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f20061a;
        synchronized (map) {
            try {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    arrayList.addAll(((Map) it.next()).values());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ux0 ux0Var = (ux0) arrayList.get(i10);
            if (z10) {
                ux0Var.n();
            } else {
                ux0Var.f20928g.set(false);
            }
        }
    }

    public final Object b(AdFormat adFormat, Class cls, String str) {
        uo0 uo0Var = this.f20063c;
        ((p9.b) this.f20067g).getClass();
        uo0Var.r("poll_ad", "ppacwe_ts", System.currentTimeMillis(), -1, -1, null, null, "2");
        HashMap map = this.f20061a;
        synchronized (map) {
            try {
                if (!map.containsKey(adFormat)) {
                    return null;
                }
                ux0 ux0Var = (ux0) ((Map) map.get(adFormat)).get(str);
                if (ux0Var != null && adFormat.equals(ux0Var.q())) {
                    ay0 ay0Var = new ay0(ux0Var.r(), ux0Var.q());
                    ay0Var.f12538c = str;
                    by0 by0Var = new by0(ay0Var);
                    uo0Var.r("poll_ad", "ppac_ts", System.currentTimeMillis(), ux0Var.s(), ux0Var.t(), null, by0Var, "2");
                    try {
                        String strO = ux0Var.o();
                        Object objM = ux0Var.m();
                        Object objCast = objM == null ? null : cls.cast(objM);
                        if (objCast == null) {
                            return objCast;
                        }
                        uo0Var.o(System.currentTimeMillis(), ux0Var.s(), ux0Var.t(), strO, by0Var, "2");
                        return objCast;
                    } catch (ClassCastException e10) {
                        zzt.zzh().d("PreloadAdManager.pollAd", e10);
                        zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e10);
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(AdFormat adFormat) {
        int iMax;
        HashMap map = this.f20061a;
        int size = map.containsKey(adFormat) ? ((Map) map.get(adFormat)).size() : 0;
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            iMax = Math.max(((Integer) zzba.zzc().a(am.B5)).intValue(), 1);
        } else if (iOrdinal == 2) {
            iMax = Math.max(((Integer) zzba.zzc().a(am.C5)).intValue(), 1);
        } else if (iOrdinal != 5) {
            iMax = 0;
        } else {
            iMax = Math.max(((Integer) zzba.zzc().a(am.D5)).intValue(), 1);
        }
        return size < iMax;
    }
}

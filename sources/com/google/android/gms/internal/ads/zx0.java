package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zx0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gy0 f22744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uo0 f22745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f22746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile ConnectivityManager f22747f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p9.a f22749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AtomicInteger f22750i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f22748g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f22742a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f22743b = new ConcurrentHashMap();

    public zx0(gy0 gy0Var, uo0 uo0Var, Context context, p9.a aVar) {
        this.f22744c = gy0Var;
        this.f22745d = uo0Var;
        this.f22746e = context;
        this.f22749h = aVar;
    }

    public static String a(String str, AdFormat adFormat) {
        String strName = adFormat == null ? "NULL" : adFormat.name();
        return q4.a.j(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length()), str, "#", strName);
    }

    public final void b(boolean z10) {
        synchronized (this) {
            if (((Boolean) zzba.zzc().a(am.C)).booleanValue()) {
                c(z10);
            }
        }
    }

    public final synchronized void c(boolean z10) {
        try {
            if (z10) {
                Iterator it = this.f22742a.values().iterator();
                while (it.hasNext()) {
                    ((ux0) it.next()).n();
                }
            } else {
                Iterator it2 = this.f22742a.values().iterator();
                while (it2.hasNext()) {
                    ((ux0) it2.next()).f20928g.set(false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010c A[Catch: all -> 0x004e, TryCatch #1 {all -> 0x004e, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x0042, B:13:0x0051, B:14:0x0057, B:16:0x005f, B:18:0x0073, B:19:0x0082, B:20:0x0086, B:21:0x008a, B:22:0x0094, B:24:0x009a, B:26:0x00ac, B:27:0x00c1, B:28:0x00cb, B:30:0x00d1, B:32:0x00fa, B:38:0x0113, B:40:0x0119, B:34:0x010c, B:35:0x010e, B:44:0x011f, B:36:0x010f, B:37:0x0112), top: B:51:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized ArrayList d(List list) {
        ArrayList arrayList;
        Queue queue;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzfp zzfpVar = (zzfp) it.next();
                String strA = a(zzfpVar.zza, AdFormat.getAdFormat(zzfpVar.zzb));
                hashSet.add(strA);
                ConcurrentHashMap concurrentHashMap = this.f22742a;
                ux0 ux0Var = (ux0) concurrentHashMap.get(strA);
                if (ux0Var == null) {
                    ConcurrentHashMap concurrentHashMap2 = this.f22743b;
                    if (concurrentHashMap2.containsKey(strA)) {
                        ux0 ux0Var2 = (ux0) concurrentHashMap2.get(strA);
                        if (((zzfp) ux0Var2.f20926e.get()).equals(zzfpVar)) {
                            ux0Var2.a(zzfpVar.zzd);
                            ux0Var2.n();
                            concurrentHashMap.put(strA, ux0Var2);
                            concurrentHashMap2.remove(strA);
                        } else {
                            arrayList.add(zzfpVar);
                        }
                    } else {
                        arrayList.add(zzfpVar);
                    }
                } else if (((zzfp) ux0Var.f20926e.get()).equals(zzfpVar)) {
                    ux0Var.a(zzfpVar.zzd);
                } else {
                    this.f22743b.put(strA, ux0Var);
                    concurrentHashMap.remove(strA);
                    arrayList.add(zzfpVar);
                }
            }
            Iterator it2 = this.f22742a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.f22743b.put((String) entry.getKey(), (ux0) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.f22743b.entrySet().iterator();
            while (it3.hasNext()) {
                ux0 ux0Var3 = (ux0) ((Map.Entry) it3.next()).getValue();
                ux0Var3.f20928g.set(false);
                ux0Var3.f20936p.set(false);
                if (((Boolean) zzba.zzc().a(am.E)).booleanValue()) {
                    queue = ux0Var3.f20931j;
                    synchronized (queue) {
                        queue.clear();
                    }
                } else {
                    if (((Boolean) zzba.zzc().a(am.F)).booleanValue()) {
                        queue = ux0Var3.f20931j;
                        synchronized (queue) {
                            queue.clear();
                        }
                    }
                }
                if (!ux0Var3.l()) {
                    it3.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized boolean e(String str, AdFormat adFormat) {
        boolean z10;
        try {
            ((p9.b) this.f22749h).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            ux0 ux0VarG = g(str, adFormat);
            z10 = ux0VarG != null && ux0VarG.l();
            Long lValueOf = z10 ? Long.valueOf(System.currentTimeMillis()) : null;
            by0 by0Var = new by0(new ay0(str, adFormat));
            int iT = 0;
            uo0 uo0Var = this.f22745d;
            int iS = ux0VarG == null ? 0 : ux0VarG.s();
            if (ux0VarG != null) {
                iT = ux0VarG.t();
            }
            uo0Var.n(iS, iT, jCurrentTimeMillis, lValueOf, ux0VarG != null ? ux0VarG.o() : null, by0Var, "1");
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    public final synchronized Object f(AdFormat adFormat, Class cls, String str) {
        by0 by0Var = new by0(new ay0(str, adFormat));
        uo0 uo0Var = this.f22745d;
        ((p9.b) this.f22749h).getClass();
        uo0Var.r("poll_ad", "ppac_ts", System.currentTimeMillis(), -1, -1, null, by0Var, "1");
        ux0 ux0VarG = g(str, adFormat);
        if (ux0VarG == null) {
            return null;
        }
        try {
            String strO = ux0VarG.o();
            Object objM = ux0VarG.m();
            Object objCast = objM == null ? null : cls.cast(objM);
            if (objCast != null) {
                uo0Var.o(System.currentTimeMillis(), ux0VarG.s(), ux0VarG.t(), strO, by0Var, "1");
            }
            return objCast;
        } catch (ClassCastException e10) {
            zzt.zzh().d("PreloadAdManager.pollAd", e10);
            zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e10);
            return null;
        }
    }

    public final synchronized ux0 g(String str, AdFormat adFormat) {
        return (ux0) this.f22742a.get(a(str, adFormat));
    }
}

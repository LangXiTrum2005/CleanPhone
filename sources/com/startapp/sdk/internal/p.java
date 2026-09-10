package com.startapp.sdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.cache.ACMConfig;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41335c;
    public boolean d;
    public m f;
    public final Context g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lb f41337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lb f41338i;
    public final lb j;
    public final lb k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lb f41339l;
    public final lb m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lb f41340n;
    public final lb o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lb f41341p;
    public final lb q;
    public final lb r;
    public final lb s;
    public final lb t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f41333a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f41334b = new WeakHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue f41336e = new ConcurrentLinkedQueue();

    public p(Context context, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9, lb lbVar10, lb lbVar11, lb lbVar12, lb lbVar13) {
        this.g = context;
        this.f41338i = lbVar;
        this.j = lbVar2;
        this.f41337h = lbVar3;
        this.k = lbVar4;
        this.f41339l = lbVar5;
        this.m = lbVar6;
        this.f41340n = lbVar7;
        this.o = lbVar8;
        this.f41341p = lbVar9;
        this.q = lbVar10;
        this.r = lbVar11;
        this.s = lbVar12;
        this.t = lbVar13;
    }

    public final /* synthetic */ p a() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final com.startapp.sdk.adsbase.f b(CacheKey cacheKey) {
        x2 x2Var;
        ?? r8;
        if (cacheKey == null || (x2Var = (x2) this.f41333a.get(cacheKey)) == null || (r8 = x2Var.o) == 0 || !r8.isReady()) {
            return null;
        }
        ?? r9 = x2Var.o;
        x2Var.f41663w = 0;
        x2Var.y = null;
        if (!i0.f.booleanValue() && x2Var.x && CacheMetaData.d() && MetaData.E().f0()) {
            x2Var.a(null, null, true, true, null);
            return r9;
        }
        if (!x2Var.x) {
            m mVar = x2Var.f41664z;
            if (mVar != null) {
                mVar.a(x2Var);
            }
            r2 r2Var = x2Var.t;
            if (r2Var != null) {
                r2Var.e();
            }
        }
        return r9;
    }

    public final void a(AdPreferences.Placement placement) {
        try {
            String str = "90db0b5573c3d1f6_" + q0.a(this.g) + '_' + placement.getIndex();
            ((SharedPreferences) this.f41338i.a()).edit().putLong(str, Math.max(((SharedPreferences) this.f41338i.a()).getLong(str, 0L), 0L) + 1).apply();
            ACMConfig aCMConfigA = CacheMetaData.b().a();
            ComponentInfoEventConfig componentInfoEventConfigD = aCMConfigA != null ? aCMConfigA.d() : null;
            if (componentInfoEventConfigD == null || !componentInfoEventConfigD.a(1)) {
                return;
            }
            g9 g9Var = new g9(h9.f41040e);
            g9Var.d = "ACM.opf";
            g9Var.f41002e = String.valueOf(placement.getIndex());
            g9Var.a();
        } catch (Throwable th) {
            g9.a(th);
        }
    }

    public final CacheKey a(StartAppAd startAppAd, StartAppAd.AdMode adMode, AdPreferences adPreferences, com.startapp.sdk.adsbase.k kVar, String str) {
        AdPreferences.Placement placement;
        String str2;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        AdPreferences adPreferences2 = adPreferences;
        switch (n.f41260a[adMode.ordinal()]) {
            case 1:
                WeakHashMap weakHashMap = vi.f41589a;
                placement = AdPreferences.Placement.INAPP_OFFER_WALL;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                placement = AdPreferences.Placement.INAPP_OVERLAY;
                break;
            case 6:
                WeakHashMap weakHashMap2 = vi.f41589a;
                if (new Random().nextInt(100) < AdsCommonMetaData.k().i()) {
                    if ((new Random().nextInt(100) < AdsCommonMetaData.k().j() || adPreferences2.isForceFullpage()) && !adPreferences2.isForceOverlay()) {
                        placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                    } else {
                        placement = AdPreferences.Placement.INAPP_OVERLAY;
                    }
                } else {
                    placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                }
                break;
            default:
                placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                break;
        }
        AdPreferences.Placement placement2 = placement;
        try {
            long jMax = Math.max(((SharedPreferences) this.f41338i.a()).getLong("90db0b5573c3d1f6_" + q0.a(this.g) + '_' + placement2.getIndex(), 0L), 0L);
            ACMConfig aCMConfigA = CacheMetaData.b().a();
            Map mapF = aCMConfigA != null ? aCMConfigA.f() : null;
            Integer num = mapF != null ? (Integer) mapF.get(Integer.valueOf(placement2.getIndex())) : null;
            int iIntValue = num != null ? num.intValue() : 0;
            str2 = (iIntValue <= 0 || jMax < ((long) iIntValue)) ? null : "Failures threshold reached";
        } catch (Throwable th) {
            g9.a(th);
        }
        if (str2 != null) {
            if (startAppAd != null) {
                startAppAd.setErrorMessage(str2);
            }
            a0.a(this.g, kVar, startAppAd, false);
            return null;
        }
        if (adMode.equals(StartAppAd.AdMode.REWARDED_VIDEO)) {
            adPreferences2.setType(Ad.AdType.REWARDED_VIDEO);
        } else if (adMode.equals(StartAppAd.AdMode.VIDEO)) {
            adPreferences2.setType(Ad.AdType.VIDEO);
        }
        return a(startAppAd, placement2, adPreferences2, false, 0, kVar, str);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final com.startapp.sdk.adsbase.f a(CacheKey cacheKey) {
        x2 x2Var = cacheKey != null ? (x2) this.f41333a.get(cacheKey) : null;
        if (x2Var != null) {
            return x2Var.o;
        }
        return null;
    }

    public final CacheKey a(StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, boolean z2, int i2, com.startapp.sdk.adsbase.k kVar, String str) throws Throwable {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        AdPreferences adPreferences2 = adPreferences == null ? new AdPreferences() : adPreferences;
        CacheKey cacheKey = str != null ? new CacheKey(placement, adPreferences2, UUID.randomUUID().toString()) : new CacheKey(placement, adPreferences2);
        if (this.d && !z2) {
            this.f41336e.add(new o(startAppAd, placement, adPreferences2, kVar));
            return cacheKey;
        }
        AdPreferences adPreferences3 = new AdPreferences(adPreferences2);
        ConcurrentHashMap concurrentHashMap3 = this.f41333a;
        synchronized (concurrentHashMap3) {
            try {
                try {
                    x2 x2Var = (x2) this.f41333a.get(cacheKey);
                    if (x2Var == null) {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                concurrentHashMap2 = concurrentHashMap3;
                                                                x2 x2Var2 = new x2(this.g, placement, adPreferences3, this.k, this.f41339l, this.m, new lb(new U.a(this, 2)), this.f41340n, this.o, this.q, this.r, this.s, this.t);
                                                                if (this.f == null) {
                                                                    this.f = new m(this);
                                                                }
                                                                x2Var2.f41664z = this.f;
                                                                if (z2) {
                                                                    x2Var2.r = String.valueOf(cacheKey.hashCode()).replace('-', '_');
                                                                    x2Var2.s = true;
                                                                    x2Var2.f41663w = i2;
                                                                }
                                                                a(cacheKey, x2Var2);
                                                                x2Var = x2Var2;
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                concurrentHashMap = concurrentHashMap3;
                                                                throw th;
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            concurrentHashMap = concurrentHashMap3;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        concurrentHashMap = concurrentHashMap3;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    concurrentHashMap = concurrentHashMap3;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                concurrentHashMap = concurrentHashMap3;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            concurrentHashMap = concurrentHashMap3;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        concurrentHashMap = concurrentHashMap3;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    concurrentHashMap = concurrentHashMap3;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                concurrentHashMap = concurrentHashMap3;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            concurrentHashMap = concurrentHashMap3;
                        }
                    } else {
                        concurrentHashMap2 = concurrentHashMap3;
                        x2Var.f41660n = adPreferences3;
                    }
                    ((z6) ((y6) this.k.a())).a(startAppAd, x2Var);
                    CacheKey cacheKey2 = cacheKey;
                    x2Var.a(startAppAd, kVar, false, true, str);
                    return cacheKey2;
                } catch (Throwable th11) {
                    th = th11;
                    concurrentHashMap = concurrentHashMap3;
                }
            } catch (Throwable th12) {
                th = th12;
            }
        }
    }

    public final void a(CacheKey cacheKey, x2 x2Var) {
        synchronized (this.f41333a) {
            try {
                int iE = CacheMetaData.b().a().e();
                if (iE != 0 && this.f41333a.size() >= iE) {
                    long j = Long.MAX_VALUE;
                    CacheKey cacheKey2 = null;
                    for (CacheKey cacheKey3 : this.f41333a.keySet()) {
                        x2 x2Var2 = (x2) this.f41333a.get(cacheKey3);
                        if (x2Var2.f41659l == x2Var.f41659l) {
                            long j2 = x2Var2.q;
                            if (j2 < j) {
                                cacheKey2 = cacheKey3;
                                j = j2;
                            }
                        }
                    }
                    if (cacheKey2 != null) {
                        this.f41333a.remove(cacheKey2);
                    }
                }
                this.f41333a.put(cacheKey, x2Var);
                if (Math.random() * 100.0d < CacheMetaData.b().c()) {
                    g9 g9Var = new g9(h9.d);
                    g9Var.d = "Cache Size";
                    g9Var.f41002e = String.valueOf(this.f41333a.size());
                    g9Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

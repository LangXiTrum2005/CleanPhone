package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f41654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f41655c;
    public final lb d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb f41656e;
    public final lb f;
    public final lb g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lb f41657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lb f41658i;
    public final lb j;
    public final lb k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AdPreferences.Placement f41659l;
    public final ActivityExtra m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AdPreferences f41660n;
    public long q;
    public String r;
    public boolean s;
    public final r2 t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o2 f41662u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f41663w;
    public final boolean x;
    public Long y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m f41664z;
    public Ad o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f41661p = new AtomicBoolean(false);
    public final ConcurrentHashMap v = new ConcurrentHashMap();

    public x2(Context context, AdPreferences.Placement placement, AdPreferences adPreferences, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9, lb lbVar10) {
        this.f41659l = placement;
        this.f41660n = adPreferences;
        if (context instanceof Activity) {
            Context contextA = x0.a(context);
            this.f41653a = contextA == null ? context : contextA;
            this.m = new ActivityExtra((Activity) context);
        } else {
            this.f41653a = context;
            this.m = null;
        }
        this.x = true;
        this.f41654b = lbVar;
        this.f41655c = lbVar2;
        this.d = lbVar3;
        this.f41656e = lbVar4;
        this.f = lbVar5;
        this.g = lbVar6;
        this.f41657h = lbVar7;
        this.f41658i = lbVar8;
        this.j = lbVar9;
        this.k = lbVar10;
        this.t = new r2(this);
        this.f41662u = new o2(this);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    /* JADX WARN: Code duplicated, block: B:28:0x003e A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #1 {all -> 0x0028, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000f, B:17:0x0022, B:37:0x0065, B:11:0x0015, B:22:0x002e, B:28:0x003e, B:32:0x004a, B:33:0x004d, B:26:0x0038, B:34:0x0050, B:36:0x0058, B:23:0x0030, B:29:0x0045), top: B:43:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0058 A[Catch: all -> 0x0028, TryCatch #1 {all -> 0x0028, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000f, B:17:0x0022, B:37:0x0065, B:11:0x0015, B:22:0x002e, B:28:0x003e, B:32:0x004a, B:33:0x004d, B:26:0x0038, B:34:0x0050, B:36:0x0058, B:23:0x0030, B:29:0x0045), top: B:43:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final void a(StartAppAd startAppAd, com.startapp.sdk.adsbase.k kVar, boolean z2, boolean z3, String str) {
        List arrayList;
        synchronized (this.v) {
            try {
                ?? r1 = this.o;
                if (r1 == 0 || !r1.isReady()) {
                    if (startAppAd != null && kVar != null) {
                        try {
                            arrayList = (List) this.v.get(kVar);
                        } catch (Throwable th) {
                            g9.a(th);
                            arrayList = null;
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            try {
                                this.v.put(kVar, arrayList);
                            } catch (Throwable th2) {
                                g9.a(th2);
                            }
                        }
                        arrayList.add(startAppAd);
                    }
                    if (this.f41661p.compareAndSet(false, true)) {
                        this.t.e();
                        this.f41662u.e();
                        b(str, z3);
                    }
                } else {
                    ?? r2 = this.o;
                    if ((r2 == 0 ? false : r2.hasAdCacheTtlPassed()) || z2) {
                        if (startAppAd != null) {
                            arrayList = (List) this.v.get(kVar);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                this.v.put(kVar, arrayList);
                            }
                            arrayList.add(startAppAd);
                        }
                        if (this.f41661p.compareAndSet(false, true)) {
                            this.t.e();
                            this.f41662u.e();
                            b(str, z3);
                        }
                    } else if (startAppAd != null && kVar != null) {
                        a0.b(this.f41653a, kVar, startAppAd, true);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final void b(String str, boolean z2) {
        String str2;
        ?? r0 = this.o;
        if (r0 != 0) {
            r0.setVideoCancelCallBack(false);
        }
        if (!this.s || (str2 = this.r) == null) {
            a(str, z2);
            return;
        }
        this.s = false;
        s2 s2Var = new s2(this, new w2(this), z2);
        Context context = this.f41653a;
        ((Executor) com.startapp.sdk.components.a.a(context).C.a()).execute(new r6(context, str2, s2Var, new t2(this)));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final void a() {
        boolean zBooleanValue;
        ?? r0 = this.o;
        if (r0 != 0 && r0.isReady()) {
            Context context = this.f41653a;
            Ad ad = this.o;
            if (ad != null) {
                HashSet hashSet = new HashSet();
                if (ad instanceof o8) {
                    zBooleanValue = u0.a(context, u0.a(((o8) ad).a(), 0), 0, hashSet, new ArrayList()).booleanValue();
                } else if ((ad instanceof gb) && u0.a(context, ((gb) ad).f41005a, 0, hashSet, false).size() == 0) {
                    zBooleanValue = true;
                } else {
                    zBooleanValue = false;
                }
            } else {
                zBooleanValue = false;
            }
            if (!zBooleanValue) {
                ?? r1 = this.o;
                if (!(r1 != 0 ? r1.hasAdCacheTtlPassed() : false)) {
                    if (this.f41661p.get()) {
                        return;
                    }
                    this.t.d();
                    return;
                }
            }
            a(null, null, true, false, null);
            return;
        }
        if (this.f41661p.get()) {
            return;
        }
        this.f41662u.d();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final void a(String str, boolean z2) {
        Ad jjVar;
        Ad wdVar;
        if (z2) {
            Long lH = AdsCommonMetaData.k().h();
            if (lH != null && this.y != null && SystemClock.elapsedRealtime() - this.y.longValue() < lH.longValue()) {
                a0.a(this.f41653a, new w2(this), new u2(this.f41653a, this.f41659l, this.f41654b, this.f41655c, this.f41656e, this.f, this.g, this.f41657h, this.f41658i, this.j, this.k), true);
                vi.a(6, this.f41653a, "Failed to load " + this.f41659l.name() + " ad: NO FILL");
                return;
            }
            this.y = Long.valueOf(SystemClock.elapsedRealtime());
        }
        int i2 = v2.f41557a[this.f41659l.ordinal()];
        if (i2 == 1) {
            jjVar = new jj(this.f41653a, AdPreferences.Placement.INAPP_OVERLAY, this.f41654b, this.f41655c, this.f41656e, this.f, this.g, this.f41657h, this.f41658i, this.j, this.k);
        } else if (i2 == 2) {
            boolean z3 = new Random().nextInt(100) < AdsCommonMetaData.k().w();
            boolean zIsForceOfferWall3D = this.f41660n.isForceOfferWall3D();
            boolean zIsForceOfferWall2D = this.f41660n.isForceOfferWall2D();
            WeakHashMap weakHashMap = vi.f41589a;
            if ((z3 || zIsForceOfferWall3D) && !zIsForceOfferWall2D) {
                wdVar = new wd(this.f41653a, this.f41654b, this.f41655c, this.f41656e, this.f, this.g, this.f41657h, this.f41658i, this.j, this.k, this.d);
                jjVar = wdVar;
            } else {
                jjVar = new xd(this.f41653a, this.f41654b, this.f41655c, this.f41656e, this.f, this.g, this.f41657h, this.f41658i, this.j, this.k);
            }
        } else if (i2 == 3) {
            wdVar = new we(this.f41653a, this.f41654b, this.f41655c, this.f41656e, this.f, this.g, this.f41657h, this.f41658i, this.j, this.k);
            jjVar = wdVar;
        } else if (i2 != 4) {
            jjVar = new ae(this.f41653a, this.f41654b, this.f41655c, this.f41656e, this.f, this.g, this.f41657h, this.f41658i, this.j, this.k);
        } else {
            jjVar = new zg(this.f41653a, this.f41654b, this.f41655c, this.f41656e, this.f, this.g, this.f41657h, this.f41658i, this.j, this.k);
        }
        this.o = jjVar;
        ((z6) ((y6) this.f41654b.a())).a(this, this.o);
        this.o.setActivityExtra(this.m);
        this.f41660n.setAutoLoadAmount(this.f41663w);
        this.o.load(this.f41660n, new w2(this), str);
        this.q = System.currentTimeMillis();
    }
}

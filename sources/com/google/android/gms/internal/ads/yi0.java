package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yi0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22264d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f22266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WeakReference f22267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nh0 f22268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f22269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Executor f22270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f22271k;
    public final fi0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final VersionInfoParcel f22272m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fc0 f22274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kw0 f22275p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22261a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22262b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22263c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m00 f22265e = new m00();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f22273n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f22276q = true;

    public yi0(Executor executor, Context context, WeakReference weakReference, k00 k00Var, nh0 nh0Var, ScheduledExecutorService scheduledExecutorService, fi0 fi0Var, VersionInfoParcel versionInfoParcel, fc0 fc0Var, kw0 kw0Var) {
        this.f22268h = nh0Var;
        this.f22266f = context;
        this.f22267g = weakReference;
        this.f22269i = k00Var;
        this.f22271k = scheduledExecutorService;
        this.f22270j = executor;
        this.l = fi0Var;
        this.f22272m = versionInfoParcel;
        this.f22274o = fc0Var;
        this.f22275p = kw0Var;
        ((p9.b) zzt.zzk()).getClass();
        this.f22264d = SystemClock.elapsedRealtime();
        d("com.google.android.gms.ads.MobileAds", 0, "", false);
    }

    public final void a() {
        if (!((Boolean) mn.f17485a.o()).booleanValue()) {
            if (this.f22272m.clientJarVersion >= ((Integer) zzba.zzc().a(am.D2)).intValue() && this.f22276q) {
                if (this.f22261a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f22261a) {
                            return;
                        }
                        this.l.d();
                        this.f22274o.zze();
                        m00 m00Var = this.f22265e;
                        final int i10 = 0;
                        Runnable runnable = new Runnable(this) { // from class: com.google.android.gms.internal.ads.vi0

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ yi0 f21180b;

                            {
                                this.f21180b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        yi0 yi0Var = this.f21180b;
                                        fi0 fi0Var = yi0Var.l;
                                        synchronized (fi0Var) {
                                            try {
                                                if (((Boolean) zzba.zzc().a(am.P2)).booleanValue() && !fi0Var.f14439d) {
                                                    HashMap mapE = fi0Var.e();
                                                    mapE.put("action", "init_finished");
                                                    ArrayList arrayList = fi0Var.f14437b;
                                                    arrayList.add(mapE);
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        fi0Var.f14441f.b((Map) it.next());
                                                    }
                                                    fi0Var.f14439d = true;
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        yi0Var.f22274o.zzf();
                                        yi0Var.f22262b = true;
                                        return;
                                    default:
                                        yi0 yi0Var2 = this.f21180b;
                                        synchronized (yi0Var2) {
                                            try {
                                                if (yi0Var2.f22263c) {
                                                    return;
                                                }
                                                ((p9.b) zzt.zzk()).getClass();
                                                yi0Var2.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - yi0Var2.f22264d), "Timeout.", false);
                                                yi0Var2.l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                yi0Var2.f22274o.a("com.google.android.gms.ads.MobileAds", "timeout");
                                                yi0Var2.f22265e.zzd(new Exception());
                                                return;
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                }
                            }
                        };
                        Executor executor = this.f22269i;
                        m00Var.addListener(runnable, executor);
                        this.f22261a = true;
                        ListenableFuture listenableFutureC = c();
                        final int i11 = 1;
                        this.f22271k.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.vi0

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ yi0 f21180b;

                            {
                                this.f21180b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        yi0 yi0Var = this.f21180b;
                                        fi0 fi0Var = yi0Var.l;
                                        synchronized (fi0Var) {
                                            try {
                                                if (((Boolean) zzba.zzc().a(am.P2)).booleanValue() && !fi0Var.f14439d) {
                                                    HashMap mapE = fi0Var.e();
                                                    mapE.put("action", "init_finished");
                                                    ArrayList arrayList = fi0Var.f14437b;
                                                    arrayList.add(mapE);
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        fi0Var.f14441f.b((Map) it.next());
                                                    }
                                                    fi0Var.f14439d = true;
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        yi0Var.f22274o.zzf();
                                        yi0Var.f22262b = true;
                                        return;
                                    default:
                                        yi0 yi0Var2 = this.f21180b;
                                        synchronized (yi0Var2) {
                                            try {
                                                if (yi0Var2.f22263c) {
                                                    return;
                                                }
                                                ((p9.b) zzt.zzk()).getClass();
                                                yi0Var2.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - yi0Var2.f22264d), "Timeout.", false);
                                                yi0Var2.l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                yi0Var2.f22274o.a("com.google.android.gms.ads.MobileAds", "timeout");
                                                yi0Var2.f22265e.zzd(new Exception());
                                                return;
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                }
                            }
                        }, ((Long) zzba.zzc().a(am.F2)).longValue(), TimeUnit.SECONDS);
                        listenableFutureC.addListener(new zd1(0, listenableFutureC, new x11(this)), executor);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        if (this.f22261a) {
            return;
        }
        d("com.google.android.gms.ads.MobileAds", 0, "", true);
        this.f22265e.zzc(Boolean.FALSE);
        this.f22261a = true;
        this.f22262b = true;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.f22273n;
        for (String str : concurrentHashMap.keySet()) {
            tr trVar = (tr) concurrentHashMap.get(str);
            arrayList.add(new tr(str, trVar.f20465c, trVar.f20466d, trVar.f20464b));
        }
        return arrayList;
    }

    public final synchronized ListenableFuture c() {
        String str = zzt.zzh().g().zzi().f12961e;
        if (!TextUtils.isEmpty(str)) {
            return zw1.d(str);
        }
        m00 m00Var = new m00();
        zzt.zzh().g().zzk(new zd1(27, this, m00Var));
        return m00Var;
    }

    public final void d(String str, int i10, String str2, boolean z10) {
        this.f22273n.put(str, new tr(str, i10, str2, z10));
    }
}

package com.startapp.sdk.internal;

import A.RunnableC0907o;
import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class jh {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f41150u;
    public static int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f41151w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SDKAdPreferences f41152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f41153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41154c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41155e;
    public long f;
    public Application g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f41156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public gh f41157i;
    public final AtomicBoolean j;
    public Activity k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f41158l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f41159n;
    public TreeMap o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bundle f41160p;
    public boolean q;
    public boolean r;
    public w0 s;
    public boolean t;

    public jh() {
        WeakHashMap weakHashMap = vi.f41589a;
        this.f41153b = true;
        this.f41154c = false;
        this.d = false;
        this.f41155e = false;
        this.f41156h = new HashMap();
        this.j = new AtomicBoolean();
        this.f41158l = false;
        this.m = true;
        this.f41159n = false;
        this.f41160p = null;
    }

    public static void c(Context context) {
        Context contextA = x0.a(context);
        if (contextA != null) {
            context = contextA;
        }
        m8 m8Var = (m8) com.startapp.sdk.components.a.a(context).y.a();
        m8Var.f41243a.post(new RunnableC0907o(context, 5));
    }

    public static boolean d(Context context) {
        SharedPreferences sharedPreferences = (SharedPreferences) com.startapp.sdk.components.a.a(context).f40728I.a();
        if (sharedPreferences.contains("isma")) {
            if (sharedPreferences.getBoolean("isma", false)) {
                return sharedPreferences.contains("iscd") && !sharedPreferences.getBoolean("iscd", false);
            }
            return (sharedPreferences.contains("iscd") && sharedPreferences.getBoolean("iscd", false)) ? false : true;
        }
        if (sharedPreferences.contains("iscd")) {
            return !sharedPreferences.getBoolean("iscd", false);
        }
        return true;
    }

    public static void e(Context context) {
        ih.f41097a.a(context, null, null, null, null, true);
    }

    public final void a(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, Runnable runnable) {
        Context contextA = x0.a(context);
        Context context2 = contextA != null ? contextA : context;
        try {
            ((sf) com.startapp.sdk.components.a.a(context2).f40743u.a()).a(256);
        } catch (Throwable unused) {
        }
        ((m8) com.startapp.sdk.components.a.a(context2).y.a()).f41243a.post(new J.a(this, context2, str, str2, sDKAdPreferences, runnable));
    }

    public final /* synthetic */ void b(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, Runnable runnable) {
        a(context, str, str2, sDKAdPreferences, runnable, false);
    }

    public final void f(Context context) {
        vf vfVar = (vf) com.startapp.sdk.components.a.a(context).G.a();
        int i2 = vfVar.getInt("shared_prefs_app_version_id", -1);
        int iA = q0.a(context);
        if (i2 > 0 && iA > i2) {
            this.f41159n = true;
        }
        uf ufVarEdit = vfVar.edit();
        ufVarEdit.a("shared_prefs_app_version_id", Integer.valueOf(iA));
        ufVarEdit.f41545a.putInt("shared_prefs_app_version_id", iA);
        ufVarEdit.apply();
    }

    public final void g(Context context) {
        com.startapp.sdk.components.a aVarA = com.startapp.sdk.components.a.a(context);
        uf ufVarEdit = ((vf) aVarA.G.a()).edit();
        Boolean bool = Boolean.FALSE;
        ufVarEdit.a("periodicInfoEventPaused", bool);
        ufVarEdit.f41545a.putBoolean("periodicInfoEventPaused", false);
        ufVarEdit.a("periodicMetadataPaused", bool);
        ufVarEdit.f41545a.putBoolean("periodicMetadataPaused", false);
        ufVarEdit.apply();
        eh ehVar = new eh(this, context, aVarA);
        if (MetaData.E().n0()) {
            ehVar.a(null, false);
        } else {
            MetaData.E().a(ehVar);
        }
    }

    public final void b(Context context) {
        Application application;
        Context contextA = x0.a(context);
        if (contextA instanceof Application) {
            application = (Application) contextA;
        } else if (context instanceof Application) {
            application = (Application) context;
        } else if (context instanceof Activity) {
            application = ((Activity) context).getApplication();
        } else {
            application = context instanceof Service ? ((Service) context).getApplication() : null;
        }
        if (application == null || this.s != null) {
            return;
        }
        w0 w0Var = new w0(this);
        this.s = w0Var;
        application.registerActivityLifecycleCallbacks(w0Var);
        try {
            nf nfVar = ((sf) com.startapp.sdk.components.a.a(context).f40743u.a()).f41486e;
            if (nfVar == null) {
                throw new RuntimeException();
            }
            application.registerActivityLifecycleCallbacks(nfVar);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0244 A[Catch: all -> 0x0186, TryCatch #5 {all -> 0x0186, blocks: (B:64:0x0127, B:71:0x014a, B:73:0x017d, B:79:0x018f, B:82:0x01a1, B:84:0x01a4, B:86:0x01b6, B:94:0x01c5, B:96:0x0212, B:98:0x021f, B:100:0x0223, B:101:0x022d, B:103:0x0244, B:105:0x024e, B:106:0x0251, B:78:0x0189, B:70:0x0147, B:65:0x0138, B:67:0x0140), top: B:154:0x0127, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x024e A[Catch: all -> 0x0186, TryCatch #5 {all -> 0x0186, blocks: (B:64:0x0127, B:71:0x014a, B:73:0x017d, B:79:0x018f, B:82:0x01a1, B:84:0x01a4, B:86:0x01b6, B:94:0x01c5, B:96:0x0212, B:98:0x021f, B:100:0x0223, B:101:0x022d, B:103:0x0244, B:105:0x024e, B:106:0x0251, B:78:0x0189, B:70:0x0147, B:65:0x0138, B:67:0x0140), top: B:154:0x0127, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x01c3 A[EDGE_INSN: B:159:0x01c3->B:93:0x01c3 BREAK  A[LOOP:0: B:81:0x019f->B:163:0x019f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0189 A[Catch: all -> 0x0186, TRY_LEAVE, TryCatch #5 {all -> 0x0186, blocks: (B:64:0x0127, B:71:0x014a, B:73:0x017d, B:79:0x018f, B:82:0x01a1, B:84:0x01a4, B:86:0x01b6, B:94:0x01c5, B:96:0x0212, B:98:0x021f, B:100:0x0223, B:101:0x022d, B:103:0x0244, B:105:0x024e, B:106:0x0251, B:78:0x0189, B:70:0x0147, B:65:0x0138, B:67:0x0140), top: B:154:0x0127, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a4 A[Catch: all -> 0x0186, NameNotFoundException | Exception -> 0x01c3, TryCatch #2 {NameNotFoundException | Exception -> 0x01c3, blocks: (B:82:0x01a1, B:84:0x01a4, B:86:0x01b6), top: B:148:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b6 A[Catch: all -> 0x0186, NameNotFoundException | Exception -> 0x01c3, TRY_LEAVE, TryCatch #2 {NameNotFoundException | Exception -> 0x01c3, blocks: (B:82:0x01a1, B:84:0x01a4, B:86:0x01b6), top: B:148:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0212 A[Catch: all -> 0x0186, TryCatch #5 {all -> 0x0186, blocks: (B:64:0x0127, B:71:0x014a, B:73:0x017d, B:79:0x018f, B:82:0x01a1, B:84:0x01a4, B:86:0x01b6, B:94:0x01c5, B:96:0x0212, B:98:0x021f, B:100:0x0223, B:101:0x022d, B:103:0x0244, B:105:0x024e, B:106:0x0251, B:78:0x0189, B:70:0x0147, B:65:0x0138, B:67:0x0140), top: B:154:0x0127, inners: #4 }] */
    public final void a(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, Runnable runnable, boolean z2) {
        boolean zA;
        MetaDataRequest$RequestReason metaDataRequest$RequestReason;
        boolean zA2;
        boolean z3;
        Application application;
        ActivityInfo[] activityInfoArr;
        int i2;
        ActivityInfo activityInfo;
        boolean zContains;
        WeakHashMap weakHashMap = vi.f41589a;
        int i3 = f41150u;
        boolean zA3 = false;
        if (i3 == 0 && z2) {
            hc hcVar = new hc(context);
            if (hcVar.f41051c != null || hcVar.d != null) {
                uf ufVarEdit = ((vf) com.startapp.sdk.components.a.a(context).f40728I.a()).edit();
                Boolean bool = hcVar.f41051c;
                if (bool != null) {
                    boolean zEquals = Boolean.TRUE.equals(bool);
                    ufVarEdit.a("isma", Boolean.valueOf(zEquals));
                    ufVarEdit.f41545a.putBoolean("isma", zEquals);
                }
                Boolean bool2 = hcVar.d;
                if (bool2 != null) {
                    boolean zEquals2 = Boolean.TRUE.equals(bool2);
                    ufVarEdit.a("iscd", Boolean.valueOf(zEquals2));
                    ufVarEdit.f41545a.putBoolean("iscd", zEquals2);
                }
                ufVarEdit.apply();
            }
            StartAppSDK.enableConsent(context, hcVar.f41050b);
            str2 = hcVar.f41049a;
            if (TextUtils.isEmpty(str2)) {
                r0 r0Var = (r0) com.startapp.sdk.components.a.a(context).m.a();
                synchronized (r0Var.f41419a) {
                    zContains = r0Var.f41420b.contains("2696a7f502faed4b");
                }
                if (zContains) {
                    str2 = r0Var.a();
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                z2 = false;
            }
        }
        com.google.android.exoplayer2.video.a aVar = new com.google.android.exoplayer2.video.a(13, context, runnable);
        int i4 = v;
        hh hhVar = new hh(context, aVar, i4 == 1 || i4 == 2, i4 == 2);
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        MetaData.E().a(new dh(new Handler(looperMyLooper), hhVar));
        int i5 = z2 ? 1 : 2;
        if (i5 > i3) {
            f41150u = i5;
            if (z2) {
                metaDataRequest$RequestReason = MetaDataRequest$RequestReason.IMPLICIT_LAUNCH;
            } else {
                MetaDataRequest$RequestReason metaDataRequest$RequestReason2 = MetaDataRequest$RequestReason.LAUNCH;
                if (TextUtils.isEmpty(str2)) {
                    if (!vi.d(context)) {
                        int i6 = q0.f41381a;
                        try {
                            zA2 = v6.a(context);
                        } catch (Throwable unused) {
                            zA2 = false;
                        }
                        if (!zA2) {
                            Log.w("StartAppSDK", new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n"));
                        }
                    }
                    throw new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n");
                }
                ((r0) com.startapp.sdk.components.a.a(context).m.a()).a(str, str2);
                this.f41152a = sDKAdPreferences;
                g7.b(context, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
                metaDataRequest$RequestReason = metaDataRequest$RequestReason2;
            }
            if (i3 == 0) {
                if (Math.random() < 0.0d) {
                    Log.i("StartAppSDK", "!SDK-VERSION-STRING!:com.startapp.startappsdk:inapp-sdk:5.2.4");
                }
                try {
                    com.startapp.sdk.components.a aVarA = com.startapp.sdk.components.a.a(context);
                    aVarA.L.a();
                    j0 j0Var = (j0) aVarA.f40729J.a();
                    try {
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        if (!(defaultUncaughtExceptionHandler instanceof j0)) {
                            Thread.setDefaultUncaughtExceptionHandler(j0Var);
                            j0Var.f41126a = defaultUncaughtExceptionHandler;
                            v0 v0Var = (v0) aVarA.f40732Q.a();
                            v0Var.f41553a.getClass();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            v0Var.d = jElapsedRealtime;
                            v0Var.f41556e = jElapsedRealtime;
                            ((w9) aVarA.q.a()).a();
                            ((k0) aVarA.f40734a.a()).a();
                            if (q0.a(context, "android.permission.INTERNET") || !q0.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                                vi.a(6, context, "Please grant the mandatory permissions : INTERNET & ACCESS_NETWORK_STATE, SDK could not be initialized.");
                            }
                            try {
                                activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
                                z3 = false;
                                i2 = 0;
                                while (!z3) {
                                    try {
                                        if (i2 < activityInfoArr.length) {
                                            break;
                                        }
                                        i2++;
                                        activityInfo = activityInfoArr[i2];
                                        if (!activityInfo.name.equals(OverlayActivity.class.getName())) {
                                            if ((activityInfo.flags & 512) == 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                        }
                                    } catch (PackageManager.NameNotFoundException | Exception unused2) {
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException | Exception unused3) {
                                z3 = false;
                            }
                            this.m = !z3;
                            ((com.startapp.sdk.common.advertisingid.b) aVarA.f40738h.a()).a(d(context));
                            b(context);
                            com.startapp.sdk.adsbase.g.c(context);
                            ((gi) aVarA.S.a()).b();
                            ((cd) aVarA.T.a()).a();
                            aVarA.H.a();
                            j6.f41135a = new CookieManager(new je(context), CookiePolicy.ACCEPT_ALL);
                            f(context);
                            a(context);
                            g(context);
                            if (context instanceof Application) {
                                application = (Application) context;
                                this.g = application;
                                if (this.j.compareAndSet(false, true) && this.f41157i == null) {
                                    gh ghVar = new gh();
                                    application.registerActivityLifecycleCallbacks(ghVar);
                                    this.f41157i = ghVar;
                                }
                            }
                            MetaData.E().a((h6) aVarA.j.a());
                            WeakHashMap weakHashMap2 = vi.f41589a;
                            if (MetaData.c(context)) {
                                AdsCommonMetaData.a(context);
                                BannerMetaData.a(context);
                                if (this.f41153b) {
                                    CacheMetaData.a(context);
                                }
                                AdInformationMetaData.a(context);
                                zA3 = true;
                            }
                        } else {
                            v0 v0Var2 = (v0) aVarA.f40732Q.a();
                            v0Var2.f41553a.getClass();
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            v0Var2.d = jElapsedRealtime2;
                            v0Var2.f41556e = jElapsedRealtime2;
                            ((w9) aVarA.q.a()).a();
                            ((k0) aVarA.f40734a.a()).a();
                            if (q0.a(context, "android.permission.INTERNET")) {
                                vi.a(6, context, "Please grant the mandatory permissions : INTERNET & ACCESS_NETWORK_STATE, SDK could not be initialized.");
                            } else {
                                vi.a(6, context, "Please grant the mandatory permissions : INTERNET & ACCESS_NETWORK_STATE, SDK could not be initialized.");
                            }
                            activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
                            z3 = false;
                            i2 = 0;
                            while (!z3) {
                                if (i2 < activityInfoArr.length) {
                                    break;
                                    break;
                                }
                                i2++;
                                activityInfo = activityInfoArr[i2];
                                if (!activityInfo.name.equals(OverlayActivity.class.getName())) {
                                    if ((activityInfo.flags & 512) == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                }
                            }
                            this.m = !z3;
                            ((com.startapp.sdk.common.advertisingid.b) aVarA.f40738h.a()).a(d(context));
                            b(context);
                            com.startapp.sdk.adsbase.g.c(context);
                            ((gi) aVarA.S.a()).b();
                            ((cd) aVarA.T.a()).a();
                            aVarA.H.a();
                            j6.f41135a = new CookieManager(new je(context), CookiePolicy.ACCEPT_ALL);
                            f(context);
                            a(context);
                            g(context);
                            if (context instanceof Application) {
                                application = (Application) context;
                                this.g = application;
                                if (this.j.compareAndSet(false, true)) {
                                    gh ghVar2 = new gh();
                                    application.registerActivityLifecycleCallbacks(ghVar2);
                                    this.f41157i = ghVar2;
                                }
                            }
                            MetaData.E().a((h6) aVarA.j.a());
                            WeakHashMap weakHashMap3 = vi.f41589a;
                            if (MetaData.c(context)) {
                                AdsCommonMetaData.a(context);
                                BannerMetaData.a(context);
                                if (this.f41153b) {
                                    CacheMetaData.a(context);
                                }
                                AdInformationMetaData.a(context);
                                zA3 = true;
                            }
                        }
                    } catch (Throwable th) {
                        g9.a(th);
                    }
                } catch (Throwable th2) {
                    g9.a(th2);
                }
                if (zA3 && v == 0) {
                    v = 1;
                }
                WeakHashMap weakHashMap4 = vi.f41589a;
                hhVar.f41065c = zA3;
            }
            pg.d.a(context, metaDataRequest$RequestReason);
        } else if (!z2 && !TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str2)) {
                if (!vi.d(context)) {
                    int i7 = q0.f41381a;
                    try {
                        zA = v6.a(context);
                    } catch (Throwable unused4) {
                        zA = false;
                    }
                    if (!zA) {
                        Log.w("StartAppSDK", new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n"));
                    }
                }
                throw new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n");
            }
            zA3 = ((r0) com.startapp.sdk.components.a.a(context).m.a()).a(str, str2);
            if (zA3) {
                pg.d.a(context, MetaDataRequest$RequestReason.LAUNCH);
            }
        }
        hhVar.f41066e = true;
        WeakHashMap weakHashMap5 = vi.f41589a;
        if (!(hhVar.f41065c ? hhVar.d : true) || hhVar.f41064b) {
            return;
        }
        hhVar.f41064b = true;
        h0.a(hhVar.f41063a);
    }

    public static void a(Context context, Runnable runnable) {
        if (!f41151w) {
            f41151w = true;
            String str = "StartApp SDK initialized, version " + StartAppSDK.getVersion();
            WeakHashMap weakHashMap = vi.f41589a;
            Log.println(4, "StartAppSDK", str);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #1 {all -> 0x0023, blocks: (B:3:0x0007, B:5:0x001e, B:9:0x0027, B:10:0x0034, B:12:0x003a, B:14:0x0055, B:15:0x005d, B:18:0x0065, B:20:0x006b, B:21:0x0072, B:44:0x00b6, B:47:0x00be, B:43:0x00b3, B:23:0x0078, B:25:0x0084, B:28:0x008b, B:29:0x008f, B:31:0x0095, B:34:0x00a0, B:36:0x00a6, B:39:0x00ad), top: B:58:0x0007, inners: #0 }] */
    public static void a(Context context) {
        String str = "com.android.chrome";
        boolean z2 = false;
        String str2 = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str3 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    str = (String) arrayList.get(0);
                } else if (!TextUtils.isEmpty(str3)) {
                    try {
                        List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                        if (listQueryIntentActivities2 != null && listQueryIntentActivities2.size() != 0) {
                            Iterator<ResolveInfo> it = listQueryIntentActivities2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ResolveInfo next = it.next();
                                    IntentFilter intentFilter = next.filter;
                                    if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && next.activityInfo != null) {
                                    }
                                } else if (arrayList.contains(str3)) {
                                    str2 = str3;
                                }
                                if (arrayList.contains("com.android.chrome")) {
                                }
                            }
                        } else if (arrayList.contains(str3)) {
                            str2 = str3;
                        } else if (arrayList.contains("com.android.chrome")) {
                        }
                    } catch (Throwable th) {
                        g9.a(th);
                    }
                } else if (arrayList.contains("com.android.chrome")) {
                }
                str2 = str;
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
        if (str2 != null) {
            Intent intent3 = new Intent("android.support.customtabs.action.CustomTabsService");
            intent3.setPackage(str2);
            z2 = !context.getPackageManager().queryIntentServices(intent3, 0).isEmpty();
        }
        uf ufVarEdit = ((vf) com.startapp.sdk.components.a.a(context).G.a()).edit();
        ufVarEdit.a("chromeTabs", Boolean.valueOf(z2));
        ufVarEdit.f41545a.putBoolean("chromeTabs", z2);
        ufVarEdit.apply();
    }
}

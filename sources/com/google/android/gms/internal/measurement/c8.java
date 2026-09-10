package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.Xa;
import com.unity3d.services.core.fid.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c8 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile c8 f23352h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f23353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppMeasurementSdk f23354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f23355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile y6 f23358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile long f23359g;

    public c8(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new w7(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f23353a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f23354b = new AppMeasurementSdk(this);
        this.f23355c = new ArrayList();
        try {
            if (ea.z1.b(context, ea.z1.a(context)) != null) {
                try {
                    Class.forName(Constants.FID_CLASS, false, c8.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f23357e = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new s7(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b8(this));
        }
    }

    public static c8 e(Context context, Bundle bundle) {
        k9.c0.h(context);
        if (f23352h == null) {
            synchronized (c8.class) {
                try {
                    if (f23352h == null) {
                        f23352h = new c8(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f23352h;
    }

    public final Map a(String str, String str2, boolean z10) {
        v6 v6Var = new v6();
        c(new l7(this, str, str2, z10, v6Var));
        Bundle bundleM0 = v6Var.m0(5000L);
        if (bundleM0 == null || bundleM0.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleM0.size());
        for (String str3 : bundleM0.keySet()) {
            Object obj = bundleM0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final int b(String str) {
        v6 v6Var = new v6();
        c(new s7(this, str, v6Var));
        Integer num = (Integer) v6.u1(Integer.class, v6Var.m0(Xa.f27908s));
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void c(y7 y7Var) {
        this.f23353a.execute(y7Var);
    }

    public final void d(Exception exc, boolean z10, boolean z11) {
        this.f23357e |= z10;
        if (z10) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            c(new s7(this, "Error with data collection. Data lost.", exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final List f(String str, String str2) {
        v6 v6Var = new v6();
        c(new n7(this, str, str2, v6Var));
        List list = (List) v6.u1(List.class, v6Var.m0(5000L));
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final long g() {
        v6 v6Var = new v6();
        c(new u7(this, v6Var, 2));
        Long l = (Long) v6.u1(Long.class, v6Var.m0(500L));
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i10 = this.f23356d + 1;
        this.f23356d = i10;
        return jNextLong + ((long) i10);
    }
}

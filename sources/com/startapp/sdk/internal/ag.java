package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ag {
    public static final boolean o = MetaData.E().o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f40806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdPreferences.Placement f40807c;
    public final String[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TrackingParams f40808e;
    public long f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f40809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f40810i;
    public final WeakReference k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public yf f40811l;
    public boolean m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f40805a = new Handler(Looper.getMainLooper());
    public final AtomicInteger j = new AtomicInteger();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f40812n = new Object();

    public ag(Context context, AdPreferences.Placement placement, String[] strArr, TrackingParams trackingParams, long j, boolean z2, zf zfVar) {
        Context contextA = x0.a(context);
        this.f40806b = contextA != null ? contextA : context;
        this.f40807c = placement;
        this.d = strArr;
        this.f40808e = trackingParams;
        this.f = j;
        this.m = z2;
        this.k = new WeakReference(zfVar);
    }

    public final void a() {
        if (this.f40809h && this.f40810i) {
            this.f40805a.removeCallbacksAndMessages(null);
            this.f -= System.currentTimeMillis() - this.g;
            this.f40810i = false;
        }
    }

    public final void b(String str, JSONObject jSONObject) {
        boolean z2;
        synchronized (this.f40812n) {
            try {
                z2 = this.m;
                if (z2) {
                    this.f40811l = new yf(this, str, jSONObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            c(str, jSONObject);
        } else if (a(4)) {
            g9 g9Var = new g9(h9.d);
            g9Var.d = "SI.defImp";
            g9Var.f41004i = android.support.v4.media.a.C("reason=", str);
            g9Var.a();
        }
    }

    public final void c() {
        if (this.j.get() != 0) {
            return;
        }
        if (!o) {
            b(null, null);
            return;
        }
        long j = this.f;
        if (this.f40810i) {
            return;
        }
        this.f40810i = true;
        if (!this.f40809h) {
            this.f40809h = true;
        }
        this.g = System.currentTimeMillis();
        this.f40805a.postDelayed(new xf(this), j);
    }

    public final void a(String str, JSONObject jSONObject) {
        b(str, jSONObject);
        this.f40809h = false;
        this.f40805a.removeCallbacksAndMessages(null);
        this.f40810i = false;
        this.g = 0L;
    }

    public static boolean a(int i2) {
        AnalyticsConfig analyticsConfigH = MetaData.E().h();
        ComponentInfoEventConfig componentInfoEventConfigI = analyticsConfigH != null ? analyticsConfigH.i() : null;
        return componentInfoEventConfigI != null && componentInfoEventConfigI.a((long) i2);
    }

    public final void c(String str, JSONObject jSONObject) {
        if (!this.j.compareAndSet(0, 1)) {
            int iIncrementAndGet = this.j.incrementAndGet();
            if (a(str != null ? 2 : 1)) {
                g9 g9Var = new g9(h9.d);
                g9Var.d = "SI.repImp";
                g9Var.f41004i = android.support.v4.media.a.C("reason=", str);
                g9Var.f41002e = String.valueOf(iIncrementAndGet);
                g9Var.a();
                return;
            }
            return;
        }
        String strA = null;
        if (str == null) {
            Context context = this.f40806b;
            String[] strArr = this.d;
            TrackingParams trackingParams = this.f40808e;
            if (context != null && strArr != null) {
                e9.a(context, Arrays.asList(strArr), trackingParams);
            }
            zf zfVar = (zf) this.k.get();
            if (zfVar != null) {
                String[] strArr2 = this.d;
                if (strArr2 != null && strArr2.length > 0) {
                    strA = h0.a(strArr2[0], (String) null);
                }
                zfVar.a(strA);
            }
            try {
                v0 v0Var = (v0) com.startapp.sdk.components.a.a(this.f40806b).f40732Q.a();
                AdPreferences.Placement placement = this.f40807c;
                ConcurrentHashMap concurrentHashMap = v0Var.f41555c;
                Integer num = (Integer) concurrentHashMap.get(placement);
                concurrentHashMap.put(placement, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                return;
            } catch (Throwable th) {
                g9.a(th);
                return;
            }
        }
        String[] strArr3 = this.d;
        TrackingParams trackingParams2 = this.f40808e;
        h0.a(strArr3, trackingParams2 != null ? trackingParams2.a() : null, 0, str, jSONObject);
    }

    public final void b() {
        yf yfVar;
        synchronized (this.f40812n) {
            yfVar = this.f40811l;
            this.m = false;
            this.f40811l = null;
        }
        if (yfVar != null) {
            yfVar.run();
        }
        if (a(4)) {
            g9 g9Var = new g9(h9.d);
            g9Var.d = "SI.prcImp";
            StringBuilder sb = new StringBuilder("impr=");
            sb.append(yfVar != null);
            g9Var.f41004i = sb.toString();
            g9Var.a();
        }
    }
}

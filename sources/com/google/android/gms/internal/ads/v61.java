package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v61 implements p61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21064a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f21065b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f21066c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21067d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21068e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f21069f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f21070g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f21071h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f21072i = SystemClock.uptimeMillis();

    public static boolean d(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            return str.contains("INTERSTITIAL") || str.contains("APP_OPEN") || str.contains("REWARDED");
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final synchronized void a(HashMap map, Context context, View view) {
        WindowManager windowManager;
        try {
            this.f21067d = this.f21066c;
            this.f21066c = SystemClock.uptimeMillis();
            long j10 = this.f21068e;
            if (j10 != -1) {
                this.f21069f = j10;
            }
            DisplayMetrics displayMetrics = null;
            if ((Build.VERSION.SDK_INT < 33 || context.isUiContext()) && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                displayMetrics = new DisplayMetrics();
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (NoSuchMethodError unused) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            }
            if (displayMetrics != null) {
                int i10 = displayMetrics.widthPixels * displayMetrics.heightPixels;
                if (view != null) {
                    int iMin = Math.min(view.getWidth(), displayMetrics.widthPixels) * Math.min(view.getHeight(), displayMetrics.heightPixels);
                    if (iMin + iMin >= i10 || (iMin == 0 && d(view))) {
                        this.f21068e = this.f21066c;
                    }
                }
                e(map);
            }
            this.f21068e = -1L;
            e(map);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final synchronized void b(HashMap map) {
        this.f21071h = this.f21070g;
        this.f21070g = SystemClock.uptimeMillis();
        e(map);
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final synchronized void c(HashMap map) {
        this.f21065b = this.f21064a;
        this.f21064a = SystemClock.uptimeMillis();
        e(map);
    }

    public final void e(HashMap map) {
        map.put("tcq", Long.valueOf(this.f21064a));
        map.put("tpq", Long.valueOf(this.f21065b));
        map.put("tcc", Long.valueOf(this.f21070g));
        map.put("tpc", Long.valueOf(this.f21071h));
        map.put("tpv", Long.valueOf(this.f21067d));
        map.put("tcv", Long.valueOf(this.f21066c));
        map.put("tchv", Long.valueOf(this.f21068e));
        map.put("tphv", Long.valueOf(this.f21069f));
        map.put("tst", Long.valueOf(this.f21072i));
    }
}

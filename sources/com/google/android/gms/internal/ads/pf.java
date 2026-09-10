package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.shadow.okhttp3.internal.http2.Http2Stream;
import com.google.android.gms.ads.internal.client.zzba;
import com.unity3d.services.UnityAdsConstants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pf implements of {
    public static vf A = null;
    public static mg B = null;
    public static b2 C = null;
    public static af D = null;
    public static so0 E = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static volatile fg f18596w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object f18597x = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f18598y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static long f18599z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MotionEvent f18600a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f18609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f18610k;
    public double l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f18611m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f18612n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f18613o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f18614p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DisplayMetrics f18617s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g9 f18618t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final t6.l f18619u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public kg f18620v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList f18601b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18602c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18603d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18604e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18605f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18606g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18607h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18608i = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18615q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18616r = false;

    public pf(Context context, t6.l lVar) {
        try {
            cf.a();
            this.f18617s = context.getResources().getDisplayMetrics();
            if (((Boolean) zzba.zzc().a(am.L3)).booleanValue()) {
                this.f18618t = new g9();
            }
        } catch (Throwable unused) {
        }
        new HashMap();
        this.f18619u = lVar;
    }

    public static fg e(Context context, boolean z10) {
        if (f18596w == null) {
            synchronized (f18597x) {
                try {
                    if (f18596w == null) {
                        fg fgVarA = fg.a(context, z10, E);
                        if (fgVarA.f14399n) {
                            try {
                                if (((Boolean) zzba.zzc().a(am.f12325r4)).booleanValue()) {
                                    fgVarA.c("dDkHRfh96kWRNKlCuQv4bcbQkP8hTl8+IryaCt9cMd/svBIVo0Uo/vCqMYwPlijS", "lGOVu04SK1qS7YTVL1GWrSv+Cf1XKJpvbu7KHhGh7cY=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            fgVarA.c("8cGCIT8G/u06HQUQMiN2ifk8cEgbx/Wk97figDVCx+GQZgadMjHBVKMl6PUoXm9E", "8+d2WBKGjAoApH75NCR/Aqn77d5NBFIHb0YR3dAdyeE=", Context.class);
                            if (((Boolean) zzba.zzc().a(am.v4)).booleanValue()) {
                                fgVarA.c("iCmAdyXMN2wNdoDGZPKplFblNf0e3f9Gr4uP4gCRDt/ctzDAq8UfSYwC5u9g4DzW", "9N+K+19jT0YQFPQktH9XDgnqiWtwN+75+qmtGpYeo7Q=", new Class[0]);
                            }
                            fgVarA.c("00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", Context.class);
                            fgVarA.c("XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", Context.class);
                            fgVarA.c("m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", Context.class);
                            fgVarA.c("P28XMQKwxb7t4RJM54Abd563bFUm9uASQiuwtqttjr6XDpyPt/FmHs2sVrWjtmTo", "fagQaENWAKeTH7PQjt5vlJiCBcOZOOnM19vGSn9sDlA=", Context.class);
                            Class cls = Boolean.TYPE;
                            fgVarA.c("IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", Context.class, cls);
                            fgVarA.c("GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", Context.class);
                            fgVarA.c("2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", Context.class);
                            fgVarA.c("6fpJXJ/0mHk1BKHieJD271QStaRup/Ve1zgTWQI+7BRFgC5McwJ3e2UlmdWs2x64", "/HyusJxcst6GC6sxvcSXH3tMw8sGRae2S909c2O+Y30=", MotionEvent.class, DisplayMetrics.class);
                            fgVarA.c("t5yhqOem6jC98WR50f+SLS3Uk3sKCmIuutsKOnbEcikRe3zXPIZnZid7K20GrtZF", "M9gaAFNEKOV8YNe1CyHBBl548FwxQflqXjyA5kKaJak=", MotionEvent.class, DisplayMetrics.class);
                            fgVarA.c("y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", new Class[0]);
                            fgVarA.c("9v14GmYq1mityfaROUYQVHNDWlAgc2TzwyjcWsJSVQ5o6aEyLVnDo4vbeNXmh2ew", "zGbmNDn+uB00oiAu0ISzPA2QynMDAioh3MLj5VQvTcg=", new Class[0]);
                            fgVarA.c("XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", new Class[0]);
                            fgVarA.c("c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", new Class[0]);
                            fgVarA.c("AeJvLHy+YL60Equ2/UpZQs9Ok34RPgGTn80fnG3Dx4JfdgAW65En0T0IJD/U8yYs", "sawjrbkZQHxExWkkVyDhv0h3fWiUMmvl7E2YVLpKa+A=", new Class[0]);
                            fgVarA.c("Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", new Class[0]);
                            fgVarA.c("Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", Context.class, cls, String.class);
                            fgVarA.c("X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", StackTraceElement[].class);
                            fgVarA.c("K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", View.class, DisplayMetrics.class, cls, cls);
                            fgVarA.c("NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", Context.class, cls);
                            fgVarA.c("9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", View.class, Activity.class, cls);
                            Class cls2 = Long.TYPE;
                            fgVarA.c("CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", cls2);
                            fgVarA.c("PmZORt2h3FILlRchj3l8QFpH1b4WBi8LAKFq8qXvSXgGWHByOiAJxaqMK9WTkxzB", "Ox3joL3a7fFzYIlEQut3utwsOQDntBqHwHmTdzF1H8c=", new Class[0]);
                            fgVarA.c("sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", Context.class);
                            fgVarA.c("Di5PWAjPtHVrwnaWVY5fRaO+JCXGdUjCOQOYEnFfzjx5tiFy99P00V458wl3+tMS", "24rToqMdm9KIBSWWVKIVzZ6Fu9mGVX1qRD30P4LVPjg=", Context.class);
                            fgVarA.c("0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", NetworkCapabilities.class, cls2, cls2);
                            fgVarA.c("/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", List.class);
                            fgVarA.c("4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", cls2, cls2, cls2, cls2);
                        }
                        f18596w = fgVarA;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f18596w;
    }

    public static hg g(fg fgVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws zf {
        Method methodD = fgVar.d("6fpJXJ/0mHk1BKHieJD271QStaRup/Ve1zgTWQI+7BRFgC5McwJ3e2UlmdWs2x64", "/HyusJxcst6GC6sxvcSXH3tMw8sGRae2S909c2O+Y30=");
        if (methodD == null || motionEvent == null) {
            throw new zf();
        }
        try {
            return new hg((String) methodD.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new zf(e10);
        }
    }

    public static final void i(List list) {
        ExecutorService executorService;
        if (f18596w == null || (executorService = f18596w.f14388b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) zzba.zzc().a(am.B3)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            char[] cArr = ig.f15734a;
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            Log.d("pf", "class methods got exception: " + stringWriter.toString());
        }
    }

    public final xd a(Context context) {
        long j10;
        mg mgVar = B;
        if (mgVar != null && mgVar.f17430d) {
            mgVar.f17428b = System.currentTimeMillis();
        }
        b2 b2Var = C;
        b2Var.f12597b = b2Var.f12596a;
        b2Var.f12596a = SystemClock.uptimeMillis();
        xd xdVarA0 = je.A0();
        t6.l lVar = this.f18619u;
        String str = (String) lVar.f50550c;
        if (!TextUtils.isEmpty(str)) {
            xdVarA0.b();
            ((je) xdVarA0.f19193b).D0(str);
        }
        fg fgVarE = e(context, lVar.f50549b);
        if (fgVarE.f14388b != null) {
            int iE = fgVarE.e();
            ArrayList arrayList = new ArrayList();
            if (fgVarE.f14399n) {
                arrayList.add(new pg(fgVarE, xdVarA0, iE, context, (td) lVar.f50551d, D));
                arrayList.add(new rg(fgVarE, xdVarA0, f18599z, iE));
                arrayList.add(new qg(fgVarE, xdVarA0, iE, 3));
                arrayList.add(new ng(fgVarE, xdVarA0, iE, context));
                arrayList.add(new qg(fgVarE, xdVarA0, iE, 4));
                arrayList.add(new og(fgVarE, xdVarA0, iE, context));
                arrayList.add(new qg(fgVarE, xdVarA0, iE, 7));
                arrayList.add(new qg(fgVarE, xdVarA0, iE, 9));
                arrayList.add(new qg(fgVarE, xdVarA0, iE, 10));
                arrayList.add(new qg(fgVarE, xdVarA0, iE, 0));
                arrayList.add(new qg(fgVarE, xdVarA0, iE, 2));
                arrayList.add(new qg(fgVarE, xdVarA0, iE, 13));
                arrayList.add(new qg(fgVarE, xdVarA0, iE, 6));
                arrayList.add(new qg(fgVarE, xdVarA0, iE, 12));
                arrayList.add(new vg(fgVarE, xdVarA0, iE));
                mg mgVar2 = B;
                long j11 = -1;
                if (mgVar2 != null) {
                    long j12 = mgVar2.f17430d ? mgVar2.f17428b - mgVar2.f17427a : -1L;
                    long j13 = mgVar2.f17429c;
                    mgVar2.f17429c = -1L;
                    j11 = j12;
                    j10 = j13;
                } else {
                    j10 = -1;
                }
                arrayList.add(new tg(fgVarE, xdVarA0, iE, A, j11, j10));
                arrayList.add(new qg(fgVarE, xdVarA0, iE, 11));
                qg qgVar = new qg(fgVarE, "Di5PWAjPtHVrwnaWVY5fRaO+JCXGdUjCOQOYEnFfzjx5tiFy99P00V458wl3+tMS", "24rToqMdm9KIBSWWVKIVzZ6Fu9mGVX1qRD30P4LVPjg=", xdVarA0, iE, 76, 8);
                xdVarA0 = xdVarA0;
                arrayList.add(qgVar);
                arrayList.add(new qg(fgVarE, xdVarA0, iE, 5));
                if (((Boolean) zzba.zzc().a(am.v4)).booleanValue()) {
                    qg qgVar2 = new qg(fgVarE, "iCmAdyXMN2wNdoDGZPKplFblNf0e3f9Gr4uP4gCRDt/ctzDAq8UfSYwC5u9g4DzW", "9N+K+19jT0YQFPQktH9XDgnqiWtwN+75+qmtGpYeo7Q=", xdVarA0, iE, 82, 1);
                    xdVarA0 = xdVarA0;
                    arrayList.add(qgVar2);
                }
            } else {
                xdVarA0.i(Http2Stream.EMIT_BUFFER_SIZE);
            }
            i(arrayList);
        }
        return xdVarA0;
    }

    public final hg b(MotionEvent motionEvent) throws zf {
        Method methodD = f18596w.d("t5yhqOem6jC98WR50f+SLS3Uk3sKCmIuutsKOnbEcikRe3zXPIZnZid7K20GrtZF", "M9gaAFNEKOV8YNe1CyHBBl548FwxQflqXjyA5kKaJak=");
        if (methodD == null || motionEvent == null) {
            throw new zf();
        }
        try {
            return new hg((String) methodD.invoke(null, motionEvent, this.f18617s));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new zf(e10);
        }
    }

    public final long c(StackTraceElement[] stackTraceElementArr) throws zf {
        Method methodD = f18596w.d("X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=");
        if (methodD == null || stackTraceElementArr == null) {
            throw new zf();
        }
        try {
            return new tf((String) methodD.invoke(null, stackTraceElementArr)).T.longValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new zf(e10);
        }
    }

    public final void d() {
        this.f18606g = 0L;
        this.f18602c = 0L;
        this.f18603d = 0L;
        this.f18604e = 0L;
        this.f18605f = 0L;
        this.f18607h = 0L;
        this.f18608i = 0L;
        LinkedList linkedList = this.f18601b;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.f18600a;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.f18600a = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x0122  */
    /* JADX WARN: Code duplicated, block: B:69:0x0123 A[Catch: Exception -> 0x017c, TryCatch #2 {Exception -> 0x017c, blocks: (B:66:0x0115, B:69:0x0123, B:71:0x0135, B:73:0x0157, B:82:0x016f, B:72:0x014d, B:85:0x0180), top: B:101:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0135 A[Catch: Exception -> 0x017c, TryCatch #2 {Exception -> 0x017c, blocks: (B:66:0x0115, B:69:0x0123, B:71:0x0135, B:73:0x0157, B:82:0x016f, B:72:0x014d, B:85:0x0180), top: B:101:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x014d A[Catch: Exception -> 0x017c, TryCatch #2 {Exception -> 0x017c, blocks: (B:66:0x0115, B:69:0x0123, B:71:0x0135, B:73:0x0157, B:82:0x016f, B:72:0x014d, B:85:0x0180), top: B:101:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x015f A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final String f(Context context, String str, int i10, View view, Activity activity) {
        nf nfVar;
        String str2;
        boolean z10;
        char c4;
        Exception exc;
        xd xdVarA0;
        char c5;
        int i11;
        int i12;
        long jCurrentTimeMillis;
        int i13;
        ue ueVarB;
        byte[] bArrB;
        String strEncodeToString;
        int i14;
        int i15;
        ?? r10 = i10;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.A3)).booleanValue();
        if (zBooleanValue) {
            nfVar = f18596w != null ? f18596w.f14397k : null;
            str2 = "be";
        } else {
            nfVar = null;
            str2 = null;
        }
        try {
            if (r10 == 3) {
                try {
                    mg mgVar = B;
                    if (mgVar != null && mgVar.f17430d) {
                        mgVar.f17428b = System.currentTimeMillis();
                    }
                    b2 b2Var = C;
                    b2Var.f12603h = b2Var.f12602g;
                    b2Var.f12602g = SystemClock.uptimeMillis();
                    xdVarA0 = je.A0();
                    t6.l lVar = this.f18619u;
                    String str3 = (String) lVar.f50550c;
                    if (!TextUtils.isEmpty(str3)) {
                        xdVarA0.b();
                        ((je) xdVarA0.f19193b).D0(str3);
                    }
                    c5 = 3;
                    h(e(context, lVar.f50549b), xdVarA0, view, activity, true, context);
                    try {
                        this.f18615q = true;
                        i15 = 1002;
                    } catch (Exception e10) {
                        exc = e10;
                        z10 = true;
                        c4 = 2;
                        if (zBooleanValue && nfVar != null) {
                            if (r10 == c5) {
                                i12 = 1003;
                            } else {
                                if (r10 == c4) {
                                    i12 = 1009;
                                } else {
                                    i11 = 1001;
                                    r10 = z10;
                                }
                                nfVar.a(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                            }
                            i11 = i12;
                            r10 = r10;
                            nfVar.a(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                        }
                        jCurrentTimeMillis = System.currentTimeMillis();
                        if (xdVarA0 != null) {
                            try {
                                if (((je) xdVarA0.e()).d(null) != 0) {
                                    je jeVar = (je) xdVarA0.e();
                                    boolean z11 = cf.f13145a;
                                    ueVarB = cf.b(str, jeVar.b());
                                    if (ueVarB == null) {
                                        xd xdVarA1 = je.A0();
                                        xdVarA1.i(4096L);
                                        bArrB = cf.d(((je) xdVarA1.e()).b(), str, z10);
                                    } else {
                                        bArrB = ((ve) ueVarB.e()).b();
                                    }
                                    strEncodeToString = Base64.encodeToString(bArrB, 11);
                                    if (zBooleanValue) {
                                        return strEncodeToString;
                                    }
                                    return strEncodeToString;
                                }
                            } catch (Exception e11) {
                                String string = Integer.toString(7);
                                if (!zBooleanValue || nfVar == null) {
                                    return string;
                                }
                                if (r10 == c5) {
                                    i13 = 1007;
                                } else {
                                    i13 = r10 == c4 ? 1011 : 1005;
                                }
                                nfVar.a(i13, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e11);
                                return string;
                            }
                        }
                        return Integer.toString(5);
                    }
                } catch (Exception e12) {
                    e = e12;
                    c5 = 3;
                    z10 = true;
                    c4 = 2;
                    exc = e;
                    xdVarA0 = null;
                    if (zBooleanValue) {
                        if (r10 == c5) {
                            i12 = 1003;
                        } else {
                            if (r10 == c4) {
                                i12 = 1009;
                            } else {
                                i11 = 1001;
                                r10 = z10;
                            }
                            nfVar.a(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                        }
                        i11 = i12;
                        r10 = r10;
                        nfVar.a(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (xdVarA0 != null) {
                        if (((je) xdVarA0.e()).d(null) != 0) {
                            je jeVar2 = (je) xdVarA0.e();
                            boolean z12 = cf.f13145a;
                            ueVarB = cf.b(str, jeVar2.b());
                            if (ueVarB == null) {
                                xd xdVarA2 = je.A0();
                                xdVarA2.i(4096L);
                                bArrB = cf.d(((je) xdVarA2.e()).b(), str, z10);
                            } else {
                                bArrB = ((ve) ueVarB.e()).b();
                            }
                            strEncodeToString = Base64.encodeToString(bArrB, 11);
                            if (zBooleanValue) {
                                return strEncodeToString;
                            }
                            return strEncodeToString;
                        }
                    }
                    return Integer.toString(5);
                }
            } else {
                c5 = 3;
                if (r10 == 2) {
                    mg mgVar2 = B;
                    if (mgVar2 != null && mgVar2.f17430d) {
                        mgVar2.f17428b = System.currentTimeMillis();
                    }
                    C.c(context, view);
                    xdVarA0 = je.A0();
                    t6.l lVar2 = this.f18619u;
                    String str4 = (String) lVar2.f50550c;
                    xdVarA0.b();
                    ((je) xdVarA0.f19193b).D0(str4);
                    h(e(context, lVar2.f50549b), xdVarA0, view, activity, false, context);
                    i15 = 1008;
                } else {
                    xdVarA0 = a(context);
                    i15 = 1000;
                }
            }
            if (!zBooleanValue || nfVar == null) {
                z10 = true;
                c4 = 2;
            } else {
                try {
                    c4 = 2;
                    z10 = true;
                    try {
                        nfVar.a(i15, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                    } catch (Exception e13) {
                        e = e13;
                        exc = e;
                        if (zBooleanValue) {
                            if (r10 == c5) {
                                i12 = 1003;
                            } else {
                                if (r10 == c4) {
                                    i12 = 1009;
                                } else {
                                    i11 = 1001;
                                    r10 = z10;
                                }
                                nfVar.a(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                            }
                            i11 = i12;
                            r10 = r10;
                            nfVar.a(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                        }
                    }
                } catch (Exception e14) {
                    e = e14;
                    z10 = true;
                    c4 = 2;
                }
            }
        } catch (Exception e15) {
            e = e15;
        }
        jCurrentTimeMillis = System.currentTimeMillis();
        if (xdVarA0 != null) {
            if (((je) xdVarA0.e()).d(null) != 0) {
                je jeVar3 = (je) xdVarA0.e();
                boolean z13 = cf.f13145a;
                ueVarB = cf.b(str, jeVar3.b());
                if (ueVarB == null) {
                    xd xdVarA3 = je.A0();
                    xdVarA3.i(4096L);
                    bArrB = cf.d(((je) xdVarA3.e()).b(), str, z10);
                } else {
                    bArrB = ((ve) ueVarB.e()).b();
                }
                strEncodeToString = Base64.encodeToString(bArrB, 11);
                if (zBooleanValue || nfVar == null) {
                    return strEncodeToString;
                }
                if (r10 == c5) {
                    i14 = 1006;
                } else {
                    i14 = r10 == c4 ? 1010 : 1004;
                }
                nfVar.a(i14, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                return strEncodeToString;
            }
        }
        return Integer.toString(5);
    }

    public final void h(fg fgVar, xd xdVar, View view, Activity activity, boolean z10, Context context) {
        ArrayList arrayList;
        long j10;
        long j11;
        MotionEvent motionEvent;
        List listAsList;
        int i10 = 1;
        if (fgVar.f14399n) {
            synchronized (this) {
                try {
                    try {
                        hg hgVarG = g(fgVar, this.f18600a, this.f18617s);
                        Long l = hgVarG.S;
                        if (l != null) {
                            long jLongValue = l.longValue();
                            xdVar.b();
                            ((je) xdVar.f19193b).J0(jLongValue);
                        }
                        Long l10 = hgVarG.T;
                        if (l10 != null) {
                            long jLongValue2 = l10.longValue();
                            xdVar.b();
                            ((je) xdVar.f19193b).K0(jLongValue2);
                        }
                        Long l11 = hgVarG.U;
                        if (l11 != null) {
                            long jLongValue3 = l11.longValue();
                            xdVar.b();
                            ((je) xdVar.f19193b).L0(jLongValue3);
                        }
                        if (this.f18616r) {
                            Long l12 = hgVarG.V;
                            if (l12 != null) {
                                long jLongValue4 = l12.longValue();
                                xdVar.b();
                                ((je) xdVar.f19193b).F(jLongValue4);
                            }
                            Long l13 = hgVarG.W;
                            if (l13 != null) {
                                long jLongValue5 = l13.longValue();
                                xdVar.b();
                                ((je) xdVar.f19193b).G(jLongValue5);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (zf unused) {
                }
                fe feVarZ = ge.z();
                if (this.f18602c > 0) {
                    DisplayMetrics displayMetrics = this.f18617s;
                    char[] cArr = ig.f15734a;
                    if ((displayMetrics == null || displayMetrics.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true) {
                        long jB = ig.b(this.f18609j, displayMetrics);
                        feVarZ.b();
                        ((ge) feVarZ.f19193b).L(jB);
                        long jB2 = ig.b(this.f18613o - this.f18611m, this.f18617s);
                        feVarZ.b();
                        ((ge) feVarZ.f19193b).M(jB2);
                        long jB3 = ig.b(this.f18614p - this.f18612n, this.f18617s);
                        feVarZ.b();
                        ((ge) feVarZ.f19193b).N(jB3);
                        long jB4 = ig.b(this.f18611m, this.f18617s);
                        feVarZ.b();
                        ((ge) feVarZ.f19193b).Q(jB4);
                        long jB5 = ig.b(this.f18612n, this.f18617s);
                        feVarZ.b();
                        ((ge) feVarZ.f19193b).R(jB5);
                        if (this.f18616r && (motionEvent = this.f18600a) != null) {
                            long jB6 = ig.b(((this.f18611m - this.f18613o) + motionEvent.getRawX()) - this.f18600a.getX(), this.f18617s);
                            if (jB6 != 0) {
                                feVarZ.b();
                                ((ge) feVarZ.f19193b).O(jB6);
                            }
                            long jB7 = ig.b(((this.f18612n - this.f18614p) + this.f18600a.getRawY()) - this.f18600a.getY(), this.f18617s);
                            if (jB7 != 0) {
                                feVarZ.b();
                                ((ge) feVarZ.f19193b).P(jB7);
                            }
                        }
                    }
                }
                try {
                    hg hgVarB = b(this.f18600a);
                    Long l14 = hgVarB.S;
                    if (l14 != null) {
                        long jLongValue6 = l14.longValue();
                        feVarZ.b();
                        ((ge) feVarZ.f19193b).A(jLongValue6);
                    }
                    Long l15 = hgVarB.T;
                    if (l15 != null) {
                        long jLongValue7 = l15.longValue();
                        feVarZ.b();
                        ((ge) feVarZ.f19193b).B(jLongValue7);
                    }
                    long jLongValue8 = hgVarB.U.longValue();
                    feVarZ.b();
                    ((ge) feVarZ.f19193b).H(jLongValue8);
                    if (this.f18616r) {
                        Long l16 = hgVarB.W;
                        if (l16 != null) {
                            long jLongValue9 = l16.longValue();
                            feVarZ.b();
                            ((ge) feVarZ.f19193b).C(jLongValue9);
                        }
                        Long l17 = hgVarB.V;
                        if (l17 != null) {
                            long jLongValue10 = l17.longValue();
                            feVarZ.b();
                            ((ge) feVarZ.f19193b).F(jLongValue10);
                        }
                        Long l18 = hgVarB.X;
                        if (l18 != null) {
                            int i11 = l18.longValue() != 0 ? 2 : 1;
                            feVarZ.b();
                            ((ge) feVarZ.f19193b).S(i11);
                        }
                        long j12 = this.f18603d;
                        if (j12 > 0) {
                            DisplayMetrics displayMetrics2 = this.f18617s;
                            char[] cArr2 = ig.f15734a;
                            Long lValueOf = displayMetrics2 != null && (displayMetrics2.density > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (displayMetrics2.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.f18608i / j12)) : null;
                            if (lValueOf != null) {
                                long jLongValue11 = lValueOf.longValue();
                                feVarZ.b();
                                ((ge) feVarZ.f19193b).D(jLongValue11);
                            } else {
                                feVarZ.b();
                                ((ge) feVarZ.f19193b).E();
                            }
                            long jRound = Math.round(this.f18607h / this.f18603d);
                            feVarZ.b();
                            ((ge) feVarZ.f19193b).G(jRound);
                        }
                        Long l19 = hgVarB.f15275a0;
                        if (l19 != null) {
                            long jLongValue12 = l19.longValue();
                            feVarZ.b();
                            ((ge) feVarZ.f19193b).J(jLongValue12);
                        }
                        Long l20 = hgVarB.f15276b0;
                        if (l20 != null) {
                            long jLongValue13 = l20.longValue();
                            feVarZ.b();
                            ((ge) feVarZ.f19193b).I(jLongValue13);
                        }
                        Long l21 = hgVarB.f15277c0;
                        if (l21 != null) {
                            int i12 = l21.longValue() != 0 ? 2 : 1;
                            feVarZ.b();
                            ((ge) feVarZ.f19193b).T(i12);
                        }
                    }
                } catch (zf unused2) {
                }
                long j13 = this.f18606g;
                if (j13 > 0) {
                    feVarZ.b();
                    ((ge) feVarZ.f19193b).K(j13);
                }
                ge geVar = (ge) feVarZ.e();
                xdVar.b();
                ((je) xdVar.f19193b).S(geVar);
                long j14 = this.f18602c;
                if (j14 > 0) {
                    xdVar.b();
                    ((je) xdVar.f19193b).J(j14);
                }
                long j15 = this.f18603d;
                if (j15 > 0) {
                    xdVar.b();
                    ((je) xdVar.f19193b).I(j15);
                }
                long j16 = this.f18604e;
                if (j16 > 0) {
                    xdVar.b();
                    ((je) xdVar.f19193b).H(j16);
                }
                long j17 = this.f18605f;
                if (j17 > 0) {
                    xdVar.b();
                    ((je) xdVar.f19193b).K(j17);
                }
                try {
                    LinkedList linkedList = this.f18601b;
                    int size = linkedList.size() - 1;
                    if (size > 0) {
                        xdVar.b();
                        ((je) xdVar.f19193b).U();
                        for (int i13 = 0; i13 < size; i13++) {
                            hg hgVarG2 = g(f18596w, (MotionEvent) linkedList.get(i13), this.f18617s);
                            fe feVarZ2 = ge.z();
                            long jLongValue14 = hgVarG2.S.longValue();
                            feVarZ2.b();
                            ((ge) feVarZ2.f19193b).A(jLongValue14);
                            long jLongValue15 = hgVarG2.T.longValue();
                            feVarZ2.b();
                            ((ge) feVarZ2.f19193b).B(jLongValue15);
                            ge geVar2 = (ge) feVarZ2.e();
                            xdVar.b();
                            ((je) xdVar.f19193b).T(geVar2);
                        }
                    }
                } catch (zf unused3) {
                    xdVar.b();
                    ((je) xdVar.f19193b).U();
                }
            }
            arrayList = new ArrayList();
            listAsList = arrayList;
            if (fgVar.f14388b != null) {
                int iE = fgVar.e();
                if (((Boolean) zzba.zzc().a(am.K3)).booleanValue()) {
                    arrayList.add(new pg(fgVar, xdVar, iE, context, (td) this.f18619u.f50551d, D));
                    arrayList.add(new og(fgVar, xdVar, iE, context));
                    arrayList.add(new ng(fgVar, xdVar, iE, context));
                    arrayList.add(new qg(fgVar, xdVar, iE, 4));
                    mg mgVar = B;
                    if (mgVar != null) {
                        long j18 = mgVar.f17430d ? mgVar.f17428b - mgVar.f17427a : -1L;
                        long j19 = mgVar.f17429c;
                        mgVar.f17429c = -1L;
                        j11 = j18;
                        j10 = j19;
                    } else {
                        j10 = -1;
                        j11 = -1;
                    }
                    arrayList.add(new tg(fgVar, xdVar, iE, A, j11, j10));
                    arrayList.add(new qg(fgVar, xdVar, iE, 11));
                }
                arrayList.add(new ze(i10, fgVar, xdVar));
                arrayList.add(new qg(fgVar, xdVar, iE, 3));
                arrayList.add(new rg(fgVar, xdVar, f18599z, iE));
                arrayList.add(new qg(fgVar, xdVar, iE, 0));
                arrayList.add(new qg(fgVar, xdVar, iE, 9));
                arrayList.add(new qg(fgVar, xdVar, iE, 10));
                arrayList.add(new qg(fgVar, xdVar, iE, 2));
                arrayList.add(new qg(fgVar, xdVar, iE, 7));
                arrayList.add(new qg(fgVar, xdVar, iE, 13));
                arrayList.add(new qg(fgVar, xdVar, iE, 6));
                arrayList.add(new qg(fgVar, xdVar, iE, 12));
                arrayList.add(new sg(fgVar, xdVar, iE, new Throwable().getStackTrace()));
                arrayList.add(new sg(fgVar, xdVar, iE, view));
                arrayList.add(new vg(fgVar, xdVar, iE));
                if (((Boolean) zzba.zzc().a(am.C3)).booleanValue()) {
                    arrayList.add(new ng(fgVar, xdVar, iE, view, activity));
                }
                arrayList.add(new qg(fgVar, xdVar, iE, 5));
                if (!z10) {
                    arrayList.add(new sg(fgVar, xdVar, iE, C));
                    arrayList.add(new sg(fgVar, xdVar, iE, this.f18618t));
                    listAsList = arrayList;
                } else if (((Boolean) zzba.zzc().a(am.E3)).booleanValue()) {
                    listAsList = arrayList;
                    arrayList.add(new wg(fgVar, xdVar, iE, this.f18620v));
                    listAsList = arrayList;
                }
            }
        } else {
            xdVar.i(Http2Stream.EMIT_BUFFER_SIZE);
            listAsList = Arrays.asList(new ze(i10, fgVar, xdVar));
        }
        listAsList = arrayList;
        i(listAsList);
    }

    @Override // com.google.android.gms.internal.ads.of
    public final synchronized void zzd(MotionEvent motionEvent) {
        Long l;
        try {
            if (this.f18615q) {
                d();
                this.f18615q = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f18609j = 0.0d;
                this.f18610k = motionEvent.getRawX();
                this.l = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d10 = rawX - this.f18610k;
                double d11 = rawY - this.l;
                this.f18609j += Math.sqrt((d11 * d11) + (d10 * d10));
                this.f18610k = rawX;
                this.l = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f18600a = motionEventObtain;
                        LinkedList linkedList = this.f18601b;
                        linkedList.add(motionEventObtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.f18604e++;
                        this.f18606g = c(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f18603d += (long) (motionEvent.getHistorySize() + 1);
                        hg hgVarB = b(motionEvent);
                        Long l10 = hgVarB.V;
                        if (l10 != null && hgVarB.Y != null) {
                            this.f18607h = l10.longValue() + hgVarB.Y.longValue() + this.f18607h;
                        }
                        if (this.f18617s != null && (l = hgVarB.W) != null && hgVarB.Z != null) {
                            this.f18608i = l.longValue() + hgVarB.Z.longValue() + this.f18608i;
                        }
                    } else if (action2 == 3) {
                        this.f18605f++;
                    }
                } catch (zf unused) {
                }
            } else {
                this.f18611m = motionEvent.getX();
                this.f18612n = motionEvent.getY();
                this.f18613o = motionEvent.getRawX();
                this.f18614p = motionEvent.getRawY();
                this.f18602c++;
            }
            this.f18616r = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    public final synchronized void zze(int i10, int i11, int i12) {
        try {
            if (this.f18600a != null) {
                if (((Boolean) zzba.zzc().a(am.f12433y3)).booleanValue()) {
                    d();
                } else {
                    this.f18600a.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f18617s;
            if (displayMetrics != null) {
                float f10 = displayMetrics.density;
                this.f18600a = MotionEvent.obtain(0L, i12, 1, i10 * f10, i11 * f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
            } else {
                this.f18600a = null;
            }
            this.f18616r = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzf(Context context, String str, View view, Activity activity) {
        return f(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzg(Context context, String str, View view) {
        return f(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.of
    public final void zzh(View view) {
        if (((Boolean) zzba.zzc().a(am.E3)).booleanValue()) {
            if (this.f18620v == null) {
                fg fgVar = f18596w;
                this.f18620v = new kg(fgVar.f14387a, fgVar.f14400o);
            }
            this.f18620v.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        g9 g9Var;
        if (!((Boolean) zzba.zzc().a(am.L3)).booleanValue() || (g9Var = this.f18618t) == null) {
            return;
        }
        g9Var.f14798a = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzj(Context context, View view, Activity activity) {
        return f(context, null, 2, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzl(Context context) {
        char[] cArr = ig.f15734a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return f(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }
}

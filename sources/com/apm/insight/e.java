package com.apm.insight;

import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.g;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f10070a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Application f10071b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f10072c = 0;
    private static String d = "default";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f10073e = false;
    private static com.apm.insight.nativecrash.b f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f10075i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile String f10077n;
    private static ConfigManager g = new ConfigManager();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f10074h = new a();
    private static g j = null;
    private static volatile String k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Object f10076l = new Object();
    private static volatile int m = 0;
    private static int o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f10078p = true;
    private static boolean q = true;
    private static boolean r = false;
    private static boolean s = true;
    private static boolean t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static boolean f10079u = true;

    public static com.apm.insight.nativecrash.b a() {
        if (f == null) {
            f = g.a(f10070a);
        }
        return f;
    }

    public static a b() {
        return f10074h;
    }

    public static g c() {
        if (j == null) {
            synchronized (e.class) {
                j = new g();
            }
        }
        return j;
    }

    public static void d(boolean z2) {
        s = z2;
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static String f() {
        if (k == null) {
            synchronized (f10076l) {
                try {
                    if (k == null) {
                        k = Long.toHexString(new Random().nextLong()) + "U";
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return k;
    }

    public static Context g() {
        return f10070a;
    }

    public static Application h() {
        return f10071b;
    }

    public static ConfigManager i() {
        return g;
    }

    public static long j() {
        return f10072c;
    }

    public static String k() {
        return d;
    }

    public static void l() {
        o = 1;
    }

    public static int m() {
        return o;
    }

    public static boolean n() {
        return f10073e;
    }

    public static void o() {
        f10073e = true;
    }

    public static ConcurrentHashMap<Integer, String> p() {
        return f10075i;
    }

    public static int q() {
        return m;
    }

    public static String r() {
        return f10077n;
    }

    public static boolean s() {
        return f10078p;
    }

    public static boolean t() {
        return q;
    }

    public static boolean u() {
        return r;
    }

    public static boolean v() {
        return s;
    }

    public static boolean w() {
        return f10079u;
    }

    public static boolean x() {
        return t;
    }

    public static void b(int i2, String str) {
        m = i2;
        f10077n = str;
    }

    public static boolean d() {
        if (!g.isDebugMode()) {
            return false;
        }
        Object obj = a().a().get("channel");
        return (obj == null ? "unknown" : String.valueOf(obj)).contains("local_test");
    }

    public static void e(boolean z2) {
        f10079u = z2;
    }

    public static void a(com.apm.insight.nativecrash.b bVar) {
        f = bVar;
    }

    public static void b(boolean z2) {
        q = z2;
    }

    public static void a(Application application) {
        if (application != null) {
            f10071b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f10071b == null) {
            f10072c = System.currentTimeMillis();
            f10070a = context;
            f10071b = application;
            k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    public static void c(boolean z2) {
        r = z2;
    }

    public static void f(boolean z2) {
        t = z2;
    }

    public static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f = new com.apm.insight.nativecrash.b(f10070a, iCommonParams, a());
    }

    public static String a(long j2, CrashType crashType, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        sb.append("_");
        sb.append(crashType.getName());
        sb.append('_');
        sb.append(f());
        sb.append('_');
        sb.append(z2 ? "oom_" : "normal_");
        sb.append(f10072c);
        sb.append('_');
        sb.append(z3 ? "ignore_" : "normal_");
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb.toString();
    }

    public static void a(String str) {
        d = str;
    }

    public static void a(int i2, String str) {
        if (f10075i == null) {
            synchronized (e.class) {
                try {
                    if (f10075i == null) {
                        f10075i = new ConcurrentHashMap<>();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f10075i.put(Integer.valueOf(i2), str);
    }

    public static void a(boolean z2) {
        f10078p = z2;
    }
}

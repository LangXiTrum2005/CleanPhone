package com.smartdigimkt.n8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.x4;
import com.smartdigimkt.sdk.core.bridge.entity.AppInfoEntity;
import com.smartdigimkt.sdk.core.bridge.entity.DeviceInfoEntity;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    static String B0 = null;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static volatile String f37151J = null;
    private static volatile String K = null;
    public static final String L = "unknown";
    private static volatile String M = null;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static volatile String f37152N = null;
    private static volatile String O = null;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static volatile String f37153P = null;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static volatile String f37154Q = null;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static String f37155R = null;
    private static String S = null;
    private static String T = null;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static String f37156U = null;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static String f37157V = null;
    private static String W = null;
    private static String X = null;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static String f37158Y = null;
    private static String Z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f37159a = "c";
    private static String a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static String f37161b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile String f37162c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static String f37163c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static String f37164d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f37165e;
    private static volatile PackageInfo e0;
    public static String f;
    private static BatteryManager f0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile String f37166h;
    private static com.smartdigimkt.v6.d h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f37167i;
    private static DeviceInfoEntity i0;
    private static volatile boolean j;
    private static AppInfoEntity j0;
    private static String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile PackageInfo f37168l;
    private static volatile String m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JSONObject f37160b = new JSONObject();
    private static String d = null;
    public static String g = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile String f37169n = null;
    private static volatile boolean o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static String f37170p = "";
    private static String q = "";
    private static String r = "";
    private static String s = "";
    private static int t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static String f37171u = "";
    private static String v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static String f37172w = null;
    private static String x = "";
    private static String y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile String f37173z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static volatile String f37146A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static volatile int f37147B = -1;
    private static volatile double C = 0.0d;
    private static volatile int D = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static volatile int f37148E = -999;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static volatile int f37149F = -1;
    private static volatile int G = -1;
    private static volatile int H = -1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static volatile int f37150I = -1;
    private static volatile String g0 = null;
    private static final Object k0 = new Object();
    private static final Object l0 = new Object();
    private static final Object m0 = new Object();
    private static final Object n0 = new Object();
    private static final Object o0 = new Object();
    private static final Object p0 = new Object();
    private static final Object q0 = new Object();
    private static final Object r0 = new Object();
    private static final Object s0 = new Object();
    private static final Object t0 = new Object();
    private static final Object u0 = new Object();
    private static final Object v0 = new Object();
    private static final Object w0 = new Object();
    private static final Object x0 = new Object();
    private static final Object y0 = new Object();
    private static final Object z0 = new Object();
    private static final Object A0 = new Object();

    public class a implements com.smartdigimkt.r6.g.a {
        @Override // com.smartdigimkt.r6.g.a
        public void a(PackageInfo packageInfo) {
            synchronized (c.l0) {
                if (packageInfo != null) {
                    try {
                        String unused = c.f37172w = packageInfo.versionName;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f37174Y;

        public b(int i2, String str) {
            this.X = i2;
            this.f37174Y = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.f37160b) {
                if (c.f37160b.has(String.valueOf(this.X))) {
                    return;
                }
                try {
                    c.f37160b.put(String.valueOf(this.X), this.f37174Y);
                    String unused = c.d = c.f37160b.toString();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.n8.c$c, reason: collision with other inner class name */
    public class RunnableC0554c implements Runnable {
        final /* synthetic */ Context X;

        public RunnableC0554c(Context context) {
            this.X = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebView webView = new WebView(this.X);
                f.a(webView);
                String unused = c.f37169n = webView.getSettings().getUserAgentString();
                p.b(this.X, "sdm_sdk", com.smartdigimkt.g8.b.a.q, c.f37169n);
            } catch (Throwable unused2) {
            }
        }
    }

    public class d implements Callable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f37175a;

        public d(Context context) {
            this.f37175a = context;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            try {
                try {
                    Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, this.f37175a);
                    Method method = AdvertisingIdClient.Info.class.getMethod("getId", null);
                    method.setAccessible(true);
                    return (String) method.invoke(objInvoke, null);
                } catch (Throwable unused) {
                    return new com.smartdigimkt.n8.a().a(this.f37175a).a();
                }
            } catch (Throwable unused2) {
                String unused3 = c.f37159a;
                return "";
            }
        }
    }

    private c() {
    }

    public static String A(Context context) {
        if (com.smartdigimkt.m6.b.p().a("app_vc")) {
            return "";
        }
        if (context == null) {
            context = com.smartdigimkt.m6.b.p().k();
        }
        if (t != 0) {
            return android.support.v4.media.a.i(t, "", new StringBuilder());
        }
        try {
            t = f(context).versionCode;
            return t + "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String B(Context context) {
        if (com.smartdigimkt.m6.b.p().a("app_vn")) {
            return "";
        }
        if (context == null) {
            context = com.smartdigimkt.m6.b.p().k();
        }
        try {
            if (!TextUtils.isEmpty(s)) {
                return s;
            }
            String str = f(context).versionName;
            s = str;
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    private static void C(Context context) {
        com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
        if (cVarB != null) {
            cVarB.initDeviceInfo(context);
        }
    }

    public static String D() {
        if (com.smartdigimkt.m6.b.p().a("model")) {
            return "";
        }
        try {
            return !com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a() ? "" : Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String E() {
        if (com.smartdigimkt.m6.b.p().a("os_vn")) {
            return "";
        }
        if (TextUtils.isEmpty(f37170p)) {
            f37170p = Build.VERSION.RELEASE;
        }
        return f37170p;
    }

    public static void F(Context context) {
        synchronized (o0) {
            try {
                if (TextUtils.isEmpty(com.smartdigimkt.m6.b.p().t())) {
                    DeviceInfoEntity deviceInfoEntity = i0;
                    if (deviceInfoEntity != null) {
                        String upId = deviceInfoEntity.getUpId();
                        if (!TextUtils.isEmpty(upId)) {
                            com.smartdigimkt.m6.b.p().g(upId);
                            return;
                        }
                    }
                    com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
                    String uniqueId = cVarB != null ? cVarB.getUniqueId(context) : "";
                    if (TextUtils.isEmpty(uniqueId)) {
                        uniqueId = m(context);
                    }
                    if (TextUtils.isEmpty(uniqueId) || g(uniqueId)) {
                        uniqueId = f();
                    }
                    if (TextUtils.isEmpty(uniqueId)) {
                        uniqueId = a(context);
                    }
                    if (TextUtils.isEmpty(uniqueId)) {
                        uniqueId = UUID.randomUUID().toString();
                    }
                    com.smartdigimkt.m6.b.p().g(e.b(uniqueId));
                    a("initUpId() >>> called, upId: %s", com.smartdigimkt.m6.b.p().t());
                    com.smartdigimkt.i7.d.a("", "3", "", String.valueOf(System.currentTimeMillis()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String G() {
        if (com.smartdigimkt.m6.b.p().a("os_vc")) {
            return "";
        }
        try {
            if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
                return "";
            }
            if (TextUtils.isEmpty(q)) {
                q = androidx.datastore.preferences.protobuf.a.f(H(), "");
            }
            return q;
        } catch (Exception unused) {
            return "";
        }
    }

    public static int H() {
        return Build.VERSION.SDK_INT;
    }

    public static String I() {
        if (com.smartdigimkt.m6.b.p().a("brand")) {
            return "";
        }
        try {
            return !com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a() ? "" : Build.BRAND;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String J() {
        if (j("isroot")) {
            return "";
        }
        if (f37152N == null) {
            synchronized (x0) {
                try {
                    if (f37152N == null) {
                        f37152N = k.b();
                        a("getRootState() >>> rootState: %s", f37152N);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37152N;
    }

    public static int K(Context context) {
        if (com.smartdigimkt.m6.b.p().a("orient")) {
            return 0;
        }
        if (context == null) {
            context = com.smartdigimkt.m6.b.p().k();
        }
        return context.getResources().getConfiguration().orientation == 2 ? 2 : 1;
    }

    public static String L() {
        if (g0 != null) {
            return g0;
        }
        if (com.smartdigimkt.m6.b.p().a("sys_ua")) {
            return "";
        }
        if (g0 == null) {
            synchronized (k0) {
                if (g0 == null) {
                    try {
                        g0 = System.getProperty("http.agent");
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (g0 == null) {
            g0 = "";
        }
        return g0;
    }

    public static String M() {
        if (com.smartdigimkt.m6.b.p().a("timezone")) {
            return "";
        }
        try {
            if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
                return "";
            }
            try {
                if (TextUtils.isEmpty(v)) {
                    String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                    v = displayName;
                    return displayName;
                }
            } catch (Throwable unused) {
            }
            return v;
        } catch (Exception unused2) {
            return "";
        }
    }

    public static com.smartdigimkt.v6.d N() {
        if (h0 == null) {
            synchronized (A0) {
                try {
                    if (h0 == null) {
                        h0 = new com.smartdigimkt.v6.d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        try {
            h0.d(G(com.smartdigimkt.m6.b.p().k()));
            h0.a(Q());
            h0.b(P());
            h0.c(f(O()));
        } catch (Throwable unused) {
        }
        return h0;
    }

    public static String O() {
        String strU = com.smartdigimkt.m6.b.p().u();
        if (!TextUtils.isEmpty(strU)) {
            return strU;
        }
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB != null) {
            return aVarB.J0();
        }
        return null;
    }

    public static int P() {
        if (H != -1) {
            return H;
        }
        H = 0;
        try {
            H = ((Integer) Class.forName("com.tencent.mm.opensdk.constants.Build").getField("SDK_INT").get(null)).intValue();
        } catch (Throwable unused) {
        }
        return H;
    }

    public static int Q() {
        if (G == -1) {
            try {
                Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
                Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram");
                G = 1;
            } catch (Throwable unused) {
                G = 0;
            }
        }
        return G;
    }

    public static boolean R() {
        AppInfoEntity appInfoEntity = j0;
        return appInfoEntity != null && appInfoEntity.getMediationPlatform() == 1;
    }

    private static String S() {
        if (!TextUtils.isEmpty(f37169n)) {
            return f37169n;
        }
        synchronized (n0) {
            try {
                if (!TextUtils.isEmpty(f37169n)) {
                    return f37169n;
                }
                DeviceInfoEntity deviceInfoEntity = i0;
                if (deviceInfoEntity != null) {
                    String userAgent = deviceInfoEntity.getUserAgent();
                    if (!TextUtils.isEmpty(userAgent)) {
                        f37169n = userAgent;
                        if (!TextUtils.isEmpty(f37169n)) {
                            p.b(com.smartdigimkt.m6.b.p().k(), "sdm_sdk", com.smartdigimkt.g8.b.a.q, f37169n);
                        }
                    }
                }
                if (f37169n == null) {
                    f37169n = p.a(com.smartdigimkt.m6.b.p().k(), "sdm_sdk", com.smartdigimkt.g8.b.a.q, "");
                    a("readLocalUserAgent() >>> sp userAgent: %s", f37169n);
                }
                return f37169n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean T() {
        Context contextK = com.smartdigimkt.m6.b.p().k();
        return !com.smartdigimkt.s6.d.a(contextK).a() || L(contextK) || com.smartdigimkt.m6.b.p().a("device_minor_data_deny");
    }

    public static int a(int i2) {
        if (i2 == 20) {
            return 16;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 1;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 13;
            default:
                return -1;
        }
    }

    public static JSONObject e() {
        try {
            return new JSONObject(d);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static int f(String str) {
        if (f37150I != -1) {
            return f37150I;
        }
        f37150I = 0;
        try {
            f37150I = ((Integer) Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("getWXAppSupportAPI", null).invoke(e(str), null)).intValue();
        } catch (Throwable unused) {
        }
        return f37150I;
    }

    public static void g(Context context) {
        if (context != null && !com.smartdigimkt.m6.b.p().a("ua") && com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a() && TextUtils.isEmpty(S())) {
            synchronized (n0) {
                try {
                    if (o) {
                        return;
                    }
                    o = true;
                    try {
                        f37169n = WebSettings.getDefaultUserAgent(context);
                        p.b(context, "sdm_sdk", com.smartdigimkt.g8.b.a.q, f37169n);
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void h(String str) {
        f37162c = str;
        p.b(com.smartdigimkt.m6.b.p().k(), "sdm_sdk", com.smartdigimkt.g8.b.a.d, f37162c);
    }

    public static int i(Context context) {
        if (context == null) {
            context = com.smartdigimkt.m6.b.p().k();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int j(Context context) {
        if (context == null) {
            context = com.smartdigimkt.m6.b.p().k();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static String k(Context context) {
        if (O == null) {
            synchronized (y0) {
                try {
                    if (O == null) {
                        O = k.c(context);
                        a("getEmulatorStatus() >>> emulatorStatus: %s", O);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return O;
    }

    public static String l(Context context) {
        if (f37153P == null) {
            synchronized (z0) {
                try {
                    if (f37153P == null) {
                        f37153P = k.d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37153P;
    }

    public static String m(Context context) {
        if (context == null || com.smartdigimkt.m6.b.p().a("gaid")) {
            return "";
        }
        String strY = y();
        if (!TextUtils.isEmpty(strY)) {
            return strY;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return "";
        }
        synchronized (p0) {
            try {
                try {
                    if (!TextUtils.isEmpty(f37162c)) {
                        return f37162c;
                    }
                    DeviceInfoEntity deviceInfoEntity = i0;
                    if (deviceInfoEntity != null) {
                        String gaid = deviceInfoEntity.getGaid();
                        if (!TextUtils.isEmpty(gaid) && !g(gaid)) {
                            f37162c = gaid;
                            h(gaid);
                        }
                    }
                    if (!TextUtils.isEmpty(f37162c)) {
                        return f37162c;
                    }
                    d dVar = new d(context);
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
                    Future futureSubmit = threadPoolExecutor.submit(dVar);
                    try {
                        a("getGaid() >>> start. googleAdId: %s", f37162c);
                        String str = (String) futureSubmit.get(2L, TimeUnit.SECONDS);
                        if (!TextUtils.isEmpty(str) && !g(str)) {
                            h(str);
                            a("getGaid() >>> succeed. gaid: %s", str);
                        }
                        try {
                            threadPoolExecutor.shutdown();
                        } catch (Throwable unused) {
                        }
                        return str;
                    } catch (Throwable unused2) {
                        threadPoolExecutor.shutdown();
                        return "";
                    }
                } catch (Throwable unused3) {
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String n(Context context) {
        if (f37172w == null) {
            synchronized (l0) {
                try {
                    if (f37172w == null && !com.smartdigimkt.m6.b.p().y()) {
                        try {
                            String str = context.getPackageManager().getPackageInfo("com.android.vending", 0).versionName;
                            f37172w = str;
                            a("getGoogleVersion() >>> gPVersion: %s", str);
                            if (f37172w == null) {
                                f37172w = "";
                            }
                            return f37172w;
                        } catch (Exception unused) {
                            f37172w = "";
                            return "";
                        }
                    }
                    if (f37172w == null) {
                        f37172w = "";
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37172w;
    }

    public static String o(Context context) {
        if (com.smartdigimkt.m6.b.p().a("language")) {
            return "";
        }
        if (context == null) {
            context = com.smartdigimkt.m6.b.p().k();
        }
        try {
            if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
                return "";
            }
            if (!TextUtils.isEmpty(f37171u)) {
                return f37171u;
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            f37171u = language;
            return language;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String p(Context context) {
        if (com.smartdigimkt.m6.b.p().a("mcc")) {
            return "";
        }
        if (context == null) {
            com.smartdigimkt.m6.b.p().k();
        }
        try {
            return !com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a() ? "" : x;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String q(Context context) {
        if (com.smartdigimkt.m6.b.p().a("mnc")) {
            return "";
        }
        if (context == null) {
            com.smartdigimkt.m6.b.p().k();
        }
        try {
            return !com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a() ? "" : y;
        } catch (Exception unused) {
            return "";
        }
    }

    public static int r(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return -1;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || !h.b("android.permission.ACCESS_NETWORK_STATE", context) || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return -1;
            }
            if (activeNetworkInfo.getType() == 1) {
                return -2;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return -1;
            }
            return telephonyManager.getNetworkType();
        } catch (Throwable unused) {
        }
        return -1;
    }

    public static String s(Context context) {
        if (com.smartdigimkt.m6.b.p().a("network_type")) {
            return "";
        }
        try {
            if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
                return "";
            }
            if (context == null) {
                return x4.DISABLED_AUCTION_FALLBACK_ID;
            }
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    return x4.DISABLED_AUCTION_FALLBACK_ID;
                }
                if (h.b("android.permission.ACCESS_NETWORK_STATE", context)) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        return x4.DISABLED_AUCTION_FALLBACK_ID;
                    }
                    if (activeNetworkInfo.getType() == 1) {
                        return "-2";
                    }
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (telephonyManager == null) {
                            return "-3";
                        }
                        return a(telephonyManager.getNetworkType()) + "";
                    } catch (Throwable unused) {
                    }
                }
                return "-3";
            } catch (Throwable unused2) {
                return x4.DISABLED_AUCTION_FALLBACK_ID;
            }
        } catch (Exception unused3) {
            return "";
        }
    }

    public static String t(Context context) {
        if (com.smartdigimkt.m6.b.p().a("package_name")) {
            return "";
        }
        if (context == null) {
            context = com.smartdigimkt.m6.b.p().k();
        }
        try {
            if (!TextUtils.isEmpty(r)) {
                return r;
            }
            String str = f(context).packageName;
            r = str;
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String u(Context context) {
        return j("battery") ? "" : k.e(context);
    }

    public static String v(Context context) {
        if (TextUtils.isEmpty(f)) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            f = String.valueOf(displayMetrics.density);
        }
        return f;
    }

    public static String w(Context context) {
        if (com.smartdigimkt.m6.b.p().a("screen")) {
            return "";
        }
        if (context == null) {
            context = com.smartdigimkt.m6.b.p().k();
        }
        try {
            if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
                return "";
            }
            return j(context) + "*" + i(context);
        } catch (Exception unused) {
            return "";
        }
    }

    public static DeviceInfoEntity x() {
        return i0;
    }

    public static String y() {
        try {
            if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
                return "";
            }
            if (f37162c == null) {
                synchronized (p0) {
                    try {
                        if (f37162c == null) {
                            f37162c = p.a(com.smartdigimkt.m6.b.p().k(), "sdm_sdk", com.smartdigimkt.g8.b.a.d, "");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f37162c;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String z(Context context) {
        return (L(context) || j("is_vpn")) ? "" : k.f(context);
    }

    public static int H(Context context) {
        try {
            if (!j("s_c") && !L(context)) {
                if (f37148E != -999) {
                    return f37148E;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    f37148E = -1;
                } else if (telephonyManager.getSimState() == 5) {
                    f37148E = 2;
                } else if (telephonyManager.getSimState() == 1) {
                    f37148E = 1;
                } else {
                    f37148E = -1;
                }
                return f37148E;
            }
            return -1;
        } catch (Throwable unused) {
            f37148E = -1;
        }
    }

    private static void a(String str, Throwable th) {
    }

    public static String d(String str) {
        try {
            return f37160b.getString(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String x(Context context) {
        if (com.smartdigimkt.m6.b.p().a("it_src")) {
            return "";
        }
        if (context == null) {
            context = com.smartdigimkt.m6.b.p().k();
        }
        try {
            if (!TextUtils.isEmpty(f37165e)) {
                return f37165e;
            }
            String installerPackageName = context.getPackageManager().getInstallerPackageName(t(context));
            f37165e = installerPackageName;
            return installerPackageName;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String C() {
        AppInfoEntity appInfoEntity = j0;
        if (appInfoEntity != null) {
            return appInfoEntity.getMediationVersion();
        }
        return f.a();
    }

    private static void a(String str, Object... objArr) {
    }

    public static String b(Context context) {
        if (context == null) {
            return "";
        }
        try {
            String strA = a(context);
            if (TextUtils.isEmpty(strA)) {
                return "";
            }
            if (TextUtils.isEmpty(B0)) {
                B0 = e.c(strA);
            }
        } catch (Throwable unused) {
        }
        return B0;
    }

    public static PackageInfo c(Context context, String str) {
        if (context == null) {
            context = com.smartdigimkt.m6.b.p().k();
        }
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory").getMethod("createWXAPI", Context.class, String.class).invoke(null, com.smartdigimkt.m6.b.p().k(), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int h(Context context) {
        try {
            if (com.smartdigimkt.m6.b.p().a("d_s")) {
                return -1;
            }
            if (f37147B != -1) {
                return f37147B;
            }
            int i2 = Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0);
            a("getDeveloperModeEnabledType() >>> model: %s", Integer.valueOf(i2));
            if (i2 != 0) {
                f37147B = 2;
            } else {
                f37147B = 1;
            }
            return f37147B;
        } catch (Throwable unused) {
        }
    }

    public static void D(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.smartdigimkt.r6.a(com.smartdigimkt.m6.a.t.f36804a, "hw_ver"));
        arrayList.add(new com.smartdigimkt.r6.a(com.smartdigimkt.m6.a.t.f36805b, "hw_hms_ver"));
        arrayList.add(new com.smartdigimkt.r6.a(com.smartdigimkt.m6.a.t.f36808h, "mi_global_ver"));
        com.smartdigimkt.r6.h.e().a(arrayList);
    }

    public static boolean I(Context context) {
        return K(context) == 2;
    }

    public static String d(Context context, String str) {
        if (context == null) {
            context = com.smartdigimkt.m6.b.p().k();
        }
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(str, 0).versionCode + "";
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public static String i() {
        if (T()) {
            return "";
        }
        if (f37164d0 == null) {
            try {
                f37164d0 = Build.BOARD;
            } catch (Throwable unused) {
                f37164d0 = "";
            }
        }
        String str = f37164d0;
        if (str == null) {
            f37164d0 = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f37164d0;
    }

    public static String j() {
        if (T()) {
            return "";
        }
        if (f37157V == null) {
            try {
                f37157V = Build.BOOTLOADER;
            } catch (Throwable unused) {
                f37157V = "";
            }
        }
        String str = f37157V;
        if (str == null) {
            f37157V = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f37157V;
    }

    public static String u() {
        if (T()) {
            return "";
        }
        if (f37163c0 == null) {
            try {
                f37163c0 = String.valueOf(1);
            } catch (Throwable unused) {
                f37163c0 = "";
            }
        }
        return f37163c0;
    }

    public static String z() {
        if (j("http_able")) {
            return "";
        }
        if (f37154Q == null) {
            f37154Q = h.b() ? "1" : "0";
        }
        return f37154Q;
    }

    public static String K() {
        if (!TextUtils.isEmpty(g)) {
            return g;
        }
        String strS = com.smartdigimkt.m6.b.p().s();
        if (!TextUtils.isEmpty(strS)) {
            g = strS;
            return strS;
        }
        String strS2 = com.smartdigimkt.m6.b.p().s();
        if (TextUtils.isEmpty(strS2)) {
            try {
                Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                strS2 = "2";
            } catch (Throwable unused) {
                strS2 = "1";
            }
            try {
                Class.forName("org.cocos2dx.lib.Cocos2dxActivity");
                Class.forName("org.cocos2dx.lib.Cocos2dxJavascriptJavaBridge");
                strS2 = "4";
            } catch (Throwable unused2) {
            }
            try {
                Class.forName("com.facebook.react.ReactActivity");
                strS2 = "5";
            } catch (Throwable unused3) {
            }
            try {
                Class.forName("io.flutter.embedding.android.FlutterActivity");
                strS2 = "6";
            } catch (Throwable unused4) {
            }
        }
        g = strS2;
        return strS2;
    }

    public static PackageInfo c(Context context) {
        PackageInfo packageInfo;
        if (e0 == null) {
            synchronized (v0) {
                try {
                    if (e0 == null) {
                        try {
                            e0 = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                            a("getAppSignaturesPI() >>> appSignaturesPI: %s", e0);
                            if (e0 == null) {
                                packageInfo = new PackageInfo();
                                e0 = packageInfo;
                            }
                        } catch (Throwable unused) {
                            if (e0 == null) {
                                packageInfo = new PackageInfo();
                                e0 = packageInfo;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e0;
    }

    public static String p() {
        if (T()) {
            return "";
        }
        if (f37156U == null) {
            try {
                f37156U = Build.RADIO;
            } catch (Throwable unused) {
                f37156U = "";
            }
        }
        String str = f37156U;
        if (str == null) {
            f37156U = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f37156U;
    }

    public static String q() {
        if (T()) {
            return "";
        }
        if (a0 == null) {
            try {
                a0 = Build.SERIAL;
            } catch (Throwable unused) {
                a0 = "";
            }
        }
        String str = a0;
        if (str == null) {
            a0 = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return a0;
    }

    public static String w() {
        if (com.smartdigimkt.m6.b.p().a("ua") || !com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
            return "";
        }
        synchronized (n0) {
            try {
                String strS = S();
                if (!TextUtils.isEmpty(strS)) {
                    return strS;
                }
                a("getDefaultUA() >>> userAgent: %s", f37169n);
                String str = Build.VERSION.RELEASE;
                String strD = D();
                String str2 = Build.ID;
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strD) && !TextUtils.isEmpty(str2)) {
                    return "Mozilla/5.0 (Linux; Android " + str + "; " + strD + " Build/" + str2 + ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
                }
                return "";
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00e1 A[DONT_GENERATE] */
    public static String B() {
        try {
            if (com.smartdigimkt.m6.b.p().a("ip_v6")) {
                if (f37146A == null) {
                    f37146A = "";
                }
                return "";
            }
            if (f37146A != null) {
                String str = f37146A;
                if (f37146A == null) {
                    f37146A = "";
                }
                return str;
            }
            if (!com.smartdigimkt.m6.c.g() && !com.smartdigimkt.m6.b.p().A()) {
                String str2 = f37146A;
                if (f37146A == null) {
                    f37146A = "";
                }
                return str2;
            }
            synchronized (u0) {
                if (f37146A != null) {
                    String str3 = f37146A;
                    if (f37146A == null) {
                        f37146A = "";
                    }
                    return str3;
                }
                DeviceInfoEntity deviceInfoEntity = i0;
                if (deviceInfoEntity != null) {
                    f37146A = deviceInfoEntity.getIpV6();
                }
                if (!TextUtils.isEmpty(f37146A)) {
                    String str4 = f37146A;
                    if (f37146A == null) {
                        f37146A = "";
                    }
                    return str4;
                }
                Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                while (it.hasNext()) {
                    for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                        if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet6Address)) {
                            String hostAddress = inetAddress.getHostAddress();
                            if (!TextUtils.isEmpty(hostAddress)) {
                                f37146A = hostAddress;
                            }
                        }
                    }
                }
                a("getIPv6Address() >>> ip_v6: %s", f37146A);
                if (f37146A == null) {
                    f37146A = "";
                }
                if (f37146A == null) {
                }
            }
        } catch (Throwable th) {
            try {
                a("getIPv6Address() >>> exception.", th);
            } finally {
                if (f37146A == null) {
                    f37146A = "";
                }
            }
        }
        return f37146A;
    }

    public static void E(Context context) {
        if (!com.smartdigimkt.m6.b.p().y()) {
            if (f37172w == null) {
                synchronized (l0) {
                    try {
                        try {
                            if (f37172w == null) {
                                f37172w = context.getPackageManager().getPackageInfo("com.android.vending", 0).versionName;
                            }
                            if (f37172w == null) {
                                f37172w = "";
                            }
                        } catch (Throwable unused) {
                            if (f37172w == null) {
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        com.smartdigimkt.r6.h.e().a(context, "com.android.vending", new a());
    }

    public static void a(Context context, Map<String, Object> map) {
        try {
            a(map);
            F(context);
            C(context);
            g(context);
            w();
            G();
            t(context);
            B(context);
            A(context);
            K(context);
            D();
            I();
            a(context);
            m(context);
            o(context);
            M();
            E(context);
            H(context);
            y(context);
            d(context);
            h(context);
            try {
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (h.c(simOperator) && simOperator.length() > 3) {
                    x = simOperator.substring(0, 3);
                    y = simOperator.substring(3, simOperator.length());
                }
            } catch (Throwable unused) {
            }
            D(context);
            v();
            J();
            k(context);
            l(context);
            z();
            s();
            r();
            t();
            p();
            j();
            m();
            n();
            k();
            o();
            q();
            l();
            u();
            i();
        } catch (Exception unused2) {
        }
    }

    public static String t() {
        if (T()) {
            return "";
        }
        if (T == null) {
            try {
                T = Build.USER;
            } catch (Throwable unused) {
                T = "";
            }
        }
        String str = T;
        if (str == null) {
            T = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return T;
    }

    public static String e(Context context) {
        if (j("is_charge")) {
            return "";
        }
        return k.b(context);
    }

    public static String l() {
        if (T()) {
            return "";
        }
        if (f37161b0 == null) {
            try {
                f37161b0 = Build.DISPLAY;
            } catch (Throwable unused) {
                f37161b0 = "";
            }
        }
        String str = f37161b0;
        if (str == null) {
            f37161b0 = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f37161b0;
    }

    public static String r() {
        if (T()) {
            return "";
        }
        if (TextUtils.isEmpty(S)) {
            try {
                S = Build.TAGS;
            } catch (Throwable unused) {
            }
        }
        String str = S;
        if (str == null) {
            S = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return S;
    }

    public static String v() {
        if (j("cpu")) {
            return "";
        }
        if (M == null) {
            synchronized (w0) {
                try {
                    if (M == null) {
                        M = k.a();
                        a("getCpuInfo() >>> cpuInfo: %s", M);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return M;
    }

    public static String b(Context context, String str) {
        Signature[] signatureArr;
        Signature signature;
        if (com.smartdigimkt.m6.b.p().a(str)) {
            return "";
        }
        if (!TextUtils.isEmpty(f37151J)) {
            return f37151J;
        }
        try {
            PackageInfo packageInfoC = c(context);
            if (packageInfoC != null && (signatureArr = packageInfoC.signatures) != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null) {
                byte[] bArrDigest = MessageDigest.getInstance(com.smartdigimkt.n8.b.a("U0hBMQ==")).digest(signature.toByteArray());
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArrDigest) {
                    sb.append(Integer.toHexString((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 256).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                f37151J = sb.substring(0, sb.length() - 1);
                return f37151J;
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static double d(Context context) {
        try {
            if (j("battery")) {
                return 0.0d;
            }
            if (C != 0.0d) {
                return C;
            }
            if (f0 == null) {
                f0 = (BatteryManager) context.getSystemService("batterymanager");
            }
            BatteryManager batteryManager = f0;
            if (batteryManager != null) {
                C = ((double) batteryManager.getIntProperty(4)) / 100.0d;
                return C;
            }
            return C;
        } catch (Throwable unused) {
        }
    }

    public static String k() {
        if (T()) {
            return "";
        }
        if (f37158Y == null) {
            try {
                f37158Y = Build.VERSION.CODENAME;
            } catch (Throwable unused) {
                f37158Y = "";
            }
        }
        String str = f37158Y;
        if (str == null) {
            f37158Y = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f37158Y;
    }

    public static String o() {
        if (T()) {
            return "";
        }
        if (Z == null) {
            try {
                Z = Build.VERSION.INCREMENTAL;
            } catch (Throwable unused) {
                Z = "";
            }
        }
        String str = Z;
        if (str == null) {
            Z = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return Z;
    }

    public static String f() {
        if (com.smartdigimkt.m6.b.p().a("amazon_id") || !com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
            return "";
        }
        if (f37166h == null) {
            synchronized (q0) {
                try {
                    if (f37166h == null) {
                        f37166h = p.a(com.smartdigimkt.m6.b.p().k(), "sdm_sdk", com.smartdigimkt.g8.b.a.f35519e, "");
                        if (TextUtils.isEmpty(f37166h)) {
                            try {
                                f37166h = Settings.Secure.getString(com.smartdigimkt.m6.b.p().k().getContentResolver(), "advertising_id");
                                a("getAmazonId() >>> amazon_id: %s", f37166h);
                                if (!TextUtils.isEmpty(f37166h)) {
                                    p.b(com.smartdigimkt.m6.b.p().k(), "sdm_sdk", com.smartdigimkt.g8.b.a.f35519e, f37166h);
                                } else {
                                    f37166h = "";
                                }
                                if (f37166h == null) {
                                    f37166h = "";
                                }
                            } catch (Throwable unused) {
                                if (f37166h == null) {
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37166h;
    }

    public static String J(Context context) {
        if (j("isagent")) {
            return "";
        }
        return k.i(context);
    }

    public static int y(Context context) {
        try {
            if (com.smartdigimkt.m6.b.p().a("u_a")) {
                return -1;
            }
            if (f37148E != -1) {
                return f37148E;
            }
            if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 1) {
                D = 2;
            } else {
                D = 1;
            }
            return D;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00e1 A[DONT_GENERATE] */
    public static String A() {
        try {
            if (com.smartdigimkt.m6.b.p().a("ip_v4")) {
                if (f37173z == null) {
                    f37173z = "";
                }
                return "";
            }
            if (f37173z != null) {
                String str = f37173z;
                if (f37173z == null) {
                    f37173z = "";
                }
                return str;
            }
            if (!com.smartdigimkt.m6.c.g() && !com.smartdigimkt.m6.b.p().A()) {
                String str2 = f37173z;
                if (f37173z == null) {
                    f37173z = "";
                }
                return str2;
            }
            synchronized (t0) {
                if (f37173z != null) {
                    String str3 = f37173z;
                    if (f37173z == null) {
                        f37173z = "";
                    }
                    return str3;
                }
                DeviceInfoEntity deviceInfoEntity = i0;
                if (deviceInfoEntity != null) {
                    f37173z = deviceInfoEntity.getIpV4();
                }
                if (!TextUtils.isEmpty(f37173z)) {
                    String str4 = f37173z;
                    if (f37173z == null) {
                        f37173z = "";
                    }
                    return str4;
                }
                Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                while (it.hasNext()) {
                    for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                        if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                            String hostAddress = inetAddress.getHostAddress();
                            if (!TextUtils.isEmpty(hostAddress)) {
                                f37173z = hostAddress;
                            }
                        }
                    }
                }
                a("getIPv4Address() >>> ip_v4: %s", f37173z);
                if (f37173z == null) {
                    f37173z = "";
                }
                if (f37173z == null) {
                }
            }
        } catch (Throwable th) {
            try {
                a("getIPv4Address() >>> exception.", th);
            } finally {
                if (f37173z == null) {
                    f37173z = "";
                }
            }
        }
        return f37173z;
    }

    public static AppInfoEntity h() {
        return j0;
    }

    private static boolean g(String str) {
        return Pattern.matches("^[0-]+$", str);
    }

    public static void i(String str) {
        k = str;
    }

    private static boolean j(String str) {
        return com.smartdigimkt.m6.b.p().a(str) || !com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a();
    }

    public static String s() {
        if (T()) {
            return "";
        }
        if (f37155R == null) {
            try {
                f37155R = Build.TYPE;
            } catch (Throwable unused) {
            }
        }
        String str = f37155R;
        if (str == null) {
            f37155R = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f37155R;
    }

    public static int G(Context context) {
        if (f37149F == -1) {
            f37149F = h.b(context, com.smartdigimkt.b0.a.G1) ? 1 : 0;
        }
        return f37149F;
    }

    private static boolean L(Context context) {
        return !com.smartdigimkt.k8.a.e().b().O0();
    }

    public static int g() {
        if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
            return -1;
        }
        if (f37167i <= 0 && !j) {
            synchronized (r0) {
                try {
                    if (!j) {
                        int i2 = 1;
                        j = true;
                        try {
                            if (Settings.Secure.getInt(com.smartdigimkt.m6.b.p().k().getContentResolver(), "limit_ad_tracking") != 0) {
                                i2 = 2;
                            }
                            f37167i = i2;
                            a("getAmazonLat() >>> amazon_lat: %s", Integer.valueOf(i2));
                        } catch (Throwable unused) {
                            f37167i = -1;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37167i;
    }

    public static String n() {
        if (T()) {
            return "";
        }
        if (X == null) {
            try {
                X = Build.HOST;
            } catch (Throwable unused) {
                X = "";
            }
        }
        String str = X;
        if (str == null) {
            X = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return X;
    }

    public static String F() {
        return k;
    }

    public static PackageInfo f(Context context) {
        PackageInfo packageInfo;
        if (f37168l == null) {
            synchronized (s0) {
                try {
                    if (f37168l == null) {
                        try {
                            f37168l = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                            a("getCurrentAppPI() >>> currrentAppPI: %s", f37168l);
                            if (f37168l == null) {
                                packageInfo = new PackageInfo();
                                f37168l = packageInfo;
                            }
                        } catch (Throwable unused) {
                            if (f37168l == null) {
                                packageInfo = new PackageInfo();
                                f37168l = packageInfo;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37168l;
    }

    public static String m() {
        if (T()) {
            return "";
        }
        if (W == null) {
            try {
                W = Build.HARDWARE;
            } catch (Throwable unused) {
                W = "";
            }
        }
        String str = W;
        if (str == null) {
            W = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return W;
    }

    public static void a(Map<String, Object> map) {
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                Object obj = map.get("sdm_device_data");
                Object obj2 = map.get("sdm_app_data");
                a(obj instanceof Bundle ? (DeviceInfoEntity) com.smartdigimkt.n6.b.a((Bundle) obj, DeviceInfoEntity.class) : null, obj2 instanceof Bundle ? (AppInfoEntity) com.smartdigimkt.n6.b.a((Bundle) obj2, AppInfoEntity.class) : null);
            } catch (Throwable unused) {
            }
        }
    }

    private static void a(DeviceInfoEntity deviceInfoEntity, AppInfoEntity appInfoEntity) {
        DeviceInfoEntity deviceInfoEntity2 = i0;
        AppInfoEntity appInfoEntity2 = j0;
        if (deviceInfoEntity2 == null) {
            i0 = deviceInfoEntity;
        } else if (deviceInfoEntity != null) {
            String userAgent = deviceInfoEntity.getUserAgent();
            if (!TextUtils.isEmpty(userAgent)) {
                deviceInfoEntity2.setUserAgent(userAgent);
            }
            String oaid = deviceInfoEntity.getOaid();
            if (!TextUtils.isEmpty(oaid)) {
                deviceInfoEntity2.setOaid(oaid);
            }
            String ssid = deviceInfoEntity.getSsid();
            if (!TextUtils.isEmpty(ssid)) {
                deviceInfoEntity2.setSsid(ssid);
            }
            String imei = deviceInfoEntity.getImei();
            if (!TextUtils.isEmpty(imei)) {
                deviceInfoEntity2.setImei(imei);
            }
            String imsi = deviceInfoEntity.getImsi();
            if (!TextUtils.isEmpty(imsi)) {
                deviceInfoEntity2.setImsi(imsi);
            }
            String mac = deviceInfoEntity.getMac();
            if (!TextUtils.isEmpty(mac)) {
                deviceInfoEntity2.setMac(mac);
            }
        }
        if (appInfoEntity2 == null) {
            j0 = appInfoEntity;
        } else if (appInfoEntity != null) {
            appInfoEntity2.setMediationPlatform(appInfoEntity.getMediationPlatform());
            appInfoEntity2.setMediationVersion(appInfoEntity.getMediationVersion());
            appInfoEntity2.setMediationAppId(appInfoEntity.getMediationAppId());
            appInfoEntity2.setMediationAppKey(appInfoEntity.getMediationAppKey());
        }
    }

    public static String a(Context context) {
        if (com.smartdigimkt.m6.b.p().a("android_id") || !com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
            return "";
        }
        if (m != null) {
            return m;
        }
        com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
        if (cVarB != null) {
            if (context == null) {
                context = com.smartdigimkt.m6.b.p().k();
            }
            synchronized (m0) {
                try {
                    if (m != null) {
                        return m;
                    }
                    m = p.a(context, "sdm_sdk", com.smartdigimkt.g8.b.a.f, "");
                    if (TextUtils.isEmpty(m)) {
                        DeviceInfoEntity deviceInfoEntity = i0;
                        if (deviceInfoEntity != null) {
                            String androidId = deviceInfoEntity.getAndroidId();
                            if (!TextUtils.isEmpty(androidId)) {
                                m = androidId;
                            }
                        }
                        if (TextUtils.isEmpty(m)) {
                            m = cVarB.getAid(context);
                        }
                        a("getAndroidId() >>> androidId: %s", m);
                        if (!TextUtils.isEmpty(m)) {
                            p.b(context, "sdm_sdk", com.smartdigimkt.g8.b.a.f, m);
                        }
                    }
                    if (m == null) {
                        m = "";
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public static void a(int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.smartdigimkt.l7.b.a().b((Runnable) new b(i2, str), 13);
    }

    public static String a(Context context, String str) {
        Signature[] signatureArr;
        Signature signature;
        if (com.smartdigimkt.m6.b.p().a(str)) {
            return "";
        }
        if (!TextUtils.isEmpty(K)) {
            return K;
        }
        try {
            PackageInfo packageInfoC = c(context);
            if (packageInfoC != null && (signatureArr = packageInfoC.signatures) != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null) {
                byte[] bArrDigest = MessageDigest.getInstance(com.smartdigimkt.n8.b.a("TUQ1")).digest(signature.toByteArray());
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArrDigest) {
                    sb.append(Integer.toHexString((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 256).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                K = sb.substring(0, sb.length() - 1);
                return K;
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}

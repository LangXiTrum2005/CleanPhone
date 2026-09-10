package com.smartdigimkt.v0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class n extends d {
    private static final String g = "SameDiTool";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f39000h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f39001i = -1;
    private static int j = -1;
    private static String k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f39002l = "";
    private static String m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String f39003n = "";
    private static int o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static String f39004p = "";
    private static String q = "";
    private static int r = -1;
    private static String s = "";
    private static int t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static String f39005u = "";
    private static int v;

    public class a implements Runnable {
        final /* synthetic */ Context X;

        public a(Context context) {
            this.X = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.c(this.X);
        }
    }

    public class b implements Runnable {
        final /* synthetic */ Context X;

        public b(Context context) {
            this.X = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context;
            ConnectivityManager connectivityManager;
            try {
                if (com.smartdigimkt.m6.b.p().a("network_type")) {
                    return;
                }
                try {
                    if (com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a() && (context = this.X) != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null) {
                            int unused = n.j = 0;
                            return;
                        }
                        if (activeNetworkInfo.getType() == 1) {
                            int unused2 = n.j = 9;
                            return;
                        }
                        TelephonyManager telephonyManager = (TelephonyManager) this.X.getSystemService("phone");
                        if (telephonyManager == null) {
                            int unused3 = n.j = 0;
                        } else {
                            int unused4 = n.j = n.b(telephonyManager.getNetworkType());
                        }
                    }
                } catch (Exception unused5) {
                }
            } catch (Throwable th) {
                th.getMessage();
                int unused6 = n.j = 0;
            }
        }
    }

    private n() {
    }

    public static int b(int i2) {
        if (i2 == 20) {
            return 5;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
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
                return 4;
            default:
                return 0;
        }
    }

    private static long c() {
        Context contextK = com.smartdigimkt.m6.b.p().k();
        if (contextK == null) {
            return 0L;
        }
        ActivityManager activityManager = (ActivityManager) contextK.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static void d(Context context) {
        try {
            b bVar = new b(context);
            if (com.smartdigimkt.t0.a.b().getActiveCount() < 1) {
                com.smartdigimkt.t0.a.b().execute(bVar);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static int e() {
        return 0;
    }

    public static int f(Context context) {
        if (com.smartdigimkt.m6.b.p().a("screen")) {
            return 0;
        }
        try {
            if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a() || context == null) {
                return 0;
            }
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                HashMap mapJ = j(context);
                return mapJ.get("height") == null ? displayMetrics.heightPixels : ((Integer) mapJ.get("height")).intValue();
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0;
            }
        } catch (Exception unused) {
        }
    }

    public static int g(Context context) {
        if (com.smartdigimkt.m6.b.p().a("screen")) {
            return 0;
        }
        try {
            if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a() || context == null) {
                return 0;
            }
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                HashMap mapJ = j(context);
                return mapJ.get("width") == null ? displayMetrics.widthPixels : ((Integer) mapJ.get("width")).intValue();
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0;
            }
        } catch (Exception unused) {
        }
    }

    public static int h(Context context) {
        try {
            Context contextK = com.smartdigimkt.m6.b.p().k();
            if (com.smartdigimkt.m6.b.p().a("network_type")) {
                return j;
            }
            try {
                if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
                    return j;
                }
                if (contextK == null) {
                    return j;
                }
                if (j != -1) {
                    d(contextK);
                    return j;
                }
                j = 0;
                return 0;
            } catch (Exception unused) {
                return j;
            }
        } catch (Throwable th) {
            th.getMessage();
            j = 0;
            return 0;
        }
    }

    public static String i(Context context) {
        if (context == null) {
            return m;
        }
        try {
            if (!TextUtils.isEmpty(m)) {
                return m;
            }
            String str = com.smartdigimkt.n8.c.f(context).packageName;
            m = str;
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static HashMap j(Context context) {
        HashMap map = new HashMap();
        if (context != null) {
            try {
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                map.put("height", Integer.valueOf(displayMetrics.heightPixels));
                map.put("width", Integer.valueOf(displayMetrics.widthPixels));
                return map;
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return map;
    }

    public static int k(Context context) {
        if (context == null) {
            return t;
        }
        if (t == 0) {
            try {
                t = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return t;
    }

    public static int l(Context context) {
        if (context == null) {
            return o;
        }
        int i2 = o;
        if (i2 != 0) {
            return i2;
        }
        try {
            int i3 = com.smartdigimkt.n8.c.f(context).versionCode;
            o = i3;
            return i3;
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static String m(Context context) {
        if (context == null) {
            return f39003n;
        }
        try {
            if (!TextUtils.isEmpty(f39003n)) {
                return f39003n;
            }
            String str = com.smartdigimkt.n8.c.f(context).versionName;
            f39003n = str;
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static void n(Context context) {
        try {
            i(context);
            m(context);
            l(context);
            p(context);
            com.smartdigimkt.b0.a.b2 = v.b("android.permission.WRITE_EXTERNAL_STORAGE", context);
            com.smartdigimkt.b0.a.a2 = v.b("android.permission.ACCESS_NETWORK_STATE", context);
            k(context);
            d.b(context);
        } catch (Throwable unused) {
        }
    }

    public static boolean o(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 6.0d;
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static int p(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    public static int q() {
        try {
            if (TextUtils.equals("1", com.smartdigimkt.n8.c.z(com.smartdigimkt.m6.b.p().k()))) {
                v = 1;
            } else if (TextUtils.equals("1", com.smartdigimkt.n8.c.J(com.smartdigimkt.m6.b.p().k()))) {
                v = 2;
            } else {
                v = 0;
            }
        } catch (Exception e2) {
            v = 0;
            e2.getMessage();
        }
        return v;
    }

    public static int r() {
        return r;
    }

    public static UUID s() {
        try {
            return UUID.randomUUID();
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static String a(Context context, int i2) {
        TelephonyManager telephonyManager;
        if (i2 != 0 && i2 != 9) {
            try {
                return (!com.smartdigimkt.b0.a.a2 || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : String.valueOf(telephonyManager.getNetworkType());
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return "";
    }

    public static void e(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                d.c(context);
            } else {
                com.smartdigimkt.l7.b.a().e(new a(context));
            }
        } catch (Throwable unused) {
        }
    }

    public static int p() {
        if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
            return 0;
        }
        if (f39000h < 1) {
            try {
                Context contextK = com.smartdigimkt.m6.b.p().k();
                long jLongValue = ((Long) x.b(contextK, "TotalRamSize", 0L)).longValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - jLongValue > 1800000 || f39000h == -1) {
                    f39000h = Long.valueOf((m() / 1000) / 1000).intValue();
                    x.d(contextK, "TotalRamSize", Long.valueOf(jCurrentTimeMillis));
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return f39000h;
    }

    public static int d() {
        try {
            if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
                return 0;
            }
            Context contextK = com.smartdigimkt.m6.b.p().k();
            long jLongValue = ((Long) x.b(contextK, "FreeRamSize", 0L)).longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jLongValue > 1800000 || f39001i == -1) {
                f39001i = Long.valueOf((c() / 1000) / 1000).intValue();
                x.d(contextK, "FreeRamSize", Long.valueOf(jCurrentTimeMillis));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return f39001i;
    }

    public static String l() {
        if (com.smartdigimkt.m6.b.p().a("model")) {
            return "";
        }
        try {
            if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
                return "";
            }
            return Build.MANUFACTURER + " " + Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    public static int k() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static String f() {
        if (TextUtils.isEmpty(f39005u)) {
            f39005u = n();
        }
        return f39005u;
    }

    public static String g() {
        if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
            return "";
        }
        return Build.CPU_ABI;
    }

    public static String i() {
        return "";
    }

    private static long m() {
        Context contextK = com.smartdigimkt.m6.b.p().k();
        if (contextK == null) {
            return 0L;
        }
        ActivityManager activityManager = (ActivityManager) contextK.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static String a(String str, Context context) {
        try {
            if (!TextUtils.isEmpty(s)) {
                return s;
            }
            if (!TextUtils.isEmpty(str) && context != null) {
                s = context.getPackageManager().getInstallerPackageName(str);
            }
            return s;
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static String j() {
        if (com.smartdigimkt.m6.b.p().a("os_vc")) {
            return "";
        }
        try {
            if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
                return "";
            }
            if (TextUtils.isEmpty(f39002l)) {
                f39002l = androidx.datastore.preferences.protobuf.a.f(k(), "");
            }
            return f39002l;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String n() {
        if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
            return "";
        }
        return Arrays.asList(Build.SUPPORTED_ABIS).toString();
    }

    public static String o() {
        String strC = "";
        try {
            Context contextK = com.smartdigimkt.m6.b.p().k();
            long jA = m.a();
            long jM = m();
            String str = "app_tki_" + jA + "_" + jM + "_";
            String str2 = (String) x.b(contextK, str, "");
            try {
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("1", "");
                    jSONObject.put("2", String.valueOf(jM));
                    jSONObject.put("3", String.valueOf(jA));
                    jSONObject.put("4", "");
                    jSONObject.put("5", "");
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                strC = com.smartdigimkt.v0.a.c(jSONObject.toString());
                x.d(contextK, str, strC);
            } catch (Exception e3) {
                e = e3;
                strC = str2;
                e.printStackTrace();
            }
        } catch (Exception e4) {
            e = e4;
        }
        return strC;
    }

    public static String h() {
        if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
            return "";
        }
        return Build.CPU_ABI2;
    }
}

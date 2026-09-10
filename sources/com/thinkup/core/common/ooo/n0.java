package com.thinkup.core.common.ooo;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Build;
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
import com.smartdigimkt.b0.a;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUSDKGlobalSetting;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class n0 {
    public static String m = null;
    private static volatile String m0 = null;
    private static volatile String mm = null;
    private static volatile String mm0 = null;
    private static volatile String mmm = null;
    private static volatile String mmn = null;
    private static volatile String mmo = null;
    private static int mn = 0;
    private static String mn0 = null;
    private static String mnm = null;
    private static String mnn = null;
    private static String mno = null;
    private static volatile String mom = null;
    private static volatile String mon = null;
    private static volatile String moo = null;
    private static volatile boolean n0 = false;
    private static String n00 = null;
    private static String n0m = null;
    private static String n0n = null;
    private static String n0o = null;
    private static volatile PackageInfo nm = null;
    private static String nm0 = null;
    private static BatteryManager nmm = null;
    private static volatile PackageInfo nmo = null;
    private static volatile String nn = null;
    private static String no = null;
    private static String no0 = null;
    private static String nom = null;
    private static String non = null;
    private static String noo = null;
    public static String o = null;
    public static final String o0 = "unknown";
    private static final String om = "n0";
    static String oo;
    private static final JSONObject on = new JSONObject();
    private static String mo = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile String f42334n = "";
    private static volatile String o00 = null;
    private static String o0o = "";
    private static String o0m = "";
    private static String o0n = "";
    private static String oo0 = "";
    private static int ooo = 0;
    private static String oom = "";
    private static String oon = "";
    private static String om0 = null;
    private static String omo = "";
    private static String omm = "";
    private static volatile String omn = null;
    private static volatile String on0 = null;
    private static volatile int ono = -1;
    private static volatile double onm = 0.0d;
    private static volatile int onn = -1;
    private static volatile int m00 = -999;
    private static volatile int m0o = -1;
    private static volatile int m0m = -1;
    private static volatile int m0n = -1;
    private static volatile int mo0 = -1;
    private static volatile String nmn = null;
    private static final Object nn0 = new Object();
    private static final Object nno = new Object();
    private static final Object nnm = new Object();
    private static final Object nnn = new Object();
    private static final Object o000 = new Object();
    private static final Object o00o = new Object();
    private static final Object o00m = new Object();
    private static final Object o00n = new Object();
    private static final Object o0o0 = new Object();
    private static final Object o0oo = new Object();
    private static final Object o0om = new Object();
    private static final Object o0on = new Object();
    private static final Object o0m0 = new Object();
    private static final Object o0mo = new Object();
    private static final Object o0mm = new Object();
    private static final Object o0mn = new Object();
    private static final Object o0n0 = new Object();

    /* JADX INFO: renamed from: com.thinkup.core.common.ooo.n0$1, reason: invalid class name */
    public class AnonymousClass1 implements com.thinkup.core.common.m.om.o {
        @Override // com.thinkup.core.common.m.om.o
        public final void o(PackageInfo packageInfo) {
            synchronized (n0.nno) {
                if (packageInfo != null) {
                    try {
                        String unused = n0.om0 = packageInfo.versionName;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.ooo.n0$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ Context o;

        public AnonymousClass3(Context context) {
            this.o = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebView webView = new WebView(this.o);
            nn.o(webView);
            String unused = n0.o00 = webView.getSettings().getUserAgentString();
        }
    }

    private n0() {
    }

    public static String m(Context context) {
        if (com.thinkup.core.common.n.o0n.m().n("mcc")) {
            return "";
        }
        if (context == null) {
            com.thinkup.core.common.n.o0n.m().on();
        }
        try {
            return !com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m() ? "" : omo;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String m0(Context context) {
        if (com.thinkup.core.common.n.o0n.m().n("app_vn")) {
            return "";
        }
        if (context == null) {
            context = com.thinkup.core.common.n.o0n.m().on();
        }
        try {
            if (!TextUtils.isEmpty(oo0)) {
                return oo0;
            }
            String str = omo(context).versionName;
            oo0 = str;
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    private static int m00(Context context) {
        if (context == null) {
            context = com.thinkup.core.common.n.o0n.m().on();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static int m0m(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return -1;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || !o00.o("android.permission.ACCESS_NETWORK_STATE", context) || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
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

    private static void m0n(Context context) {
        String str;
        com.thinkup.core.common.n.o0n.m();
        if (om0 == null) {
            synchronized (nno) {
                try {
                    try {
                        if (om0 == null) {
                            om0 = context.getPackageManager().getPackageInfo("com.android.vending", 0).versionName;
                        }
                        if (om0 == null) {
                            om0 = str;
                        }
                    } catch (Throwable unused) {
                        str = om0 == null ? "" : "";
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static int m0o(Context context) {
        if (context == null) {
            context = com.thinkup.core.common.n.o0n.m().on();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static String mm(Context context) {
        if (com.thinkup.core.common.n.o0n.m().n("package_name")) {
            return "";
        }
        if (context == null) {
            context = com.thinkup.core.common.n.o0n.m().on();
        }
        try {
            if (!TextUtils.isEmpty(o0n)) {
                return o0n;
            }
            String str = omo(context).packageName;
            o0n = str;
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    private static void mm0() {
    }

    private static void mmm() {
    }

    private static void mmn() {
    }

    private static boolean mmo() {
        Context contextOn = com.thinkup.core.common.n.o0n.m().on();
        return !com.thinkup.core.common.n.oom.o(contextOn).m() || mo0(contextOn) || com.thinkup.core.common.n.o0n.m().n("device_minor_data_deny");
    }

    public static String mn(Context context) {
        if (com.thinkup.core.common.n.o0n.m().n("it_src")) {
            return "";
        }
        if (context == null) {
            context = com.thinkup.core.common.n.o0n.m().on();
        }
        try {
            if (!TextUtils.isEmpty(o)) {
                return o;
            }
            String installerPackageName = context.getPackageManager().getInstallerPackageName(mm(context));
            o = installerPackageName;
            return installerPackageName;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String mo(Context context) {
        if (com.thinkup.core.common.n.o0n.m().n("screen")) {
            return "";
        }
        if (context == null) {
            context = com.thinkup.core.common.n.o0n.m().on();
        }
        try {
            if (!com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m()) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append((context == null ? com.thinkup.core.common.n.o0n.m().on() : context).getResources().getDisplayMetrics().widthPixels);
            sb.append("*");
            if (context == null) {
                context = com.thinkup.core.common.n.o0n.m().on();
            }
            sb.append(context.getResources().getDisplayMetrics().heightPixels);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private static int mon() {
        return Build.VERSION.SDK_INT;
    }

    public static String n(Context context) {
        if (com.thinkup.core.common.n.o0n.m().n("mnc")) {
            return "";
        }
        if (context == null) {
            com.thinkup.core.common.n.o0n.m().on();
        }
        try {
            return !com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m() ? "" : omm;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String n0(Context context) {
        if (com.thinkup.core.common.n.o0n.m().n("network_type")) {
            return "";
        }
        try {
            if (!com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m()) {
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
                if (o00.o("android.permission.ACCESS_NETWORK_STATE", context)) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        return x4.DISABLED_AUCTION_FALLBACK_ID;
                    }
                    int i2 = 1;
                    if (activeNetworkInfo.getType() == 1) {
                        return "-2";
                    }
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (telephonyManager == null) {
                            return "-3";
                        }
                        int networkType = telephonyManager.getNetworkType();
                        StringBuilder sb = new StringBuilder();
                        if (networkType != 20) {
                            switch (networkType) {
                                case 1:
                                case 2:
                                case 4:
                                case 7:
                                case 11:
                                    break;
                                case 3:
                                case 5:
                                case 6:
                                case 8:
                                case 9:
                                case 10:
                                case 12:
                                case 14:
                                case 15:
                                    i2 = 3;
                                    break;
                                case 13:
                                    i2 = 13;
                                    break;
                                default:
                                    i2 = -1;
                                    break;
                            }
                        } else {
                            i2 = 16;
                        }
                        sb.append(i2);
                        return sb.toString();
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

    public static String nm(Context context) {
        if (TextUtils.isEmpty(m)) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            m = String.valueOf(displayMetrics.density);
        }
        return m;
    }

    public static void nn(Context context) {
        try {
            o00 = WebSettings.getDefaultUserAgent(context);
            onm.m(context, com.thinkup.core.common.n.oo0.m.o, com.thinkup.core.common.n.oo0.o.o0m, o00);
            onm.m(context, com.thinkup.core.common.n.oo0.m.o, "local_os", Build.VERSION.RELEASE);
        } catch (Throwable unused) {
        }
    }

    public static String no(Context context) {
        if (om0 == null) {
            synchronized (nno) {
                try {
                    String str = om0;
                    if (str == null) {
                        com.thinkup.core.common.n.o0n.m();
                        try {
                            String str2 = context.getPackageManager().getPackageInfo("com.android.vending", 0).versionName;
                            om0 = str2;
                            if (str2 == null) {
                                om0 = "";
                            }
                            return om0;
                        } catch (Exception unused) {
                            om0 = "";
                            return "";
                        }
                    }
                    if (str == null) {
                        om0 = "";
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return om0;
    }

    private static int o(int i2) {
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

    public static String o0(Context context) {
        if (com.thinkup.core.common.n.o0n.m().n("android_id") || !com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m()) {
            return "";
        }
        if (nn != null) {
            return nn;
        }
        com.thinkup.core.common.n.o0m o0mVarN = com.thinkup.core.common.n.o0n.m().n();
        if (o0mVarN != null) {
            if (context == null) {
                context = com.thinkup.core.common.n.o0n.m().on();
            }
            synchronized (nnm) {
                try {
                    if (nn != null) {
                        return nn;
                    }
                    String strN = onm.n(context, com.thinkup.core.common.n.oo0.m.o, com.thinkup.core.common.n.oo0.o.on, "");
                    nn = strN;
                    if (TextUtils.isEmpty(strN)) {
                        nn = o0mVarN.getAid(context);
                        if (!TextUtils.isEmpty(nn)) {
                            onm.m(context, com.thinkup.core.common.n.oo0.m.o, com.thinkup.core.common.n.oo0.o.on, nn);
                        }
                    }
                    if (nn == null) {
                        nn = "";
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nn;
    }

    public static void o00(Context context) {
        synchronized (o000) {
            try {
                if (TextUtils.isEmpty(com.thinkup.core.common.n.o0n.m().ono())) {
                    com.thinkup.core.common.n.o0m o0mVarN = com.thinkup.core.common.n.o0n.m().n();
                    String uniqueId = o0mVarN != null ? o0mVarN.getUniqueId(context) : "";
                    if (TextUtils.isEmpty(uniqueId)) {
                        uniqueId = o0o(context);
                    }
                    if (TextUtils.isEmpty(uniqueId) || Pattern.matches("^[0-]+$", uniqueId)) {
                        uniqueId = nn();
                    }
                    if (TextUtils.isEmpty(uniqueId)) {
                        uniqueId = o0(context);
                    }
                    if (TextUtils.isEmpty(uniqueId)) {
                        uniqueId = UUID.randomUUID().toString();
                    }
                    com.thinkup.core.common.n.o0n.m().n0(nm.o(uniqueId));
                    com.thinkup.core.common.n.o0n.m().ono();
                    com.thinkup.core.common.oo0.oo.o("", "3", "", String.valueOf(System.currentTimeMillis()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int o0m(Context context) {
        if (m0o == -1) {
            m0o = o00.o(context, a.G1) ? 1 : 0;
        }
        return m0o;
    }

    public static String o0n(Context context) {
        return mm("isagent") ? "" : ooo.o(context);
    }

    public static String o0o(final Context context) {
        if (context == null || com.thinkup.core.common.n.o0n.m().n("gaid")) {
            return "";
        }
        String strOm = om();
        if (!TextUtils.isEmpty(strOm)) {
            return strOm;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return "";
        }
        synchronized (o00o) {
            try {
                try {
                    if (!TextUtils.isEmpty(m0)) {
                        return m0;
                    }
                    Callable<String> callable = new Callable<String>() { // from class: com.thinkup.core.common.ooo.n0.4
                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // java.util.concurrent.Callable
                        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                        public String call() {
                            try {
                                try {
                                    Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
                                    Method method = AdvertisingIdClient.Info.class.getMethod("getId", new Class[0]);
                                    method.setAccessible(true);
                                    return (String) method.invoke(objInvoke, new Object[0]);
                                } catch (Throwable unused) {
                                    return new com.thinkup.core.common.n.oo().o(context).o();
                                }
                            } catch (Throwable unused2) {
                                String unused3 = n0.om;
                                return "";
                            }
                        }
                    };
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
                    try {
                        String str = (String) threadPoolExecutor.submit(callable).get(2L, TimeUnit.SECONDS);
                        if (!TextUtils.isEmpty(str) && !Pattern.matches("^[0-]+$", str)) {
                            m0 = str;
                            onm.m(com.thinkup.core.common.n.o0n.m().on(), com.thinkup.core.common.n.oo0.m.o, com.thinkup.core.common.n.oo0.o.o0, m0);
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

    public static String om0(Context context) {
        return mm("battery") ? "" : ooo.om(context);
    }

    public static String omm() {
        if (mmo()) {
            return "";
        }
        if (n0m == null) {
            try {
                n0m = Build.HOST;
            } catch (Throwable unused) {
                n0m = "";
            }
        }
        String str = n0m;
        if (str == null) {
            n0m = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return n0m;
    }

    public static String omn() {
        if (mmo()) {
            return "";
        }
        if (n0n == null) {
            try {
                n0n = Build.VERSION.CODENAME;
            } catch (Throwable unused) {
                n0n = "";
            }
        }
        String str = n0n;
        if (str == null) {
            n0n = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return n0n;
    }

    public static String omo() {
        if (mmo()) {
            return "";
        }
        if (n0o == null) {
            try {
                n0o = Build.HARDWARE;
            } catch (Throwable unused) {
                n0o = "";
            }
        }
        String str = n0o;
        if (str == null) {
            n0o = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return n0o;
    }

    public static String on0() {
        if (mmo()) {
            return "";
        }
        if (no0 == null) {
            try {
                no0 = Build.VERSION.INCREMENTAL;
            } catch (Throwable unused) {
                no0 = "";
            }
        }
        String str = no0;
        if (str == null) {
            no0 = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return no0;
    }

    private static String onm(Context context) {
        if (context == null) {
            return "";
        }
        try {
            String strO0 = o0(context);
            if (TextUtils.isEmpty(strO0)) {
                return "";
            }
            if (TextUtils.isEmpty(oo)) {
                oo = nm.m(strO0);
            }
        } catch (Throwable unused) {
        }
        return oo;
    }

    private static boolean onn(Context context) {
        return om(context) == 2;
    }

    public static String ono() {
        if (mmo()) {
            return "";
        }
        if (noo == null) {
            try {
                noo = Build.SERIAL;
            } catch (Throwable unused) {
                noo = "";
            }
        }
        String str = noo;
        if (str == null) {
            noo = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return noo;
    }

    public static String oo0(Context context) {
        return (mo0(context) || mm("is_vpn")) ? "" : ooo.n(context);
    }

    public static String oom(Context context) {
        if (mmm == null) {
            synchronized (o0mn) {
                try {
                    if (mmm == null) {
                        mmm = ooo.oo(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mmm;
    }

    public static String oon(Context context) {
        return mm("is_charge") ? "" : ooo.m(context);
    }

    public static String ooo(Context context) {
        if (mmo == null) {
            synchronized (o0mm) {
                try {
                    if (mmo == null) {
                        mmo = ooo.o0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mmo;
    }

    private static boolean mo0(Context context) {
        return !com.thinkup.core.oo.o0.o(context).m(com.thinkup.core.common.n.o0n.m().o00()).o0m0();
    }

    private static PackageInfo moo(Context context) {
        PackageInfo packageInfo;
        if (nmo == null) {
            synchronized (o0on) {
                try {
                    if (nmo == null) {
                        try {
                            nmo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                            if (nmo == null) {
                                packageInfo = new PackageInfo();
                                nmo = packageInfo;
                            }
                        } catch (Throwable unused) {
                            if (nmo == null) {
                                packageInfo = new PackageInfo();
                                nmo = packageInfo;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nmo;
    }

    public static void o(Context context) {
        try {
            o0();
            mm(context);
            m0(context);
            on(context);
            om(context);
            o();
            m();
            o0(context);
            o0o(context);
            oo(context);
            n();
            m0n(context);
            omm(context);
            omn(context);
            on0(context);
            ono(context);
            if (o00.o("android.permission.READ_PHONE_STATE", context)) {
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (o00.m(simOperator) && simOperator.length() > 3) {
                    omo = simOperator.substring(0, 3);
                    omm = simOperator.substring(3, simOperator.length());
                }
            }
            o0o();
            o0m();
            ooo(context);
            oom(context);
            o0n();
            oo0();
            ooo();
            oom();
            oon();
            om0();
            omo();
            omm();
            omn();
            on0();
            ono();
            onm();
            onn();
            m00();
        } catch (Exception unused) {
        }
    }

    public static int om(Context context) {
        if (com.thinkup.core.common.n.o0n.m().n("orient")) {
            return 0;
        }
        if (context == null) {
            context = com.thinkup.core.common.n.o0n.m().on();
        }
        return context.getResources().getConfiguration().orientation == 2 ? 2 : 1;
    }

    public static String on(Context context) {
        if (com.thinkup.core.common.n.o0n.m().n("app_vc")) {
            return "";
        }
        if (context == null) {
            context = com.thinkup.core.common.n.o0n.m().on();
        }
        if (ooo != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(ooo);
            return sb.toString();
        }
        try {
            ooo = omo(context).versionCode;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ooo);
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String onn() {
        if (mmo()) {
            return "";
        }
        if (non == null) {
            try {
                non = "1";
            } catch (Throwable unused) {
                non = "";
            }
        }
        return non;
    }

    public static String oo(Context context) {
        if (com.thinkup.core.common.n.o0n.m().n("language")) {
            return "";
        }
        if (context == null) {
            context = com.thinkup.core.common.n.o0n.m().on();
        }
        try {
            if (!com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m()) {
                return "";
            }
            if (!TextUtils.isEmpty(oom)) {
                return oom;
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            oom = language;
            return language;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String m00() {
        if (mmo()) {
            return "";
        }
        if (nm0 == null) {
            try {
                nm0 = Build.BOARD;
            } catch (Throwable unused) {
                nm0 = "";
            }
        }
        String str = nm0;
        if (str == null) {
            nm0 = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return nm0;
    }

    public static String m0o() {
        return no;
    }

    public static String o0m() {
        if (mm("isroot")) {
            return "";
        }
        if (mm0 == null) {
            synchronized (o0mo) {
                try {
                    if (mm0 == null) {
                        mm0 = ooo.o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mm0;
    }

    public static String o0n() {
        if (mm("http_able")) {
            return "";
        }
        if (mmn == null) {
            mmn = o00.o() ? "1" : "0";
        }
        return mmn;
    }

    public static String om0() {
        if (mmo()) {
            return "";
        }
        if (n00 == null) {
            try {
                n00 = Build.BOOTLOADER;
            } catch (Throwable unused) {
                n00 = "";
            }
        }
        String str = n00;
        if (str == null) {
            n00 = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return n00;
    }

    public static String oo0() {
        if (mmo()) {
            return "";
        }
        if (mn0 == null) {
            try {
                mn0 = Build.TYPE;
            } catch (Throwable unused) {
            }
        }
        String str = mn0;
        if (str == null) {
            mn0 = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return mn0;
    }

    public static String oon() {
        if (mmo()) {
            return "";
        }
        if (mnn == null) {
            try {
                mnn = Build.RADIO;
            } catch (Throwable unused) {
                mnn = "";
            }
        }
        String str = mnn;
        if (str == null) {
            mnn = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return mnn;
    }

    public static String m() {
        if (com.thinkup.core.common.n.o0n.m().n("brand")) {
            return "";
        }
        try {
            return !com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m() ? "" : Build.BRAND;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String n() {
        if (com.thinkup.core.common.n.o0n.m().n("timezone")) {
            return "";
        }
        try {
            if (!com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m()) {
                return "";
            }
            try {
                if (TextUtils.isEmpty(oon)) {
                    String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                    oon = displayName;
                    return displayName;
                }
            } catch (Throwable unused) {
            }
            return oon;
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String nn() {
        String str;
        if (com.thinkup.core.common.n.o0n.m().n("amazon_id") || !com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m()) {
            return "";
        }
        if (mm == null) {
            synchronized (o00m) {
                try {
                    if (mm == null) {
                        String strN = onm.n(com.thinkup.core.common.n.o0n.m().on(), com.thinkup.core.common.n.oo0.m.o, com.thinkup.core.common.n.oo0.o.om, "");
                        mm = strN;
                        if (TextUtils.isEmpty(strN)) {
                            try {
                                mm = Settings.Secure.getString(com.thinkup.core.common.n.o0n.m().on().getContentResolver(), "advertising_id");
                                if (!TextUtils.isEmpty(mm)) {
                                    onm.m(com.thinkup.core.common.n.o0n.m().on(), com.thinkup.core.common.n.oo0.m.o, com.thinkup.core.common.n.oo0.o.om, mm);
                                } else {
                                    mm = "";
                                }
                                if (mm == null) {
                                    str = "";
                                    mm = str;
                                }
                            } catch (Throwable unused) {
                                if (mm == null) {
                                    str = "";
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mm;
    }

    public static String om() {
        try {
            if (!com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m()) {
                return "";
            }
            if (m0 == null) {
                synchronized (o00o) {
                    try {
                        if (m0 == null) {
                            m0 = onm.n(com.thinkup.core.common.n.o0n.m().on(), com.thinkup.core.common.n.oo0.m.o, com.thinkup.core.common.n.oo0.o.o0, "");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return m0;
        } catch (Exception unused) {
            return "";
        }
    }

    private static void m0(String str) {
        m0 = str;
        onm.m(com.thinkup.core.common.n.o0n.m().on(), com.thinkup.core.common.n.oo0.m.o, com.thinkup.core.common.n.oo0.o.o0, m0);
    }

    public static String m0m() {
        String str;
        try {
            if (com.thinkup.core.common.n.o0n.m().n("ip_v4")) {
                str = "";
                if (omn == null) {
                }
                return str;
            }
            if (omn != null) {
                str = omn;
                if (omn != null) {
                    return str;
                }
            } else {
                if (!TUSDKGlobalSetting.enableGetDeviceInfoInBg) {
                    com.thinkup.core.common.n.o0n.m();
                    if (!com.thinkup.core.common.n.o0n.omo()) {
                        str = omn;
                        if (omn != null) {
                            return str;
                        }
                    }
                }
                synchronized (o0oo) {
                    if (omn != null) {
                        String str2 = omn;
                        if (omn == null) {
                            omn = "";
                        }
                        return str2;
                    }
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                            if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                                String hostAddress = inetAddress.getHostAddress();
                                if (!TextUtils.isEmpty(hostAddress)) {
                                    omn = hostAddress;
                                }
                            }
                        }
                    }
                    if (omn == null) {
                        omn = "";
                    }
                    if (omn == null) {
                        omn = "";
                    }
                    return omn;
                }
            }
            omn = "";
            return str;
        } catch (Throwable unused) {
            if (omn == null) {
            }
        }
    }

    public static String mm() {
        if (nmn != null) {
            return nmn;
        }
        if (com.thinkup.core.common.n.o0n.m().n("sys_ua")) {
            return "";
        }
        if (nmn == null) {
            synchronized (nn0) {
                if (nmn == null) {
                    try {
                        nmn = System.getProperty("http.agent");
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (nmn == null) {
            nmn = "";
        }
        return nmn;
    }

    public static String mn() {
        if (!TextUtils.isEmpty(f42334n)) {
            return f42334n;
        }
        String strMmm = com.thinkup.core.common.n.o0n.m().mmm();
        if (!TextUtils.isEmpty(strMmm)) {
            f42334n = strMmm;
        } else {
            synchronized (o0n0) {
                String strMmm2 = com.thinkup.core.common.n.o0n.m().mmm();
                if (TextUtils.isEmpty(strMmm2)) {
                    strMmm2 = "1";
                    try {
                        Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                        strMmm2 = "2";
                    } catch (Throwable unused) {
                    }
                    try {
                        Class.forName("org.cocos2dx.lib.Cocos2dxActivity");
                        Class.forName("org.cocos2dx.lib.Cocos2dxJavascriptJavaBridge");
                        strMmm2 = "4";
                    } catch (Throwable unused2) {
                    }
                    try {
                        Class.forName("com.facebook.react.ReactActivity");
                        strMmm2 = "5";
                    } catch (Throwable unused3) {
                    }
                    try {
                        Class.forName("io.flutter.embedding.android.FlutterActivity");
                        strMmm2 = "6";
                    } catch (Throwable unused4) {
                    }
                }
                f42334n = strMmm2;
            }
        }
        return f42334n;
    }

    public static int nm() {
        if (m0n != -1) {
            return m0n;
        }
        m0n = 0;
        try {
            m0n = ((Integer) Class.forName("com.tencent.mm.opensdk.constants.Build").getField("SDK_INT").get(null)).intValue();
        } catch (Throwable unused) {
        }
        return m0n;
    }

    public static String onm() {
        if (mmo()) {
            return "";
        }
        if (nom == null) {
            try {
                nom = Build.DISPLAY;
            } catch (Throwable unused) {
                nom = "";
            }
        }
        String str = nom;
        if (str == null) {
            nom = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return nom;
    }

    public static String oom() {
        if (mmo()) {
            return "";
        }
        if (mnm == null) {
            try {
                mnm = Build.USER;
            } catch (Throwable unused) {
                mnm = "";
            }
        }
        String str = mnm;
        if (str == null) {
            mnm = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return mnm;
    }

    public static String ooo() {
        if (mmo()) {
            return "";
        }
        if (TextUtils.isEmpty(mno)) {
            try {
                mno = Build.TAGS;
            } catch (Throwable unused) {
            }
        }
        String str = mno;
        if (str == null) {
            mno = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return mno;
    }

    public static int m(String str) {
        if (mo0 != -1) {
            return mo0;
        }
        mo0 = 0;
        try {
            mo0 = ((Integer) Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("getWXAppSupportAPI", new Class[0]).invoke(n(str), new Object[0])).intValue();
        } catch (Throwable unused) {
        }
        return mo0;
    }

    public static JSONObject on() {
        try {
            return new JSONObject(mo);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static String m0() {
        if (com.thinkup.core.common.n.o0n.m().n("ua") || !com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m()) {
            return "";
        }
        synchronized (nnn) {
            try {
                String strMo = mo();
                if (!TextUtils.isEmpty(strMo)) {
                    return strMo;
                }
                String str = Build.VERSION.RELEASE;
                String strO = o();
                String str2 = Build.ID;
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strO) && !TextUtils.isEmpty(str2)) {
                    return "Mozilla/5.0 (Linux; Android " + str + "; " + strO + " Build/" + str2 + ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
                }
                return "";
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int omm(Context context) {
        TelephonyManager telephonyManager;
        try {
            if (!mm("s_c") && !mo0(context)) {
                if (m00 != -999) {
                    return m00;
                }
                if (o00.o("android.permission.READ_PHONE_STATE", context) && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                    if (telephonyManager.getSimState() == 5) {
                        m00 = 2;
                    } else if (telephonyManager.getSimState() == 1) {
                        m00 = 1;
                    } else {
                        m00 = -1;
                    }
                } else {
                    m00 = -1;
                }
                return m00;
            }
            return -1;
        } catch (Throwable unused) {
            m00 = -1;
        }
    }

    public static int omn(Context context) {
        try {
            if (com.thinkup.core.common.n.o0n.m().n("u_a")) {
                return -1;
            }
            if (m00 != -1) {
                return m00;
            }
            if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 1) {
                onn = 2;
            } else {
                onn = 1;
            }
            return onn;
        } catch (Throwable unused) {
        }
    }

    public static PackageInfo omo(Context context) {
        PackageInfo packageInfo;
        if (nm == null) {
            synchronized (o0o0) {
                try {
                    if (nm == null) {
                        try {
                            nm = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                            if (nm == null) {
                                packageInfo = new PackageInfo();
                                nm = packageInfo;
                            }
                        } catch (Throwable unused) {
                            if (nm == null) {
                                packageInfo = new PackageInfo();
                                nm = packageInfo;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nm;
    }

    public static double on0(Context context) {
        try {
            if (mm("battery")) {
                return 0.0d;
            }
            if (onm != 0.0d) {
                return onm;
            }
            if (nmm == null) {
                nmm = (BatteryManager) context.getSystemService("batterymanager");
            }
            BatteryManager batteryManager = nmm;
            if (batteryManager != null) {
                double intProperty = ((double) batteryManager.getIntProperty(4)) / 100.0d;
                onm = intProperty;
                return intProperty;
            }
            return onm;
        } catch (Throwable unused) {
        }
    }

    public static int ono(Context context) {
        try {
            if (com.thinkup.core.common.n.o0n.m().n("d_s")) {
                return -1;
            }
            if (ono != -1) {
                return ono;
            }
            if (Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                ono = 2;
            } else {
                ono = 1;
            }
            return ono;
        } catch (Throwable unused) {
        }
    }

    public static String oo() {
        if (com.thinkup.core.common.n.o0n.m().n("os_vn")) {
            return "";
        }
        if (TextUtils.isEmpty(o0o)) {
            o0o = Build.VERSION.RELEASE;
        }
        return o0o;
    }

    public static Object n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory").getMethod("createWXAPI", Context.class, String.class).invoke(null, com.thinkup.core.common.n.o0n.m().on(), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int n0() {
        if (m0m == -1) {
            try {
                Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
                Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram");
                m0m = 1;
            } catch (Throwable unused) {
                m0m = 0;
            }
        }
        return m0m;
    }

    public static String m0n() {
        String str;
        try {
            if (com.thinkup.core.common.n.o0n.m().n("ip_v6")) {
                str = "";
                if (on0 == null) {
                }
                return str;
            }
            if (on0 != null) {
                str = on0;
                if (on0 != null) {
                    return str;
                }
            } else {
                if (!TUSDKGlobalSetting.enableGetDeviceInfoInBg) {
                    com.thinkup.core.common.n.o0n.m();
                    if (!com.thinkup.core.common.n.o0n.omo()) {
                        str = on0;
                        if (on0 != null) {
                            return str;
                        }
                    }
                }
                synchronized (o0om) {
                    if (on0 != null) {
                        String str2 = on0;
                        if (on0 == null) {
                            on0 = "";
                        }
                        return str2;
                    }
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                            if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet6Address)) {
                                String hostAddress = inetAddress.getHostAddress();
                                if (!TextUtils.isEmpty(hostAddress)) {
                                    on0 = hostAddress;
                                }
                            }
                        }
                    }
                    if (on0 == null) {
                        on0 = "";
                    }
                    if (on0 == null) {
                        on0 = "";
                    }
                    return on0;
                }
            }
            on0 = "";
            return str;
        } catch (Throwable unused) {
            if (on0 == null) {
            }
        }
    }

    public static String mo() {
        if (!TextUtils.isEmpty(o00)) {
            return o00;
        }
        synchronized (nnn) {
            try {
                if (!TextUtils.isEmpty(o00)) {
                    return o00;
                }
                if (o00 == null) {
                    o00 = onm.n(com.thinkup.core.common.n.o0n.m().on(), com.thinkup.core.common.n.oo0.m.o, com.thinkup.core.common.n.oo0.o.o0m, "");
                    if (!TextUtils.isEmpty(o00)) {
                        return o00;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String no() {
        Object obj;
        String strO0 = com.thinkup.core.common.n.o0n.m().o0();
        if (!TextUtils.isEmpty(strO0)) {
            return strO0;
        }
        try {
            Map<String, Object> mapNo = com.thinkup.core.common.n.o0n.m().no();
            if (mapNo != null && (obj = mapNo.get(TUAdConst.KEY.WECHAT_APPID)) != null) {
                return obj.toString();
            }
        } catch (Throwable unused) {
        }
        com.thinkup.core.oo.m mVarH = com.google.firebase.crashlytics.internal.model.a.h(com.google.firebase.crashlytics.internal.model.a.i());
        if (mVarH != null) {
            return mVarH.oomo();
        }
        return null;
    }

    public static String m(Context context, String str) {
        Signature[] signatureArr;
        Signature signature;
        if (com.thinkup.core.common.n.o0n.m().n(str)) {
            return "";
        }
        if (!TextUtils.isEmpty(moo)) {
            return moo;
        }
        try {
            PackageInfo packageInfoMoo = moo(context);
            if (packageInfoMoo != null && (signatureArr = packageInfoMoo.signatures) != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null) {
                byte[] bArrDigest = MessageDigest.getInstance(mm.m("U0hBMQ==")).digest(signature.toByteArray());
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArrDigest) {
                    sb.append(Integer.toHexString((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 256).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                String strSubstring = sb.substring(0, sb.length() - 1);
                moo = strSubstring;
                return strSubstring;
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String n(Context context, String str) {
        Signature[] signatureArr;
        Signature signature;
        if (com.thinkup.core.common.n.o0n.m().n(str)) {
            return "";
        }
        if (!TextUtils.isEmpty(mom)) {
            return mom;
        }
        try {
            PackageInfo packageInfoMoo = moo(context);
            if (packageInfoMoo != null && (signatureArr = packageInfoMoo.signatures) != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null) {
                byte[] bArrDigest = MessageDigest.getInstance(mm.m("TUQ1")).digest(signature.toByteArray());
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArrDigest) {
                    sb.append(Integer.toHexString((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 256).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                String strSubstring = sb.substring(0, sb.length() - 1);
                mom = strSubstring;
                return strSubstring;
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    private static boolean mm(String str) {
        return com.thinkup.core.common.n.o0n.m().n(str) || !com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m();
    }

    public static int o00() {
        if (!com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m()) {
            return -1;
        }
        if (mn <= 0 && !n0) {
            synchronized (o00n) {
                try {
                    if (!n0) {
                        int i2 = 1;
                        n0 = true;
                        try {
                            if (Settings.Secure.getInt(com.thinkup.core.common.n.o0n.m().on().getContentResolver(), "limit_ad_tracking") != 0) {
                                i2 = 2;
                            }
                            mn = i2;
                        } catch (Throwable unused) {
                            mn = -1;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mn;
    }

    public static String o0() {
        if (com.thinkup.core.common.n.o0n.m().n("os_vc")) {
            return "";
        }
        try {
            if (!com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m()) {
                return "";
            }
            if (TextUtils.isEmpty(o0m)) {
                o0m = String.valueOf(Build.VERSION.SDK_INT);
            }
            return o0m;
        } catch (Exception unused) {
            return "";
        }
    }

    private static boolean mo(String str) {
        return Pattern.matches("^[0-]+$", str);
    }

    public static String o0o() {
        if (mm("cpu")) {
            return "";
        }
        if (mon == null) {
            synchronized (o0m0) {
                try {
                    if (mon == null) {
                        mon = ooo.m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mon;
    }

    private static String o0(Context context, String str) {
        if (context == null) {
            context = com.thinkup.core.common.n.o0n.m().on();
        }
        if (context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
                StringBuilder sb = new StringBuilder();
                sb.append(packageInfo.versionCode);
                return sb.toString();
            } catch (Throwable unused) {
                return "";
            }
        }
        return "";
    }

    public static void o0(String str) {
        no = str;
    }

    public static String o() {
        if (com.thinkup.core.common.n.o0n.m().n("model")) {
            return "";
        }
        try {
            return !com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m() ? "" : Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    public static void o(final int i2, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.ooo.n0.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (n0.on) {
                    if (n0.on.has(String.valueOf(i2))) {
                        return;
                    }
                    try {
                        n0.on.put(String.valueOf(i2), str);
                        String unused = n0.mo = n0.on.toString();
                    } catch (Throwable unused2) {
                    }
                }
            }
        }, 13);
    }

    public static String o(String str) {
        try {
            return on.getString(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static PackageInfo o(Context context, String str) {
        if (context == null) {
            context = com.thinkup.core.common.n.o0n.m().on();
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
}

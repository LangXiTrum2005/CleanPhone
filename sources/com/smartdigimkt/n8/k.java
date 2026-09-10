package com.smartdigimkt.n8;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Build;
import android.text.TextUtils;
import com.p004ironsource.x4;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f37211a = {"/su", "/su/bin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/xbin/su", "/system/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/system/bin/cufsdosck", "/system/xbin/cufsdosck", "/system/bin/cufsmgr", "/system/xbin/cufsmgr", "/system/bin/cufaevdd", "/system/xbin/cufaevdd", "/system/bin/conbb", "/system/xbin/conbb"};

    public static String a() {
        try {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                str = Build.CPU_ABI2;
            }
            return str != null ? str : "";
        } catch (Throwable unused) {
        }
    }

    public static String b() {
        try {
            boolean z2 = false;
            for (String str : f37211a) {
                if (new File(str).exists()) {
                    z2 = true;
                    break;
                }
            }
            String str2 = Build.TAGS;
            return ((str2 == null || !str2.contains("test-keys")) && !z2) ? "2" : "1";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String c(Context context) {
        return g(context) ? "1" : "2";
    }

    public static String d(Context context) {
        return j(context) ? "1" : "2";
    }

    public static String e(Context context) {
        try {
            return String.valueOf(((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String f(Context context) {
        return h(context) ? "1" : "2";
    }

    private static boolean g(Context context) {
        String strA = a(context, "ro.product.cpu.abi");
        return (strA == null || TextUtils.isEmpty(strA) || !strA.contains("x86")) ? false : true;
    }

    private static boolean h(Context context) {
        NetworkInfo networkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (networkInfo = connectivityManager.getNetworkInfo(17)) != null) {
                return networkInfo.isConnected();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String i(Context context) {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property2 == null) {
                property2 = x4.f;
            }
            return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? "2" : "1";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean j(Context context) {
        return "1".equals(a(context, "ro.kernel.qemu"));
    }

    public static String a(Context context) {
        int i2 = 2;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            boolean z2 = intExtra == 2 || intExtra == 5;
            int intExtra2 = intentRegisterReceiver.getIntExtra("plugged", -1);
            boolean z3 = intExtra2 == 2;
            boolean z4 = intExtra2 == 1;
            if (z2 && (z3 || z4)) {
                i2 = 1;
            }
        } catch (Throwable unused) {
        }
        return String.valueOf(i2);
    }

    public static String b(Context context) {
        int i2 = 2;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            boolean z2 = intExtra == 2 || intExtra == 5;
            int intExtra2 = intentRegisterReceiver.getIntExtra("plugged", -1);
            boolean z3 = intExtra2 == 2;
            boolean z4 = intExtra2 == 1;
            if (z2 && (z3 || z4)) {
                i2 = 1;
            }
        } catch (Throwable unused) {
        }
        return String.valueOf(i2);
    }

    private static String a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}

package com.thinkup.core.common.ooo;

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

/* JADX INFO: loaded from: classes6.dex */
public final class ooo {
    private static final String[] o = {"/su", "/su/bin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/xbin/su", "/system/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/system/bin/cufsdosck", "/system/xbin/cufsdosck", "/system/bin/cufsmgr", "/system/xbin/cufsmgr", "/system/bin/cufaevdd", "/system/xbin/cufaevdd", "/system/bin/conbb", "/system/xbin/conbb"};

    public static String m() {
        try {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                str = Build.CPU_ABI2;
            }
            return str != null ? str : "";
        } catch (Throwable unused) {
        }
    }

    private static boolean m0(Context context) {
        return "1".equals(o(context, "ro.kernel.qemu"));
    }

    private static boolean mo(Context context) {
        String strO = o(context, "ro.product.cpu.abi");
        return (strO == null || TextUtils.isEmpty(strO) || !strO.contains("x86")) ? false : true;
    }

    public static String n(Context context) {
        return on(context) ? "1" : "2";
    }

    public static String o() {
        try {
            boolean z2 = false;
            for (String str : o) {
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

    public static String o0(Context context) {
        String strO = o(context, "ro.product.cpu.abi");
        return (strO == null || TextUtils.isEmpty(strO) || !strO.contains("x86")) ? "2" : "1";
    }

    public static String om(Context context) {
        try {
            return String.valueOf(((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4));
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean on(Context context) {
        NetworkInfo networkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(17)) == null) {
                return false;
            }
            return networkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    public static String oo(Context context) {
        return "1".equals(o(context, "ro.kernel.qemu")) ? "1" : "2";
    }

    public static String m(Context context) {
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

    public static String o(Context context) {
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

    private static String o(Context context, String str) {
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

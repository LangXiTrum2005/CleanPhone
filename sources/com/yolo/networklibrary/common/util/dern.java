package com.yolo.networklibrary.common.util;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: DeviceUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static boolean f23966attabal = false;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static String f23967dern = "";

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static boolean f23968saneness = false;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static String f23969wireman = "";

    /* JADX INFO: compiled from: DeviceUtil.java */
    public class attabal implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Context f23970kowloon;

        public attabal(Context context, taiyuan taiyuanVar) {
            this.f23970kowloon = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = dern.f23969wireman = AdvertisingIdClient.getAdvertisingIdInfo(this.f23970kowloon).getId();
                if (TextUtils.isEmpty(dern.competently())) {
                    dern.adultoid(dern.f23969wireman);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void adultoid(String str) {
        babyless.beachfront.apical("sp_base_storage_common_gaid", str);
    }

    public static String apical(Context context) {
        Locale localeImpromptu = impromptu(context);
        if (localeImpromptu == null) {
            return "";
        }
        String language = localeImpromptu.getLanguage();
        return !TextUtils.isEmpty(language) ? language : "";
    }

    public static long arytenoidectomy() {
        return System.currentTimeMillis() / 1000;
    }

    public static String beachfront(Context context) {
        if (!agent.marial.attabal(f23967dern)) {
            return f23967dern;
        }
        try {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            if (Build.VERSION.SDK_INT >= 30) {
                installerPackageName = context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName();
            }
            if (installerPackageName != null && !agent.marial.attabal(installerPackageName)) {
                f23967dern = installerPackageName;
                return installerPackageName;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static String competently() {
        return babyless.beachfront.taiyuan("sp_base_storage_common_gaid", "");
    }

    public static String cutely(Context context) {
        String strTriweekly;
        if (context == null || (strTriweekly = triweekly(context)) == null || strTriweekly.length() < 5) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) strTriweekly, 3, 5);
        return sb.toString();
    }

    public static boolean dern(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("[a-f0-9A-F]{1,32}", str);
    }

    public static String formularize(Context context) {
        Locale localeImpromptu = impromptu(context);
        if (localeImpromptu == null) {
            return "";
        }
        return localeImpromptu.getCountry() + "_" + localeImpromptu.getLanguage();
    }

    public static boolean graveside() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            for (NetworkInterface networkInterface : Collections.list(networkInterfaces)) {
                if (networkInterface.isUp() && networkInterface.getInterfaceAddresses().size() != 0 && ("tun0".equals(networkInterface.getName()) || "ppp0".equals(networkInterface.getName()))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String impassible() {
        try {
            String str = Build.SERIAL;
            return TextUtils.isEmpty(str) ? "" : str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static Locale impromptu(Context context) {
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    public static TelephonyManager kowloon(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return (TelephonyManager) context.getSystemService("phone");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String marial(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            return (!TextUtils.isEmpty(string) && dern(string)) ? string : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static synchronized boolean molybdenite(Context context) {
        if (f23966attabal) {
            return f23968saneness;
        }
        boolean zKowloon = new cyrtometer.saneness(context).kowloon();
        f23968saneness = zKowloon;
        f23966attabal = true;
        return zKowloon;
    }

    public static String monoploid(Context context) {
        if (context == null) {
            return "";
        }
        String strMarial = marial(context);
        if (!TextUtils.isEmpty(strMarial)) {
            return strMarial;
        }
        String strImpassible = impassible();
        if (TextUtils.isEmpty(strImpassible)) {
            return "";
        }
        return "s" + strImpassible;
    }

    public static void polloi(Context context, taiyuan<String> taiyuanVar) {
        revolt.attabal.f36720attabal.cutely().submit(new attabal(context, taiyuanVar));
    }

    public static String taiyuan(Context context) {
        String strTriweekly;
        if (context == null || (strTriweekly = triweekly(context)) == null || strTriweekly.length() < 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) strTriweekly, 0, 3);
        return sb.toString();
    }

    public static String triweekly(Context context) {
        TelephonyManager telephonyManagerKowloon;
        if (context == null || (telephonyManagerKowloon = kowloon(context)) == null) {
            return null;
        }
        return telephonyManagerKowloon.getSimOperator();
    }

    public static String wireman(Context context) {
        if (!TextUtils.isEmpty(f23969wireman)) {
            return f23969wireman;
        }
        polloi(context, null);
        return "";
    }
}

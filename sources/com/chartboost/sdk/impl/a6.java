package com.chartboost.sdk.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f13405a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f13406b = 5;

    public static String a(Context context) {
        ContentResolver contentResolver;
        if (context == null || Build.VERSION.SDK_INT >= 26 || e(context) || (contentResolver = context.getContentResolver()) == null) {
            return null;
        }
        try {
            String string = Settings.Secure.getString(contentResolver, "android_id");
            try {
                if ("9774d56d682e549c".equals(string)) {
                    return null;
                }
                return string;
            } catch (Exception unused) {
                return string;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static Integer b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.heightPixels / displayMetrics.ydpi;
        float f2 = displayMetrics.widthPixels / displayMetrics.xdpi;
        return Math.sqrt((double) ((f * f) + (f2 * f2))) >= 6.5d ? Integer.valueOf(f13406b) : Integer.valueOf(f13405a);
    }

    public static String c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("cbPrefs", 0);
        if (sharedPreferences == null) {
            return UUID.randomUUID().toString();
        }
        String string = sharedPreferences.getString("cbUUID", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (editorEdit != null) {
            editorEdit.putString("cbUUID", string2).apply();
        }
        return string2;
    }

    public static String d(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return "phone";
        }
        int i2 = configuration.uiMode & 15;
        int i3 = configuration.screenLayout & 15;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "phone";
        }
        if (packageManager.hasSystemFeature("org.chromium.arc.device_management")) {
            return "chromebook";
        }
        String str = Build.BRAND;
        if (str != null && str.equals("chromium") && Build.MANUFACTURER.equals("chromium")) {
            return "chromebook";
        }
        String str2 = Build.DEVICE;
        if (str2 != null && str2.matches(".+_cheets")) {
            return "chromebook";
        }
        if (packageManager.hasSystemFeature("android.hardware.type.watch") || i2 == 6) {
            return "watch";
        }
        if (packageManager.hasSystemFeature("android.hardware.type.television") || i2 == 4) {
            return "tv";
        }
        String str3 = Build.MANUFACTURER;
        return ((str3 == null || !str3.equalsIgnoreCase("Amazon")) && i3 != 4) ? "phone" : "tablet";
    }

    public static boolean e(Context context) {
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("cb.limit.aid");
            return (obj instanceof Integer) && ((Integer) obj).intValue() == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String a(Context context, boolean z2) {
        String strA = a(context);
        return (z2 || strA == null) ? c(context) : strA;
    }
}

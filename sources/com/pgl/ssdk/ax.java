package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes5.dex */
public class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SharedPreferences f33443a;

    public static String a(Context context, String str) {
        return a(context, str, "");
    }

    public static void b(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putString(str, str2).apply();
        }
    }

    public static String a(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getString(str, str2) : str2;
    }

    public static void b(Context context, String str, int i2) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putInt(str, i2).apply();
        }
    }

    public static int a(Context context, String str, int i2) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getInt(str, i2) : i2;
    }

    public static void b(Context context, String str, long j) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putLong(str, j).apply();
        }
    }

    public static long a(Context context, String str, long j) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getLong(str, j) : j;
    }

    public static SharedPreferences a(Context context) {
        if (f33443a == null) {
            f33443a = context.getSharedPreferences("ss_config", 0);
        }
        return f33443a;
    }
}

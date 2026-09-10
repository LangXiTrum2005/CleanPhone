package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SharedPreferences f2456a;

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

    public static void b(Context context, String str, int i) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putInt(str, i).apply();
        }
    }

    public static int a(Context context, String str, int i) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getInt(str, i) : i;
    }

    public static SharedPreferences a(Context context) {
        if (f2456a == null) {
            f2456a = context.getSharedPreferences("ss_config", 0);
        }
        return f2456a;
    }
}

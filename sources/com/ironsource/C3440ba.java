package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.ironsource.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3440ba {
    private static final String a = "_preferences";

    private C3440ba() {
    }

    public static String a(Context context, String str) {
        if (context == null) {
            return str;
        }
        return context.getPackageName() + a;
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, str3);
        editorEdit.apply();
    }

    public static String a(Context context, String str, String str2, String str3) {
        return context == null ? str3 : context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static String a(Context context, String str, String str2) {
        return a(context, a(context, ""), str, str2);
    }

    public static boolean a(Context context, String str, String str2, boolean z) {
        return context == null ? z : context.getSharedPreferences(str, 0).getBoolean(str2, z);
    }

    public static int a(Context context, String str, String str2, int i) {
        return context == null ? i : context.getSharedPreferences(str, 0).getInt(str2, i);
    }

    public static int a(Context context, String str, int i) {
        return a(context, a(context, ""), str, i);
    }
}

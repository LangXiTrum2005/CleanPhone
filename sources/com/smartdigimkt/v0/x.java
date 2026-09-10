package com.smartdigimkt.v0;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f39052a = "sdm_share_date";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f39053b = "H+tU+FeXHM==";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f39054c = "cv";

    public static void a() {
        SharedPreferences.Editor editorEdit = com.smartdigimkt.u.a.f().d().getApplicationContext().getSharedPreferences(f39054c, 0).edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    public static Object b(Context context, String str, Object obj) {
        if (context != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : "";
            SharedPreferences sharedPreferences = context.getSharedPreferences(f39052a, 0);
            if ("String".equals(simpleName)) {
                return sharedPreferences.getString(str, (String) obj);
            }
            if ("Integer".equals(simpleName)) {
                return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
            }
            if ("Boolean".equals(simpleName)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            if ("Float".equals(simpleName)) {
                return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
            }
            if ("Long".equals(simpleName)) {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            }
        }
        return obj;
    }

    public static void c(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        SharedPreferences.Editor editorEdit = context.getApplicationContext().getSharedPreferences(f39054c, 0).edit();
        if ("String".equals(simpleName)) {
            editorEdit.putString(str, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            editorEdit.putInt(str, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            editorEdit.putFloat(str, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            editorEdit.putLong(str, ((Long) obj).longValue());
        }
        editorEdit.apply();
    }

    public static void d(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getApplicationContext().getSharedPreferences(f39052a, 0).edit();
        if ("String".equals(simpleName)) {
            editorEdit.putString(str, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            editorEdit.putInt(str, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            editorEdit.putFloat(str, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            editorEdit.putLong(str, ((Long) obj).longValue());
        }
        editorEdit.apply();
    }

    public static void a(String str) {
        SharedPreferences.Editor editorEdit = com.smartdigimkt.u.a.f().d().getApplicationContext().getSharedPreferences(f39054c, 0).edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public static Object a(Context context, String str, Object obj) {
        String simpleName;
        if (obj != null) {
            simpleName = obj.getClass().getSimpleName();
        } else {
            simpleName = "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(f39054c, 0);
        if ("String".equals(simpleName)) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if ("Integer".equals(simpleName)) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if ("Boolean".equals(simpleName)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if ("Float".equals(simpleName)) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        return "Long".equals(simpleName) ? Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue())) : obj;
    }

    public static void a(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getApplicationContext().getSharedPreferences(f39052a, 0).edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public static void a(Context context, String... strArr) {
        SharedPreferences.Editor editorEdit = context.getApplicationContext().getSharedPreferences(f39052a, 0).edit();
        for (String str : strArr) {
            editorEdit.remove(str);
        }
        editorEdit.apply();
    }
}

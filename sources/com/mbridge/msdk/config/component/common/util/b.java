package com.mbridge.msdk.config.component.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b f32030c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f32031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f32032b = new ConcurrentHashMap();

    private b(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        this.f32031a = context.getSharedPreferences(TextUtils.isEmpty(str) ? "mbridge_component_sp" : str, 0);
    }

    public static b a(Context context) {
        if (f32030c == null) {
            synchronized (b.class) {
                try {
                    if (f32030c == null) {
                        f32030c = new b(context, "mbridge_component_sp");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f32030c;
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f32031a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
        a(str, (Object) str2);
    }

    public void b(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f32031a.edit();
        editorEdit.putInt(str, i10);
        editorEdit.apply();
        a(str, Integer.valueOf(i10));
    }

    public String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        Object objA = a(str);
        if (objA instanceof String) {
            return (String) objA;
        }
        String string = this.f32031a.getString(str, str2);
        a(str, (Object) string);
        return string;
    }

    public int a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        Object objA = a(str);
        if (objA instanceof Integer) {
            return ((Integer) objA).intValue();
        }
        int i11 = this.f32031a.getInt(str, i10);
        a(str, Integer.valueOf(i11));
        return i11;
    }

    public long a(String str, long j10) {
        if (TextUtils.isEmpty(str)) {
            return j10;
        }
        Object objA = a(str);
        if (objA instanceof Long) {
            return ((Long) objA).longValue();
        }
        long j11 = this.f32031a.getLong(str, j10);
        a(str, Long.valueOf(j11));
        return j11;
    }

    public float a(String str, float f10) {
        if (TextUtils.isEmpty(str)) {
            return f10;
        }
        Object objA = a(str);
        if (objA instanceof Float) {
            return ((Float) objA).floatValue();
        }
        float f11 = this.f32031a.getFloat(str, f10);
        a(str, Float.valueOf(f11));
        return f11;
    }

    public boolean a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return z10;
        }
        Object objA = a(str);
        if (objA instanceof Boolean) {
            return ((Boolean) objA).booleanValue();
        }
        boolean z11 = this.f32031a.getBoolean(str, z10);
        a(str, Boolean.valueOf(z11));
        return z11;
    }

    private Object a(String str) {
        return this.f32032b.get(str);
    }

    private void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.f32032b.put(str, obj);
    }
}

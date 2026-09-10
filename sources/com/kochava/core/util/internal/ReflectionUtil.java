package com.kochava.core.util.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class ReflectionUtil {
    public static Object a(Class cls, String str) {
        try {
            return cls.getField(str).get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean b(String str) {
        try {
            return !Class.forName(str).getName().isEmpty();
        } catch (Throwable unused) {
            return false;
        }
    }
}

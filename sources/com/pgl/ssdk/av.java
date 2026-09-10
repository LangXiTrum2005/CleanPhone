package com.pgl.ssdk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public final class av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f33437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f33438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f33439c;

    static {
        try {
            f33437a = Class.class.getDeclaredMethod("forName", String.class);
            f33438b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f33439c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        } catch (NoSuchMethodException | NullPointerException unused) {
        }
    }

    public static Object a(Object obj, Class cls, String str, Object obj2) {
        try {
            Field fieldA = a(cls, str);
            if (fieldA != null) {
                fieldA.setAccessible(true);
                return fieldA.get(obj);
            }
        } catch (Throwable unused) {
        }
        return obj2;
    }

    public static Field a(Class cls, String str) {
        if (!a()) {
            return null;
        }
        try {
            Field field = (Field) f33439c.invoke(cls, str);
            try {
                field.setAccessible(true);
                return field;
            } catch (Throwable unused) {
                return field;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Method a(Class cls, String str, Class[] clsArr) {
        if (!a()) {
            return null;
        }
        try {
            Method method = (Method) f33438b.invoke(cls, str, clsArr);
            try {
                method.setAccessible(true);
                return method;
            } catch (Throwable unused) {
                return method;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Object a(Object obj, Class cls, String str, Class[] clsArr, Object... objArr) {
        try {
            Method methodA = a(cls, str, clsArr);
            if (methodA != null) {
                return methodA.invoke(obj, objArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean a() {
        return (f33437a == null || f33438b == null || f33439c == null) ? false : true;
    }
}

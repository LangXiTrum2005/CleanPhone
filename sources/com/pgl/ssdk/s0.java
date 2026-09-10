package com.pgl.ssdk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f2451a;
    private static Method b;
    private static Method c;

    static {
        try {
            f2451a = Class.class.getDeclaredMethod("forName", String.class);
            b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        } catch (NoSuchMethodException | NullPointerException unused) {
        }
    }

    public static Object a(Object obj, Class cls, String str, Object obj2) {
        try {
            Field fieldA = a(cls, str);
            if (fieldA == null) {
                return obj2;
            }
            fieldA.setAccessible(true);
            return fieldA.get(obj);
        } catch (Throwable unused) {
            return obj2;
        }
    }

    public static Field a(Class cls, String str) {
        if (!a()) {
            return null;
        }
        try {
            Field field = (Field) c.invoke(cls, str);
            try {
                field.setAccessible(true);
            } catch (Throwable unused) {
            }
            return field;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Method a(Class cls, String str, Class[] clsArr) {
        if (!a()) {
            return null;
        }
        try {
            Method method = (Method) b.invoke(cls, str, clsArr);
            try {
                method.setAccessible(true);
            } catch (Throwable unused) {
            }
            return method;
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
        } catch (Throwable unused) {
        }
        return null;
    }

    private static boolean a() {
        return (f2451a == null || b == null || c == null) ? false : true;
    }
}

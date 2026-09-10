package com.mbridge.msdk.thrid.okhttp.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f36592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class[] f36594c;

    public f(Class<?> cls, String str, Class... clsArr) {
        this.f36592a = cls;
        this.f36593b = str;
        this.f36594c = clsArr;
    }

    public boolean a(T t10) {
        return a(t10.getClass()) != null;
    }

    public Object b(T t10, Object... objArr) throws InvocationTargetException {
        Method methodA = a(t10.getClass());
        if (methodA == null) {
            return null;
        }
        try {
            return methodA.invoke(t10, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object c(T t10, Object... objArr) {
        try {
            return b(t10, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object d(T t10, Object... objArr) {
        try {
            return a(t10, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object a(T t10, Object... objArr) throws InvocationTargetException {
        Method methodA = a(t10.getClass());
        if (methodA == null) {
            throw new AssertionError("Method " + this.f36593b + " not supported for object " + t10);
        }
        try {
            return methodA.invoke(t10, objArr);
        } catch (IllegalAccessException e10) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodA);
            assertionError.initCause(e10);
            throw assertionError;
        }
    }

    private Method a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f36593b;
        if (str == null) {
            return null;
        }
        Method methodA = a(cls, str, this.f36594c);
        if (methodA == null || (cls2 = this.f36592a) == null || cls2.isAssignableFrom(methodA.getReturnType())) {
            return methodA;
        }
        return null;
    }

    private static Method a(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
                return method;
            } catch (NoSuchMethodException unused) {
                return method;
            }
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }
}

package com.google.common.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Throwables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f19729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f19730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f19731c;

    /* JADX INFO: renamed from: com.google.common.base.Throwables$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractList<StackTraceElement> {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            Method method = Throwables.f19730b;
            java.util.Objects.requireNonNull(method);
            Object obj = Throwables.f19729a;
            java.util.Objects.requireNonNull(obj);
            try {
                return (StackTraceElement) method.invoke(obj, null, Integer.valueOf(i2));
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                Throwables.a(cause);
                throw new RuntimeException(cause);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            Method method = Throwables.f19731c;
            java.util.Objects.requireNonNull(method);
            Object obj = Throwables.f19729a;
            java.util.Objects.requireNonNull(obj);
            try {
                return ((Integer) method.invoke(obj, null)).intValue();
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                Throwables.a(cause);
                throw new RuntimeException(cause);
            }
        }
    }

    static {
        Object objInvoke;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            objInvoke = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            objInvoke = null;
        }
        f19729a = objInvoke;
        if (objInvoke == null) {
            method = null;
        } else {
            try {
                method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            } catch (ThreadDeath e3) {
                throw e3;
            } catch (Throwable unused2) {
                method = null;
            }
        }
        f19730b = method;
        if (objInvoke != null) {
            try {
                try {
                    method2 = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
                } catch (ThreadDeath e4) {
                    throw e4;
                } catch (Throwable unused3) {
                    method2 = null;
                }
                if (method2 != null) {
                    method2.invoke(objInvoke, new Throwable());
                    method3 = method2;
                }
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused4) {
            }
        }
        f19731c = method3;
    }

    public static void a(Throwable th) {
        th.getClass();
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}

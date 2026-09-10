package com.google.common.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Throwables.java */
/* JADX INFO: loaded from: classes3.dex */
public final class polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    @CheckForNull
    public static final Object f21538attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    @CheckForNull
    public static final Method f21539dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    @CheckForNull
    public static final Method f21540saneness;

    static {
        Object objSaneness = saneness();
        f21538attabal = objSaneness;
        f21540saneness = objSaneness == null ? null : attabal();
        f21539dern = objSaneness != null ? wireman(objSaneness) : null;
    }

    @CheckForNull
    public static Method attabal() {
        return dern("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @Deprecated
    public static void beachfront(@CheckForNull Throwable th) {
        if (th != null) {
            taiyuan(th);
        }
    }

    public static <X extends Throwable> void competently(@CheckForNull Throwable th, Class<X> cls) throws Throwable {
        marial(th, cls);
        beachfront(th);
    }

    @CheckForNull
    public static Method dern(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public static <X extends Throwable> void impromptu(Throwable th, Class<X> cls) throws Throwable {
        formularize.triweekly(th);
        if (cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }

    @Deprecated
    public static <X extends Throwable> void marial(@CheckForNull Throwable th, Class<X> cls) throws Throwable {
        if (th != null) {
            impromptu(th, cls);
        }
    }

    @CheckForNull
    public static Object saneness() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void taiyuan(Throwable th) {
        formularize.triweekly(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @CheckForNull
    public static Method wireman(Object obj) {
        try {
            Method methodDern = dern("getStackTraceDepth", Throwable.class);
            if (methodDern == null) {
                return null;
            }
            methodDern.invoke(obj, new Throwable());
            return methodDern;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}

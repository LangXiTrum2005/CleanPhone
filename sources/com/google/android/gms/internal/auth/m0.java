package com.google.android.gms.internal.auth;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends c0 {
    private static final Map zzb = new ConcurrentHashMap();
    protected o1 zzc;
    private int zzd;

    public m0() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = o1.f22883e;
    }

    public static m0 a(Class cls) {
        Map map = zzb;
        m0 m0Var = (m0) map.get(cls);
        if (m0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                m0Var = (m0) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0Var2 = (m0) ((m0) x1.c(cls)).h(6);
        if (m0Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, m0Var2);
        return m0Var2;
    }

    public static Object c(Method method, m0 m0Var, Object... objArr) {
        try {
            return method.invoke(m0Var, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void e(a2 a2Var) {
        a2Var.d();
        zzb.put(a2.class, a2Var);
    }

    public final m0 b() {
        return (m0) h(4);
    }

    public final void d() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return i1.f22844c.a(getClass()).b(this, (m0) obj);
    }

    public final void f() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean g() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object h(int i10);

    public final int hashCode() {
        if (g()) {
            return i1.f22844c.a(getClass()).c(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iC = i1.f22844c.a(getClass()).c(this);
        this.zza = iC;
        return iC;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = c1.f22799a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        c1.c(this, sb2, 0);
        return sb2.toString();
    }
}

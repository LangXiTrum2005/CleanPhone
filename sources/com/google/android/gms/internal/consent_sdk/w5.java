package com.google.android.gms.internal.consent_sdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w5 extends i5 {
    private static final Map zzb = new ConcurrentHashMap();
    protected x6 zzc;
    private int zzd;

    public w5() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = x6.f23270e;
    }

    public static w5 h(Class cls) {
        Map map = zzb;
        w5 w5Var = (w5) map.get(cls);
        if (w5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                w5Var = (w5) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (w5Var != null) {
            return w5Var;
        }
        w5 w5Var2 = (w5) ((w5) d7.g(cls)).f(6);
        if (w5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, w5Var2);
        return w5Var2;
    }

    public static Object i(Method method, w5 w5Var, Object... objArr) {
        try {
            return method.invoke(w5Var, objArr);
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

    public static void l(Class cls, w5 w5Var) {
        w5Var.k();
        zzb.put(cls, w5Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.i5
    public final void a(o5 o5Var) {
        s6 s6VarA = p6.f23162c.a(getClass());
        g6 g6Var = o5Var.f23152b;
        if (g6Var == null) {
            g6Var = new g6(o5Var);
        }
        s6VarA.d(this, g6Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.i5
    public final int b(s6 s6Var) {
        if (e()) {
            int iF = s6Var.f(this);
            if (iF >= 0) {
                return iF;
            }
            throw new IllegalStateException(l1.d.e(iF, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iF2 = s6Var.f(this);
        if (iF2 < 0) {
            throw new IllegalStateException(l1.d.e(iF2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iF2;
        return iF2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.i5
    public final int c() {
        if (e()) {
            int iF = p6.f23162c.a(getClass()).f(this);
            if (iF >= 0) {
                return iF;
            }
            throw new IllegalStateException(l1.d.e(iF, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iF2 = p6.f23162c.a(getClass()).f(this);
        if (iF2 < 0) {
            throw new IllegalStateException(l1.d.e(iF2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iF2;
        return iF2;
    }

    public final void d() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean e() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return p6.f23162c.a(getClass()).c(this, (w5) obj);
    }

    public abstract Object f(int i10);

    public final v5 g() {
        return (v5) f(5);
    }

    public final int hashCode() {
        if (e()) {
            return p6.f23162c.a(getClass()).b(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iB = p6.f23162c.a(getClass()).b(this);
        this.zza = iB;
        return iB;
    }

    public final void j() {
        p6.f23162c.a(getClass()).a(this);
        k();
    }

    public final void k() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = l6.f23075a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        l6.c(this, sb2, 0);
        return sb2.toString();
    }
}

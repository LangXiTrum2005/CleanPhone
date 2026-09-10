package com.google.android.gms.internal.play_billing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 extends c1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected w2 zzc;
    private int zzd;

    public t1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = w2.f24493f;
    }

    public static final boolean c(t1 t1Var, boolean z10) {
        byte bByteValue = ((Byte) t1Var.d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zA = p2.f24443c.a(t1Var.getClass()).a(t1Var);
        if (z10) {
            t1Var.d(2);
        }
        return zA;
    }

    public static t1 h(Class cls) {
        Map map = zzb;
        t1 t1Var = (t1) map.get(cls);
        if (t1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t1Var = (t1) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t1Var != null) {
            return t1Var;
        }
        t1 t1Var2 = (t1) ((t1) b3.g(cls)).d(6);
        if (t1Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, t1Var2);
        return t1Var2;
    }

    public static Object i(Method method, t1 t1Var, Object... objArr) {
        try {
            return method.invoke(t1Var, objArr);
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

    public static void k(Class cls, t1 t1Var) {
        t1Var.j();
        zzb.put(cls, t1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.c1
    public final int b(s2 s2Var) {
        if (m()) {
            int iD = s2Var.d(this);
            if (iD >= 0) {
                return iD;
            }
            throw new IllegalStateException(l1.d.e(iD, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iD2 = s2Var.d(this);
        if (iD2 < 0) {
            throw new IllegalStateException(l1.d.e(iD2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iD2;
        return iD2;
    }

    public abstract Object d(int i10);

    public final int e() {
        if (m()) {
            int iD = p2.f24443c.a(getClass()).d(this);
            if (iD >= 0) {
                return iD;
            }
            throw new IllegalStateException(l1.d.e(iD, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iD2 = p2.f24443c.a(getClass()).d(this);
        if (iD2 < 0) {
            throw new IllegalStateException(l1.d.e(iD2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iD2;
        return iD2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return p2.f24443c.a(getClass()).h(this, (t1) obj);
    }

    public final s1 f() {
        return (s1) d(5);
    }

    public final s1 g() {
        s1 s1Var = (s1) d(5);
        if (!s1Var.f24468a.equals(this)) {
            if (!s1Var.f24469b.m()) {
                t1 t1Var = (t1) s1Var.f24468a.d(4);
                p2.f24443c.a(t1Var.getClass()).c(t1Var, s1Var.f24469b);
                s1Var.f24469b = t1Var;
            }
            t1 t1Var2 = s1Var.f24469b;
            p2.f24443c.a(t1Var2.getClass()).c(t1Var2, this);
        }
        return s1Var;
    }

    public final int hashCode() {
        if (m()) {
            return p2.f24443c.a(getClass()).e(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iE = p2.f24443c.a(getClass()).e(this);
        this.zza = iE;
        return iE;
    }

    public final void j() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void l() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean m() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = l2.f24405a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        l2.c(this, sb2, 0);
        return sb2.toString();
    }
}

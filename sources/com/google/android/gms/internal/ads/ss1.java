package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ss1 extends rr1 {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static final Map<Class<?>, ss1> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc;
    protected iu1 zzt;

    public ss1() {
        this.zzq = 0;
        this.zzc = -1;
        this.zzt = iu1.f15848f;
    }

    public static Object j(Method method, ss1 ss1Var, Object... objArr) {
        try {
            return method.invoke(ss1Var, objArr);
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

    public static jt1 k(zs1 zs1Var) {
        int size = zs1Var.size();
        return ((jt1) zs1Var).e(size + size);
    }

    public static ss1 l(ss1 ss1Var, fs1 fs1Var, ks1 ks1Var) throws et1 {
        ss1 ss1VarP = ss1Var.p();
        try {
            bu1 bu1VarA = vt1.f21267c.a(ss1VarP.getClass());
            androidx.datastore.preferences.protobuf.n nVar = (androidx.datastore.preferences.protobuf.n) fs1Var.f14525c;
            if (nVar == null) {
                nVar = new androidx.datastore.preferences.protobuf.n(fs1Var);
            }
            bu1VarA.d(ss1VarP, nVar, ks1Var);
            bu1VarA.a(ss1VarP);
            return ss1VarP;
        } catch (et1 e10) {
            if (e10.f14078a) {
                throw new et1(e10.getMessage(), e10);
            }
            throw e10;
        } catch (hu1 e11) {
            throw new et1(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof et1) {
                throw ((et1) e12.getCause());
            }
            throw new et1(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof et1) {
                throw ((et1) e13.getCause());
            }
            throw e13;
        }
    }

    public static ss1 m(ss1 ss1Var, cs1 cs1Var, ks1 ks1Var) {
        fs1 fs1VarZ = cs1Var.z();
        ss1 ss1VarL = l(ss1Var, fs1VarZ, ks1Var);
        fs1VarZ.B(0);
        y(ss1VarL);
        return ss1VarL;
    }

    public static ss1 n(ss1 ss1Var, byte[] bArr, ks1 ks1Var) throws et1 {
        ss1 ss1VarX = x(ss1Var, bArr, bArr.length, ks1Var);
        y(ss1VarX);
        return ss1VarX;
    }

    public static ss1 s(Class cls) {
        Map<Class<?>, ss1> map = zzd;
        ss1 ss1Var = map.get(cls);
        if (ss1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ss1Var = map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (ss1Var != null) {
            return ss1Var;
        }
        ss1 ss1Var2 = (ss1) ((ss1) nu1.f(cls)).v(6, null);
        if (ss1Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, ss1Var2);
        return ss1Var2;
    }

    public static void t(Class cls, ss1 ss1Var) {
        ss1Var.i();
        zzd.put(cls, ss1Var);
    }

    public static final boolean w(ss1 ss1Var, boolean z10) {
        byte bByteValue = ((Byte) ss1Var.v(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = vt1.f21267c.a(ss1Var.getClass()).c(ss1Var);
        if (z10) {
            ss1Var.v(2, true == zC ? ss1Var : null);
        }
        return zC;
    }

    public static ss1 x(ss1 ss1Var, byte[] bArr, int i10, ks1 ks1Var) throws et1 {
        if (i10 == 0) {
            return ss1Var;
        }
        ss1 ss1VarP = ss1Var.p();
        try {
            bu1 bu1VarA = vt1.f21267c.a(ss1VarP.getClass());
            bu1VarA.h(ss1VarP, bArr, 0, i10, new ur1(ks1Var));
            bu1VarA.a(ss1VarP);
            return ss1VarP;
        } catch (et1 e10) {
            if (e10.f14078a) {
                throw new et1(e10.getMessage(), e10);
            }
            throw e10;
        } catch (hu1 e11) {
            throw new et1(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof et1) {
                throw ((et1) e12.getCause());
            }
            throw new et1(e12.getMessage(), e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static void y(ss1 ss1Var) {
        if (ss1Var != null && !w(ss1Var, true)) {
            throw new et1(new hu1().getMessage());
        }
    }

    @Override // com.google.android.gms.internal.ads.rr1
    public final int d(bu1 bu1Var) {
        int iF;
        int iF2;
        if (h()) {
            if (bu1Var == null) {
                iF2 = vt1.f21267c.a(getClass()).f(this);
            } else {
                iF2 = bu1Var.f(this);
            }
            if (iF2 >= 0) {
                return iF2;
            }
            throw new IllegalStateException(l1.d.k(new StringBuilder(String.valueOf(iF2).length() + 42), "serialized size must be non-negative, was ", iF2));
        }
        int i10 = this.zzc;
        if ((i10 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10 & Integer.MAX_VALUE;
        }
        if (bu1Var == null) {
            iF = vt1.f21267c.a(getClass()).f(this);
        } else {
            iF = bu1Var.f(this);
        }
        g(iF);
        return iF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return vt1.f21267c.a(getClass()).e(this, (ss1) obj);
    }

    public final void g(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 42), "serialized size must be non-negative, was ", i10));
        }
        this.zzc = i10 | (this.zzc & Integer.MIN_VALUE);
    }

    public final boolean h() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return vt1.f21267c.a(getClass()).g(this);
        }
        if (this.zzq == 0) {
            this.zzq = vt1.f21267c.a(getClass()).g(this);
        }
        return this.zzq;
    }

    public final void i() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public final tt1 o() {
        return (tt1) v(7, null);
    }

    public final ss1 p() {
        return (ss1) v(4, null);
    }

    public final qs1 q() {
        return (qs1) v(5, null);
    }

    public final qs1 r() {
        qs1 qs1Var = (qs1) v(5, null);
        qs1Var.f(this);
        return qs1Var;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = pt1.f18815a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        pt1.b(this, sb2, 0);
        return sb2.toString();
    }

    public final void u(is1 is1Var) {
        bu1 bu1VarA = vt1.f21267c.a(getClass());
        z61 z61Var = is1Var.f15841a;
        if (z61Var == null) {
            z61Var = new z61(is1Var);
        }
        bu1VarA.i(this, z61Var);
    }

    public abstract Object v(int i10, ss1 ss1Var);
}

package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.ur1;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 extends l0 {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected u2 zzc;

    public i1() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = u2.f24013f;
    }

    public static i1 e(i1 i1Var, byte[] bArr, z0 z0Var) throws u1 {
        int length = bArr.length;
        if (length != 0) {
            i1 i1VarI = i1Var.i();
            try {
                o2 o2VarA = l2.f23690c.a(i1VarI.getClass());
                o2VarA.f(i1VarI, bArr, 0, length, new ur1(z0Var));
                o2VarA.a(i1VarI);
                i1Var = i1VarI;
            } catch (s2 e10) {
                throw e10.d();
            } catch (u1 e11) {
                if (e11.f24012a) {
                    throw new u1(e11.getMessage(), e11);
                }
                throw e11;
            } catch (IOException e12) {
                if (e12.getCause() instanceof u1) {
                    throw ((u1) e12.getCause());
                }
                throw new u1(e12.getMessage(), e12);
            } catch (IndexOutOfBoundsException unused) {
                throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        s(i1Var);
        return i1Var;
    }

    public static i1 o(Class cls) {
        Map map = zze;
        i1 i1Var = (i1) map.get(cls);
        if (i1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                i1Var = (i1) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (i1Var != null) {
            return i1Var;
        }
        i1 i1Var2 = (i1) ((i1) z2.d(cls)).t(6);
        if (i1Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, i1Var2);
        return i1Var2;
    }

    public static void p(Class cls, i1 i1Var) {
        i1Var.h();
        zze.put(cls, i1Var);
    }

    public static Object q(Method method, i1 i1Var, Object... objArr) {
        try {
            return method.invoke(i1Var, objArr);
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

    public static final boolean r(i1 i1Var, boolean z10) {
        byte bByteValue = ((Byte) i1Var.t(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = l2.f23690c.a(i1Var.getClass()).c(i1Var);
        if (z10) {
            i1Var.t(2);
        }
        return zC;
    }

    public static void s(i1 i1Var) throws u1 {
        if (i1Var != null && !r(i1Var, true)) {
            throw new s2().d();
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final int c(o2 o2Var) {
        if (g()) {
            int iH = o2Var.h(this);
            if (iH >= 0) {
                return iH;
            }
            StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.e(iH, 42));
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iH);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iH2 = o2Var.h(this);
        if (iH2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iH2;
            return iH2;
        }
        StringBuilder sb3 = new StringBuilder(com.applovin.impl.ca.e(iH2, 42));
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iH2);
        throw new IllegalStateException(sb3.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return l2.f23690c.a(getClass()).i(this, (i1) obj);
    }

    public final void f(x0 x0Var) {
        o2 o2VarA = l2.f23690c.a(getClass());
        q6 q6Var = x0Var.f24138c;
        if (q6Var == null) {
            q6Var = new q6(x0Var);
        }
        o2VarA.d(this, q6Var);
    }

    public final boolean g() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            return l2.f23690c.a(getClass()).g(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iG = l2.f23690c.a(getClass()).g(this);
        this.zza = iG;
        return iG;
    }

    public final i1 i() {
        return (i1) t(4);
    }

    public final void j() {
        l2.f23690c.a(getClass()).a(this);
        h();
    }

    public final g1 k() {
        return (g1) t(5);
    }

    public final g1 l() {
        g1 g1Var = (g1) t(5);
        g1Var.g(this);
        return g1Var;
    }

    public final void m() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int n() {
        if (g()) {
            int iH = l2.f23690c.a(getClass()).h(this);
            if (iH >= 0) {
                return iH;
            }
            StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.e(iH, 42));
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iH);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iH2 = l2.f23690c.a(getClass()).h(this);
        if (iH2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iH2;
            return iH2;
        }
        StringBuilder sb3 = new StringBuilder(com.applovin.impl.ca.e(iH2, 42));
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iH2);
        throw new IllegalStateException(sb3.toString());
    }

    public abstract Object t(int i10);

    public final String toString() {
        String string = super.toString();
        char[] cArr = e2.f23406a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        e2.b(this, sb2, 0);
        return sb2.toString();
    }
}

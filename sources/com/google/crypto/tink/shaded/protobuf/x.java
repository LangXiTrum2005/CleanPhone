package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.ads.ur1;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, x> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected c1 unknownFields;

    public x() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c1.f24543f;
    }

    public static void g(x xVar) throws d0 {
        if (xVar != null && !n(xVar, true)) {
            throw new d0(new b1().getMessage());
        }
    }

    public static x j(Class cls) {
        x xVar = defaultInstanceMap.get(cls);
        if (xVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (xVar != null) {
            return xVar;
        }
        x defaultInstanceForType = ((x) i1.b(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    public static Object m(Method method, x xVar, Object... objArr) {
        try {
            return method.invoke(xVar, objArr);
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

    public static final boolean n(x xVar, boolean z10) {
        byte bByteValue = ((Byte) xVar.i(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        w0 w0Var = w0.f24646c;
        w0Var.getClass();
        boolean zC = w0Var.a(xVar.getClass()).c(xVar);
        if (z10) {
            xVar.i(2);
        }
        return zC;
    }

    public static x s(x xVar, i iVar, p pVar) throws d0 {
        h hVar = (h) iVar;
        j jVarF = androidx.datastore.preferences.protobuf.m.f(hVar.f24565d, hVar.r(), hVar.size(), true);
        x xVarU = u(xVar, jVarF, pVar);
        jVarF.a(0);
        g(xVarU);
        return xVarU;
    }

    public static x t(x xVar, byte[] bArr, p pVar) throws d0 {
        int length = bArr.length;
        if (length != 0) {
            x xVarR = xVar.r();
            try {
                w0 w0Var = w0.f24646c;
                w0Var.getClass();
                z0 z0VarA = w0Var.a(xVarR.getClass());
                ur1 ur1Var = new ur1();
                pVar.getClass();
                z0VarA.i(xVarR, bArr, 0, length, ur1Var);
                z0VarA.b(xVarR);
                xVar = xVarR;
            } catch (b1 e10) {
                throw new d0(e10.getMessage());
            } catch (d0 e11) {
                if (e11.f24549a) {
                    throw new d0(e11.getMessage(), e11);
                }
                throw e11;
            } catch (IOException e12) {
                if (e12.getCause() instanceof d0) {
                    throw ((d0) e12.getCause());
                }
                throw new d0(e12.getMessage(), e12);
            } catch (IndexOutOfBoundsException unused) {
                throw d0.l();
            }
        }
        g(xVar);
        return xVar;
    }

    public static x u(x xVar, androidx.datastore.preferences.protobuf.m mVar, p pVar) throws d0 {
        x xVarR = xVar.r();
        try {
            w0 w0Var = w0.f24646c;
            w0Var.getClass();
            z0 z0VarA = w0Var.a(xVarR.getClass());
            androidx.datastore.preferences.protobuf.n nVar = (androidx.datastore.preferences.protobuf.n) mVar.f4131b;
            if (nVar == null) {
                nVar = new androidx.datastore.preferences.protobuf.n(mVar, (byte) 0);
            }
            z0VarA.j(xVarR, nVar, pVar);
            z0VarA.b(xVarR);
            return xVarR;
        } catch (b1 e10) {
            throw new d0(e10.getMessage());
        } catch (d0 e11) {
            if (e11.f24549a) {
                throw new d0(e11.getMessage(), e11);
            }
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof d0) {
                throw ((d0) e12.getCause());
            }
            throw new d0(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof d0) {
                throw ((d0) e13.getCause());
            }
            throw e13;
        }
    }

    public static void v(Class cls, x xVar) {
        xVar.p();
        defaultInstanceMap.put(cls, xVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final int a(z0 z0Var) {
        int iE;
        int iE2;
        if (o()) {
            if (z0Var == null) {
                w0 w0Var = w0.f24646c;
                w0Var.getClass();
                iE2 = w0Var.a(getClass()).e(this);
            } else {
                iE2 = z0Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            throw new IllegalStateException(l1.d.e(iE2, "serialized size must be non-negative, was "));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10 & Integer.MAX_VALUE;
        }
        if (z0Var == null) {
            w0 w0Var2 = w0.f24646c;
            w0Var2.getClass();
            iE = w0Var2.a(getClass()).e(this);
        } else {
            iE = z0Var.e(this);
        }
        w(iE);
        return iE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w0 w0Var = w0.f24646c;
        w0Var.getClass();
        return w0Var.a(getClass()).g(this, (x) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final void f(l lVar) {
        w0 w0Var = w0.f24646c;
        w0Var.getClass();
        z0 z0VarA = w0Var.a(getClass());
        k0 k0Var = lVar.f24601a;
        if (k0Var == null) {
            k0Var = new k0(lVar);
        }
        z0VarA.f(this, k0Var);
    }

    public final v h() {
        return (v) i(5);
    }

    public final int hashCode() {
        if (o()) {
            w0 w0Var = w0.f24646c;
            w0Var.getClass();
            return w0Var.a(getClass()).h(this);
        }
        if (this.memoizedHashCode == 0) {
            w0 w0Var2 = w0.f24646c;
            w0Var2.getClass();
            this.memoizedHashCode = w0Var2.a(getClass()).h(this);
        }
        return this.memoizedHashCode;
    }

    public abstract Object i(int i10);

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final x getDefaultInstanceForType() {
        return (x) i(6);
    }

    public final v0 l() {
        return (v0) i(7);
    }

    public final boolean o() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void p() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final v c() {
        return (v) i(5);
    }

    public final x r() {
        return (x) i(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = q0.f24614a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        q0.c(this, sb2, 0);
        return sb2.toString();
    }

    public final void w(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(l1.d.e(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final v x() {
        v vVar = (v) i(5);
        vVar.f(this);
        return vVar;
    }
}

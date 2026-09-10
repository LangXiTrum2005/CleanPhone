package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, b0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected k1 unknownFields;

    public b0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = k1.f4116f;
    }

    public static b0 d(Class cls) {
        b0 b0Var = defaultInstanceMap.get(cls);
        if (b0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                b0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = (b0) ((b0) q1.d(cls)).c(6);
        if (b0Var2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, b0Var2);
        return b0Var2;
    }

    public static Object e(Method method, b0 b0Var, Object... objArr) {
        try {
            return method.invoke(b0Var, objArr);
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

    public static final boolean f(b0 b0Var, boolean z10) {
        byte bByteValue = ((Byte) b0Var.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        a1 a1Var = a1.f4050c;
        a1Var.getClass();
        boolean zC = a1Var.a(b0Var.getClass()).c(b0Var);
        if (z10) {
            b0Var.c(2);
        }
        return zC;
    }

    public static void j(Class cls, b0 b0Var) {
        b0Var.h();
        defaultInstanceMap.put(cls, b0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a(d1 d1Var) {
        int iG;
        int iG2;
        if (g()) {
            if (d1Var == null) {
                a1 a1Var = a1.f4050c;
                a1Var.getClass();
                iG2 = a1Var.a(getClass()).g(this);
            } else {
                iG2 = d1Var.g(this);
            }
            if (iG2 >= 0) {
                return iG2;
            }
            throw new IllegalStateException(l1.d.e(iG2, "serialized size must be non-negative, was "));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10 & Integer.MAX_VALUE;
        }
        if (d1Var == null) {
            a1 a1Var2 = a1.f4050c;
            a1Var2.getClass();
            iG = a1Var2.a(getClass()).g(this);
        } else {
            iG = d1Var.g(this);
        }
        k(iG);
        return iG;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void b(p pVar) {
        a1 a1Var = a1.f4050c;
        a1Var.getClass();
        d1 d1VarA = a1Var.a(getClass());
        n0 n0Var = pVar.f4146b;
        if (n0Var == null) {
            n0Var = new n0(pVar);
        }
        d1VarA.e(this, n0Var);
    }

    public abstract Object c(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a1 a1Var = a1.f4050c;
        a1Var.getClass();
        return a1Var.a(getClass()).i(this, (b0) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            a1 a1Var = a1.f4050c;
            a1Var.getClass();
            return a1Var.a(getClass()).h(this);
        }
        if (this.memoizedHashCode == 0) {
            a1 a1Var2 = a1.f4050c;
            a1Var2.getClass();
            this.memoizedHashCode = a1Var2.a(getClass()).h(this);
        }
        return this.memoizedHashCode;
    }

    public final b0 i() {
        return (b0) c(4);
    }

    public final void k(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(l1.d.e(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = u0.f4171a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        u0.c(this, sb2, 0);
        return sb2.toString();
    }
}

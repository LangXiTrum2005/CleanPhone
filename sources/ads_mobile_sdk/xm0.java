package ads_mobile_sdk;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import saneness.attraction;
import saneness.vavasour;

/* JADX INFO: loaded from: classes.dex */
public abstract class xm0 extends g {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    private static final Map<Class<?>, xm0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    public z43 b = z43.f;

    public static xm0 a(xm0 xm0Var) throws x81 {
        if (xm0Var == null || a(xm0Var, true)) {
            return xm0Var;
        }
        throw new x81(new x43().getMessage());
    }

    public static j21 f() {
        return j21.e;
    }

    public static qc1 g() {
        return qc1.e;
    }

    public static z72 h() {
        return z72.e;
    }

    public abstract Object a(int i, xm0 xm0Var);

    public final Object b() {
        return a(3, (xm0) null);
    }

    public final void c() {
        this.a = 0;
    }

    public final void d() {
        a(Integer.MAX_VALUE);
    }

    public final vm0 e() {
        return (vm0) a(5, (xm0) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y72 y72Var = y72.c;
        y72Var.getClass();
        return y72Var.a(getClass()).b(this, (xm0) obj);
    }

    public final int hashCode() {
        if (j()) {
            y72 y72Var = y72.c;
            y72Var.getClass();
            return y72Var.a(getClass()).d(this);
        }
        if (this.a == 0) {
            y72 y72Var2 = y72.c;
            y72Var2.getClass();
            this.a = y72Var2.a(getClass()).d(this);
        }
        return this.a;
    }

    public final xm0 i() {
        return (xm0) a(6, (xm0) null);
    }

    public final boolean j() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void k() {
        y72 y72Var = y72.c;
        y72Var.getClass();
        y72Var.a(getClass()).c(this);
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final void l() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final xm0 m() {
        return (xm0) a(4, (xm0) null);
    }

    public final vm0 n() {
        vm0 vm0Var = (vm0) a(5, (xm0) null);
        if (vm0Var.a.equals(this)) {
            return vm0Var;
        }
        vm0Var.b();
        vm0.a(vm0Var.b, this);
        return vm0Var;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = if1.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        if1.a(this, sb, 0);
        return sb.toString();
    }

    @Override // ads_mobile_sdk.g
    public final int a(attraction attractionVar) {
        int iB;
        int iB2;
        if (!j()) {
            int i = this.memoizedSerializedSize & Integer.MAX_VALUE;
            if (i != Integer.MAX_VALUE) {
                return i;
            }
            if (attractionVar == null) {
                y72 y72Var = y72.c;
                y72Var.getClass();
                iB = y72Var.a(getClass()).b(this);
            } else {
                iB = attractionVar.b(this);
            }
            a(iB);
            return iB;
        }
        if (attractionVar == null) {
            y72 y72Var2 = y72.c;
            y72Var2.getClass();
            iB2 = y72Var2.a(getClass()).b(this);
        } else {
            iB2 = attractionVar.b(this);
        }
        if (iB2 >= 0) {
            return iB2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iB2);
    }

    public static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean a(xm0 xm0Var, boolean z) {
        byte bByteValue = ((Byte) xm0Var.a(1, (xm0) null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        y72 y72Var = y72.c;
        y72Var.getClass();
        boolean zA = y72Var.a(xm0Var.getClass()).a(xm0Var);
        if (z) {
            xm0Var.a(2, zA ? xm0Var : null);
        }
        return zA;
    }

    public static xm0 a(xm0 xm0Var, hr hrVar, vf0 vf0Var) {
        xm0 xm0Var2 = (xm0) xm0Var.a(4, (xm0) null);
        try {
            y72 y72Var = y72.c;
            y72Var.getClass();
            attraction attractionVarA = y72Var.a(xm0Var2.getClass());
            ir irVar = hrVar.c;
            if (irVar == null) {
                irVar = new ir(hrVar);
            }
            attractionVarA.a(xm0Var2, irVar, vf0Var);
            attractionVarA.c(xm0Var2);
            return xm0Var2;
        } catch (x43 e) {
            throw new x81(e.getMessage());
        } catch (x81 e2) {
            if (e2.a) {
                throw new x81(e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof x81) {
                throw ((x81) e3.getCause());
            }
            throw new x81(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof x81) {
                throw ((x81) e4.getCause());
            }
            throw e4;
        }
    }

    public static xm0 a(xm0 xm0Var, byte[] bArr, int i, vf0 vf0Var) throws x81 {
        if (i == 0) {
            return xm0Var;
        }
        xm0 xm0Var2 = (xm0) xm0Var.a(4, (xm0) null);
        try {
            y72 y72Var = y72.c;
            y72Var.getClass();
            attraction attractionVarA = y72Var.a(xm0Var2.getClass());
            attractionVarA.a(xm0Var2, bArr, 0, i, new fh(vf0Var));
            attractionVarA.c(xm0Var2);
            return xm0Var2;
        } catch (x43 e) {
            throw new x81(e.getMessage());
        } catch (x81 e2) {
            if (e2.a) {
                throw new x81(e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof x81) {
                throw ((x81) e3.getCause());
            }
            throw new x81(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static void a(Class cls, xm0 xm0Var) {
        xm0Var.memoizedSerializedSize &= Integer.MAX_VALUE;
        defaultInstanceMap.put(cls, xm0Var);
    }

    public final void a(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
    }

    public final void a(mr mrVar) {
        y72 y72Var = y72.c;
        y72Var.getClass();
        attraction attractionVarA = y72Var.a(getClass());
        nr nrVar = mrVar.a;
        if (nrVar == null) {
            nrVar = new nr(mrVar);
        }
        attractionVarA.a((Object) this, (vavasour) nrVar);
    }

    public static xm0 a(Class cls) {
        Map<Class<?>, xm0> map = defaultInstanceMap;
        xm0 xm0Var = map.get(cls);
        if (xm0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xm0Var = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (xm0Var != null) {
            return xm0Var;
        }
        xm0 xm0VarI = ((xm0) n53.a(cls)).i();
        if (xm0VarI != null) {
            map.put(cls, xm0VarI);
            return xm0VarI;
        }
        throw new IllegalStateException();
    }
}

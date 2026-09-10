package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f4069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l1 f4070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l1 f4071c;

    static {
        Class<?> cls;
        Class<?> cls2;
        a1 a1Var = a1.f4050c;
        l1 l1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f4069a = cls;
        try {
            a1 a1Var2 = a1.f4050c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                l1Var = (l1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f4070b = l1Var;
        f4071c = new l1();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iV = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iV += p.V(((Integer) list.get(i10)).intValue());
        }
        return iV;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p.T(i10) + 4) * size;
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p.T(i10) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iV = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iV += p.V(((Integer) list.get(i10)).intValue());
        }
        return iV;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof l0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iV = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iV += p.V(((Long) list.get(i10)).longValue());
        }
        return iV;
    }

    public static int f(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof c0)) {
                int iU = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    iU += p.U((iIntValue >> 31) ^ (iIntValue << 1));
                }
                return iU;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof l0)) {
                int iV = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    iV += p.V((jLongValue >> 63) ^ (jLongValue << 1));
                }
                return iV;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iU = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iU += p.U(((Integer) list.get(i10)).intValue());
        }
        return iU;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof l0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iV = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iV += p.V(((Long) list.get(i10)).longValue());
        }
        return iV;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k(l1 l1Var, Object obj, Object obj2) {
        l1Var.getClass();
        b0 b0Var = (b0) obj;
        k1 k1Var = b0Var.unknownFields;
        k1 k1Var2 = ((b0) obj2).unknownFields;
        k1 k1Var3 = k1.f4116f;
        if (!k1Var3.equals(k1Var2)) {
            if (k1Var3.equals(k1Var)) {
                int i10 = k1Var.f4117a + k1Var2.f4117a;
                int[] iArrCopyOf = Arrays.copyOf(k1Var.f4118b, i10);
                System.arraycopy(k1Var2.f4118b, 0, iArrCopyOf, k1Var.f4117a, k1Var2.f4117a);
                Object[] objArrCopyOf = Arrays.copyOf(k1Var.f4119c, i10);
                System.arraycopy(k1Var2.f4119c, 0, objArrCopyOf, k1Var.f4117a, k1Var2.f4117a);
                k1Var = new k1(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                k1Var.getClass();
                if (!k1Var2.equals(k1Var3)) {
                    if (!k1Var.f4121e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = k1Var.f4117a + k1Var2.f4117a;
                    k1Var.a(i11);
                    System.arraycopy(k1Var2.f4118b, 0, k1Var.f4118b, k1Var.f4117a, k1Var2.f4117a);
                    System.arraycopy(k1Var2.f4119c, 0, k1Var.f4119c, k1Var.f4117a, k1Var2.f4117a);
                    k1Var.f4117a = i11;
                }
            }
        }
        b0Var.unknownFields = k1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i10, List list, n0 n0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f4139a;
        if (list instanceof d) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                pVar.a0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        pVar.m0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = p.f4144g;
            i12++;
        }
        pVar.o0(i12);
        while (i11 < list.size()) {
            pVar.Y(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void n(int i10, List list, n0 n0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f4139a;
        if (list instanceof q) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                pVar.getClass();
                pVar.f0(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        pVar.m0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = p.f4144g;
            i12 += 8;
        }
        pVar.o0(i12);
        while (i11 < list.size()) {
            pVar.g0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void o(int i10, List list, n0 n0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f4139a;
        if (list instanceof c0) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                pVar.h0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        pVar.m0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += p.V(((Integer) list.get(i12)).intValue());
        }
        pVar.o0(iV);
        while (i11 < list.size()) {
            pVar.i0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void p(int i10, List list, n0 n0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f4139a;
        if (list instanceof c0) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                pVar.d0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        pVar.m0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = p.f4144g;
            i12 += 4;
        }
        pVar.o0(i12);
        while (i11 < list.size()) {
            pVar.e0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void q(int i10, List list, n0 n0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f4139a;
        if (list instanceof l0) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                pVar.f0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        pVar.m0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = p.f4144g;
            i12 += 8;
        }
        pVar.o0(i12);
        while (i11 < list.size()) {
            pVar.g0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void r(int i10, List list, n0 n0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f4139a;
        if (list instanceof x) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                pVar.getClass();
                pVar.d0(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        pVar.m0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = p.f4144g;
            i12 += 4;
        }
        pVar.o0(i12);
        while (i11 < list.size()) {
            pVar.e0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void s(int i10, List list, n0 n0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f4139a;
        if (list instanceof c0) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                pVar.h0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        pVar.m0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += p.V(((Integer) list.get(i12)).intValue());
        }
        pVar.o0(iV);
        while (i11 < list.size()) {
            pVar.i0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void t(int i10, List list, n0 n0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f4139a;
        if (list instanceof l0) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                pVar.p0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        pVar.m0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += p.V(((Long) list.get(i12)).longValue());
        }
        pVar.o0(iV);
        while (i11 < list.size()) {
            pVar.q0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void u(int i10, List list, n0 n0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f4139a;
        if (list instanceof c0) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                pVar.d0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        pVar.m0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = p.f4144g;
            i12 += 4;
        }
        pVar.o0(i12);
        while (i11 < list.size()) {
            pVar.e0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void v(int i10, List list, n0 n0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f4139a;
        if (list instanceof l0) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                pVar.f0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        pVar.m0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = p.f4144g;
            i12 += 8;
        }
        pVar.o0(i12);
        while (i11 < list.size()) {
            pVar.g0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void w(int i10, List list, n0 n0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f4139a;
        if (list instanceof c0) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                pVar.n0(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                i11++;
            }
            return;
        }
        pVar.m0(i10, 2);
        int iU = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iU += p.U((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        pVar.o0(iU);
        while (i11 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            pVar.o0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i11++;
        }
    }

    public static void x(int i10, List list, n0 n0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f4139a;
        if (list instanceof l0) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                pVar.p0(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                i11++;
            }
            return;
        }
        pVar.m0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iV += p.V((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        pVar.o0(iV);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            pVar.q0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i11++;
        }
    }

    public static void y(int i10, List list, n0 n0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f4139a;
        if (list instanceof c0) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                pVar.n0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        pVar.m0(i10, 2);
        int iU = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iU += p.U(((Integer) list.get(i12)).intValue());
        }
        pVar.o0(iU);
        while (i11 < list.size()) {
            pVar.o0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void z(int i10, List list, n0 n0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f4139a;
        if (list instanceof l0) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                pVar.p0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        pVar.m0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += p.V(((Long) list.get(i12)).longValue());
        }
        pVar.o0(iV);
        while (i11 < list.size()) {
            pVar.q0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static Object j(Object obj, int i10, d0 d0Var, Object obj2, l1 l1Var) {
        return obj2;
    }
}

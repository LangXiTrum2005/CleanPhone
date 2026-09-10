package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1 f23833a;

    static {
        int i10 = n0.f23760a;
        f23833a = new f1(1);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
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
    public static void b(Object obj, Object obj2) {
        i1 i1Var = (i1) obj;
        u2 u2Var = i1Var.zzc;
        u2 u2Var2 = ((i1) obj2).zzc;
        u2 u2Var3 = u2.f24013f;
        if (!u2Var3.equals(u2Var2)) {
            if (u2Var3.equals(u2Var)) {
                int i10 = u2Var.f24014a + u2Var2.f24014a;
                int[] iArrCopyOf = Arrays.copyOf(u2Var.f24015b, i10);
                System.arraycopy(u2Var2.f24015b, 0, iArrCopyOf, u2Var.f24014a, u2Var2.f24014a);
                Object[] objArrCopyOf = Arrays.copyOf(u2Var.f24016c, i10);
                System.arraycopy(u2Var2.f24016c, 0, objArrCopyOf, u2Var.f24014a, u2Var2.f24014a);
                u2Var = new u2(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                u2Var.getClass();
                if (!u2Var2.equals(u2Var3)) {
                    if (!u2Var.f24018e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = u2Var.f24014a + u2Var2.f24014a;
                    u2Var.e(i11);
                    System.arraycopy(u2Var2.f24015b, 0, u2Var.f24015b, u2Var.f24014a, u2Var2.f24014a);
                    System.arraycopy(u2Var2.f24016c, 0, u2Var.f24016c, u2Var.f24014a, u2Var2.f24014a);
                    u2Var.f24014a = i11;
                }
            }
        }
        i1Var.zzc = u2Var;
    }

    public static Object c(Object obj, int i10, s1 s1Var, l1 l1Var, Object obj2, f1 f1Var) {
        if (l1Var == null) {
            return obj2;
        }
        if (s1Var == null) {
            Iterator it = s1Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!l1Var.a(iIntValue)) {
                    if (obj2 == null) {
                        f1Var.getClass();
                        obj2 = f1.f(obj);
                    }
                    f1Var.getClass();
                    ((u2) obj2).d(i10 << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = s1Var.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) s1Var.get(i12);
            int iIntValue2 = num.intValue();
            if (l1Var.a(iIntValue2)) {
                if (i12 != i11) {
                    s1Var.set(i11, num);
                }
                i11++;
            } else {
                if (obj2 == null) {
                    f1Var.getClass();
                    obj2 = f1.f(obj);
                }
                f1Var.getClass();
                ((u2) obj2).d(i10 << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i11 != size) {
            s1Var.subList(i11, size).clear();
        }
        return obj2;
    }

    public static void d(int i10, List list, q6 q6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x0 x0Var = (x0) q6Var.f23891b;
        if (list instanceof y0) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                x0Var.w(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        x0Var.r(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        x0Var.F(i12);
        while (i11 < list.size()) {
            x0Var.I(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void e(int i10, List list, q6 q6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x0 x0Var = (x0) q6Var.f23891b;
        if (list instanceof d1) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                x0Var.u(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        x0Var.r(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        x0Var.F(i12);
        while (i11 < list.size()) {
            x0Var.G(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void f(int i10, List list, q6 q6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x0 x0Var = (x0) q6Var.f23891b;
        int i11 = 0;
        if (!(list instanceof y1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    x0Var.v(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            x0Var.r(i10, 2);
            int iQ = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iQ += x0.q(((Long) list.get(i12)).longValue());
            }
            x0Var.F(iQ);
            while (i11 < list.size()) {
                x0Var.H(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        y1 y1Var = (y1) list;
        if (!z10) {
            while (i11 < y1Var.f24165c) {
                x0Var.v(i10, y1Var.h(i11));
                i11++;
            }
            return;
        }
        x0Var.r(i10, 2);
        int iQ2 = 0;
        for (int i13 = 0; i13 < y1Var.f24165c; i13++) {
            iQ2 += x0.q(y1Var.h(i13));
        }
        x0Var.F(iQ2);
        while (i11 < y1Var.f24165c) {
            x0Var.H(y1Var.h(i11));
            i11++;
        }
    }

    public static void g(int i10, List list, q6 q6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x0 x0Var = (x0) q6Var.f23891b;
        int i11 = 0;
        if (!(list instanceof y1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    x0Var.v(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            x0Var.r(i10, 2);
            int iQ = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iQ += x0.q(((Long) list.get(i12)).longValue());
            }
            x0Var.F(iQ);
            while (i11 < list.size()) {
                x0Var.H(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        y1 y1Var = (y1) list;
        if (!z10) {
            while (i11 < y1Var.f24165c) {
                x0Var.v(i10, y1Var.h(i11));
                i11++;
            }
            return;
        }
        x0Var.r(i10, 2);
        int iQ2 = 0;
        for (int i13 = 0; i13 < y1Var.f24165c; i13++) {
            iQ2 += x0.q(y1Var.h(i13));
        }
        x0Var.F(iQ2);
        while (i11 < y1Var.f24165c) {
            x0Var.H(y1Var.h(i11));
            i11++;
        }
    }

    public static void h(int i10, List list, q6 q6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x0 x0Var = (x0) q6Var.f23891b;
        int i11 = 0;
        if (!(list instanceof y1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    x0Var.v(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            x0Var.r(i10, 2);
            int iQ = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iQ += x0.q((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            x0Var.F(iQ);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                x0Var.H((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        y1 y1Var = (y1) list;
        if (!z10) {
            while (i11 < y1Var.f24165c) {
                long jH = y1Var.h(i11);
                x0Var.v(i10, (jH >> 63) ^ (jH + jH));
                i11++;
            }
            return;
        }
        x0Var.r(i10, 2);
        int iQ2 = 0;
        for (int i13 = 0; i13 < y1Var.f24165c; i13++) {
            long jH2 = y1Var.h(i13);
            iQ2 += x0.q((jH2 >> 63) ^ (jH2 + jH2));
        }
        x0Var.F(iQ2);
        while (i11 < y1Var.f24165c) {
            long jH3 = y1Var.h(i11);
            x0Var.H((jH3 >> 63) ^ (jH3 + jH3));
            i11++;
        }
    }

    public static void i(int i10, List list, q6 q6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x0 x0Var = (x0) q6Var.f23891b;
        int i11 = 0;
        if (!(list instanceof y1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    x0Var.w(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            x0Var.r(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            x0Var.F(i12);
            while (i11 < list.size()) {
                x0Var.I(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        y1 y1Var = (y1) list;
        if (!z10) {
            while (i11 < y1Var.f24165c) {
                x0Var.w(i10, y1Var.h(i11));
                i11++;
            }
            return;
        }
        x0Var.r(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < y1Var.f24165c; i15++) {
            y1Var.h(i15);
            i14 += 8;
        }
        x0Var.F(i14);
        while (i11 < y1Var.f24165c) {
            x0Var.I(y1Var.h(i11));
            i11++;
        }
    }

    public static void j(int i10, List list, q6 q6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x0 x0Var = (x0) q6Var.f23891b;
        int i11 = 0;
        if (!(list instanceof y1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    x0Var.w(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            x0Var.r(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            x0Var.F(i12);
            while (i11 < list.size()) {
                x0Var.I(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        y1 y1Var = (y1) list;
        if (!z10) {
            while (i11 < y1Var.f24165c) {
                x0Var.w(i10, y1Var.h(i11));
                i11++;
            }
            return;
        }
        x0Var.r(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < y1Var.f24165c; i15++) {
            y1Var.h(i15);
            i14 += 8;
        }
        x0Var.F(i14);
        while (i11 < y1Var.f24165c) {
            x0Var.I(y1Var.h(i11));
            i11++;
        }
    }

    public static void k(int i10, List list, q6 q6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x0 x0Var = (x0) q6Var.f23891b;
        int i11 = 0;
        if (!(list instanceof j1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    x0Var.s(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            x0Var.r(i10, 2);
            int iQ = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iQ += x0.q(((Integer) list.get(i12)).intValue());
            }
            x0Var.F(iQ);
            while (i11 < list.size()) {
                x0Var.E(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z10) {
            while (i11 < j1Var.f23612c) {
                x0Var.s(i10, j1Var.m(i11));
                i11++;
            }
            return;
        }
        x0Var.r(i10, 2);
        int iQ2 = 0;
        for (int i13 = 0; i13 < j1Var.f23612c; i13++) {
            iQ2 += x0.q(j1Var.m(i13));
        }
        x0Var.F(iQ2);
        while (i11 < j1Var.f23612c) {
            x0Var.E(j1Var.m(i11));
            i11++;
        }
    }

    public static void l(int i10, List list, q6 q6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x0 x0Var = (x0) q6Var.f23891b;
        int i11 = 0;
        if (!(list instanceof j1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    x0Var.t(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            x0Var.r(i10, 2);
            int iP = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iP += x0.p(((Integer) list.get(i12)).intValue());
            }
            x0Var.F(iP);
            while (i11 < list.size()) {
                x0Var.F(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z10) {
            while (i11 < j1Var.f23612c) {
                x0Var.t(i10, j1Var.m(i11));
                i11++;
            }
            return;
        }
        x0Var.r(i10, 2);
        int iP2 = 0;
        for (int i13 = 0; i13 < j1Var.f23612c; i13++) {
            iP2 += x0.p(j1Var.m(i13));
        }
        x0Var.F(iP2);
        while (i11 < j1Var.f23612c) {
            x0Var.F(j1Var.m(i11));
            i11++;
        }
    }

    public static void m(int i10, List list, q6 q6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x0 x0Var = (x0) q6Var.f23891b;
        int i11 = 0;
        if (!(list instanceof j1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    x0Var.t(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            x0Var.r(i10, 2);
            int iP = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iP += x0.p((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            x0Var.F(iP);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                x0Var.F((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z10) {
            while (i11 < j1Var.f23612c) {
                int iM = j1Var.m(i11);
                x0Var.t(i10, (iM >> 31) ^ (iM + iM));
                i11++;
            }
            return;
        }
        x0Var.r(i10, 2);
        int iP2 = 0;
        for (int i13 = 0; i13 < j1Var.f23612c; i13++) {
            int iM2 = j1Var.m(i13);
            iP2 += x0.p((iM2 >> 31) ^ (iM2 + iM2));
        }
        x0Var.F(iP2);
        while (i11 < j1Var.f23612c) {
            int iM3 = j1Var.m(i11);
            x0Var.F((iM3 >> 31) ^ (iM3 + iM3));
            i11++;
        }
    }

    public static void n(int i10, List list, q6 q6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x0 x0Var = (x0) q6Var.f23891b;
        int i11 = 0;
        if (!(list instanceof j1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    x0Var.u(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            x0Var.r(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            x0Var.F(i12);
            while (i11 < list.size()) {
                x0Var.G(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z10) {
            while (i11 < j1Var.f23612c) {
                x0Var.u(i10, j1Var.m(i11));
                i11++;
            }
            return;
        }
        x0Var.r(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < j1Var.f23612c; i15++) {
            j1Var.m(i15);
            i14 += 4;
        }
        x0Var.F(i14);
        while (i11 < j1Var.f23612c) {
            x0Var.G(j1Var.m(i11));
            i11++;
        }
    }

    public static void o(int i10, List list, q6 q6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x0 x0Var = (x0) q6Var.f23891b;
        int i11 = 0;
        if (!(list instanceof j1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    x0Var.u(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            x0Var.r(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            x0Var.F(i12);
            while (i11 < list.size()) {
                x0Var.G(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z10) {
            while (i11 < j1Var.f23612c) {
                x0Var.u(i10, j1Var.m(i11));
                i11++;
            }
            return;
        }
        x0Var.r(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < j1Var.f23612c; i15++) {
            j1Var.m(i15);
            i14 += 4;
        }
        x0Var.F(i14);
        while (i11 < j1Var.f23612c) {
            x0Var.G(j1Var.m(i11));
            i11++;
        }
    }

    public static void p(int i10, List list, q6 q6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x0 x0Var = (x0) q6Var.f23891b;
        int i11 = 0;
        if (!(list instanceof j1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    x0Var.s(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            x0Var.r(i10, 2);
            int iQ = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iQ += x0.q(((Integer) list.get(i12)).intValue());
            }
            x0Var.F(iQ);
            while (i11 < list.size()) {
                x0Var.E(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z10) {
            while (i11 < j1Var.f23612c) {
                x0Var.s(i10, j1Var.m(i11));
                i11++;
            }
            return;
        }
        x0Var.r(i10, 2);
        int iQ2 = 0;
        for (int i13 = 0; i13 < j1Var.f23612c; i13++) {
            iQ2 += x0.q(j1Var.m(i13));
        }
        x0Var.F(iQ2);
        while (i11 < j1Var.f23612c) {
            x0Var.E(j1Var.m(i11));
            i11++;
        }
    }

    public static void q(int i10, List list, q6 q6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x0 x0Var = (x0) q6Var.f23891b;
        if (list instanceof o0) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                x0Var.x(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        x0Var.r(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        x0Var.F(i12);
        while (i11 < list.size()) {
            x0Var.D(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y1)) {
            int iQ = 0;
            while (i10 < size) {
                iQ += x0.q(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iQ;
        }
        y1 y1Var = (y1) list;
        int iQ2 = 0;
        while (i10 < size) {
            iQ2 += x0.q(y1Var.h(i10));
            i10++;
        }
        return iQ2;
    }

    public static int s(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y1)) {
            int iQ = 0;
            while (i10 < size) {
                iQ += x0.q(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iQ;
        }
        y1 y1Var = (y1) list;
        int iQ2 = 0;
        while (i10 < size) {
            iQ2 += x0.q(y1Var.h(i10));
            i10++;
        }
        return iQ2;
    }

    public static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y1)) {
            int iQ = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iQ += x0.q((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iQ;
        }
        y1 y1Var = (y1) list;
        int iQ2 = 0;
        while (i10 < size) {
            long jH = y1Var.h(i10);
            iQ2 += x0.q((jH >> 63) ^ (jH + jH));
            i10++;
        }
        return iQ2;
    }

    public static int u(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j1)) {
            int iQ = 0;
            while (i10 < size) {
                iQ += x0.q(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iQ;
        }
        j1 j1Var = (j1) list;
        int iQ2 = 0;
        while (i10 < size) {
            iQ2 += x0.q(j1Var.m(i10));
            i10++;
        }
        return iQ2;
    }

    public static int v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j1)) {
            int iQ = 0;
            while (i10 < size) {
                iQ += x0.q(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iQ;
        }
        j1 j1Var = (j1) list;
        int iQ2 = 0;
        while (i10 < size) {
            iQ2 += x0.q(j1Var.m(i10));
            i10++;
        }
        return iQ2;
    }

    public static int w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j1)) {
            int iP = 0;
            while (i10 < size) {
                iP += x0.p(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iP;
        }
        j1 j1Var = (j1) list;
        int iP2 = 0;
        while (i10 < size) {
            iP2 += x0.p(j1Var.m(i10));
            i10++;
        }
        return iP2;
    }

    public static int x(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j1)) {
            int iP = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iP += x0.p((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iP;
        }
        j1 j1Var = (j1) list;
        int iP2 = 0;
        while (i10 < size) {
            int iM = j1Var.m(i10);
            iP2 += x0.p((iM >> 31) ^ (iM + iM));
            i10++;
        }
        return iP2;
    }

    public static int y(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x0.p(i10 << 3) + 4) * size;
    }

    public static int z(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x0.p(i10 << 3) + 8) * size;
    }
}

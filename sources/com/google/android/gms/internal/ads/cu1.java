package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s6 f13256a;

    static {
        int i10 = tr1.f20473a;
        f13256a = new s6(6);
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (is1.p(i10 << 3) + 4) * size;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (is1.p(i10 << 3) + 8) * size;
    }

    public static boolean c(Object obj, Object obj2) {
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
    public static void d(Object obj, Object obj2) {
        ss1 ss1Var = (ss1) obj;
        iu1 iu1Var = ss1Var.zzt;
        iu1 iu1Var2 = ((ss1) obj2).zzt;
        iu1 iu1Var3 = iu1.f15848f;
        if (!iu1Var3.equals(iu1Var2)) {
            if (iu1Var3.equals(iu1Var)) {
                int i10 = iu1Var.f15849a + iu1Var2.f15849a;
                int[] iArrCopyOf = Arrays.copyOf(iu1Var.f15850b, i10);
                System.arraycopy(iu1Var2.f15850b, 0, iArrCopyOf, iu1Var.f15849a, iu1Var2.f15849a);
                Object[] objArrCopyOf = Arrays.copyOf(iu1Var.f15851c, i10);
                System.arraycopy(iu1Var2.f15851c, 0, objArrCopyOf, iu1Var.f15849a, iu1Var2.f15849a);
                iu1Var = new iu1(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                iu1Var.getClass();
                if (!iu1Var2.equals(iu1Var3)) {
                    if (!iu1Var.f15853e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = iu1Var.f15849a + iu1Var2.f15849a;
                    iu1Var.e(i11);
                    System.arraycopy(iu1Var2.f15850b, 0, iu1Var.f15850b, iu1Var.f15849a, iu1Var2.f15849a);
                    System.arraycopy(iu1Var2.f15851c, 0, iu1Var.f15851c, iu1Var.f15849a, iu1Var2.f15849a);
                    iu1Var.f15849a = i11;
                }
            }
        }
        ss1Var.zzt = iu1Var;
    }

    public static Object e(Object obj, int i10, at1 at1Var, vs1 vs1Var, Object obj2, s6 s6Var) {
        if (vs1Var == null) {
            return obj2;
        }
        if (at1Var == null) {
            Iterator it = at1Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!vs1Var.a(iIntValue)) {
                    if (obj2 == null) {
                        s6Var.getClass();
                        obj2 = s6.v(obj);
                    }
                    s6Var.getClass();
                    ((iu1) obj2).d(i10 << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = at1Var.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) at1Var.get(i12);
            int iIntValue2 = num.intValue();
            if (vs1Var.a(iIntValue2)) {
                if (i12 != i11) {
                    at1Var.set(i11, num);
                }
                i11++;
            } else {
                if (obj2 == null) {
                    s6Var.getClass();
                    obj2 = s6.v(obj);
                }
                s6Var.getClass();
                ((iu1) obj2).d(i10 << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i11 != size) {
            at1Var.subList(i11, size).clear();
        }
        return obj2;
    }

    public static void f(int i10, List list, z61 z61Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        is1 is1Var = (is1) z61Var.f22523a;
        if (list instanceof js1) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                is1Var.x(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        is1Var.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        is1Var.G(i12);
        while (i11 < list.size()) {
            is1Var.J(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void g(int i10, List list, z61 z61Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        is1 is1Var = (is1) z61Var.f22523a;
        if (list instanceof os1) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                is1Var.v(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        is1Var.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        is1Var.G(i12);
        while (i11 < list.size()) {
            is1Var.H(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void h(int i10, List list, z61 z61Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        is1 is1Var = (is1) z61Var.f22523a;
        int i11 = 0;
        if (!(list instanceof jt1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    is1Var.w(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            is1Var.s(i10, 2);
            int iQ = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iQ += is1.q(((Long) list.get(i12)).longValue());
            }
            is1Var.G(iQ);
            while (i11 < list.size()) {
                is1Var.I(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        jt1 jt1Var = (jt1) list;
        if (!z10) {
            while (i11 < jt1Var.f16183c) {
                is1Var.w(i10, jt1Var.h(i11));
                i11++;
            }
            return;
        }
        is1Var.s(i10, 2);
        int iQ2 = 0;
        for (int i13 = 0; i13 < jt1Var.f16183c; i13++) {
            iQ2 += is1.q(jt1Var.h(i13));
        }
        is1Var.G(iQ2);
        while (i11 < jt1Var.f16183c) {
            is1Var.I(jt1Var.h(i11));
            i11++;
        }
    }

    public static void i(int i10, List list, z61 z61Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        is1 is1Var = (is1) z61Var.f22523a;
        int i11 = 0;
        if (!(list instanceof jt1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    is1Var.w(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            is1Var.s(i10, 2);
            int iQ = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iQ += is1.q(((Long) list.get(i12)).longValue());
            }
            is1Var.G(iQ);
            while (i11 < list.size()) {
                is1Var.I(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        jt1 jt1Var = (jt1) list;
        if (!z10) {
            while (i11 < jt1Var.f16183c) {
                is1Var.w(i10, jt1Var.h(i11));
                i11++;
            }
            return;
        }
        is1Var.s(i10, 2);
        int iQ2 = 0;
        for (int i13 = 0; i13 < jt1Var.f16183c; i13++) {
            iQ2 += is1.q(jt1Var.h(i13));
        }
        is1Var.G(iQ2);
        while (i11 < jt1Var.f16183c) {
            is1Var.I(jt1Var.h(i11));
            i11++;
        }
    }

    public static void j(int i10, List list, z61 z61Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        is1 is1Var = (is1) z61Var.f22523a;
        int i11 = 0;
        if (!(list instanceof jt1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    is1Var.w(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            is1Var.s(i10, 2);
            int iQ = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iQ += is1.q((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            is1Var.G(iQ);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                is1Var.I((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        jt1 jt1Var = (jt1) list;
        if (!z10) {
            while (i11 < jt1Var.f16183c) {
                long jH = jt1Var.h(i11);
                is1Var.w(i10, (jH >> 63) ^ (jH + jH));
                i11++;
            }
            return;
        }
        is1Var.s(i10, 2);
        int iQ2 = 0;
        for (int i13 = 0; i13 < jt1Var.f16183c; i13++) {
            long jH2 = jt1Var.h(i13);
            iQ2 += is1.q((jH2 >> 63) ^ (jH2 + jH2));
        }
        is1Var.G(iQ2);
        while (i11 < jt1Var.f16183c) {
            long jH3 = jt1Var.h(i11);
            is1Var.I((jH3 >> 63) ^ (jH3 + jH3));
            i11++;
        }
    }

    public static void k(int i10, List list, z61 z61Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        is1 is1Var = (is1) z61Var.f22523a;
        int i11 = 0;
        if (!(list instanceof jt1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    is1Var.x(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            is1Var.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            is1Var.G(i12);
            while (i11 < list.size()) {
                is1Var.J(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        jt1 jt1Var = (jt1) list;
        if (!z10) {
            while (i11 < jt1Var.f16183c) {
                is1Var.x(i10, jt1Var.h(i11));
                i11++;
            }
            return;
        }
        is1Var.s(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < jt1Var.f16183c; i15++) {
            jt1Var.h(i15);
            i14 += 8;
        }
        is1Var.G(i14);
        while (i11 < jt1Var.f16183c) {
            is1Var.J(jt1Var.h(i11));
            i11++;
        }
    }

    public static void l(int i10, List list, z61 z61Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        is1 is1Var = (is1) z61Var.f22523a;
        int i11 = 0;
        if (!(list instanceof jt1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    is1Var.x(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            is1Var.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            is1Var.G(i12);
            while (i11 < list.size()) {
                is1Var.J(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        jt1 jt1Var = (jt1) list;
        if (!z10) {
            while (i11 < jt1Var.f16183c) {
                is1Var.x(i10, jt1Var.h(i11));
                i11++;
            }
            return;
        }
        is1Var.s(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < jt1Var.f16183c; i15++) {
            jt1Var.h(i15);
            i14 += 8;
        }
        is1Var.G(i14);
        while (i11 < jt1Var.f16183c) {
            is1Var.J(jt1Var.h(i11));
            i11++;
        }
    }

    public static void m(int i10, List list, z61 z61Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        is1 is1Var = (is1) z61Var.f22523a;
        int i11 = 0;
        if (!(list instanceof ts1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    is1Var.t(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            is1Var.s(i10, 2);
            int iQ = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iQ += is1.q(((Integer) list.get(i12)).intValue());
            }
            is1Var.G(iQ);
            while (i11 < list.size()) {
                is1Var.F(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        ts1 ts1Var = (ts1) list;
        if (!z10) {
            while (i11 < ts1Var.f20491c) {
                is1Var.t(i10, ts1Var.m(i11));
                i11++;
            }
            return;
        }
        is1Var.s(i10, 2);
        int iQ2 = 0;
        for (int i13 = 0; i13 < ts1Var.f20491c; i13++) {
            iQ2 += is1.q(ts1Var.m(i13));
        }
        is1Var.G(iQ2);
        while (i11 < ts1Var.f20491c) {
            is1Var.F(ts1Var.m(i11));
            i11++;
        }
    }

    public static void n(int i10, List list, z61 z61Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        is1 is1Var = (is1) z61Var.f22523a;
        int i11 = 0;
        if (!(list instanceof ts1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    is1Var.u(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            is1Var.s(i10, 2);
            int iP = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iP += is1.p(((Integer) list.get(i12)).intValue());
            }
            is1Var.G(iP);
            while (i11 < list.size()) {
                is1Var.G(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        ts1 ts1Var = (ts1) list;
        if (!z10) {
            while (i11 < ts1Var.f20491c) {
                is1Var.u(i10, ts1Var.m(i11));
                i11++;
            }
            return;
        }
        is1Var.s(i10, 2);
        int iP2 = 0;
        for (int i13 = 0; i13 < ts1Var.f20491c; i13++) {
            iP2 += is1.p(ts1Var.m(i13));
        }
        is1Var.G(iP2);
        while (i11 < ts1Var.f20491c) {
            is1Var.G(ts1Var.m(i11));
            i11++;
        }
    }

    public static void o(int i10, List list, z61 z61Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        is1 is1Var = (is1) z61Var.f22523a;
        int i11 = 0;
        if (!(list instanceof ts1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    is1Var.u(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            is1Var.s(i10, 2);
            int iP = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iP += is1.p((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            is1Var.G(iP);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                is1Var.G((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        ts1 ts1Var = (ts1) list;
        if (!z10) {
            while (i11 < ts1Var.f20491c) {
                int iM = ts1Var.m(i11);
                is1Var.u(i10, (iM >> 31) ^ (iM + iM));
                i11++;
            }
            return;
        }
        is1Var.s(i10, 2);
        int iP2 = 0;
        for (int i13 = 0; i13 < ts1Var.f20491c; i13++) {
            int iM2 = ts1Var.m(i13);
            iP2 += is1.p((iM2 >> 31) ^ (iM2 + iM2));
        }
        is1Var.G(iP2);
        while (i11 < ts1Var.f20491c) {
            int iM3 = ts1Var.m(i11);
            is1Var.G((iM3 >> 31) ^ (iM3 + iM3));
            i11++;
        }
    }

    public static void p(int i10, List list, z61 z61Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        is1 is1Var = (is1) z61Var.f22523a;
        int i11 = 0;
        if (!(list instanceof ts1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    is1Var.v(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            is1Var.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            is1Var.G(i12);
            while (i11 < list.size()) {
                is1Var.H(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        ts1 ts1Var = (ts1) list;
        if (!z10) {
            while (i11 < ts1Var.f20491c) {
                is1Var.v(i10, ts1Var.m(i11));
                i11++;
            }
            return;
        }
        is1Var.s(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < ts1Var.f20491c; i15++) {
            ts1Var.m(i15);
            i14 += 4;
        }
        is1Var.G(i14);
        while (i11 < ts1Var.f20491c) {
            is1Var.H(ts1Var.m(i11));
            i11++;
        }
    }

    public static void q(int i10, List list, z61 z61Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        is1 is1Var = (is1) z61Var.f22523a;
        int i11 = 0;
        if (!(list instanceof ts1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    is1Var.v(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            is1Var.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            is1Var.G(i12);
            while (i11 < list.size()) {
                is1Var.H(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        ts1 ts1Var = (ts1) list;
        if (!z10) {
            while (i11 < ts1Var.f20491c) {
                is1Var.v(i10, ts1Var.m(i11));
                i11++;
            }
            return;
        }
        is1Var.s(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < ts1Var.f20491c; i15++) {
            ts1Var.m(i15);
            i14 += 4;
        }
        is1Var.G(i14);
        while (i11 < ts1Var.f20491c) {
            is1Var.H(ts1Var.m(i11));
            i11++;
        }
    }

    public static void r(int i10, List list, z61 z61Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        is1 is1Var = (is1) z61Var.f22523a;
        int i11 = 0;
        if (!(list instanceof ts1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    is1Var.t(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            is1Var.s(i10, 2);
            int iQ = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iQ += is1.q(((Integer) list.get(i12)).intValue());
            }
            is1Var.G(iQ);
            while (i11 < list.size()) {
                is1Var.F(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        ts1 ts1Var = (ts1) list;
        if (!z10) {
            while (i11 < ts1Var.f20491c) {
                is1Var.t(i10, ts1Var.m(i11));
                i11++;
            }
            return;
        }
        is1Var.s(i10, 2);
        int iQ2 = 0;
        for (int i13 = 0; i13 < ts1Var.f20491c; i13++) {
            iQ2 += is1.q(ts1Var.m(i13));
        }
        is1Var.G(iQ2);
        while (i11 < ts1Var.f20491c) {
            is1Var.F(ts1Var.m(i11));
            i11++;
        }
    }

    public static void s(int i10, List list, z61 z61Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        is1 is1Var = (is1) z61Var.f22523a;
        if (list instanceof wr1) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                is1Var.y(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        is1Var.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        is1Var.G(i12);
        while (i11 < list.size()) {
            is1Var.E(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof jt1)) {
            int iQ = 0;
            while (i10 < size) {
                iQ += is1.q(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iQ;
        }
        jt1 jt1Var = (jt1) list;
        int iQ2 = 0;
        while (i10 < size) {
            iQ2 += is1.q(jt1Var.h(i10));
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
        if (!(list instanceof jt1)) {
            int iQ = 0;
            while (i10 < size) {
                iQ += is1.q(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iQ;
        }
        jt1 jt1Var = (jt1) list;
        int iQ2 = 0;
        while (i10 < size) {
            iQ2 += is1.q(jt1Var.h(i10));
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
        if (!(list instanceof jt1)) {
            int iQ = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iQ += is1.q((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iQ;
        }
        jt1 jt1Var = (jt1) list;
        int iQ2 = 0;
        while (i10 < size) {
            long jH = jt1Var.h(i10);
            iQ2 += is1.q((jH >> 63) ^ (jH + jH));
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
        if (!(list instanceof ts1)) {
            int iQ = 0;
            while (i10 < size) {
                iQ += is1.q(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iQ;
        }
        ts1 ts1Var = (ts1) list;
        int iQ2 = 0;
        while (i10 < size) {
            iQ2 += is1.q(ts1Var.m(i10));
            i10++;
        }
        return iQ2;
    }

    public static int x(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ts1)) {
            int iQ = 0;
            while (i10 < size) {
                iQ += is1.q(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iQ;
        }
        ts1 ts1Var = (ts1) list;
        int iQ2 = 0;
        while (i10 < size) {
            iQ2 += is1.q(ts1Var.m(i10));
            i10++;
        }
        return iQ2;
    }

    public static int y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ts1)) {
            int iP = 0;
            while (i10 < size) {
                iP += is1.p(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iP;
        }
        ts1 ts1Var = (ts1) list;
        int iP2 = 0;
        while (i10 < size) {
            iP2 += is1.p(ts1Var.m(i10));
            i10++;
        }
        return iP2;
    }

    public static int z(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ts1)) {
            int iP = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iP += is1.p((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iP;
        }
        ts1 ts1Var = (ts1) list;
        int iP2 = 0;
        while (i10 < size) {
            int iM = ts1Var.m(i10);
            iP2 += is1.p((iM >> 31) ^ (iM + iM));
            i10++;
        }
        return iP2;
    }
}

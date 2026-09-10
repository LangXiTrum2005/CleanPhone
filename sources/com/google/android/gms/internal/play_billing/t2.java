package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f24472a;

    static {
        p2 p2Var = p2.f24443c;
        f24472a = new r1(6);
    }

    public static void a(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) h2Var.f24280a;
        int i11 = 0;
        if (!(list instanceof u1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    j1Var.d0(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            j1Var.c0(i10, 2);
            int iR = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iR += j1.R((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            j1Var.e0(iR);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                j1Var.e0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        u1 u1Var = (u1) list;
        if (!z10) {
            while (i11 < u1Var.f24484c) {
                int iH = u1Var.h(i11);
                j1Var.d0(i10, (iH >> 31) ^ (iH + iH));
                i11++;
            }
            return;
        }
        j1Var.c0(i10, 2);
        int iR2 = 0;
        for (int i13 = 0; i13 < u1Var.f24484c; i13++) {
            int iH2 = u1Var.h(i13);
            iR2 += j1.R((iH2 >> 31) ^ (iH2 + iH2));
        }
        j1Var.e0(iR2);
        while (i11 < u1Var.f24484c) {
            int iH3 = u1Var.h(i11);
            j1Var.e0((iH3 >> 31) ^ (iH3 + iH3));
            i11++;
        }
    }

    public static void b(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) h2Var.f24280a;
        if (list instanceof g2) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                j1Var.f0(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        j1Var.c0(i10, 2);
        int iS = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iS += j1.S((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        j1Var.e0(iS);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            j1Var.g0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    public static void c(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) h2Var.f24280a;
        int i11 = 0;
        if (!(list instanceof u1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    j1Var.d0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            j1Var.c0(i10, 2);
            int iR = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iR += j1.R(((Integer) list.get(i12)).intValue());
            }
            j1Var.e0(iR);
            while (i11 < list.size()) {
                j1Var.e0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        u1 u1Var = (u1) list;
        if (!z10) {
            while (i11 < u1Var.f24484c) {
                j1Var.d0(i10, u1Var.h(i11));
                i11++;
            }
            return;
        }
        j1Var.c0(i10, 2);
        int iR2 = 0;
        for (int i13 = 0; i13 < u1Var.f24484c; i13++) {
            iR2 += j1.R(u1Var.h(i13));
        }
        j1Var.e0(iR2);
        while (i11 < u1Var.f24484c) {
            j1Var.e0(u1Var.h(i11));
            i11++;
        }
    }

    public static void d(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) h2Var.f24280a;
        if (list instanceof g2) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                j1Var.f0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        j1Var.c0(i10, 2);
        int iS = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS += j1.S(((Long) list.get(i12)).longValue());
        }
        j1Var.e0(iS);
        while (i11 < list.size()) {
            j1Var.g0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u1)) {
            int iS = 0;
            while (i10 < size) {
                iS += j1.S(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iS;
        }
        u1 u1Var = (u1) list;
        int iS2 = 0;
        while (i10 < size) {
            iS2 += j1.S(u1Var.h(i10));
            i10++;
        }
        return iS2;
    }

    public static int g(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j1.R(i10 << 3) + 4) * size;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j1.R(i10 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u1)) {
            int iS = 0;
            while (i10 < size) {
                iS += j1.S(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iS;
        }
        u1 u1Var = (u1) list;
        int iS2 = 0;
        while (i10 < size) {
            iS2 += j1.S(u1Var.h(i10));
            i10++;
        }
        return iS2;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof g2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iS = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iS += j1.S(((Long) list.get(i10)).longValue());
        }
        return iS;
    }

    public static int k(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u1)) {
            int iR = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iR += j1.R((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iR;
        }
        u1 u1Var = (u1) list;
        int iR2 = 0;
        while (i10 < size) {
            int iH = u1Var.h(i10);
            iR2 += j1.R((iH >> 31) ^ (iH + iH));
            i10++;
        }
        return iR2;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof g2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iS = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iS += j1.S((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iS;
    }

    public static int m(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u1)) {
            int iR = 0;
            while (i10 < size) {
                iR += j1.R(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iR;
        }
        u1 u1Var = (u1) list;
        int iR2 = 0;
        while (i10 < size) {
            iR2 += j1.R(u1Var.h(i10));
            i10++;
        }
        return iR2;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof g2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iS = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iS += j1.S(((Long) list.get(i10)).longValue());
        }
        return iS;
    }

    public static Object o(Object obj, int i10, int i11, Object obj2, r1 r1Var) {
        w2 w2Var;
        Object obj3 = obj2;
        if (obj2 == null) {
            r1Var.getClass();
            t1 t1Var = (t1) obj;
            w2Var = t1Var.zzc;
            if (w2Var == w2.f24493f) {
                obj3 = w2Var;
                w2 w2VarB = w2.b();
                t1Var.zzc = w2VarB;
                obj3 = w2VarB;
            }
        }
        obj3 = w2Var;
        ((w2) obj3).c(i10 << 3, Long.valueOf(i11));
        return obj3;
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
    public static void p(Object obj, Object obj2) {
        t1 t1Var = (t1) obj;
        w2 w2Var = t1Var.zzc;
        w2 w2Var2 = ((t1) obj2).zzc;
        w2 w2Var3 = w2.f24493f;
        if (!w2Var3.equals(w2Var2)) {
            if (w2Var3.equals(w2Var)) {
                int i10 = w2Var.f24494a + w2Var2.f24494a;
                int[] iArrCopyOf = Arrays.copyOf(w2Var.f24495b, i10);
                System.arraycopy(w2Var2.f24495b, 0, iArrCopyOf, w2Var.f24494a, w2Var2.f24494a);
                Object[] objArrCopyOf = Arrays.copyOf(w2Var.f24496c, i10);
                System.arraycopy(w2Var2.f24496c, 0, objArrCopyOf, w2Var.f24494a, w2Var2.f24494a);
                w2Var = new w2(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                w2Var.getClass();
                if (!w2Var2.equals(w2Var3)) {
                    if (!w2Var.f24498e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = w2Var.f24494a + w2Var2.f24494a;
                    w2Var.e(i11);
                    System.arraycopy(w2Var2.f24495b, 0, w2Var.f24495b, w2Var.f24494a, w2Var2.f24494a);
                    System.arraycopy(w2Var2.f24496c, 0, w2Var.f24496c, w2Var.f24494a, w2Var2.f24494a);
                    w2Var.f24494a = i11;
                }
            }
        }
        t1Var.zzc = w2Var;
    }

    public static void q(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) h2Var.f24280a;
        if (list instanceof f1) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                byte bBooleanValue = ((Boolean) list.get(i11)).booleanValue();
                j1Var.e0(i10 << 3);
                int i12 = j1Var.f24309d;
                try {
                    int i13 = i12 + 1;
                    try {
                        j1Var.f24307b[i12] = bBooleanValue;
                        j1Var.f24309d = i13;
                        i11++;
                    } catch (IndexOutOfBoundsException e10) {
                        e = e10;
                        i12 = i13;
                        throw new b2.z(i12, j1Var.f24308c, 1, e, 8);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    e = e11;
                }
            }
            return;
        }
        j1Var.c0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Boolean) list.get(i15)).getClass();
            i14++;
        }
        j1Var.e0(i14);
        while (i11 < list.size()) {
            byte bBooleanValue2 = ((Boolean) list.get(i11)).booleanValue();
            int i16 = j1Var.f24309d;
            try {
                int i17 = i16 + 1;
                try {
                    j1Var.f24307b[i16] = bBooleanValue2;
                    j1Var.f24309d = i17;
                    i11++;
                } catch (IndexOutOfBoundsException e12) {
                    e = e12;
                    i16 = i17;
                    throw new b2.z(i16, j1Var.f24308c, 1, e, 8);
                }
            } catch (IndexOutOfBoundsException e13) {
                e = e13;
            }
        }
    }

    public static void r(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) h2Var.f24280a;
        if (list instanceof k1) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                j1Var.X(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        j1Var.c0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        j1Var.e0(i12);
        while (i11 < list.size()) {
            j1Var.Y(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void s(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) h2Var.f24280a;
        int i11 = 0;
        if (!(list instanceof u1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    j1Var.Z(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            j1Var.c0(i10, 2);
            int iS = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iS += j1.S(((Integer) list.get(i12)).intValue());
            }
            j1Var.e0(iS);
            while (i11 < list.size()) {
                j1Var.a0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        u1 u1Var = (u1) list;
        if (!z10) {
            while (i11 < u1Var.f24484c) {
                j1Var.Z(i10, u1Var.h(i11));
                i11++;
            }
            return;
        }
        j1Var.c0(i10, 2);
        int iS2 = 0;
        for (int i13 = 0; i13 < u1Var.f24484c; i13++) {
            iS2 += j1.S(u1Var.h(i13));
        }
        j1Var.e0(iS2);
        while (i11 < u1Var.f24484c) {
            j1Var.a0(u1Var.h(i11));
            i11++;
        }
    }

    public static void t(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) h2Var.f24280a;
        int i11 = 0;
        if (!(list instanceof u1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    j1Var.V(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            j1Var.c0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            j1Var.e0(i12);
            while (i11 < list.size()) {
                j1Var.W(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        u1 u1Var = (u1) list;
        if (!z10) {
            while (i11 < u1Var.f24484c) {
                j1Var.V(i10, u1Var.h(i11));
                i11++;
            }
            return;
        }
        j1Var.c0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < u1Var.f24484c; i15++) {
            u1Var.h(i15);
            i14 += 4;
        }
        j1Var.e0(i14);
        while (i11 < u1Var.f24484c) {
            j1Var.W(u1Var.h(i11));
            i11++;
        }
    }

    public static void u(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) h2Var.f24280a;
        if (list instanceof g2) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                j1Var.X(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        j1Var.c0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        j1Var.e0(i12);
        while (i11 < list.size()) {
            j1Var.Y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void v(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) h2Var.f24280a;
        if (list instanceof p1) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                j1Var.V(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        j1Var.c0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        j1Var.e0(i12);
        while (i11 < list.size()) {
            j1Var.W(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void w(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) h2Var.f24280a;
        int i11 = 0;
        if (!(list instanceof u1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    j1Var.Z(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            j1Var.c0(i10, 2);
            int iS = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iS += j1.S(((Integer) list.get(i12)).intValue());
            }
            j1Var.e0(iS);
            while (i11 < list.size()) {
                j1Var.a0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        u1 u1Var = (u1) list;
        if (!z10) {
            while (i11 < u1Var.f24484c) {
                j1Var.Z(i10, u1Var.h(i11));
                i11++;
            }
            return;
        }
        j1Var.c0(i10, 2);
        int iS2 = 0;
        for (int i13 = 0; i13 < u1Var.f24484c; i13++) {
            iS2 += j1.S(u1Var.h(i13));
        }
        j1Var.e0(iS2);
        while (i11 < u1Var.f24484c) {
            j1Var.a0(u1Var.h(i11));
            i11++;
        }
    }

    public static void x(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) h2Var.f24280a;
        if (list instanceof g2) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                j1Var.f0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        j1Var.c0(i10, 2);
        int iS = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS += j1.S(((Long) list.get(i12)).longValue());
        }
        j1Var.e0(iS);
        while (i11 < list.size()) {
            j1Var.g0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void y(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) h2Var.f24280a;
        int i11 = 0;
        if (!(list instanceof u1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    j1Var.V(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            j1Var.c0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            j1Var.e0(i12);
            while (i11 < list.size()) {
                j1Var.W(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        u1 u1Var = (u1) list;
        if (!z10) {
            while (i11 < u1Var.f24484c) {
                j1Var.V(i10, u1Var.h(i11));
                i11++;
            }
            return;
        }
        j1Var.c0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < u1Var.f24484c; i15++) {
            u1Var.h(i15);
            i14 += 4;
        }
        j1Var.e0(i14);
        while (i11 < u1Var.f24484c) {
            j1Var.W(u1Var.h(i11));
            i11++;
        }
    }

    public static void z(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) h2Var.f24280a;
        if (list instanceof g2) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                j1Var.X(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        j1Var.c0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        j1Var.e0(i12);
        while (i11 < list.size()) {
            j1Var.Y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }
}

package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f24535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d1 f24536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d1 f24537c;

    static {
        Class<?> cls;
        Class<?> cls2;
        w0 w0Var = w0.f24646c;
        d1 d1Var = null;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f24535a = cls;
        try {
            w0 w0Var2 = w0.f24646c;
            try {
                cls2 = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                d1Var = (d1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f24536b = d1Var;
        f24537c = new d1();
    }

    public static int a(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int iG0 = 0;
            while (i10 < size) {
                iG0 += l.g0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iG0;
        }
        y yVar = (y) list;
        int iG1 = 0;
        while (i10 < size) {
            iG1 += l.g0(yVar.getInt(i10));
            i10++;
        }
        return iG1;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.e0(i10) + 4) * size;
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.e0(i10) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int iG0 = 0;
            while (i10 < size) {
                iG0 += l.g0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iG0;
        }
        y yVar = (y) list;
        int iG1 = 0;
        while (i10 < size) {
            iG1 += l.g0(yVar.getInt(i10));
            i10++;
        }
        return iG1;
    }

    public static int e(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iG0 = 0;
            while (i10 < size) {
                iG0 += l.g0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iG0;
        }
        i0 i0Var = (i0) list;
        int iG1 = 0;
        while (i10 < size) {
            iG1 += l.g0(i0Var.getLong(i10));
            i10++;
        }
        return iG1;
    }

    public static int f(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int iB0 = 0;
            while (i10 < size) {
                iB0 += l.b0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iB0;
        }
        y yVar = (y) list;
        int iB1 = 0;
        while (i10 < size) {
            iB1 += l.b0(yVar.getInt(i10));
            i10++;
        }
        return iB1;
    }

    public static int g(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iC0 = 0;
            while (i10 < size) {
                iC0 += l.c0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iC0;
        }
        i0 i0Var = (i0) list;
        int iC1 = 0;
        while (i10 < size) {
            iC1 += l.c0(i0Var.getLong(i10));
            i10++;
        }
        return iC1;
    }

    public static int h(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int iF0 = 0;
            while (i10 < size) {
                iF0 += l.f0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iF0;
        }
        y yVar = (y) list;
        int iF1 = 0;
        while (i10 < size) {
            iF1 += l.f0(yVar.getInt(i10));
            i10++;
        }
        return iF1;
    }

    public static int i(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iG0 = 0;
            while (i10 < size) {
                iG0 += l.g0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iG0;
        }
        i0 i0Var = (i0) list;
        int iG1 = 0;
        while (i10 < size) {
            iG1 += l.g0(i0Var.getLong(i10));
            i10++;
        }
        return iG1;
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
    public static void k(d1 d1Var, Object obj, Object obj2) {
        d1Var.getClass();
        x xVar = (x) obj;
        c1 c1Var = xVar.unknownFields;
        c1 c1Var2 = ((x) obj2).unknownFields;
        c1 c1Var3 = c1.f24543f;
        if (!c1Var3.equals(c1Var2)) {
            if (c1Var3.equals(c1Var)) {
                int i10 = c1Var.f24544a + c1Var2.f24544a;
                int[] iArrCopyOf = Arrays.copyOf(c1Var.f24545b, i10);
                System.arraycopy(c1Var2.f24545b, 0, iArrCopyOf, c1Var.f24544a, c1Var2.f24544a);
                Object[] objArrCopyOf = Arrays.copyOf(c1Var.f24546c, i10);
                System.arraycopy(c1Var2.f24546c, 0, objArrCopyOf, c1Var.f24544a, c1Var2.f24544a);
                c1Var = new c1(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                c1Var.getClass();
                if (!c1Var2.equals(c1Var3)) {
                    if (!c1Var.f24548e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = c1Var.f24544a + c1Var2.f24544a;
                    c1Var.a(i11);
                    System.arraycopy(c1Var2.f24545b, 0, c1Var.f24545b, c1Var.f24544a, c1Var2.f24544a);
                    System.arraycopy(c1Var2.f24546c, 0, c1Var.f24546c, c1Var.f24544a, c1Var2.f24544a);
                    c1Var.f24544a = i11;
                }
            }
        }
        xVar.unknownFields = c1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i10, List list, k0 k0Var, boolean z10) throws m {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) k0Var.f24598a;
        if (list instanceof d) {
            if (z10) {
                lVar.p0(i10, 2);
                lVar.r0(0);
                return;
            }
            return;
        }
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                boolean zBooleanValue = ((Boolean) list.get(i11)).booleanValue();
                lVar.p0(i10, 0);
                lVar.h0(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        lVar.p0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = l.f24599e;
            i12++;
        }
        lVar.r0(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            lVar.h0(((Boolean) list.get(i14)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void n(int i10, List list, k0 k0Var, boolean z10) throws m {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) k0Var.f24598a;
        int i11 = 0;
        if (!(list instanceof n)) {
            if (!z10) {
                while (i11 < list.size()) {
                    double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                    lVar.getClass();
                    lVar.l0(i10, Double.doubleToRawLongBits(dDoubleValue));
                    i11++;
                }
                return;
            }
            lVar.p0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                Logger logger = l.f24599e;
                i12 += 8;
            }
            lVar.r0(i12);
            while (i11 < list.size()) {
                lVar.m0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        n nVar = (n) list;
        if (!z10) {
            while (i11 < 0) {
                nVar.h(i11);
                double d10 = nVar.f24608b[i11];
                lVar.getClass();
                lVar.l0(i10, Double.doubleToRawLongBits(d10));
                i11++;
            }
            return;
        }
        lVar.p0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < 0; i15++) {
            nVar.h(i15);
            double d11 = nVar.f24608b[i15];
            Logger logger2 = l.f24599e;
            i14 += 8;
        }
        lVar.r0(i14);
        while (i11 < 0) {
            nVar.h(i11);
            lVar.m0(Double.doubleToRawLongBits(nVar.f24608b[i11]));
            i11++;
        }
    }

    public static void o(int i10, List list, k0 k0Var, boolean z10) throws m {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) k0Var.f24598a;
        int i11 = 0;
        if (!(list instanceof y)) {
            if (!z10) {
                while (i11 < list.size()) {
                    lVar.n0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            lVar.p0(i10, 2);
            int iG0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG0 += l.g0(((Integer) list.get(i12)).intValue());
            }
            lVar.r0(iG0);
            while (i11 < list.size()) {
                lVar.o0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        y yVar = (y) list;
        if (!z10) {
            while (i11 < 0) {
                lVar.n0(i10, yVar.getInt(i11));
                i11++;
            }
            return;
        }
        lVar.p0(i10, 2);
        int iG1 = 0;
        for (int i13 = 0; i13 < 0; i13++) {
            iG1 += l.g0(yVar.getInt(i13));
        }
        lVar.r0(iG1);
        while (i11 < 0) {
            lVar.o0(yVar.getInt(i11));
            i11++;
        }
    }

    public static void p(int i10, List list, k0 k0Var, boolean z10) throws m {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) k0Var.f24598a;
        int i11 = 0;
        if (!(list instanceof y)) {
            if (!z10) {
                while (i11 < list.size()) {
                    lVar.j0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            lVar.p0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                Logger logger = l.f24599e;
                i12 += 4;
            }
            lVar.r0(i12);
            while (i11 < list.size()) {
                lVar.k0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        y yVar = (y) list;
        if (!z10) {
            while (i11 < 0) {
                lVar.j0(i10, yVar.getInt(i11));
                i11++;
            }
            return;
        }
        lVar.p0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < 0; i15++) {
            yVar.getInt(i15);
            Logger logger2 = l.f24599e;
            i14 += 4;
        }
        lVar.r0(i14);
        while (i11 < 0) {
            lVar.k0(yVar.getInt(i11));
            i11++;
        }
    }

    public static void q(int i10, List list, k0 k0Var, boolean z10) throws m {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) k0Var.f24598a;
        int i11 = 0;
        if (!(list instanceof i0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    lVar.l0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            lVar.p0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                Logger logger = l.f24599e;
                i12 += 8;
            }
            lVar.r0(i12);
            while (i11 < list.size()) {
                lVar.m0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        i0 i0Var = (i0) list;
        if (!z10) {
            while (i11 < 0) {
                lVar.l0(i10, i0Var.getLong(i11));
                i11++;
            }
            return;
        }
        lVar.p0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < 0; i15++) {
            i0Var.getLong(i15);
            Logger logger2 = l.f24599e;
            i14 += 8;
        }
        lVar.r0(i14);
        while (i11 < 0) {
            lVar.m0(i0Var.getLong(i11));
            i11++;
        }
    }

    public static void r(int i10, List list, k0 k0Var, boolean z10) throws m {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) k0Var.f24598a;
        int i11 = 0;
        if (!(list instanceof t)) {
            if (!z10) {
                while (i11 < list.size()) {
                    float fFloatValue = ((Float) list.get(i11)).floatValue();
                    lVar.getClass();
                    lVar.j0(i10, Float.floatToRawIntBits(fFloatValue));
                    i11++;
                }
                return;
            }
            lVar.p0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                Logger logger = l.f24599e;
                i12 += 4;
            }
            lVar.r0(i12);
            while (i11 < list.size()) {
                lVar.k0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        t tVar = (t) list;
        if (!z10) {
            while (i11 < 0) {
                tVar.h(i11);
                float f10 = tVar.f24639b[i11];
                lVar.getClass();
                lVar.j0(i10, Float.floatToRawIntBits(f10));
                i11++;
            }
            return;
        }
        lVar.p0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < 0; i15++) {
            tVar.h(i15);
            float f11 = tVar.f24639b[i15];
            Logger logger2 = l.f24599e;
            i14 += 4;
        }
        lVar.r0(i14);
        while (i11 < 0) {
            tVar.h(i11);
            lVar.k0(Float.floatToRawIntBits(tVar.f24639b[i11]));
            i11++;
        }
    }

    public static void s(int i10, List list, k0 k0Var, boolean z10) throws m {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) k0Var.f24598a;
        int i11 = 0;
        if (!(list instanceof y)) {
            if (!z10) {
                while (i11 < list.size()) {
                    lVar.n0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            lVar.p0(i10, 2);
            int iG0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG0 += l.g0(((Integer) list.get(i12)).intValue());
            }
            lVar.r0(iG0);
            while (i11 < list.size()) {
                lVar.o0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        y yVar = (y) list;
        if (!z10) {
            while (i11 < 0) {
                lVar.n0(i10, yVar.getInt(i11));
                i11++;
            }
            return;
        }
        lVar.p0(i10, 2);
        int iG1 = 0;
        for (int i13 = 0; i13 < 0; i13++) {
            iG1 += l.g0(yVar.getInt(i13));
        }
        lVar.r0(iG1);
        while (i11 < 0) {
            lVar.o0(yVar.getInt(i11));
            i11++;
        }
    }

    public static void t(int i10, List list, k0 k0Var, boolean z10) throws m {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) k0Var.f24598a;
        int i11 = 0;
        if (!(list instanceof i0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    lVar.s0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            lVar.p0(i10, 2);
            int iG0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG0 += l.g0(((Long) list.get(i12)).longValue());
            }
            lVar.r0(iG0);
            while (i11 < list.size()) {
                lVar.t0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        i0 i0Var = (i0) list;
        if (!z10) {
            while (i11 < 0) {
                lVar.s0(i10, i0Var.getLong(i11));
                i11++;
            }
            return;
        }
        lVar.p0(i10, 2);
        int iG1 = 0;
        for (int i13 = 0; i13 < 0; i13++) {
            iG1 += l.g0(i0Var.getLong(i13));
        }
        lVar.r0(iG1);
        while (i11 < 0) {
            lVar.t0(i0Var.getLong(i11));
            i11++;
        }
    }

    public static void u(int i10, List list, k0 k0Var, boolean z10) throws m {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) k0Var.f24598a;
        int i11 = 0;
        if (!(list instanceof y)) {
            if (!z10) {
                while (i11 < list.size()) {
                    lVar.j0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            lVar.p0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                Logger logger = l.f24599e;
                i12 += 4;
            }
            lVar.r0(i12);
            while (i11 < list.size()) {
                lVar.k0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        y yVar = (y) list;
        if (!z10) {
            while (i11 < 0) {
                lVar.j0(i10, yVar.getInt(i11));
                i11++;
            }
            return;
        }
        lVar.p0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < 0; i15++) {
            yVar.getInt(i15);
            Logger logger2 = l.f24599e;
            i14 += 4;
        }
        lVar.r0(i14);
        while (i11 < 0) {
            lVar.k0(yVar.getInt(i11));
            i11++;
        }
    }

    public static void v(int i10, List list, k0 k0Var, boolean z10) throws m {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) k0Var.f24598a;
        int i11 = 0;
        if (!(list instanceof i0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    lVar.l0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            lVar.p0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                Logger logger = l.f24599e;
                i12 += 8;
            }
            lVar.r0(i12);
            while (i11 < list.size()) {
                lVar.m0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        i0 i0Var = (i0) list;
        if (!z10) {
            while (i11 < 0) {
                lVar.l0(i10, i0Var.getLong(i11));
                i11++;
            }
            return;
        }
        lVar.p0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < 0; i15++) {
            i0Var.getLong(i15);
            Logger logger2 = l.f24599e;
            i14 += 8;
        }
        lVar.r0(i14);
        while (i11 < 0) {
            lVar.m0(i0Var.getLong(i11));
            i11++;
        }
    }

    public static void w(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) k0Var.f24598a;
        int i11 = 0;
        if (!(list instanceof y)) {
            if (!z10) {
                while (i11 < list.size()) {
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    lVar.q0(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                    i11++;
                }
                return;
            }
            lVar.p0(i10, 2);
            int iB0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iB0 += l.b0(((Integer) list.get(i12)).intValue());
            }
            lVar.r0(iB0);
            while (i11 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                lVar.r0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i11++;
            }
            return;
        }
        y yVar = (y) list;
        if (!z10) {
            while (i11 < 0) {
                int i13 = yVar.getInt(i11);
                lVar.q0(i10, (i13 >> 31) ^ (i13 << 1));
                i11++;
            }
            return;
        }
        lVar.p0(i10, 2);
        int iB1 = 0;
        for (int i14 = 0; i14 < 0; i14++) {
            iB1 += l.b0(yVar.getInt(i14));
        }
        lVar.r0(iB1);
        while (i11 < 0) {
            int i15 = yVar.getInt(i11);
            lVar.r0((i15 >> 31) ^ (i15 << 1));
            i11++;
        }
    }

    public static void x(int i10, List list, k0 k0Var, boolean z10) throws m {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) k0Var.f24598a;
        int i11 = 0;
        if (!(list instanceof i0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    lVar.s0(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                    i11++;
                }
                return;
            }
            lVar.p0(i10, 2);
            int iC0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iC0 += l.c0(((Long) list.get(i12)).longValue());
            }
            lVar.r0(iC0);
            while (i11 < list.size()) {
                long jLongValue2 = ((Long) list.get(i11)).longValue();
                lVar.t0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i11++;
            }
            return;
        }
        i0 i0Var = (i0) list;
        if (!z10) {
            while (i11 < 0) {
                long j10 = i0Var.getLong(i11);
                lVar.s0(i10, (j10 >> 63) ^ (j10 << 1));
                i11++;
            }
            return;
        }
        lVar.p0(i10, 2);
        int iC1 = 0;
        for (int i13 = 0; i13 < 0; i13++) {
            iC1 += l.c0(i0Var.getLong(i13));
        }
        lVar.r0(iC1);
        while (i11 < 0) {
            long j11 = i0Var.getLong(i11);
            lVar.t0((j11 >> 63) ^ (j11 << 1));
            i11++;
        }
    }

    public static void y(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) k0Var.f24598a;
        int i11 = 0;
        if (!(list instanceof y)) {
            if (!z10) {
                while (i11 < list.size()) {
                    lVar.q0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            lVar.p0(i10, 2);
            int iF0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iF0 += l.f0(((Integer) list.get(i12)).intValue());
            }
            lVar.r0(iF0);
            while (i11 < list.size()) {
                lVar.r0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        y yVar = (y) list;
        if (!z10) {
            while (i11 < 0) {
                lVar.q0(i10, yVar.getInt(i11));
                i11++;
            }
            return;
        }
        lVar.p0(i10, 2);
        int iF1 = 0;
        for (int i13 = 0; i13 < 0; i13++) {
            iF1 += l.f0(yVar.getInt(i13));
        }
        lVar.r0(iF1);
        while (i11 < 0) {
            lVar.r0(yVar.getInt(i11));
            i11++;
        }
    }

    public static void z(int i10, List list, k0 k0Var, boolean z10) throws m {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) k0Var.f24598a;
        int i11 = 0;
        if (!(list instanceof i0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    lVar.s0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            lVar.p0(i10, 2);
            int iG0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG0 += l.g0(((Long) list.get(i12)).longValue());
            }
            lVar.r0(iG0);
            while (i11 < list.size()) {
                lVar.t0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        i0 i0Var = (i0) list;
        if (!z10) {
            while (i11 < 0) {
                lVar.s0(i10, i0Var.getLong(i11));
                i11++;
            }
            return;
        }
        lVar.p0(i10, 2);
        int iG1 = 0;
        for (int i13 = 0; i13 < 0; i13++) {
            iG1 += l.g0(i0Var.getLong(i13));
        }
        lVar.r0(iG1);
        while (i11 < 0) {
            lVar.t0(i0Var.getLong(i11));
            i11++;
        }
    }

    public static Object j(Object obj, int i10, a0 a0Var, Object obj2, d1 d1Var) {
        return obj2;
    }
}

package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6 f23209a;

    static {
        int i10 = k5.f23071a;
        f23209a = new y6();
    }

    public static void a(int i10, List list, g6 g6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o5 o5Var = (o5) g6Var.f23023b;
        int i11 = 0;
        if (!(list instanceof x5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    o5Var.A(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            o5Var.z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int iIntValue2 = ((Integer) list.get(i13)).intValue();
                i12 += o5.i((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            o5Var.B(i12);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                o5Var.B((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        x5 x5Var = (x5) list;
        if (!z10) {
            while (i11 < x5Var.f23269c) {
                int iH = x5Var.h(i11);
                o5Var.A(i10, (iH >> 31) ^ (iH + iH));
                i11++;
            }
            return;
        }
        o5Var.z(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < x5Var.f23269c; i15++) {
            int iH2 = x5Var.h(i15);
            i14 += o5.i((iH2 >> 31) ^ (iH2 + iH2));
        }
        o5Var.B(i14);
        while (i11 < x5Var.f23269c) {
            int iH3 = x5Var.h(i11);
            o5Var.B((iH3 >> 31) ^ (iH3 + iH3));
            i11++;
        }
    }

    public static void b(int i10, List list, g6 g6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o5 o5Var = (o5) g6Var.f23023b;
        if (list instanceof f6) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                o5Var.C(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        o5Var.z(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iJ += o5.j((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        o5Var.B(iJ);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            o5Var.D((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    public static void c(int i10, List list, g6 g6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o5 o5Var = (o5) g6Var.f23023b;
        int i11 = 0;
        if (!(list instanceof x5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    o5Var.A(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            o5Var.z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += o5.i(((Integer) list.get(i13)).intValue());
            }
            o5Var.B(i12);
            while (i11 < list.size()) {
                o5Var.B(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        x5 x5Var = (x5) list;
        if (!z10) {
            while (i11 < x5Var.f23269c) {
                o5Var.A(i10, x5Var.h(i11));
                i11++;
            }
            return;
        }
        o5Var.z(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < x5Var.f23269c; i15++) {
            i14 += o5.i(x5Var.h(i15));
        }
        o5Var.B(i14);
        while (i11 < x5Var.f23269c) {
            o5Var.B(x5Var.h(i11));
            i11++;
        }
    }

    public static void d(int i10, List list, g6 g6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o5 o5Var = (o5) g6Var.f23023b;
        if (list instanceof f6) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                o5Var.C(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        o5Var.z(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += o5.j(((Long) list.get(i12)).longValue());
        }
        o5Var.B(iJ);
        while (i11 < list.size()) {
            o5Var.D(((Long) list.get(i11)).longValue());
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
        if (!(list instanceof x5)) {
            int iJ = 0;
            while (i10 < size) {
                iJ += o5.j(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iJ;
        }
        x5 x5Var = (x5) list;
        int iJ2 = 0;
        while (i10 < size) {
            iJ2 += o5.j(x5Var.h(i10));
            i10++;
        }
        return iJ2;
    }

    public static int g(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o5.i(i10 << 3) + 4) * size;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o5.i(i10 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x5)) {
            int iJ = 0;
            while (i10 < size) {
                iJ += o5.j(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iJ;
        }
        x5 x5Var = (x5) list;
        int iJ2 = 0;
        while (i10 < size) {
            iJ2 += o5.j(x5Var.h(i10));
            i10++;
        }
        return iJ2;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof f6) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iJ += o5.j(((Long) list.get(i10)).longValue());
        }
        return iJ;
    }

    public static int k(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x5)) {
            int i11 = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                i11 += o5.i((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return i11;
        }
        x5 x5Var = (x5) list;
        int i12 = 0;
        while (i10 < size) {
            int iH = x5Var.h(i10);
            i12 += o5.i((iH >> 31) ^ (iH + iH));
            i10++;
        }
        return i12;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof f6) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iJ += o5.j((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iJ;
    }

    public static int m(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += o5.i(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        x5 x5Var = (x5) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += o5.i(x5Var.h(i10));
            i10++;
        }
        return i12;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof f6) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iJ += o5.j(((Long) list.get(i10)).longValue());
        }
        return iJ;
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
    public static void o(Object obj, Object obj2) {
        w5 w5Var = (w5) obj;
        x6 x6Var = w5Var.zzc;
        x6 x6Var2 = ((w5) obj2).zzc;
        x6 x6Var3 = x6.f23270e;
        if (!x6Var3.equals(x6Var2)) {
            if (x6Var3.equals(x6Var)) {
                x6Var.getClass();
                x6Var2.getClass();
                int[] iArrCopyOf = Arrays.copyOf(x6Var.f23271a, 0);
                System.arraycopy(x6Var2.f23271a, 0, iArrCopyOf, 0, 0);
                Object[] objArrCopyOf = Arrays.copyOf(x6Var.f23272b, 0);
                System.arraycopy(x6Var2.f23272b, 0, objArrCopyOf, 0, 0);
                x6Var = new x6(iArrCopyOf, objArrCopyOf, true);
            } else {
                x6Var.getClass();
                if (!x6Var2.equals(x6Var3)) {
                    if (!x6Var.f23274d) {
                        throw new UnsupportedOperationException();
                    }
                    int[] iArr = x6Var.f23271a;
                    int length = iArr.length;
                    System.arraycopy(x6Var2.f23271a, 0, iArr, 0, 0);
                    System.arraycopy(x6Var2.f23272b, 0, x6Var.f23272b, 0, 0);
                }
            }
        }
        w5Var.zzc = x6Var;
    }

    public static void p(int i10, List list, g6 g6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o5 o5Var = (o5) g6Var.f23023b;
        if (list instanceof l5) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                byte bBooleanValue = ((Boolean) list.get(i11)).booleanValue();
                o5Var.l(11);
                o5Var.o(i10 << 3);
                byte[] bArr = o5Var.f23153c;
                int i12 = o5Var.f23155e;
                bArr[i12] = bBooleanValue;
                o5Var.f23155e = i12 + 1;
                i11++;
            }
            return;
        }
        o5Var.z(i10, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Boolean) list.get(i14)).getClass();
            i13++;
        }
        o5Var.B(i13);
        while (i11 < list.size()) {
            byte bBooleanValue2 = ((Boolean) list.get(i11)).booleanValue();
            if (o5Var.f23155e == o5Var.f23154d) {
                o5Var.k();
            }
            byte[] bArr2 = o5Var.f23153c;
            int i15 = o5Var.f23155e;
            bArr2[i15] = bBooleanValue2;
            o5Var.f23155e = i15 + 1;
            i11++;
        }
    }

    public static void q(int i10, List list, g6 g6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o5 o5Var = (o5) g6Var.f23023b;
        if (list instanceof p5) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                o5Var.u(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        o5Var.z(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        o5Var.B(i12);
        while (i11 < list.size()) {
            o5Var.v(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void r(int i10, List list, g6 g6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o5 o5Var = (o5) g6Var.f23023b;
        int i11 = 0;
        if (!(list instanceof x5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    o5Var.w(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            o5Var.z(i10, 2);
            int iJ = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iJ += o5.j(((Integer) list.get(i12)).intValue());
            }
            o5Var.B(iJ);
            while (i11 < list.size()) {
                o5Var.x(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        x5 x5Var = (x5) list;
        if (!z10) {
            while (i11 < x5Var.f23269c) {
                o5Var.w(i10, x5Var.h(i11));
                i11++;
            }
            return;
        }
        o5Var.z(i10, 2);
        int iJ2 = 0;
        for (int i13 = 0; i13 < x5Var.f23269c; i13++) {
            iJ2 += o5.j(x5Var.h(i13));
        }
        o5Var.B(iJ2);
        while (i11 < x5Var.f23269c) {
            o5Var.x(x5Var.h(i11));
            i11++;
        }
    }

    public static void s(int i10, List list, g6 g6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o5 o5Var = (o5) g6Var.f23023b;
        int i11 = 0;
        if (!(list instanceof x5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    o5Var.s(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            o5Var.z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            o5Var.B(i12);
            while (i11 < list.size()) {
                o5Var.t(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        x5 x5Var = (x5) list;
        if (!z10) {
            while (i11 < x5Var.f23269c) {
                o5Var.s(i10, x5Var.h(i11));
                i11++;
            }
            return;
        }
        o5Var.z(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < x5Var.f23269c; i15++) {
            x5Var.h(i15);
            i14 += 4;
        }
        o5Var.B(i14);
        while (i11 < x5Var.f23269c) {
            o5Var.t(x5Var.h(i11));
            i11++;
        }
    }

    public static void t(int i10, List list, g6 g6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o5 o5Var = (o5) g6Var.f23023b;
        if (list instanceof f6) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                o5Var.u(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        o5Var.z(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        o5Var.B(i12);
        while (i11 < list.size()) {
            o5Var.v(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void u(int i10, List list, g6 g6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o5 o5Var = (o5) g6Var.f23023b;
        if (list instanceof u5) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                o5Var.s(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        o5Var.z(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        o5Var.B(i12);
        while (i11 < list.size()) {
            o5Var.t(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void v(int i10, List list, g6 g6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o5 o5Var = (o5) g6Var.f23023b;
        int i11 = 0;
        if (!(list instanceof x5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    o5Var.w(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            o5Var.z(i10, 2);
            int iJ = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iJ += o5.j(((Integer) list.get(i12)).intValue());
            }
            o5Var.B(iJ);
            while (i11 < list.size()) {
                o5Var.x(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        x5 x5Var = (x5) list;
        if (!z10) {
            while (i11 < x5Var.f23269c) {
                o5Var.w(i10, x5Var.h(i11));
                i11++;
            }
            return;
        }
        o5Var.z(i10, 2);
        int iJ2 = 0;
        for (int i13 = 0; i13 < x5Var.f23269c; i13++) {
            iJ2 += o5.j(x5Var.h(i13));
        }
        o5Var.B(iJ2);
        while (i11 < x5Var.f23269c) {
            o5Var.x(x5Var.h(i11));
            i11++;
        }
    }

    public static void w(int i10, List list, g6 g6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o5 o5Var = (o5) g6Var.f23023b;
        if (list instanceof f6) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                o5Var.C(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        o5Var.z(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += o5.j(((Long) list.get(i12)).longValue());
        }
        o5Var.B(iJ);
        while (i11 < list.size()) {
            o5Var.D(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void x(int i10, List list, g6 g6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o5 o5Var = (o5) g6Var.f23023b;
        int i11 = 0;
        if (!(list instanceof x5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    o5Var.s(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            o5Var.z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            o5Var.B(i12);
            while (i11 < list.size()) {
                o5Var.t(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        x5 x5Var = (x5) list;
        if (!z10) {
            while (i11 < x5Var.f23269c) {
                o5Var.s(i10, x5Var.h(i11));
                i11++;
            }
            return;
        }
        o5Var.z(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < x5Var.f23269c; i15++) {
            x5Var.h(i15);
            i14 += 4;
        }
        o5Var.B(i14);
        while (i11 < x5Var.f23269c) {
            o5Var.t(x5Var.h(i11));
            i11++;
        }
    }

    public static void y(int i10, List list, g6 g6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o5 o5Var = (o5) g6Var.f23023b;
        if (list instanceof f6) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                o5Var.u(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        o5Var.z(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        o5Var.B(i12);
        while (i11 < list.size()) {
            o5Var.v(((Long) list.get(i11)).longValue());
            i11++;
        }
    }
}

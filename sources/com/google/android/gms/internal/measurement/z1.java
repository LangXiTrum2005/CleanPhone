package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9.k f24191a;

    public z1(c3 c3Var, c3 c3Var2, Object obj) {
        this.f24191a = new g9.k(c3Var, c3Var2, obj, 6);
    }

    public static void a(x0 x0Var, g9.k kVar, Object obj, Object obj2) {
        b1.b(x0Var, (c3) kVar.f41770b, 1, obj);
        b1.b(x0Var, (c3) kVar.f41771c, 2, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:46:0x012a  */
    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    /* JADX WARN: Code duplicated, block: B:48:0x014b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0152  */
    /* JADX WARN: Code duplicated, block: B:51:0x015a  */
    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:54:0x016b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0178  */
    /* JADX WARN: Code duplicated, block: B:56:0x0184  */
    /* JADX WARN: Code duplicated, block: B:58:0x0188  */
    /* JADX WARN: Code duplicated, block: B:60:0x0196  */
    /* JADX WARN: Code duplicated, block: B:61:0x019e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0204  */
    /* JADX WARN: Code duplicated, block: B:74:0x020b  */
    public static int b(g9.k kVar, Object obj, Object obj2) {
        int iQ;
        int iB;
        int iP;
        int i10;
        int iP2;
        int iB2;
        int iP3;
        c3 c3Var = (c3) kVar.f41770b;
        c3 c3Var2 = (c3) kVar.f41771c;
        int i11 = b1.f23309c;
        int iQ2 = 8;
        int iP4 = x0.p(8);
        c3 c3Var3 = c3.f23343d;
        if (c3Var == c3Var3) {
            iP4 += iP4;
        }
        d3 d3Var = d3.f23371a;
        switch (c3Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iQ = 8;
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue >> 31) ^ (iIntValue + iIntValue));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue >> 63) ^ (jLongValue + jLongValue));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iQ = 4;
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iQ = x0.q(((Long) obj).longValue());
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iQ = x0.q(((Long) obj).longValue());
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue4 >> 63) ^ (jLongValue4 + jLongValue4));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iQ = x0.q(((Integer) obj).intValue());
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue5 >> 63) ^ (jLongValue5 + jLongValue5));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 5:
                ((Long) obj).getClass();
                iQ = 8;
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue6 >> 63) ^ (jLongValue6 + jLongValue6));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 6:
                ((Integer) obj).getClass();
                iQ = 4;
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue7 >> 63) ^ (jLongValue7 + jLongValue7));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 7:
                ((Boolean) obj).getClass();
                iQ = 1;
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue8 >> 63) ^ (jLongValue8 + jLongValue8));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                if (obj instanceof s0) {
                    iB = ((s0) obj).h();
                    iP = x0.p(iB);
                } else {
                    iB = b3.b((String) obj);
                    iP = x0.p(iB);
                }
                iQ = iB + iP;
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue9 >> 63) ^ (jLongValue9 + jLongValue9));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iQ = ((i1) ((l0) obj)).n();
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue10 >> 63) ^ (jLongValue10 + jLongValue10));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                iB = ((i1) ((l0) obj)).n();
                iP = x0.p(iB);
                iQ = iB + iP;
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue11 >> 63) ^ (jLongValue11 + jLongValue11));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 11:
                if (obj instanceof s0) {
                    iB = ((s0) obj).h();
                    iP = x0.p(iB);
                } else {
                    iB = ((byte[]) obj).length;
                    iP = x0.p(iB);
                }
                iQ = iB + iP;
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue12 >> 63) ^ (jLongValue12 + jLongValue12));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                iQ = x0.p(((Integer) obj).intValue());
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue13 >> 63) ^ (jLongValue13 + jLongValue13));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 13:
                iQ = obj instanceof k1 ? x0.q(((k1) obj).zza()) : x0.q(((Integer) obj).intValue());
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue14 >> 63) ^ (jLongValue14 + jLongValue14));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iQ = 4;
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue15 >> 63) ^ (jLongValue15 + jLongValue15));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iQ = 8;
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue16 >> 63) ^ (jLongValue16 + jLongValue16));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iQ = x0.p((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue17 >> 63) ^ (jLongValue17 + jLongValue17));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iQ = x0.q((jLongValue18 >> 63) ^ (jLongValue18 + jLongValue18));
                i10 = iQ + iP4;
                iP2 = x0.p(16);
                if (c3Var2 == c3Var3) {
                    iP2 += iP2;
                }
                switch (c3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 2:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 3:
                        iQ2 = x0.q(((Long) obj2).longValue());
                        return iQ2 + iP2 + i10;
                    case 4:
                        iQ2 = x0.q(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iQ2 = 1;
                        return iQ2 + iP2 + i10;
                    case 8:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = b3.b((String) obj2);
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 9:
                        iQ2 = ((i1) ((l0) obj2)).n();
                        return iQ2 + iP2 + i10;
                    case 10:
                        iB2 = ((i1) ((l0) obj2)).n();
                        iP3 = x0.p(iB2);
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 11:
                        if (obj2 instanceof s0) {
                            iB2 = ((s0) obj2).h();
                            iP3 = x0.p(iB2);
                        } else {
                            iB2 = ((byte[]) obj2).length;
                            iP3 = x0.p(iB2);
                        }
                        iQ2 = iP3 + iB2;
                        return iQ2 + iP2 + i10;
                    case 12:
                        iQ2 = x0.p(((Integer) obj2).intValue());
                        return iQ2 + iP2 + i10;
                    case 13:
                        if (obj2 instanceof k1) {
                            iQ2 = x0.q(((k1) obj2).zza());
                        } else {
                            iQ2 = x0.q(((Integer) obj2).intValue());
                        }
                        return iQ2 + iP2 + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iQ2 = 4;
                        return iQ2 + iP2 + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        return iQ2 + iP2 + i10;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iQ2 = x0.p((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                        return iQ2 + iP2 + i10;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iQ2 = x0.q((jLongValue19 >> 63) ^ (jLongValue19 + jLongValue19));
                        return iQ2 + iP2 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public final g9.k c() {
        return this.f24191a;
    }
}

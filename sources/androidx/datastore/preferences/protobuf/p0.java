package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f4151a;

    public p0(y1 y1Var, y1 y1Var2, v0.j jVar) {
        this.f4151a = new o0(y1Var, y1Var2, jVar);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0100  */
    /* JADX WARN: Code duplicated, block: B:41:0x0109  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0120  */
    /* JADX WARN: Code duplicated, block: B:45:0x0131  */
    /* JADX WARN: Code duplicated, block: B:47:0x0139  */
    /* JADX WARN: Code duplicated, block: B:49:0x0141  */
    /* JADX WARN: Code duplicated, block: B:50:0x014e  */
    /* JADX WARN: Code duplicated, block: B:51:0x015a  */
    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:55:0x016c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0174  */
    /* JADX WARN: Code duplicated, block: B:57:0x0181  */
    /* JADX WARN: Code duplicated, block: B:58:0x018a  */
    /* JADX WARN: Code duplicated, block: B:60:0x018e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0199  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01be  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01db  */
    public static int a(o0 o0Var, Object obj, Object obj2) {
        int iV;
        int size;
        int iU;
        int i10;
        y1 y1Var;
        int iT;
        int size2;
        int iU2;
        y1 y1Var2 = o0Var.f4141a;
        int i11 = v.f4172c;
        int iV2 = 1;
        int iT2 = p.T(1);
        v1 v1Var = y1.f4202d;
        if (y1Var2 == v1Var) {
            iT2 *= 2;
        }
        switch (y1Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iV = 8;
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue >> 31) ^ (iIntValue << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue >> 63) ^ (jLongValue << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iV = 4;
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iV = p.V(((Long) obj).longValue());
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iV = p.V(((Long) obj).longValue());
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iV = p.V(((Integer) obj).intValue());
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 5:
                ((Long) obj).getClass();
                iV = 8;
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 6:
                ((Integer) obj).getClass();
                iV = 4;
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 7:
                ((Boolean) obj).getClass();
                iV = 1;
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                if (obj instanceof j) {
                    size = ((j) obj).size();
                    iU = p.U(size);
                    iV = size + iU;
                } else {
                    iV = p.S((String) obj);
                }
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iV = ((b0) ((a) obj)).a(null);
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                size = ((b0) ((a) obj)).a(null);
                iU = p.U(size);
                iV = size + iU;
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 11:
                if (obj instanceof j) {
                    size = ((j) obj).size();
                    iU = p.U(size);
                } else {
                    size = ((byte[]) obj).length;
                    iU = p.U(size);
                }
                iV = size + iU;
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                iV = p.U(((Integer) obj).intValue());
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 13:
                iV = p.V(((Integer) obj).intValue());
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iV = 4;
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iV = 8;
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iV = p.U((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iV = p.V((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i10 = iV + iT2;
                y1Var = o0Var.f4142b;
                iT = p.T(2);
                if (y1Var == v1Var) {
                    iT *= 2;
                }
                switch (y1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 2:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 3:
                        iV2 = p.V(((Long) obj2).longValue());
                        return iV2 + iT + i10;
                    case 4:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iV2 + iT + i10;
                    case 8:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                            iV2 = iU2 + size2;
                        } else {
                            iV2 = p.S((String) obj2);
                        }
                        return iV2 + iT + i10;
                    case 9:
                        iV2 = ((b0) ((a) obj2)).a(null);
                        return iV2 + iT + i10;
                    case 10:
                        size2 = ((b0) ((a) obj2)).a(null);
                        iU2 = p.U(size2);
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 11:
                        if (obj2 instanceof j) {
                            size2 = ((j) obj2).size();
                            iU2 = p.U(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iU2 = p.U(size2);
                        }
                        iV2 = iU2 + size2;
                        return iV2 + iT + i10;
                    case 12:
                        iV2 = p.U(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 13:
                        iV2 = p.V(((Integer) obj2).intValue());
                        return iV2 + iT + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iV2 = 4;
                        return iV2 + iT + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iV2 = 8;
                        return iV2 + iT + i10;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iV2 = p.U((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iV2 + iT + i10;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iV2 = p.V((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iV2 + iT + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}

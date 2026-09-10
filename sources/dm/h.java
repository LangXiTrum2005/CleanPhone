package dm;

import cl.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {
    public static b a(List list, zk.w wVar, wk.j jVar) {
        List listN0 = xj.n.N0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listN0.iterator();
        while (it.hasNext()) {
            g gVarB = b(null, it.next());
            if (gVarB != null) {
                arrayList.add(gVarB);
            }
        }
        return wVar != null ? new x(arrayList, wVar.d().q(jVar)) : new b(arrayList, new al.f(jVar, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [xj.v] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public static g b(f0 f0Var, Object obj) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new v(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new k(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new t(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e((Character) obj);
        }
        if (obj instanceof Float) {
            return new c(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new c(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c((Boolean) obj);
        }
        if (obj instanceof String) {
            return new w((String) obj);
        }
        if (obj instanceof byte[]) {
            return a(xj.k.B0((byte[]) obj), f0Var, wk.j.BYTE);
        }
        boolean z10 = obj instanceof short[];
        ?? C = xj.v.f53866a;
        int i10 = 0;
        if (z10) {
            short[] sArr = (short[]) obj;
            int length = sArr.length;
            if (length != 0) {
                if (length != 1) {
                    C = new ArrayList(sArr.length);
                    int length2 = sArr.length;
                    while (i10 < length2) {
                        C.add(Short.valueOf(sArr[i10]));
                        i10++;
                    }
                } else {
                    C = j1.f.C(Short.valueOf(sArr[0]));
                }
            }
            return a(C, f0Var, wk.j.SHORT);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    C = new ArrayList(iArr.length);
                    int length4 = iArr.length;
                    while (i10 < length4) {
                        C.add(Integer.valueOf(iArr[i10]));
                        i10++;
                    }
                } else {
                    C = j1.f.C(Integer.valueOf(iArr[0]));
                }
            }
            return a(C, f0Var, wk.j.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length5 = jArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    C = new ArrayList(jArr.length);
                    int length6 = jArr.length;
                    while (i10 < length6) {
                        C.add(Long.valueOf(jArr[i10]));
                        i10++;
                    }
                } else {
                    C = j1.f.C(Long.valueOf(jArr[0]));
                }
            }
            return a(C, f0Var, wk.j.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length7 = cArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    C = new ArrayList(cArr.length);
                    int length8 = cArr.length;
                    while (i10 < length8) {
                        C.add(Character.valueOf(cArr[i10]));
                        i10++;
                    }
                } else {
                    C = j1.f.C(Character.valueOf(cArr[0]));
                }
            }
            return a(C, f0Var, wk.j.CHAR);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length9 = fArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    C = new ArrayList(fArr.length);
                    int length10 = fArr.length;
                    while (i10 < length10) {
                        C.add(Float.valueOf(fArr[i10]));
                        i10++;
                    }
                } else {
                    C = j1.f.C(Float.valueOf(fArr[0]));
                }
            }
            return a(C, f0Var, wk.j.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length11 = dArr.length;
            if (length11 != 0) {
                if (length11 != 1) {
                    C = new ArrayList(dArr.length);
                    int length12 = dArr.length;
                    while (i10 < length12) {
                        C.add(Double.valueOf(dArr[i10]));
                        i10++;
                    }
                } else {
                    C = j1.f.C(Double.valueOf(dArr[0]));
                }
            }
            return a(C, f0Var, wk.j.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new u(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        int length13 = zArr.length;
        if (length13 != 0) {
            if (length13 != 1) {
                C = new ArrayList(zArr.length);
                int length14 = zArr.length;
                while (i10 < length14) {
                    C.add(Boolean.valueOf(zArr[i10]));
                    i10++;
                }
            } else {
                C = j1.f.C(Boolean.valueOf(zArr[0]));
            }
        }
        return a(C, f0Var, wk.j.BOOLEAN);
    }
}

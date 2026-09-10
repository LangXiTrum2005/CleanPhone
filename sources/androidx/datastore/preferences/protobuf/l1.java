package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {
    public static k1 a(Object obj) {
        b0 b0Var = (b0) obj;
        k1 k1Var = b0Var.unknownFields;
        if (k1Var != k1.f4116f) {
            return k1Var;
        }
        k1 k1Var2 = new k1(0, new int[8], new Object[8], true);
        b0Var.unknownFields = k1Var2;
        return k1Var2;
    }

    public static boolean b(int i10, n nVar, Object obj) throws com.google.crypto.tink.shaded.protobuf.c0, g0 {
        m mVar = (m) nVar.f4137e;
        int i11 = nVar.f4134b;
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            nVar.T(0);
            ((k1) obj).c(i12 << 3, Long.valueOf(mVar.r()));
            return true;
        }
        if (i13 == 1) {
            nVar.T(1);
            ((k1) obj).c((i12 << 3) | 1, Long.valueOf(mVar.o()));
            return true;
        }
        if (i13 == 2) {
            ((k1) obj).c((i12 << 3) | 2, nVar.l());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw g0.g();
            }
            nVar.T(5);
            ((k1) obj).c(5 | (i12 << 3), Integer.valueOf(mVar.n()));
            return true;
        }
        k1 k1Var = new k1(0, new int[8], new Object[8], true);
        int i14 = i12 << 3;
        int i15 = i14 | 4;
        int i16 = i10 + 1;
        if (i16 >= 100) {
            throw new g0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (nVar.d() != Integer.MAX_VALUE && b(i16, nVar, k1Var)) {
        }
        if (i15 != nVar.f4134b) {
            throw new g0("Protocol message end-group tag did not match expected tag.");
        }
        if (k1Var.f4121e) {
            k1Var.f4121e = false;
        }
        ((k1) obj).c(i14 | 3, k1Var);
        return true;
    }
}

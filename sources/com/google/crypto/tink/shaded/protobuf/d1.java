package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 {
    public static c1 a(Object obj) {
        x xVar = (x) obj;
        c1 c1Var = xVar.unknownFields;
        if (c1Var != c1.f24543f) {
            return c1Var;
        }
        c1 c1VarC = c1.c();
        xVar.unknownFields = c1VarC;
        return c1VarC;
    }

    public static boolean b(int i10, androidx.datastore.preferences.protobuf.n nVar, Object obj) throws d0, androidx.datastore.preferences.protobuf.f0 {
        androidx.datastore.preferences.protobuf.m mVar = (androidx.datastore.preferences.protobuf.m) nVar.f4137e;
        int i11 = nVar.f4134b;
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            nVar.T(0);
            ((c1) obj).d(i12 << 3, Long.valueOf(mVar.r()));
            return true;
        }
        if (i13 == 1) {
            nVar.T(1);
            ((c1) obj).d((i12 << 3) | 1, Long.valueOf(mVar.o()));
            return true;
        }
        if (i13 == 2) {
            ((c1) obj).d((i12 << 3) | 2, nVar.m());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw new d0("Protocol message end-group tag did not match expected tag.");
            }
            if (i13 != 5) {
                throw d0.h();
            }
            nVar.T(5);
            ((c1) obj).d(5 | (i12 << 3), Integer.valueOf(mVar.n()));
            return true;
        }
        c1 c1VarC = c1.c();
        int i14 = i12 << 3;
        int i15 = i14 | 4;
        int i16 = i10 + 1;
        if (i16 >= 100) {
            throw new d0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (nVar.d() != Integer.MAX_VALUE && b(i16, nVar, c1VarC)) {
        }
        if (i15 != nVar.f4134b) {
            throw new d0("Protocol message end-group tag did not match expected tag.");
        }
        if (c1VarC.f24548e) {
            c1VarC.f24548e = false;
        }
        ((c1) obj).d(i14 | 3, c1VarC);
        return true;
    }
}

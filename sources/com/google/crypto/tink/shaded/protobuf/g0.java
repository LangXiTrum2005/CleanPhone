package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 {
    public static a0 a(long j10, Object obj) {
        a0 a0Var = (a0) i1.f24575c.i(j10, obj);
        if (((b) a0Var).f24538a) {
            return a0Var;
        }
        int size = a0Var.size();
        a0 a0VarMutableCopyWithCapacity = a0Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        i1.p(obj, j10, a0VarMutableCopyWithCapacity);
        return a0VarMutableCopyWithCapacity;
    }
}

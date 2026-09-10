package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface h3 {
    default void b(int i10, np0 np0Var) {
        g(np0Var, i10, 0);
    }

    void c(long j10, int i10, int i11, int i12, g3 g3Var);

    int d(vx1 vx1Var, int i10, boolean z10);

    default int e(vx1 vx1Var, int i10, boolean z10) {
        return d(vx1Var, i10, z10);
    }

    void f(g22 g22Var);

    void g(np0 np0Var, int i10, int i11);
}

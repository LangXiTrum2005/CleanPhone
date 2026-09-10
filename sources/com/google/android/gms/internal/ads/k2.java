package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f16276a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.h3
    public final int d(vx1 vx1Var, int i10, boolean z10) throws EOFException {
        int iT = vx1Var.t(this.f16276a, 0, Math.min(4096, i10));
        if (iT != -1) {
            return iT;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.h3
    public final void g(np0 np0Var, int i10, int i11) {
        np0Var.G(i10);
    }

    @Override // com.google.android.gms.internal.ads.h3
    public final void f(g22 g22Var) {
    }

    @Override // com.google.android.gms.internal.ads.h3
    public final void c(long j10, int i10, int i11, int i12, g3 g3Var) {
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class is1 extends gc1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f15840b = nu1.f17983d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z61 f15841a;

    public static int p(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int q(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public abstract void A(int i10, cs1 cs1Var);

    public abstract void B(cs1 cs1Var);

    public abstract void C(int i10, byte[] bArr);

    public abstract void D(rr1 rr1Var);

    public abstract void E(byte b10);

    public abstract void F(int i10);

    public abstract void G(int i10);

    public abstract void H(int i10);

    public abstract void I(long j10);

    public abstract void J(long j10);

    public abstract void K(String str);

    public abstract int L();

    public final void r() {
        if (L() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (L() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract void s(int i10, int i11);

    public abstract void t(int i10, int i11);

    public abstract void u(int i10, int i11);

    public abstract void v(int i10, int i11);

    public abstract void w(int i10, long j10);

    public abstract void x(int i10, long j10);

    public abstract void y(int i10, boolean z10);

    public abstract void z(int i10, String str);
}

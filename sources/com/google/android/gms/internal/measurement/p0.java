package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f23828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23830e;

    public p0(byte[] bArr, int i10, int i11) {
        s0.v(i10, i10 + i11, bArr.length);
        this.f23828c = bArr;
        this.f23829d = i10;
        this.f23830e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final byte b(int i10) {
        return this.f23828c[this.f23829d + i10];
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final int h() {
        return this.f23830e;
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final q0 m(int i10, int i11) {
        int iV = s0.v(i10, i11, this.f23830e);
        if (iV == 0) {
            return s0.f23949b;
        }
        return new p0(this.f23828c, this.f23829d + i10, iV);
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final void n(int i10, byte[] bArr) {
        System.arraycopy(this.f23828c, this.f23829d, bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final void p(x0 x0Var) {
        x0Var.d(this.f23828c, this.f23829d, this.f23830e);
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final boolean q(s0 s0Var) {
        boolean z10 = s0Var instanceof r0;
        if (!z10 && !(s0Var instanceof p0)) {
            return s0Var.q(this);
        }
        int iH = s0Var.h();
        int i10 = this.f23830e;
        if (i10 > iH) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i10).length());
            sb2.append("Length too large: ");
            sb2.append(i10);
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 > s0Var.h()) {
            int iH2 = s0Var.h();
            throw new IllegalArgumentException(l1.d.j(new StringBuilder(String.valueOf(i10).length() + 27 + String.valueOf(iH2).length()), i10, "Ran off end of other: 0, ", iH2, ", "));
        }
        byte[] bArr = this.f23828c;
        int i11 = this.f23829d;
        if (z10) {
            return s0.w(bArr, i11, 0, ((r0) s0Var).f23912c, i10);
        }
        if (!(s0Var instanceof p0)) {
            return s0Var.m(0, i10).equals(m(i11, i10 + i11));
        }
        p0 p0Var = (p0) s0Var;
        return s0.w(bArr, i11, p0Var.f23829d, p0Var.f23828c, i10);
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final int r(int i10, int i11) {
        return q1.a(i10, this.f23829d, i11, this.f23828c);
    }
}

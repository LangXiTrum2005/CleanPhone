package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f23912c;

    public r0(byte[] bArr) {
        bArr.getClass();
        this.f23912c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final byte b(int i10) {
        return this.f23912c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final int h() {
        return this.f23912c.length;
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final q0 m(int i10, int i11) {
        byte[] bArr = this.f23912c;
        int iV = s0.v(0, i11, bArr.length);
        return iV == 0 ? s0.f23949b : new p0(bArr, 0, iV);
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final void n(int i10, byte[] bArr) {
        System.arraycopy(this.f23912c, 0, bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final void p(x0 x0Var) {
        byte[] bArr = this.f23912c;
        x0Var.d(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final boolean q(s0 s0Var) {
        boolean z10 = s0Var instanceof r0;
        byte[] bArr = this.f23912c;
        if (z10) {
            return Arrays.equals(bArr, ((r0) s0Var).f23912c);
        }
        boolean z11 = s0Var instanceof p0;
        if (!z11) {
            return s0Var.q(this);
        }
        p0 p0Var = (p0) s0Var;
        int i10 = p0Var.f23830e;
        int length = bArr.length;
        if (length > i10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb2.append("Length too large: ");
            sb2.append(length);
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (length > i10) {
            throw new IllegalArgumentException(l1.d.j(new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i10).length()), length, "Ran off end of other: 0, ", i10, ", "));
        }
        if (z10) {
            return s0.w(bArr, 0, 0, ((r0) s0Var).f23912c, length);
        }
        if (!z11) {
            return s0Var.m(0, length).equals(m(0, length));
        }
        return s0.w(bArr, 0, p0Var.f23829d, p0Var.f23828c, length);
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final int r(int i10, int i11) {
        return q1.a(i10, 0, i11, this.f23912c);
    }
}

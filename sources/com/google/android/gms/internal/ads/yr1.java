package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yr1 extends zr1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f22356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22358e;

    public yr1(byte[] bArr, int i10, int i11) {
        cs1.m(i10, i10 + i11, bArr.length);
        this.f22356c = bArr;
        this.f22357d = i10;
        this.f22358e = i11;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public final boolean G(cs1 cs1Var, int i10, int i11) {
        if (i11 > cs1Var.q()) {
            int length = String.valueOf(i11).length();
            int i12 = this.f22358e;
            StringBuilder sb2 = new StringBuilder(length + 18 + String.valueOf(i12).length());
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(i12);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i13 = i10 + i11;
        if (i13 > cs1Var.q()) {
            int iQ = cs1Var.q();
            int length2 = String.valueOf(i10).length();
            StringBuilder sb3 = new StringBuilder(length2 + 24 + String.valueOf(i11).length() + 2 + String.valueOf(iQ).length());
            l1.d.p(sb3, "Ran off end of other: ", i10, ", ", i11);
            throw new IllegalArgumentException(l1.d.k(sb3, ", ", iQ));
        }
        boolean z10 = cs1Var instanceof as1;
        byte[] bArr = this.f22356c;
        int i14 = this.f22357d;
        if (z10) {
            return cs1.n(bArr, i14, i10, ((as1) cs1Var).f12504c, i11);
        }
        if (!(cs1Var instanceof yr1)) {
            return cs1Var.s(i10, i13).equals(s(i14, i11 + i14));
        }
        yr1 yr1Var = (yr1) cs1Var;
        return cs1.n(bArr, i14, yr1Var.f22357d + i10, yr1Var.f22356c, i11);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final byte p(int i10) {
        return this.f22356c[this.f22357d + i10];
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final int q() {
        return this.f22358e;
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final cs1 r(int i10, int i11) {
        int iM = cs1.m(i10, i11, this.f22358e);
        if (iM == 0) {
            return cs1.f13248b;
        }
        return new yr1(this.f22356c, this.f22357d + i10, iM);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final cs1 s(int i10, int i11) {
        int iM = cs1.m(i10, i11, this.f22358e);
        if (iM == 0) {
            return cs1.f13248b;
        }
        return new yr1(this.f22356c, this.f22357d + i10, iM);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final void t(int i10, int i11, int i12, byte[] bArr) {
        System.arraycopy(this.f22356c, this.f22357d + i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final ByteBuffer u() {
        return ByteBuffer.wrap(this.f22356c, this.f22357d, this.f22358e).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final void v(is1 is1Var) {
        is1Var.b(this.f22356c, this.f22357d, this.f22358e);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final boolean w(cs1 cs1Var) {
        return ((cs1Var instanceof as1) || (cs1Var instanceof yr1)) ? G(cs1Var, 0, this.f22358e) : cs1Var.w(this);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final int y(int i10, int i11, int i12) {
        return bt1.b(i10, this.f22357d + i11, i12, this.f22356c);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final fs1 z() {
        return fs1.q(this.f22356c, this.f22357d, this.f22358e);
    }
}

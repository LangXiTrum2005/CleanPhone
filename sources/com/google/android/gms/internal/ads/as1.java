package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class as1 extends zr1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f12504c;

    public as1(byte[] bArr) {
        bArr.getClass();
        this.f12504c = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public final boolean G(cs1 cs1Var, int i10, int i11) {
        int iQ = cs1Var.q();
        byte[] bArr = this.f12504c;
        if (i11 > iQ) {
            int length = String.valueOf(i11).length();
            int length2 = bArr.length;
            StringBuilder sb2 = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i12 = i10 + i11;
        if (i12 > cs1Var.q()) {
            int iQ2 = cs1Var.q();
            int length3 = String.valueOf(i10).length();
            StringBuilder sb3 = new StringBuilder(length3 + 24 + String.valueOf(i11).length() + 2 + String.valueOf(iQ2).length());
            l1.d.p(sb3, "Ran off end of other: ", i10, ", ", i11);
            throw new IllegalArgumentException(l1.d.k(sb3, ", ", iQ2));
        }
        if (cs1Var instanceof as1) {
            return cs1.n(bArr, 0, i10, ((as1) cs1Var).f12504c, i11);
        }
        if (!(cs1Var instanceof yr1)) {
            return cs1Var.s(i10, i12).equals(s(0, i11));
        }
        yr1 yr1Var = (yr1) cs1Var;
        return cs1.n(bArr, 0, yr1Var.f22357d + i10, yr1Var.f22356c, i11);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final byte p(int i10) {
        return this.f12504c[i10];
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final int q() {
        return this.f12504c.length;
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final cs1 r(int i10, int i11) {
        byte[] bArr = this.f12504c;
        int iM = cs1.m(i10, i11, bArr.length);
        return iM == 0 ? cs1.f13248b : new yr1(bArr, i10, iM);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final cs1 s(int i10, int i11) {
        byte[] bArr = this.f12504c;
        int iM = cs1.m(i10, i11, bArr.length);
        return iM == 0 ? cs1.f13248b : new yr1(bArr, i10, iM);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final void t(int i10, int i11, int i12, byte[] bArr) {
        System.arraycopy(this.f12504c, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final ByteBuffer u() {
        return ByteBuffer.wrap(this.f12504c).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final void v(is1 is1Var) {
        byte[] bArr = this.f12504c;
        is1Var.b(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final boolean w(cs1 cs1Var) {
        boolean z10 = cs1Var instanceof as1;
        byte[] bArr = this.f12504c;
        if (z10) {
            return Arrays.equals(bArr, ((as1) cs1Var).f12504c);
        }
        return cs1Var instanceof yr1 ? G(cs1Var, 0, bArr.length) : cs1Var.w(this);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final int y(int i10, int i11, int i12) {
        return bt1.b(i10, i11, i12, this.f12504c);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final fs1 z() {
        byte[] bArr = this.f12504c;
        return fs1.q(bArr, 0, bArr.length);
    }
}

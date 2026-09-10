package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gs1 extends is1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f14949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14951e;

    public gs1(byte[] bArr, int i10) {
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(defpackage.e.g(length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f14949c = bArr;
        this.f14951e = 0;
        this.f14950d = i10;
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void A(int i10, cs1 cs1Var) throws b2.z {
        G((i10 << 3) | 2);
        B(cs1Var);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void B(cs1 cs1Var) throws b2.z {
        G(cs1Var.q());
        cs1Var.v(this);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void C(int i10, byte[] bArr) throws b2.z {
        G(i10);
        M(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void D(rr1 rr1Var) throws b2.z {
        G(((ss1) rr1Var).d(null));
        ((ss1) rr1Var).u(this);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void E(byte b10) throws b2.z {
        int i10 = this.f14951e;
        try {
            int i11 = i10 + 1;
            try {
                this.f14949c[i10] = b10;
                this.f14951e = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new b2.z(i10, this.f14950d, 1, e, 2);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void F(int i10) throws b2.z {
        if (i10 >= 0) {
            G(i10);
        } else {
            I(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void G(int i10) throws b2.z {
        int i11;
        int i12 = this.f14951e;
        while (true) {
            int i13 = i10 & (-128);
            byte[] bArr = this.f14949c;
            if (i13 == 0) {
                i11 = i12 + 1;
                bArr[i12] = (byte) i10;
                this.f14951e = i11;
                return;
            } else {
                i11 = i12 + 1;
                try {
                    bArr[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    throw new b2.z(i11, this.f14950d, 1, e10, 2);
                }
            }
            throw new b2.z(i11, this.f14950d, 1, e10, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void H(int i10) throws b2.z {
        int i11 = this.f14951e;
        try {
            byte[] bArr = this.f14949c;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f14951e = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new b2.z(i11, this.f14950d, 4, e10, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void I(long j10) throws b2.z {
        int i10;
        int i11 = this.f14951e;
        int i12 = this.f14950d;
        byte[] bArr = this.f14949c;
        if (!is1.f15840b || i12 - i11 < 10) {
            long j11 = j10;
            while ((j11 & (-128)) != 0) {
                int i13 = i11 + 1;
                try {
                    bArr[i11] = (byte) (((int) j11) | 128);
                    j11 >>>= 7;
                    i11 = i13;
                } catch (IndexOutOfBoundsException e10) {
                    e = e10;
                    i10 = i13;
                    throw new b2.z(i10, i12, 1, e, 2);
                }
            }
            i10 = i11 + 1;
            try {
                bArr[i11] = (byte) j11;
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                throw new b2.z(i10, i12, 1, e, 2);
            }
        } else {
            long j12 = j10;
            while ((j12 & (-128)) != 0) {
                nu1.m(bArr, i11, (byte) (((int) j12) | 128));
                j12 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            nu1.m(bArr, i11, (byte) j12);
        }
        this.f14951e = i10;
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void J(long j10) throws b2.z {
        int i10 = this.f14951e;
        try {
            byte[] bArr = this.f14949c;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f14951e = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new b2.z(i10, this.f14950d, 8, e10, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void K(String str) throws b2.z {
        int i10 = this.f14951e;
        try {
            int iP = is1.p(str.length() * 3);
            int iP2 = is1.p(str.length());
            byte[] bArr = this.f14949c;
            if (iP2 != iP) {
                G(pu1.b(str));
                int i11 = this.f14951e;
                this.f14951e = pu1.c(bArr, i11, bArr.length - i11, str);
            } else {
                int i12 = i10 + iP2;
                this.f14951e = i12;
                int iC = pu1.c(bArr, i12, bArr.length - i12, str);
                this.f14951e = i10;
                G((iC - i10) - iP2);
                this.f14951e = iC;
            }
        } catch (IndexOutOfBoundsException e10) {
            throw new b2.z(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final int L() {
        return this.f14950d - this.f14951e;
    }

    public final void M(byte[] bArr, int i10, int i11) throws b2.z {
        try {
            System.arraycopy(bArr, i10, this.f14949c, this.f14951e, i11);
            this.f14951e += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new b2.z(this.f14951e, this.f14950d, i11, e10, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.gc1
    public final void b(byte[] bArr, int i10, int i11) throws b2.z {
        M(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void s(int i10, int i11) throws b2.z {
        G((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void t(int i10, int i11) throws b2.z {
        G(i10 << 3);
        F(i11);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void u(int i10, int i11) throws b2.z {
        G(i10 << 3);
        G(i11);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void v(int i10, int i11) throws b2.z {
        G((i10 << 3) | 5);
        H(i11);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void w(int i10, long j10) throws b2.z {
        G(i10 << 3);
        I(j10);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void x(int i10, long j10) throws b2.z {
        G((i10 << 3) | 1);
        J(j10);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void y(int i10, boolean z10) throws b2.z {
        G(i10 << 3);
        E(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void z(int i10, String str) throws b2.z {
        G((i10 << 3) | 2);
        K(str);
    }
}

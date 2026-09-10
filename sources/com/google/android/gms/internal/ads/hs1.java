package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hs1 extends is1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f15380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final OutputStream f15383f;

    public hs1(OutputStream outputStream, int i10) {
        this.f15383f = outputStream;
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f15380c = new byte[iMax];
        this.f15381d = iMax;
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void A(int i10, cs1 cs1Var) {
        G((i10 << 3) | 2);
        B(cs1Var);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void B(cs1 cs1Var) {
        G(cs1Var.q());
        cs1Var.v(this);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void C(int i10, byte[] bArr) throws IOException {
        G(i10);
        P(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void D(rr1 rr1Var) {
        G(((ss1) rr1Var).d(null));
        ((ss1) rr1Var).u(this);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void E(byte b10) {
        if (this.f15382e == this.f15381d) {
            R();
        }
        int i10 = this.f15382e;
        this.f15380c[i10] = b10;
        this.f15382e = i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void F(int i10) {
        if (i10 >= 0) {
            G(i10);
        } else {
            I(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void G(int i10) {
        Q(5);
        S(i10);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void H(int i10) {
        Q(4);
        N(i10);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void I(long j10) {
        Q(10);
        M(j10);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void J(long j10) {
        Q(8);
        O(j10);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void K(String str) throws IOException {
        int length = str.length() * 3;
        int iP = is1.p(length);
        int i10 = iP + length;
        int i11 = this.f15381d;
        if (i10 > i11) {
            byte[] bArr = new byte[length];
            int iC = pu1.c(bArr, 0, length, str);
            G(iC);
            P(bArr, 0, iC);
            return;
        }
        if (i10 > i11 - this.f15382e) {
            R();
        }
        int iP2 = is1.p(str.length());
        int i12 = this.f15382e;
        byte[] bArr2 = this.f15380c;
        try {
            if (iP2 == iP) {
                int i13 = i12 + iP2;
                this.f15382e = i13;
                int iC2 = pu1.c(bArr2, i13, i11 - i13, str);
                this.f15382e = i12;
                S((iC2 - i12) - iP2);
                this.f15382e = iC2;
            } else {
                int iB = pu1.b(str);
                S(iB);
                this.f15382e = pu1.c(bArr2, this.f15382e, iB, str);
            }
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new b2.z(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final int L() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void M(long j10) {
        boolean z10 = is1.f15840b;
        byte[] bArr = this.f15380c;
        if (z10) {
            while (true) {
                int i10 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    int i11 = this.f15382e;
                    this.f15382e = i11 + 1;
                    nu1.m(bArr, i11, (byte) i10);
                    return;
                } else {
                    int i12 = this.f15382e;
                    this.f15382e = i12 + 1;
                    nu1.m(bArr, i12, (byte) (i10 | 128));
                    j10 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i13 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    int i14 = this.f15382e;
                    this.f15382e = i14 + 1;
                    bArr[i14] = (byte) i13;
                    return;
                } else {
                    int i15 = this.f15382e;
                    this.f15382e = i15 + 1;
                    bArr[i15] = (byte) (i13 | 128);
                    j10 >>>= 7;
                }
            }
        }
    }

    public final void N(int i10) {
        int i11 = this.f15382e;
        byte[] bArr = this.f15380c;
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
        this.f15382e = i11 + 4;
    }

    public final void O(long j10) {
        int i10 = this.f15382e;
        byte[] bArr = this.f15380c;
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >> 8);
        bArr[i10 + 2] = (byte) (j10 >> 16);
        bArr[i10 + 3] = (byte) (j10 >> 24);
        bArr[i10 + 4] = (byte) (j10 >> 32);
        bArr[i10 + 5] = (byte) (j10 >> 40);
        bArr[i10 + 6] = (byte) (j10 >> 48);
        bArr[i10 + 7] = (byte) (j10 >> 56);
        this.f15382e = i10 + 8;
    }

    public final void P(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f15382e;
        int i13 = this.f15381d;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f15380c;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f15382e += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        this.f15382e = i13;
        R();
        int i16 = i11 - i14;
        if (i16 > i13) {
            this.f15383f.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f15382e = i16;
        }
    }

    public final void Q(int i10) {
        if (this.f15381d - this.f15382e < i10) {
            R();
        }
    }

    public final void R() {
        this.f15383f.write(this.f15380c, 0, this.f15382e);
        this.f15382e = 0;
    }

    public final void S(int i10) {
        boolean z10 = is1.f15840b;
        byte[] bArr = this.f15380c;
        if (z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f15382e;
                this.f15382e = i11 + 1;
                nu1.m(bArr, i11, (byte) (i10 | 128));
                i10 >>>= 7;
            }
            int i12 = this.f15382e;
            this.f15382e = i12 + 1;
            nu1.m(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f15382e;
            this.f15382e = i13 + 1;
            bArr[i13] = (byte) (i10 | 128);
            i10 >>>= 7;
        }
        int i14 = this.f15382e;
        this.f15382e = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.ads.gc1
    public final void b(byte[] bArr, int i10, int i11) throws IOException {
        P(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void s(int i10, int i11) {
        G((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void t(int i10, int i11) {
        Q(20);
        S(i10 << 3);
        if (i11 >= 0) {
            S(i11);
        } else {
            M(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void u(int i10, int i11) {
        Q(20);
        S(i10 << 3);
        S(i11);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void v(int i10, int i11) {
        Q(14);
        S((i10 << 3) | 5);
        N(i11);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void w(int i10, long j10) {
        Q(20);
        S(i10 << 3);
        M(j10);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void x(int i10, long j10) {
        Q(18);
        S((i10 << 3) | 1);
        O(j10);
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void y(int i10, boolean z10) {
        Q(11);
        S(i10 << 3);
        int i11 = this.f15382e;
        this.f15380c[i11] = z10 ? (byte) 1 : (byte) 0;
        this.f15382e = i11 + 1;
    }

    @Override // com.google.android.gms.internal.ads.is1
    public final void z(int i10, String str) throws IOException {
        G((i10 << 3) | 2);
        K(str);
    }
}

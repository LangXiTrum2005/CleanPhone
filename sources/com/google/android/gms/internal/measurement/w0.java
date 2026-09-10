package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends x0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f24105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final OutputStream f24108h;

    public w0(OutputStream outputStream, int i10) {
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f24108h = outputStream;
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i10, 20)];
        this.f24105e = bArr;
        this.f24106f = bArr.length;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void A(s0 s0Var) {
        F(s0Var.h());
        s0Var.p(this);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void B(int i10, byte[] bArr) throws IOException {
        F(i10);
        N(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void C(l0 l0Var) {
        i1 i1Var = (i1) l0Var;
        F(i1Var.n());
        i1Var.f(this);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void D(byte b10) {
        if (this.f24107g == this.f24106f) {
            P();
        }
        int i10 = this.f24107g;
        this.f24105e[i10] = b10;
        this.f24107g = i10 + 1;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void E(int i10) {
        if (i10 >= 0) {
            F(i10);
        } else {
            H(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void F(int i10) {
        O(5);
        Q(i10);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void G(int i10) {
        O(4);
        L(i10);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void H(long j10) {
        O(10);
        K(j10);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void I(long j10) {
        O(8);
        M(j10);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void J(String str) throws IOException {
        int length = str.length() * 3;
        int iP = x0.p(length);
        int i10 = iP + length;
        int i11 = this.f24106f;
        if (i10 > i11) {
            byte[] bArr = new byte[length];
            int iC = b3.c(bArr, 0, length, str);
            F(iC);
            N(bArr, 0, iC);
            return;
        }
        if (i10 > i11 - this.f24107g) {
            P();
        }
        int iP2 = x0.p(str.length());
        int i12 = this.f24107g;
        byte[] bArr2 = this.f24105e;
        try {
            if (iP2 == iP) {
                int i13 = i12 + iP2;
                this.f24107g = i13;
                int iC2 = b3.c(bArr2, i13, i11 - i13, str);
                this.f24107g = i12;
                Q((iC2 - i12) - iP2);
                this.f24107g = iC2;
            } else {
                int iB = b3.b(str);
                Q(iB);
                this.f24107g = b3.c(bArr2, this.f24107g, iB, str);
            }
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new b2.z(e10);
        }
    }

    public final void K(long j10) {
        boolean z10 = x0.f24137d;
        byte[] bArr = this.f24105e;
        if (z10) {
            while (true) {
                int i10 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    int i11 = this.f24107g;
                    this.f24107g = i11 + 1;
                    z2.k(bArr, i11, (byte) i10);
                    return;
                } else {
                    int i12 = this.f24107g;
                    this.f24107g = i12 + 1;
                    z2.k(bArr, i12, (byte) (i10 | 128));
                    j10 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i13 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    int i14 = this.f24107g;
                    this.f24107g = i14 + 1;
                    bArr[i14] = (byte) i13;
                    return;
                } else {
                    int i15 = this.f24107g;
                    this.f24107g = i15 + 1;
                    bArr[i15] = (byte) (i13 | 128);
                    j10 >>>= 7;
                }
            }
        }
    }

    public final void L(int i10) {
        int i11 = this.f24107g;
        byte[] bArr = this.f24105e;
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
        this.f24107g = i11 + 4;
    }

    public final void M(long j10) {
        int i10 = this.f24107g;
        byte[] bArr = this.f24105e;
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >> 8);
        bArr[i10 + 2] = (byte) (j10 >> 16);
        bArr[i10 + 3] = (byte) (j10 >> 24);
        bArr[i10 + 4] = (byte) (j10 >> 32);
        bArr[i10 + 5] = (byte) (j10 >> 40);
        bArr[i10 + 6] = (byte) (j10 >> 48);
        bArr[i10 + 7] = (byte) (j10 >> 56);
        this.f24107g = i10 + 8;
    }

    public final void N(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f24107g;
        int i13 = this.f24106f;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f24105e;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f24107g += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        this.f24107g = i13;
        P();
        int i16 = i11 - i14;
        if (i16 > i13) {
            this.f24108h.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f24107g = i16;
        }
    }

    public final void O(int i10) {
        if (this.f24106f - this.f24107g < i10) {
            P();
        }
    }

    public final void P() {
        this.f24108h.write(this.f24105e, 0, this.f24107g);
        this.f24107g = 0;
    }

    public final void Q(int i10) {
        boolean z10 = x0.f24137d;
        byte[] bArr = this.f24105e;
        if (z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f24107g;
                this.f24107g = i11 + 1;
                z2.k(bArr, i11, (byte) (i10 | 128));
                i10 >>>= 7;
            }
            int i12 = this.f24107g;
            this.f24107g = i12 + 1;
            z2.k(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f24107g;
            this.f24107g = i13 + 1;
            bArr[i13] = (byte) (i10 | 128);
            i10 >>>= 7;
        }
        int i14 = this.f24107g;
        this.f24107g = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.measurement.yg
    public final void d(byte[] bArr, int i10, int i11) throws IOException {
        N(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void r(int i10, int i11) {
        F((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void s(int i10, int i11) {
        O(20);
        Q(i10 << 3);
        if (i11 >= 0) {
            Q(i11);
        } else {
            K(i11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void t(int i10, int i11) {
        O(20);
        Q(i10 << 3);
        Q(i11);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void u(int i10, int i11) {
        O(14);
        Q((i10 << 3) | 5);
        L(i11);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void v(int i10, long j10) {
        O(20);
        Q(i10 << 3);
        K(j10);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void w(int i10, long j10) {
        O(18);
        Q((i10 << 3) | 1);
        M(j10);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void x(int i10, boolean z10) {
        O(11);
        Q(i10 << 3);
        int i11 = this.f24107g;
        this.f24105e[i11] = z10 ? (byte) 1 : (byte) 0;
        this.f24107g = i11 + 1;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void y(int i10, String str) throws IOException {
        F((i10 << 3) | 2);
        J(str);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void z(int i10, s0 s0Var) {
        F((i10 << 3) | 2);
        A(s0Var);
    }
}

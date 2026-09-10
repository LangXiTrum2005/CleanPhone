package com.google.android.gms.internal.measurement;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends x0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f24058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24060g;

    public v0(byte[] bArr, int i10) {
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(defpackage.e.g(length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f24058e = bArr;
        this.f24060g = 0;
        this.f24059f = i10;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void A(s0 s0Var) throws b2.z {
        F(s0Var.h());
        s0Var.p(this);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void B(int i10, byte[] bArr) throws b2.z {
        F(i10);
        K(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void C(l0 l0Var) throws b2.z {
        i1 i1Var = (i1) l0Var;
        F(i1Var.n());
        i1Var.f(this);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void D(byte b10) throws b2.z {
        int i10 = this.f24060g;
        try {
            int i11 = i10 + 1;
            try {
                this.f24058e[i10] = b10;
                this.f24060g = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new b2.z(i10, this.f24059f, 1, e, 5);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void E(int i10) throws b2.z {
        if (i10 >= 0) {
            F(i10);
        } else {
            H(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void F(int i10) throws b2.z {
        int i11;
        int i12 = this.f24060g;
        while (true) {
            int i13 = i10 & (-128);
            byte[] bArr = this.f24058e;
            if (i13 == 0) {
                i11 = i12 + 1;
                bArr[i12] = (byte) i10;
                this.f24060g = i11;
                return;
            } else {
                i11 = i12 + 1;
                try {
                    bArr[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    throw new b2.z(i11, this.f24059f, 1, e10, 5);
                }
            }
            throw new b2.z(i11, this.f24059f, 1, e10, 5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void G(int i10) throws b2.z {
        int i11 = this.f24060g;
        try {
            byte[] bArr = this.f24058e;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f24060g = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new b2.z(i11, this.f24059f, 4, e10, 5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void H(long j10) throws b2.z {
        int i10;
        int i11 = this.f24060g;
        int i12 = this.f24059f;
        byte[] bArr = this.f24058e;
        if (!x0.f24137d || i12 - i11 < 10) {
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
                    throw new b2.z(i10, i12, 1, e, 5);
                }
            }
            i10 = i11 + 1;
            try {
                bArr[i11] = (byte) j11;
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                throw new b2.z(i10, i12, 1, e, 5);
            }
        } else {
            long j12 = j10;
            while ((j12 & (-128)) != 0) {
                z2.k(bArr, i11, (byte) (((int) j12) | 128));
                j12 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            z2.k(bArr, i11, (byte) j12);
        }
        this.f24060g = i10;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void I(long j10) throws b2.z {
        int i10 = this.f24060g;
        try {
            byte[] bArr = this.f24058e;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f24060g = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new b2.z(i10, this.f24059f, 8, e10, 5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void J(String str) throws b2.z {
        int i10 = this.f24060g;
        try {
            int iP = x0.p(str.length() * 3);
            int iP2 = x0.p(str.length());
            byte[] bArr = this.f24058e;
            if (iP2 != iP) {
                F(b3.b(str));
                int i11 = this.f24060g;
                this.f24060g = b3.c(bArr, i11, bArr.length - i11, str);
            } else {
                int i12 = i10 + iP2;
                this.f24060g = i12;
                int iC = b3.c(bArr, i12, bArr.length - i12, str);
                this.f24060g = i10;
                F((iC - i10) - iP2);
                this.f24060g = iC;
            }
        } catch (IndexOutOfBoundsException e10) {
            throw new b2.z(e10);
        }
    }

    public final void K(byte[] bArr, int i10, int i11) throws b2.z {
        try {
            System.arraycopy(bArr, i10, this.f24058e, this.f24060g, i11);
            this.f24060g += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new b2.z(this.f24060g, this.f24059f, i11, e10, 5);
        }
    }

    public final int L() {
        return this.f24059f - this.f24060g;
    }

    @Override // com.google.android.gms.internal.measurement.yg
    public final void d(byte[] bArr, int i10, int i11) throws b2.z {
        K(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void r(int i10, int i11) throws b2.z {
        F((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void s(int i10, int i11) throws b2.z {
        F(i10 << 3);
        E(i11);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void t(int i10, int i11) throws b2.z {
        F(i10 << 3);
        F(i11);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void u(int i10, int i11) throws b2.z {
        F((i10 << 3) | 5);
        G(i11);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void v(int i10, long j10) throws b2.z {
        F(i10 << 3);
        H(j10);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void w(int i10, long j10) throws b2.z {
        F((i10 << 3) | 1);
        I(j10);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void x(int i10, boolean z10) throws b2.z {
        F(i10 << 3);
        D(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void y(int i10, String str) throws b2.z {
        F((i10 << 3) | 2);
        J(str);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void z(int i10, s0 s0Var) throws b2.z {
        F((i10 << 3) | 2);
        A(s0Var);
    }
}

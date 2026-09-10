package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o5 extends j0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f23150g = Logger.getLogger(o5.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f23151h = d7.f22996e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g6 f23152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f23153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final OutputStream f23156f;

    public o5(OutputStream outputStream, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f23153c = new byte[iMax];
        this.f23154d = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f23156f = outputStream;
    }

    public static int h(String str) {
        int length;
        try {
            length = f7.b(str);
        } catch (e7 unused) {
            length = str.getBytes(a6.f22937a).length;
        }
        return i(length) + length;
    }

    public static int i(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int j(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void A(int i10, int i11) throws IOException {
        l(20);
        o(i10 << 3);
        o(i11);
    }

    public final void B(int i10) throws IOException {
        l(5);
        o(i10);
    }

    public final void C(int i10, long j10) throws IOException {
        l(20);
        o(i10 << 3);
        p(j10);
    }

    public final void D(long j10) throws IOException {
        l(10);
        p(j10);
    }

    public final void E(int i10, byte[] bArr) throws IOException {
        int i11 = this.f23155e;
        int i12 = this.f23154d;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f23153c;
        if (i13 >= i10) {
            System.arraycopy(bArr, 0, bArr2, i11, i10);
            this.f23155e += i10;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i11, i13);
        this.f23155e = i12;
        k();
        int i14 = i10 - i13;
        if (i14 > i12) {
            this.f23156f.write(bArr, i13, i14);
        } else {
            System.arraycopy(bArr, i13, bArr2, 0, i14);
            this.f23155e = i14;
        }
    }

    public final void k() throws IOException {
        this.f23156f.write(this.f23153c, 0, this.f23155e);
        this.f23155e = 0;
    }

    public final void l(int i10) throws IOException {
        if (this.f23154d - this.f23155e < i10) {
            k();
        }
    }

    public final void m(int i10) {
        int i11 = this.f23155e;
        byte[] bArr = this.f23153c;
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
        this.f23155e = i11 + 4;
    }

    public final void n(long j10) {
        int i10 = this.f23155e;
        byte[] bArr = this.f23153c;
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >> 8);
        bArr[i10 + 2] = (byte) (j10 >> 16);
        bArr[i10 + 3] = (byte) (j10 >> 24);
        bArr[i10 + 4] = (byte) (j10 >> 32);
        bArr[i10 + 5] = (byte) (j10 >> 40);
        bArr[i10 + 6] = (byte) (j10 >> 48);
        bArr[i10 + 7] = (byte) (j10 >> 56);
        this.f23155e = i10 + 8;
    }

    public final void o(int i10) {
        boolean z10 = f23151h;
        byte[] bArr = this.f23153c;
        if (!z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f23155e;
                this.f23155e = i11 + 1;
                bArr[i11] = (byte) (i10 | 128);
                i10 >>>= 7;
            }
            int i12 = this.f23155e;
            this.f23155e = i12 + 1;
            bArr[i12] = (byte) i10;
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f23155e;
            this.f23155e = i13 + 1;
            d7.f22994c.d(bArr, d7.f22997f + ((long) i13), (byte) (i10 | 128));
            i10 >>>= 7;
        }
        int i14 = this.f23155e;
        this.f23155e = i14 + 1;
        byte b10 = (byte) i10;
        d7.f22994c.d(bArr, d7.f22997f + ((long) i14), b10);
    }

    public final void p(long j10) {
        boolean z10 = f23151h;
        byte[] bArr = this.f23153c;
        if (z10) {
            while (true) {
                int i10 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    int i11 = this.f23155e;
                    this.f23155e = i11 + 1;
                    d7.f22994c.d(bArr, d7.f22997f + ((long) i11), (byte) i10);
                    return;
                }
                int i12 = this.f23155e;
                this.f23155e = i12 + 1;
                d7.f22994c.d(bArr, d7.f22997f + i12, (byte) (i10 | 128));
                j10 >>>= 7;
            }
        } else {
            while (true) {
                int i13 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    int i14 = this.f23155e;
                    this.f23155e = i14 + 1;
                    bArr[i14] = (byte) i13;
                    return;
                } else {
                    int i15 = this.f23155e;
                    this.f23155e = i15 + 1;
                    bArr[i15] = (byte) (i13 | 128);
                    j10 >>>= 7;
                }
            }
        }
    }

    public final void q(int i10, n5 n5Var) throws IOException {
        B((i10 << 3) | 2);
        r(n5Var);
    }

    public final void r(n5 n5Var) throws IOException {
        B(n5Var.m());
        E(n5Var.m(), n5Var.f23114b);
    }

    public final void s(int i10, int i11) throws IOException {
        l(14);
        o((i10 << 3) | 5);
        m(i11);
    }

    public final void t(int i10) throws IOException {
        l(4);
        m(i10);
    }

    public final void u(int i10, long j10) throws IOException {
        l(18);
        o((i10 << 3) | 1);
        n(j10);
    }

    public final void v(long j10) throws IOException {
        l(8);
        n(j10);
    }

    public final void w(int i10, int i11) throws IOException {
        l(20);
        o(i10 << 3);
        if (i11 >= 0) {
            o(i11);
        } else {
            p(i11);
        }
    }

    public final void x(int i10) throws IOException {
        if (i10 >= 0) {
            B(i10);
        } else {
            D(i10);
        }
    }

    public final void y(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int i10 = i(length);
            int i11 = i10 + length;
            int i12 = this.f23154d;
            if (i11 > i12) {
                byte[] bArr = new byte[length];
                int iA = f7.a(bArr, 0, length, str);
                B(iA);
                E(iA, bArr);
                return;
            }
            if (i11 > i12 - this.f23155e) {
                k();
            }
            int i13 = i(str.length());
            int i14 = this.f23155e;
            byte[] bArr2 = this.f23153c;
            try {
                if (i13 == i10) {
                    int i15 = i14 + i13;
                    this.f23155e = i15;
                    int iA2 = f7.a(bArr2, i15, i12 - i15, str);
                    this.f23155e = i14;
                    o((iA2 - i14) - i13);
                    this.f23155e = iA2;
                } else {
                    int iB = f7.b(str);
                    o(iB);
                    this.f23155e = f7.a(bArr2, this.f23155e, iB, str);
                }
            } catch (e7 e10) {
                this.f23155e = i14;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new b2.z(e11);
            }
        } catch (e7 e12) {
            f23150g.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
            byte[] bytes = str.getBytes(a6.f22937a);
            try {
                int length2 = bytes.length;
                B(length2);
                E(length2, bytes);
            } catch (IndexOutOfBoundsException e13) {
                throw new b2.z(e13);
            }
        }
    }

    public final void z(int i10, int i11) throws IOException {
        B((i10 << 3) | i11);
    }
}

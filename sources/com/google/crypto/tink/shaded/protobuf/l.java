package com.google.crypto.tink.shaded.protobuf;

import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends go.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f24599e = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f24600f = i1.f24577e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k0 f24601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f24602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24604d;

    public l(byte[] bArr, int i10) {
        if (((bArr.length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(defpackage.e.g(bArr.length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f24602b = bArr;
        this.f24604d = 0;
        this.f24603c = i10;
    }

    public static int a0(int i10, i iVar) {
        int iE0 = e0(i10);
        int size = iVar.size();
        return f0(size) + size + iE0;
    }

    public static int b0(int i10) {
        return f0((i10 >> 31) ^ (i10 << 1));
    }

    public static int c0(long j10) {
        return g0((j10 >> 63) ^ (j10 << 1));
    }

    public static int d0(String str) {
        int length;
        try {
            length = l1.b(str);
        } catch (k1 unused) {
            length = str.getBytes(b0.f24539a).length;
        }
        return f0(length) + length;
    }

    public static int e0(int i10) {
        return f0(i10 << 3);
    }

    public static int f0(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int g0(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void h0(byte b10) throws m {
        int i10 = this.f24604d;
        try {
            int i11 = i10 + 1;
            try {
                this.f24602b[i10] = b10;
                this.f24604d = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new m(i10, this.f24603c, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    public final void i0(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, i10, this.f24602b, this.f24604d, i11);
            this.f24604d += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new m(this.f24604d, this.f24603c, i11, e10);
        }
    }

    public final void j0(int i10, int i11) {
        p0(i10, 5);
        k0(i11);
    }

    public final void k0(int i10) throws m {
        int i11 = this.f24604d;
        try {
            byte[] bArr = this.f24602b;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f24604d = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new m(i11, this.f24603c, 4, e10);
        }
    }

    public final void l0(int i10, long j10) {
        p0(i10, 1);
        m0(j10);
    }

    public final void m0(long j10) throws m {
        int i10 = this.f24604d;
        try {
            byte[] bArr = this.f24602b;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f24604d = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new m(i10, this.f24603c, 8, e10);
        }
    }

    public final void n0(int i10, int i11) throws m {
        p0(i10, 0);
        o0(i11);
    }

    public final void o0(int i10) throws m {
        if (i10 >= 0) {
            r0(i10);
        } else {
            t0(i10);
        }
    }

    public final void p0(int i10, int i11) {
        r0((i10 << 3) | i11);
    }

    public final void q0(int i10, int i11) {
        p0(i10, 0);
        r0(i11);
    }

    public final void r0(int i10) {
        int i11;
        int i12 = this.f24604d;
        while (true) {
            int i13 = i10 & (-128);
            byte[] bArr = this.f24602b;
            if (i13 == 0) {
                i11 = i12 + 1;
                bArr[i12] = (byte) i10;
                this.f24604d = i11;
                return;
            } else {
                i11 = i12 + 1;
                try {
                    bArr[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    throw new m(i11, this.f24603c, 1, e10);
                }
            }
            throw new m(i11, this.f24603c, 1, e10);
        }
    }

    public final void s0(int i10, long j10) {
        p0(i10, 0);
        t0(j10);
    }

    public final void t0(long j10) throws m {
        int i10;
        int i11 = this.f24604d;
        boolean z10 = f24600f;
        int i12 = this.f24603c;
        byte[] bArr = this.f24602b;
        if (!z10 || i12 - i11 < 10) {
            while ((j10 & (-128)) != 0) {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e10) {
                    throw new m(i10, i12, 1, e10);
                }
            }
            i10 = i11 + 1;
            bArr[i11] = (byte) j10;
        } else {
            while ((j10 & (-128)) != 0) {
                i1.k(bArr, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            i1.k(bArr, i11, (byte) j10);
        }
        this.f24604d = i10;
    }
}

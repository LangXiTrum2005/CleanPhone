package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends com.bumptech.glide.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f24304e = Logger.getLogger(j1.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f24305f = b3.f24235e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h2 f24306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f24307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24309d;

    public j1(byte[] bArr, int i10) {
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(defpackage.e.g(length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f24307b = bArr;
        this.f24309d = 0;
        this.f24308c = i10;
    }

    public static int Q(String str) {
        int length;
        try {
            length = d3.c(str);
        } catch (c3 unused) {
            length = str.getBytes(z1.f24507a).length;
        }
        return R(length) + length;
    }

    public static int R(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int S(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void T(int i10, byte[] bArr) throws b2.z {
        try {
            System.arraycopy(bArr, 0, this.f24307b, this.f24309d, i10);
            this.f24309d += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new b2.z(this.f24309d, this.f24308c, i10, e10, 8);
        }
    }

    public final void U(int i10, i1 i1Var) {
        e0((i10 << 3) | 2);
        e0(i1Var.m());
        T(i1Var.m(), i1Var.f24287b);
    }

    public final void V(int i10, int i11) {
        e0((i10 << 3) | 5);
        W(i11);
    }

    public final void W(int i10) throws b2.z {
        int i11 = this.f24309d;
        try {
            byte[] bArr = this.f24307b;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f24309d = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new b2.z(i11, this.f24308c, 4, e10, 8);
        }
    }

    public final void X(int i10, long j10) {
        e0((i10 << 3) | 1);
        Y(j10);
    }

    public final void Y(long j10) throws b2.z {
        int i10 = this.f24309d;
        try {
            byte[] bArr = this.f24307b;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f24309d = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new b2.z(i10, this.f24308c, 8, e10, 8);
        }
    }

    public final void Z(int i10, int i11) {
        e0(i10 << 3);
        a0(i11);
    }

    public final void a0(int i10) throws b2.z {
        if (i10 >= 0) {
            e0(i10);
        } else {
            g0(i10);
        }
    }

    public final void b0(int i10, String str) {
        e0((i10 << 3) | 2);
        int i11 = this.f24309d;
        try {
            int iR = R(str.length() * 3);
            int iR2 = R(str.length());
            int i12 = this.f24308c;
            byte[] bArr = this.f24307b;
            if (iR2 != iR) {
                e0(d3.c(str));
                int i13 = this.f24309d;
                this.f24309d = d3.b(bArr, i13, i12 - i13, str);
            } else {
                int i14 = i11 + iR2;
                this.f24309d = i14;
                int iB = d3.b(bArr, i14, i12 - i14, str);
                this.f24309d = i11;
                e0((iB - i11) - iR2);
                this.f24309d = iB;
            }
        } catch (c3 e10) {
            this.f24309d = i11;
            f24304e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(z1.f24507a);
            try {
                int length = bytes.length;
                e0(length);
                T(length, bytes);
            } catch (IndexOutOfBoundsException e11) {
                throw new b2.z(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new b2.z(e12);
        }
    }

    public final void c0(int i10, int i11) {
        e0((i10 << 3) | i11);
    }

    public final void d0(int i10, int i11) {
        e0(i10 << 3);
        e0(i11);
    }

    public final void e0(int i10) {
        int i11;
        int i12 = this.f24309d;
        while (true) {
            int i13 = i10 & (-128);
            byte[] bArr = this.f24307b;
            if (i13 == 0) {
                i11 = i12 + 1;
                bArr[i12] = (byte) i10;
                this.f24309d = i11;
                return;
            } else {
                i11 = i12 + 1;
                try {
                    bArr[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    throw new b2.z(i11, this.f24308c, 1, e10, 8);
                }
            }
            throw new b2.z(i11, this.f24308c, 1, e10, 8);
        }
    }

    public final void f0(int i10, long j10) {
        e0(i10 << 3);
        g0(j10);
    }

    public final void g0(long j10) throws b2.z {
        int i10;
        int i11 = this.f24309d;
        boolean z10 = f24305f;
        int i12 = this.f24308c;
        byte[] bArr = this.f24307b;
        if (!z10 || i12 - i11 < 10) {
            int i13 = i11;
            long j11 = j10;
            while ((j11 & (-128)) != 0) {
                int i14 = i13 + 1;
                try {
                    bArr[i13] = (byte) (((int) j11) | 128);
                    j11 >>>= 7;
                    i13 = i14;
                } catch (IndexOutOfBoundsException e10) {
                    e = e10;
                    i10 = i14;
                    throw new b2.z(i10, i12, 1, e, 8);
                }
            }
            i10 = i13 + 1;
            try {
                bArr[i13] = (byte) j11;
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                throw new b2.z(i10, i12, 1, e, 8);
            }
        } else {
            int i15 = i11;
            long j12 = j10;
            while ((j12 & (-128)) != 0) {
                b3.f24233c.d(bArr, b3.f24236f + ((long) i15), (byte) (((int) j12) | 128));
                j12 >>>= 7;
                i15++;
            }
            i10 = i15 + 1;
            b3.f24233c.d(bArr, b3.f24236f + ((long) i15), (byte) j12);
        }
        this.f24309d = i10;
    }
}

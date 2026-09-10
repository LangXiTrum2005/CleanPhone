package l1;

import com.applovin.shadow.okio.Utf8;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import oa.u0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f44809d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f44810e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u0 f44811f = u0.u(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f44812g = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f44813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44815c;

    public q() {
        this.f44813a = y.f44831b;
    }

    public static int b(int i10, int i11, int i12, int i13) {
        byte b10 = (byte) i12;
        return com.bumptech.glide.c.m((byte) 0, com.google.android.gms.internal.auth.i.c(((i10 & 7) << 2) | ((i11 & 48) >> 4)), com.google.android.gms.internal.auth.i.c(((((byte) i11) & 15) << 4) | ((b10 & 60) >> 2)), com.google.android.gms.internal.auth.i.c(((b10 & 3) << 6) | (((byte) i13) & Utf8.REPLACEMENT_BYTE)));
    }

    public static int d(Charset charset) {
        go.k.k(f44811f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean e(byte b10) {
        return (b10 & 192) == 128;
    }

    public final int A() {
        f(4);
        byte[] bArr = this.f44813a;
        int i10 = this.f44814b;
        int i11 = i10 + 1;
        this.f44814b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f44814b = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.f44814b = i10 + 4;
        return i13;
    }

    public final long B() {
        f(4);
        byte[] bArr = this.f44813a;
        int i10 = this.f44814b;
        int i11 = i10 + 1;
        this.f44814b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f44814b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f44814b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f44814b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public final int C() {
        f(3);
        byte[] bArr = this.f44813a;
        int i10 = this.f44814b;
        int i11 = i10 + 1;
        this.f44814b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f44814b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f44814b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public final int D() {
        int iM = m();
        if (iM >= 0) {
            return iM;
        }
        throw new IllegalStateException(d.e(iM, "Top bit not zero: "));
    }

    public final int E() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f44814b == this.f44815c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZ = z();
            j10 |= (127 & jZ) << (i10 * 7);
            if ((jZ & 128) == 0) {
                break;
            }
        }
        return com.bumptech.glide.c.c(j10);
    }

    public final long F() {
        long jT = t();
        if (jT >= 0) {
            return jT;
        }
        throw new IllegalStateException(defpackage.e.i(jT, "Top bit not zero: "));
    }

    public final int G() {
        f(2);
        byte[] bArr = this.f44813a;
        int i10 = this.f44814b;
        int i11 = i10 + 1;
        this.f44814b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f44814b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public final long H() {
        int i10;
        f(1);
        long j10 = this.f44813a[this.f44814b];
        int i11 = 7;
        while (true) {
            if (i11 >= 0) {
                int i12 = 1 << i11;
                if ((((long) i12) & j10) == 0) {
                    if (i11 < 6) {
                        j10 &= (long) (i12 - 1);
                        i10 = 7 - i11;
                        break;
                    }
                    if (i11 == 7) {
                        i10 = 1;
                        break;
                    }
                } else {
                    i11--;
                }
            }
            i10 = 0;
            break;
        }
        if (i10 == 0) {
            throw new NumberFormatException(defpackage.e.i(j10, "Invalid UTF-8 sequence first byte: "));
        }
        f(i10);
        for (int i13 = 1; i13 < i10; i13++) {
            byte b10 = this.f44813a[this.f44814b + i13];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException(defpackage.e.i(j10, "Invalid UTF-8 sequence continuation byte: "));
            }
            j10 = (j10 << 6) | ((long) (b10 & Utf8.REPLACEMENT_BYTE));
        }
        this.f44814b += i10;
        return j10;
    }

    public final Charset I() {
        if (a() >= 3) {
            byte[] bArr = this.f44813a;
            int i10 = this.f44814b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f44814b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f44813a;
        int i11 = this.f44814b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f44814b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f44814b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void J(int i10) {
        byte[] bArr = this.f44813a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        K(bArr, i10);
    }

    public final void K(byte[] bArr, int i10) {
        this.f44813a = bArr;
        this.f44815c = i10;
        this.f44814b = 0;
    }

    public final void L(int i10) {
        go.k.i(i10 >= 0 && i10 <= this.f44813a.length);
        this.f44815c = i10;
    }

    public final void M(int i10) {
        go.k.i(i10 >= 0 && i10 <= this.f44815c);
        this.f44814b = i10;
    }

    public final void N(int i10) {
        M(this.f44814b + i10);
    }

    public final int a() {
        return Math.max(this.f44815c - this.f44814b, 0);
    }

    public final void c(int i10) {
        byte[] bArr = this.f44813a;
        if (i10 > bArr.length) {
            this.f44813a = Arrays.copyOf(bArr, i10);
        }
    }

    public final void f(int i10) {
        if (!f44812g.get() || a() >= i10) {
            return;
        }
        StringBuilder sbU = defpackage.e.u(i10, "bytesNeeded= ", ", bytesLeft=");
        sbU.append(a());
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public final char g(int i10, ByteOrder byteOrder) {
        byte b10;
        byte b11;
        f(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f44813a;
            int i11 = this.f44814b + i10;
            b10 = bArr[i11];
            b11 = bArr[i11 + 1];
        } else {
            byte[] bArr2 = this.f44813a;
            int i12 = this.f44814b + i10;
            b10 = bArr2[i12 + 1];
            b11 = bArr2[i12];
        }
        return (char) ((b11 & 255) | (b10 << 8));
    }

    public final int h(Charset charset) {
        int codePoint;
        int i10;
        go.k.k(f44811f.contains(charset), "Unsupported charset: %s", charset);
        if (a() < d(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f44814b + ", limit=" + this.f44815c);
        }
        int i11 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b10 = this.f44813a[this.f44814b];
            if ((b10 & 128) != 0) {
                return 0;
            }
            codePoint = b10 & 255;
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte b11 = this.f44813a[this.f44814b];
            if ((b11 & 128) == 0) {
                i10 = 1;
            } else if ((b11 & 224) == 192 && a() >= 2 && e(this.f44813a[this.f44814b + 1])) {
                i10 = 2;
            } else if ((this.f44813a[this.f44814b] & 240) == 224 && a() >= 3 && e(this.f44813a[this.f44814b + 1]) && e(this.f44813a[this.f44814b + 2])) {
                i10 = 3;
            } else {
                i10 = ((this.f44813a[this.f44814b] & 248) == 240 && a() >= 4 && e(this.f44813a[this.f44814b + 1]) && e(this.f44813a[this.f44814b + 2]) && e(this.f44813a[this.f44814b + 3])) ? 4 : 0;
            }
            if (i10 == 1) {
                codePoint = this.f44813a[this.f44814b] & 255;
            } else if (i10 == 2) {
                byte[] bArr = this.f44813a;
                int i12 = this.f44814b;
                codePoint = b(0, 0, bArr[i12], bArr[i12 + 1]);
            } else if (i10 == 3) {
                byte[] bArr2 = this.f44813a;
                int i13 = this.f44814b;
                codePoint = b(0, bArr2[i13] & 15, bArr2[i13 + 1], bArr2[i13 + 2]);
            } else {
                if (i10 != 4) {
                    return 0;
                }
                byte[] bArr3 = this.f44813a;
                int i14 = this.f44814b;
                codePoint = b(bArr3[i14], bArr3[i14 + 1], bArr3[i14 + 2], bArr3[i14 + 3]);
            }
            i11 = i10;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cG = g(0, byteOrder);
            if (!Character.isHighSurrogate(cG) || a() < 4) {
                codePoint = cG;
                i11 = 2;
            } else {
                codePoint = Character.toCodePoint(cG, g(2, byteOrder));
                i11 = 4;
            }
        }
        return (codePoint << 8) | i11;
    }

    public final int i() {
        if (a() >= 4) {
            int iM = m();
            this.f44814b -= 4;
            return iM;
        }
        throw new IndexOutOfBoundsException("position=" + this.f44814b + ", limit=" + this.f44815c);
    }

    public final int j() {
        f(1);
        return this.f44813a[this.f44814b] & 255;
    }

    public final void k(byte[] bArr, int i10, int i11) {
        f(i11);
        System.arraycopy(this.f44813a, this.f44814b, bArr, i10, i11);
        this.f44814b += i11;
    }

    public final char l(Charset charset, char[] cArr) {
        int iH;
        if (a() >= d(charset) && (iH = h(charset)) != 0) {
            long j10 = iH >>> 8;
            go.k.f(j10, (j10 >> 32) == 0, "out of range: %s");
            int i10 = (int) j10;
            if (!Character.isSupplementaryCodePoint(i10)) {
                long j11 = i10;
                char c4 = (char) j11;
                go.k.f(j11, ((long) c4) == j11, "Out of range: %s");
                for (char c5 : cArr) {
                    if (c5 == c4) {
                        this.f44814b = com.bumptech.glide.c.c(iH & 255) + this.f44814b;
                        return c4;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int m() {
        f(4);
        byte[] bArr = this.f44813a;
        int i10 = this.f44814b;
        int i11 = i10 + 1;
        this.f44814b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f44814b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f44814b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f44814b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc A[SYNTHETIC] */
    public final String n(Charset charset) {
        int i10;
        byte[] bArr;
        go.k.k(f44811f.contains(charset), "Unsupported charset: %s", charset);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            I();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i10 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f44814b;
        while (true) {
            int i12 = this.f44815c;
            if (i11 >= i12 - (i10 - 1)) {
                i11 = i12;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && y.J(this.f44813a[i11])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.f44813a;
                if (bArr2[i11] == 0 && y.J(bArr2[i11 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f44813a;
                    if (bArr[i11 + 1] == 0 && y.J(bArr[i11])) {
                        break;
                    }
                }
                i11 += i10;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f44813a;
                    if (bArr[i11 + 1] == 0) {
                        continue;
                    }
                }
                i11 += i10;
            }
        }
        String strX = x(i11 - this.f44814b, charset);
        if (this.f44814b != this.f44815c && l(charset, f44809d) == '\r') {
            l(charset, f44810e);
        }
        return strX;
    }

    public final int o() {
        f(4);
        byte[] bArr = this.f44813a;
        int i10 = this.f44814b;
        int i11 = i10 + 1;
        this.f44814b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f44814b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f44814b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f44814b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public final long p() {
        f(8);
        byte[] bArr = this.f44813a;
        int i10 = this.f44814b;
        int i11 = i10 + 1;
        this.f44814b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f44814b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f44814b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f44814b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f44814b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f44814b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f44814b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f44814b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    public final long q() {
        f(4);
        byte[] bArr = this.f44813a;
        int i10 = this.f44814b;
        int i11 = i10 + 1;
        this.f44814b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f44814b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f44814b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f44814b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public final int r() {
        int iO = o();
        if (iO >= 0) {
            return iO;
        }
        throw new IllegalStateException(d.e(iO, "Top bit not zero: "));
    }

    public final int s() {
        f(2);
        byte[] bArr = this.f44813a;
        int i10 = this.f44814b;
        int i11 = i10 + 1;
        this.f44814b = i11;
        int i12 = bArr[i10] & 255;
        this.f44814b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long t() {
        f(8);
        byte[] bArr = this.f44813a;
        int i10 = this.f44814b;
        int i11 = i10 + 1;
        this.f44814b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f44814b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f44814b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f44814b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f44814b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f44814b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f44814b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f44814b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    public final String u() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f44814b;
        while (i10 < this.f44815c && this.f44813a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f44813a;
        int i11 = this.f44814b;
        String str = y.f44830a;
        String str2 = new String(bArr, i11, i10 - i11, StandardCharsets.UTF_8);
        this.f44814b = i10;
        if (i10 < this.f44815c) {
            this.f44814b = i10 + 1;
        }
        return str2;
    }

    public final String v(int i10) {
        f(i10);
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f44814b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.f44815c || this.f44813a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.f44813a;
        String str = y.f44830a;
        String str2 = new String(bArr, i11, i13, StandardCharsets.UTF_8);
        this.f44814b += i10;
        return str2;
    }

    public final short w() {
        f(2);
        byte[] bArr = this.f44813a;
        int i10 = this.f44814b;
        int i11 = i10 + 1;
        this.f44814b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f44814b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final String x(int i10, Charset charset) {
        f(i10);
        String str = new String(this.f44813a, this.f44814b, i10, charset);
        this.f44814b += i10;
        return str;
    }

    public final int y() {
        return z() | (z() << 21) | (z() << 14) | (z() << 7);
    }

    public final int z() {
        f(1);
        byte[] bArr = this.f44813a;
        int i10 = this.f44814b;
        this.f44814b = i10 + 1;
        return bArr[i10] & 255;
    }

    public q(int i10) {
        this.f44813a = new byte[i10];
        this.f44815c = i10;
    }

    public q(byte[] bArr) {
        this.f44813a = bArr;
        this.f44815c = bArr.length;
    }

    public q(byte[] bArr, int i10) {
        this.f44813a = bArr;
        this.f44815c = i10;
    }
}

package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Utf8;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class np0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f17876d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f17877e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ia1 f17878f = ia1.z(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f17879g = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f17880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17882c;

    public np0(byte[] bArr, int i10) {
        this.f17880a = bArr;
        this.f17882c = i10;
    }

    public static int u(Charset charset) {
        ps1.V(f17878f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean w(byte b10) {
        return (b10 & 192) == 128;
    }

    public static int x(int i10, int i11, int i12, int i13) {
        return gc1.l((byte) 0, jc1.a(((i10 & 7) << 2) | ((i11 & 48) >> 4)), jc1.a(((i12 & 60) >> 2) | ((i11 & 15) << 4)), jc1.a((i13 & 63) | ((i12 & 3) << 6)));
    }

    public final void A(int i10) {
        byte[] bArr = this.f17880a;
        if (i10 > bArr.length) {
            this.f17880a = Arrays.copyOf(bArr, i10);
        }
    }

    public final int B() {
        return Math.max(this.f17882c - this.f17881b, 0);
    }

    public final void C(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.f17880a.length) {
            z10 = true;
        }
        ps1.v(z10);
        this.f17882c = i10;
    }

    public final int D() {
        return this.f17881b;
    }

    public final void E(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.f17882c) {
            z10 = true;
        }
        ps1.v(z10);
        this.f17881b = i10;
    }

    public final byte[] F() {
        return this.f17880a;
    }

    public final void G(int i10) {
        E(this.f17881b + i10);
    }

    public final void H(byte[] bArr, int i10, int i11) {
        v(i11);
        System.arraycopy(this.f17880a, this.f17881b, bArr, i10, i11);
        this.f17881b += i11;
    }

    public final int I() {
        v(1);
        return this.f17880a[this.f17881b] & 255;
    }

    public final int J() {
        if (B() >= 4) {
            int iB = b();
            this.f17881b -= 4;
            return iB;
        }
        int i10 = this.f17881b;
        int i11 = this.f17882c;
        throw new IndexOutOfBoundsException(l1.d.j(new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i11).length()), i10, "position=", i11, ", limit="));
    }

    public final int K() {
        v(1);
        byte[] bArr = this.f17880a;
        int i10 = this.f17881b;
        this.f17881b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int L() {
        v(2);
        byte[] bArr = this.f17880a;
        int i10 = this.f17881b;
        int i11 = i10 + 1;
        this.f17881b = i11;
        int i12 = bArr[i10] & 255;
        this.f17881b = i10 + 2;
        return (bArr[i11] & 255) | (i12 << 8);
    }

    public final int M() {
        v(2);
        byte[] bArr = this.f17880a;
        int i10 = this.f17881b;
        int i11 = i10 + 1;
        this.f17881b = i11;
        int i12 = bArr[i10] & 255;
        this.f17881b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final short N() {
        v(2);
        byte[] bArr = this.f17880a;
        int i10 = this.f17881b;
        int i11 = i10 + 1;
        this.f17881b = i11;
        int i12 = bArr[i10] & 255;
        this.f17881b = i10 + 2;
        return (short) ((bArr[i11] & 255) | (i12 << 8));
    }

    public final int O() {
        v(3);
        byte[] bArr = this.f17880a;
        int i10 = this.f17881b;
        int i11 = i10 + 1;
        this.f17881b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f17881b = i13;
        int i14 = bArr[i11] & 255;
        this.f17881b = i10 + 3;
        return (bArr[i13] & 255) | (i12 << 16) | (i14 << 8);
    }

    public final long P() {
        v(4);
        byte[] bArr = this.f17880a;
        int i10 = this.f17881b;
        int i11 = i10 + 1;
        this.f17881b = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.f17881b = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.f17881b = i13;
        long j12 = bArr[i12];
        this.f17881b = i10 + 4;
        return (((long) bArr[i13]) & 255) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | ((j12 & 255) << 8);
    }

    public final long a() {
        v(4);
        byte[] bArr = this.f17880a;
        int i10 = this.f17881b;
        int i11 = i10 + 1;
        this.f17881b = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.f17881b = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.f17881b = i13;
        long j12 = bArr[i12];
        this.f17881b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | (255 & j10) | ((j11 & 255) << 8) | ((j12 & 255) << 16);
    }

    public final int b() {
        v(4);
        byte[] bArr = this.f17880a;
        int i10 = this.f17881b;
        int i11 = i10 + 1;
        this.f17881b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f17881b = i13;
        int i14 = bArr[i11] & 255;
        int i15 = i10 + 3;
        this.f17881b = i15;
        int i16 = bArr[i13] & 255;
        this.f17881b = i10 + 4;
        return (bArr[i15] & 255) | (i12 << 24) | (i14 << 16) | (i16 << 8);
    }

    public final int c() {
        v(4);
        byte[] bArr = this.f17880a;
        int i10 = this.f17881b;
        int i11 = i10 + 1;
        this.f17881b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f17881b = i13;
        int i14 = bArr[i11] & 255;
        int i15 = i10 + 3;
        this.f17881b = i15;
        int i16 = bArr[i13] & 255;
        this.f17881b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | (i14 << 8) | i12 | (i16 << 16);
    }

    public final long d() {
        v(8);
        byte[] bArr = this.f17880a;
        int i10 = this.f17881b;
        int i11 = i10 + 1;
        this.f17881b = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.f17881b = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.f17881b = i13;
        long j12 = bArr[i12];
        int i14 = i10 + 4;
        this.f17881b = i14;
        long j13 = bArr[i13];
        int i15 = i10 + 5;
        this.f17881b = i15;
        long j14 = bArr[i14];
        int i16 = i10 + 6;
        this.f17881b = i16;
        long j15 = bArr[i15];
        int i17 = i10 + 7;
        this.f17881b = i17;
        long j16 = bArr[i16];
        this.f17881b = i10 + 8;
        return ((j16 & 255) << 8) | ((j10 & 255) << 56) | ((j11 & 255) << 48) | ((j12 & 255) << 40) | ((j13 & 255) << 32) | ((j14 & 255) << 24) | ((j15 & 255) << 16) | (((long) bArr[i17]) & 255);
    }

    public final long e() {
        v(8);
        byte[] bArr = this.f17880a;
        int i10 = this.f17881b;
        int i11 = i10 + 1;
        this.f17881b = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.f17881b = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.f17881b = i13;
        long j12 = bArr[i12];
        int i14 = i10 + 4;
        this.f17881b = i14;
        long j13 = bArr[i13];
        int i15 = i10 + 5;
        this.f17881b = i15;
        long j14 = bArr[i14];
        int i16 = i10 + 6;
        this.f17881b = i16;
        long j15 = bArr[i15];
        int i17 = i10 + 7;
        this.f17881b = i17;
        long j16 = bArr[i16];
        this.f17881b = i10 + 8;
        return ((j16 & 255) << 48) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((j15 & 255) << 40) | ((((long) bArr[i17]) & 255) << 56);
    }

    public final int f() {
        v(4);
        byte[] bArr = this.f17880a;
        int i10 = this.f17881b;
        int i11 = i10 + 1;
        this.f17881b = i11;
        int i12 = bArr[i10] & 255;
        this.f17881b = i10 + 2;
        int i13 = bArr[i11] & 255;
        this.f17881b = i10 + 4;
        return (i12 << 8) | i13;
    }

    public final int g() {
        return K() | (K() << 21) | (K() << 14) | (K() << 7);
    }

    public final int h() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException(l1.d.k(new StringBuilder(String.valueOf(iB).length() + 18), "Top bit not zero: ", iB));
    }

    public final int i() {
        int iC = c();
        if (iC >= 0) {
            return iC;
        }
        throw new IllegalStateException(l1.d.k(new StringBuilder(String.valueOf(iC).length() + 18), "Top bit not zero: ", iC));
    }

    public final long j() {
        long jD = d();
        if (jD >= 0) {
            return jD;
        }
        throw new IllegalStateException(defpackage.e.s(new StringBuilder(String.valueOf(jD).length() + 18), "Top bit not zero: ", jD));
    }

    public final String k(int i10, Charset charset) {
        v(i10);
        byte[] bArr = this.f17880a;
        int i11 = this.f17881b;
        String str = new String(bArr, i11, i10, charset);
        this.f17881b = i11 + i10;
        return str;
    }

    public final String l(int i10) {
        v(i10);
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f17881b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.f17882c || this.f17880a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.f17880a;
        String str = uu0.f20901a;
        String str2 = new String(bArr, i11, i13, StandardCharsets.UTF_8);
        this.f17881b += i10;
        return str2;
    }

    public final String m() {
        if (B() == 0) {
            return null;
        }
        int i10 = this.f17881b;
        while (i10 < this.f17882c && this.f17880a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f17880a;
        int i11 = this.f17881b;
        String str = uu0.f20901a;
        String str2 = new String(bArr, i11, i10 - i11, StandardCharsets.UTF_8);
        this.f17881b = i10;
        if (i10 < this.f17882c) {
            this.f17881b = i10 + 1;
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x00be A[ADDED_TO_REGION, EDGE_INSN: B:63:0x00be->B:54:0x00be BREAK  A[LOOP:0: B:24:0x005a->B:52:0x00bb], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00be A[ADDED_TO_REGION, EDGE_INSN: B:65:0x00be->B:54:0x00be BREAK  A[LOOP:0: B:24:0x005a->B:52:0x00bb], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb A[SYNTHETIC] */
    public final String n(Charset charset) {
        byte[] bArr;
        byte b10;
        byte[] bArr2;
        byte b11;
        ps1.V(f17878f.contains(charset), "Unsupported charset: %s", charset);
        if (B() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            q();
        }
        int i10 = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i10 = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i11 = this.f17881b;
        while (true) {
            int i12 = this.f17882c;
            if (i11 >= i12 - (i10 - 1)) {
                i11 = i12;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b12 = this.f17880a[i11];
                String str = uu0.f20901a;
                if (b12 == 10 || b12 == 13) {
                    break;
                }
                if (!charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    bArr = this.f17880a;
                    if (bArr[i11] == 0) {
                        b10 = bArr[i11 + 1];
                        String str2 = uu0.f20901a;
                        if (b10 != 10 || b10 == 13) {
                            break;
                        }
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f17880a;
                            if (bArr2[i11 + 1] == 0) {
                                b11 = bArr2[i11];
                                String str3 = uu0.f20901a;
                                if (b11 != 10 || b11 == 13) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i11 += i10;
                    } else {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f17880a;
                            if (bArr2[i11 + 1] == 0) {
                                b11 = bArr2[i11];
                                String str4 = uu0.f20901a;
                                if (b11 != 10) {
                                    break;
                                }
                                break;
                                break;
                            }
                            continue;
                        }
                        i11 += i10;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr2 = this.f17880a;
                        if (bArr2[i11 + 1] == 0) {
                            b11 = bArr2[i11];
                            String str5 = uu0.f20901a;
                            if (b11 != 10) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        continue;
                    }
                    i11 += i10;
                }
            } else if (charset.equals(StandardCharsets.UTF_16)) {
                bArr = this.f17880a;
                if (bArr[i11] == 0) {
                    b10 = bArr[i11 + 1];
                    String str6 = uu0.f20901a;
                    if (b10 != 10) {
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f17880a;
                    if (bArr2[i11 + 1] == 0) {
                        b11 = bArr2[i11];
                        String str7 = uu0.f20901a;
                        if (b11 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i11 += i10;
            } else {
                bArr = this.f17880a;
                if (bArr[i11] == 0) {
                    b10 = bArr[i11 + 1];
                    String str8 = uu0.f20901a;
                    if (b10 != 10) {
                        break;
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f17880a;
                    if (bArr2[i11 + 1] == 0) {
                        b11 = bArr2[i11];
                        String str9 = uu0.f20901a;
                        if (b11 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i11 += i10;
            }
        }
        String strK = k(i11 - this.f17881b, charset);
        if (this.f17881b != this.f17882c && s(charset, f17876d) == '\r') {
            s(charset, f17877e);
        }
        return strK;
    }

    public final long o() {
        int i10;
        v(1);
        long j10 = this.f17880a[this.f17881b];
        int i11 = 7;
        while (true) {
            i10 = 0;
            if (i11 < 0) {
                break;
            }
            int i12 = 1 << i11;
            if ((((long) i12) & j10) == 0) {
                if (i11 >= 6) {
                    if (i11 != 7) {
                        break;
                    }
                    i10 = 1;
                    break;
                }
                j10 &= (long) (i12 - 1);
                i10 = 7 - i11;
                break;
            }
            i11--;
        }
        if (i10 == 0) {
            throw new NumberFormatException(defpackage.e.s(new StringBuilder(String.valueOf(j10).length() + 35), "Invalid UTF-8 sequence first byte: ", j10));
        }
        v(i10);
        for (int i13 = 1; i13 < i10; i13++) {
            byte b10 = this.f17880a[this.f17881b + i13];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException(defpackage.e.s(new StringBuilder(String.valueOf(j10).length() + 42), "Invalid UTF-8 sequence continuation byte: ", j10));
            }
            j10 = (j10 << 6) | ((long) (b10 & Utf8.REPLACEMENT_BYTE));
        }
        this.f17881b += i10;
        return j10;
    }

    public final long p() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f17881b == this.f17882c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jK = K();
            j10 |= (127 & jK) << (i10 * 7);
            if ((jK & 128) == 0) {
                return j10;
            }
        }
        return j10;
    }

    public final Charset q() {
        if (B() >= 3) {
            byte[] bArr = this.f17880a;
            int i10 = this.f17881b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f17881b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (B() < 2) {
            return null;
        }
        byte[] bArr2 = this.f17880a;
        int i11 = this.f17881b;
        byte b10 = bArr2[i11];
        if (b10 == -2) {
            if (bArr2[i11 + 1] != -1) {
                return null;
            }
            this.f17881b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f17881b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final char r(int i10, ByteOrder byteOrder) {
        byte b10;
        byte b11;
        v(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f17880a;
            int i11 = this.f17881b + i10;
            b10 = bArr[i11];
            b11 = bArr[i11 + 1];
        } else {
            byte[] bArr2 = this.f17880a;
            int i12 = this.f17881b + i10;
            b10 = bArr2[i12 + 1];
            b11 = bArr2[i12];
        }
        return (char) ((b11 & 255) | (b10 << 8));
    }

    public final char s(Charset charset, char[] cArr) {
        int iT;
        if (B() >= u(charset) && (iT = t(charset)) != 0) {
            int i10 = iT >>> 8;
            if (!Character.isSupplementaryCodePoint(i10)) {
                long j10 = i10;
                char c4 = (char) j10;
                ps1.R(j10, ((long) c4) == j10, "Out of range: %s");
                for (char c5 : cArr) {
                    if (c5 == c4) {
                        this.f17881b = gc1.a(iT & 255) + this.f17881b;
                        return c4;
                    }
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    public final int t(Charset charset) {
        int codePoint;
        int i10;
        ps1.V(f17878f.contains(charset), "Unsupported charset: %s", charset);
        if (B() < u(charset)) {
            int i11 = this.f17881b;
            int i12 = this.f17882c;
            throw new IndexOutOfBoundsException(l1.d.j(new StringBuilder(String.valueOf(i11).length() + 17 + String.valueOf(i12).length()), i11, "position=", i12, ", limit="));
        }
        int i13 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b10 = this.f17880a[this.f17881b];
            if ((b10 & 128) == 0) {
                codePoint = Byte.toUnsignedInt(b10);
                return (codePoint << 8) | i13;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b11 = this.f17880a[this.f17881b];
            if ((b11 & 128) == 0) {
                i10 = 1;
            } else if ((b11 & 224) == 192 && B() >= 2 && w(this.f17880a[this.f17881b + 1])) {
                i10 = 2;
            } else if ((this.f17880a[this.f17881b] & 240) == 224 && B() >= 3) {
                byte[] bArr = this.f17880a;
                int i14 = this.f17881b;
                if (w(bArr[i14 + 1]) && w(bArr[i14 + 2])) {
                    i10 = 3;
                } else if ((this.f17880a[this.f17881b] & 248) == 240) {
                    i10 = 0;
                } else {
                    i10 = 0;
                }
            } else if ((this.f17880a[this.f17881b] & 248) == 240 || B() < 4) {
                i10 = 0;
            } else {
                byte[] bArr2 = this.f17880a;
                int i15 = this.f17881b;
                if (w(bArr2[i15 + 1]) && w(bArr2[i15 + 2]) && w(bArr2[i15 + 3])) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
            }
            if (i10 == 1) {
                codePoint = Byte.toUnsignedInt(this.f17880a[this.f17881b]);
            } else if (i10 == 2) {
                byte[] bArr3 = this.f17880a;
                int i16 = this.f17881b;
                codePoint = x(0, 0, bArr3[i16], bArr3[i16 + 1]);
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        byte[] bArr4 = this.f17880a;
                        int i17 = this.f17881b;
                        codePoint = x(bArr4[i17], bArr4[i17 + 1], bArr4[i17 + 2], bArr4[i17 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.f17880a;
                int i18 = this.f17881b;
                codePoint = x(0, bArr5[i18] & 15, bArr5[i18 + 1], bArr5[i18 + 2]);
            }
            i13 = i10;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cR = r(0, byteOrder);
            if (!Character.isHighSurrogate(cR) || B() < 4) {
                codePoint = cR;
                i13 = 2;
            } else {
                codePoint = Character.toCodePoint(cR, r(2, byteOrder));
                i13 = 4;
            }
        }
        return (codePoint << 8) | i13;
    }

    public final void v(int i10) {
        if (!f17879g.get() || B() >= i10) {
            return;
        }
        int iB = B();
        throw new IndexOutOfBoundsException(l1.d.j(new StringBuilder(String.valueOf(i10).length() + 25 + String.valueOf(iB).length()), i10, "bytesNeeded= ", iB, ", bytesLeft="));
    }

    public final void y(int i10) {
        byte[] bArr = this.f17880a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        z(i10, bArr);
    }

    public final void z(int i10, byte[] bArr) {
        this.f17880a = bArr;
        this.f17882c = i10;
        this.f17881b = 0;
    }

    public np0() {
        this.f17880a = uu0.f20902b;
    }

    public np0(int i10) {
        this.f17880a = new byte[i10];
        this.f17882c = i10;
    }

    public np0(byte[] bArr) {
        this.f17880a = bArr;
        this.f17882c = bArr.length;
    }
}

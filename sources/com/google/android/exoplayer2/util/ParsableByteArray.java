package com.google.android.exoplayer2.util;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Chars;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ParsableByteArray {
    public static final char[] d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f18955e = {'\n'};
    public static final ImmutableSet f = ImmutableSet.t(5, Charsets.f19703a, Charsets.f19705c, Charsets.f, Charsets.d, Charsets.f19706e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f18956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18958c;

    public ParsableByteArray() {
        this.f18956a = Util.f;
    }

    public final long A() {
        int i2;
        int i3;
        long j = this.f18956a[this.f18957b];
        int i4 = 7;
        while (true) {
            if (i4 >= 0) {
                int i5 = 1 << i4;
                if ((((long) i5) & j) == 0) {
                    if (i4 < 6) {
                        j &= (long) (i5 - 1);
                        i3 = 7 - i4;
                        break;
                    }
                    if (i4 == 7) {
                        i3 = 1;
                        break;
                    }
                } else {
                    i4--;
                }
            }
            i3 = 0;
            break;
        }
        if (i3 == 0) {
            throw new NumberFormatException(androidx.datastore.preferences.protobuf.a.i(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i2 = 1; i2 < i3; i2++) {
            byte b2 = this.f18956a[this.f18957b + i2];
            if ((b2 & 192) != 128) {
                throw new NumberFormatException(androidx.datastore.preferences.protobuf.a.i(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b2 & 63));
        }
        this.f18957b += i3;
        return j;
    }

    public final Charset B() {
        if (a() >= 3) {
            byte[] bArr = this.f18956a;
            int i2 = this.f18957b;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f18957b = i2 + 3;
                return Charsets.f19705c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f18956a;
        int i3 = this.f18957b;
        byte b2 = bArr2[i3];
        if (b2 == -2 && bArr2[i3 + 1] == -1) {
            this.f18957b = i3 + 2;
            return Charsets.d;
        }
        if (b2 != -1 || bArr2[i3 + 1] != -2) {
            return null;
        }
        this.f18957b = i3 + 2;
        return Charsets.f19706e;
    }

    public final void C(int i2) {
        byte[] bArr = this.f18956a;
        if (bArr.length < i2) {
            bArr = new byte[i2];
        }
        D(bArr, i2);
    }

    public final void D(byte[] bArr, int i2) {
        this.f18956a = bArr;
        this.f18958c = i2;
        this.f18957b = 0;
    }

    public final void E(int i2) {
        Assertions.b(i2 >= 0 && i2 <= this.f18956a.length);
        this.f18958c = i2;
    }

    public final void F(int i2) {
        Assertions.b(i2 >= 0 && i2 <= this.f18958c);
        this.f18957b = i2;
    }

    public final void G(int i2) {
        F(this.f18957b + i2);
    }

    public final int a() {
        return this.f18958c - this.f18957b;
    }

    public final void b(int i2) {
        byte[] bArr = this.f18956a;
        if (i2 > bArr.length) {
            this.f18956a = Arrays.copyOf(bArr, i2);
        }
    }

    public final char c(Charset charset) {
        Assertions.a("Unsupported charset: " + charset, f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte bA;
        byte b2;
        int i2;
        int i3 = 1;
        if ((charset.equals(Charsets.f19705c) || charset.equals(Charsets.f19703a)) && a() >= 1) {
            bA = (byte) Chars.a(this.f18956a[this.f18957b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        } else {
            if ((charset.equals(Charsets.f) || charset.equals(Charsets.d)) && a() >= 2) {
                byte[] bArr = this.f18956a;
                int i4 = this.f18957b;
                byte b3 = bArr[i4];
                b2 = bArr[i4 + 1];
                i2 = b3 << 8;
            } else {
                if (!charset.equals(Charsets.f19706e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f18956a;
                int i5 = this.f18957b;
                byte b4 = bArr2[i5 + 1];
                b2 = bArr2[i5];
                i2 = b4 << 8;
            }
            bA = (byte) ((char) ((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i2));
            i3 = 2;
        }
        return (Chars.a(bA) << 16) + i3;
    }

    public final void e(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f18956a, this.f18957b, bArr, i2, i3);
        this.f18957b += i3;
    }

    public final char f(Charset charset, char[] cArr) {
        int iD = d(charset);
        if (iD != 0) {
            char c2 = (char) (iD >> 16);
            for (char c3 : cArr) {
                if (c3 == c2) {
                    this.f18957b += iD & 65535;
                    return c2;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.f18956a;
        int i2 = this.f18957b;
        int i3 = i2 + 1;
        this.f18957b = i3;
        int i4 = (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
        int i5 = i2 + 2;
        this.f18957b = i5;
        int i6 = ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i4;
        int i7 = i2 + 3;
        this.f18957b = i7;
        int i8 = i6 | ((bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.f18957b = i2 + 4;
        return (bArr[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i8;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce A[ADDED_TO_REGION, EDGE_INSN: B:66:0x00ce->B:56:0x00ce BREAK  A[LOOP:0: B:26:0x006a->B:54:0x00cb], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce A[ADDED_TO_REGION, EDGE_INSN: B:68:0x00ce->B:56:0x00ce BREAK  A[LOOP:0: B:26:0x006a->B:54:0x00cb], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb A[SYNTHETIC] */
    public final String h(Charset charset) {
        int i2;
        byte[] bArr;
        byte b2;
        byte[] bArr2;
        byte b3;
        Assertions.a("Unsupported charset: " + charset, f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = Charsets.f19703a;
        if (!charset.equals(charset2)) {
            B();
        }
        if (charset.equals(Charsets.f19705c) || charset.equals(charset2)) {
            i2 = 1;
        } else {
            if (!charset.equals(Charsets.f) && !charset.equals(Charsets.f19706e) && !charset.equals(Charsets.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i2 = 2;
        }
        int i3 = this.f18957b;
        while (true) {
            int i4 = this.f18958c;
            if (i3 >= i4 - (i2 - 1)) {
                i3 = i4;
                break;
            }
            if (charset.equals(Charsets.f19705c) || charset.equals(Charsets.f19703a)) {
                byte b4 = this.f18956a[i3];
                int i5 = Util.f18979a;
                if (b4 == 10 || b4 == 13) {
                    break;
                }
                if (!charset.equals(Charsets.f) || charset.equals(Charsets.d)) {
                    bArr = this.f18956a;
                    if (bArr[i3] == 0) {
                        b2 = bArr[i3 + 1];
                        int i6 = Util.f18979a;
                        if (b2 != 10 || b2 == 13) {
                            break;
                        }
                        if (charset.equals(Charsets.f19706e)) {
                            bArr2 = this.f18956a;
                            if (bArr2[i3 + 1] == 0) {
                                b3 = bArr2[i3];
                                int i7 = Util.f18979a;
                                if (b3 != 10 || b3 == 13) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i3 += i2;
                    } else {
                        if (charset.equals(Charsets.f19706e)) {
                            bArr2 = this.f18956a;
                            if (bArr2[i3 + 1] == 0) {
                                b3 = bArr2[i3];
                                int i8 = Util.f18979a;
                                if (b3 != 10) {
                                    break;
                                }
                                break;
                                break;
                            }
                            continue;
                        }
                        i3 += i2;
                    }
                } else {
                    if (charset.equals(Charsets.f19706e)) {
                        bArr2 = this.f18956a;
                        if (bArr2[i3 + 1] == 0) {
                            b3 = bArr2[i3];
                            int i9 = Util.f18979a;
                            if (b3 != 10) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        continue;
                    }
                    i3 += i2;
                }
            } else if (charset.equals(Charsets.f)) {
                bArr = this.f18956a;
                if (bArr[i3] == 0) {
                    b2 = bArr[i3 + 1];
                    int i10 = Util.f18979a;
                    if (b2 != 10) {
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(Charsets.f19706e)) {
                    bArr2 = this.f18956a;
                    if (bArr2[i3 + 1] == 0) {
                        b3 = bArr2[i3];
                        int i11 = Util.f18979a;
                        if (b3 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i3 += i2;
            } else {
                bArr = this.f18956a;
                if (bArr[i3] == 0) {
                    b2 = bArr[i3 + 1];
                    int i12 = Util.f18979a;
                    if (b2 != 10) {
                        break;
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(Charsets.f19706e)) {
                    bArr2 = this.f18956a;
                    if (bArr2[i3 + 1] == 0) {
                        b3 = bArr2[i3];
                        int i13 = Util.f18979a;
                        if (b3 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i3 += i2;
            }
        }
        String strS = s(i3 - this.f18957b, charset);
        if (this.f18957b != this.f18958c && f(charset, d) == '\r') {
            f(charset, f18955e);
        }
        return strS;
    }

    public final int i() {
        byte[] bArr = this.f18956a;
        int i2 = this.f18957b;
        int i3 = i2 + 1;
        this.f18957b = i3;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i5 = i2 + 2;
        this.f18957b = i5;
        int i6 = ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i4;
        int i7 = i2 + 3;
        this.f18957b = i7;
        int i8 = i6 | ((bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.f18957b = i2 + 4;
        return ((bArr[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i8;
    }

    public final long j() {
        byte[] bArr = this.f18956a;
        int i2 = this.f18957b;
        int i3 = i2 + 1;
        this.f18957b = i3;
        long j = ((long) bArr[i2]) & 255;
        int i4 = i2 + 2;
        this.f18957b = i4;
        long j2 = j | ((((long) bArr[i3]) & 255) << 8);
        int i5 = i2 + 3;
        this.f18957b = i5;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 16);
        int i6 = i2 + 4;
        this.f18957b = i6;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i2 + 5;
        this.f18957b = i7;
        long j5 = j4 | ((((long) bArr[i6]) & 255) << 32);
        int i8 = i2 + 6;
        this.f18957b = i8;
        long j6 = j5 | ((((long) bArr[i7]) & 255) << 40);
        int i9 = i2 + 7;
        this.f18957b = i9;
        long j7 = j6 | ((((long) bArr[i8]) & 255) << 48);
        this.f18957b = i2 + 8;
        return ((((long) bArr[i9]) & 255) << 56) | j7;
    }

    public final short k() {
        byte[] bArr = this.f18956a;
        int i2 = this.f18957b;
        int i3 = i2 + 1;
        this.f18957b = i3;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f18957b = i2 + 2;
        return (short) (((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i4);
    }

    public final long l() {
        byte[] bArr = this.f18956a;
        int i2 = this.f18957b;
        int i3 = i2 + 1;
        this.f18957b = i3;
        long j = ((long) bArr[i2]) & 255;
        int i4 = i2 + 2;
        this.f18957b = i4;
        long j2 = j | ((((long) bArr[i3]) & 255) << 8);
        int i5 = i2 + 3;
        this.f18957b = i5;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 16);
        this.f18957b = i2 + 4;
        return ((((long) bArr[i5]) & 255) << 24) | j3;
    }

    public final int m() {
        int i2 = i();
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalStateException(android.support.v4.media.a.h(i2, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.f18956a;
        int i2 = this.f18957b;
        int i3 = i2 + 1;
        this.f18957b = i3;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f18957b = i2 + 2;
        return ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i4;
    }

    public final long o() {
        byte[] bArr = this.f18956a;
        int i2 = this.f18957b;
        int i3 = i2 + 1;
        this.f18957b = i3;
        long j = (((long) bArr[i2]) & 255) << 56;
        int i4 = i2 + 2;
        this.f18957b = i4;
        long j2 = j | ((((long) bArr[i3]) & 255) << 48);
        int i5 = i2 + 3;
        this.f18957b = i5;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 40);
        int i6 = i2 + 4;
        this.f18957b = i6;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i2 + 5;
        this.f18957b = i7;
        long j5 = j4 | ((((long) bArr[i6]) & 255) << 24);
        int i8 = i2 + 6;
        this.f18957b = i8;
        long j6 = j5 | ((((long) bArr[i7]) & 255) << 16);
        int i9 = i2 + 7;
        this.f18957b = i9;
        long j7 = j6 | ((((long) bArr[i8]) & 255) << 8);
        this.f18957b = i2 + 8;
        return (((long) bArr[i9]) & 255) | j7;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i2 = this.f18957b;
        while (i2 < this.f18958c && this.f18956a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f18956a;
        int i3 = this.f18957b;
        int i4 = Util.f18979a;
        String str = new String(bArr, i3, i2 - i3, Charsets.f19705c);
        this.f18957b = i2;
        if (i2 < this.f18958c) {
            this.f18957b = i2 + 1;
        }
        return str;
    }

    public final String q(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.f18957b;
        int i4 = (i3 + i2) - 1;
        int i5 = (i4 >= this.f18958c || this.f18956a[i4] != 0) ? i2 : i2 - 1;
        byte[] bArr = this.f18956a;
        int i6 = Util.f18979a;
        String str = new String(bArr, i3, i5, Charsets.f19705c);
        this.f18957b += i2;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f18956a;
        int i2 = this.f18957b;
        int i3 = i2 + 1;
        this.f18957b = i3;
        int i4 = (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f18957b = i2 + 2;
        return (short) ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i4);
    }

    public final String s(int i2, Charset charset) {
        String str = new String(this.f18956a, this.f18957b, i2, charset);
        this.f18957b += i2;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f18956a;
        int i2 = this.f18957b;
        this.f18957b = i2 + 1;
        return bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final long v() {
        byte[] bArr = this.f18956a;
        int i2 = this.f18957b;
        int i3 = i2 + 1;
        this.f18957b = i3;
        long j = (((long) bArr[i2]) & 255) << 24;
        int i4 = i2 + 2;
        this.f18957b = i4;
        long j2 = j | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i2 + 3;
        this.f18957b = i5;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 8);
        this.f18957b = i2 + 4;
        return (((long) bArr[i5]) & 255) | j3;
    }

    public final int w() {
        byte[] bArr = this.f18956a;
        int i2 = this.f18957b;
        int i3 = i2 + 1;
        this.f18957b = i3;
        int i4 = (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
        int i5 = i2 + 2;
        this.f18957b = i5;
        int i6 = ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i4;
        this.f18957b = i2 + 3;
        return (bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i6;
    }

    public final int x() {
        int iG = g();
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException(android.support.v4.media.a.h(iG, "Top bit not zero: "));
    }

    public final long y() {
        long jO = o();
        if (jO >= 0) {
            return jO;
        }
        throw new IllegalStateException(androidx.datastore.preferences.protobuf.a.i(jO, "Top bit not zero: "));
    }

    public final int z() {
        byte[] bArr = this.f18956a;
        int i2 = this.f18957b;
        int i3 = i2 + 1;
        this.f18957b = i3;
        int i4 = (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f18957b = i2 + 2;
        return (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i4;
    }

    public ParsableByteArray(int i2) {
        this.f18956a = new byte[i2];
        this.f18958c = i2;
    }

    public ParsableByteArray(byte[] bArr) {
        this.f18956a = bArr;
        this.f18958c = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i2) {
        this.f18956a = bArr;
        this.f18958c = i2;
    }
}

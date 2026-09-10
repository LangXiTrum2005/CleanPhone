package com.facebook.ads.redexgen.core;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11074v {
    public static byte[] A03;
    public static String[] A04 = {"RlBAQ9etSzb6rKOU0OwTULVtudJYJZp0", "XAmGWsEC26u1mjqUpAPP", "gKAOne2sLRpvkAzkWDtxdYOHT1y3K7xN", "iu", "f0TxnfWyKi4JtHzbatu6pF78XF274ljv", "5Aw1jR83b8etF7", "lH1Eai5bIm9O9MK22LfAWzb", "DxY4VOe5grYAJX95lLrlpegM3yyEwSTm"};
    public static final Set<Charset> A05;
    public static final char[] A06;
    public static final char[] A07;
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{64, 103, AbstractJsonLexerKt.TC_INVALID, 104, 101, 96, 109, 41, 92, 93, 79, 36, 49, 41, 122, 108, 120, 124, 108, 103, 106, 108, 41, 106, 102, 103, 125, 96, 103, 124, 104, 125, 96, 102, 103, 41, 107, 112, 125, 108, 51, 41, 88, AbstractJsonLexerKt.TC_INVALID, 103, 112, 125, 120, 117, 49, 68, 69, 87, 60, 41, 49, 98, 116, 96, 100, 116, AbstractJsonLexerKt.TC_INVALID, 114, 116, 49, 119, 120, 99, 98, 101, 49, 115, 104, 101, 116, 43, 49, 2, 57, 38, 118, 52, 63, 34, 118, 56, 57, 34, 118, 44, 51, 36, 57, 108, 118, 38, 29, 0, 6, 3, 3, 28, 1, 7, 22, 23, 83, 16, 27, 18, 1, 0, 22, 7, 73, 83};
    }

    static {
        A04();
        A06 = new char[]{'\r', '\n'};
        A07 = new char[]{'\n'};
        A05 = MetaExoPlayerCustomizedCollections.A05(AbstractC2497k9.A01, AbstractC2497k9.A05, AbstractC2497k9.A02, AbstractC2497k9.A03, AbstractC2497k9.A04);
    }

    public C11074v() {
        this.A00 = C5C.A07;
    }

    public C11074v(int i2) {
        this.A00 = new byte[i2];
        this.A01 = i2;
    }

    public C11074v(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C11074v(byte[] bArr, int i2) {
        this.A00 = bArr;
        this.A01 = i2;
    }

    private char A00(Charset charset, char[] cArr) {
        char cA01;
        int i2;
        if ((charset.equals(AbstractC2497k9.A05) || charset.equals(AbstractC2497k9.A01)) && A07() >= 1) {
            cA01 = AbstractC2804pN.A01(AbstractC2918rc.A00(this.A00[this.A02]));
            i2 = 1;
        } else if ((charset.equals(AbstractC2497k9.A02) || charset.equals(AbstractC2497k9.A03)) && A07() >= 2) {
            cA01 = AbstractC2804pN.A00(this.A00[this.A02], this.A00[this.A02 + 1]);
            i2 = 2;
        } else {
            if (!charset.equals(AbstractC2497k9.A04) || A07() < 2) {
                return (char) 0;
            }
            cA01 = AbstractC2804pN.A00(this.A00[this.A02 + 1], this.A00[this.A02]);
            i2 = 2;
        }
        if (!AbstractC2804pN.A04(cArr, cA01)) {
            return (char) 0;
        }
        this.A02 += i2;
        char character = AbstractC2804pN.A01(cA01);
        return character;
    }

    private int A01(Charset charset) {
        int i2;
        if (charset.equals(AbstractC2497k9.A05) || charset.equals(AbstractC2497k9.A01)) {
            i2 = 1;
        } else if (charset.equals(AbstractC2497k9.A02) || charset.equals(AbstractC2497k9.A04) || charset.equals(AbstractC2497k9.A03)) {
            i2 = 2;
        } else {
            throw new IllegalArgumentException(A03(95, 21, 50) + charset);
        }
        for (int i3 = this.A02; i3 < i - (i2 - 1); i3 += i2) {
            if ((charset.equals(AbstractC2497k9.A05) || charset.equals(AbstractC2497k9.A01)) && C5C.A16(this.A00[i3])) {
                return i3;
            }
            if ((charset.equals(AbstractC2497k9.A02) || charset.equals(AbstractC2497k9.A03)) && this.A00[i3] == 0 && C5C.A16(this.A00[i3 + 1])) {
                return i3;
            }
            if (charset.equals(AbstractC2497k9.A04) && this.A00[i3 + 1] == 0 && C5C.A16(this.A00[i3])) {
                return i3;
            }
        }
        int stride = this.A01;
        return stride;
    }

    private final String A02(char c2) {
        if (A07() == 0) {
            return null;
        }
        int i2 = this.A02;
        while (i2 < stringLimit) {
            int stringLimit = this.A00[i2];
            if (stringLimit == c2) {
                break;
            }
            i2++;
        }
        byte[] bArr = this.A00;
        int i3 = this.A02;
        int stringLimit2 = this.A02;
        String strA0r = C5C.A0r(bArr, i3, i2 - stringLimit2);
        this.A02 = i2;
        int i4 = this.A02;
        int stringLimit3 = this.A01;
        if (i4 < stringLimit3) {
            int stringLimit4 = this.A02;
            this.A02 = stringLimit4 + 1;
        }
        return strA0r;
    }

    private void A05(Charset charset) {
        if (A00(charset, A06) == '\r') {
            A00(charset, A07);
        }
    }

    public final double A06() {
        return Double.longBitsToDouble(A0P());
    }

    public final int A07() {
        return this.A01 - this.A02;
    }

    public final int A08() {
        return this.A00.length;
    }

    public final int A09() {
        return this.A02;
    }

    public final int A0A() {
        return this.A01;
    }

    public final int A0B() {
        return this.A00[this.A02] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = i3 | ((bArr2[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        byte[] bArr3 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        int i7 = i5 | ((bArr3[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        byte[] bArr4 = this.A00;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return i7 | (bArr4[i8] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final int A0D() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = i3 | ((bArr2[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        byte[] bArr3 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        return i5 | (bArr3[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = i3 | ((bArr2[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        byte[] bArr3 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        int i7 = i5 | ((bArr3[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        byte[] bArr4 = this.A00;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return i7 | ((bArr4[i8] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
    }

    public final int A0F() {
        int iA0E = A0E();
        if (iA0E >= 0) {
            return iA0E;
        }
        throw new IllegalStateException(A03(77, 18, 23) + iA0E);
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return i3 | ((bArr2[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public final int A0H() {
        int b2 = A0I();
        int b1 = A0I();
        int b4 = A0I();
        int b3 = A0I();
        int b5 = (b2 << 21) | (b1 << 14);
        int b6 = b4 << 7;
        return b5 | b6 | b3;
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        return bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int A0J() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = i3 | (bArr2[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        int result = this.A02;
        this.A02 = result + 2;
        return i5;
    }

    public final int A0K() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = i3 | ((bArr2[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        byte[] bArr3 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        return i5 | (bArr3[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final int A0L() {
        int iA0C = A0C();
        if (iA0C >= 0) {
            return iA0C;
        }
        throw new IllegalStateException(A03(77, 18, 23) + iA0C);
    }

    public final int A0M() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return i3 | (bArr2[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final long A0N() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j = ((long) bArr[i2]) & 255;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j2 = j | ((((long) bArr2[i3]) & 255) << 8);
        byte[] bArr3 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        long j3 = j2 | ((((long) bArr3[i4]) & 255) << 16);
        byte[] bArr4 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        long j4 = j3 | ((((long) bArr4[i5]) & 255) << 24);
        byte[] bArr5 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        long j5 = j4 | ((((long) bArr5[i6]) & 255) << 32);
        byte[] bArr6 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        long j6 = j5 | ((((long) bArr6[i7]) & 255) << 40);
        byte[] bArr7 = this.A00;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        long j7 = j6 | ((((long) bArr7[i8]) & 255) << 48);
        byte[] bArr8 = this.A00;
        int i9 = this.A02;
        this.A02 = i9 + 1;
        return j7 | ((255 & ((long) bArr8[i9])) << 56);
    }

    public final long A0O() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j = ((long) bArr[i2]) & 255;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j2 = j | ((((long) bArr2[i3]) & 255) << 8);
        byte[] bArr3 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        long j3 = j2 | ((((long) bArr3[i4]) & 255) << 16);
        byte[] bArr4 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return j3 | ((255 & ((long) bArr4[i5])) << 24);
    }

    public final long A0P() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j = (((long) bArr[i2]) & 255) << 56;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j2 = j | ((((long) bArr2[i3]) & 255) << 48);
        byte[] bArr3 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        long j3 = j2 | ((((long) bArr3[i4]) & 255) << 40);
        byte[] bArr4 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        long j4 = j3 | ((((long) bArr4[i5]) & 255) << 32);
        byte[] bArr5 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        long j5 = j4 | ((((long) bArr5[i6]) & 255) << 24);
        byte[] bArr6 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        long j6 = j5 | ((((long) bArr6[i7]) & 255) << 16);
        byte[] bArr7 = this.A00;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        long j7 = j6 | ((((long) bArr7[i8]) & 255) << 8);
        byte[] bArr8 = this.A00;
        int i9 = this.A02;
        this.A02 = i9 + 1;
        return j7 | (255 & ((long) bArr8[i9]));
    }

    public final long A0Q() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j = (((long) bArr[i2]) & 255) << 24;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j2 = j | ((((long) bArr2[i3]) & 255) << 16);
        byte[] bArr3 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        long j3 = j2 | ((((long) bArr3[i4]) & 255) << 8);
        byte[] bArr4 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return j3 | (255 & ((long) bArr4[i5]));
    }

    public final long A0R() {
        long jA0P = A0P();
        if (jA0P >= 0) {
            return jA0P;
        }
        throw new IllegalStateException(A03(77, 18, 23) + jA0P);
    }

    public final long A0S() {
        int i2 = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j = bArr[length];
        int i3 = 7;
        while (true) {
            if (A04[3].length() == 11) {
                throw new RuntimeException();
            }
            A04[0] = "oMNWSgm03bScuVXxVZmUeRStw4NVi0TN";
            if (i3 < 0) {
                break;
            }
            int length2 = 1 << i3;
            long value = length2;
            if ((value & j) == 0) {
                if (i3 < 6) {
                    int length3 = 1 << i3;
                    j &= (long) (length3 - 1);
                    i2 = 7 - i3;
                    break;
                }
                if (i3 != 7) {
                    break;
                }
                i2 = 1;
                break;
            }
            i3--;
        }
        if (i2 != 0) {
            int i4 = 1;
            while (i4 < i2) {
                byte[] bArr2 = this.A00;
                int length4 = this.A02;
                byte b2 = bArr2[length4 + i4];
                if ((b2 & 192) == 128) {
                    int length5 = b2 & 63;
                    j = (j << 6) | ((long) length5);
                    if (A04[3].length() != 11) {
                        A04[2] = "QkYn4WhdN3Bc00ITVAtZ7M0H0JKEG2qx";
                        i4++;
                    } else {
                        i4++;
                    }
                } else {
                    throw new NumberFormatException(A03(0, 42, 72) + j);
                }
            }
            int length6 = this.A02;
            this.A02 = length6 + i2;
            return j;
        }
        throw new NumberFormatException(A03(42, 35, 80) + j);
    }

    public final String A0T() {
        return A0Y(AbstractC2497k9.A05);
    }

    public final String A0U() {
        return A02((char) 0);
    }

    public final String A0V(int i2) {
        if (i2 == 0) {
            return A03(0, 0, 97);
        }
        int i3 = i2;
        int stringLength = this.A02;
        int lastIndex = (stringLength + i2) - 1;
        int stringLength2 = this.A01;
        if (lastIndex < stringLength2) {
            int stringLength3 = this.A00[lastIndex];
            if (stringLength3 == 0) {
                i3--;
            }
        }
        byte[] bArr = this.A00;
        int stringLength4 = this.A02;
        String strA0r = C5C.A0r(bArr, stringLength4, i3);
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i2;
        return strA0r;
    }

    public final String A0W(int i2) {
        return A0X(i2, AbstractC2497k9.A05);
    }

    public final String A0X(int i2, Charset charset) {
        String str = new String(this.A00, this.A02, i2, charset);
        this.A02 += i2;
        return str;
    }

    public final String A0Y(Charset charset) {
        AbstractC10843y.A09(A05.contains(charset), A03(95, 21, 50) + charset);
        if (A07() == 0) {
            return null;
        }
        if (!charset.equals(AbstractC2497k9.A01)) {
            A0Z();
        }
        int iA01 = A01(charset);
        int lineLimit = this.A02;
        String strA0X = A0X(iA01 - lineLimit, charset);
        int i2 = this.A02;
        int lineLimit2 = this.A01;
        if (i2 == lineLimit2) {
            return strA0X;
        }
        A05(charset);
        return strA0X;
    }

    public final Charset A0Z() {
        if (A07() >= 3 && this.A00[this.A02] == -17 && this.A00[this.A02 + 1] == -69 && this.A00[this.A02 + 2] == -65) {
            this.A02 += 3;
            return AbstractC2497k9.A05;
        }
        if (A07() >= 2) {
            if (this.A00[this.A02] == -2) {
                byte[] bArr = this.A00;
                int i2 = this.A02;
                if (A04[0].charAt(23) != 't') {
                    throw new RuntimeException();
                }
                A04[1] = "9QZAaK9H1E15SkUu26Oe";
                if (bArr[i2 + 1] == -1) {
                    this.A02 += 2;
                    return AbstractC2497k9.A03;
                }
            }
            if (this.A00[this.A02] == -1 && this.A00[this.A02 + 1] == -2) {
                this.A02 += 2;
                return AbstractC2497k9.A04;
            }
            return null;
        }
        return null;
    }

    public final short A0a() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return (short) (i3 | ((bArr2[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
    }

    public final short A0b() {
        byte[] bArr = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        byte[] bArr2 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return (short) (i3 | (bArr2[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public final void A0c(int i2) {
        if (i2 > A08()) {
            this.A00 = Arrays.copyOf(this.A00, i2);
        }
    }

    public final void A0d(int i2) {
        A0j(A08() < i2 ? new byte[i2] : this.A00, i2);
        String[] strArr = A04;
        if (strArr[5].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A04[3] = "3F79npZxDc4PfqkC8vfulVLdM";
    }

    public final void A0e(int i2) {
        AbstractC10843y.A07(i2 >= 0 && i2 <= this.A00.length);
        this.A01 = i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public final void A0f(int i2) {
        boolean z2;
        if (i2 >= 0) {
            int i3 = this.A01;
            String[] strArr = A04;
            if (strArr[4].charAt(20) != strArr[7].charAt(20)) {
                throw new RuntimeException();
            }
            A04[3] = "UMwuHioqOI4Z";
            if (i2 <= i3) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        AbstractC10843y.A07(z2);
        this.A02 = i2;
    }

    public final void A0g(int i2) {
        A0f(this.A02 + i2);
    }

    public final void A0h(C11064u c11064u, int i2) {
        A0k(c11064u.A00, 0, i2);
        c11064u.A08(0);
    }

    public final void A0i(byte[] bArr) {
        A0j(bArr, bArr.length);
    }

    public final void A0j(byte[] bArr, int i2) {
        this.A00 = bArr;
        this.A01 = i2;
        this.A02 = 0;
    }

    public final void A0k(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.A00, this.A02, bArr, i2, i3);
        this.A02 += i3;
    }

    public final byte[] A0l() {
        return this.A00;
    }
}

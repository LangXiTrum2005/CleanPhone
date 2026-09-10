package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1576fq {
    public static byte[] A03;
    public static String[] A04 = {"sgZHF6WMmNxVNdT9Mvl6Q6eeNMrwMOQZ", "jGwn8aeGQCxBekE5FDCkmDw7GrnOmTWR", "0y8vMtDCGrbVU8SscKTuCWVKvyPZNN9Z", "1cf8sYJm05YI0H75zbqk3Isx5IhXC0R7", "RnxjHFNoW9S", "3CaCneN7411g617UmyF9jQBTzqrPlwcf", "IDDsILUBRhrpc1euPTRCRNr2seKql7oY", "kBhvxkQf94zBJaZRERNvuDiNxBHjsyP5"};
    public static final Set<Charset> A05;
    public static final char[] A06;
    public static final char[] A07;
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[0].charAt(22) != 'e') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[2] = "2nOv0WyHq1Pd1PfBQVHUVKbkSKSWcZRN";
            strArr[7] = "8oZvcmEd48OR3iG9WtUW0yYKO7XoUIjF";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            i4++;
        }
    }

    public static void A04() {
        A03 = new byte[]{70, 97, 121, 110, 99, 102, 107, 47, 90, 91, 73, 34, 55, 47, 124, 106, 126, 122, 106, 97, 108, 106, 47, 108, 96, 97, 123, 102, 97, 122, 110, 123, 102, 96, 97, 47, 109, 118, 123, 106, 53, 47, 96, 71, 95, 72, 69, 64, 77, 9, 124, 125, 111, 4, 17, 9, 90, 76, 88, 92, 76, 71, 74, 76, 9, 79, 64, 91, 90, 93, 9, 75, 80, 93, 76, 19, 9, 30, 37, 58, 106, 40, 35, 62, 106, 36, 37, 62, 106, 48, 47, 56, 37, 112, 106, 36, 31, 2, 4, 1, 1, 30, 3, 5, 20, 21, 81, 18, 25, cw.n, 3, 2, 20, 5, 75, 81};
    }

    static {
        A04();
        A06 = new char[]{'\r', '\n'};
        A07 = new char[]{'\n'};
        A05 = MetaExoPlayerCustomizedCollections.A05(AbstractC1686hd.A02, AbstractC1686hd.A06, AbstractC1686hd.A03, AbstractC1686hd.A04, AbstractC1686hd.A05);
    }

    public C1576fq() {
        this.A00 = AbstractC1600gE.A07;
    }

    public C1576fq(int i) {
        this.A00 = new byte[i];
        this.A01 = i;
    }

    public C1576fq(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C1576fq(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
    }

    private char A00(Charset charset, char[] cArr) {
        char cA01;
        int i;
        if ((charset.equals(AbstractC1686hd.A06) || charset.equals(AbstractC1686hd.A02)) && A07() >= 1) {
            cA01 = AbstractC1258ad.A01(AbstractC2097op.A00(this.A00[this.A02]));
            i = 1;
        } else if ((charset.equals(AbstractC1686hd.A03) || charset.equals(AbstractC1686hd.A04)) && A07() >= 2) {
            cA01 = AbstractC1258ad.A00(this.A00[this.A02], this.A00[this.A02 + 1]);
            i = 2;
        } else {
            if (!charset.equals(AbstractC1686hd.A05) || A07() < 2) {
                return (char) 0;
            }
            cA01 = AbstractC1258ad.A00(this.A00[this.A02 + 1], this.A00[this.A02]);
            i = 2;
        }
        if (!AbstractC1258ad.A04(cArr, cA01)) {
            return (char) 0;
        }
        this.A02 += i;
        char character = AbstractC1258ad.A01(cA01);
        return character;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:66:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private int A01(Charset charset) {
        int i;
        boolean zEquals;
        int i2;
        if (charset.equals(AbstractC1686hd.A06) || charset.equals(AbstractC1686hd.A02)) {
            i = 1;
        } else {
            boolean zEquals2 = charset.equals(AbstractC1686hd.A03);
            int i3 = A04[6].charAt(10);
            if (i3 != 114) {
                A04[5] = "LsxENU2CPGpaB5svVrFD377hz2jbh14K";
                if (!zEquals2) {
                    if (!charset.equals(AbstractC1686hd.A05) && !charset.equals(AbstractC1686hd.A04)) {
                        throw new IllegalArgumentException(A03(95, 21, 7) + charset);
                    }
                }
            } else {
                A04[6] = "RM50YVmXC7rX9eBe5HAHUSVnQyF0PSoI";
                if (!zEquals2) {
                    if (!charset.equals(AbstractC1686hd.A05)) {
                        throw new IllegalArgumentException(A03(95, 21, 7) + charset);
                    }
                }
            }
            i = 2;
        }
        for (int i4 = this.A02; i4 < i - (i - 1); i4 += i) {
            boolean zEquals3 = charset.equals(AbstractC1686hd.A06);
            int i5 = A04[0].charAt(22);
            if (i5 != 101) {
                throw new RuntimeException();
            }
            A04[5] = "kr0nrvqLQI63b6zdvl48e25LzLZgy5Yn";
            if ((zEquals3 || charset.equals(AbstractC1686hd.A02)) && AbstractC1600gE.A16(this.A00[i4])) {
                return i4;
            }
            boolean zEquals4 = charset.equals(AbstractC1686hd.A03);
            int i6 = A04[4].length();
            if (i6 != 10) {
                A04[4] = "EjYhko3Yila0";
                if (!zEquals4) {
                    zEquals = charset.equals(AbstractC1686hd.A04);
                    i2 = A04[6].charAt(10);
                    if (i2 != 114) {
                        throw new RuntimeException();
                    }
                    A04[4] = "IHZGXntpU11GnTLE5ebG2qUBH80DT5";
                    if (zEquals) {
                    }
                }
                if (!charset.equals(AbstractC1686hd.A05) && this.A00[i4 + 1] == 0 && AbstractC1600gE.A16(this.A00[i4])) {
                    return i4;
                }
            } else {
                A04[6] = "GLcpl94GSkrjelUgp4dvMwibaqzHjuxU";
                if (!zEquals4) {
                    zEquals = charset.equals(AbstractC1686hd.A04);
                    i2 = A04[6].charAt(10);
                    if (i2 != 114) {
                        throw new RuntimeException();
                    }
                    A04[4] = "IHZGXntpU11GnTLE5ebG2qUBH80DT5";
                    if (zEquals) {
                    }
                }
                if (!charset.equals(AbstractC1686hd.A05)) {
                }
            }
            if (this.A00[i4] == 0 && AbstractC1600gE.A16(this.A00[i4 + 1])) {
                return i4;
            }
            if (!charset.equals(AbstractC1686hd.A05)) {
            }
        }
        int stride = this.A01;
        return stride;
    }

    private final String A02(char c) {
        if (A07() == 0) {
            return null;
        }
        int i = this.A02;
        while (i < stringLimit) {
            int stringLimit = this.A00[i];
            if (stringLimit == c) {
                break;
            }
            i++;
        }
        byte[] bArr = this.A00;
        int i2 = this.A02;
        int stringLimit2 = this.A02;
        String strA0r = AbstractC1600gE.A0r(bArr, i2, i - stringLimit2);
        this.A02 = i;
        int i3 = this.A02;
        int stringLimit3 = this.A01;
        if (i3 < stringLimit3) {
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
        return this.A00[this.A02] & 255;
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 16);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr3[i5] & 255) << 8);
        byte[] bArr4 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return i6 | (bArr4[i7] & 255);
    }

    public final int A0D() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = ((bArr[i] & 255) << 24) >> 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return i4 | (bArr3[i5] & 255);
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr3[i5] & 255) << 16);
        byte[] bArr4 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return i6 | ((bArr4[i7] & 255) << 24);
    }

    public final int A0F() {
        int iA0E = A0E();
        if (iA0E >= 0) {
            return iA0E;
        }
        throw new IllegalStateException(A03(77, 18, 60) + iA0E);
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return i2 | ((bArr2[i3] & 255) << 8);
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
        int i = this.A02;
        this.A02 = i + 1;
        return bArr[i] & 255;
    }

    public final int A0J() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | (bArr2[i3] & 255);
        int result = this.A02;
        this.A02 = result + 2;
        return i4;
    }

    public final int A0K() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 16;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return i4 | (bArr3[i5] & 255);
    }

    public final int A0L() {
        int iA0C = A0C();
        if (iA0C >= 0) {
            return iA0C;
        }
        throw new IllegalStateException(A03(77, 18, 60) + iA0C);
    }

    public final int A0M() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    public final long A0N() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = ((long) bArr[i]) & 255;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 8);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 16);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        long j4 = j3 | ((((long) bArr4[i4]) & 255) << 24);
        byte[] bArr5 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        long j5 = j4 | ((((long) bArr5[i5]) & 255) << 32);
        byte[] bArr6 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        long j6 = j5 | ((((long) bArr6[i6]) & 255) << 40);
        byte[] bArr7 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        long j7 = j6 | ((((long) bArr7[i7]) & 255) << 48);
        byte[] bArr8 = this.A00;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return j7 | ((255 & ((long) bArr8[i8])) << 56);
    }

    public final long A0O() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = ((long) bArr[i]) & 255;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 8);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 16);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return j3 | ((255 & ((long) bArr4[i4])) << 24);
    }

    public final long A0P() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 48);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 40);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        long j4 = j3 | ((((long) bArr4[i4]) & 255) << 32);
        byte[] bArr5 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        long j5 = j4 | ((((long) bArr5[i5]) & 255) << 24);
        byte[] bArr6 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        long j6 = j5 | ((((long) bArr6[i6]) & 255) << 16);
        byte[] bArr7 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        long j7 = j6 | ((((long) bArr7[i7]) & 255) << 8);
        byte[] bArr8 = this.A00;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return j7 | (255 & ((long) bArr8[i8]));
    }

    public final long A0Q() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 16);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 8);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return j3 | (255 & ((long) bArr4[i4]));
    }

    public final long A0R() {
        long jA0P = A0P();
        if (jA0P >= 0) {
            return jA0P;
        }
        throw new IllegalStateException(A03(77, 18, 60) + jA0P);
    }

    public final long A0S() {
        int i = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j = bArr[length];
        for (int i2 = 7; i2 >= 0; i2--) {
            int i3 = 1 << i2;
            String[] strArr = A04;
            String str = strArr[2];
            String str2 = strArr[7];
            int iCharAt = str.charAt(3);
            int length2 = str2.charAt(3);
            if (iCharAt != length2) {
                throw new RuntimeException();
            }
            A04[4] = "ETCZXvmlxAco69DMc1yhp35R898zYg2c";
            if ((((long) i3) & j) == 0) {
                if (i2 < 6) {
                    int length3 = 1 << i2;
                    j &= (long) (length3 - 1);
                    i = 7 - i2;
                    break;
                }
                if (i2 != 7) {
                    break;
                }
                i = 1;
                break;
            }
        }
        if (i != 0) {
            for (int x = 1; x < i; x++) {
                byte[] bArr2 = this.A00;
                int length4 = this.A02;
                byte b = bArr2[length4 + x];
                if (A04[6].charAt(10) != 'r') {
                    if ((b & 192) == 128) {
                        int length5 = b & 63;
                        j = (j << 6) | ((long) length5);
                    } else {
                        throw new NumberFormatException(A03(0, 42, 121) + j);
                    }
                } else {
                    A04[0] = "ABLHFtiHTBntQUf582rh98ec122CeBpJ";
                    if ((b & 192) == 128) {
                        int length6 = b & 63;
                        j = (j << 6) | ((long) length6);
                    } else {
                        throw new NumberFormatException(A03(0, 42, 121) + j);
                    }
                }
            }
            int x2 = this.A02;
            int i4 = x2 + i;
            if (A04[4].length() == 10) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[1] = "SnOiIeyqmXHOny9ULGbkAWIlY2fxst1T";
            strArr2[3] = "n7vuYFEmJGDN0NemylZkb0tXGkCP6fKV";
            this.A02 = i4;
            return j;
        }
        throw new NumberFormatException(A03(42, 35, 95) + j);
    }

    public final String A0T() {
        return A0Y(AbstractC1686hd.A06);
    }

    public final String A0U() {
        return A02((char) 0);
    }

    public final String A0V(int i) {
        if (i == 0) {
            return A03(0, 0, 82);
        }
        int i2 = i;
        int stringLength = this.A02;
        int lastIndex = (stringLength + i) - 1;
        int stringLength2 = this.A01;
        if (lastIndex < stringLength2) {
            int stringLength3 = this.A00[lastIndex];
            if (stringLength3 == 0) {
                i2--;
            }
        }
        byte[] bArr = this.A00;
        int stringLength4 = this.A02;
        String strA0r = AbstractC1600gE.A0r(bArr, stringLength4, i2);
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i;
        return strA0r;
    }

    public final String A0W(int i) {
        return A0X(i, AbstractC1686hd.A06);
    }

    public final String A0X(int i, Charset charset) {
        String str = new String(this.A00, this.A02, i, charset);
        this.A02 += i;
        return str;
    }

    public final String A0Y(Charset charset) {
        AbstractC1517es.A09(A05.contains(charset), A03(95, 21, 7) + charset);
        if (A07() == 0) {
            return null;
        }
        if (!charset.equals(AbstractC1686hd.A02)) {
            A0Z();
        }
        int iA01 = A01(charset);
        int lineLimit = this.A02;
        String strA0X = A0X(iA01 - lineLimit, charset);
        int i = this.A02;
        String line = A04[0];
        if (line.charAt(22) != 'e') {
            throw new RuntimeException();
        }
        A04[4] = "PcHNAKzW7Id9pw1";
        int lineLimit2 = this.A01;
        if (i == lineLimit2) {
            return strA0X;
        }
        A05(charset);
        return strA0X;
    }

    public final Charset A0Z() {
        if (A07() >= 3 && this.A00[this.A02] == -17 && this.A00[this.A02 + 1] == -69 && this.A00[this.A02 + 2] == -65) {
            this.A02 += 3;
            return AbstractC1686hd.A06;
        }
        if (A07() >= 2) {
            if (this.A00[this.A02] == -2 && this.A00[this.A02 + 1] == -1) {
                this.A02 += 2;
                if (A04[6].charAt(10) != 'r') {
                    throw new RuntimeException();
                }
                A04[5] = "VycTU3eqfjfr47GcRLoMj5IUz22El6lK";
                return AbstractC1686hd.A04;
            }
            if (this.A00[this.A02] == -1 && this.A00[this.A02 + 1] == -2) {
                this.A02 += 2;
                return AbstractC1686hd.A05;
            }
            return null;
        }
        return null;
    }

    public final short A0a() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (short) (i2 | ((bArr2[i3] & 255) << 8));
    }

    public final short A0b() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (short) (i2 | (bArr2[i3] & 255));
    }

    public final void A0c(int i) {
        if (i > A08()) {
            this.A00 = Arrays.copyOf(this.A00, i);
        }
    }

    public final void A0d(int i) {
        A0j(A08() < i ? new byte[i] : this.A00, i);
    }

    public final void A0e(int i) {
        AbstractC1517es.A07(i >= 0 && i <= this.A00.length);
        this.A01 = i;
    }

    public final void A0f(int i) {
        AbstractC1517es.A07(i >= 0 && i <= this.A01);
        this.A02 = i;
    }

    public final void A0g(int i) {
        A0f(this.A02 + i);
    }

    public final void A0h(C1575fp c1575fp, int i) {
        A0k(c1575fp.A00, 0, i);
        c1575fp.A08(0);
    }

    public final void A0i(byte[] bArr) {
        A0j(bArr, bArr.length);
    }

    public final void A0j(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
        this.A02 = 0;
    }

    public final void A0k(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A00, this.A02, bArr, i, i2);
        this.A02 += i2;
    }

    public final byte[] A0l() {
        return this.A00;
    }
}

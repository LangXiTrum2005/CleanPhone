package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.ColorInfo;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class HS {
    public static byte[] A00;
    public static int[] A01;
    public static String[] A02 = {"unNLyNh5FR3GyMG68d", "fnHIAbwwkFQ1ZGNlnsc", "DMpYp1jOlcNpO4pJgPWh22Zerf91QM8t", "RZoQ8h3", "L8G6Aqwau6BJqNFKfla", "ElXYWWCxJdBggdMs0Hio0yCYqdZAyfAp", "A3sl", "vST53OIiICW6hrmD3wtDRemD3zmWyZSx"};
    public static final byte[] A03;
    public static final float[] A04;
    public static final Object A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static HP A06(byte[] bArr, int i2, int i3) {
        HU hu = new HU(bArr, i2, i3);
        int iA00 = -1;
        int i4 = -1;
        int iA01 = -1;
        hu.A07(4);
        int iA05 = hu.A05(3);
        hu.A06();
        int iA06 = hu.A05(2);
        boolean zA0A = hu.A0A();
        int iA07 = hu.A05(5);
        int i5 = 0;
        int i6 = 0;
        while (A02[0].length() != 10) {
            String[] strArr = A02;
            strArr[2] = "xkwe1O9uU2dqAY7xWUY4fbTlKQKyvcwL";
            strArr[7] = "HeYhRuPqM40BhEn67WYdTTzYcbU6v3bu";
            if (i6 >= 32) {
                int[] iArr = new int[6];
                for (int i7 = 0; i7 < iArr.length; i7++) {
                    iArr[i7] = hu.A05(8);
                }
                int iA08 = hu.A05(8);
                int i8 = 0;
                for (int i9 = 0; i9 < iA05; i9++) {
                    if (hu.A0A()) {
                        i8 += 89;
                    }
                    if (hu.A0A()) {
                        i8 += 8;
                    }
                }
                hu.A07(i8);
                if (iA05 > 0) {
                    hu.A07((8 - iA05) * 2);
                }
                int iA04 = hu.A04();
                int iA09 = hu.A04();
                if (iA09 == 3) {
                    hu.A06();
                }
                int iA010 = hu.A04();
                int iA011 = hu.A04();
                if (hu.A0A()) {
                    int iA012 = hu.A04();
                    int iA013 = hu.A04();
                    int iA014 = hu.A04();
                    int iA015 = hu.A04();
                    iA010 -= (iA012 + iA013) * ((iA09 == 1 || iA09 == 2) ? 2 : 1);
                    int i10 = (iA014 + iA015) * (iA09 == 1 ? 2 : 1);
                    String[] strArr2 = A02;
                    if (strArr2[4].length() != strArr2[1].length()) {
                        A02[6] = "Hn3sdMz19WVmWCBK";
                        iA011 -= i10;
                    } else {
                        A02[3] = "Jz4JSkPN0248kFDgiRzzjLGO7q";
                        iA011 -= i10;
                    }
                }
                hu.A04();
                hu.A04();
                int iA016 = hu.A04();
                for (int i11 = hu.A0A() ? 0 : iA05; i11 <= iA05; i11++) {
                    hu.A04();
                    hu.A04();
                    hu.A04();
                }
                hu.A04();
                hu.A04();
                hu.A04();
                hu.A04();
                hu.A04();
                hu.A04();
                if (hu.A0A() && hu.A0A()) {
                    A0D(hu);
                }
                hu.A07(2);
                if (hu.A0A()) {
                    hu.A07(8);
                    hu.A04();
                    hu.A04();
                    hu.A06();
                }
                A0E(hu);
                if (hu.A0A()) {
                    for (int i12 = 0; i12 < hu.A04(); i12++) {
                        hu.A07(iA016 + 4 + 1);
                    }
                }
                hu.A07(2);
                float f = 1.0f;
                boolean zA0A2 = hu.A0A();
                if (A02[0].length() == 10) {
                    break;
                }
                String[] strArr3 = A02;
                strArr3[2] = "CMlgeA8zQVByZrA2VMXzsS0jeMyo18qQ";
                strArr3[7] = "QAK33uwHUZwexufQvU3o8DPmyRQmvUMz";
                if (zA0A2) {
                    if (hu.A0A()) {
                        int iA017 = hu.A05(8);
                        if (iA017 == 255) {
                            int iA018 = hu.A05(16);
                            int iA019 = hu.A05(16);
                            if (iA018 != 0 && iA019 != 0) {
                                f = iA018 / iA019;
                            }
                        } else if (iA017 < A04.length) {
                            f = A04[iA017];
                        } else {
                            AbstractC10924g.A07(A0B(0, 11, 63), A0B(11, 35, 126) + iA017);
                        }
                    }
                    if (hu.A0A()) {
                        hu.A06();
                    }
                    if (hu.A0A()) {
                        hu.A07(3);
                        boolean zA0A3 = hu.A0A();
                        if (hu.A0A()) {
                            int iA020 = hu.A05(8);
                            int iA021 = hu.A05(8);
                            hu.A07(8);
                            iA00 = ColorInfo.A00(iA020);
                            i4 = zA0A3 ? 1 : 2;
                            if (A02[6].length() != 3) {
                                A02[0] = "HGrGkdvIc2AkT14Ejxxa4aXBUNVha";
                                iA01 = ColorInfo.A01(iA021);
                            } else {
                                iA01 = ColorInfo.A01(iA021);
                            }
                        }
                    }
                    if (hu.A0A()) {
                        hu.A04();
                        hu.A04();
                    }
                    hu.A06();
                    if (hu.A0A()) {
                        iA011 *= 2;
                    }
                }
                return new HP(iA06, zA0A, iA07, i5, iArr, iA08, iA04, iA010, iA011, f, iA00, i4, iA01);
            }
            if (hu.A0A()) {
                i5 |= 1 << i6;
            }
            i6++;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:54:0x0100  */
    /* JADX WARN: Code duplicated, block: B:62:0x0123  */
    /* JADX WARN: Code duplicated, block: B:68:0x013c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0141  */
    /* JADX WARN: Code duplicated, block: B:71:0x0146  */
    /* JADX WARN: Code duplicated, block: B:72:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0170  */
    /* JADX WARN: Code duplicated, block: B:75:0x0173  */
    /* JADX WARN: Code duplicated, block: B:77:0x0178  */
    /* JADX WARN: Code duplicated, block: B:78:0x017a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0185  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:87:0x01be A[LOOP:0: B:85:0x01b9->B:87:0x01be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01dc  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static HR A0A(byte[] bArr, int i2, int i3) {
        int iA04;
        int iA05;
        boolean zA0A;
        String[] strArr;
        long jA04;
        String[] strArr2;
        int i4;
        boolean zA0A2;
        int i5;
        int i6;
        float f;
        int iA06;
        int iA07;
        int iA08;
        int i7;
        int i8;
        HU hu = new HU(bArr, i2, i3);
        int iA09 = hu.A05(8);
        int iA010 = hu.A05(8);
        int iA011 = hu.A05(8);
        int iA012 = hu.A04();
        int iA013 = 1;
        boolean zA0A3 = false;
        if (iA09 != 100 && iA09 != 110 && iA09 != 122 && iA09 != 244 && iA09 != 44 && iA09 != 83 && iA09 != 86 && iA09 != 118 && iA09 != 128 && iA09 != 138) {
            int iA014 = hu.A04() + 4;
            iA04 = hu.A04();
            iA05 = 0;
            zA0A = false;
            if (iA04 == 0) {
                iA05 = hu.A04() + 4;
                if (A02[5].charAt(3) != 'Y') {
                    A02[3] = "2NWfLRVEjhOO9";
                } else {
                    A02[5] = "fn7YpbzvxXlInri96XbQTTrdseuocXrx";
                }
            } else if (iA04 == 1) {
                zA0A = hu.A0A();
                hu.A03();
                hu.A03();
                jA04 = hu.A04();
                strArr2 = A02;
                if (strArr2[4].length() == strArr2[1].length()) {
                    String[] strArr3 = A02;
                    strArr3[2] = "sL3yo27N596gnAOXUx3X3jVDrWZXEmHs";
                    strArr3[7] = "EWRRgQnwInix360952oSCS5kmFFjSZxj";
                    for (i4 = 0; i4 < jA04; i4++) {
                        hu.A04();
                    }
                }
            } else {
                strArr = A02;
                if (strArr[4].length() != strArr[1].length()) {
                    throw new RuntimeException();
                }
                A02[3] = "4FZcyZVF6YdFmLSwekyzJ";
            }
            int iA015 = hu.A04();
            hu.A06();
            int iA016 = hu.A04() + 1;
            int iA017 = hu.A04() + 1;
            zA0A2 = hu.A0A();
            int i9 = (2 - (zA0A2 ? 1 : 0)) * iA017;
            if (!zA0A2) {
                hu.A06();
            }
            hu.A06();
            i5 = iA016 * 16;
            i6 = i9 * 16;
            if (hu.A0A()) {
                int iA018 = hu.A04();
                int iA019 = hu.A04();
                int iA020 = hu.A04();
                int iA021 = hu.A04();
                if (iA013 == 0) {
                    i7 = 1;
                    i8 = 2 - (zA0A2 ? 1 : 0);
                } else {
                    if (iA013 == 3) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                    i8 = (2 - (zA0A2 ? 1 : 0)) * (iA013 == 1 ? 2 : 1);
                }
                i5 -= (iA018 + iA019) * i7;
                i6 -= (iA020 + iA021) * i8;
            }
            f = 1.0f;
            if (hu.A0A()) {
                iA06 = hu.A05(8);
                if (iA06 == 255) {
                    iA07 = hu.A05(16);
                    iA08 = hu.A05(16);
                    if (iA07 != 0) {
                        f = iA07 / iA08;
                    }
                } else if (iA06 < A04.length) {
                    f = A04[iA06];
                } else {
                    AbstractC10924g.A07(A0B(0, 11, 63), A0B(11, 35, 126) + iA06);
                }
            }
            return new HR(iA09, iA010, iA011, iA012, iA015, i5, i6, f, zA0A3, zA0A2, iA014, iA04, iA05, zA0A);
        }
        iA013 = hu.A04();
        zA0A3 = iA013 == 3 ? hu.A0A() : false;
        hu.A04();
        hu.A04();
        hu.A06();
        boolean zA0A4 = hu.A0A();
        if (A02[0].length() != 10) {
            A02[0] = "qzm7RlaVhvQtMB0zhtauZ";
            if (zA0A4) {
                int i10 = iA013 != 3 ? 8 : 12;
                int i11 = 0;
                while (i11 < i10) {
                    if (hu.A0A()) {
                        A0F(hu, i11 < 6 ? 16 : 64);
                    }
                    i11++;
                }
            }
            int iA0110 = hu.A04() + 4;
            iA04 = hu.A04();
            iA05 = 0;
            zA0A = false;
            if (iA04 == 0) {
                iA05 = hu.A04() + 4;
                if (A02[5].charAt(3) != 'Y') {
                    A02[3] = "2NWfLRVEjhOO9";
                } else {
                    A02[5] = "fn7YpbzvxXlInri96XbQTTrdseuocXrx";
                }
            } else if (iA04 == 1) {
                zA0A = hu.A0A();
                hu.A03();
                hu.A03();
                jA04 = hu.A04();
                strArr2 = A02;
                if (strArr2[4].length() == strArr2[1].length()) {
                    String[] strArr4 = A02;
                    strArr4[2] = "sL3yo27N596gnAOXUx3X3jVDrWZXEmHs";
                    strArr4[7] = "EWRRgQnwInix360952oSCS5kmFFjSZxj";
                    while (i4 < jA04) {
                        hu.A04();
                    }
                }
            } else {
                strArr = A02;
                if (strArr[4].length() != strArr[1].length()) {
                    throw new RuntimeException();
                }
                A02[3] = "4FZcyZVF6YdFmLSwekyzJ";
            }
            int iA0111 = hu.A04();
            hu.A06();
            int iA0112 = hu.A04() + 1;
            int iA0113 = hu.A04() + 1;
            zA0A2 = hu.A0A();
            int i12 = (2 - (zA0A2 ? 1 : 0)) * iA0113;
            if (!zA0A2) {
                hu.A06();
            }
            hu.A06();
            i5 = iA0112 * 16;
            i6 = i12 * 16;
            if (hu.A0A()) {
                int iA0114 = hu.A04();
                int iA0115 = hu.A04();
                int iA022 = hu.A04();
                int iA023 = hu.A04();
                if (iA013 == 0) {
                    i7 = 1;
                    i8 = 2 - (zA0A2 ? 1 : 0);
                } else {
                    if (iA013 == 3) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                    i8 = (2 - (zA0A2 ? 1 : 0)) * (iA013 == 1 ? 2 : 1);
                }
                i5 -= (iA0114 + iA0115) * i7;
                i6 -= (iA022 + iA023) * i8;
            }
            f = 1.0f;
            if (hu.A0A() && hu.A0A()) {
                iA06 = hu.A05(8);
                if (iA06 == 255) {
                    iA07 = hu.A05(16);
                    iA08 = hu.A05(16);
                    if (iA07 != 0 && iA08 != 0) {
                        f = iA07 / iA08;
                    }
                } else if (iA06 < A04.length) {
                    f = A04[iA06];
                } else {
                    AbstractC10924g.A07(A0B(0, 11, 63), A0B(11, 35, 126) + iA06);
                }
            }
            return new HR(iA09, iA010, iA011, iA012, iA0111, i5, i6, f, zA0A3, zA0A2, iA0110, iA04, iA05, zA0A);
        }
        throw new RuntimeException();
    }

    public static String A0B(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A00 = new byte[]{-7, 12, 23, 0, 25, 20, 31, 0, 31, 20, 23, 63, 88, 79, 98, 90, 79, 77, 94, 79, 78, 10, 75, 93, 90, 79, 77, 94, 73, 92, 75, 94, 83, 89, 73, 83, 78, 77, 10, 96, 75, 86, 95, 79, 36, 10, 66, 53, 48, 49, 59, -5, 45, 66, 47, 23, 10, 5, 6, 16, -48, 9, 6, 23, 4};
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:60:0x0110  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0E(HU hu) {
        int iA04;
        int iA05;
        int[] iArrCopyOf;
        int i2;
        int iA06 = hu.A04();
        int i3 = -1;
        int i4 = -1;
        int[] iArr = new int[0];
        int[] iArrCopyOf2 = new int[0];
        int i5 = 0;
        while (i5 < iA06) {
            if (i5 != 0 && hu.A0A()) {
                int i6 = i3 + i4;
                int iA07 = (1 - ((hu.A0A() ? 1 : 0) * 2)) * (hu.A04() + 1);
                boolean[] zArr = new boolean[i6 + 1];
                for (int i7 = 0; i7 <= i6; i7++) {
                    if (hu.A0A()) {
                        zArr[i7] = true;
                    } else {
                        zArr[i7] = hu.A0A();
                    }
                }
                iA04 = 0;
                int[] iArr2 = new int[i6 + 1];
                int[] iArr3 = new int[i6 + 1];
                for (int i8 = i4 - 1; i8 >= 0; i8--) {
                    int i9 = iArrCopyOf2[i8] + iA07;
                    if (i9 < 0 && zArr[i3 + i8]) {
                        iArr2[iA04] = i9;
                        iA04++;
                    }
                }
                if (iA07 < 0 && zArr[i6]) {
                    iArr2[iA04] = iA07;
                    iA04++;
                }
                for (int i10 = 0; i10 < i3; i10++) {
                    int i11 = iArr[i10] + iA07;
                    if (A02[0].length() == 10) {
                        throw new RuntimeException();
                    }
                    A02[0] = "0xLwbNcICqBOIGnxvrVU0VkzUAjp";
                    if (i11 < 0) {
                        boolean z2 = zArr[i10];
                        if (A02[6].length() != 3) {
                            String[] strArr = A02;
                            strArr[2] = "OJAEm2QqqrF2kr0XAoMunq3AjjwiYhOO";
                            strArr[7] = "NvnxbUpcm9NzKSDUaYgmh21cCcr7HCKV";
                            if (z2) {
                                i2 = iA04 + 1;
                                iArr2[iA04] = i11;
                                if (A02[0].length() != 10) {
                                    A02[0] = "ZxDUqDztknTqk0noe7cSqrpf0";
                                    iA04 = i2;
                                } else {
                                    iA04 = i2;
                                }
                            }
                        } else {
                            String[] strArr2 = A02;
                            strArr2[2] = "O1Oy4mT2J3IqGA0cLz7TSW3zbNH41BLw";
                            strArr2[7] = "bMAFoAVZGrulVErqDQ8z4qjQetYlIImf";
                            if (z2) {
                                i2 = iA04 + 1;
                                iArr2[iA04] = i11;
                                if (A02[0].length() != 10) {
                                    A02[0] = "ZxDUqDztknTqk0noe7cSqrpf0";
                                    iA04 = i2;
                                } else {
                                    iA04 = i2;
                                }
                            }
                        }
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr2, iA04);
                iA05 = 0;
                for (int i12 = i3 - 1; i12 >= 0; i12--) {
                    int i13 = iArr[i12] + iA07;
                    if (i13 > 0 && zArr[i12]) {
                        iArr3[iA05] = i13;
                        iA05++;
                    }
                }
                if (iA07 > 0) {
                    boolean z3 = zArr[i6];
                    String[] strArr3 = A02;
                    if (strArr3[4].length() != strArr3[1].length()) {
                        A02[6] = "tgnVuwGZauQZxVLXvW8ZTDaij";
                        if (z3) {
                            iArr3[iA05] = iA07;
                            iA05++;
                        }
                    } else {
                        A02[0] = "U";
                        if (z3) {
                            iArr3[iA05] = iA07;
                            iA05++;
                        }
                    }
                }
                for (int i14 = 0; i14 < i4; i14++) {
                    int i15 = iArrCopyOf2[i14] + iA07;
                    if (i15 > 0 && zArr[i3 + i14]) {
                        iArr3[iA05] = i15;
                        iA05++;
                    }
                }
                if (A02[5].charAt(3) != 'Y') {
                    A02[5] = "VNLYj4nIEG05kgLFUbTjhWBq9LKgRHZO";
                    iArrCopyOf2 = Arrays.copyOf(iArr3, iA05);
                } else {
                    String[] strArr4 = A02;
                    strArr4[2] = "zCcqrsPkSftUPRel4Z8ZE6iGY8rnHFMe";
                    strArr4[7] = "knHf2kXaFD2hm93xyPTTBZZ0wItiA7C5";
                    iArrCopyOf2 = Arrays.copyOf(iArr3, iA05);
                }
            } else {
                iA04 = hu.A04();
                iA05 = hu.A04();
                iArrCopyOf = new int[iA04];
                for (int i16 = 0; i16 < iA04; i16++) {
                    iArrCopyOf[i16] = hu.A04() + 1;
                    hu.A06();
                }
                iArrCopyOf2 = new int[iA05];
                for (int i17 = 0; i17 < iA05; i17++) {
                    iArrCopyOf2[i17] = hu.A04() + 1;
                    hu.A06();
                }
            }
            i3 = iA04;
            i4 = iA05;
            iArr = iArrCopyOf;
            if (A02[0].length() != 10) {
                String[] strArr5 = A02;
                strArr5[4] = "MHTDjP3q9jqJvcAulQ6";
                strArr5[1] = "VeGKMo1LwbXx0TG7y0g";
                i5++;
            } else {
                i5++;
            }
        }
    }

    static {
        A0C();
        A03 = new byte[]{0, 0, 0, 1};
        A04 = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        A05 = new Object();
        A01 = new int[10];
    }

    public static int A00(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 126) >> 1;
    }

    public static int A01(byte[] bArr, int i2) {
        return bArr[i2 + 3] & 31;
    }

    public static int A02(byte[] bArr, int i2) {
        int i3;
        synchronized (A05) {
            int scratchEscapeCount = 0;
            int i4 = 0;
            while (scratchEscapeCount < i2) {
                scratchEscapeCount = A03(bArr, scratchEscapeCount, i2);
                if (scratchEscapeCount < i2) {
                    if (A01.length <= i4) {
                        A01 = Arrays.copyOf(A01, A01.length * 2);
                    }
                    A01[i4] = scratchEscapeCount;
                    scratchEscapeCount += 3;
                    i4++;
                }
            }
            i3 = i2 - i4;
            int unescapedPosition = 0;
            int escapedPosition = 0;
            for (int unescapedLength = 0; unescapedLength < i4; unescapedLength++) {
                int scratchEscapeCount2 = A01[unescapedLength];
                int scratchEscapeCount3 = scratchEscapeCount2 - unescapedPosition;
                System.arraycopy(bArr, unescapedPosition, bArr, escapedPosition, scratchEscapeCount3);
                int escapedPosition2 = escapedPosition + scratchEscapeCount3;
                int position = escapedPosition2 + 1;
                bArr[escapedPosition2] = 0;
                escapedPosition = position + 1;
                bArr[position] = 0;
                unescapedPosition += scratchEscapeCount3 + 3;
            }
            System.arraycopy(bArr, unescapedPosition, bArr, escapedPosition, i3 - escapedPosition);
        }
        return i3;
    }

    public static int A03(byte[] bArr, int i2, int i3) {
        while (i2 < i) {
            int i4 = bArr[i2];
            if (i4 == 0) {
                int i5 = i2 + 1;
                if (bArr[i5] == 0) {
                    int i6 = i2 + 2;
                    if (bArr[i6] == 3) {
                        return i2;
                    }
                } else {
                    continue;
                }
            }
            i2++;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0138  */
    public static int A04(byte[] bArr, int i2, int i3, boolean[] zArr) {
        boolean z2;
        boolean z3;
        int i4 = i3 - i2;
        AbstractC10843y.A08(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            A0H(zArr);
            int length = i2 - 3;
            return length;
        }
        if (i4 > 1 && zArr[1]) {
            int length2 = bArr[i2];
            if (length2 == 1) {
                A0H(zArr);
                int length3 = i2 - 2;
                return length3;
            }
        }
        if (i4 > 2 && zArr[2]) {
            int length4 = bArr[i2];
            if (length4 == 0) {
                int length5 = i2 + 1;
                byte b2 = bArr[length5];
                if (A02[0].length() == 10) {
                    throw new RuntimeException();
                }
                A02[6] = "PQW9C7kUOKDoPPw";
                if (b2 == 1) {
                    A0H(zArr);
                    int length6 = i2 - 1;
                    return length6;
                }
            }
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            int length7 = bArr[i6];
            if ((length7 & 254) == 0) {
                int length8 = i6 - 2;
                if (bArr[length8] == 0) {
                    int length9 = i6 - 1;
                    if (bArr[length9] == 0) {
                        int length10 = bArr[i6];
                        if (length10 == 1) {
                            A0H(zArr);
                            int length11 = i6 - 2;
                            return length11;
                        }
                    }
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        if (i4 > 2) {
            int length12 = i3 - 3;
            if (bArr[length12] == 0) {
                int length13 = i3 - 2;
                byte b3 = bArr[length13];
                if (A02[6].length() == 3) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[4] = "tLizWOaN0OsagnuSy28";
                strArr[1] = "ZOtg0UvXTXpiFnpoxfp";
                if (b3 == 0) {
                    int length14 = i3 - 1;
                    if (bArr[length14] == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        } else if (i4 == 2) {
            boolean z4 = zArr[2];
            if (A02[5].charAt(3) != 'Y') {
                throw new RuntimeException();
            }
            A02[0] = "TtHOfwpayoR";
            if (z4) {
                int length15 = i3 - 2;
                if (bArr[length15] == 0) {
                    int length16 = i3 - 1;
                    if (bArr[length16] == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        } else if (zArr[1]) {
            int i7 = i3 - 1;
            String[] strArr2 = A02;
            String str = strArr2[2];
            String str2 = strArr2[7];
            int iCharAt = str.charAt(3);
            int length17 = str2.charAt(3);
            if (iCharAt != length17) {
                String[] strArr3 = A02;
                strArr3[2] = "UGNUjS5TseBxte9hZy6MdiMKKivw8YU8";
                strArr3[7] = "gAwFNStsKHXv5jMh5dTnIzvsHbrqE6D6";
                int length18 = bArr[i7];
                if (length18 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                A02[5] = "MYPYXnk67e7ylj87wlpJJbRJ3uYkeY13";
                int length19 = bArr[i7];
                if (length19 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
        } else {
            z2 = false;
        }
        zArr[0] = z2;
        if (i4 > 1) {
            int length20 = i3 - 2;
            if (bArr[length20] == 0) {
                int length21 = i3 - 1;
                if (bArr[length21] == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
        } else if (zArr[2]) {
            int length22 = i3 - 1;
            if (bArr[length22] == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        zArr[1] = z3;
        int length23 = i3 - 1;
        zArr[2] = bArr[length23] == 0;
        return i3;
    }

    public static HP A05(byte[] bArr, int i2, int i3) {
        return A06(bArr, i2 + 2, i3);
    }

    public static HQ A07(byte[] bArr, int i2, int i3) {
        return A08(bArr, i2 + 1, i3);
    }

    public static HQ A08(byte[] bArr, int i2, int i3) {
        HU data = new HU(bArr, i2, i3);
        int iA04 = data.A04();
        int seqParameterSetId = data.A04();
        data.A06();
        return new HQ(iA04, seqParameterSetId, data.A0A());
    }

    public static HR A09(byte[] bArr, int i2, int i3) {
        return A0A(bArr, i2 + 1, i3);
    }

    public static void A0D(HU hu) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int matrixId = 1;
                if (!hu.A0A()) {
                    hu.A04();
                } else {
                    int sizeId = i2 << 1;
                    int iMin = Math.min(64, 1 << (sizeId + 4));
                    if (i2 > 1) {
                        hu.A03();
                    }
                    for (int sizeId2 = 0; sizeId2 < iMin; sizeId2++) {
                        hu.A03();
                    }
                }
                if (i2 == 3) {
                    matrixId = 3;
                }
                i3 += matrixId;
            }
        }
    }

    public static void A0F(HU hu, int i2) {
        int i3 = 8;
        int lastScale = 8;
        for (int nextScale = 0; nextScale < i2; nextScale++) {
            if (lastScale != 0) {
                int lastScale2 = hu.A03();
                lastScale = ((lastScale2 + i3) + 256) % 256;
            }
            if (lastScale != 0) {
                i3 = lastScale;
            }
        }
    }

    public static void A0G(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i2 = 0;
        int value = 0;
        while (length < iPosition) {
            int length = byteBuffer.get(value);
            int offset = length & 255;
            if (i2 == 3) {
                if (offset == 1) {
                    int length2 = value + 1;
                    int consecutiveZeros = byteBuffer.get(length2) & 31;
                    if (consecutiveZeros == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                        int length3 = value - 3;
                        byteBufferDuplicate.position(length3);
                        byteBufferDuplicate.limit(iPosition);
                        byteBuffer.position(0);
                        byteBuffer.put(byteBufferDuplicate);
                        return;
                    }
                }
            } else if (offset == 0) {
                i2++;
            }
            if (offset != 0) {
                i2 = 0;
            }
            value++;
        }
        byteBuffer.clear();
    }

    public static void A0H(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean A0I(String str, byte b2) {
        if (A0B(46, 9, 96).equals(str) && (b2 & 31) == 6) {
            return true;
        }
        return A0B(55, 10, 53).equals(str) && ((b2 & 126) >> 1) == 39;
    }
}

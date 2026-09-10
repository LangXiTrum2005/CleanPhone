package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class HU {
    public static String[] A04 = {"xqK2Lo9z9A1fq6AmzHgSANRckQSbvLg7", "r87Jk1TDX4QDRIaoZWvBkBULXd6iRGy1", "O8Rd55zCWOMZlt38o2yZqibVFCpM9qBW", "4N74z6RiBgc3GZHRgJ9RjrwcKA2Sbu4k", "rTO2Tuhk28L6aGO7sMrwgJqOHaARqGQ4", "wV6nIrgfSj92E7JYn8Dcxr40UnK38ksI", "xhpcFCDiO5Y2wtHgWJ12k6gPj7fKn5Nf", "gVHczwThIZ3ivnhVZg4GXcBO3FodCEeQ"};
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public HU(byte[] bArr, int i2, int i3) {
        A08(bArr, i2, i3);
    }

    private int A00() {
        int i2 = 0;
        while (!A0A()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        int leadingZeros = i2 > 0 ? A05(i2) : 0;
        return i3 + leadingZeros;
    }

    private void A01() {
        AbstractC10843y.A08(this.A02 >= 0 && (this.A02 < this.A01 || (this.A02 == this.A01 && this.A00 == 0)));
        String[] strArr = A04;
        if (strArr[5].charAt(17) == strArr[0].charAt(17)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "rbUb6Xt6pPTA8n7h1lny7mpNeejrLbnq";
        strArr2[1] = "r9GQrTTZLq4j6OnUyTd1FCUw4PnbqYK4";
    }

    private boolean A02(int i2) {
        if (2 <= i2 && i2 < this.A01 && this.A03[i2] == 3 && this.A03[i2 - 2] == 0) {
            byte[] bArr = this.A03;
            String[] strArr = A04;
            if (strArr[3].charAt(14) != strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[3] = "mTSOM4VXL5Qz6aHfzfUvwcrlrHOw2Zy6";
            strArr2[6] = "LbZWpLfoz4TupHHNd8RSjDzMBM5OqJ05";
            if (bArr[i2 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final int A03() {
        int iA00 = A00();
        int codeNum = iA00 % 2;
        int i2 = codeNum == 0 ? -1 : 1;
        int codeNum2 = iA00 + 1;
        return i2 * (codeNum2 / 2);
    }

    public final int A04() {
        return A00();
    }

    public final int A05(int i2) {
        int i3 = 0;
        int returnValue = this.A00;
        this.A00 = returnValue + i2;
        while (true) {
            int returnValue2 = this.A00;
            int i4 = 2;
            if (returnValue2 <= 8) {
                break;
            }
            int returnValue3 = this.A00;
            this.A00 = returnValue3 - 8;
            byte[] bArr = this.A03;
            int returnValue4 = this.A02;
            int i5 = bArr[returnValue4] & 255;
            int returnValue5 = this.A00;
            i3 |= i5 << returnValue5;
            int i6 = this.A02;
            int returnValue6 = this.A02;
            if (!A02(returnValue6 + 1)) {
                i4 = 1;
            }
            this.A02 = i6 + i4;
        }
        byte[] bArr2 = this.A03;
        int returnValue7 = this.A02;
        int i7 = bArr2[returnValue7] & 255;
        int returnValue8 = this.A00;
        int i8 = i3 | (i7 >> (8 - returnValue8));
        int i9 = 32 - i2;
        String[] strArr = A04;
        String str = strArr[5];
        String str2 = strArr[0];
        int iCharAt = str.charAt(17);
        int returnValue9 = str2.charAt(17);
        if (iCharAt == returnValue9) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "RXY6xLJuKIcEz3kUylWDYr6tsmitvphK";
        strArr2[7] = "WXiq34WZkyW8ugzR2g0a8ipZBHhkiRcU";
        int returnValue10 = (-1) >>> i9;
        int i10 = i8 & returnValue10;
        int returnValue11 = this.A00;
        if (returnValue11 == 8) {
            this.A00 = 0;
            int i11 = this.A02;
            int returnValue12 = this.A02;
            int i12 = i11 + (A02(returnValue12 + 1) ? 2 : 1);
            String[] strArr3 = A04;
            String str3 = strArr3[4];
            String str4 = strArr3[1];
            int iCharAt2 = str3.charAt(0);
            int returnValue13 = str4.charAt(0);
            if (iCharAt2 != returnValue13) {
                String[] strArr4 = A04;
                strArr4[4] = "rds4vupX8r7j5bNz4Ka4tPduGPmVtsGV";
                strArr4[1] = "rRPYe8lZfiAZtF0hvmlKmZn0YXaVPkJ6";
                this.A02 = i12;
            } else {
                String[] strArr5 = A04;
                strArr5[3] = "oP8krBIP0DDB0MHyD3CqohM2a51fTyLT";
                strArr5[6] = "8dOgzrP5xxQxSwHCAu2NrFg9fwsPMfLi";
                this.A02 = i12;
            }
        }
        A01();
        return i10;
    }

    public final void A06() {
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == 8) {
            this.A00 = 0;
            this.A02 += A02(this.A02 + 1) ? 2 : 1;
        }
        A01();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    /* JADX WARN: Code duplicated, block: B:21:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[SYNTHETIC] */
    public final void A07(int i2) {
        int oldByteOffset;
        boolean zA02;
        int numBytes;
        int oldByteOffset2;
        int i3 = this.A02;
        int i4 = i2 / 8;
        int oldByteOffset3 = this.A02;
        this.A02 = oldByteOffset3 + i4;
        int numBytes2 = this.A00;
        int oldByteOffset4 = i4 * 8;
        this.A00 = numBytes2 + (i2 - oldByteOffset4);
        int numBytes3 = this.A00;
        if (numBytes3 > 7) {
            int oldByteOffset5 = this.A02;
            this.A02 = oldByteOffset5 + 1;
            String[] strArr = A04;
            String str = strArr[3];
            String str2 = strArr[6];
            int numBytes4 = str.charAt(14);
            int oldByteOffset6 = str2.charAt(14);
            if (numBytes4 == oldByteOffset6) {
                String[] strArr2 = A04;
                strArr2[5] = "JMOXq6hG4yZwGcrVKWuSo4mZKx3jwnv0";
                strArr2[0] = "8hcVzozxp8VhJG7sJROCpbfriQIXRjxB";
                int oldByteOffset7 = this.A00;
                this.A00 = oldByteOffset7 - 8;
                while (true) {
                    i3++;
                    oldByteOffset = this.A02;
                    if (i3 <= oldByteOffset) {
                        zA02 = A02(i3);
                        String[] strArr3 = A04;
                        String str3 = strArr3[4];
                        String str4 = strArr3[1];
                        numBytes = str3.charAt(0);
                        oldByteOffset2 = str4.charAt(0);
                        if (numBytes != oldByteOffset2) {
                            String[] strArr4 = A04;
                            strArr4[3] = "ItBao4LZOiviF1HOEk7WTyNzP7shwqmG";
                            strArr4[6] = "at4dJT6xDps7byHlzjkGtuWM4RrUB1u7";
                            if (zA02) {
                                int oldByteOffset8 = this.A02;
                                this.A02 = oldByteOffset8 + 1;
                                i3 += 2;
                            }
                        }
                    } else {
                        A01();
                        return;
                    }
                }
            }
        } else {
            while (true) {
                i3++;
                oldByteOffset = this.A02;
                if (i3 <= oldByteOffset) {
                    zA02 = A02(i3);
                    String[] strArr5 = A04;
                    String str5 = strArr5[4];
                    String str6 = strArr5[1];
                    numBytes = str5.charAt(0);
                    oldByteOffset2 = str6.charAt(0);
                    if (numBytes != oldByteOffset2) {
                        String[] strArr6 = A04;
                        strArr6[3] = "ItBao4LZOiviF1HOEk7WTyNzP7shwqmG";
                        strArr6[6] = "at4dJT6xDps7byHlzjkGtuWM4RrUB1u7";
                        if (zA02) {
                            int oldByteOffset9 = this.A02;
                            this.A02 = oldByteOffset9 + 1;
                            i3 += 2;
                        }
                    }
                } else {
                    A01();
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    public final void A08(byte[] bArr, int i2, int i3) {
        this.A03 = bArr;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = 0;
        A01();
    }

    public final boolean A09() {
        int i2 = this.A02;
        int i3 = this.A00;
        int i4 = 0;
        while (initialBitOffset < initialByteOffset && !A0A()) {
            i4++;
        }
        int i5 = this.A02;
        int initialByteOffset = this.A01;
        int initialByteOffset2 = i5 == initialByteOffset ? 1 : 0;
        this.A02 = i2;
        this.A00 = i3;
        if (initialByteOffset2 != 0) {
            return false;
        }
        int initialByteOffset3 = i4 * 2;
        return A0B(initialByteOffset3 + 1);
    }

    public final boolean A0A() {
        boolean returnValue = (this.A03[this.A02] & (128 >> this.A00)) != 0;
        A06();
        return returnValue;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006e A[EDGE_INSN: B:29:0x006e->B:20:0x006e BREAK  A[LOOP:0: B:10:0x003b->B:19:0x006c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x006c A[SYNTHETIC] */
    public final boolean A0B(int i2) {
        int i3;
        int i4;
        String str;
        int numBytes;
        int i5 = this.A02;
        int oldByteOffset = i2 / 8;
        int i6 = this.A02 + oldByteOffset;
        int newBitOffset = (this.A00 + i2) - (oldByteOffset * 8);
        if (newBitOffset > 7) {
            i6++;
            String[] strArr = A04;
            String str2 = strArr[4];
            String str3 = strArr[1];
            int numBytes2 = str2.charAt(0);
            if (numBytes2 == str3.charAt(0)) {
                String[] strArr2 = A04;
                strArr2[2] = "4R3sKytGl1afrKMjnsBwna0p74CJayfl";
                strArr2[7] = "DtV04uWRet80XDEpYPrFh03isGofLap7";
                newBitOffset -= 8;
                i3 = i5 + 1;
                while (i3 <= i6) {
                    i4 = this.A01;
                    String[] strArr3 = A04;
                    String str4 = strArr3[5];
                    str = strArr3[0];
                    numBytes = str4.charAt(17);
                    if (numBytes != str.charAt(17)) {
                        String[] strArr4 = A04;
                        strArr4[4] = "ru8g1XQo0WAy59nUdKAzfoQ85z62h8So";
                        strArr4[1] = "rlk5s9hHQFi3gmvg8c7PRJF1MfkgSAIS";
                        if (i6 < i4) {
                            break;
                        }
                        if (A02(i3)) {
                            i6++;
                            i3 += 2;
                        }
                        i3++;
                    }
                }
                if (i6 >= this.A01) {
                    return i6 != this.A01 && newBitOffset == 0;
                }
                return true;
            }
        } else {
            i3 = i5 + 1;
            while (i3 <= i6) {
                i4 = this.A01;
                String[] strArr5 = A04;
                String str5 = strArr5[5];
                str = strArr5[0];
                numBytes = str5.charAt(17);
                if (numBytes != str.charAt(17)) {
                    String[] strArr6 = A04;
                    strArr6[4] = "ru8g1XQo0WAy59nUdKAzfoQ85z62h8So";
                    strArr6[1] = "rlk5s9hHQFi3gmvg8c7PRJF1MfkgSAIS";
                    if (i6 < i4) {
                        break;
                        break;
                    }
                    if (A02(i3)) {
                        i6++;
                        i3 += 2;
                    }
                    i3++;
                }
            }
            if (i6 >= this.A01) {
                if (i6 != this.A01) {
                }
            }
            return true;
        }
        throw new RuntimeException();
    }
}

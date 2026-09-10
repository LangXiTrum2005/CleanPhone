package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1080Uf {
    public static String[] A04 = {"9bIfZdx2c", "BVtweHovTJ9AQD1c0xwVro5fb55rsC0A", "Qcz7YcPp33FT9AEheyvAIqgr5sxTCSSI", "joIE69uQy9cRyqfx7andC7YkXUHjq6Lt", "4yzJG2kJ6AjfdkDtCD", "WyO69cTYQekRyvfsqm71fCjZ6iJK55bc", "gXhu5isEPNWJ9cjXO06miAv1", "kZXVeDcpU0zUNcgkIcZwZmZ0cSykIX6b"};
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C1080Uf(byte[] bArr, int i, int i2) {
        A08(bArr, i, i2);
    }

    private int A00() {
        int i = 0;
        while (!A0A()) {
            i++;
        }
        int i2 = (1 << i) - 1;
        int leadingZeros = i > 0 ? A05(i) : 0;
        return i2 + leadingZeros;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    private void A01() {
        boolean z;
        if (this.A02 >= 0) {
            int i = this.A02;
            int i2 = this.A01;
            String[] strArr = A04;
            if (strArr[7].charAt(4) != strArr[1].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[5] = "ETZmGJHxpSVfyikvRimeyIsJKCGzi2Kh";
            strArr2[3] = "MgnSy3kjA4udySrYGwuUYQvZkBsICH9C";
            if (i < i2 || (this.A02 == this.A01 && this.A00 == 0)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        AbstractC1517es.A08(z);
    }

    private boolean A02(int i) {
        return 2 <= i && i < this.A01 && this.A03[i] == 3 && this.A03[i + (-2)] == 0 && this.A03[i + (-1)] == 0;
    }

    public final int A03() {
        int iA00 = A00();
        int codeNum = iA00 % 2;
        int i = codeNum == 0 ? -1 : 1;
        int codeNum2 = iA00 + 1;
        return i * (codeNum2 / 2);
    }

    public final int A04() {
        return A00();
    }

    public final int A05(int i) {
        int i2 = 0;
        int returnValue = this.A00;
        this.A00 = returnValue + i;
        while (true) {
            int returnValue2 = this.A00;
            int i3 = 2;
            if (returnValue2 <= 8) {
                break;
            }
            int returnValue3 = this.A00;
            this.A00 = returnValue3 - 8;
            byte[] bArr = this.A03;
            int returnValue4 = this.A02;
            int i4 = bArr[returnValue4] & 255;
            int returnValue5 = this.A00;
            i2 |= i4 << returnValue5;
            int i5 = this.A02;
            int returnValue6 = this.A02;
            if (!A02(returnValue6 + 1)) {
                i3 = 1;
            }
            this.A02 = i5 + i3;
        }
        byte[] bArr2 = this.A03;
        int returnValue7 = this.A02;
        int i6 = bArr2[returnValue7] & 255;
        int returnValue8 = this.A00;
        int i7 = i2 | (i6 >> (8 - returnValue8));
        int returnValue9 = (-1) >>> (32 - i);
        int i8 = i7 & returnValue9;
        int returnValue10 = this.A00;
        if (returnValue10 == 8) {
            this.A00 = 0;
            int i9 = this.A02;
            int returnValue11 = this.A02;
            this.A02 = i9 + (A02(returnValue11 + 1) ? 2 : 1);
        }
        A01();
        return i8;
    }

    public final void A06() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 8) {
            this.A00 = 0;
            int i2 = this.A02;
            boolean zA02 = A02(this.A02 + 1);
            String[] strArr = A04;
            if (strArr[6].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A04[4] = "02GcfcelxQLTDn1x8c";
            this.A02 = i2 + (zA02 ? 2 : 1);
        }
        A01();
    }

    public final void A07(int i) {
        int i2 = this.A02;
        int i3 = i / 8;
        int oldByteOffset = this.A02;
        this.A02 = oldByteOffset + i3;
        int numBytes = this.A00;
        int oldByteOffset2 = i3 * 8;
        this.A00 = numBytes + (i - oldByteOffset2);
        int numBytes2 = this.A00;
        if (numBytes2 > 7) {
            int oldByteOffset3 = this.A02;
            this.A02 = oldByteOffset3 + 1;
            int oldByteOffset4 = this.A00;
            this.A00 = oldByteOffset4 - 8;
        }
        int numBytes3 = i2 + 1;
        while (numBytes3 <= oldByteOffset) {
            if (A02(numBytes3)) {
                int oldByteOffset5 = this.A02;
                this.A02 = oldByteOffset5 + 1;
                numBytes3 += 2;
            }
            numBytes3++;
        }
        A01();
    }

    public final void A08(byte[] bArr, int i, int i2) {
        this.A03 = bArr;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = 0;
        A01();
    }

    public final boolean A09() {
        int leadingZeros = this.A02;
        int i = this.A00;
        int i2 = 0;
        while (initialBitOffset < initialByteOffset && !A0A()) {
            i2++;
        }
        int initialBitOffset = this.A02;
        int initialByteOffset = this.A01;
        boolean hitLimit = initialBitOffset == initialByteOffset;
        this.A02 = leadingZeros;
        String[] strArr = A04;
        String str = strArr[5];
        String str2 = strArr[3];
        int initialBitOffset2 = str.charAt(12);
        int initialByteOffset2 = str2.charAt(12);
        if (initialBitOffset2 != initialByteOffset2) {
            throw new RuntimeException();
        }
        A04[0] = "wMATEAAsR";
        this.A00 = i;
        if (hitLimit) {
            return false;
        }
        int initialByteOffset3 = i2 * 2;
        return A0B(initialByteOffset3 + 1);
    }

    public final boolean A0A() {
        boolean returnValue = (this.A03[this.A02] & (128 >> this.A00)) != 0;
        A06();
        return returnValue;
    }

    public final boolean A0B(int i) {
        int numBytes = this.A02;
        int oldByteOffset = i / 8;
        int i2 = this.A02 + oldByteOffset;
        int newBitOffset = (this.A00 + i) - (oldByteOffset * 8);
        if (newBitOffset > 7) {
            i2++;
            newBitOffset -= 8;
        }
        int i3 = numBytes + 1;
        while (true) {
            int numBytes2 = A04[4].length();
            if (numBytes2 == 18) {
                String[] strArr = A04;
                strArr[5] = "nO6MJEEc7TlfyisncwbCK3WDubeNqcpA";
                strArr[3] = "qvcn1YcI6iaayqfaZwfFJFqY4sjpcop8";
                if (i3 > i2) {
                    break;
                }
                int i4 = this.A01;
                String[] strArr2 = A04;
                String str = strArr2[6];
                String str2 = strArr2[2];
                int numBytes3 = str.length();
                if (numBytes3 == str2.length()) {
                    throw new RuntimeException();
                }
                A04[0] = "YDzFZervb";
                if (i2 >= i4) {
                    break;
                }
                if (A02(i3)) {
                    i2++;
                    i3 += 2;
                }
                i3++;
            } else {
                throw new RuntimeException();
            }
        }
        if (i2 >= this.A01) {
            return i2 == this.A01 && newBitOffset == 0;
        }
        return true;
    }
}

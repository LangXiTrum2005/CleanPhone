package com.facebook.ads.redexgen.core;

import androidx.core.view.MotionEventCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1575fp {
    public static String[] A04 = {"troZa0K0W8HTHR7BtgUt6a2VnHWm0bus", "f8PKW282qHfV5p7TdldmeXPnja8JvEBd", "673Hfzi80RDC9UHJRKBkZc", "7KP", "aFVND9VXNora0lV68UF9uW9241BMtu1x", "e6ABUIZiXbvOO2BgZL19Rf", "lFKid8FynKujJDoHPgfYpwQEuMRynzxH", "Rwvn3gzlYspaUjDm1ifi3ai17t5YXfoM"};
    public byte[] A00;
    public int A01;
    public int A02;
    public int A03;

    public C1575fp() {
    }

    public C1575fp(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C1575fp(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A02 = i;
    }

    private void A00() {
        AbstractC1517es.A08(this.A03 >= 0 && (this.A03 < this.A02 || (this.A03 == this.A02 && this.A01 == 0)));
    }

    public final int A01() {
        return ((this.A02 - this.A03) * 8) - this.A01;
    }

    public final int A02() {
        AbstractC1517es.A08(this.A01 == 0);
        int i = this.A03;
        String[] strArr = A04;
        if (strArr[2].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "7QDOc2eYVcLKBohYuMX2L9m3sElflqIs";
        strArr2[7] = "vuPzhzQWRreqViJSlCctsO4qZARyUleL";
        return i;
    }

    public final int A03() {
        return (this.A03 * 8) + this.A01;
    }

    public final int A04(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 0;
        this.A01 += i;
        while (true) {
            int i3 = this.A01;
            String[] strArr = A04;
            String str = strArr[4];
            String str2 = strArr[6];
            int returnValue = str.charAt(1);
            if (returnValue != str2.charAt(1)) {
                throw new RuntimeException();
            }
            A04[1] = "ZgGJE6tE2noKI95zxsPR0B4DnYh5DrAJ";
            if (i3 > 8) {
                int returnValue2 = this.A01;
                this.A01 = returnValue2 - 8;
                byte[] bArr = this.A00;
                int returnValue3 = this.A03;
                this.A03 = returnValue3 + 1;
                i2 |= (bArr[returnValue3] & 255) << this.A01;
            } else {
                byte[] bArr2 = this.A00;
                int returnValue4 = this.A03;
                int i4 = bArr2[returnValue4] & 255;
                int returnValue5 = this.A01;
                int i5 = i2 | (i4 >> (8 - returnValue5));
                int returnValue6 = (-1) >>> (32 - i);
                int i6 = i5 & returnValue6;
                int returnValue7 = this.A01;
                if (returnValue7 == 8) {
                    this.A01 = 0;
                    this.A03++;
                }
                A00();
                return i6;
            }
        }
    }

    public final long A05(int i) {
        if (i <= 32) {
            return AbstractC1600gE.A0M(A04(i));
        }
        int iA04 = A04(i - 32);
        String[] strArr = A04;
        if (strArr[0].charAt(4) == strArr[7].charAt(4)) {
            throw new RuntimeException();
        }
        A04[1] = "kClsGsxwo3Lt4HBZgVYPLKNrUdJGwLkP";
        return AbstractC1600gE.A0N(iA04, A04(32));
    }

    public final void A06() {
        if (this.A01 == 0) {
            return;
        }
        this.A01 = 0;
        this.A03++;
        A00();
    }

    public final void A07() {
        int i = this.A01 + 1;
        this.A01 = i;
        if (i == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
    }

    public final void A08(int i) {
        this.A03 = i / 8;
        this.A01 = i - (this.A03 * 8);
        A00();
    }

    public final void A09(int i) {
        int i2 = i / 8;
        int numBytes = this.A03;
        this.A03 = numBytes + i2;
        int numBytes2 = i2 * 8;
        this.A01 += i - numBytes2;
        if (this.A01 > 7) {
            int numBytes3 = this.A03;
            this.A03 = numBytes3 + 1;
            int numBytes4 = this.A01;
            this.A01 = numBytes4 - 8;
        }
        A00();
    }

    public final void A0A(int i) {
        AbstractC1517es.A08(this.A01 == 0);
        this.A03 += i;
        A00();
    }

    public final void A0B(int i, int i2) {
        if (i2 < 32) {
            int remainingBitsToRead = 1 << i2;
            i &= remainingBitsToRead - 1;
        }
        int remainingBitsToRead2 = this.A01;
        int iMin = Math.min(8 - remainingBitsToRead2, i2);
        int remainingBitsToRead3 = this.A01;
        int firstByteInputBits = (8 - remainingBitsToRead3) - iMin;
        int remainingBitsToRead4 = this.A01;
        int i3 = MotionEventCompat.ACTION_POINTER_INDEX_MASK >> remainingBitsToRead4;
        int remainingBitsToRead5 = 1 << firstByteInputBits;
        int firstByteBitmask = i3 | (remainingBitsToRead5 - 1);
        byte[] bArr = this.A00;
        int i4 = this.A03;
        byte[] bArr2 = this.A00;
        int remainingBitsToRead6 = this.A03;
        bArr[i4] = (byte) (bArr2[remainingBitsToRead6] & firstByteBitmask);
        int remainingBitsToRead7 = i2 - iMin;
        int firstByteBitmask2 = i >>> remainingBitsToRead7;
        byte[] bArr3 = this.A00;
        int i5 = this.A03;
        byte[] bArr4 = this.A00;
        int remainingBitsToRead8 = this.A03;
        bArr3[i5] = (byte) (bArr4[remainingBitsToRead8] | (firstByteBitmask2 << firstByteInputBits));
        int firstByteBitmask3 = i2 - iMin;
        int firstByteRightPaddingSize = this.A03;
        int firstByteRightPaddingSize2 = firstByteRightPaddingSize + 1;
        while (firstByteBitmask3 > 8) {
            int firstByteReadSize = firstByteRightPaddingSize2 + 1;
            int remainingBitsToRead9 = firstByteBitmask3 - 8;
            this.A00[firstByteRightPaddingSize2] = (byte) (i >>> remainingBitsToRead9);
            firstByteBitmask3 -= 8;
            firstByteRightPaddingSize2 = firstByteReadSize;
        }
        int lastByteRightPaddingSize = 8 - firstByteBitmask3;
        byte[] bArr5 = this.A00;
        int firstByteReadSize2 = this.A00[firstByteRightPaddingSize2];
        int remainingBitsToRead10 = 1 << lastByteRightPaddingSize;
        bArr5[firstByteRightPaddingSize2] = (byte) (firstByteReadSize2 & (remainingBitsToRead10 - 1));
        int remainingBitsToRead11 = 1 << firstByteBitmask3;
        int i6 = i & (remainingBitsToRead11 - 1);
        byte[] bArr6 = this.A00;
        int remainingBitsToRead12 = this.A00[firstByteRightPaddingSize2];
        bArr6[firstByteRightPaddingSize2] = (byte) (remainingBitsToRead12 | (i6 << lastByteRightPaddingSize));
        A09(i2);
        A00();
    }

    public final void A0C(C1576fq c1576fq) {
        A0E(c1576fq.A0l(), c1576fq.A0A());
        A08(c1576fq.A09() * 8);
    }

    public final void A0D(byte[] bArr) {
        A0E(bArr, bArr.length);
    }

    public final void A0E(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A03 = 0;
        this.A01 = 0;
        this.A02 = i;
    }

    public final void A0F(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.A00;
            int i4 = this.A03;
            int to = i4 + 1;
            this.A03 = to;
            int i5 = bArr2[i4];
            int to2 = this.A01;
            bArr[i] = (byte) (i5 << to2);
            byte b = bArr[i];
            byte[] bArr3 = this.A00;
            int to3 = this.A03;
            int i6 = 255 & bArr3[to3];
            int to4 = this.A01;
            bArr[i] = (byte) ((i6 >> (8 - to4)) | b);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        int bitsLeft = bArr[i3];
        int to5 = 255 >> i7;
        bArr[i3] = (byte) (bitsLeft & to5);
        int to6 = this.A01;
        if (to6 + i7 > 8) {
            byte b2 = bArr[i3];
            byte[] bArr4 = this.A00;
            int bitsLeft2 = this.A03;
            int to7 = bitsLeft2 + 1;
            this.A03 = to7;
            int bitsLeft3 = bArr4[bitsLeft2] & 255;
            int to8 = this.A01;
            bArr[i3] = (byte) (b2 | (bitsLeft3 << to8));
            int to9 = this.A01;
            this.A01 = to9 - 8;
        }
        int to10 = this.A01;
        this.A01 = to10 + i7;
        byte[] bArr5 = this.A00;
        int to11 = this.A03;
        int i8 = 255 & bArr5[to11];
        int to12 = this.A01;
        int i9 = i8 >> (8 - to12);
        int bitsLeft4 = bArr[i3];
        int to13 = 8 - i7;
        bArr[i3] = (byte) (bitsLeft4 | ((byte) (i9 << to13)));
        int to14 = this.A01;
        if (to14 == 8) {
            this.A01 = 0;
            int to15 = this.A03;
            this.A03 = to15 + 1;
        }
        A00();
    }

    public final void A0G(byte[] bArr, int i, int i2) {
        AbstractC1517es.A08(this.A01 == 0);
        System.arraycopy(this.A00, this.A03, bArr, i, i2);
        this.A03 += i2;
        A00();
    }

    public final boolean A0H() {
        boolean returnValue = (this.A00[this.A03] & (128 >> this.A01)) != 0;
        A07();
        return returnValue;
    }
}

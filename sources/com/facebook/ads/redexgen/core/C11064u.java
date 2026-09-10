package com.facebook.ads.redexgen.core;

import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11064u {
    public static String[] A04 = {"2nOz0KIFgcZZRyVuqo5bgbDjVecAtY1v", "p1", "VjnGs3e14C04tf63tHLQ77fvb0vUFjjn", "IkQ8iUjtLJey7cJCEXqpfqsJOKT4tfzv", "YU3RrDfZvA3XfQSmqlFrDyJy2XBZ9ug4", "OCexcvgEmqqQdA89aMsn", "lWBBh2DwBKc0yUEroYjNXxq0TEDXKrUS", "n4CP0YvmwhnKHbqe32bPZYKzOuFmYPOb"};
    public byte[] A00;
    public int A01;
    public int A02;
    public int A03;

    public C11064u() {
    }

    public C11064u(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C11064u(byte[] bArr, int i2) {
        this.A00 = bArr;
        this.A02 = i2;
    }

    private void A00() {
        AbstractC10843y.A08(this.A03 >= 0 && (this.A03 < this.A02 || (this.A03 == this.A02 && this.A01 == 0)));
    }

    public final int A01() {
        return ((this.A02 - this.A03) * 8) - this.A01;
    }

    public final int A02() {
        AbstractC10843y.A08(this.A01 == 0);
        return this.A03;
    }

    public final int A03() {
        return (this.A03 * 8) + this.A01;
    }

    public final int A04(int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = 0;
        this.A01 += i2;
        while (this.A01 > 8) {
            this.A01 -= 8;
            byte[] bArr = this.A00;
            int returnValue = this.A03;
            this.A03 = returnValue + 1;
            i3 |= (bArr[returnValue] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << this.A01;
        }
        int returnValue2 = this.A00[this.A03] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = i3 | (returnValue2 >> (8 - this.A01));
        int returnValue3 = 32 - i2;
        int i5 = i4 & ((-1) >>> returnValue3);
        if (this.A01 == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
        return i5;
    }

    public final long A05(int i2) {
        if (i2 > 32) {
            return C5C.A0N(A04(i2 - 32), A04(32));
        }
        long jA0M = C5C.A0M(A04(i2));
        String[] strArr = A04;
        if (strArr[1].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[3] = "hPuSpAkHwt40nYe5baQSvI4ZKxCRAlL0";
        strArr2[0] = "ANsKpIz8SdbAQh9e0XlF7KjBsp30BEL1";
        return jA0M;
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
        int i2 = this.A01 + 1;
        this.A01 = i2;
        if (i2 == 8) {
            this.A01 = 0;
            int i3 = this.A03;
            String[] strArr = A04;
            if (strArr[3].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[3] = "IsW8CSRSYhigEF2wlh1BrMeLUc4CvJhM";
            strArr2[0] = "lfcfpjtp1JtJxQNQeccncamol0LRwTjJ";
            this.A03 = i3 + 1;
        }
        A00();
    }

    public final void A08(int i2) {
        this.A03 = i2 / 8;
        this.A01 = i2 - (this.A03 * 8);
        A00();
    }

    public final void A09(int i2) {
        int i3 = i2 / 8;
        int numBytes = this.A03;
        this.A03 = numBytes + i3;
        int numBytes2 = i3 * 8;
        this.A01 += i2 - numBytes2;
        if (this.A01 > 7) {
            int numBytes3 = this.A03;
            this.A03 = numBytes3 + 1;
            int numBytes4 = this.A01;
            this.A01 = numBytes4 - 8;
        }
        A00();
    }

    public final void A0A(int i2) {
        AbstractC10843y.A08(this.A01 == 0);
        this.A03 += i2;
        A00();
    }

    public final void A0B(int i2, int i3) {
        if (i3 < 32) {
            int remainingBitsToRead = 1 << i3;
            i2 &= remainingBitsToRead - 1;
        }
        int remainingBitsToRead2 = this.A01;
        int iMin = Math.min(8 - remainingBitsToRead2, i3);
        int remainingBitsToRead3 = this.A01;
        int firstByteInputBits = (8 - remainingBitsToRead3) - iMin;
        int remainingBitsToRead4 = this.A01;
        int i4 = 65280 >> remainingBitsToRead4;
        int remainingBitsToRead5 = 1 << firstByteInputBits;
        int firstByteBitmask = i4 | (remainingBitsToRead5 - 1);
        byte[] bArr = this.A00;
        int i5 = this.A03;
        byte[] bArr2 = this.A00;
        int remainingBitsToRead6 = this.A03;
        bArr[i5] = (byte) (bArr2[remainingBitsToRead6] & firstByteBitmask);
        int remainingBitsToRead7 = i3 - iMin;
        int firstByteBitmask2 = i2 >>> remainingBitsToRead7;
        byte[] bArr3 = this.A00;
        int i6 = this.A03;
        byte[] bArr4 = this.A00;
        int remainingBitsToRead8 = this.A03;
        bArr3[i6] = (byte) (bArr4[remainingBitsToRead8] | (firstByteBitmask2 << firstByteInputBits));
        int firstByteBitmask3 = i3 - iMin;
        int firstByteRightPaddingSize = this.A03;
        int firstByteRightPaddingSize2 = firstByteRightPaddingSize + 1;
        while (firstByteBitmask3 > 8) {
            int firstByteReadSize = firstByteRightPaddingSize2 + 1;
            int remainingBitsToRead9 = firstByteBitmask3 - 8;
            this.A00[firstByteRightPaddingSize2] = (byte) (i2 >>> remainingBitsToRead9);
            firstByteBitmask3 -= 8;
            firstByteRightPaddingSize2 = firstByteReadSize;
        }
        int lastByteRightPaddingSize = 8 - firstByteBitmask3;
        byte[] bArr5 = this.A00;
        int firstByteReadSize2 = this.A00[firstByteRightPaddingSize2];
        int remainingBitsToRead10 = 1 << lastByteRightPaddingSize;
        bArr5[firstByteRightPaddingSize2] = (byte) (firstByteReadSize2 & (remainingBitsToRead10 - 1));
        int remainingBitsToRead11 = 1 << firstByteBitmask3;
        int i7 = i2 & (remainingBitsToRead11 - 1);
        byte[] bArr6 = this.A00;
        int remainingBitsToRead12 = this.A00[firstByteRightPaddingSize2];
        bArr6[firstByteRightPaddingSize2] = (byte) (remainingBitsToRead12 | (i7 << lastByteRightPaddingSize));
        A09(i3);
        A00();
    }

    public final void A0C(C11074v c11074v) {
        A0E(c11074v.A0l(), c11074v.A0A());
        A08(c11074v.A09() * 8);
    }

    public final void A0D(byte[] bArr) {
        A0E(bArr, bArr.length);
    }

    public final void A0E(byte[] bArr, int i2) {
        this.A00 = bArr;
        this.A03 = 0;
        this.A01 = 0;
        this.A02 = i2;
    }

    public final void A0F(byte[] bArr, int i2, int i3) {
        int i4 = (i3 >> 3) + i2;
        while (i2 < i4) {
            byte[] bArr2 = this.A00;
            int i5 = this.A03;
            int to = i5 + 1;
            this.A03 = to;
            int i6 = bArr2[i5];
            int to2 = this.A01;
            bArr[i2] = (byte) (i6 << to2);
            byte b2 = bArr[i2];
            byte[] bArr3 = this.A00;
            int to3 = this.A03;
            int i7 = 255 & bArr3[to3];
            int to4 = this.A01;
            bArr[i2] = (byte) ((i7 >> (8 - to4)) | b2);
            i2++;
        }
        int i8 = i3 & 7;
        if (i8 == 0) {
            return;
        }
        int bitsLeft = bArr[i4];
        int to5 = 255 >> i8;
        bArr[i4] = (byte) (bitsLeft & to5);
        int to6 = this.A01;
        if (to6 + i8 > 8) {
            byte b3 = bArr[i4];
            byte[] bArr4 = this.A00;
            int bitsLeft2 = this.A03;
            int to7 = bitsLeft2 + 1;
            this.A03 = to7;
            int bitsLeft3 = bArr4[bitsLeft2] & 255;
            int to8 = this.A01;
            bArr[i4] = (byte) (b3 | (bitsLeft3 << to8));
            int to9 = this.A01;
            this.A01 = to9 - 8;
        }
        int to10 = this.A01;
        this.A01 = to10 + i8;
        byte[] bArr5 = this.A00;
        int to11 = this.A03;
        int i9 = 255 & bArr5[to11];
        int to12 = this.A01;
        int i10 = i9 >> (8 - to12);
        int bitsLeft4 = bArr[i4];
        int to13 = 8 - i8;
        bArr[i4] = (byte) (bitsLeft4 | ((byte) (i10 << to13)));
        int to14 = this.A01;
        if (to14 == 8) {
            this.A01 = 0;
            int to15 = this.A03;
            this.A03 = to15 + 1;
        }
        A00();
    }

    public final void A0G(byte[] bArr, int i2, int i3) {
        AbstractC10843y.A08(this.A01 == 0);
        System.arraycopy(this.A00, this.A03, bArr, i2, i3);
        this.A03 += i3;
        A00();
    }

    public final boolean A0H() {
        boolean returnValue = (this.A00[this.A03] & (128 >> this.A01)) != 0;
        A07();
        return returnValue;
    }
}

package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes3.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    public static int murmurhash3_x86_32(byte[] bArr, int i2, int i3, int i4) {
        int i5;
        int i6 = i2;
        while (true) {
            i5 = (i3 & (-4)) + i2;
            if (i6 >= i5) {
                break;
            }
            int i7 = ((bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | (bArr[i6 + 3] << 24)) * (-862048943);
            int i8 = i4 ^ (((i7 >>> 17) | (i7 << 15)) * 461845907);
            i4 = (((i8 >>> 19) | (i8 << 13)) * 5) - 430675100;
            i6 += 4;
        }
        int i9 = i3 & 3;
        int i10 = 0;
        if (i9 == 1) {
            int i11 = ((bArr[i5] & 255) | i10) * (-862048943);
            i4 ^= ((i11 >>> 17) | (i11 << 15)) * 461845907;
        } else {
            if (i9 != 2) {
                i10 = i9 == 3 ? (bArr[i5 + 2] & 255) << 16 : 0;
            }
            i10 |= (bArr[i5 + 1] & 255) << 8;
            int i12 = ((bArr[i5] & 255) | i10) * (-862048943);
            i4 ^= ((i12 >>> 17) | (i12 << 15)) * 461845907;
        }
        int i13 = i4 ^ i3;
        int i14 = (i13 ^ (i13 >>> 16)) * (-2048144789);
        int i15 = (i14 ^ (i14 >>> 13)) * (-1028477387);
        return i15 ^ (i15 >>> 16);
    }
}

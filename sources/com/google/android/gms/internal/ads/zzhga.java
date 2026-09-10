package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzhga {
    private static final int[] zza = zzd(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void zza(int[] iArr, int[] iArr2) {
        int[] iArr3 = zza;
        int length = iArr3.length;
        System.arraycopy(iArr3, 0, iArr, 0, length);
        System.arraycopy(iArr2, 0, iArr, length, 8);
    }

    public static void zzb(int[] iArr) {
        for (int i2 = 0; i2 < 10; i2++) {
            zzc(iArr, 0, 4, 8, 12);
            zzc(iArr, 1, 5, 9, 13);
            zzc(iArr, 2, 6, 10, 14);
            zzc(iArr, 3, 7, 11, 15);
            zzc(iArr, 0, 5, 10, 15);
            zzc(iArr, 1, 6, 11, 12);
            zzc(iArr, 2, 7, 8, 13);
            zzc(iArr, 3, 4, 9, 14);
        }
    }

    public static void zzc(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = iArr[i2] + iArr[i3];
        iArr[i2] = i6;
        int i7 = i6 ^ iArr[i5];
        int i8 = (i7 >>> (-16)) | (i7 << 16);
        iArr[i5] = i8;
        int i9 = iArr[i4] + i8;
        iArr[i4] = i9;
        int i10 = iArr[i3] ^ i9;
        int i11 = (i10 >>> (-12)) | (i10 << 12);
        iArr[i3] = i11;
        int i12 = iArr[i2] + i11;
        iArr[i2] = i12;
        int i13 = iArr[i5] ^ i12;
        int i14 = (i13 >>> (-8)) | (i13 << 8);
        iArr[i5] = i14;
        int i15 = iArr[i4] + i14;
        iArr[i4] = i15;
        int i16 = iArr[i3] ^ i15;
        iArr[i3] = (i16 >>> (-7)) | (i16 << 7);
    }

    public static int[] zzd(byte[] bArr) {
        if ((bArr.length & 3) != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    public static int[] zze(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        zza(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        zzb(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }
}

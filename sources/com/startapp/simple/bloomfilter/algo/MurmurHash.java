package com.startapp.simple.bloomfilter.algo;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class MurmurHash {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long hash64(ByteBuffer byteBuffer, int i2, int i3, long j) {
        long j2 = -4132994306676758123L;
        long j3 = (j & 4294967295L) ^ (((long) i3) * (-4132994306676758123L));
        int i4 = i3 >> 3;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i2 + (i5 << 3);
            long j4 = j2;
            long j5 = ((((long) byteBuffer.get(i6)) & 255) + ((((long) byteBuffer.get(i6 + 1)) & 255) << 8) + ((((long) byteBuffer.get(i6 + 2)) & 255) << 16) + ((((long) byteBuffer.get(i6 + 3)) & 255) << 24) + ((((long) byteBuffer.get(i6 + 4)) & 255) << 32) + ((((long) byteBuffer.get(i6 + 5)) & 255) << 40) + ((((long) byteBuffer.get(i6 + 6)) & 255) << 48) + ((((long) byteBuffer.get(i6 + 7)) & 255) << 56)) * j4;
            j3 = (j3 ^ ((j5 ^ (j5 >>> 47)) * j4)) * j4;
            i5++;
            j2 = j4;
        }
        long j6 = j2;
        int i7 = i3 & 7;
        switch (i7) {
            case 1:
                j3 = (((long) byteBuffer.get((i2 + i3) - i7)) ^ j3) * j6;
                break;
            case 2:
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 1)) << 8;
                j3 = (((long) byteBuffer.get((i2 + i3) - i7)) ^ j3) * j6;
                break;
            case 3:
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 2)) << 16;
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 1)) << 8;
                j3 = (((long) byteBuffer.get((i2 + i3) - i7)) ^ j3) * j6;
                break;
            case 4:
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 3)) << 24;
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 2)) << 16;
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 1)) << 8;
                j3 = (((long) byteBuffer.get((i2 + i3) - i7)) ^ j3) * j6;
                break;
            case 5:
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 4)) << 32;
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 3)) << 24;
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 2)) << 16;
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 1)) << 8;
                j3 = (((long) byteBuffer.get((i2 + i3) - i7)) ^ j3) * j6;
                break;
            case 6:
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 5)) << 40;
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 4)) << 32;
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 3)) << 24;
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 2)) << 16;
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 1)) << 8;
                j3 = (((long) byteBuffer.get((i2 + i3) - i7)) ^ j3) * j6;
                break;
            case 7:
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 6)) << 48;
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 5)) << 40;
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 4)) << 32;
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 3)) << 24;
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 2)) << 16;
                j3 ^= ((long) byteBuffer.get(((i2 + i3) - i7) + 1)) << 8;
                j3 = (((long) byteBuffer.get((i2 + i3) - i7)) ^ j3) * j6;
                break;
        }
        long j7 = ((j3 >>> 47) ^ j3) * j6;
        return j7 ^ (j7 >>> 47);
    }
}

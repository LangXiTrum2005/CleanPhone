package com.facebook.ads.redexgen.core;

import android.media.MediaFormat;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC10944i {
    public static byte[] A00;
    public static String[] A01 = {"xemy17oJESjX", "rPO8UlQzVoplqsv241x2vKH9ITvvG5RO", "lwnNPX4PInl", "3ZJzEwR8uVRMBQC0tqntIJ86zVyjP6", "EDwbiEJ5SEYx8yR18WYzWyNJdlpGFaeE", "Kr1YCqNPaz9XeY6", "vkRdwAWmOCKEbB6zjyqD0a8RWRR8tEwK", "9fnayNKVpPH2aeCe0iQJlqHqzIFqpYut"};

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {74, 86, 83, 86, 89, 20, 89, 72, 85, 78, 76, 11, 23, 20, 23, 26, -43, 27, 28, 9, 22, 12, 9, 26, 12, -22, -10, -13, -10, -7, -76, -5, -7, -24, -11, -6, -19, -20, -7, -29, -13, -28, -83, 85, 81, 95, 26, 96, 97, 78, 97, 86, 80, 26, 86, 91, 83, 92};
        if (A01[1].charAt(12) != 'q') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "2QjkwbE64yFQhHjtiWmGMRmbrZEFKpMO";
        strArr[0] = "Fg5M50njpCut";
        A00 = bArr;
    }

    static {
        A01();
    }

    public static void A02(MediaFormat mediaFormat, ColorInfo colorInfo) {
        if (colorInfo != null) {
            A04(mediaFormat, A00(25, 14, 23), colorInfo.A03);
            A04(mediaFormat, A00(11, 14, 56), colorInfo.A02);
            A04(mediaFormat, A00(0, 11, 119), colorInfo.A01);
            A05(mediaFormat, A00(43, 15, 125), colorInfo.A04);
        }
    }

    public static void A03(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void A04(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static void A05(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void A06(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i2 = 0; i2 < i; i2++) {
            mediaFormat.setByteBuffer(A00(39, 4, 16) + i2, ByteBuffer.wrap(list.get(i2)));
        }
    }
}

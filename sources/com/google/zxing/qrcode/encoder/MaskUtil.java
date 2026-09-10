package com.google.zxing.qrcode.encoder;

/* JADX INFO: loaded from: classes3.dex */
final class MaskUtil {
    public static int a(ByteMatrix byteMatrix, boolean z2) {
        int i2 = byteMatrix.f21411b;
        int i3 = byteMatrix.f21412c;
        int i4 = z2 ? i3 : i2;
        if (!z2) {
            i2 = i3;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte b2 = -1;
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                byte[][] bArr = byteMatrix.f21410a;
                byte b3 = z2 ? bArr[i6][i8] : bArr[i8][i6];
                if (b3 == b2) {
                    i7++;
                } else {
                    if (i7 >= 5) {
                        i5 += i7 - 2;
                    }
                    i7 = 1;
                    b2 = b3;
                }
            }
            if (i7 >= 5) {
                i5 = (i7 - 2) + i5;
            }
        }
        return i5;
    }
}

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OneDimensionalCodeWriter implements Writer {
    public static int b(boolean[] zArr, int i2, int[] iArr, boolean z2) {
        int i3 = 0;
        for (int i4 : iArr) {
            int i5 = 0;
            while (i5 < i4) {
                zArr[i2] = z2;
                i5++;
                i2++;
            }
            i3 += i4;
            z2 = !z2;
        }
        return i3;
    }

    @Override // com.google.zxing.Writer
    public BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        int iD = d();
        EncodeHintType encodeHintType = EncodeHintType.Z;
        if (enumMap.containsKey(encodeHintType)) {
            iD = Integer.parseInt(enumMap.get(encodeHintType).toString());
        }
        boolean[] zArrC = c(str);
        int length = zArrC.length;
        int i2 = iD + length;
        int iMax = Math.max(200, i2);
        int iMax2 = Math.max(1, 200);
        int i3 = iMax / i2;
        int i4 = (iMax - (length * i3)) / 2;
        BitMatrix bitMatrix = new BitMatrix(iMax, iMax2);
        int i5 = 0;
        while (i5 < length) {
            if (zArrC[i5]) {
                bitMatrix.c(i4, 0, i3, iMax2);
            }
            i5++;
            i4 += i3;
        }
        return bitMatrix;
    }

    public abstract boolean[] c(String str);

    public int d() {
        return 10;
    }
}

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class EAN13Writer extends UPCEANWriter {
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        if (barcodeFormat == BarcodeFormat.X) {
            return super.a(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + UPCEANReader.b(str);
            } catch (FormatException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!UPCEANReader.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i2 = EAN13Reader.f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iB = OneDimensionalCodeWriter.b(zArr, 0, UPCEANReader.f21378a, true);
        for (int i3 = 1; i3 <= 6; i3++) {
            int iDigit = Character.digit(str.charAt(i3), 10);
            if (((i2 >> (6 - i3)) & 1) == 1) {
                iDigit += 10;
            }
            iB += OneDimensionalCodeWriter.b(zArr, iB, UPCEANReader.f21381e[iDigit], false);
        }
        int iB2 = OneDimensionalCodeWriter.b(zArr, iB, UPCEANReader.f21379b, false) + iB;
        for (int i4 = 7; i4 <= 12; i4++) {
            iB2 += OneDimensionalCodeWriter.b(zArr, iB2, UPCEANReader.d[Character.digit(str.charAt(i4), 10)], true);
        }
        OneDimensionalCodeWriter.b(zArr, iB2, UPCEANReader.f21378a, true);
        return zArr;
    }
}

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class UPCEWriter extends UPCEANWriter {
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(BarcodeFormat.f21331Y)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + UPCEANReader.b(UPCEReader.c(str));
            } catch (FormatException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!UPCEANReader.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int iDigit = Character.digit(str.charAt(0), 10);
        if (iDigit != 0 && iDigit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i2 = UPCEReader.f[iDigit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int iB = OneDimensionalCodeWriter.b(zArr, 0, UPCEANReader.f21378a, true);
        for (int i3 = 1; i3 <= 6; i3++) {
            int iDigit2 = Character.digit(str.charAt(i3), 10);
            if (((i2 >> (6 - i3)) & 1) == 1) {
                iDigit2 += 10;
            }
            iB += OneDimensionalCodeWriter.b(zArr, iB, UPCEANReader.f21381e[iDigit2], false);
        }
        OneDimensionalCodeWriter.b(zArr, iB, UPCEANReader.f21380c, false);
        return zArr;
    }
}

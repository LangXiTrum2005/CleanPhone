package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class EAN8Writer extends UPCEANWriter {
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(BarcodeFormat.f21331Y)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + UPCEANReader.b(str);
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
        boolean[] zArr = new boolean[67];
        int iB = OneDimensionalCodeWriter.b(zArr, 0, UPCEANReader.f21378a, true);
        for (int i2 = 0; i2 <= 3; i2++) {
            iB += OneDimensionalCodeWriter.b(zArr, iB, UPCEANReader.d[Character.digit(str.charAt(i2), 10)], false);
        }
        int iB2 = OneDimensionalCodeWriter.b(zArr, iB, UPCEANReader.f21379b, false) + iB;
        for (int i3 = 4; i3 <= 7; i3++) {
            iB2 += OneDimensionalCodeWriter.b(zArr, iB2, UPCEANReader.d[Character.digit(str.charAt(i3), 10)], true);
        }
        OneDimensionalCodeWriter.b(zArr, iB2, UPCEANReader.f21378a, true);
        return zArr;
    }
}

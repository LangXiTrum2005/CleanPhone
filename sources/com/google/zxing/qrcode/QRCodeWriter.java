package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class QRCodeWriter implements Writer {
    @Override // com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        ErrorCorrectionLevel errorCorrectionLevelValueOf = ErrorCorrectionLevel.L;
        EncodeHintType encodeHintType = EncodeHintType.X;
        if (enumMap.containsKey(encodeHintType)) {
            errorCorrectionLevelValueOf = ErrorCorrectionLevel.valueOf(enumMap.get(encodeHintType).toString());
        }
        EncodeHintType encodeHintType2 = EncodeHintType.Z;
        int i2 = enumMap.containsKey(encodeHintType2) ? Integer.parseInt(enumMap.get(encodeHintType2).toString()) : 4;
        ByteMatrix byteMatrix = Encoder.a(str, errorCorrectionLevelValueOf, enumMap).f21421e;
        if (byteMatrix == null) {
            throw new IllegalStateException();
        }
        int i3 = i2 << 1;
        int i4 = byteMatrix.f21411b;
        int i5 = i4 + i3;
        int i6 = byteMatrix.f21412c;
        int i7 = i3 + i6;
        int iMax = Math.max(200, i5);
        int iMax2 = Math.max(200, i7);
        int iMin = Math.min(iMax / i5, iMax2 / i7);
        int i8 = (iMax - (i4 * iMin)) / 2;
        int i9 = (iMax2 - (i6 * iMin)) / 2;
        BitMatrix bitMatrix = new BitMatrix(iMax, iMax2);
        int i10 = 0;
        while (i10 < i6) {
            int i11 = i8;
            int i12 = 0;
            while (i12 < i4) {
                if (byteMatrix.a(i12, i10) == 1) {
                    bitMatrix.c(i11, i9, iMin, iMin);
                }
                i12++;
                i11 += iMin;
            }
            i10++;
            i9 += iMin;
        }
        return bitMatrix;
    }
}

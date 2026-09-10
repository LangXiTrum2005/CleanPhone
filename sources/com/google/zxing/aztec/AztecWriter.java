package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class AztecWriter implements Writer {
    @Override // com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        BarcodeFormat barcodeFormat2 = BarcodeFormat.f21331Y;
        Charset charset = StandardCharsets.ISO_8859_1;
        EncodeHintType encodeHintType = EncodeHintType.f21332Y;
        if (enumMap.containsKey(encodeHintType)) {
            Charset.forName(enumMap.get(encodeHintType).toString());
        }
        EncodeHintType encodeHintType2 = EncodeHintType.X;
        if (enumMap.containsKey(encodeHintType2)) {
            Integer.parseInt(enumMap.get(encodeHintType2).toString());
        }
        EncodeHintType encodeHintType3 = EncodeHintType.e0;
        if (enumMap.containsKey(encodeHintType3)) {
            Integer.parseInt(enumMap.get(encodeHintType3).toString());
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat2)));
    }
}

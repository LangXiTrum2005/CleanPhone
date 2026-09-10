package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class DataMatrixWriter implements Writer {
    @Override // com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        BarcodeFormat barcodeFormat2 = BarcodeFormat.f21331Y;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat2)));
    }
}

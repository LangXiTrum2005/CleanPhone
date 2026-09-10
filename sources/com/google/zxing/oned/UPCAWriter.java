package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class UPCAWriter implements Writer {
    @Override // com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(BarcodeFormat.f21331Y)));
    }
}

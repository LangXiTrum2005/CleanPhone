package com.google.zxing.multi.qrcode;

import com.google.zxing.Result;
import com.google.zxing.multi.MultipleBarcodeReader;
import com.google.zxing.qrcode.QRCodeReader;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class QRCodeMultiReader extends QRCodeReader implements MultipleBarcodeReader {

    public static final class SAComparator implements Serializable, Comparator<Result> {
        @Override // java.util.Comparator
        public final int compare(Result result, Result result2) {
            result.getClass();
            throw null;
        }
    }
}

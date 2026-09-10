package com.google.zxing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class BarcodeFormat {
    public static final BarcodeFormat X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final BarcodeFormat f21331Y;
    public static final /* synthetic */ BarcodeFormat[] Z;

    /* JADX INFO: Fake field, exist only in values array */
    BarcodeFormat EF1;

    static {
        BarcodeFormat barcodeFormat = new BarcodeFormat("AZTEC", 0);
        BarcodeFormat barcodeFormat2 = new BarcodeFormat("CODABAR", 1);
        BarcodeFormat barcodeFormat3 = new BarcodeFormat("CODE_39", 2);
        BarcodeFormat barcodeFormat4 = new BarcodeFormat("CODE_93", 3);
        BarcodeFormat barcodeFormat5 = new BarcodeFormat("CODE_128", 4);
        BarcodeFormat barcodeFormat6 = new BarcodeFormat("DATA_MATRIX", 5);
        BarcodeFormat barcodeFormat7 = new BarcodeFormat("EAN_8", 6);
        BarcodeFormat barcodeFormat8 = new BarcodeFormat("EAN_13", 7);
        X = barcodeFormat8;
        BarcodeFormat barcodeFormat9 = new BarcodeFormat("ITF", 8);
        BarcodeFormat barcodeFormat10 = new BarcodeFormat("MAXICODE", 9);
        BarcodeFormat barcodeFormat11 = new BarcodeFormat("PDF_417", 10);
        BarcodeFormat barcodeFormat12 = new BarcodeFormat("QR_CODE", 11);
        f21331Y = barcodeFormat12;
        Z = new BarcodeFormat[]{barcodeFormat, barcodeFormat2, barcodeFormat3, barcodeFormat4, barcodeFormat5, barcodeFormat6, barcodeFormat7, barcodeFormat8, barcodeFormat9, barcodeFormat10, barcodeFormat11, barcodeFormat12, new BarcodeFormat("RSS_14", 12), new BarcodeFormat("RSS_EXPANDED", 13), new BarcodeFormat("UPC_A", 14), new BarcodeFormat("UPC_E", 15), new BarcodeFormat("UPC_EAN_EXTENSION", 16)};
    }

    public static BarcodeFormat valueOf(String str) {
        return (BarcodeFormat) Enum.valueOf(BarcodeFormat.class, str);
    }

    public static BarcodeFormat[] values() {
        return (BarcodeFormat[]) Z.clone();
    }
}

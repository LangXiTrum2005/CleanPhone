package com.google.zxing;

import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiFormatWriter implements Writer {

    /* JADX INFO: renamed from: com.google.zxing.MultiFormatWriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21333a;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            f21333a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21333a[15] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21333a[7] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21333a[14] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21333a[11] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21333a[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21333a[3] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21333a[4] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21333a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21333a[10] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21333a[1] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21333a[5] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21333a[0] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        return new QRCodeWriter().a(str, BarcodeFormat.f21331Y, enumMap);
    }
}

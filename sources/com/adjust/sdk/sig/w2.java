package com.adjust.sdk.sig;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f7022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f7023b;

    static {
        String[] strArr = new String[93];
        for (int i10 = 0; i10 < 32; i10++) {
            int i11 = (i10 >> 12) & 15;
            int i12 = (i10 >> 8) & 15;
            int i13 = (i10 >> 4) & 15;
            int i14 = i10 & 15;
            strArr[i10] = "\\u" + ((char) (i11 < 10 ? i11 + 48 : i11 + 87)) + ((char) (i12 < 10 ? i12 + 48 : i12 + 87)) + ((char) (i13 < 10 ? i13 + 48 : i13 + 87)) + ((char) (i14 < 10 ? i14 + 48 : i14 + 87));
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f7022a = strArr;
        byte[] bArr = new byte[93];
        for (int i15 = 0; i15 < 32; i15++) {
            bArr[i15] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f7023b = bArr;
    }
}

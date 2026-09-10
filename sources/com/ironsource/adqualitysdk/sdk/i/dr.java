package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class dr extends dn {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1797 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1798 = 264;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f1799 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f1800 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1801;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1802 = {379, 378, 372, 310, 361, 374, 367, 346, 365, 373, 375, 380, 381, 369, 333, 384, 363, 376};

    public dr(cl clVar, ee eeVar, String str) {
        this(clVar, eeVar, str, null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.dn
    /* JADX INFO: renamed from: ﻐ */
    public String mo2033() {
        f1801 = (f1797 + 1) % 128;
        String strIntern = m2043(null, View.MeasureSpec.getSize(0) + 127, null, "\u0086\u008b\u008e\u008c\u0092\u0089\u0091\u0090\u008f\u0089\u008a\u008e\u008c\u0086\u008d\u0088\u0089\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern();
        f1797 = (f1801 + 81) % 128;
        return strIntern;
    }

    public dr(cl clVar, ee eeVar, String str, Throwable th2) {
        super(str, new du(clVar.m1651().m1737(), clVar.m1644().m2372(), eeVar), th2);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2043(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2932) {
            try {
                char[] cArr2 = f1802;
                int i11 = f1798;
                if (f1800) {
                    int length = bArr.length;
                    k.f2931 = length;
                    char[] cArr3 = new char[length];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i12 = k.f2933;
                        int i13 = k.f2931 - 1;
                        int i14 = k.f2933;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        k.f2933 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1799) {
                    int length2 = cArr.length;
                    k.f2931 = length2;
                    char[] cArr4 = new char[length2];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i15 = k.f2933;
                        int i16 = k.f2931 - 1;
                        int i17 = k.f2933;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        k.f2933 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                k.f2931 = length3;
                char[] cArr5 = new char[length3];
                k.f2933 = 0;
                while (k.f2933 < k.f2931) {
                    int i18 = k.f2933;
                    int i19 = k.f2931 - 1;
                    int i20 = k.f2933;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    k.f2933 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

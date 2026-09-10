package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.qq.e.comm.managers.GDTAdSdk;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class hg extends gt {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2298 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2299 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2300 = 54;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2301 = {153, 165, 163, 'd', 167, 155, 151, 164, 157, 168, 169, '}', 'z', 138, 'w', 154, 137, 161, 170};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2302 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2303;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        int i10 = f2298 + 119;
        f2303 = i10 % 128;
        String strIntern = (i10 % 2 != 0 ? m2276(null, 67 % TextUtils.lastIndexOf("", (char) 24, 0, 0), null, "\u0093\u0088\u0086\u0081\u0088\u0086\u0093") : m2276(null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, "\u0093\u0088\u0086\u0081\u0088\u0086\u0093")).intern();
        f2303 = (f2298 + 17) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        cf cfVar = new cf(mo2240());
        f2298 = (f2303 + 49) % 128;
        return cfVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        int i10 = f2303 + 57;
        f2298 = i10 % 128;
        return m2276(null, i10 % 2 == 0 ? TextUtils.indexOf((CharSequence) "", '$') + 6538 : TextUtils.indexOf((CharSequence) "", '0') + 128, null, "\u0092\u0090\u0091\u0090\u008f\u008e\u008d\u008c\u0084\u008b\u008a\u0086\u0089\u0087\u0088\u0087\u0083\u0084\u0083\u0083\u0082\u0081\u0084\u0086\u0084\u0085\u0085\u0084\u0083\u0082\u0081").intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = (f2298 + 33) % 128;
        f2303 = i10;
        f2298 = (i10 + 29) % 128;
        return GDTAdSdk.class;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2276(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2301;
                int i11 = f2300;
                if (f2299) {
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
                if (f2302) {
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

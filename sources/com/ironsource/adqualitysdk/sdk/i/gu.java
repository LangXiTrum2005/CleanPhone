package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.inmobi.sdk.InMobiSdk;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gu extends gt {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2231 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2232 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2233 = {278, 290, 288, 225, 284, 289, 277, 294, 279, 286, 252, 256, 262};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2234 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2235 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2236 = 179;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        int i10 = f2231 + 37;
        f2235 = i10 % 128;
        return m2262(null, i10 % 2 != 0 ? TextUtils.indexOf("", "") * 97 : TextUtils.indexOf("", "") + 127, null, "\u0085\u0087\u0082\u0083\u0086\u0085").intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        bp bpVar = new bp(mo2240());
        int i10 = f2235 + 17;
        f2231 = i10 % 128;
        if (i10 % 2 != 0) {
            return bpVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        f2235 = (f2231 + 13) % 128;
        String strIntern = m2262(null, 126 - TextUtils.indexOf((CharSequence) "", '0'), null, "\u008a\u0089\u008d\u0085\u0087\u0082\u008c\u0086\u008b\u0084\u008a\u0089\u0088\u0084\u0085\u0087\u0082\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        int i10 = f2235 + 15;
        f2231 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 38 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = f2231 + 69;
        f2235 = i10 % 128;
        if (i10 % 2 == 0) {
            return InMobiSdk.class;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2262(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2233;
                int i11 = f2236;
                if (f2234) {
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
                if (f2232) {
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

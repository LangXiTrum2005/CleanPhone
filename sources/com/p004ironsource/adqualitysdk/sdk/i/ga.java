package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class ga extends gi {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2057 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2058 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2059 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2060 = 259;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2061;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2062 = {358, 370, 368, 305, 364, 373, 369, 374, 376, 360, 356, 359, 372, 367, 375, 380, 366, 332, 342, 324, 340, 363};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2146(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f2877) {
            try {
                char[] cArr2 = f2062;
                int i3 = f2060;
                if (f2058) {
                    int length = bArr.length;
                    o.f2878 = length;
                    char[] cArr3 = new char[length];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i4 = o.f2879;
                        int i5 = o.f2878 - 1;
                        int i6 = o.f2879;
                        cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                        o.f2879 = i6 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2059) {
                    int length2 = cArr.length;
                    o.f2878 = length2;
                    char[] cArr4 = new char[length2];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i7 = o.f2879;
                        int i8 = o.f2878 - 1;
                        int i9 = o.f2879;
                        cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                        o.f2879 = i9 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                o.f2878 = length3;
                char[] cArr5 = new char[length3];
                o.f2879 = 0;
                while (o.f2879 < o.f2878) {
                    int i10 = o.f2879;
                    int i11 = o.f2878 - 1;
                    int i12 = o.f2879;
                    cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                    o.f2879 = i12 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        f2057 = (f2061 + 55) % 128;
        String strIntern = m2146(null, null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0090\u008f\u0085\u008e\u008b\u0089\u0095\u008c\u0094\u008a\u0081\u0086\u0089\u0082\u0093\u0087\u0082\u0086\u0092\u0084\u0091\u008c\u0088\u0084\u0091\u008c\u0088\u0090\u008f\u0085\u008e\u008b\u0089\u008d\u008c\u008b\u0084\u008a\u0081\u0086\u0089\u0082\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        f2057 = (f2061 + 83) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        f2061 = (f2057 + 53) % 128;
        String strIntern = m2146(null, null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, "\u008c\u008a\u0086\u008b\u0096\u0088\u0090\u008f\u0085\u008e\u008b\u0089\u008d\u008c\u008b").intern();
        int i2 = f2057 + 113;
        f2061 = i2 % 128;
        if (i2 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2061 + 3;
        int i3 = i2 % 128;
        f2057 = i3;
        if (i2 % 2 == 0) {
            int i4 = 92 / 0;
        }
        f2061 = (i3 + 7) % 128;
        return IronSourceAdQuality.class;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        bd bdVar = new bd(mo2139());
        int i2 = f2057 + 51;
        f2061 = i2 % 128;
        if (i2 % 2 == 0) {
            return bdVar;
        }
        throw null;
    }
}

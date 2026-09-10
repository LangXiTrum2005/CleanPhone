package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class fa extends en {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1956 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1957 = {';'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1958 = 17;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f1959 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1960 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f1961 = true;

    public fa(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2117(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f1957;
                int i3 = f1958;
                if (f1959) {
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
                if (f1961) {
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

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2089() {
        int i2 = f1960 + 35;
        f1956 = i2 % 128;
        String strIntern = (i2 % 2 == 0 ? m2117(null, null, 17744 % TextUtils.indexOf((CharSequence) "", (char) 31), "\u0081") : m2117(null, null, TextUtils.indexOf((CharSequence) "", '0') + 128, "\u0081")).intern();
        int i3 = f1956 + 113;
        f1960 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 61 / 0;
        }
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.en
    /* JADX INFO: renamed from: ﾇ */
    public final Number mo2105(Number number, Number number2) {
        if (!(number instanceof Double)) {
            int i2 = f1960;
            f1956 = (i2 + 77) % 128;
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long)) {
                    f1956 = (i2 + 97) % 128;
                    if (!(number2 instanceof Long)) {
                        return Integer.valueOf(number2.intValue() * number.intValue());
                    }
                }
                return Long.valueOf(number2.longValue() * number.longValue());
            }
        }
        return Double.valueOf(number2.doubleValue() * number.doubleValue());
    }
}

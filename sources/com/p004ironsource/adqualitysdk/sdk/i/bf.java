package com.p004ironsource.adqualitysdk.sdk.i;

import android.view.Gravity;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class bf extends bg {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f740 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f741 = {358, 367, 354, 355, 365, 357};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f742 = 289;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f743 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f744 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f745;

    public bf(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m779(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f741;
                int i3 = f742;
                if (f743) {
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
                if (f744) {
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

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﱟ */
    public final boolean mo776() {
        int i2 = (f745 + 33) % 128;
        f740 = i2;
        int i3 = i2 + 35;
        f745 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
        return true;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        int i2 = f745 + 59;
        f740 = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        int i2 = f745 + 85;
        f740 = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        int i2 = f740 + 57;
        f745 = i2 % 128;
        return m779(null, null, i2 % 2 != 0 ? 116 << Gravity.getAbsoluteGravity(1, 1) : Gravity.getAbsoluteGravity(0, 0) + 127, "\u0086\u0081\u0085\u0084\u0083\u0082\u0081").intern();
    }
}

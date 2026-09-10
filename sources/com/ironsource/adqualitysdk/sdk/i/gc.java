package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gc extends gb {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2143 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2144 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2145 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2146 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2147 = {'e'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2148 = 69;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final byte f2149;

    public gc(byte b10) {
        this.f2149 = b10;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2233(StringBuilder sb2, int i10) {
        f2144 = (f2143 + 77) % 128;
        for (int i11 = 0; i11 < i10; i11++) {
            f2144 = (f2143 + 1) % 128;
            sb2.append(m2234(null, 127 - View.MeasureSpec.getMode(0), null, "\u0081\u0081").intern());
        }
        int i12 = f2144 + 69;
        f2143 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2235(StringBuilder sb2) {
        int i10 = f2144 + 69;
        f2143 = i10 % 128;
        int i11 = i10 % 2;
        m2233(sb2, this.f2149);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2236(StringBuilder sb2) {
        int i10 = f2143 + 33;
        f2144 = i10 % 128;
        int i11 = i10 % 2;
        byte b10 = this.f2149;
        m2233(sb2, i11 != 0 ? b10 << (-1) : b10 - 1);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2234(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2147;
                int i11 = f2148;
                if (f2146) {
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
                if (f2145) {
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

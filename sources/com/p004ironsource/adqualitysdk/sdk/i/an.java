package com.p004ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class an {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f311 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f312 = 169;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f313 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f314 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f315;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f316 = {266, 269, 282, 264, 274, 279, 285, 267, 277, 280};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m427(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f316;
                int i3 = f312;
                if (f314) {
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
                if (f313) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m430(Map<String, String> map, String str) {
        int i2;
        f311 = (f315 + 1) % 128;
        if (map.containsKey(str)) {
            return false;
        }
        int size = map.size();
        if (!m431(map)) {
            i2 = 0;
        } else {
            int i3 = f311 + 103;
            f315 = i3 % 128;
            if (i3 % 2 != 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        if (size < 5 + i2) {
            return false;
        }
        int i4 = f311 + 125;
        f315 = i4 % 128;
        return i4 % 2 == 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m431(Map<String, String> map) {
        int i2 = f311 + 111;
        f315 = i2 % 128;
        boolean zContainsKey = map.containsKey(m427(null, null, i2 % 2 != 0 ? 88 << (ViewConfiguration.getWindowTouchSlop() + 32) : (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0088\u008a\u0089\u0088\u0084\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081").intern());
        f311 = (f315 + 79) % 128;
        return zContainsKey;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m428(String str) {
        f315 = (f311 + 117) % 128;
        boolean zEquals = m427(null, null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0088\u008a\u0089\u0088\u0084\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081").intern().equals(str);
        int i2 = f315 + 83;
        f311 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return zEquals;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m429(String str, String str2) {
        f311 = (f315 + 49) % 128;
        if (!(!kd.m2777(str, 64))) {
            f311 = (f315 + 21) % 128;
            if (!(!kd.m2777(str2, 64))) {
                return true;
            }
        }
        f311 = (f315 + 95) % 128;
        return false;
    }
}

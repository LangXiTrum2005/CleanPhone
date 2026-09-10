package com.p004ironsource.adqualitysdk.sdk.i;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public enum hn {
    f2269(-1),
    f2266(0),
    f2268(1),
    f2267(2),
    f2265(3),
    f2263(4),
    f2264(5),
    f2261(6);


    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int f2255 = 1;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char[] f2256;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f2257;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean f2258;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static boolean f2259;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2260;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final int f2270;

    static {
        m2206();
        f2257 = (f2255 + 89) % 128;
    }

    hn(int i2) {
        this.f2270 = i2;
    }

    public static hn valueOf(String str) {
        f2257 = (f2255 + 7) % 128;
        hn hnVar = (hn) Enum.valueOf(hn.class, str);
        f2255 = (f2257 + 75) % 128;
        return hnVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static hn[] valuesCustom() {
        hn[] hnVarArr;
        int i2 = f2255 + 97;
        f2257 = i2 % 128;
        if (i2 % 2 != 0) {
            hnVarArr = (hn[]) values().clone();
            int i3 = 79 / 0;
        } else {
            hnVarArr = (hn[]) values().clone();
        }
        f2255 = (f2257 + 83) % 128;
        return hnVarArr;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2206() {
        f2259 = true;
        f2258 = true;
        f2260 = 113;
        f2256 = new char[]{198, 191, 188, 192, 200, 186, 190, 178, 184, 182, 185, 197, 189, 199, 181, 193, 202, 179, 196, 180, 195};
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2207(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2256;
                int i3 = f2260;
                if (f2258) {
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
                if (f2259) {
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static hn m2208(int i2) {
        int i3 = (f2257 + 53) % 128;
        f2255 = i3;
        switch (i2) {
            case -1:
                return f2269;
            case 0:
                hn hnVar = f2266;
                int i4 = i3 + 53;
                f2257 = i4 % 128;
                if (i4 % 2 == 0) {
                    return hnVar;
                }
                throw null;
            case 1:
                return f2268;
            case 2:
                return f2267;
            case 3:
                return f2265;
            case 4:
                return f2263;
            case 5:
                return f2264;
            case 6:
                return f2261;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m2209() {
        int i2 = f2257 + 31;
        int i3 = i2 % 128;
        f2255 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.f2270;
        int i5 = i3 + 59;
        f2257 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }
}

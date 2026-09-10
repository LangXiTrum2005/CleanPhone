package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.InterfaceC0435l1;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum hv {
    f2408(-1),
    f2405(0),
    f2406(1),
    f2407(2),
    f2404(3),
    f2401(4),
    f2402(5),
    f2400(6);


    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static int f2394 = 1;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char[] f2395;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f2396;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean f2397;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static boolean f2398;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2399;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private final int f2409;

    static {
        m2303();
        int i10 = f2394 + InterfaceC0435l1.d.b.f29110g;
        f2399 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    hv(int i10) {
        this.f2409 = i10;
    }

    public static hv valueOf(String str) {
        int i10 = f2399 + 11;
        f2394 = i10 % 128;
        if (i10 % 2 != 0) {
            return (hv) Enum.valueOf(hv.class, str);
        }
        Enum.valueOf(hv.class, str);
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static hv[] valuesCustom() {
        int i10 = f2399 + 87;
        f2394 = i10 % 128;
        if (i10 % 2 != 0) {
            return (hv[]) values().clone();
        }
        int i11 = 54 / 0;
        return (hv[]) values().clone();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2303() {
        f2398 = true;
        f2397 = true;
        f2396 = 297;
        f2395 = new char[]{382, 375, 372, 376, 384, 370, 374, 362, 368, 366, 369, 381, 373, 383, 365, 377, 386, 363, 380, 364, 379};
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static hv m2304(int i10) {
        int i11 = (f2394 + 23) % 128;
        f2399 = i11;
        switch (i10) {
            case -1:
                return f2408;
            case 0:
                return f2405;
            case 1:
                return f2406;
            case 2:
                return f2407;
            case 3:
                return f2404;
            case 4:
                hv hvVar = f2401;
                int i12 = i11 + 63;
                f2394 = i12 % 128;
                if (i12 % 2 != 0) {
                    return hvVar;
                }
                throw null;
            case 5:
                return f2402;
            case 6:
                return f2400;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m2306() {
        int i10 = f2394 + 23;
        int i11 = i10 % 128;
        f2399 = i11;
        int i12 = i10 % 2;
        int i13 = this.f2409;
        if (i12 != 0) {
            int i14 = 3 / 0;
        }
        f2394 = (i11 + InterfaceC0435l1.d.b.f29110g) % 128;
        return i13;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2305(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2395;
                int i11 = f2396;
                if (f2397) {
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
                if (f2398) {
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

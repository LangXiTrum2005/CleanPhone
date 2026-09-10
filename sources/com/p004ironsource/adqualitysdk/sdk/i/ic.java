package com.p004ironsource.adqualitysdk.sdk.i;

import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.dc;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class ic {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2356 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2357;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ boolean f2358;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static final byte[] f2359;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static final byte[] f2360;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2361;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2362;

    static {
        m2390();
        f2358 = true;
        f2359 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f2360 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
        f2357 = (f2356 + 31) % 128;
    }

    private ic() {
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2390() {
        f2361 = (char) 6;
        f2362 = new char[]{'i', 'n', 'v', 'a', 'l', 'd', ' ', 'p', 'g', 'b', 'y', 't', 'e', '\'', dc.T, 'o', 'f', 's', 'c', AbstractJsonLexerKt.UNICODE_ESC, 'h', 'r', 'B', '6', '4', AbstractJsonLexerKt.COLON, '(', 'm', ')', 'j', 'k', 'q', 'w', 'x', 'z', AbstractJsonLexerKt.BEGIN_OBJ};
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] m2392(byte[] bArr, int i2, int i3, byte[] bArr2) {
        int i4;
        byte[] bArr3;
        int i5;
        int i6;
        int i7;
        int i8 = f2357 + 119;
        f2356 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = (i3 - 5) % 3;
            i4 = i3 / 2;
            bArr3 = new byte[i9 - (i9 % Integer.MAX_VALUE)];
            i5 = 0;
            i7 = 0;
            i6 = 1;
        } else {
            int i10 = ((i3 + 2) / 3) << 2;
            i4 = i3 - 2;
            bArr3 = new byte[(i10 / Integer.MAX_VALUE) + i10];
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        while (i6 < i4) {
            int i11 = ((bArr[i6] << 24) >>> 8) | ((bArr[i6 + 1] << 24) >>> 16) | ((bArr[i6 + 2] << 24) >>> 24);
            bArr3[i7] = bArr2[i11 >>> 18];
            int i12 = i7 + 1;
            bArr3[i12] = bArr2[(i11 >>> 12) & 63];
            bArr3[i7 + 2] = bArr2[(i11 >>> 6) & 63];
            bArr3[i7 + 3] = bArr2[i11 & 63];
            i5 += 4;
            if (i5 == Integer.MAX_VALUE) {
                int i13 = (f2356 + 21) % 128;
                f2357 = i13;
                bArr3[i7 + 4] = 10;
                f2356 = (i13 + 125) % 128;
                i5 = 0;
                i7 = i12;
            }
            i6 += 3;
            i7 += 4;
        }
        if (i6 < i3) {
            m2396(bArr, i6, i3 - i6, bArr3, i7, bArr2);
            if (i5 + 4 == Integer.MAX_VALUE) {
                bArr3[i7 + 4] = 10;
                i7++;
            }
            i7 += 4;
            f2357 = (f2356 + 95) % 128;
        }
        if (f2358 || i7 == bArr3.length) {
            return bArr3;
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m2396(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, byte[] bArr3) {
        int i5;
        int i6;
        int i7 = f2357;
        f2356 = (i7 + 51) % 128;
        int i8 = 0;
        if (i3 > 0) {
            int i9 = i7 + 81;
            f2356 = i9 % 128;
            i5 = i9 % 2 == 0 ? (bArr[i2] / 49) >> 15 : (bArr[i2] << 24) >>> 8;
        } else {
            i5 = 0;
        }
        if (i3 > 1) {
            i6 = (bArr[i2 + 1] << 24) >>> 16;
        } else {
            f2357 = (f2356 + 83) % 128;
            i6 = 0;
        }
        int i10 = i5 | i6;
        if (i3 > 2) {
            f2356 = (f2357 + 93) % 128;
            i8 = (bArr[i2 + 2] << 24) >>> 24;
        }
        int i11 = i10 | i8;
        if (i3 == 1) {
            bArr2[i4] = bArr3[i11 >>> 18];
            bArr2[i4 + 1] = bArr3[(i11 >>> 12) & 63];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
            return bArr2;
        }
        if (i3 == 2) {
            bArr2[i4] = bArr3[i11 >>> 18];
            bArr2[i4 + 1] = bArr3[(i11 >>> 12) & 63];
            bArr2[i4 + 2] = bArr3[(i11 >>> 6) & 63];
            bArr2[i4 + 3] = 61;
            return bArr2;
        }
        if (i3 != 3) {
            return bArr2;
        }
        bArr2[i4] = bArr3[i11 >>> 18];
        bArr2[i4 + 1] = bArr3[(i11 >>> 12) & 63];
        bArr2[i4 + 2] = bArr3[(i11 >>> 6) & 63];
        bArr2[i4 + 3] = bArr3[i11 & 63];
        return bArr2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2397(byte[] bArr) {
        f2356 = (f2357 + 19) % 128;
        String strM2394 = m2394(bArr, bArr.length, f2359);
        int i2 = f2357 + 29;
        f2356 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
        return strM2394;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2389(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f2362;
                char c2 = f2361;
                char[] cArr3 = new char[i2];
                if (i2 % 2 != 0) {
                    i2--;
                    cArr3[i2] = (char) (cArr[i2] - b2);
                }
                if (i2 > 1) {
                    i.f2348 = 0;
                    while (true) {
                        int i3 = i.f2348;
                        if (i3 >= i2) {
                            break;
                        }
                        i.f2347 = cArr[i3];
                        i.f2345 = cArr[i.f2348 + 1];
                        if (i.f2347 == i.f2345) {
                            cArr3[i.f2348] = (char) (i.f2347 - b2);
                            cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                        } else {
                            i.f2346 = i.f2347 / c2;
                            i.f2342 = i.f2347 % c2;
                            i.f2344 = i.f2345 / c2;
                            i.f2341 = i.f2345 % c2;
                            if (i.f2342 == i.f2341) {
                                i.f2346 = a.b(i.f2346, c2, 1, c2);
                                i.f2344 = a.b(i.f2344, c2, 1, c2);
                                int i4 = (i.f2346 * c2) + i.f2342;
                                int i5 = (i.f2344 * c2) + i.f2341;
                                int i6 = i.f2348;
                                cArr3[i6] = cArr2[i4];
                                cArr3[i6 + 1] = cArr2[i5];
                            } else if (i.f2346 == i.f2344) {
                                i.f2342 = a.b(i.f2342, c2, 1, c2);
                                i.f2341 = a.b(i.f2341, c2, 1, c2);
                                int i7 = (i.f2346 * c2) + i.f2342;
                                int i8 = (i.f2344 * c2) + i.f2341;
                                int i9 = i.f2348;
                                cArr3[i9] = cArr2[i7];
                                cArr3[i9 + 1] = cArr2[i8];
                            } else {
                                int i10 = (i.f2346 * c2) + i.f2341;
                                int i11 = (i.f2344 * c2) + i.f2342;
                                int i12 = i.f2348;
                                cArr3[i12] = cArr2[i10];
                                cArr3[i12 + 1] = cArr2[i11];
                            }
                        }
                        i.f2348 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] m2398(byte[] bArr, int i2) throws ie {
        int i3 = f2356 + 51;
        f2357 = i3 % 128;
        return i3 % 2 != 0 ? m2395(bArr, 0, i2, f2360) : m2395(bArr, 0, i2, f2360);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2394(byte[] bArr, int i2, byte[] bArr2) {
        byte[] bArrM2392 = m2392(bArr, 0, i2, bArr2);
        String str = new String(bArrM2392, 0, bArrM2392.length);
        int i3 = f2357 + 29;
        f2356 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 86 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static byte[] m2391(String str) throws ie {
        f2357 = (f2356 + 47) % 128;
        byte[] bytes = str.getBytes();
        byte[] bArrM2398 = m2398(bytes, bytes.length);
        int i2 = f2356 + 95;
        f2357 = i2 % 128;
        if (i2 % 2 == 0) {
            return bArrM2398;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int m2393(byte[] bArr, byte[] bArr2, int i2, byte[] bArr3) {
        byte b2 = bArr[2];
        if (b2 == 61) {
            int i3 = (f2357 + 23) % 128;
            f2356 = i3;
            bArr2[i2] = (byte) ((((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6)) >>> 16);
            f2357 = (i3 + 47) % 128;
            return 1;
        }
        byte b3 = bArr[3];
        if (b3 == 61) {
            int i4 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b2] << 24) >>> 18);
            bArr2[i2] = (byte) (i4 >>> 16);
            bArr2[i2 + 1] = (byte) (i4 >>> 8);
            return 2;
        }
        int i5 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b2] << 24) >>> 18) | ((bArr3[b3] << 24) >>> 24);
        bArr2[i2] = (byte) (i5 >> 16);
        bArr2[i2 + 1] = (byte) (i5 >> 8);
        bArr2[i2 + 2] = (byte) i5;
        return 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r13 <= 1) goto L24;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m2395(byte[] r17, int r18, int r19, byte[] r20) throws com.p004ironsource.adqualitysdk.sdk.i.ie {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.ic.m2395(byte[], int, int, byte[]):byte[]");
    }
}

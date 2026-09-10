package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class go extends gt {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2201 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2202 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2203 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2204 = {258, 281, 276, 261, 260, 257, 270, 259};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2205 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2206 = 160;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c extends go {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2207 = 1;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2209;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char[] f2208 = {'c', 50890, 36135, 21441, 6902, 57664, 42922, 28390, 13644, 64428, 49692, 35188, 20441, 5711, 56693, 41935, 27195, 12507, 63477, 48719, 33921, 19431, 4687, 55479, 40715, 26233, 11433, 62281, 47725, 32961, 18239, 3541, 54473, 39723, 24963, 10491, 61210, 46473, 31807, 17252, 2459, 53257, 38777};

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f2210 = -5994887538470238555L;

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾇ */
        public final String mo2242() {
            int i10 = f2207 + 97;
            f2209 = i10 % 128;
            return (i10 % 2 != 0 ? m2254((char) View.resolveSize(1, 1), 1 - ((byte) KeyEvent.getModifierMetaStateMask()), 73 / (ViewConfiguration.getScrollDefaultDelay() + 84)) : m2254((char) View.resolveSize(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 1, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 43)).intern();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo2243() {
            Class<PAGSdk> cls;
            int i10 = f2207;
            int i11 = i10 + 45;
            f2209 = i11 % 128;
            if (i11 % 2 != 0) {
                cls = PAGSdk.class;
                int i12 = 38 / 0;
            } else {
                cls = PAGSdk.class;
            }
            int i13 = i10 + 39;
            f2209 = i13 % 128;
            if (i13 % 2 == 0) {
                return cls;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2254(char c4, int i10, int i11) {
            String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1153) {
                try {
                    char[] cArr = new char[i11];
                    com.ironsource.adqualitysdk.sdk.i.c.f1154 = 0;
                    while (true) {
                        int i12 = com.ironsource.adqualitysdk.sdk.i.c.f1154;
                        if (i12 < i11) {
                            cArr[i12] = (char) ((((long) f2208[i10 + i12]) ^ (((long) i12) * f2210)) ^ ((long) c4));
                            com.ironsource.adqualitysdk.sdk.i.c.f1154 = i12 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d extends go {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2211 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2212 = 1;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f2213 = {'g', 214, 224, 215, 178, 183, 216, 211, 209, 209, 197, 197, 188, 180, 190, 171, 182, 209, 213, 213, 204, 209, 211, 212, 217, 184, 182, 209, 213, 186, 179, 206, 210, 209, 204};

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾇ */
        public final String mo2242() {
            f2212 = (f2211 + 77) % 128;
            String strIntern = m2255("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{0, 35, 106, 8}, true).intern();
            f2212 = (f2211 + 23) % 128;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo2243() {
            int i10 = (f2212 + 53) % 128;
            f2211 = i10;
            f2212 = (i10 + 9) % 128;
            return TTAdSdk.class;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2255(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
            String str2;
            Object bytes = str;
            if (str != null) {
                bytes = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            synchronized (h.f2261) {
                try {
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    int i12 = iArr[2];
                    int i13 = iArr[3];
                    char[] cArr = new char[i11];
                    System.arraycopy(f2213, i10, cArr, 0, i11);
                    if (bArr != null) {
                        char[] cArr2 = new char[i11];
                        h.f2262 = 0;
                        char c4 = 0;
                        while (true) {
                            int i14 = h.f2262;
                            if (i14 >= i11) {
                                break;
                            }
                            if (bArr[i14] == 1) {
                                cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                            } else {
                                cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                            }
                            c4 = cArr2[i14];
                            h.f2262 = i14 + 1;
                        }
                        cArr = cArr2;
                    }
                    if (i13 > 0) {
                        char[] cArr3 = new char[i11];
                        System.arraycopy(cArr, 0, cArr3, 0, i11);
                        int i15 = i11 - i13;
                        System.arraycopy(cArr3, 0, cArr, i15, i13);
                        System.arraycopy(cArr3, i13, cArr, 0, i15);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i11];
                        h.f2262 = 0;
                        while (true) {
                            int i16 = h.f2262;
                            if (i16 >= i11) {
                                break;
                            }
                            cArr4[i16] = cArr[(i11 - i16) - 1];
                            h.f2262 = i16 + 1;
                        }
                        cArr = cArr4;
                    }
                    if (i12 > 0) {
                        h.f2262 = 0;
                        while (true) {
                            int i17 = h.f2262;
                            if (i17 >= i11) {
                                break;
                            }
                            cArr[i17] = (char) (cArr[i17] - iArr[2]);
                            h.f2262 = i17 + 1;
                        }
                    }
                    str2 = new String(cArr);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2253(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2204;
                int i11 = f2206;
                if (f2205) {
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
                if (f2202) {
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        f2201 = (f2203 + 67) % 128;
        String strIntern = m2253(null, ImageFormat.getBitsPerPixel(0) + 128, null, "\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        int i10 = f2201 + 123;
        f2203 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        bm bmVar = new bm(mo2240());
        int i10 = f2203 + 87;
        f2201 = i10 % 128;
        if (i10 % 2 != 0) {
            return bmVar;
        }
        throw null;
    }
}

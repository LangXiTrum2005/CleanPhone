package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class hh extends gt {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2304 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2305 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2306 = -1271976467987319840L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2277(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2435) {
            try {
                i.f2436 = i10;
                char[] cArr2 = new char[cArr.length];
                i.f2434 = 0;
                while (true) {
                    int i11 = i.f2434;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f2306);
                        i.f2434++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        f2304 = (f2305 + 107) % 128;
        String strIntern = m2277("뎕嚯秋᳷✝쨤\ued42\uf074", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 58657).intern();
        int i10 = f2304 + 81;
        f2305 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 7 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        cg cgVar = new cg(mo2240());
        f2305 = (f2304 + 73) % 128;
        return cgVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        int i10 = f2304 + 31;
        f2305 = i10 % 128;
        return m2277("뎃걼豫\uec17챙ⰱ\u0c3b氱䰁걘賺\uecbf쳷Ⳓ\u0cd8沫䲹겠貓\uec9a촲ⵚ൬浜䵜괢贝\ued24촆ⴑෳ淮䷥귀", i10 % 2 != 0 ? 16180 / View.resolveSize(1, 1) : 8179 - View.resolveSize(0, 0)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = f2305 + 59;
        f2304 = i10 % 128;
        if (i10 % 2 != 0) {
            return UnityServices.class;
        }
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d extends gt {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2307 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f2308 = {'1', 'i', 'n', 'M', 'Q', 'q', 'k', 'n', 'v', 'V', 'K', 'I', 'P', 'l', 'k', 't', 'o', 'f', 'd', 'l', 'P', 'G', 'b', 'k', 'P', 'G', 'b', 'l', 'q', 'k', 'n', 'Q', '7', 'R', '\\', 'a', 'k', 'n', 'Z', 'R', 'k', 'n', 'o', 'o', 'n', 'v', '2', 'b', 'm', 'v', 'n', 'k', 'q', 't'};

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2309 = 1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static boolean m2278() {
            boolean zM685 = ay.m685(new hh());
            int i10 = f2309 + 119;
            f2307 = i10 % 128;
            if (i10 % 2 == 0) {
                return zM685;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﻛ */
        public final String mo2240() {
            int i10 = f2309 + 85;
            f2307 = i10 % 128;
            return (i10 % 2 != 0 ? m2279("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{46, 8, 0, 7}, true) : m2279("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{46, 8, 0, 7}, true)).intern();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ｋ */
        public final be mo2241() {
            cg.c cVar = new cg.c(mo2240());
            f2309 = (f2307 + 121) % 128;
            return cVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾇ */
        public final String mo2242() {
            int i10 = f2307 + 71;
            f2309 = i10 % 128;
            if (i10 % 2 == 0) {
                m2278();
                throw null;
            }
            if (!m2278()) {
                return m2279("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{0, 46, 0, 0}, false).intern();
            }
            int i11 = (f2307 + 123) % 128;
            f2309 = i11;
            f2307 = (i11 + 41) % 128;
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo2243() {
            int i10 = f2309 + 9;
            f2307 = i10 % 128;
            if (i10 % 2 != 0) {
                m2278();
                throw null;
            }
            if (m2278()) {
                return null;
            }
            f2307 = (f2309 + 41) % 128;
            return AdUnitActivity.class;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2279(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
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
                    System.arraycopy(f2308, i10, cArr, 0, i11);
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
}

package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;
import com.my.target.common.MyTargetManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gz extends gt {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2257 = {'c', 'o', 'm', '.', 'y', 't', 'a', 'r', 'g', 'e', 'n', 'M', 'T', 'd', 'f', 'h'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2258 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2259 = 4;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2260;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        int maximumDrawingCacheSize;
        int iArgb;
        int i10 = f2258 + 99;
        f2260 = i10 % 128;
        if (i10 % 2 != 0) {
            maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() % 124) + 37;
            iArgb = Color.argb(1, 1, 0, 1) + 73;
        } else {
            maximumDrawingCacheSize = 8 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            iArgb = 41 - Color.argb(0, 0, 0, 0);
        }
        String strIntern = m2267(maximumDrawingCacheSize, "\u0000\u0006\u0006\u0007\u0004\u000b\r\t", (byte) iArgb).intern();
        f2260 = (f2258 + 59) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        bx bxVar = new bx(mo2240());
        f2260 = (f2258 + 121) % 128;
        return bxVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        f2258 = (f2260 + 125) % 128;
        String strIntern = m2267((ViewConfiguration.getTapTimeout() >> 16) + 36, "\u0001\u0002\u0003\u0000\u0000\u0006\u0001\u0007\u0007\u0004\t\n\u0007\u0001\u0001\u0002\u0094\u0094\u0002\t\u0007\u000f\b\u0000\u0007\u0004\t\n\u0007\t\n\u000e\u0004\n\u000b\u0005", (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 39)).intern();
        int i10 = f2258 + 89;
        f2260 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = f2260 + 1;
        f2258 = i10 % 128;
        if (i10 % 2 != 0) {
            return MyTargetManager.class;
        }
        int i11 = 25 / 0;
        return MyTargetManager.class;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2267(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f2257;
                char c4 = f2259;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    j.f2654 = 0;
                    while (true) {
                        int i11 = j.f2654;
                        if (i11 >= i10) {
                            break;
                        }
                        j.f2653 = cArr[i11];
                        j.f2650 = cArr[j.f2654 + 1];
                        if (j.f2653 == j.f2650) {
                            cArr3[j.f2654] = (char) (j.f2653 - b10);
                            cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                        } else {
                            j.f2652 = j.f2653 / c4;
                            j.f2649 = j.f2653 % c4;
                            j.f2651 = j.f2650 / c4;
                            j.f2648 = j.f2650 % c4;
                            if (j.f2649 == j.f2648) {
                                j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                int i12 = (j.f2652 * c4) + j.f2649;
                                int i13 = (j.f2651 * c4) + j.f2648;
                                int i14 = j.f2654;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (j.f2652 == j.f2651) {
                                j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                int i15 = (j.f2652 * c4) + j.f2649;
                                int i16 = (j.f2651 * c4) + j.f2648;
                                int i17 = j.f2654;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (j.f2652 * c4) + j.f2648;
                                int i19 = (j.f2651 * c4) + j.f2649;
                                int i20 = j.f2654;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        j.f2654 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}

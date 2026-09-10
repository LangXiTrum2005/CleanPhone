package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ds extends dr {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1803 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1804 = {'E', 'r', 'o', ' ', 'e', 'x', 'c', 'u', 't', 'i', 'n', 'g', 'm', 'h', 'd', ':', 'M', 's', 'p', 'l', '.', 'a', 'U', 'B', 'F'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1805 = 5;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1806 = 1;

    public ds(cl clVar, ee eeVar, String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2044(Color.rgb(0, 0, 0) + 16777232, "\u0001\u0002\u0002\u0003\u0002\u0004\u0000\t\u0001\t\b\t\u0005\u000e\r\u0001", (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 32)).intern());
        sb2.append(str);
        super(clVar, eeVar, f2.k(m2044(View.getDefaultSize(0, 0) + 31, "\u0002\r\u0003\t\f\u0003\n\u0013\u0001\u0012\u0003\t\f\u0003\r\u0004\f\u0000\r\b\u0016\f©©\u0003\u0002\t\u0003\n\u0013Y", (byte) (Process.getGidForName("") + 58)), str2, sb2));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2044(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f1804;
                char c4 = f1805;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.dr, com.ironsource.adqualitysdk.sdk.i.dn
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2033() {
        f1803 = (f1806 + 65) % 128;
        String strIntern = m2044(MotionEvent.axisFromString("") + 42, "\u0010\u0002\u000f\u0018\u0010\u0018\u000b\f\u0015\u0017\f\u000f\b\u0011\u0011\u0003\u0003\u0006\t\u0013\u0015\u0003\u000e\u0013\u000e\u0001\u0013\u0001\r\u0012\u0004\f\u0005\n\t\u0001\u0017\r\u0007\u0004Ö", (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + InterfaceC0435l1.d.b.f29107d)).intern();
        int i10 = f1806 + 75;
        f1803 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 44 / 0;
        }
        return strIntern;
    }
}

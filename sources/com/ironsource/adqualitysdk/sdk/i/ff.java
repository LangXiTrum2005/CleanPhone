package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.View;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ff extends ey {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2043 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2044 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2045 = {'-'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2046 = 1;

    public ff(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2206(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f2045;
                char c4 = f2044;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.ey
    /* JADX INFO: renamed from: ﻛ */
    public final Number mo2199(Number number, Number number2) {
        int i10 = f2043 + 57;
        f2046 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if ((number instanceof Double) || (number2 instanceof Double)) {
            return Double.valueOf(number.doubleValue() - number2.doubleValue());
        }
        if (!(number instanceof Long) && !(number2 instanceof Long)) {
            return Integer.valueOf(number.intValue() - number2.intValue());
        }
        Long lValueOf = Long.valueOf(number.longValue() - number2.longValue());
        int i11 = f2043 + 53;
        f2046 = i11 % 128;
        if (i11 % 2 != 0) {
            return lValueOf;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2179() {
        int iRed;
        int iResolveSizeAndState;
        int i10 = f2043 + 37;
        f2046 = i10 % 128;
        if (i10 % 2 == 0) {
            iRed = 1 - Color.red(1);
            iResolveSizeAndState = 25 >>> View.resolveSizeAndState(0, 0, 1);
        } else {
            iRed = 1 - Color.red(0);
            iResolveSizeAndState = 101 - View.resolveSizeAndState(0, 0, 0);
        }
        String strIntern = m2206(iRed, "\u0092", (byte) iResolveSizeAndState).intern();
        int i11 = f2043 + InterfaceC0435l1.d.b.f29109f;
        f2046 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 1 / 0;
        }
        return strIntern;
    }
}

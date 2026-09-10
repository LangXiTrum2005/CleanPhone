package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class eq extends ef {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1984 = 5;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1985 = {'E', 'r', 'o', ' ', 'e', 'v', 'a', 'l', 'u', 't', 'i', 'n', 'g', 'x', 'p', 's', '\'', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1986 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1987 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final String f1988;

    public eq(String str) {
        this.f1988 = eb.m2127(str);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2188(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f1985;
                char c4 = f1984;
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

    public final boolean equals(Object obj) {
        int i10 = f1986;
        int i11 = i10 + 83;
        f1987 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i12 = i10 + 31;
            f1987 = i12 % 128;
            if (i12 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (obj != null && eq.class == obj.getClass()) {
            return this.f1988.equals(((eq) obj).f1988);
        }
        f1986 = (f1987 + 69) % 128;
        return false;
    }

    public final int hashCode() {
        int i10 = f1987;
        int i11 = (i10 + 115) % 128;
        f1986 = i11;
        String str = this.f1988;
        if (str != null) {
            f1987 = (i11 + 69) % 128;
            return str.hashCode();
        }
        int i12 = i10 + 39;
        f1986 = i12 % 128;
        if (i12 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public final String toString() {
        int i10 = f1987 + InterfaceC0435l1.d.b.f29110g;
        f1986 = i10 % 128;
        int i11 = i10 % 2;
        String strM2189 = m2189();
        if (i11 != 0) {
            int i12 = 15 / 0;
        }
        int i13 = f1986 + 69;
        f1987 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 35 / 0;
        }
        return strM2189;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m2189() {
        int i10 = (f1987 + InterfaceC0435l1.d.b.f29112i) % 128;
        f1986 = i10;
        String str = this.f1988;
        int i11 = i10 + 123;
        f1987 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 51 / 0;
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public final ea mo2164(ee eeVar, cl clVar) {
        try {
            return new ea(eeVar.m2157(m2189()));
        } catch (Exception unused) {
            dz dzVarM1648 = clVar.m1648(m2189());
            if (dzVarM1648 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2188(29 - (ViewConfiguration.getTouchSlop() >> 8), "\u0001\u0002\u0002\u0003\u0002\u0004\u0000\t\u0007\b\t\u0007\u0005\u000e\f\r\u0004\u0000\u000e\n\u0002\u0000ÃÃ\f\u0000\r\u0001w", (byte) (80 - TextUtils.indexOf("", "", 0))).intern());
                sb2.append(this);
                new dr(clVar, eeVar, f2.m(sb2, m2188((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "2", (byte) (Color.alpha(0) + 11)))).m2034(clVar.m1643());
                return new ea(null);
            }
            ea eaVar = new ea(dzVarM1648);
            int i10 = f1986 + 21;
            f1987 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 98 / 0;
            }
            return eaVar;
        }
    }
}

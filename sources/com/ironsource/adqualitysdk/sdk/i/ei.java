package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ei extends ef {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1936 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1937 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1938 = 56;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f1939;

    public ei(String str) {
        this.f1939 = eb.m2127(str);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2168(int i10, boolean z10, int i11, String str, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (d.f1625) {
            try {
                char[] cArr2 = new char[i10];
                d.f1622 = 0;
                while (true) {
                    int i13 = d.f1622;
                    if (i13 >= i10) {
                        break;
                    }
                    d.f1624 = cArr[i13];
                    cArr2[d.f1622] = (char) (d.f1624 + i11);
                    int i14 = d.f1622;
                    cArr2[i14] = (char) (cArr2[i14] - f1938);
                    d.f1622 = i14 + 1;
                }
                if (i12 > 0) {
                    d.f1623 = i12;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = d.f1623;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = d.f1623;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    d.f1622 = 0;
                    while (true) {
                        int i17 = d.f1622;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        d.f1622 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        int i10 = f1936;
        int i11 = i10 + 79;
        f1937 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            f1937 = (i10 + 5) % 128;
            return true;
        }
        if (obj == null || ei.class != obj.getClass()) {
            int i12 = f1936 + 121;
            f1937 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 32 / 0;
            }
            return false;
        }
        ei eiVar = (ei) obj;
        String str = this.f1939;
        if (str != null) {
            return str.equals(eiVar.f1939);
        }
        if (eiVar.f1939 != null) {
            return false;
        }
        int i14 = (f1936 + 7) % 128;
        f1937 = i14;
        int i15 = i14 + 31;
        f1936 = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 40 / 0;
        }
        return true;
    }

    public final int hashCode() {
        f1936 = (f1937 + 97) % 128;
        String str = this.f1939;
        if (str == null) {
            return 0;
        }
        int iHashCode = str.hashCode();
        int i10 = f1936 + InterfaceC0435l1.d.b.f29110g;
        f1937 = i10 % 128;
        if (i10 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i10 = f1936;
        int i11 = i10 + 33;
        f1937 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.f1939;
        int i12 = i10 + 87;
        f1937 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 94 / 0;
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public final ea mo2164(ee eeVar, cl clVar) {
        ea eaVar = new ea(clVar.m1640().m817(kn.m2921(this.f1939, m2168((ViewConfiguration.getLongPressTimeout() >> 16) + 6, true, (ViewConfiguration.getWindowTouchSlop() >> 8) + 152, "\u0013\u0001\f\u0003ￎ\u0013", Color.red(0) + 5).intern())));
        f1936 = (f1937 + 3) % 128;
        return eaVar;
    }
}

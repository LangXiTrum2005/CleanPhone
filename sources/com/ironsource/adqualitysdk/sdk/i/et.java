package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class et extends em {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1996 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1997 = 42719;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1998 = 13909;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1999 = 65173;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2000 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2001 = 20570;

    public et(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2193(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2001)) ^ ((c5 >>> 5) + f1997)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f1998) ^ ((c10 + i12) ^ ((c10 << 4) + f1999))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public final ea mo2164(ee eeVar, cl clVar) {
        return new ea(Boolean.valueOf(m2177().m2165(eeVar, clVar).m2125() && m2178().m2165(eeVar, clVar).m2125()));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2179() {
        int i10 = f1996 + InterfaceC0435l1.d.b.f29112i;
        f2000 = i10 % 128;
        return (i10 % 2 != 0 ? m2193("ϳꐷ", 4 / (ViewConfiguration.getMaximumFlingVelocity() - 101)) : m2193("ϳꐷ", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2)).intern();
    }
}

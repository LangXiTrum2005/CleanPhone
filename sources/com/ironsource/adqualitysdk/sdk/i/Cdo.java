package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.do, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Cdo extends dn {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1780 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1781 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1782 = 7938959468981786035L;

    public Cdo(String str, String str2, String str3, int i10, String str4) {
        this(str, str2, str3, i10, str4, null);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2035(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f1782);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.dn
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2033() {
        f1781 = (f1780 + 87) % 128;
        String strIntern = m2035("ᗀ\u2d9e敡벀\uf4a3ఉ䟧齍흥\ueeb4♤秔놴줉ï塅逆ꮄ\ue37e㫛犯訌췰Օ崵", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14431).intern();
        f1780 = (f1781 + InterfaceC0435l1.d.b.f29105b) % 128;
        return strIntern;
    }

    public Cdo(String str, String str2, String str3, int i10, String str4, Throwable th2) {
        super(str4, new dq(str, str2, str3, i10), th2);
    }
}

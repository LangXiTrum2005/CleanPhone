package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.applovin.sdk.AppLovinSdk;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gi extends gt {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2174 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2175 = 8374112132067932592L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2176 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        f2174 = (f2176 + 53) % 128;
        String strIntern = m2247("맑ቝ\ueefa묋ឫ\ue3d7뱷\u0895", Color.red(0) + 43933).intern();
        f2174 = (f2176 + InterfaceC0435l1.d.b.f29114k) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        bj bjVar = new bj(mo2240());
        int i10 = f2176 + 63;
        f2174 = i10 % 128;
        if (i10 % 2 == 0) {
            return bjVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        f2174 = (f2176 + 35) % 128;
        String strIntern = m2247("맓ꏎ跿\uf7ad톕㮕▦ྫ楗卟뵳ꝥ腒\ueb1e픺㼤ᢎː泲嚃남骺蒰\uee5e졆㉊ᱮؐ", (ViewConfiguration.getJumpTapTimeout() >> 16) + 6673).intern();
        int i10 = f2176 + 91;
        f2174 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = f2174 + 5;
        f2176 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 85 / 0;
        }
        return AppLovinSdk.class;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2247(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f2175);
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
}

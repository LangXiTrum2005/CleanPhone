package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.chartboost.sdk.Chartboost;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gr extends gt {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2222 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2223 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2224 = 8706025318067162097L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        f2223 = (f2222 + 41) % 128;
        String strIntern = m2258("舶艕\udae6樤酿ﶧ䎹ꀘ궆\ueaa8㩮偁\uddcd㩲", 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern();
        int i10 = f2223 + 73;
        f2222 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        bk bkVar = new bk(mo2240());
        int i10 = f2222 + InterfaceC0435l1.d.b.f29107d;
        f2223 = i10 % 128;
        if (i10 % 2 == 0) {
            return bkVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        int i10 = f2222 + 13;
        f2223 = i10 % 128;
        String strIntern = m2258("䖦䗅ꧦⴗ\ue278몘븢巟樁馥絟귇ᩚ䥣䶝ﴖ쪙㤱鶘쵎㮝\ue912\uec44ᲂ\uab1a\ud8dc㱜泱孜袞\u0c8d밺எ", i10 % 2 != 0 ? 1 / (ViewConfiguration.getTapTimeout() * 36) : 1 - (ViewConfiguration.getTapTimeout() >> 16)).intern();
        int i11 = f2222 + 65;
        f2223 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 83 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = f2222 + 41;
        f2223 = i10 % 128;
        if (i10 % 2 == 0) {
            return Chartboost.class;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2258(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2127) {
            try {
                char[] cArrM2229 = g.m2229(f2224, cArr, i10);
                g.f2129 = 4;
                while (true) {
                    int i11 = g.f2129;
                    if (i11 < cArrM2229.length) {
                        int i12 = i11 - 4;
                        g.f2128 = i12;
                        cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f2224));
                        g.f2129 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}

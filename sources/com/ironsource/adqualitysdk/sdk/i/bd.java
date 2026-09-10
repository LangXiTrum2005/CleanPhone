package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bd extends be {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f730 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f731 = 85;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f732 = 1;

    public bd(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean mo807() {
        int i10 = f730 + 49;
        int i11 = i10 % 128;
        f732 = i11;
        boolean z10 = i10 % 2 != 0;
        int i12 = i11 + 81;
        f730 = i12 % 128;
        if (i12 % 2 == 0) {
            return z10;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f732 = (f730 + 41) % 128;
        String strIntern = m806((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 6, true, 155 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\ufffb\b\uffff\ufffe\uffff\u0006￼", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3).intern();
        int i10 = f730 + 65;
        f732 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 41 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        int i10 = f732 + 13;
        int i11 = i10 % 128;
        f730 = i11;
        if (i10 % 2 != 0) {
            int i12 = 40 / 0;
        }
        f732 = (i11 + 33) % 128;
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        f732 = (f730 + 9) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m806(int i10, boolean z10, int i11, String str, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f731);
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
}

package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.widget.ExpandableListView;
import com.five_corp.ad.FiveAd;

/* JADX INFO: loaded from: classes5.dex */
public final class gm extends gi {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2116 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2117 = 27186;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2118 = 3711;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2119 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2120 = 27860;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2121 = 45008;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        int i2 = f2119 + 85;
        f2116 = i2 % 128;
        String strIntern = (i2 % 2 == 0 ? m2161("\ue3f2ѱ願Ⱘ\uf0c8ᇜ\ue45f\uec2e꽧袇≂렩麇拤亍➸♉槀㤋錹䬿ၳ䁫\ue1de", 90 / ExpandableListView.getPackedPositionGroup(1L)) : m2161("\ue3f2ѱ願Ⱘ\uf0c8ᇜ\ue45f\uec2e꽧袇≂렩麇拤亍➸♉槀㤋錹䬿ၳ䁫\ue1de", ExpandableListView.getPackedPositionGroup(0L) + 23)).intern();
        int i3 = f2116 + 69;
        f2119 = i3 % 128;
        if (i3 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        int i2 = f2119 + 1;
        f2116 = i2 % 128;
        return m2161("\uf0c8ᇜ\ue45f\uec2e亍➸", i2 % 2 == 0 ? 28 % Color.red(1) : Color.red(0) + 6).intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2119 + 85;
        f2116 = i2 % 128;
        if (i2 % 2 != 0) {
            return FiveAd.class;
        }
        int i3 = 60 / 0;
        return FiveAd.class;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        bp bpVar = new bp(mo2139());
        f2119 = (f2116 + 63) % 128;
        return bpVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2161(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2870) {
            try {
                char[] cArr2 = new char[cArr.length];
                m.f2869 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = m.f2869;
                    if (i3 < cArr.length) {
                        cArr3[0] = cArr[i3];
                        cArr3[1] = cArr[i3 + 1];
                        int i4 = 58224;
                        for (int i5 = 0; i5 < 16; i5++) {
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f2118)) ^ ((c3 >>> 5) + f2120)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f2117) ^ ((c4 + i4) ^ ((c4 << 4) + f2121))));
                            i4 -= 40503;
                        }
                        int i6 = m.f2869;
                        cArr2[i6] = cArr3[0];
                        cArr2[i6 + 1] = cArr3[1];
                        m.f2869 = i6 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}

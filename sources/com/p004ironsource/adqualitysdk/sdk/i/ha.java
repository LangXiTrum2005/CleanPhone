package com.p004ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.yandex.mobile.ads.common.MobileAds;

/* JADX INFO: loaded from: classes5.dex */
public final class ha extends gi {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2187 = -7286542616561203748L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2188 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2189 = 1;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        int i2 = f2189 + 61;
        f2188 = i2 % 128;
        String strIntern = m2178("얿饮簋퍥뛑ᗬ\ue89c侳⍑虡敐㣎鿯犇톣땃ࡩ\uef5f䈷⇟蓫寓㽁鉨焉퐤ꯁ\u0efd\uedde䂘\u2455ﭽ帕㷍郣瞪쪬깞", i2 % 2 != 0 ? 27989 >> ExpandableListView.getPackedPositionChild(1L) : ExpandableListView.getPackedPositionChild(0L) + 23774).intern();
        int i3 = f2189 + 87;
        f2188 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        f2188 = (f2189 + 89) % 128;
        String strIntern = m2178("얥㋔⭠⎃\u181dႩ", 63337 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern();
        int i2 = f2188 + 77;
        f2189 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2188 + 81;
        f2189 = i2 % 128;
        if (i2 % 2 != 0) {
            return MobileAds.class;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        cj cjVar = new cj(mo2139());
        f2188 = (f2189 + 55) % 128;
        return cjVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2178(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2055) {
            try {
                g.f2056 = i2;
                char[] cArr2 = new char[cArr.length];
                g.f2054 = 0;
                while (true) {
                    int i3 = g.f2054;
                    if (i3 < cArr.length) {
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f2187);
                        g.f2054++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}

package com.p004ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: loaded from: classes5.dex */
public final class gc extends gi {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2066 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2067 = 59973;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2068 = 328;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2069 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2070 = 3220;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2071 = 16830;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2148(String str, int i2) {
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
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f2067)) ^ ((c3 >>> 5) + f2068)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f2070) ^ ((c4 + i4) ^ ((c4 << 4) + f2071))));
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

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        int i2 = f2066 + 71;
        f2069 = i2 % 128;
        String strIntern = m2148("⺤숔頻춨䉱侗糫톫뙐\u1c8f\ua7ef\uf602䧞汽\udc12\ue1f5\udc04嘠乖큤ዚ絛פֿꝅ﹁̙ⱖ计﹁̙ⱖ计퉇끣糫톫酑蝀\ua7ef\uf602䧞汽蝱ꀷ軷쪫瞇麬턣\udbb4ⳤ盔", i2 % 2 != 0 ? (ViewConfiguration.getKeyRepeatTimeout() << 115) * 74 : 51 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();
        int i3 = f2066 + 61;
        f2069 = i3 % 128;
        if (i3 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        int i2 = f2066 + 25;
        f2069 = i2 % 128;
        return (i2 % 2 != 0 ? m2148("즻\u008aۘ教\uebe5ધϫ멱楟\u17eeﶅ勹傿শ", 107 % (ViewConfiguration.getMaximumDrawingCacheSize() + 20)) : m2148("즻\u008aۘ教\uebe5ધϫ멱楟\u17eeﶅ勹傿শ", 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2069 + 73;
        f2066 = i2 % 128;
        if (i2 % 2 != 0) {
            return IronSourceAdQuality.class;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        bf bfVar = new bf(mo2139());
        int i2 = f2069 + 107;
        f2066 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
        return bfVar;
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import com.yandex.mobile.ads.common.MobileAds;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class hk extends gt {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2311 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2312 = 21903;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2313 = 3663;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2314 = 7660;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2315 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2316 = 42611;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        int i10 = f2315 + 53;
        f2311 = i10 % 128;
        String strIntern = m2280("ӱ龢뮻䘇談빾", i10 % 2 == 0 ? 126 - Color.argb(0, 1, 0, 0) : 6 - Color.argb(0, 0, 0, 0)).intern();
        int i11 = f2315 + 59;
        f2311 = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        ci ciVar = new ci(mo2240());
        f2311 = (f2315 + 37) % 128;
        return ciVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        int i10 = f2315 + 79;
        f2311 = i10 % 128;
        String strIntern = (i10 % 2 == 0 ? m2280("蟨奠麝䳺ӱ龢뮻䘇談빾唯踒\ud8ea\u0e80\udce5၀祪鋻\ude30⍛髤턕蟨奠画酏彩⧝裡儾\ud8ea\u0e80\udce5၀툭⏎\ue990䍮", 33 / TextUtils.indexOf("", "", 1)) : m2280("蟨奠麝䳺ӱ龢뮻䘇談빾唯踒\ud8ea\u0e80\udce5၀祪鋻\ude30⍛髤턕蟨奠画酏彩⧝裡儾\ud8ea\u0e80\udce5၀툭⏎\ue990䍮", TextUtils.indexOf("", "", 0) + 38)).intern();
        int i11 = f2311 + 57;
        f2315 = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = f2315 + 65;
        f2311 = i10 % 128;
        if (i10 % 2 != 0) {
            return MobileAds.class;
        }
        int i11 = 62 / 0;
        return MobileAds.class;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2280(String str, int i10) {
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
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2313)) ^ ((c5 >>> 5) + f2314)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2312) ^ ((c10 + i12) ^ ((c10 << 4) + f2316))));
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
}

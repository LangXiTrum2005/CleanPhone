package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gj extends gt {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2177 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2178 = 34041;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2179 = 64454;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2180 = 60031;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2181 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2182 = 23079;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2248(String str, int i10) {
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
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2180)) ^ ((c5 >>> 5) + f2182)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2179) ^ ((c10 + i12) ^ ((c10 << 4) + f2178))));
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        int i10 = f2177 + 119;
        f2181 = i10 % 128;
        return m2248("䦤쨌⧡襍饂칉\ue7dc\udbf1汫莝懮⭷뇖ﾽ৷\uee2c", i10 % 2 != 0 ? 86 % TextUtils.getOffsetBefore("", 0) : TextUtils.getOffsetBefore("", 0) + 15).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        bg bgVar = new bg(mo2240());
        f2177 = (f2181 + 61) % 128;
        return bgVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        int i10 = f2177 + 37;
        f2181 = i10 % 128;
        String strIntern = m2248("幡\u1c4a\ud936\uf688㞮縗⓸櫓\ud883黽Ịに\uea98堨㹎缜꽺걁㍠桠틪ࠠ㋑ፔꭩ⏇섑嗙ꭩ⏇섑嗙皆␑⓸櫓\ue396ΊỊに\uea98堨\udf18뜙鴭頾饂칉\ue7dc\udbf1䗽잰", i10 % 2 != 0 ? MotionEvent.axisFromString("") + 78 : MotionEvent.axisFromString("") + 52).intern();
        f2181 = (f2177 + 15) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = (f2181 + 5) % 128;
        f2177 = i10;
        int i11 = i10 + 21;
        f2181 = i11 % 128;
        if (i11 % 2 == 0) {
            return IronSourceAdQuality.class;
        }
        throw null;
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import com.amazon.device.ads.DTBAdRequest;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gm extends gt {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2191 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2192 = 36547;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2193 = 3617;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2194 = 50216;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2195 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2196 = 52237;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        int i10 = f2195 + InterfaceC0435l1.d.b.f29105b;
        f2191 = i10 % 128;
        String strIntern = m2251("\ue21d贌߶虮\udd3d짆竅\uf61dオ鮚", i10 % 2 == 0 ? 47 >> View.resolveSize(0, 0) : 9 - View.resolveSize(0, 0)).intern();
        f2195 = (f2191 + 71) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        bi biVar = new bi(mo2240());
        int i10 = f2191 + 47;
        f2195 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 39 / 0;
        }
        return biVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        int i10 = f2195 + 17;
        f2191 = i10 % 128;
        return m2251("Ἀࣽ篝\ue123\ue21d贌߶虮\udd3d짆堏⧻躀퀒ޮ\ude0f꺮䳽⾁ﲊవ虎ߙ샅숼ꎈ莽坒劸쪭〼뷅撉糱", i10 % 2 == 0 ? 113 - KeyEvent.normalizeMetaState(0) : KeyEvent.normalizeMetaState(0) + 34).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = f2195 + 43;
        int i11 = i10 % 128;
        f2191 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i12 = i11 + 53;
        f2195 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 96 / 0;
        }
        return DTBAdRequest.class;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2251(String str, int i10) {
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
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2192)) ^ ((c5 >>> 5) + f2194)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2196) ^ ((c10 + i12) ^ ((c10 << 4) + f2193))));
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

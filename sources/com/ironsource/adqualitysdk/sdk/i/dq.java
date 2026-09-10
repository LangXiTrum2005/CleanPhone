package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class dq extends dy {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1793 = 3065;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1794 = 64547;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1795 = 2130;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1796 = 58563;

    public dq(String str, String str2, String str3, int i10) {
        super(str, str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2042("\uaafd枅絥껠砈ᣛ縏︌", 8 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
        sb2.append(str.toLowerCase());
        sb2.append(m2042("嬋堓", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1).intern());
        sb2.append(str2);
        m2106(new dw(f2.k(m2042("襙矵", (-16777215) - Color.rgb(0, 0, 0)), str2, d5.u.i(str)), str3, f2.m(sb2, m2042("\ue26e\ue2cf姁ḧ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3)), i10));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2042(String str, int i10) {
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
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f1796)) ^ ((c5 >>> 5) + f1793)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f1795) ^ ((c10 + i12) ^ ((c10 << 4) + f1794))));
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

package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.view.ViewConfiguration;
import com.fyber.FairBid;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gp extends gt {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2214 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2215 = -1957804764585672133L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2216 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        f2214 = (f2216 + 115) % 128;
        String strIntern = m2256("쉝\ueda3鶠䶢綽ⶏ\udd89", 12281 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern();
        int i10 = f2216 + 71;
        f2214 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 12 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        bq bqVar = new bq(mo2240());
        f2214 = (f2216 + 57) % 128;
        return bqVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        f2216 = (f2214 + 87) % 128;
        String strIntern = m2256("쉘͝䁄脎왹ݯ䑯蕡쨁ୄ䠧褹츾༼䰇跕틏", (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 49417).intern();
        int i10 = f2214 + 73;
        f2216 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = (f2216 + 121) % 128;
        f2214 = i10;
        f2216 = (i10 + InterfaceC0435l1.d.b.f29114k) % 128;
        return FairBid.class;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2256(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f2215);
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

package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.view.View;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import net.pubnative.lite.sdk.HyBid;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class hd extends gt {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2287 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2288 = -8542819029722126113L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2289;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        int i10 = f2287 + 1;
        f2289 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2273("い뢆敼긤〴逬㒠퓗鍙璩逯끋盙", (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern();
        int i12 = f2289 + 115;
        f2287 = i12 % 128;
        if (i12 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        by byVar = new by(mo2240());
        int i10 = f2289 + 81;
        f2287 = i10 % 128;
        if (i10 % 2 != 0) {
            return byVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        int i10 = f2289 + 35;
        f2287 = i10 % 128;
        return (i10 % 2 == 0 ? m2273("檵噈䮉앂櫛绲ᩃ뿱즹驦뻑\udb35Ⱜ㧫퍖ҡ肤䔵矗ꀺ\ue731\ue0e2鐉춼宽౨좍椃븤ꯍ浆誣", 1 % View.MeasureSpec.getMode(0)) : m2273("檵噈䮉앂櫛绲ᩃ뿱즹驦뻑\udb35Ⱜ㧫퍖ҡ肤䔵矗ꀺ\ue731\ue0e2鐉춼宽౨좍椃븤ꯍ浆誣", View.MeasureSpec.getMode(0) + 1)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = (f2287 + InterfaceC0435l1.d.b.f29112i) % 128;
        f2289 = i10;
        f2287 = (i10 + 99) % 128;
        return HyBid.class;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2273(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2127) {
            try {
                char[] cArrM2229 = g.m2229(f2288, cArr, i10);
                g.f2129 = 4;
                while (true) {
                    int i11 = g.f2129;
                    if (i11 < cArrM2229.length) {
                        int i12 = i11 - 4;
                        g.f2128 = i12;
                        cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f2288));
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

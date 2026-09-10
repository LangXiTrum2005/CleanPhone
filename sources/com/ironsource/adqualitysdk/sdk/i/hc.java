package com.ironsource.adqualitysdk.sdk.i;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import tv.superawesome.sdk.publisher.AwesomeAds;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class hc extends gt {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2280 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2281 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2282 = 506182778;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f2283 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2284 = -119025058;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2285 = 4;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2286 = {15, 35, -36, -8, -2, -4, 14, -18, 54, 19, -68, 13, -3, -11, 10, -3, 10, -19, 5, 66, -61, 7, -15, 69, -55, -8, -2, -4, 14, -18, 22, -17, 13, -11, -5, 2, 69, -72, 2, -8, -2, -4, 14, -18, 22, -17, 13, -11, -5, 2, 0, 0};

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        f2280 = (f2281 + 29) % 128;
        String strIntern = m2272((short) (TextUtils.lastIndexOf("", '0') + 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 506182662, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, 119025097 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) TextUtils.indexOf("", "", 0)).intern();
        int i10 = f2281 + 81;
        f2280 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        cd cdVar = new cd(mo2240());
        f2280 = (f2281 + 115) % 128;
        return cdVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        f2280 = (f2281 + 53) % 128;
        String strIntern = m2272((short) KeyEvent.normalizeMetaState(0), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 506182662, 36 - (ViewConfiguration.getJumpTapTimeout() >> 16), 119025059 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) ('0' - AndroidCharacter.getMirror('0'))).intern();
        int i10 = f2280 + InterfaceC0435l1.d.b.f29110g;
        f2281 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = (f2280 + 23) % 128;
        f2281 = i10;
        int i11 = i10 + 117;
        f2280 = i11 % 128;
        if (i11 % 2 != 0) {
            return AwesomeAds.class;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2272(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2285;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2286;
                    i14 = bArr != null ? (byte) (bArr[f2284 + i12] + i13) : (short) (f2283[f2284 + i12] + i13);
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f2284 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f2282);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f2286;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f2283;
                            int i17 = n.f3072;
                            n.f3072 = i17 - 1;
                            n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                        }
                        sb2.append(n.f3074);
                        n.f3075 = n.f3074;
                        n.f3071++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }
}

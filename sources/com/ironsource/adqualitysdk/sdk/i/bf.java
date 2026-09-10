package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bf extends be {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f750 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f751 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f752 = 781795593;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f753 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f754 = {-28, -30, 17, 26, -24, 18, 0};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f755 = 1159189504;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f756 = 109;

    public bf(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﱟ */
    public final boolean mo807() {
        f751 = (f750 + 115) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﱡ */
    public final boolean mo814() {
        f750 = (f751 + 7) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f751 = (f750 + 81) % 128;
        String strIntern = m824((short) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1159189435, TextUtils.lastIndexOf("", '0', 0, 0) - 101, (-781795593) - TextUtils.getOffsetBefore("", 0), (byte) (27 - (ViewConfiguration.getTapTimeout() >> 16))).intern();
        int i10 = f751 + 123;
        f750 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        int i10 = f751 + 29;
        f750 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 91 / 0;
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        f751 = (f750 + 121) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m824(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f756;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f754;
                    i14 = bArr != null ? (byte) (bArr[f752 + i12] + i13) : (short) (f753[f752 + i12] + i13);
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f752 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f755);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f754;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f753;
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

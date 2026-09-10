package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gb {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2136 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2137 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2138 = 87;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2139 = -1307905850;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f2140 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f2141 = {-74, -1, 6, -11, 4, 11, 2, -21, 51, 37, -44, -6, -1};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2142 = -438897109;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2231(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2138;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2141;
                    i14 = bArr != null ? (byte) (bArr[f2142 + i12] + i13) : (short) (f2140[f2142 + i12] + i13);
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f2142 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f2139);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f2141;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f2140;
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

    /* JADX INFO: renamed from: ﻐ */
    public int mo2219(ee eeVar) {
        int i10 = f2136 + 83;
        f2137 = i10 % 128;
        if (i10 % 2 != 0) {
            return 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public abstract ea mo2220(ee eeVar, cl clVar);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ea m2232(ee eeVar, cl clVar) {
        f2137 = (f2136 + 85) % 128;
        try {
            eeVar.m2159(this);
            ea eaVarMo2220 = mo2220(eeVar, clVar);
            eeVar.m2161(this);
            int i10 = f2137 + 25;
            f2136 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 47 / 0;
            }
            return eaVarMo2220;
        } catch (dn e10) {
            throw e10;
        } catch (Throwable th2) {
            throw new dr(clVar, eeVar, th2.getMessage() != null ? th2.getMessage() : m2231((short) KeyEvent.keyCodeFromString(""), 1307905933 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) - 87, 438897108 - TextUtils.lastIndexOf("", '0'), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public int mo2218() {
        f2137 = (f2136 + InterfaceC0435l1.d.b.f29110g) % 128;
        return 1;
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.view.ViewConfiguration;
import com.hyprmx.android.sdk.placement.PlacementType;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gv extends gt {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2237 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2238 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2239 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2240 = 5;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2241;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2242 = {'h', 't', 'r', '3', 'm', '~', 'u', 'w', '}', 'f', 's', 'i', 'n', 'x', 'p', 'q', 'j', 'y', 'U', 'Y'};

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        int i10 = f2237 + InterfaceC0435l1.d.b.f29112i;
        f2241 = i10 % 128;
        return m2263(null, i10 % 2 != 0 ? 84 >>> (ViewConfiguration.getMaximumFlingVelocity() / 108) : 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), null, "\u0089\u0083\u0088\u0087\u0086\u0085").intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        bo boVar = new bo(mo2240());
        int i10 = f2237 + 23;
        f2241 = i10 % 128;
        if (i10 % 2 == 0) {
            return boVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        f2237 = (f2241 + 97) % 128;
        String strIntern = m2263(null, 127 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), null, "\u0091\u0087\u0086\u0094\u0092\u008b\u0091\u0083\u0091\u0081\u008a\u0090\u0093\u0084\u0092\u008b\u0091\u0083\u0091\u0081\u008a\u0090\u0087\u0084\u008f\u008c\u008e\u0084\u008c\u008d\u0082\u0088\u008c\u008b\u008a\u0084\u0089\u0083\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        f2241 = (f2237 + 53) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = f2241 + 75;
        f2237 = i10 % 128;
        if (i10 % 2 != 0) {
            return PlacementType.class;
        }
        int i11 = 54 / 0;
        return PlacementType.class;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2263(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2932) {
            try {
                char[] cArr2 = f2242;
                int i11 = f2240;
                if (f2239) {
                    int length = bArr.length;
                    k.f2931 = length;
                    char[] cArr3 = new char[length];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i12 = k.f2933;
                        int i13 = k.f2931 - 1;
                        int i14 = k.f2933;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        k.f2933 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2238) {
                    int length2 = cArr.length;
                    k.f2931 = length2;
                    char[] cArr4 = new char[length2];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i15 = k.f2933;
                        int i16 = k.f2931 - 1;
                        int i17 = k.f2933;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        k.f2933 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                k.f2931 = length3;
                char[] cArr5 = new char[length3];
                k.f2933 = 0;
                while (k.f2933 < k.f2931) {
                    int i18 = k.f2933;
                    int i19 = k.f2931 - 1;
                    int i20 = k.f2933;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    k.f2933 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

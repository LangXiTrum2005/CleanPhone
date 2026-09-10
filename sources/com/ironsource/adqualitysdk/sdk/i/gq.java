package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.facebook.ads.AdSettings;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gq extends gt {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2217 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2218 = 61608;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2219;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2220;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2221;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        int i10 = f2217 + InterfaceC0435l1.d.b.f29110g;
        f2220 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2257((char) Color.blue(0), "\u0000\u0000\u0000\u0000", "\u0093뛎\ue42f脞", "鍝឴重檎\udfd9鸽\uefb8曹", TextUtils.indexOf("", "")).intern();
        int i12 = f2220 + 85;
        f2217 = i12 % 128;
        if (i12 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        bn bnVar = new bn(mo2240());
        f2217 = (f2220 + 65) % 128;
        return bnVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        f2220 = (f2217 + 27) % 128;
        String strIntern = m2257((char) (8471 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0000\u0000\u0000\u0000", "쌗缚ៀ⌡", "靜贮⧪䜫쏻䐿쨎\uf569괵첪돦肵⌷䌷꾏䉻髣軁㼅\uec08ҕ睄픥\ud848⚳劀᷷", (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1065411901).intern();
        f2217 = (f2220 + 49) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = (f2217 + InterfaceC0435l1.d.b.f29107d) % 128;
        f2220 = i10;
        f2217 = (i10 + 69) % 128;
        return AdSettings.class;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2257(char c4, String str, String str2, String str3, int i10) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (f.f2016) {
            try {
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr3.clone();
                cArr4[0] = (char) (c4 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr.length;
                char[] cArr6 = new char[length];
                f.f2015 = 0;
                while (true) {
                    int i11 = f.f2015;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c5 = cArr5[i12];
                        char c10 = (char) ((i14 + c5) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2017 = c10;
                        cArr5[i13] = (char) d5.u.d(cArr4[i13], 32718, c5, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c10;
                        int i15 = f.f2015;
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f2221) ^ ((long) f2219)) ^ ((long) f2218));
                        f.f2015 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }
}

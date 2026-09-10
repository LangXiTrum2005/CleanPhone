package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.tapjoy.Tapjoy;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class hf extends gt {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2293 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2294 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2295 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2296 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2297 = 4338390664633144521L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        int i10 = f2294 + 73;
        f2296 = i10 % 128;
        int i11 = i10 % 2;
        long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
        return (i11 == 0 ? m2275((char) (52850 % (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1))), "哉\ude54དྷ㰵", "\ue440呖珓蓎", "㋐ꜳ笗轑쮍깃", 1 % ExpandableListView.getPackedPositionChild(0L)) : m2275((char) ((globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 52850), "哉\ude54དྷ㰵", "\ue440呖珓蓎", "㋐ꜳ笗轑쮍깃", ExpandableListView.getPackedPositionChild(0L) + 1)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        ce ceVar = new ce(mo2240());
        int i10 = f2296 + 23;
        f2294 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 91 / 0;
        }
        return ceVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        char pressedStateDuration;
        int iArgb;
        int i10 = f2296 + 25;
        f2294 = i10 % 128;
        if (i10 % 2 != 0) {
            pressedStateDuration = (char) (48310 >>> (ViewConfiguration.getPressedStateDuration() >>> 78));
            iArgb = 1612455306 << Color.argb(0, 1, 1, 0);
        } else {
            pressedStateDuration = (char) (48310 - (ViewConfiguration.getPressedStateDuration() >> 16));
            iArgb = 1612455306 - Color.argb(0, 0, 0, 0);
        }
        return m2275(pressedStateDuration, "哉\ude54དྷ㰵", "誎ᰝ뙠䊼", "\ue457攖菹\u001c\uebc7期續\u31eb︦\ue2e0킶䦬ꕜ毥报ⶔ验", iArgb).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = f2294;
        f2296 = (i10 + 79) % 128;
        f2296 = (i10 + 121) % 128;
        return Tapjoy.class;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2275(char c4, String str, String str2, String str3, int i10) {
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
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f2297) ^ ((long) f2293)) ^ ((long) f2295));
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

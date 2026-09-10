package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gg extends gt {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2166 = {41806, 27610, 12912, 64203, 33060, 18855, 4306, 57195, 59294, 44570, 30376, 15831, 50286, 36080, 23379, 25508, 10953, 61764, 47592, 16388, 2209, 55100, 40521, 42748, 27934, 13713, 64566, 35595, 21502, 6769, 8854, 59755, 45156, 30919, 1906, 53131, 38430, 24250, 26056, 11383, 62606, 33552, 19356, 4801, 55644, 57824, 43036, 28841, 16324, 50753, 36580, 'a', 51452, 37185, 22971, 8712, 60057, 46050, 31821, 17572, 3378, 54659};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2167 = -3015286477703362408L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2168 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2169;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        char windowTouchSlop;
        int doubleTapTimeout;
        int i10;
        int i11 = f2169 + 75;
        f2168 = i11 % 128;
        if (i11 % 2 == 0) {
            windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() - 10);
            doubleTapTimeout = 36 / (ViewConfiguration.getDoubleTapTimeout() % 46);
            i10 = 36 << (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
        } else {
            windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            doubleTapTimeout = 51 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10;
        }
        String strIntern = m2244(windowTouchSlop, doubleTapTimeout, i10).intern();
        f2169 = (f2168 + 43) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        bf bfVar = new bf(mo2240());
        int i10 = f2168 + 79;
        f2169 = i10 % 128;
        if (i10 % 2 == 0) {
            return bfVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        int i10 = f2168 + 39;
        f2169 = i10 % 128;
        String strIntern = (i10 % 2 != 0 ? m2244((char) (41773 - (ViewConfiguration.getDoubleTapTimeout() >>> 19)), ViewConfiguration.getScrollDefaultDelay() << 118, 17 % ImageFormat.getBitsPerPixel(0)) : m2244((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 41773), ViewConfiguration.getScrollDefaultDelay() >> 16, ImageFormat.getBitsPerPixel(0) + 52)).intern();
        f2168 = (f2169 + 35) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = f2168 + 89;
        f2169 = i10 % 128;
        if (i10 % 2 == 0) {
            return IronSourceAdQuality.class;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2244(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2166[i10 + i12]) ^ (((long) i12) * f2167)) ^ ((long) c4));
                        c.f1154 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}

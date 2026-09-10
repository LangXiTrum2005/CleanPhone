package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class je implements Runnable {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2660 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2661 = 62172;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2662 = 46220;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2663 = 11283;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2664 = 55537;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2665;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2577(String str, int i10) {
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
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2663)) ^ ((c5 >>> 5) + f2661)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2662) ^ ((c10 + i12) ^ ((c10 << 4) + f2664))));
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

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = f2665 + 87;
        f2660 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                mo254();
            } else {
                mo254();
                throw null;
            }
        } catch (Throwable th2) {
            try {
                mo654(th2);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public void mo654(Throwable th2) {
        String strIntern = m2577("롋翳\uf534渚暛⮙涴藈喊\ue565\uf617ﰫ풽\ue2e6", 13 - TextUtils.lastIndexOf("", '0', 0, 0)).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2577("ᖈ债ꃥ꜂\uea59諒젖⳦綱쥯팑൞悖㓊湞嵑", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14).intern());
        sb2.append(getClass().getName());
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m2577("䁆惛忟㭴\u05c9\udd08", 6 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
        sb3.append(getClass().getName());
        sb3.append(m2577("鬩滏", 1 - View.combineMeasuredStates(0, 0)).intern());
        kl.m2892(strIntern, string, sb3.toString(), th2);
        String strIntern2 = m2577("롋翳\uf534渚暛⮙涴藈喊\ue565\uf617ﰫ풽\ue2e6", 14 - Drawable.resolveOpacity(0, 0)).intern();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(m2577("ᖈ债ꃥ꜂\uea59諒젖⳦綱쥯팑൞悖㓊湞嵑", TextUtils.indexOf("", "", 0) + 15).intern());
        sb4.append(getClass().getName());
        m.m2972(strIntern2, sb4.toString());
        m.m2983(m2577("롋翳\uf534渚暛⮙涴藈喊\ue565\uf617ﰫ풽\ue2e6", (ViewConfiguration.getTapTimeout() >> 16) + 14).intern(), m2577("깙瞈ჟ砗犽㰠ࡺ偰", Color.rgb(0, 0, 0) + 16777224).intern(), th2);
        f2665 = (f2660 + 123) % 128;
    }

    /* JADX INFO: renamed from: ｋ */
    public abstract void mo254() throws Exception;
}

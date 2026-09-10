package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.smaato.sdk.core.SmaatoSdk;

/* JADX INFO: loaded from: classes5.dex */
public final class gu extends gi {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2154 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2156 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2157 = {'c', 46707, 27733, 8826, 55299, 36577, 17609, 64165, 45204, 26259, 7478, 54087, 35124, 16135, 62886, 43975, 25007, 6062, 52637, 33850, 14947, 61473, 42505, 23781, 4820, 51411, 32395, 13456, 60283, 62954, 17384, 39360, 55212, 11677, 31610};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2155 = -2780963532871125476L;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        f2156 = (f2154 + 115) % 128;
        String strIntern = m2170(View.MeasureSpec.getSize(0) + 29, TextUtils.getTrimmedLength(""), (char) Color.blue(0)).intern();
        int i2 = f2156 + 121;
        f2154 = i2 % 128;
        if (i2 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        f2154 = (f2156 + 33) % 128;
        String strIntern = m2170((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 5, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28, (char) (62874 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern();
        int i2 = f2156 + 25;
        f2154 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
        }
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = (f2156 + 125) % 128;
        f2154 = i2;
        int i3 = i2 + 43;
        f2156 = i3 % 128;
        if (i3 % 2 != 0) {
            return SmaatoSdk.class;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        bx bxVar = new bx(mo2139());
        f2154 = (f2156 + 63) % 128;
        return bxVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2170(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f2157[i3 + i4]) ^ (((long) i4) * f2155)) ^ ((long) c2));
                        a.f69 = i4 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}

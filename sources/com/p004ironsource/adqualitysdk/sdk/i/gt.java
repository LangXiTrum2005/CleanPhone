package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import tv.superawesome.sdk.publisher.AwesomeAds;

/* JADX INFO: loaded from: classes5.dex */
public final class gt extends gi {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2147 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2148 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2149 = -157851946;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f2150 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f2151 = {15, 35, -36, -8, -2, -4, 14, -18, 54, 19, -68, 13, -3, -11, 10, -3, 10, -19, 5, 66, -61, 7, -15, 69, -55, -8, -2, -4, 14, -18, 22, -17, 13, -11, -5, 2, 69, -72, 2, -8, -2, -4, 14, -18, 22, -17, 13, -11, -5, 2, 0, 0};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2152 = 75;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2153 = 409191572;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2169(byte b2, short s, int i2, int i3, int i4) {
        String string;
        synchronized (k.f2833) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = f2152;
                int i6 = i2 + i5;
                int i7 = i6 == -1 ? 1 : 0;
                if (i7 != 0) {
                    byte[] bArr = f2151;
                    i6 = bArr != null ? (byte) (bArr[f2149 + i3] + i5) : (short) (f2150[f2149 + i3] + i5);
                }
                if (i6 > 0) {
                    k.f2836 = ((i3 + i6) - 2) + f2149 + i7;
                    k.f2834 = b2;
                    char c2 = (char) (i4 + f2153);
                    k.f2837 = c2;
                    sb.append(c2);
                    k.f2835 = k.f2837;
                    k.f2838 = 1;
                    while (k.f2838 < i6) {
                        byte[] bArr2 = f2151;
                        if (bArr2 != null) {
                            int i8 = k.f2836;
                            k.f2836 = i8 - 1;
                            k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                        } else {
                            short[] sArr = f2150;
                            int i9 = k.f2836;
                            k.f2836 = i9 - 1;
                            k.f2837 = (char) (k.f2835 + (((short) (sArr[i9] + s)) ^ k.f2834));
                        }
                        sb.append(k.f2837);
                        k.f2835 = k.f2837;
                        k.f2838++;
                    }
                }
                string = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        f2148 = (f2147 + 39) % 128;
        String strIntern = m2169((byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (short) KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", "") - 35, (ViewConfiguration.getWindowTouchSlop() >> 8) + 157851946, (-409191456) - TextUtils.indexOf("", "", 0, 0)).intern();
        int i2 = f2147 + 69;
        f2148 = i2 % 128;
        if (i2 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        f2148 = (f2147 + 95) % 128;
        String strIntern = m2169((byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 63, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 157851985, ExpandableListView.getPackedPositionChild(0L) - 409191456).intern();
        f2147 = (f2148 + 39) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2148 + 19;
        int i3 = i2 % 128;
        f2147 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 73;
        f2148 = i4 % 128;
        if (i4 % 2 == 0) {
            return AwesomeAds.class;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        cf cfVar = new cf(mo2139());
        f2147 = (f2148 + 9) % 128;
        return cfVar;
    }
}

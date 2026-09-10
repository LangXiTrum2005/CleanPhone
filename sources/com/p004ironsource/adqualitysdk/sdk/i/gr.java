package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.my.target.common.MyTargetManager;

/* JADX INFO: loaded from: classes5.dex */
public final class gr extends gi {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2137 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2138 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f2139 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2140 = 47;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2141 = 2034834784;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2142 = -1199171301;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2143 = {-80, 67, -69, 78, -80, -87, 100, -78, 67, 72, -84, -80, 102, -111, -94, 125, 66, -65, -67, 67, -79, -120, 7, -78, 67, 72, -84, 80, -5, 8, -79, -126, 124, 67, -79, -53, 58, 49, -43, 41, 63, -56, 0, 0};

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        f2138 = (f2137 + 21) % 128;
        String strIntern = m2167((byte) ((-67) - View.combineMeasuredStates(0, 0)), (short) (ExpandableListView.getPackedPositionChild(0L) + 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 12, 1199171301 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getWindowTouchSlop() >> 8) - 2034834685).intern();
        f2138 = (f2137 + 95) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        f2137 = (f2138 + 37) % 128;
        String strIntern = m2167((byte) (TextUtils.indexOf((CharSequence) "", '0') - 59), (short) Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 38, 1199171335 - MotionEvent.axisFromString(""), (-2034834676) - MotionEvent.axisFromString("")).intern();
        int i2 = f2138 + 5;
        f2137 = i2 % 128;
        if (i2 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2137 + 9;
        f2138 = i2 % 128;
        if (i2 % 2 != 0) {
            return MyTargetManager.class;
        }
        int i3 = 17 / 0;
        return MyTargetManager.class;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        ca caVar = new ca(mo2139());
        f2138 = (f2137 + 1) % 128;
        return caVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2167(byte b2, short s, int i2, int i3, int i4) {
        String string;
        synchronized (k.f2833) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = f2140;
                int i6 = i2 + i5;
                int i7 = i6 == -1 ? 1 : 0;
                if (i7 != 0) {
                    byte[] bArr = f2143;
                    i6 = bArr != null ? (byte) (bArr[f2142 + i3] + i5) : (short) (f2139[f2142 + i3] + i5);
                }
                if (i6 > 0) {
                    k.f2836 = ((i3 + i6) - 2) + f2142 + i7;
                    k.f2834 = b2;
                    char c2 = (char) (i4 + f2141);
                    k.f2837 = c2;
                    sb.append(c2);
                    k.f2835 = k.f2837;
                    k.f2838 = 1;
                    while (k.f2838 < i6) {
                        byte[] bArr2 = f2143;
                        if (bArr2 != null) {
                            int i8 = k.f2836;
                            k.f2836 = i8 - 1;
                            k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                        } else {
                            short[] sArr = f2139;
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
}

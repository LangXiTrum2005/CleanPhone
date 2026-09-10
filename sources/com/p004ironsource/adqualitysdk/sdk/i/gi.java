package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gi {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2096 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2097 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2098 = 804813432;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2099 = 93;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2100 = 1391136142;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f2101 = {-82, 33, -50, -52, 100, -66, 95, 88, -51, 96, -47, -90, 24, 5};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static short[] f2102;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2156(byte b2, short s, int i2, int i3, int i4) {
        String string;
        synchronized (k.f2833) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = f2099;
                int i6 = i2 + i5;
                int i7 = i6 == -1 ? 1 : 0;
                if (i7 != 0) {
                    byte[] bArr = f2101;
                    i6 = bArr != null ? (byte) (bArr[f2100 + i3] + i5) : (short) (f2102[f2100 + i3] + i5);
                }
                if (i6 > 0) {
                    k.f2836 = ((i3 + i6) - 2) + f2100 + i7;
                    k.f2834 = b2;
                    char c2 = (char) (i4 + f2098);
                    k.f2837 = c2;
                    sb.append(c2);
                    k.f2835 = k.f2837;
                    k.f2838 = 1;
                    while (k.f2838 < i6) {
                        byte[] bArr2 = f2101;
                        if (bArr2 != null) {
                            int i8 = k.f2836;
                            k.f2836 = i8 - 1;
                            k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                        } else {
                            short[] sArr = f2102;
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

    /* JADX INFO: renamed from: ﻐ */
    public abstract String mo2138();

    /* JADX INFO: renamed from: ﻛ */
    public abstract String mo2139();

    /* JADX INFO: renamed from: ｋ */
    public abstract Class mo2140();

    /* JADX INFO: renamed from: ﾇ */
    public abstract bg mo2141();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final jb.e m2157() {
        StringBuilder sb = new StringBuilder();
        sb.append(m2156((byte) ((-74) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (short) ((-23) - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) - 94, (-1391136142) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-804813333) - Drawable.resolveOpacity(0, 0)).intern());
        sb.append(mo2139());
        jb.e eVar = new jb.e(sb.toString(), m2156((byte) (TextUtils.indexOf((CharSequence) "", '0') + 13), (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 11), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 93, Color.red(0) - 1391136131, (-804813378) - TextUtils.indexOf((CharSequence) "", '0')).intern());
        int i2 = f2097 + 59;
        f2096 = i2 % 128;
        if (i2 % 2 != 0) {
            return eVar;
        }
        throw null;
    }
}

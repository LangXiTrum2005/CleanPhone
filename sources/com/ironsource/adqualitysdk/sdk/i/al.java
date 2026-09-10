package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class al {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static short[] f298 = null;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f299 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f300 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static byte[] f301 = null;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f302 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f303;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f304;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f305 = m426((short) ((-1) - MotionEvent.axisFromString("")), (-1632032488) - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') - 18, 301491218 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 78)).intern();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f306 = m426((short) TextUtils.indexOf("", "", 0), TextUtils.getOffsetAfter("", 0) - 1632032488, (-19) - Color.green(0), Process.getGidForName("") + 301491253, (byte) ((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 14)).intern();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f307 = m426((short) View.resolveSize(0, 0), (-1632032488) - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (-19) - View.getDefaultSize(0, 0), 301491285 - ImageFormat.getBitsPerPixel(0), (byte) (103 - Color.red(0))).intern();

    static {
        m428();
        m426((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (-1632032543) - (Process.myPid() >> 22), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 39, 301491334 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (4 - (Process.myTid() >> 22))).intern();
        f302 = (f299 + 29) % 128;
    }

    public al() {
        m426((short) View.MeasureSpec.getSize(0), (ViewConfiguration.getFadingEdgeLength() >> 16) - 1632032476, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 40, 301491320 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (byte) (75 - (ViewConfiguration.getScrollBarSize() >> 8))).intern();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m426(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f303;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f301;
                    i14 = bArr != null ? (byte) (bArr[f304 + i12] + i13) : (short) (f298[f304 + i12] + i13);
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f304 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f300);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f301;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f298;
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m428() {
        f304 = -301491218;
        f303 = 54;
        f300 = 1632032592;
        f301 = new byte[]{76, -66, -121, 120, -125, 8, -73, -71, 73, 75, -11, 114, 77, -76, 71, -95, 74, -73, 77, 74, -115, 15, -65, -79, -122, 118, -120, -78, 71, 117, -79, 78, -78, -66, 12, -2, -57, 56, -61, 72, -9, -7, 9, 11, -75, 50, 13, -12, 7, -31, 10, -9, 13, 10, -51, 79, -1, -15, -58, 76, -78, -14, 7, 53, -15, 14, -14, -2, -103, 107, 82, -83, 86, -35, 98, 108, -100, -98, 32, -89, -104, 97, -110, 116, -97, 98, -104, -97, 88, -38, 106, 100, 83, -85, 85, 103, -110, -96, 100, -101, 103, 107, -75, 125, -13, 64, 118, -120, 67, 73, -76, -74, 73, 73, -92, -75, 15, -39, 9, -31, 7, 22, -62, 12, 40, -37, 7, 24, -27, 55, 0, 0, 0, 0, 0, 0};
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m429() {
        f299 = (f302 + 65) % 128;
        String strIntern = m426((short) TextUtils.indexOf("", "", 0), Color.red(0) - 1632032476, ExpandableListView.getPackedPositionGroup(0L) - 39, 301491320 - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 75)).intern();
        f299 = (f302 + 119) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m431() {
        int i10 = f299 + 77;
        f302 = i10 % 128;
        int i11 = i10 % 2;
        String str = this.f305;
        if (i11 == 0) {
            int i12 = 54 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m433(String str) {
        f302 = (f299 + 23) % 128;
        String strM427 = m427(this.f306, str);
        int i10 = f302 + 63;
        f299 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM427;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m430(String str) {
        int i10 = f299 + 7;
        f302 = i10 % 128;
        int i11 = i10 % 2;
        String str2 = this.f305;
        if (i11 != 0) {
            return m427(str2, str);
        }
        m427(str2, str);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m432() {
        int i10 = f302;
        int i11 = i10 + 49;
        f299 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        String str = this.f307;
        f299 = (i10 + 53) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m427(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            f302 = (f299 + 69) % 128;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(m426((short) KeyEvent.keyCodeFromString(""), (-1632032545) - ExpandableListView.getPackedPositionType(0L), ImageFormat.getBitsPerPixel(0) - 52, Color.green(0) + 301491334, (byte) ((-96) - Color.blue(0))).intern());
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        String string = sb2.toString();
        f302 = (f299 + 65) % 128;
        return string;
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class kb {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2944 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2945 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f2946 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2947 = -847216854;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2948 = 1365682921;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2949 = 43;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2950 = {-41, -56, -38, 92, 86, 96, 117, -39, 100, 93, 110, -17, -114, -122, -98, 122, -104, -126, -108, -87, 94, -111, -108, 122, -68, -123, -110, 124, 101, -112, -106, -120, -106, 119, -81, 120, -82, 8, -99, -102, -89, -24, 79, -103, -14, 89, -106, -94, -109, -14, 89, -113, -79, -101, -110, -103, -13, 74, -97, -80, -109, -37, 97, -98, -87, -117, -97, -93, -93, -25, 74, -97, -97, -89, -95, -28, 87, -105, -93, -93, -98, -95, -33, 76, -95, -101, -98, -53};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2777(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2949;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2950;
                    i14 = bArr != null ? (byte) (bArr[f2948 + i12] + i13) : (short) (f2946[f2948 + i12] + i13);
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f2948 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f2947);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f2950;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f2946;
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m2778(String str, av avVar, boolean z10, as asVar) {
        JSONObject jSONObject = new JSONObject();
        if (z10) {
            f2945 = (f2944 + InterfaceC0435l1.d.b.f29107d) % 128;
            try {
                jSONObject.put(m2777((short) (68 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 847216956, TextUtils.getOffsetBefore("", 0) - 44, (-1365682922) - TextUtils.lastIndexOf("", '0', 0), (byte) (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), true);
            } catch (JSONException e10) {
                m.m2983(m2777((short) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 117), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 847216919, (-43) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) - 1365682910, (byte) (ViewConfiguration.getEdgeSlop() >> 16)).intern(), m2777((short) (98 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 847216923 - TextUtils.getOffsetBefore("", 0), (-43) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-1365682884) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) TextUtils.indexOf("", "", 0, 0)).intern(), e10);
            }
        }
        if (asVar.m547()) {
            f2945 = (f2944 + 73) % 128;
            jSONObject.put(m2777((short) ((-96) - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), View.MeasureSpec.getSize(0) + 847216951, (-44) - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.lastIndexOf("", '0', 0) - 1365682918, (byte) (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), true);
        }
        jSONObject.put(m2777((short) (KeyEvent.keyCodeFromString("") - 105), View.combineMeasuredStates(0, 0) + 847216966, (ViewConfiguration.getJumpTapTimeout() >> 16) - 44, View.getDefaultSize(0, 0) - 1365682914, (byte) ((-16777216) - Color.rgb(0, 0, 0))).intern(), str);
        kj.m2869(jSONObject, avVar.m644());
        kj.m2869(jSONObject, avVar.m642());
        return jSONObject;
    }
}

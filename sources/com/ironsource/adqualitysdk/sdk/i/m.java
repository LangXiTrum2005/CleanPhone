package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f3063 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f3064 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f3065 = -719865405;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f3066 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f3067 = {-113, 106, -82, -76, -90, -76, -107, -51, -106, -52, -54, 100, -85, -102, -90, -81, -59, -114, -88, -90, -46, 0, 0};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f3068 = 27;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f3069 = -1047196710;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static void m2963(String str, String str2) {
        int i10 = f3063 + 49;
        f3064 = i10 % 128;
        int i11 = i10 % 2;
        m2975(str, str, str2, null);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static void m2964(String str, String str2) {
        f3063 = (f3064 + 87) % 128;
        m2969(str, str2, null);
        f3064 = (f3063 + 29) % 128;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static void m2965(String str, String str2) {
        f3064 = (f3063 + 61) % 128;
        m2974(str, str, str2);
        f3064 = (f3063 + 117) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static ISAdQualityLogLevel m2966() {
        int i10 = f3063 + 7;
        f3064 = i10 % 128;
        if (i10 % 2 != 0) {
            s.m3035().m3061();
            throw null;
        }
        ISAdQualityLogLevel iSAdQualityLogLevelM3061 = s.m3035().m3061();
        int i11 = f3063 + 55;
        f3064 = i11 % 128;
        if (i11 % 2 == 0) {
            return iSAdQualityLogLevelM3061;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2976(String str, String str2, String str3, Object obj, boolean z10) {
        if (obj != null) {
            StringBuilder sbI = d5.u.i(str3);
            sbI.append(m2979(TextUtils.getOffsetAfter("", 0) + 1047196720, 719865405 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) ExpandableListView.getPackedPositionGroup(0L), (short) ((-57) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) - 26).intern());
            sbI.append(obj.toString());
            str3 = sbI.toString();
            f3063 = (f3064 + 41) % 128;
        }
        if (!m2989()) {
            if (z10 && m2966().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
                f3063 = (f3064 + 99) % 128;
                Log.d(m2967(str2), str3);
                return;
            }
            return;
        }
        int i10 = f3063 + 73;
        f3064 = i10 % 128;
        if (i10 % 2 == 0) {
            Log.d(m2967(str), str3);
        } else {
            Log.d(m2967(str), str3);
            int i11 = 54 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2983(String str, String str2, Throwable th2) {
        f3064 = (f3063 + 43) % 128;
        m2982(str, str, str2, th2, null, false);
        f3064 = (f3063 + 25) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2985(String str, String str2) {
        int i10 = f3063 + 75;
        f3064 = i10 % 128;
        m2986(str, str, str2, i10 % 2 == 0);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m2989() {
        f3064 = (f3063 + 97) % 128;
        boolean zM3059 = s.m3035().m3059();
        f3063 = (f3064 + 63) % 128;
        return zM3059;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2968(String str, String str2) {
        f3063 = (f3064 + 115) % 128;
        m2977(str, str2, (Throwable) null);
        int i10 = f3063 + 93;
        f3064 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 51 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2984(String str, String str2, Throwable th2, dn dnVar, boolean z10) {
        f3064 = (f3063 + 45) % 128;
        m2982(str, str, str2, th2, dnVar, z10);
        f3064 = (f3063 + InterfaceC0435l1.d.b.f29114k) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2986(String str, String str2, String str3, boolean z10) {
        f3063 = (f3064 + 43) % 128;
        if (m2989()) {
            Log.i(m2967(str), str3);
            return;
        }
        if (z10 && m2966().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
            int i10 = f3063 + 69;
            f3064 = i10 % 128;
            if (i10 % 2 == 0) {
                Log.i(m2967(str2), str3);
            } else {
                Log.i(m2967(str2), str3);
                int i11 = 21 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2988(String str, String str2, String str3) {
        int i10 = f3063 + 11;
        f3064 = i10 % 128;
        if (i10 % 2 != 0) {
            m2989();
            throw null;
        }
        if (m2989()) {
            Log.w(m2967(str), str3);
            int i11 = f3063 + 61;
            f3064 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (m2966().shouldPrintLog(ISAdQualityLogLevel.WARNING)) {
            int i12 = f3063 + 47;
            f3064 = i12 % 128;
            if (i12 % 2 == 0) {
                Log.w(m2967(str2), str3);
            } else {
                Log.w(m2967(str2), str3);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2970(String str, String str2, String str3, boolean z10) {
        f3064 = (f3063 + 5) % 128;
        m2982(str, str2, str3, null, null, z10);
        f3064 = (f3063 + 25) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2982(String str, String str2, String str3, Throwable th2, dn dnVar, boolean z10) {
        if (!m2989()) {
            if (z10) {
                f3063 = (f3064 + 125) % 128;
                if (m2966().shouldPrintLog(ISAdQualityLogLevel.ERROR)) {
                    Log.e(m2967(str2), m2980(str3, dnVar), th2);
                }
            }
            f3063 = (f3064 + 61) % 128;
            return;
        }
        int i10 = f3064 + 107;
        f3063 = i10 % 128;
        if (i10 % 2 != 0) {
            Log.e(m2967(str), m2980(str3, dnVar), th2);
        } else {
            Log.e(m2967(str), m2980(str3, dnVar), th2);
            int i11 = 78 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2971(String str, String str2, Throwable th2, boolean z10) {
        int i10 = f3064 + 43;
        f3063 = i10 % 128;
        if (i10 % 2 != 0) {
            m2982(str, str, str2, th2, null, z10);
        } else {
            m2982(str, str, str2, th2, null, z10);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2969(String str, String str2, Object obj) {
        int i10 = f3063 + 97;
        f3064 = i10 % 128;
        int i11 = i10 % 2;
        m2976(str, str, str2, obj, false);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2967(String str) {
        String strK = f2.k(m2979(1047196783 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 719865405, (byte) (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (short) (TextUtils.indexOf("", "", 0, 0) + 87), View.MeasureSpec.makeMeasureSpec(0, 0) - 5), str, new StringBuilder());
        int i10 = f3064 + InterfaceC0435l1.d.b.f29109f;
        f3063 = i10 % 128;
        if (i10 % 2 != 0) {
            return strK;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2980(String str, dn dnVar) {
        int i10 = (f3063 + 51) % 128;
        f3064 = i10;
        if (dnVar != null) {
            StringBuilder sbI = d5.u.i(str);
            sbI.append(m2979(1047196719 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 719865405, (byte) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (short) (MotionEvent.axisFromString("") - 55), Process.getGidForName("") - 25).intern());
            sbI.append(dnVar);
            return sbI.toString();
        }
        int i11 = i10 + 29;
        f3063 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2987(String str, String str2) {
        f3064 = (f3063 + InterfaceC0435l1.d.b.f29110g) % 128;
        m2986(str, str, str2, false);
        f3064 = (f3063 + 57) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2977(String str, String str2, Throwable th2) {
        f3063 = (f3064 + 123) % 128;
        m2982(str, str, str2, th2, null, true);
        f3064 = (f3063 + 121) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2972(String str, String str2) {
        f3064 = (f3063 + 115) % 128;
        m2983(str, str2, null);
        f3064 = (f3063 + 63) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2978(String str, String str2, boolean z10) {
        f3063 = (f3064 + InterfaceC0435l1.d.b.f29114k) % 128;
        m2970(str, str, str2, z10);
        int i10 = f3064 + 93;
        f3063 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2981(String str, String str2) {
        int i10 = f3064 + 33;
        f3063 = i10 % 128;
        int i11 = i10 % 2;
        m2988(str, str, str2);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2973(String str, String str2, Object obj) {
        int i10 = f3064 + 11;
        f3063 = i10 % 128;
        int i11 = i10 % 2;
        m2975(str, str, str2, obj);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f3064 + 19;
        f3063 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 35 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2979(int i10, int i11, byte b10, short s10, int i12) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f3068;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f3067;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f3065 + i11] + i13);
                    } else {
                        i14 = (short) (f3066[f3065 + i11] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3072 = ((i11 + i14) - 2) + f3065 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f3069);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f3067;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f3066;
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
    private static void m2975(String str, String str2, String str3, Object obj) {
        f3064 = (f3063 + 67) % 128;
        m2976(str, str2, str3, obj, true);
        f3063 = (f3064 + 47) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m2974(String str, String str2, String str3) {
        if (m2989()) {
            f3064 = (f3063 + 17) % 128;
            Log.v(m2967(str), str3);
        } else if (m2966().shouldPrintLog(ISAdQualityLogLevel.VERBOSE)) {
            f3063 = (f3064 + 87) % 128;
            Log.v(m2967(str2), str3);
        }
    }
}

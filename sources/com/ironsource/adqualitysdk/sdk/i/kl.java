package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class kl {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f3026 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f3027 = null;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f3028 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static WeakReference<bb> f3029 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f3030 = {70, -122, -126, -117, 48, -114, 100, 39, -30, -36, -9, -11, -36, -36, 7, -40, -17, 105, -75, 94, 111, 98, 107, 47, 26, 49, -50, 117, 34, 40, 35, -8, 89, 42, 19, 36, 6, 58, 30, 23, 40, 19, 20, -32, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f3031 = 5;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f3032 = -1121337513;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f3033 = -1125684661;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2893(String str, String str2, Throwable th2, boolean z10, boolean z11, boolean z12) {
        try {
            if (z10) {
                int i10 = f3026 + 41;
                f3028 = i10 % 128;
                if (i10 % 2 != 0) {
                    m.m2978(str, str2, z12);
                    throw null;
                }
                m.m2978(str, str2, z12);
                if (th2 != null) {
                    f3026 = (f3028 + 57) % 128;
                    m.m2971(str, m2890((short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 30), 1125684729 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 3, TextUtils.getCapsMode("", 0, 0) + 1121337513, (byte) ((-94) - TextUtils.getOffsetBefore("", 0))).intern(), th2, z12);
                    f3028 = (f3026 + 123) % 128;
                }
            } else {
                m.m2971(str, str2, th2, z12);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2890((short) ((-105) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 1125684744 - TextUtils.indexOf((CharSequence) "", '0'), 5 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1121337519, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + InterfaceC0435l1.d.b.f29114k)).intern());
            sb2.append(str);
            m2903(str, str2, sb2.toString(), th2, null, null, false, z11, z12);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m2894(String str, String str2, String str3, Throwable th2, boolean z10) {
        f3026 = (f3028 + 29) % 128;
        try {
            m2903(str, str2, str3, th2, null, null, false, false, false);
            int i10 = f3028 + InterfaceC0435l1.d.b.f29110g;
            f3026 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 46 / 0;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2896(bb bbVar) {
        f3029 = new WeakReference<>(bbVar);
        int i10 = f3026 + 123;
        f3028 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2899(String str, String str2, Throwable th2, boolean z10) {
        f3026 = (f3028 + 55) % 128;
        try {
            m2900(str, str2, th2, z10, false);
            f3026 = (f3028 + 97) % 128;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2902(String str, String str2, String str3, Throwable th2, dn dnVar, JSONObject jSONObject, boolean z10) {
        f3028 = (f3026 + 21) % 128;
        try {
            m2903(str, str2, str3, th2, dnVar, jSONObject, true, false, false);
            int i10 = f3026 + 75;
            f3028 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 5 / 0;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Throwable m2895(Throwable th2) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
            f3026 = (f3028 + 93) % 128;
        }
        int i10 = f3028 + 57;
        f3026 = i10 % 128;
        if (i10 % 2 != 0) {
            return th2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2900(String str, String str2, Throwable th2, boolean z10, boolean z11) {
        f3026 = (f3028 + InterfaceC0435l1.d.b.f29109f) % 128;
        try {
            m2893(str, str2, th2, z10, z11, false);
            int i10 = f3028 + 63;
            f3026 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2903(String str, String str2, String str3, Throwable th2, dn dnVar, JSONObject jSONObject, boolean z10, boolean z11, boolean z12) {
        String str4;
        String str5;
        if (z10) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(m2890((short) ((-81) - View.combineMeasuredStates(0, 0)), 1125684719 - Color.blue(0), (-4) - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 1121337529 - (Process.myTid() >> 22), (byte) ((-22) - TextUtils.indexOf((CharSequence) "", '0'))).intern());
                sb2.append(str);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                str4 = str2;
                sb3.append(str4);
                sb3.append(m2890((short) (117 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1125684692 - ImageFormat.getBitsPerPixel(0), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1, (Process.myPid() >> 22) + 1121337529, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 34)).intern());
                sb3.append(string);
                sb3.append(m2890((short) (90 - Color.argb(0, 0, 0, 0)), 1125684701 - MotionEvent.axisFromString(""), KeyEvent.keyCodeFromString("") - 4, 1121337535 - View.getDefaultSize(0, 0), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 72)).intern());
                m.m2984(str, sb3.toString(), th2, dnVar, z12);
                f3026 = (f3028 + 99) % 128;
                str5 = string;
            } catch (Throwable unused) {
                return;
            }
        } else {
            str4 = str2;
            str5 = str3;
        }
        bb bbVar = f3029.get();
        if (bbVar != null) {
            f3026 = (f3028 + 53) % 128;
            bbVar.m728(str, str4, str5, m2898(th2, dnVar), jSONObject, z11);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2898(Throwable th2, dn dnVar) {
        if (dnVar != null) {
            int i10 = f3026 + 53;
            f3028 = i10 % 128;
            if (i10 % 2 == 0) {
                return dnVar.toString();
            }
            String string = dnVar.toString();
            int i11 = 9 / 0;
            return string;
        }
        if (th2 instanceof dn) {
            int i12 = f3026 + 1;
            f3028 = i12 % 128;
            if (i12 % 2 == 0) {
                String string2 = th2.toString();
                f3026 = (f3028 + 7) % 128;
                return string2;
            }
            th2.toString();
            throw null;
        }
        return Log.getStackTraceString(th2);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2897(String str, String str2, String str3, Throwable th2, JSONObject jSONObject, boolean z10) {
        f3026 = (f3028 + 9) % 128;
        try {
            m2903(str, str2, str3, th2, null, jSONObject, true, false, z10);
            int i10 = f3028 + 15;
            f3026 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2901(String str, String str2, String str3, String str4) {
        f3026 = (f3028 + 93) % 128;
        try {
            m2891(str, str2, str3, str4);
            f3028 = (f3026 + 121) % 128;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2892(String str, String str2, String str3, Throwable th2) {
        int i10 = f3028 + 13;
        f3026 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                m2894(str, str2, str3, th2, true);
            } else {
                m2894(str, str2, str3, th2, false);
            }
            f3026 = (f3028 + 3) % 128;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2891(String str, String str2, String str3, String str4) {
        String string = "";
        f3026 = (f3028 + InterfaceC0435l1.d.b.f29110g) % 128;
        try {
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(m2890((short) ((-82) - ((byte) KeyEvent.getModifierMetaStateMask())), 1125684719 - KeyEvent.getDeadChar(0, 0), (-4) - Color.argb(0, 0, 0, 0), 1121337529 - View.resolveSizeAndState(0, 0, 0), (byte) ((-21) - (Process.myTid() >> 22))).intern());
            sb2.append(str);
            String string2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2890((short) ((-38) - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf("", "", 0, 0) + 1125684730, View.getDefaultSize(0, 0) + 6, 1121337535 - (KeyEvent.getMaxKeyCode() >> 16), (byte) (TextUtils.indexOf((CharSequence) "", '0') - 1)).intern());
            sb3.append(string2);
            sb3.append(m2890((short) (94 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1125684692 - TextUtils.indexOf((CharSequence) "", '0', 0), '8' - AndroidCharacter.getMirror('0'), Gravity.getAbsoluteGravity(0, 0) + 1121337545, (byte) (TextUtils.getTrimmedLength("") + 119)).intern());
            m.m2978(str, sb3.toString(), false);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            if (str4 != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(m2890((short) (View.MeasureSpec.getMode(0) - 67), 1125684671 - (ViewConfiguration.getTapTimeout() >> 16), (-4) - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.lastIndexOf("", '0', 0) + 1121337558, (byte) ((-74) - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern());
                sb5.append(str4);
                string = sb5.toString();
            }
            sb4.append(string);
            m.m2978(str, sb4.toString(), false);
            bb bbVar = f3029.get();
            if (bbVar != null) {
                f3026 = (f3028 + 29) % 128;
                bbVar.m727(str, str2, string2, str4);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2890(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f3031;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f3030;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f3032 + i12] + i13);
                    } else {
                        i14 = (short) (f3027[f3032 + i12] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f3032 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f3033);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f3030;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f3027;
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
}

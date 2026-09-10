package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class au {

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f403 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f404;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static short[] f408;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<String> f412;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private e f413;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f414;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f411 = {5685, 5334, 5101, 7918, 'v', 640, 14408, 15035, 15760, 12420, 13281, 39582, 39031, 40780, 37465, 37171, 14742, 28669, 27940, 27158, 26397, 25714, 24894, 32325, 31572, 30952, 30101, 29340, 20461, 19685, 18882, 18136, 17422, 16689, 24069, 23397, 22640, 21836, 21083};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f410 = -2570210752393837842L;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f405 = 1697689265;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f409 = 35;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f406 = 1324714898;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static byte[] f407 = {-29, -89, -92, 74, -92, -85, -30, 34, -54, -64, -52, -31, 8, -1, 15, -13, -89, 90, -95, -90, 117, -121, -96, 83, 88, -73, 83, 124, -117, 90, -94, 72, -89, -82, 89, -90, 117};

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.au$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        static final /* synthetic */ int[] f415;

        static {
            int[] iArr = new int[e.valuesCustom().length];
            f415 = iArr;
            try {
                iArr[e.f421.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f415[e.f422.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f415[e.f420.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f415[e.f424.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum e {
        f421,
        f424,
        f420,
        f422;


        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f416 = 1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char[] f417;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f418;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f419;

        static {
            m578();
            f416 = (f418 + InterfaceC0435l1.d.b.f29109f) % 128;
        }

        public static e valueOf(String str) {
            f418 = (f416 + 125) % 128;
            e eVar = (e) Enum.valueOf(e.class, str);
            f418 = (f416 + 59) % 128;
            return eVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            f416 = (f418 + 97) % 128;
            e[] eVarArr = (e[]) values().clone();
            int i10 = f418 + 75;
            f416 = i10 % 128;
            if (i10 % 2 != 0) {
                return eVarArr;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static void m578() {
            f419 = (char) 4;
            f417 = new char[]{'A', 'L', 'B', 'O', 'V', 'E', 'W', 'X', 'C', 'T', 'D', 'F', 'G', 'H', 'I', 'J'};
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m577(int i10, String str, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (j.f2647) {
                try {
                    char[] cArr2 = f417;
                    char c4 = f419;
                    char[] cArr3 = new char[i10];
                    if (i10 % 2 != 0) {
                        i10--;
                        cArr3[i10] = (char) (cArr[i10] - b10);
                    }
                    if (i10 > 1) {
                        j.f2654 = 0;
                        while (true) {
                            int i11 = j.f2654;
                            if (i11 >= i10) {
                                break;
                            }
                            j.f2653 = cArr[i11];
                            j.f2650 = cArr[j.f2654 + 1];
                            if (j.f2653 == j.f2650) {
                                cArr3[j.f2654] = (char) (j.f2653 - b10);
                                cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                            } else {
                                j.f2652 = j.f2653 / c4;
                                j.f2649 = j.f2653 % c4;
                                j.f2651 = j.f2650 / c4;
                                j.f2648 = j.f2650 % c4;
                                if (j.f2649 == j.f2648) {
                                    j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                    j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                    int i12 = (j.f2652 * c4) + j.f2649;
                                    int i13 = (j.f2651 * c4) + j.f2648;
                                    int i14 = j.f2654;
                                    cArr3[i14] = cArr2[i12];
                                    cArr3[i14 + 1] = cArr2[i13];
                                } else if (j.f2652 == j.f2651) {
                                    j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                    j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                    int i15 = (j.f2652 * c4) + j.f2649;
                                    int i16 = (j.f2651 * c4) + j.f2648;
                                    int i17 = j.f2654;
                                    cArr3[i17] = cArr2[i15];
                                    cArr3[i17 + 1] = cArr2[i16];
                                } else {
                                    int i18 = (j.f2652 * c4) + j.f2648;
                                    int i19 = (j.f2651 * c4) + j.f2649;
                                    int i20 = j.f2654;
                                    cArr3[i20] = cArr2[i18];
                                    cArr3[i20 + 1] = cArr2[i19];
                                }
                            }
                            j.f2654 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    public au(JSONObject jSONObject) {
        this.f413 = m572(jSONObject.optString(m573((char) ((KeyEvent.getMaxKeyCode() >> 16) + 5697), View.MeasureSpec.getMode(0), 4 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern()));
        this.f412 = m571(jSONObject.optString(m573((char) (ViewConfiguration.getEdgeSlop() >> 16), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 4, TextUtils.getOffsetBefore("", 0) + 2).intern()));
        this.f414 = m574(jSONObject.optString(m570((short) Color.alpha(0), (-1324714785) - Process.getGidForName(""), ExpandableListView.getPackedPositionGroup(0L) - 36, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1697689266, (byte) (MotionEvent.axisFromString("") + 89)).intern()));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<String> m571(String str) {
        List<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            f404 = (f403 + 37) % 128;
            arrayList = Arrays.asList(str.split(m573((char) ((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 14778), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 15, 1 - KeyEvent.normalizeMetaState(0)).intern()));
        }
        int i10 = f403 + InterfaceC0435l1.d.b.f29110g;
        f404 = i10 % 128;
        if (i10 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00d0  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static e m572(String str) {
        f404 = (f403 + 71) % 128;
        int iHashCode = str.hashCode();
        byte b10 = 0;
        if (iHashCode != 92611485) {
            if (iHashCode != 93621297) {
                if (iHashCode == 96946943 && str.equals(m573((char) (14381 - TextUtils.getCapsMode("", 0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5, (ViewConfiguration.getLongPressTimeout() >> 16) + 5).intern())) {
                    f404 = (f403 + 75) % 128;
                } else {
                    b10 = -1;
                }
            } else if (str.equals(m573((char) (39676 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, (ViewConfiguration.getFadingEdgeLength() >> 16) + 5).intern())) {
                int i10 = (f403 + 55) % 128;
                f404 = i10;
                f403 = (i10 + 57) % 128;
                b10 = 2;
            } else {
                b10 = -1;
            }
        } else if (str.equals(m570((short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (-1324714802) - TextUtils.lastIndexOf("", '0', 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 37, (-1697689259) - KeyEvent.getDeadChar(0, 0), (byte) ((-51) - (KeyEvent.getMaxKeyCode() >> 16))).intern())) {
            int i11 = f403 + 3;
            f404 = i11 % 128;
            if (i11 % 2 == 0) {
                b10 = 1;
            }
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            return e.f422;
        }
        if (b10 != 1) {
            return b10 != 2 ? e.f421 : e.f420;
        }
        e eVar = e.f424;
        int i12 = f403 + 55;
        f404 = i12 % 128;
        if (i12 % 2 == 0) {
            return eVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m573(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f411[i10 + i12]) ^ (((long) i12) * f410)) ^ ((long) c4));
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m574(String str) {
        if (!TextUtils.isEmpty(str)) {
            f404 = (f403 + 117) % 128;
            if (!str.equals(m570((short) ((-1) - Process.getGidForName("")), KeyEvent.normalizeMetaState(0) - 1324714788, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 37, (-1697689254) - View.combineMeasuredStates(0, 0), (byte) (7 - MotionEvent.axisFromString(""))).intern())) {
                return str;
            }
        }
        f403 = (f404 + 31) % 128;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.kn.m2912(r9, r8.f412.get(0)) < 0) goto L23;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m576(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.au.m576(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m575() {
        int i10 = f404;
        String str = this.f414;
        int i11 = i10 + InterfaceC0435l1.d.b.f29107d;
        f403 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m570(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f409;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f407;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f405 + i12] + i13);
                    } else {
                        i14 = (short) (f408[f405 + i12] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f405 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f406);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f407;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f408;
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

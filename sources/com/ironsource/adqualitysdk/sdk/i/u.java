package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u<K, T> implements t<K, T> {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f3171 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f3173 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f3174 = 5;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private t<K, T> f3177;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private t<K, T> f3178 = new t<K, T>() { // from class: com.ironsource.adqualitysdk.sdk.i.u.1
        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* JADX INFO: renamed from: ﻐ */
        public final void mo246(JSONObject jSONObject, K k8, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* JADX INFO: renamed from: ｋ */
        public final void mo249(JSONObject jSONObject, K k8, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* JADX INFO: renamed from: ﾒ */
        public final void mo252(JSONObject jSONObject, K k8, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* JADX INFO: renamed from: ﻐ */
        public final void mo247(JSONObject jSONObject, K k8, Object obj, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* JADX INFO: renamed from: ｋ */
        public final void mo250(JSONObject jSONObject, K k8, Object obj, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* JADX INFO: renamed from: ﾒ */
        public final void mo253(JSONObject jSONObject, K k8, Object obj, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* JADX INFO: renamed from: ﻛ */
        public final void mo248(JSONObject jSONObject, K k8, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* JADX INFO: renamed from: ﾇ */
        public final void mo251(JSONObject jSONObject, K k8, T t10) {
        }
    };

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f3176 = {'A', 'd', ' ', 'i', 's', 'p', 'l', 'a', 'y', 'e', ':', 'c', 'k', 'f', 'r', 'o', 'm', 'j', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f3175 = {34353, 51064, 1160, 16976, 33705, 49439, 3720, 20456, 36209, 51909, 2093, 18864, 38720, 54377, 5600, 21328, 37058, 56893, 8146, 50572, 33989, 18229, 490, 49169, 33470, 19766, 3164, 52937, 'v', 16645, 33469, 50227, 1424, 18301, 35068, 51584, 2817, 19631, 36432, 53185, 4468, 21062, 30155, 13459, 63271, 45560, 28745, 13046, 64881, 48134, 32392, 14698, 37393, 54091, 4345, 22114, 38797, 54563, 6906, 23491, 39236, 57083, 7172, 23938, 33656, 23045, 6988, 55508, 40545, 24474, 7484, 53920, 37845, 20822, 5848, 54286, 38287, 19244, 2113, 23818, 7275, 57298, 11862, 28429, 44217, 59960, 11217, 26927, 42744, 59285, 9494, 25278, 41055, 57822, 16237, 31752, 48603, 64290, 14501, 30298, 47077, 62819, 12867, 29605, 45352, 52936, 3165};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f3172 = -6741400427508252308L;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        return r3.f3177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r3 = r3.f3178;
        r0 = r0 + 43;
        com.ironsource.adqualitysdk.sdk.i.u.f3173 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r0 = 41 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3.f3177 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r3.f3177 != null) goto L9;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.i.t<K, T> m3073() {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.u.f3171
            int r1 = r0 + 53
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.u.f3173 = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L15
            com.ironsource.adqualitysdk.sdk.i.t<K, T> r1 = r3.f3177
            r2 = 38
            int r2 = r2 / 0
            if (r1 == 0) goto L1c
            goto L19
        L15:
            com.ironsource.adqualitysdk.sdk.i.t<K, T> r1 = r3.f3177
            if (r1 == 0) goto L1c
        L19:
            com.ironsource.adqualitysdk.sdk.i.t<K, T> r3 = r3.f3177
            return r3
        L1c:
            com.ironsource.adqualitysdk.sdk.i.t<K, T> r3 = r3.f3178
            int r0 = r0 + 43
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.u.f3173 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L2c
            r0 = 41
            int r0 = r0 / 0
        L2c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.u.m3073():com.ironsource.adqualitysdk.sdk.i.t");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* JADX INFO: renamed from: ﻐ */
    public void mo246(JSONObject jSONObject, K k8, T t10) {
        f3171 = (f3173 + InterfaceC0435l1.d.b.f29105b) % 128;
        JSONObject jSONObjectM3070 = m3070(jSONObject, t10);
        m3072(m3074((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, (char) (34416 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Process.myTid() >> 22).intern(), jSONObjectM3070);
        m3073().mo246(jSONObjectM3070, k8, t10);
        f3173 = (f3171 + 89) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* JADX INFO: renamed from: ﻛ */
    public final void mo248(JSONObject jSONObject, K k8, T t10) {
        f3171 = (f3173 + 83) % 128;
        JSONObject jSONObjectM3070 = m3070(jSONObject, t10);
        m3072(m3074(KeyEvent.getDeadChar(0, 0) + 9, (char) (View.combineMeasuredStates(0, 0) + 50637), ((byte) KeyEvent.getModifierMetaStateMask()) + 20).intern(), jSONObjectM3070);
        m3073().mo248(jSONObjectM3070, k8, t10);
        f3173 = (f3171 + 27) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m3075(t<K, T> tVar) {
        int i10 = f3173;
        int i11 = i10 + 115;
        f3171 = i11 % 128;
        int i12 = i11 % 2;
        this.f3177 = tVar;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i10 + 49;
        f3171 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 20 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public abstract String mo244(T t10);

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* JADX INFO: renamed from: ﾒ */
    public final void mo253(JSONObject jSONObject, K k8, Object obj, T t10) {
        f3171 = (f3173 + 121) % 128;
        JSONObject jSONObjectM3070 = m3070(jSONObject, t10);
        m3072(m3074(10 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (30108 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43).intern(), jSONObjectM3070);
        m3073().mo253(jSONObjectM3070, k8, obj, t10);
        int i10 = f3173 + 95;
        f3171 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* JADX INFO: renamed from: ｋ */
    public void mo249(JSONObject jSONObject, K k8, T t10) {
        f3173 = (f3171 + 107) % 128;
        JSONObject jSONObjectM3070 = m3070(jSONObject, t10);
        m3072(m3071((byte) (120 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Color.blue(0) + 13, "\u0001\u0002\u0003\u0002\u0004\u0000\u0006\u0007\b\t\u0006\u0004²").intern(), jSONObjectM3070);
        m3073().mo249(jSONObjectM3070, k8, t10);
        int i10 = f3173 + 27;
        f3171 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 28 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m3072(String str, JSONObject jSONObject) {
        String strIntern = m3074((ViewConfiguration.getFadingEdgeLength() >> 16) + 14, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 23108), 65 - KeyEvent.keyCodeFromString("")).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(m3074((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, (char) (23851 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 79 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
        sb2.append(str);
        m.m2969(strIntern, sb2.toString(), jSONObject);
        f3173 = (f3171 + 43) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* JADX INFO: renamed from: ﻐ */
    public final void mo247(JSONObject jSONObject, K k8, Object obj, T t10) {
        f3173 = (f3171 + 121) % 128;
        JSONObject jSONObjectM3070 = m3070(jSONObject, t10);
        m3072(m3071((byte) (Drawable.resolveOpacity(0, 0) + 34), 10 - MotionEvent.axisFromString(""), "\u0001\u0002\u0001\f\b\u0001\f\r\u0006\u0004\\").intern(), jSONObjectM3070);
        m3073().mo247(jSONObjectM3070, k8, obj, t10);
        int i10 = f3171 + 79;
        f3173 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 17 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* JADX INFO: renamed from: ﾇ */
    public final void mo251(JSONObject jSONObject, K k8, T t10) {
        f3171 = (f3173 + 65) % 128;
        JSONObject jSONObjectM3070 = m3070(jSONObject, t10);
        m3072(m3074(TextUtils.indexOf((CharSequence) "", '0') + 15, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getCapsMode("", 0, 0) + 28).intern(), jSONObjectM3070);
        m3073().mo251(jSONObjectM3070, k8, t10);
        f3171 = (f3173 + 99) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* JADX INFO: renamed from: ﾒ */
    public final void mo252(JSONObject jSONObject, K k8, T t10) {
        f3171 = (f3173 + 17) % 128;
        JSONObject jSONObjectM3070 = m3070(jSONObject, t10);
        m3072(m3074((ViewConfiguration.getPressedStateDuration() >> 16) + 13, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37457), (ViewConfiguration.getFadingEdgeLength() >> 16) + 52).intern(), jSONObjectM3070);
        m3073().mo252(jSONObjectM3070, k8, t10);
        f3171 = (f3173 + 15) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m3071(byte b10, int i10, String str) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f3176;
                char c4 = f3174;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* JADX INFO: renamed from: ｋ */
    public final void mo250(JSONObject jSONObject, K k8, Object obj, T t10) {
        f3173 = (f3171 + 39) % 128;
        JSONObject jSONObjectM3070 = m3070(jSONObject, t10);
        m3072(m3071((byte) (View.MeasureSpec.getMode(0) + 31), 19 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0001\u0002\u0001\f\b\u0001\f\r\u0006\u0004\u0003\f\n\u0013\u0011\u0001\u0013\u0002Y").intern(), jSONObjectM3070);
        m3073().mo250(jSONObjectM3070, k8, obj, t10);
        int i10 = f3171 + 55;
        f3173 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 27 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private JSONObject m3070(JSONObject jSONObject, T t10) {
        f3171 = (f3173 + 27) % 128;
        try {
            if (!jSONObject.has(is.f2608)) {
                f3171 = (f3173 + 41) % 128;
                jSONObject.put(is.f2608, mo244(t10));
                f3171 = (f3173 + 21) % 128;
            }
            if (!jSONObject.has(is.f2604)) {
                jSONObject.put(is.f2604, ke.m2803());
                f3173 = (f3171 + 77) % 128;
            }
            return jSONObject;
        } catch (JSONException e10) {
            m.m2983(m3074((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 13, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23108), TextUtils.getTrimmedLength("") + 65).intern(), m3074(Color.blue(0) + 25, (char) (11795 - TextUtils.indexOf("", "", 0)), 82 - TextUtils.indexOf("", "")).intern(), e10);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m3074(int i10, char c4, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i10];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((((long) f3175[i11 + i12]) ^ (((long) i12) * f3172)) ^ ((long) c4));
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
}

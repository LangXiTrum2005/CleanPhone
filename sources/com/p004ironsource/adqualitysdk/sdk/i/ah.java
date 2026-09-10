package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
final class ah {

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f156 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f157 = 5;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f158;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private int f161;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private long f162;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Boolean f163 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private long f164;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private long f165;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private long f166;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f160 = {'T', 'i', 'm', 'e', 's', 't', 'a', 'p', 'S', 'y', 'n', 'c', 'h', 'r', 'o', 'z', 'E', ' ', 'g', 'v', 'd', AbstractJsonLexerKt.UNICODE_ESC, 'U', 'V', 'W'};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f159 = -5009144474268521418L;

    public ah(int i2) {
        this.f161 = i2;
        as.m467().mo495(new at() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.5

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f167 = 0;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f170 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f169 = {3172, 23914, 44603, 65484, 18575, 39355, 60259, 13368, 34264, 54952, 10167, 29039, 49719, 5071, 31880, 52642, 8046, 26682, 47580, 2716, 23486, 'E', 20801, 41492, 62454, 17598, 38367, 59227, 14347, 35256, 55980, 11163, 32069, 52752, 8190, 28836, 49562, 4880, 25616, 46579, 1723, 22410, 43338, 64016, 19381, 40124, 60818, 16195, 36868, 57831, 12979, 33691, 54592, 9744};

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static long f168 = 2545255649113166131L;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m318(int i3, int i4, char c2) {
                String str;
                synchronized (a.f68) {
                    try {
                        char[] cArr = new char[i3];
                        a.f69 = 0;
                        while (true) {
                            int i5 = a.f69;
                            if (i5 < i3) {
                                cArr[i5] = (char) ((((long) f169[i4 + i5]) ^ (((long) i5) * f168)) ^ ((long) c2));
                                a.f69 = i5 + 1;
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

            /* JADX WARN: Code duplicated, block: B:10:0x0085 A[PHI: r0 r1
  0x0085: PHI (r0v9 com.ironsource.adqualitysdk.sdk.i.ar) = (r0v4 com.ironsource.adqualitysdk.sdk.i.ar), (r0v11 com.ironsource.adqualitysdk.sdk.i.ar) binds: [B:8:0x002f, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r1v9 long) = (r1v1 long), (r1v10 long) binds: [B:8:0x002f, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r0
  0x0031: PHI (r0v5 com.ironsource.adqualitysdk.sdk.i.ar) = (r0v4 com.ironsource.adqualitysdk.sdk.i.ar), (r0v11 com.ironsource.adqualitysdk.sdk.i.ar) binds: [B:8:0x002f, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.at
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo319() {
                ar arVarMo481;
                long jM458;
                int i3 = f167 + 75;
                f170 = i3 % 128;
                if (i3 % 2 == 0) {
                    arVarMo481 = as.m467().mo481();
                    jM458 = arVarMo481.m458();
                    if (jM458 == 1) {
                        f170 = (f167 + 7) % 128;
                        ah.m308(ah.this, Boolean.FALSE);
                        jM458 = arVarMo481.m460();
                        kb.m2752(m318(21 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0), (char) (View.MeasureSpec.getMode(0) + 3120)).intern(), m318((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33, 21 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), (Throwable) null, false);
                    } else {
                        ah.m308(ah.this, Boolean.TRUE);
                    }
                } else {
                    arVarMo481 = as.m467().mo481();
                    jM458 = arVarMo481.m458();
                    if (jM458 == 0) {
                        f170 = (f167 + 7) % 128;
                        ah.m308(ah.this, Boolean.FALSE);
                        jM458 = arVarMo481.m460();
                        kb.m2752(m318(21 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0), (char) (View.MeasureSpec.getMode(0) + 3120)).intern(), m318((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33, 21 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), (Throwable) null, false);
                    } else {
                        ah.m308(ah.this, Boolean.TRUE);
                    }
                }
                ah.m305(ah.this, arVarMo481.m457());
                ah.m314(ah.this, arVarMo481.m460());
                ah ahVar = ah.this;
                ah.m310(ahVar, jM458 - ah.m309(ahVar));
                ah ahVar2 = ah.this;
                ah.m307(ahVar2, jM458 - ah.m313(ahVar2));
            }
        });
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m304(JSONObject jSONObject) {
        if (!jSONObject.has(m311("욉웼藙ꦛ䄌ᤏㅎ", TextUtils.indexOf((CharSequence) "", '0') + 1).intern())) {
            f156 = (f158 + 31) % 128;
            if (!jSONObject.has(m311("ꙍ\ua639ﬁ흄\u206a硩ᠧ", View.MeasureSpec.getMode(0)).intern())) {
                f158 = (f156 + 1) % 128;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ long m305(ah ahVar, long j) {
        int i2 = (f158 + 37) % 128;
        f156 = i2;
        ahVar.f166 = j;
        int i3 = i2 + 71;
        f158 = i3 % 128;
        if (i3 % 2 == 0) {
            return j;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ long m307(ah ahVar, long j) {
        int i2 = f158;
        f156 = (i2 + 33) % 128;
        ahVar.f165 = j;
        f156 = (i2 + 9) % 128;
        return j;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ long m309(ah ahVar) {
        int i2 = (f158 + 45) % 128;
        f156 = i2;
        long j = ahVar.f166;
        int i3 = i2 + 59;
        f158 = i3 % 128;
        if (i3 % 2 == 0) {
            return j;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ long m313(ah ahVar) {
        int i2 = (f158 + 31) % 128;
        f156 = i2;
        long j = ahVar.f164;
        f158 = (i2 + 97) % 128;
        return j;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m306(JSONObject jSONObject) {
        boolean z2;
        long jOptLong;
        f156 = (f158 + 123) % 128;
        try {
            if (jSONObject.optInt(m303((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 58), "\u0000\u0002\u009e", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2).intern(), 1) == this.f161 || m316(jSONObject)) {
                long jOptLong2 = jSONObject.optLong(m303((byte) (27 - ExpandableListView.getPackedPositionType(0L)), "\u0014\u0006", View.getDefaultSize(0, 0) + 2).intern()) + this.f162;
                jSONObject.put(m311("욉웼藙ꦛ䄌ᤏㅎ", View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), this.f162);
                z2 = true;
                jOptLong = jOptLong2;
            } else {
                jOptLong = jSONObject.optLong(m303((byte) (ExpandableListView.getPackedPositionGroup(0L) + 32), "\u0000\n\u0093", 4 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()) + this.f165;
                jSONObject.put(m311("ꙍ\ua639ﬁ흄\u206a硩ᠧ", ViewConfiguration.getMaximumFlingVelocity() >> 16).intern(), this.f165);
                z2 = false;
            }
            jSONObject.put(ik.f2465, jOptLong);
            if (!this.f163.booleanValue()) {
                f158 = (f156 + 69) % 128;
                jSONObject.put(m303((byte) (47 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "\t\u0000¡", 3 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), false);
            }
            m315(jSONObject, z2);
            m312(jSONObject, z2);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Boolean m308(ah ahVar, Boolean bool) {
        int i2 = f156;
        f158 = (i2 + 85) % 128;
        ahVar.f163 = bool;
        f158 = (i2 + 119) % 128;
        return bool;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ long m310(ah ahVar, long j) {
        int i2 = f156;
        f158 = (i2 + 23) % 128;
        ahVar.f162 = j;
        f158 = (i2 + 109) % 128;
        return j;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ long m314(ah ahVar, long j) {
        int i2 = f158 + 49;
        f156 = i2 % 128;
        int i3 = i2 % 2;
        ahVar.f164 = j;
        if (i3 != 0) {
            return j;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m315(JSONObject jSONObject, boolean z2) {
        long jOptLong;
        long j;
        long jOptLong2;
        f158 = (f156 + 123) % 128;
        if (!jSONObject.has(m303((byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 106), "\u0000\tÝ", KeyEvent.keyCodeFromString("") + 3).intern())) {
            return;
        }
        try {
            if (z2) {
                int i2 = f156 + 37;
                f158 = i2 % 128;
                if (i2 % 2 != 0) {
                    jOptLong2 = jSONObject.optLong(m311("溜滯훶蝹쌇鬟뻅", Color.alpha(1)).intern()) % this.f162;
                } else {
                    jOptLong = jSONObject.optLong(m311("溜滯훶蝹쌇鬟뻅", Color.alpha(0)).intern());
                    j = this.f162;
                }
                jSONObject.put(m303((byte) (106 - (ViewConfiguration.getScrollBarSize() >> 8)), "\u0000\tÝ", Color.red(0) + 3).intern(), jOptLong2);
                return;
            }
            jOptLong = jSONObject.optLong(m303((byte) (View.resolveSize(0, 0) + 106), "\u0000\tÝ", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3).intern());
            j = this.f165;
            jSONObject.put(m303((byte) (106 - (ViewConfiguration.getScrollBarSize() >> 8)), "\u0000\tÝ", Color.red(0) + 3).intern(), jOptLong2);
            return;
        } catch (JSONException unused) {
            return;
        }
        jOptLong2 = jOptLong + j;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m317(JSONObject jSONObject) {
        int i2;
        f156 = (f158 + 13) % 128;
        if (!m304(jSONObject)) {
            int i3 = f158 + 81;
            f156 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 44 / 0;
                if (this.f163 != null) {
                    try {
                        m306(jSONObject);
                        i2 = f156 + 53;
                        f158 = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i5 = 95 / 0;
                        }
                        return true;
                    } catch (Exception e2) {
                        kb.m2752(m303((byte) (33 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "\u0001\u0002\u0003\u0004\u0000\t\u0007\u0001\b\t\u0005\u000e\f\r\u000e\n\u000b\u0000\u0012\u0000\u0092", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 21).intern(), m303((byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 116), "\u0012\u000b\u000e\n\f\u0012\t\u000e\u000b\f\r\u000e\n\u000b\u0000\u0010\u0000\u000b\u0013\u0012\u0004\u0012\u0000\rè", 25 - KeyEvent.keyCodeFromString("")).intern(), (Throwable) e2, false);
                    }
                }
            } else if (this.f163 != null) {
                m306(jSONObject);
                i2 = f156 + 53;
                f158 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i6 = 95 / 0;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m303(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f160;
                char c2 = f157;
                char[] cArr3 = new char[i2];
                if (i2 % 2 != 0) {
                    i2--;
                    cArr3[i2] = (char) (cArr[i2] - b2);
                }
                if (i2 > 1) {
                    i.f2348 = 0;
                    while (true) {
                        int i3 = i.f2348;
                        if (i3 >= i2) {
                            break;
                        }
                        i.f2347 = cArr[i3];
                        i.f2345 = cArr[i.f2348 + 1];
                        if (i.f2347 == i.f2345) {
                            cArr3[i.f2348] = (char) (i.f2347 - b2);
                            cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                        } else {
                            i.f2346 = i.f2347 / c2;
                            i.f2342 = i.f2347 % c2;
                            i.f2344 = i.f2345 / c2;
                            i.f2341 = i.f2345 % c2;
                            if (i.f2342 == i.f2341) {
                                i.f2346 = a.b(i.f2346, c2, 1, c2);
                                i.f2344 = a.b(i.f2344, c2, 1, c2);
                                int i4 = (i.f2346 * c2) + i.f2342;
                                int i5 = (i.f2344 * c2) + i.f2341;
                                int i6 = i.f2348;
                                cArr3[i6] = cArr2[i4];
                                cArr3[i6 + 1] = cArr2[i5];
                            } else if (i.f2346 == i.f2344) {
                                i.f2342 = a.b(i.f2342, c2, 1, c2);
                                i.f2341 = a.b(i.f2341, c2, 1, c2);
                                int i7 = (i.f2346 * c2) + i.f2342;
                                int i8 = (i.f2344 * c2) + i.f2341;
                                int i9 = i.f2348;
                                cArr3[i9] = cArr2[i7];
                                cArr3[i9 + 1] = cArr2[i8];
                            } else {
                                int i10 = (i.f2346 * c2) + i.f2341;
                                int i11 = (i.f2344 * c2) + i.f2342;
                                int i12 = i.f2348;
                                cArr3[i12] = cArr2[i10];
                                cArr3[i12 + 1] = cArr2[i11];
                            }
                        }
                        i.f2348 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m316(JSONObject jSONObject) {
        f158 = (f156 + 99) % 128;
        if (Math.abs((this.f164 - this.f166) - (jSONObject.optLong(m303((byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 32), "\u0000\n\u0093", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4).intern()) - jSONObject.optLong(m303((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 27), "\u0014\u0006", TextUtils.indexOf((CharSequence) "", '0') + 3).intern()))) > 10) {
            return false;
        }
        int i2 = f156 + 55;
        f158 = i2 % 128;
        return i2 % 2 == 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m312(JSONObject jSONObject, boolean z2) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(m311("ἶ\u1f5a⃰ಧ\uf3c1\ue85dꯞ沋꾺퇆ꋯ妒绮", ViewConfiguration.getJumpTapTimeout() >> 16).intern());
            if (jSONObjectOptJSONObject != null) {
                Long lValueOf = null;
                if (!z2) {
                    long jOptLong = jSONObjectOptJSONObject.optLong(m311("嶛巯梠夣跡", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                    if (jOptLong > 0) {
                        int i2 = f156 + 75;
                        f158 = i2 % 128;
                        lValueOf = i2 % 2 != 0 ? Long.valueOf(jOptLong / this.f165) : Long.valueOf(jOptLong + this.f165);
                    }
                } else {
                    long jOptLong2 = jSONObjectOptJSONObject.optLong(m303((byte) (16 - KeyEvent.getDeadChar(0, 0)), "\u0085", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
                    if (jOptLong2 > 0) {
                        lValueOf = Long.valueOf(jOptLong2 + this.f162);
                    }
                }
                if (lValueOf != null) {
                    int i3 = f156 + 93;
                    f158 = i3 % 128;
                    jSONObjectOptJSONObject.put((i3 % 2 != 0 ? m311("嶛巯梠夣跡", ViewConfiguration.getScrollBarSize() << 59) : m311("嶛巯梠夣跡", ViewConfiguration.getScrollBarSize() >> 8)).intern(), lValueOf);
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m311(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f159, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f159));
                        f.f1954 = i3 + 1;
                    } else {
                        str2 = new String(cArrM2116, 4, cArrM2116.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}

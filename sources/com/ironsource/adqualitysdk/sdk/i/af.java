package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class af {

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f121 = 1;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f122 = 245454325;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static byte[] f123 = {60, 55, 98, 101, 23, 26, -1, -24, 0, 21, -38, -5, 12, -17, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f124 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static short[] f125 = null;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f126 = 85;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f127 = -2022172716;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static long f128 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f129 = 21059;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f130;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private int f131;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private long f132;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private long f133;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Boolean f134 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private long f135;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private long f136;

    public af(int i10) {
        this.f131 = i10;
        ar.m468().mo498(new ax() { // from class: com.ironsource.adqualitysdk.sdk.i.af.2

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f137 = 0;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char[] f138 = {'T', 8300, 16487, 24682, 32871, 41069, 49279, 57422, 'X', 8318, 16459, 24665, 32863, 41001, 49204, 57380, '>', 8252, 16416, 24634, 32790, 7096, 15242, 23429, 31645, 39835, 48068, 56202, 64432, 7157, 15287, 23466, 31678, 39861, 48085, 56277, 64465, 7053, 15323, 23490, 31696, 39919, 48113, 56289, 64430, 7153, 15337, 23314, 31519, 39682, 47896, 56074, 64267, 6957};

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static long f139 = 5191029071050645509L;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f140 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m303(char c4, int i11, int i12) {
                String str;
                synchronized (c.f1153) {
                    try {
                        char[] cArr = new char[i12];
                        c.f1154 = 0;
                        while (true) {
                            int i13 = c.f1154;
                            if (i13 < i12) {
                                cArr[i13] = (char) ((((long) f138[i11 + i13]) ^ (((long) i13) * f139)) ^ ((long) c4));
                                c.f1154 = i13 + 1;
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

            @Override // com.ironsource.adqualitysdk.sdk.i.ax
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo304() {
                ap apVarMo484 = ar.m468().mo484();
                long jM454 = apVarMo484.m454();
                if (jM454 == 0) {
                    f137 = (f140 + 19) % 128;
                    af.m288(af.this, Boolean.FALSE);
                    jM454 = apVarMo484.m457();
                    kl.m2899(m303((char) (TextUtils.lastIndexOf("", '0', 0) + 1), ViewConfiguration.getLongPressTimeout() >> 16, (ViewConfiguration.getPressedStateDuration() >> 16) + 21).intern(), m303((char) ((Process.myTid() >> 22) + 7165), TextUtils.getOffsetAfter("", 0) + 21, TextUtils.indexOf((CharSequence) "", '0') + 34).intern(), null, false);
                } else {
                    af.m288(af.this, Boolean.TRUE);
                }
                af.m297(af.this, apVarMo484.m456());
                af.m299(af.this, apVarMo484.m457());
                af afVar = af.this;
                af.m294(afVar, jM454 - af.m290(afVar));
                af afVar2 = af.this;
                af.m291(afVar2, jM454 - af.m293(afVar2));
                int i11 = f137 + 5;
                f140 = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Boolean m288(af afVar, Boolean bool) {
        int i10 = f124 + 23;
        int i11 = i10 % 128;
        f121 = i11;
        int i12 = i10 % 2;
        afVar.f134 = bool;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i11 + 55;
        f124 = i13 % 128;
        if (i13 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ long m290(af afVar) {
        int i10 = f121;
        int i11 = i10 + 51;
        f124 = i11 % 128;
        if (i11 % 2 != 0) {
            long j10 = afVar.f132;
            throw null;
        }
        long j11 = afVar.f132;
        f124 = (i10 + 53) % 128;
        return j11;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ long m293(af afVar) {
        int i10 = f121 + 1;
        f124 = i10 % 128;
        if (i10 % 2 == 0) {
            return afVar.f135;
        }
        long j10 = afVar.f135;
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ long m297(af afVar, long j10) {
        int i10 = (f121 + 33) % 128;
        f124 = i10;
        afVar.f132 = j10;
        f121 = (i10 + 47) % 128;
        return j10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ long m299(af afVar, long j10) {
        int i10 = (f124 + 31) % 128;
        f121 = i10;
        afVar.f135 = j10;
        int i11 = i10 + InterfaceC0435l1.d.b.f29114k;
        f124 = i11 % 128;
        if (i11 % 2 == 0) {
            return j10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ long m291(af afVar, long j10) {
        int i10 = (f121 + 45) % 128;
        f124 = i10;
        afVar.f133 = j10;
        f121 = (i10 + 51) % 128;
        return j10;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ long m294(af afVar, long j10) {
        int i10 = f121;
        f124 = (i10 + 71) % 128;
        afVar.f136 = j10;
        int i11 = i10 + 97;
        f124 = i11 % 128;
        if (i11 % 2 == 0) {
            return j10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m298(JSONObject jSONObject) {
        if (Math.abs((this.f135 - this.f132) - (jSONObject.optLong(m300((char) (TextUtils.indexOf((CharSequence) "", '0') + 52361), "\u0000\u0000\u0000\u0000", "䰓㒖袄\uddcc", "樜ᆇ袤", (-2076928436) - View.resolveSizeAndState(0, 0, 0)).intern()) - jSONObject.optLong(m300((char) (2697 - TextUtils.indexOf((CharSequence) "", '0', 0)), "\u0000\u0000\u0000\u0000", "쑧䡙該嬊", "⼲\ue218", (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern()))) > 10) {
            return false;
        }
        int i10 = f124 + 29;
        f121 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 89 / 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m301(JSONObject jSONObject, boolean z10) {
        f121 = (f124 + InterfaceC0435l1.d.b.f29110g) % 128;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(m295((short) (5 - TextUtils.lastIndexOf("", '0')), (-245454217) - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf("", "", 0, 0) - 76, Gravity.getAbsoluteGravity(0, 0) + 2022172722, (byte) (Process.myPid() >> 22)).intern());
            if (jSONObjectOptJSONObject != null) {
                Long lValueOf = null;
                if (z10) {
                    f121 = (f124 + 31) % 128;
                    long jOptLong = jSONObjectOptJSONObject.optLong(m300((char) (61945 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "됳膝陼⟱", "쵿", ((Process.getThreadPriority(0) + 20) >> 6) - 964584012).intern());
                    if (jOptLong > 0) {
                        f121 = (f124 + InterfaceC0435l1.d.b.f29107d) % 128;
                        lValueOf = Long.valueOf(jOptLong + this.f136);
                    }
                } else {
                    long jOptLong2 = jSONObjectOptJSONObject.optLong(m295((short) (View.MeasureSpec.getMode(0) - 3), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 245454209, (-84) - (ViewConfiguration.getJumpTapTimeout() >> 16), 2022172730 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (byte) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern());
                    if (jOptLong2 > 0) {
                        int i10 = f121 + 81;
                        f124 = i10 % 128;
                        lValueOf = i10 % 2 != 0 ? Long.valueOf(jOptLong2 % this.f133) : Long.valueOf(jOptLong2 + this.f133);
                    }
                }
                if (lValueOf != null) {
                    f121 = (f124 + InterfaceC0435l1.d.b.f29114k) % 128;
                    jSONObjectOptJSONObject.put(m295((short) ((-3) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 245454208, (ViewConfiguration.getScrollBarSize() >> 8) - 84, 2022172730 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), lValueOf);
                    f124 = (f121 + 61) % 128;
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m302(JSONObject jSONObject) {
        if (!m296(jSONObject)) {
            int i10 = (f121 + 91) % 128;
            f124 = i10;
            if (this.f134 != null) {
                int i11 = i10 + 33;
                f121 = i11 % 128;
                try {
                    if (i11 % 2 == 0) {
                        m292(jSONObject);
                        return false;
                    }
                    m292(jSONObject);
                    return true;
                } catch (Exception e10) {
                    kl.m2899(m300((char) ((-16777216) - Color.rgb(0, 0, 0)), "\u0000\u0000\u0000\u0000", "膴햺쵕㛻", "\uf40d闸庄Ẫ酱눼쒃霴ǘ錫ė쌟흹욊ἀ늚夒螣蓮⯾\uf439", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1440070272).intern(), m300((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0000\u0000\u0000\u0000", "Ⱎ≂歀ኄ", "\ue850㭅ଠ孹莹\uf64f뒃視ᐫỲ\uee99뫇⭚\uf448䢶돲閌䕙砂⃪뗠潾㐇ᘹ贖", 1075986987 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), e10, false);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m292(JSONObject jSONObject) {
        long jOptLong;
        boolean z10;
        try {
            if (jSONObject.optInt(m295((short) ((KeyEvent.getMaxKeyCode() >> 16) - 65), (-245454210) - View.getDefaultSize(0, 0), (-82) - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 2022172716 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), 1) != this.f131 && !m298(jSONObject)) {
                jOptLong = jSONObject.optLong(m300((char) (52360 - (ViewConfiguration.getWindowTouchSlop() >> 8)), "\u0000\u0000\u0000\u0000", "䰓㒖袄\uddcc", "樜ᆇ袤", (-2076928436) - Drawable.resolveOpacity(0, 0)).intern()) + this.f133;
                jSONObject.put(m295((short) ((-102) - View.combineMeasuredStates(0, 0)), TextUtils.getOffsetAfter("", 0) - 245454209, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 82, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2022172717, (byte) (ViewConfiguration.getTouchSlop() >> 8)).intern(), this.f133);
                f124 = (f121 + 75) % 128;
                z10 = false;
            } else {
                jOptLong = jSONObject.optLong(m300((char) ((ViewConfiguration.getTouchSlop() >> 8) + 2698), "\u0000\u0000\u0000\u0000", "쑧䡙該嬊", "⼲\ue218", KeyEvent.getMaxKeyCode() >> 16).intern()) + this.f136;
                jSONObject.put(m300((char) (324 - Color.green(0)), "\u0000\u0000\u0000\u0000", "﨧◠䐻鴁", "霓ꦼ鸧", View.MeasureSpec.getSize(0) + 992338170).intern(), this.f136);
                f124 = (f121 + 31) % 128;
                z10 = true;
            }
            jSONObject.put(is.f2604, jOptLong);
            if (!this.f134.booleanValue()) {
                int i10 = f121 + 107;
                f124 = i10 % 128;
                jSONObject.put((i10 % 2 != 0 ? m300((char) (22073 >> Drawable.resolveOpacity(1, 0)), "\u0000\u0000\u0000\u0000", "\uf00aᔃ폇ో", "捡\u243a뢔", (-954924048) / (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) > 2.0f ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) == 2.0f ? 0 : -1))) : m300((char) (Drawable.resolveOpacity(0, 0) + 19411), "\u0000\u0000\u0000\u0000", "\uf00aᔃ폇ో", "捡\u243a뢔", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 954924048)).intern(), false);
            }
            m289(jSONObject, z10);
            m301(jSONObject, z10);
            f121 = (f124 + 63) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m296(JSONObject jSONObject) {
        f121 = (f124 + 33) % 128;
        if (jSONObject.has(m300((char) (ExpandableListView.getPackedPositionGroup(0L) + 324), "\u0000\u0000\u0000\u0000", "﨧◠䐻鴁", "霓ꦼ鸧", (ViewConfiguration.getScrollBarSize() >> 8) + 992338170).intern())) {
            return true;
        }
        f124 = (f121 + 39) % 128;
        return jSONObject.has(m295((short) ((-102) - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + (-245454209), (-82) - (ViewConfiguration.getFadingEdgeLength() >> 16), 2022172718 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m289(JSONObject jSONObject, boolean z10) {
        long jOptLong;
        if (jSONObject.has(m300((char) (35685 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "䫽濒操ꖋ", "넿\ue142ダ", ((byte) KeyEvent.getModifierMetaStateMask()) - 848309685).intern())) {
            if (z10) {
                f124 = (f121 + 41) % 128;
                jOptLong = jSONObject.optLong(m295((short) (View.resolveSizeAndState(0, 0, 0) - 24), (-245454210) - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (-82) - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 2022172720, (byte) KeyEvent.normalizeMetaState(0)).intern()) + this.f136;
            } else {
                jOptLong = jSONObject.optLong(m300((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 35684), "\u0000\u0000\u0000\u0000", "䫽濒操ꖋ", "넿\ue142ダ", ((byte) KeyEvent.getModifierMetaStateMask()) - 848309685).intern()) + this.f133;
                f121 = (f124 + 23) % 128;
            }
            try {
                jSONObject.put(m300((char) (35684 - TextUtils.getTrimmedLength("")), "\u0000\u0000\u0000\u0000", "䫽濒操ꖋ", "넿\ue142ダ", (-848309686) - ExpandableListView.getPackedPositionType(0L)).intern(), jOptLong);
                return;
            } catch (JSONException unused) {
            }
        }
        f124 = (f121 + InterfaceC0435l1.d.b.f29114k) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m295(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f126;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f123;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f127 + i12] + i13);
                    } else {
                        i14 = (short) (f125[f127 + i12] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f127 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f122);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f123;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f125;
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
    private static String m300(char c4, String str, String str2, String str3, int i10) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (f.f2016) {
            try {
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr3.clone();
                cArr4[0] = (char) (c4 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr.length;
                char[] cArr6 = new char[length];
                f.f2015 = 0;
                while (true) {
                    int i11 = f.f2015;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c5 = cArr5[i12];
                        char c10 = (char) ((i14 + c5) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2017 = c10;
                        cArr5[i13] = (char) d5.u.d(cArr4[i13], 32718, c5, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c10;
                        int i15 = f.f2015;
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f128) ^ ((long) f130)) ^ ((long) f129));
                        f.f2015 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }
}

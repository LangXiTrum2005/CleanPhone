package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.B5;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class s extends IronSourceAdQuality {

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    private static char[] f3087 = null;

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    private static long f3088 = 0;

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    private static int f3089 = 0;

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    private static int f3090 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static s f3091;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private aj f3092;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private ak f3093;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private jh f3094;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private jm f3095;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private av f3097;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private ISAdQualityAdListener f3098;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private ai f3099;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private jj f3100;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Context f3103;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ISAdQualityConfig f3108;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final as f3109 = new as();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f3110 = false;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f3107 = false;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private boolean f3105 = false;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private boolean f3102 = false;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean f3106 = false;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private ISAdQualityLogLevel f3104 = ISAdQualityLogLevel.INFO;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private final Set<ISAdQualityInitListener> f3096 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private final al f3101 = new al();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class AnonymousClass2 extends je {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static long f3114 = 3793542243185279252L;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ Activity f3115;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private /* synthetic */ Application f3117;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ String f3118;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ ISAdQualityConfig f3119;

        public AnonymousClass2(ISAdQualityConfig iSAdQualityConfig, String str, Application application, Activity activity) {
            this.f3119 = iSAdQualityConfig;
            this.f3118 = str;
            this.f3117 = application;
            this.f3115 = activity;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m3062(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (i.f2435) {
                try {
                    i.f2436 = i10;
                    char[] cArr2 = new char[cArr.length];
                    i.f2434 = 0;
                    while (true) {
                        int i11 = i.f2434;
                        if (i11 < cArr.length) {
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f3114);
                            i.f2434++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* JADX INFO: renamed from: ｋ */
        public final void mo254() {
            try {
                String userId = this.f3119.getUserId();
                s.m3031(s.this, this.f3119.getLogLevel());
                String strIntern = m3062("䅕촭姿\ue476瀁ﲩ\u0b53韫⎅긂㫲䚠", 35933 - TextUtils.getCapsMode("", 0, 0)).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m3062("䅝䀁䎋䔑䒑䘒䦚䬠䪶䰮侴儺僰剜嗇坕囌堟寓嵅峸帣懭捼拥搷", 379 - TextUtils.getTrimmedLength("")).intern());
                sb2.append(this.f3118);
                m.m2985(strIntern, sb2.toString());
                iu.m2556(this.f3117.getApplicationContext()).m2565();
                s.m3038(s.this, this.f3119.isTestMode());
                if (this.f3119.isTestMode()) {
                    m.m2968(m3062("䅕촭姿\ue476瀁ﲩ\u0b53韫⎅긂㫲䚠", (ViewConfiguration.getFadingEdgeLength() >> 16) + 35933).intern(), m3062("䅃鳒煮\ud9cf㝁ዹ灹侄괍袊\ue672얝⌯绯尘뮒餐\uf4c3툍まྸ浫䣧ꙃ藙\ue31b㻕᱀箤夷듦鈹\uf191케⪎ࠬ枇䗳ꍻﺸ\udc78㯹᥇瓜刁놎轷\ueafd적➵ԯ悟브鶔פֿ\ud962㓵ቯ燪伩\uaac4衚\ue7d5앙ₙ縼嶾묤雵\uf403펌ㄐಉ橋䡥\ua7f0蕬\ue0e3㸖ᷟ筁嚃둎鎸\uf12b첤⨯ই朘䊞ꀆ\uffc8\uddb1㬾", (ViewConfiguration.getLongPressTimeout() >> 16) + 56711).intern());
                }
                try {
                    Class.forName(m3062("䅵펱擦龜\u0a57鲊ㆲ䊷휣桄䀹\u0fecꃣ㔢䙠\ud892淰︎ጡꑮ", 37579 - View.getDefaultSize(0, 0)).intern());
                } catch (Throwable unused) {
                }
                Activity activity = this.f3115;
                if (activity != null) {
                    kf.m2814(activity);
                } else {
                    kf.m2826(this.f3117);
                }
                s.m3021(s.this).m553(this.f3118);
                s.m3021(s.this).m550(this.f3119.getInitializationSource());
                s.m3021(s.this).m554(this.f3119.getCoppa());
                s.m3021(s.this).m559(this.f3119.getDeviceIdType());
                if (this.f3119.getMetaData() != null) {
                    s.m3021(s.this).m561(this.f3119.getMetaData());
                    if (this.f3119.getMetaData().containsKey(m3062("䅡\u0010쎺蕈䓟ޞ줯袤䩏\u0df0첉踭凷ፁ틽閔圡ᛏ", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 16741).intern())) {
                        s.m3021(s.this).m556(this.f3119.getMetaData().get(m3062("䅡\u0010쎺蕈䓟ޞ줯袤䩏\u0df0첉踭凷ፁ틽閔圡ᛏ", 16742 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern()));
                    }
                }
                Context applicationContext = this.f3117.getApplicationContext();
                s.m3041(s.this, applicationContext);
                s.m3044(s.this, new jj(applicationContext));
                s sVar = s.this;
                s.m3043(sVar);
                s.m3045(sVar, new jm(applicationContext, al.m429(), "B0r1sW@sH3re"));
                ar.m468().mo492(applicationContext, s.m3027(s.this), s.m3043(s.this), new ar.c() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.1

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static int f3120 = 1;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f3121 = 0;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static long f3122 = 2721872533005641755L;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static String m3063(String str, int i10) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (i.f2435) {
                            try {
                                i.f2436 = i10;
                                char[] cArr2 = new char[cArr.length];
                                i.f2434 = 0;
                                while (true) {
                                    int i11 = i.f2434;
                                    if (i11 < cArr.length) {
                                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f3122);
                                        i.f2434++;
                                    } else {
                                        str2 = new String(cArr2);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return str2;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.ar.c
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo509() {
                        ISAdQualityInitError iSAdQualityInitError;
                        String strM3063;
                        int i10 = f3121 + 95;
                        f3120 = i10 % 128;
                        int i11 = i10 % 2;
                        s sVar2 = s.this;
                        if (i11 == 0) {
                            iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                            strM3063 = m3063("ꡕܷ\uf6bdꖼᕲ쐠돾抡퉱脫炥⾙齐丒㷟\uec93屈ଜ醙ꦍ᥉", 44819 >>> AndroidCharacter.getMirror(' '));
                        } else {
                            iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                            strM3063 = m3063("ꡕܷ\uf6bdꖼᕲ쐠돾抡퉱脫炥⾙齐丒㷟\uec93屈ଜ醙ꦍ᥉", AndroidCharacter.getMirror('0') + 44819);
                        }
                        s.m3050(sVar2, iSAdQualityInitError, strM3063.intern());
                        f3120 = (f3121 + 67) % 128;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.ar.c
                    /* JADX INFO: renamed from: ﾇ */
                    public final void mo510() {
                        ISAdQualityInitError iSAdQualityInitError;
                        int absoluteGravity;
                        int i10 = f3120 + 81;
                        f3121 = i10 % 128;
                        int i11 = i10 % 2;
                        s sVar2 = s.this;
                        if (i11 != 0) {
                            iSAdQualityInitError = ISAdQualityInitError.CONFIG_LOAD_TIMEOUT;
                            absoluteGravity = 52883 / Gravity.getAbsoluteGravity(1, 1);
                        } else {
                            iSAdQualityInitError = ISAdQualityInitError.CONFIG_LOAD_TIMEOUT;
                            absoluteGravity = 52883 - Gravity.getAbsoluteGravity(0, 0);
                        }
                        s.m3050(sVar2, iSAdQualityInitError, m3063("ꡒ曛㕼쏆鈆ꂱ缈\u0e72\udcea\ueb44맜䡪ڬ픨\ue45a늦䅈ᾷ⸣ﲔ謎婳梙❂\uf5bc萡劑憺ほ컕鵌ꮳ稔࢝쟩", absoluteGravity).intern());
                    }
                }, s.m3040(s.this));
                s.m3023(s.this, new jh(applicationContext, s.m3027(s.this), s.m3043(s.this).m432()));
                final String strM2831 = kh.m2831(applicationContext);
                ar.m468().mo503(new ax() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.3

                    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                    private static short[] f3132 = null;

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static byte[] f3133 = {-11, -1, -2, 0, -4, 0};

                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                    private static int f3134 = 0;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static int f3135 = 1;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int f3136 = 20;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f3137 = -1713043906;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static int f3138 = 67871959;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static String m3065(int i10, int i11, int i12, byte b10, short s10) {
                        String string;
                        synchronized (n.f3070) {
                            try {
                                StringBuilder sb3 = new StringBuilder();
                                int i13 = f3136;
                                int i14 = i12 + i13;
                                int i15 = i14 == -1 ? 1 : 0;
                                if (i15 != 0) {
                                    byte[] bArr = f3133;
                                    i14 = bArr != null ? (byte) (bArr[f3138 + i11] + i13) : (short) (f3132[f3138 + i11] + i13);
                                }
                                if (i14 > 0) {
                                    n.f3072 = ((i11 + i14) - 2) + f3138 + i15;
                                    n.f3073 = b10;
                                    char c4 = (char) (i10 + f3137);
                                    n.f3074 = c4;
                                    sb3.append(c4);
                                    n.f3075 = n.f3074;
                                    n.f3071 = 1;
                                    while (n.f3071 < i14) {
                                        byte[] bArr2 = f3133;
                                        if (bArr2 != null) {
                                            int i16 = n.f3072;
                                            n.f3072 = i16 - 1;
                                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                                        } else {
                                            short[] sArr = f3132;
                                            int i17 = n.f3072;
                                            n.f3072 = i17 - 1;
                                            n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                                        }
                                        sb3.append(n.f3074);
                                        n.f3075 = n.f3074;
                                        n.f3071++;
                                    }
                                }
                                string = sb3.toString();
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return string;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.ax
                    /* JADX INFO: renamed from: ﾇ */
                    public final void mo304() {
                        f3135 = (f3134 + 119) % 128;
                        if (ar.m468().mo496(m3065(MotionEvent.axisFromString("") + 1713044022, (-67871959) - KeyEvent.getDeadChar(0, 0), KeyEvent.getDeadChar(0, 0) - 14, (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1)).intern(), strM2831)) {
                            return;
                        }
                        f3135 = (f3134 + 47) % 128;
                        s.m3055(s.this);
                    }
                });
                ar.m468().mo499(new ax() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ax
                    /* JADX INFO: renamed from: ﾇ */
                    public final void mo304() {
                        ar.m468().mo493(s.m3016(s.this));
                    }
                });
                s.m3036(s.this, applicationContext);
                s sVar2 = s.this;
                s.m3033(sVar2, new ai(applicationContext, s.m3021(sVar2), s.m3043(s.this), this.f3115 != null, strM2831, new r() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.r
                    public void onEvent(final String str) {
                        p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.2.1

                            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                            private static int f3126 = 1;

                            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                            private static char[] f3127 = {'e', 'v', 'n', 't', 's', 'd', 'r', '.', 'o', 'A', 'p', 'E', ':', 'f', 'g', 'h'};

                            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                            private static int f3128 = 0;

                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            private static char f3129 = 4;

                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* JADX INFO: renamed from: ｋ */
                            public final void mo254() {
                                f3128 = (f3126 + InterfaceC0435l1.d.b.f29112i) % 128;
                                s.m3019(s.this).m645(m3064("\u0001\u0002\u0001\u0003\u0000\u0007\u0001\u0003\u0004\u0001\u0007\u0004\n\u0000\n\u000b\u000b\b\u0002\u0001\u0003\u0000´", (byte) (122 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 23 - Color.red(0)).intern(), Collections.singletonList(str));
                                int i10 = f3128 + 23;
                                f3126 = i10 % 128;
                                if (i10 % 2 == 0) {
                                    throw null;
                                }
                            }

                            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                            private static String m3064(String str2, byte b10, int i10) {
                                String str3;
                                Object charArray = str2;
                                if (str2 != null) {
                                    charArray = str2.toCharArray();
                                }
                                char[] cArr = (char[]) charArray;
                                synchronized (j.f2647) {
                                    try {
                                        char[] cArr2 = f3127;
                                        char c4 = f3129;
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
                                        str3 = new String(cArr3);
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                return str3;
                            }
                        });
                    }
                }));
                if (!this.f3119.isUserIdSet()) {
                    s.m3021(s.this).m545();
                    userId = s.m3017(s.this).m378();
                }
                if (s.this.m3059()) {
                    s.m3017(s.this).m380(new ae() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.ae
                        public void onEventReceived(JSONObject jSONObject) {
                            ix.m2568(s.m3012(s.this), is.f2573, jSONObject, new Object[0]);
                        }
                    });
                }
                s.m3017(s.this).m387(new jm.d() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.10
                    @Override // com.ironsource.adqualitysdk.sdk.i.jm.d
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo2681() {
                        s.m3055(s.this);
                    }
                });
                ba baVar = new ba();
                s sVar3 = s.this;
                s.m3022(sVar3, new av(s.m3016(sVar3), s.m3017(s.this), strM2831, baVar, new ISAdQualityInitListener() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.9
                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
                        s.m3050(s.this, iSAdQualityInitError, str);
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitSuccess() {
                        s.m3014(s.this);
                    }
                }));
                s.m3019(s.this).m643(new ISAdQualityAdListener() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.7
                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adClosed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (s.m3010(s.this) != null) {
                            s.m3010(s.this).adClosed(str, iSAdQualityAdType);
                        }
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adDisplayed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (s.m3010(s.this) != null) {
                            s.m3010(s.this).adDisplayed(str, iSAdQualityAdType);
                        }
                    }
                });
                s sVar4 = s.this;
                s.m3042(sVar4, new ak(s.m3019(sVar4)));
                s sVar5 = s.this;
                s.m3034(sVar5, new aj(s.m3017(sVar5)));
                String strIntern2 = m3062("䅕촭姿\ue476瀁ﲩ\u0b53韫⎅긂㫲䚠", 35933 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m3062("䅝옞俧흻尡\ue5dc浣\uf217箵荁ࠗ醔\u197c黚⟪꽐㓰붜씤䫻펉嬷\ue0d5構\uf12a益\ufe6cݗ賝ᑳ鴖⋩ꨔ", 34650 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern());
                sb3.append(s.m3043(s.this).m431());
                m.m2963(strIntern2, sb3.toString());
                s sVar6 = s.this;
                Context context = this.f3115;
                if (context == null) {
                    context = applicationContext;
                }
                s.m3037(sVar6, context, userId);
                s.m3030(s.this, applicationContext);
                s.m3008(s.this);
                s.m3009(s.this);
            } catch (Throwable th2) {
                String strIntern3 = m3062("䅑੭흰ꁚ浊㘃茿䰷ᤥ\ue203꼓砌염軲寴ⓘ\uf1ca뫈߲킌鶛暲㎂ﲸ䡩ᕦ\ude66ꭔ瑔셒詾園‰\ued34", 19211 - Color.red(0)).intern();
                kl.m2893(m3062("䅕촭姿\ue476瀁ﲩ\u0b53韫⎅긂㫲䚠", ((Process.getThreadPriority(0) + 20) >> 6) + 35933).intern(), strIntern3, th2, true, false, true);
                s.m3050(s.this, ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern3);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class AnonymousClass3 implements ax {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        final /* synthetic */ boolean f3146;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final /* synthetic */ boolean f3147;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ String f3148;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ Context f3149;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final /* synthetic */ boolean f3150;

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$3$3, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class C00633 extends je {

            /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$3$3$3, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public class C00643 extends je {

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static int f3152 = 1;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static int f3153 = 0;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static int f3154 = 105;

                public C00643() {
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m3066(String str, int i10, boolean z10, int i11, int i12) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (d.f1625) {
                        try {
                            char[] cArr2 = new char[i10];
                            d.f1622 = 0;
                            while (true) {
                                int i13 = d.f1622;
                                if (i13 >= i10) {
                                    break;
                                }
                                d.f1624 = cArr[i13];
                                cArr2[d.f1622] = (char) (d.f1624 + i11);
                                int i14 = d.f1622;
                                cArr2[i14] = (char) (cArr2[i14] - f3154);
                                d.f1622 = i14 + 1;
                            }
                            if (i12 > 0) {
                                d.f1623 = i12;
                                char[] cArr3 = new char[i10];
                                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                                int i15 = d.f1623;
                                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                                int i16 = d.f1623;
                                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                            }
                            if (z10) {
                                char[] cArr4 = new char[i10];
                                d.f1622 = 0;
                                while (true) {
                                    int i17 = d.f1622;
                                    if (i17 >= i10) {
                                        break;
                                    }
                                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                                    d.f1622 = i17 + 1;
                                }
                                cArr2 = cArr4;
                            }
                            str2 = new String(cArr2);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return str2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    s.m3004(s.this).m2675(m3066("\b�\u0003ￊ\u0002\u0005\u000e\u000f\u0010\uffef\u0001\u0001\n\u0002", TextUtils.getOffsetAfter("", 0) + 14, false, 205 - (ViewConfiguration.getLongPressTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 13).intern(), new jm.e() { // from class: com.ironsource.adqualitysdk.sdk.i.s.3.3.3.3

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static int f3156 = 0;

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static long f3157 = -1296698730471629185L;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f3158 = 1;

                        @Override // com.ironsource.adqualitysdk.sdk.i.jm.e
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo2682(String str) {
                            f3158 = (f3156 + 35) % 128;
                            final boolean zIsEmpty = TextUtils.isEmpty(str);
                            if (zIsEmpty) {
                                s.m3004(s.this).m2673(m3067("腿䐦\uec54吇脙騵僋켝\uf8ad᰻\udac7䄌狴阥峱\udb17\uecee࠻", -ImageFormat.getBitsPerPixel(0)).intern(), m3067("ꊭ\ud944햶䷅ꋋݚ椤훋\udb34", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1).intern(), null);
                                f3156 = (f3158 + 55) % 128;
                            }
                            p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.s.3.3.3.3.4

                                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                private static long f3160 = -1851680677857323716L;

                                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                                private static int f3161 = 1;

                                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                                private static int f3162;

                                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                                private static String m3068(String str2, int i10) {
                                    String str3;
                                    Object charArray = str2;
                                    if (str2 != null) {
                                        charArray = str2.toCharArray();
                                    }
                                    char[] cArr = (char[]) charArray;
                                    synchronized (i.f2435) {
                                        try {
                                            i.f2436 = i10;
                                            char[] cArr2 = new char[cArr.length];
                                            i.f2434 = 0;
                                            while (true) {
                                                int i11 = i.f2434;
                                                if (i11 < cArr.length) {
                                                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f3160);
                                                    i.f2434++;
                                                } else {
                                                    str3 = new String(cArr2);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    return str3;
                                }

                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* JADX INFO: renamed from: ｋ */
                                public final void mo254() {
                                    String strIntern;
                                    f3162 = (f3161 + 69) % 128;
                                    ai aiVarM3017 = s.m3017(s.this);
                                    String strIntern2 = m3068("ᕈ粍웡⠖뉖\u0590濎", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 27073).intern();
                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                    if (anonymousClass3.f3150) {
                                        strIntern = anonymousClass3.f3148;
                                        if (strIntern != null) {
                                            f3161 = (f3162 + 59) % 128;
                                        } else {
                                            strIntern = m3068("ᕒ뛎剞ￅ", 41863 - TextUtils.getCapsMode("", 0, 0)).intern();
                                        }
                                    } else {
                                        strIntern = null;
                                    }
                                    av avVarM3019 = s.m3019(s.this);
                                    new ha(s.m3012(s.this));
                                    s.m3012(s.this);
                                    aiVarM3017.m385(strIntern2, kb.m2778(strIntern, avVarM3019, zIsEmpty, s.m3021(s.this)));
                                    AnonymousClass3 anonymousClass4 = AnonymousClass3.this;
                                    if (anonymousClass4.f3146) {
                                        int i10 = f3161 + 29;
                                        f3162 = i10 % 128;
                                        int i11 = i10 % 2;
                                        s.m3017(s.this).m382();
                                        if (i11 != 0) {
                                            throw null;
                                        }
                                    }
                                }
                            });
                        }

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static String m3067(String str, int i10) {
                            String str2;
                            Object charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (g.f2127) {
                                try {
                                    char[] cArrM2229 = g.m2229(f3157, cArr, i10);
                                    g.f2129 = 4;
                                    while (true) {
                                        int i11 = g.f2129;
                                        if (i11 < cArrM2229.length) {
                                            int i12 = i11 - 4;
                                            g.f2128 = i12;
                                            cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f3157));
                                            g.f2129 = i11 + 1;
                                        } else {
                                            str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return str2;
                        }
                    });
                    f3152 = (f3153 + 15) % 128;
                }
            }

            public C00633() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                if (anonymousClass3.f3147) {
                    s.m3019(s.this).m647(AnonymousClass3.this.f3149, new C00643());
                }
            }
        }

        public AnonymousClass3(boolean z10, Context context, boolean z11, String str, boolean z12) {
            this.f3147 = z10;
            this.f3149 = context;
            this.f3150 = z11;
            this.f3148 = str;
            this.f3146 = z12;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ax
        /* JADX INFO: renamed from: ﾇ */
        public final void mo304() {
            p.m2996(new C00633());
        }
    }

    static {
        m3020();
        f3091 = null;
        f3089 = (f3090 + 87) % 128;
    }

    private s() {
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static /* synthetic */ aj m3002(s sVar) {
        int i10 = (f3090 + 33) % 128;
        f3089 = i10;
        aj ajVar = sVar.f3092;
        f3090 = (i10 + 35) % 128;
        return ajVar;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static /* synthetic */ Set m3003(s sVar) {
        int i10 = f3089 + 37;
        f3090 = i10 % 128;
        int i11 = i10 % 2;
        Set<ISAdQualityInitListener> set = sVar.f3096;
        if (i11 != 0) {
            return set;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static /* synthetic */ jm m3004(s sVar) {
        int i10 = f3090;
        f3089 = (i10 + 7) % 128;
        jm jmVar = sVar.f3095;
        int i11 = i10 + 13;
        f3089 = i11 % 128;
        if (i11 % 2 == 0) {
            return jmVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3007(s sVar) {
        int i10 = f3089 + 83;
        f3090 = i10 % 128;
        if (i10 % 2 == 0) {
            sVar.m3006();
            throw null;
        }
        boolean zM3006 = sVar.m3006();
        f3089 = (f3090 + 53) % 128;
        return zM3006;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static /* synthetic */ void m3008(s sVar) {
        int i10 = f3089 + 95;
        f3090 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m3039(true);
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ void m3009(s sVar) {
        f3089 = (f3090 + 1) % 128;
        sVar.m3026(false);
        int i10 = f3090 + 63;
        f3089 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static /* synthetic */ ISAdQualityAdListener m3010(s sVar) {
        int i10 = f3090 + 67;
        f3089 = i10 % 128;
        int i11 = i10 % 2;
        ISAdQualityAdListener iSAdQualityAdListener = sVar.f3098;
        if (i11 == 0) {
            return iSAdQualityAdListener;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ Context m3012(s sVar) {
        int i10 = (f3090 + 49) % 128;
        f3089 = i10;
        Context context = sVar.f3103;
        f3090 = (i10 + 63) % 128;
        return context;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ void m3014(s sVar) {
        f3089 = (f3090 + 87) % 128;
        sVar.m3011();
        int i10 = f3090 + InterfaceC0435l1.d.b.f29112i;
        f3089 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 16 / 0;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ jh m3016(s sVar) {
        int i10 = f3090;
        f3089 = (i10 + 91) % 128;
        jh jhVar = sVar.f3094;
        f3089 = (i10 + 95) % 128;
        return jhVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ ai m3017(s sVar) {
        int i10 = f3090;
        f3089 = (i10 + 53) % 128;
        ai aiVar = sVar.f3099;
        f3089 = (i10 + 87) % 128;
        return aiVar;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static void m3020() {
        char[] cArr = new char[1987];
        f2.v("3Åñê·§uw;\tøð¾Ó|\u0093\"Mà%¥çk\u0098)´ïv\u00adDRþ\u0010²Ö`\u0094BZ\n\u001fÉÝ¹\u0083kA5\u0007\u0011Ä\u0081\u008a\u008dHt\u000e.3ùñß·\u009fuX;yøç¾Á|\u009f\"\u0005à?¥êk·)\u0085ï\u001e\u00ad\tRõ\u0010ýÖe\u0094QZ\\\u001fÝÝ¯\u0083sA-\u0007UÄã\u008a\u008cH`\u000e(3øñÒ·\u0094uT;uøÆ¾¼|\u0089\"Jà:¥ûk¤)\u0086ïV\u00ad\u000bRÿ\u0000AÂQ\u0084;Fê\bµËe\u008dWO\u0007\u0011ÑÓ\u008e\u0096VX\f\u0000CÂT\u0084\u0004F¸\b Ë)\u008dWO\u001d\u0011ÁÓ©\u0096{X&\u001a\u0010ÜØ\u009e\u009ca~#på¨§\u009ai¡,Kîy°ïr§4Ø÷C¹\u0007{ã=»\u0000nÂD\u0084\u0000FÓ\bõËY\u008d{O?\u0011ÚÓþ\u0096cX:\u001a\u0018ÜÁ\u009e\u0082ar#%å¦§Òi\u009e,\u0005î.°çr¡4Ù÷O¹\u0013{è\u0000CÂT\u0084\u0004F¸\b Ë)\u008dWO\u001d\u0011ÁÓ©\u0096{X&\u001a\u0010ÜØ\u009e\u009ca~#på¨§\u009ai¦,wî\u0018°êr\u00924\u008d÷L¹\u000e{þ=¸\u0000xÂ\u0016\u00848Fä\b\u009eË*\u008dHO\u0015\u0011ÚÓþ\u0096`X \u001a\bÜÆ\u009e\u0083as#&åè§\u0095\u0000IÂf\u0084+Fû\b\u0085Ë|\u008d_O\u001f\u0011ÁÓ©\u0096kX\u0014\u001a8Üú\u009eÈar#>åì§Îi\u0086,Eî5°çr¹4\u009d÷\r¹\u0003{û=¾\u0000dÂW\u0084\u000fFÙ\bõËi\u008d^O\u0018\u0011ÅÓ»\u0096w\u0019çÛÈ\u009d\u0085_U\u0011+ÒÒ\u0094ñV±\boÊ\u0007\u008fÅAÉ\u0003\u0081Å[\u0087\u0003x\u0095:\u0097üE¾}p55ã÷\u0096©Lk\u0004-,îæ ìbT$\u0007\u0019ÛÛð\u009dª_j\u0011[ÒÇ\u0094ðV´\b'Ê\u0012\u008fØAÆ\u0003¶Åd\u0087,xÑ:\u008aü\\¾pp:5«÷\u009b©Ok\u0006-.î  ¢bX$\u0000\u0019É\u0087NEY\u0003\tÁµ\u008f\u00adL$\nZÈ\u0010\u0096ÌT¤\u0011vß+\u009d\u001d[Õ\u0019\u0091æs¤}bÁ äî£«Mi\u00057öõ¯³\u0099pI>\u001büãºá\u0087_E\u007f\u0003-Á\u008d\u008f¯Ln\nFÈ\u0011\u0096\u0084T½\u0011kß)\u009d\u001c[\u009f\u0019\u0085æc¤|bî Ûî\u008d«\\i.7¢õ¼³\u0087pF>\u001cüµº©\u0087kE\u0014Èö\náL±\u008e\rÀ\u0015\u0003\u009cEâ\u0087¨Ùt\u001b\u001c^Î\u0090\u0093Ò¥\u0014mV)©ËëÅ-\u001do/¡;äá&\u009cxpº\u0013ü4?¸q´³Cõ\u0017È\u0093\n÷Lþ\u008ewÀ\u0005\u0003\u009fEä\u0087´Ùp\u001b\u0007^\u0086\u0090\u0092Òº\u0014'V7©Äë\u0094-Gow¡k\u0000IÂf\u0084+Fû\b\u0085Ë|\u008d_O\u001f\u0011ÁÓ©\u0096kX\u0014\u001a8Üú\u009eÆal#1åö§\u009ai\u008e,Hî+°ër¢4\u009c÷T¹B{ä=¤\u0000tÂB\u0084\u000fFÏ\b¢Ëd\u008d\u0011Ç$\u0005\u000bCF\u0081\u0096Ïè\f\u0011J2\u0088rÖ¬\u0014ÄQ\u0006\u009fyÝU\u001b\u0097Y«¦\u0001ä\\\"\u009b`÷®ìë,)Bw\u0086µÜóµ0)~a¼\u0093úÕÇ\u0005\u0005:Cj\u0081¤ÏÂ\f\u0002J6\u00889Öé\u0014\u0093Q\u0010\u009fJÝ0\u001b±Yï¦\u0014äX\"Ë`¢®òëh)Dw\u008aµÜóà0'~a¼\u0082úÎÇA\u008c\u0094N»\böÊ&\u0084XG¡\u0001\u0082ÃÂ\u009d\u001c_t\u001a¶Ôº\u0096òP(\u0012píæ¯úi9+\u0014å\u0012 \u008abì<&þj¸A{\u009f5È÷$\u008aVH%\u000enÌ\u0086\u0082ÏA_\u0007\tÅa\u009b\u008fYÞ\u001c\u0005Ò]\u0090cV³\u0014éëM©Vo\u009f-\u00adãí¦4d@:\u008aøØ\u009dØ_û\u0019³ÛB\u0095\u001aVÐ\u0000sÂQ\u0084\u0001\u0000s\u0000tÂE\u00845Fë\b§\u0000sÂZ\u0084\u0005Fò\b¸Ëh\u0000 ÂB\u0084\u0003Fë\b¼Ë)\u008dLO\u0016\u0011ÉÓ®\u0096}X)\u001aFÜ\u0091\u0000EÂG\u0084\u0018Fð\b¦Ë)\u008dMO\u001b\u0011ÝÓ©\u0096fX.\u001a\u0012ÜÖ\u009eÆa\u007f#?åò§ÔðÚ2Øt\u0087¶oø9;¶}Ò¿\u0089áC#6fä¨¶ê\u0084,\u000en\f\u0091÷Óª\u0015hWl\u0099\u0014Ü\u009by¢»µýå?YqA²Èô¬6÷h=ª\u001cï\u009e!Ãcé¥1ç'\u0018\u009eZÐ\u009c\u0010Þ:\u0010.Uè\u0097\u0098É&\u000bqMX\u008e¨ÀÒ\u0002\u0003DLy\u008c»¾ýþ?8q\u0014²¸ô\u009a6ÞhhªHï\u0093!Úc¼¥ çn\u0018\u0088ZÄ\u009c\u0003Þ5\u0010fUª\u0097\u0095\u0000YÂZ\u0084\u001fF¿\b¹Ë|\u008dMO\u0007\u0011\u0088Ó´\u0096|X.\u001a\bÜØ\u009e\u0087aw#9åÿ§ßiÏ,mî\n°Ïr§4©÷X¹\u0003{û=¥\u0000uÂO\u0084KFó\b\u0091ËA\u008d\u001fO\u0016\u0011ÌÓ¸\u0096|X:\u001a\u0018Ü\u0092\u009e\u0084a}#=åê§Òi\u009e,Bîz°¨r·4\u009c÷Z¹.{ý=¹\u0000cÂs\u0084\rFÕ\b·Ë,\u0017\\Õ\u007f\u00931Qý\u001f\u009eÜR\u009apX\u0018\u0006æÄ\u0086\u0081\\O@\rs\u0000 Â\u0019\u0084JF£\b¦Ël\u008dZO\u0012\u0011ËÓ©\u0096wX#\u001aBÜ\u0091\u009eÏa;#<åì§×i\u0086,Pî<°êrã4\u008c÷B¹B\u0000 ÂX\u0084\u000fFë\bµË)\u008dZO\u0012\u0011ÜÓ¼\u00962X1\u001a\u001dÜÝ\u009e\u0093a~##å«§\u009ai¦,Cî7°ár±4\u0091÷C¹\u0005{·=¡\u0000dÂB\u0084\nF\u0080\b±Ëk\u008dKO\u0015\u0011\u0089Ó¨\u0096rX$\u001a\bÜ×\u009eÉ\u0000 Â\u0019\u0084JF£\b¦Ël\u008dZO\u0012\u0011ËÓ©\u0096wX#\u001aBÜ\u0091\u009eÏa;#$åí§ßiÏ,Hî<°àr¤4\u008c÷E¹B{ø=ª\u0000!ÂT\u0084\u0004FÔ\b½Ë*\u008dKO\u001c\u0011ÌÓþ\u0096xX-\u001a\u0004Ü\u0092\u009e\u0086ar#5å¦§Ïi\u0098,@îz°ùr¥4\u0095÷[¹\u0006{¸=¾\u0000jÂX\u0084\u0019FÍ\b²Ë+\u008d\"O\u0010\u0011\u008aÓ½\u0096qX=\u001a\tÜÖ\u009e\u008das#r]¢\u009fÖÙ\u0086\u001byUv\u0000 ÂV\u0084\u0002Fþ\b¦Ëh\u008d]O\u0007\u0011ÍÓ¯\u0096aXi¦§d\u0086\"Üà>®Ym¨+\u0089éÒ·\tuf0¯þû¼ñz\u00178[Ç¢\u0085çC9\u0000EÂG\u0084\u0018Fð\b¦Ë)\u008dMO\u0016\u0011ÜÓ©\u0096{X)\u001a\u001bÜ\u0091\u009e\u008ba~#$åä§\u009ai\u008b,Eî-°ïrãá\u009f#\u0088eØ§dé|*õl\u0081®Çð\u00152ow©¹þû\u0080=\u0018\u007fI\u0080¢Âþ\u0004yF\u000f\u0088WÍØ\u000f¨Qr\u0093VÕw\u0016°XÚ\u009a\u001aÜeá¼#\u0086eÞ§\bép*öl°®ìð>2\"w¸¹õûÒ=N\u007fH\u0080¨Âø\u0004.F\u0003\u0088CÍ\u008e\u000fèQ}\u0000YÂZ\u0084\u001fF¿\b¹Ë|\u008dMO\u0007\u0011\u0088Ó´\u0096|X.\u001a\bÜØ\u009e\u0087aw#9åÿ§ßiÏ,mî\n°Ïr§4©÷X¹\u0003{û=¥\u0000uÂO\u0084KFó\b\u0091ËA\u008d\u001fO\u0016\u0011ÌÓ¸\u0096|X:\u001a\u0018Ü\u0092\u009e\u0084a}#=åê§Òi\u009e,Bîz°¨r§4\u0091÷O¹\r{ÿ=¨\u0000WÂD\u0084\tFÓ\b\u009fËo\u008dg¾$|::wøÕ¶Ëu\u001031ñk¯âmÞ(\u001cæ\r¤ubº âßV\u009dN[Ï\u0019²×à\u0092nP]\u000e\u0091ÌÅ\u008aþIg\u0007gÅ\u008f\u0083\u0086¾\u000e|1:qø¾¶Æ\u0000EÂg\u00848FÐ\b\u0086Ë(\u008d\u001eO\u0006\u0011ÛÓ¸\u0096`Xg\u001a5Üõ\u009eÆar##å¥§Ôi\u009a,Hî5° rã4¨÷A¹\u0007{ö=¿\u0000dÂ\u0016\u0084\u0006FÁ\b¾Ëo\u008d\u001fO\u0007\u0011ÜÓ¬\u0096vXh\u001a\tÜÝ\u009eÇal#0åõ§ÈiÐ,Dîz°ùr¥4\u0095÷G¹\u0007{¸=£\u0000mÂY\u0084AFÏ\b£Ëg\u008d,OU\u0011ßÓ¬\u0096qX;\u001a^Üú\u009e¬a=#&åè§\u009ci¸,uî\u001a°ôr\u00944\u008f÷N¹\b{ð=º\u0000zÂ\u0018\u0084>Fæ\b\u009cË\"\u0085¯G\u0095\u0001ÝÃ%\u008drN®\b\u009eÊÚ\u0094KVj\u0013³Ýü\u009f\u009fY\b\u001bIä»¦ê\u0000EÂg\u00848FÐ\b\u0086Ë(\u008d\u001eO*\u0011ÇÓ¨\u00965X5\u001a\u0019Ü\u0091\u009e\u0093ah#9åë§ÝiÏ,Pî1°ërã4\u009c÷H¹\u0004{ö=¹\u0000mÂB\u0084KFÕ\b¦Ëo\u008dMOT\u0011àÓ\u009a\u00963P*\u0092\u0011Ô>\u0016÷Xµ\u009blÝI\u001f\u0012A\u008c\u0083´Æw\b(J\u001d\u008c\u0095Î\u00911js&µä÷\u009e9\u009f|O¾}àú\"¦d\u008f§ZéF+òmèPp\u0092\\Ô\u0006\u0016ÕX¤\u009bkÝ\u001b\u001f\u0005AÞ\u0083¿Æe\blJ0\u008còÎÃ1~s:µð÷\u009f9\u0091|@¾=àã\"àd\u0088§Yé\u0002+îméPr\u0092\\ÔH\u0016ìX\u0081\u009bNÝ \u001f AÛ\u0083ºÆ|\b$J\u000e\u008cÎÎÌ1Js\u0012µÈ÷\u0096X\u00ad\u009a®Üë\u001e\u0019P\u0000\u0093´Õ\u0099\u0017ÆI8\u008bxÎ\u0093\u0000ÒBä\u0084,Æf9\u0096{\u0084½\"ÿ\n1Ptð¶Øè\t*Rl~¯ùáß#'e\u0018X\u009c\u009a±Ü¥\u001et½O\u007f\u007f95ûîµ\u0093vI0yò)¬Ùn\u0091+På\u0006§0\u0000iÂ[\u0084\u001eF±\b§Ël\u008dMO\u0000\u0011áÓ¹¬ñnÂ(\u008eêy¤4gî!Úã\u0095½F\u007fv:üô´¶×pP2\u0001Í°\u008f´In\u000b^Å\u0006\u0080ØB¨\u001cbÞ%\u0098\u000e\u0000sÂZ\u0084\u0005Fò\b¸Ëh\u008d\u0013O\u0000\u0011ÍÓ¾\u0096`X\"\u001a\bÜ\u009c\u009eÒaz#>åä§Öi\u0096,Pî0°ír°ÿ?=({x¹Ä÷Ü4Ur1°jî ,\u0081i\u0007§Uåt#¨aè\u009e\tÜM\u001a\u0095Xæ\u0096çÓ=\u0011VO\u0086\u008d\u009fËé\b>Fz\u0084\u008eÂ\u0090ÿP=j{^¹\u008f÷è4\u0012r\u0012°}î´,Îi\u0006§@åx#îaÈ\u009e$Üf\u001aÚX°\u0096íÓ*\u0011\u0006O\u0080\u008dÐËð\b&F{\u0084\u008bÂÆÿ\u0010=e\u0000MÂ@\u0084\u0019Fë\bôËz\u008d[O\u0007\u0011\u0088Ó´\u0096|X3\u001a\u0019ÜÃ\u009e\u0088az#<å¥§Îi\u008a,Wî-°®r®4\u0097÷I¹\u0007{·=®\u0000dÂP\u0084\u0004FÒ\b°Ë*\u008dVO\u001a\u0011ÀÓª\u0096zX)\u001a\u0011ÜÛ\u009e\u009dau#?åá§\u009a\u0000aÂ[\u0084\u000eFí\b»Ë`\u008dZO]\u0011ÁÓ³\u0096fX\"\u001a\u0012ÜÅ\u009eÈaz#3åñ§Ói\u0080,Jîw°Ìr\u00824¬÷y¹'{Å=\u0095\u0000^Âu\u0084#Fá\b\u009bËM\u008dzO0\u0000FÂT\u0084\u0003Fó\b±Ëm\u008d\u001eO\u0007\u0011ÇÓý\u0096`X\"\u001a\u001bÜØ\u009e\u0095ao#5å÷§\u009ai\u008d,Eî-°úr¦4\u008a÷T¹B{å=©\u0000bÂS\u0084\u0002FÖ\b°ËxI`\u008bwÍ'\u000f\u009bA\u0083\u0082\nÄn\u00065Xÿ\u009aÞßP\u0011\u0000S\u007f\u0095þ×¬(Kj\u0007¬Ãî÷ ©eu§Zù\u0080;À}\u0092¾]ð\u00002Ðt¾IW\u008btÍ$\u000fêA\u0082\u0082PÄ<\u0006\u0004XÎ\u009a¶ß\u0010\u0011\u001cS?\u0095â×ä(Lj\u001a¬Ðîì ·ei§\u000eùÂ;É\u0003áÁö\u0087¦E\u001a\u000b\u0002È\u008b\u008eïL´\u0012dÐ\u001b\u0095\u0090[\u0086\u0019«ß`\u009d0bÖ \u009fæ\u0007¤uj(/âí\u0092³Mq\u001573ôàº®x\u0015>\u001c\u0003ÆÁâ\u0087¬El\u000b\u0002ÈÍ\u008e½Lû\u0012+Ð5\u0095â[«\u0019»ßA\u009d0bß \u009fæM¤mj+/§í«³iq-7{ôûº xI>O\u0003ÓÁý\u0087»Ew\u000b\u0010ÈÆ\u008e\u0095L¹\u0012&~M¼Zú\n8¶v®µ'óC1\u0018oÈ\u00ad·è<&*d\u0007¢Ìà\u009c\u001fz]3\u009b«ÙÙ\u0017\u0084RN\u0090>Îá\f¹J\u009f\u0089LÇ\u0002\u0005¹C°~j¼Nú\u00008Àv®µaó\u00111Wo\u0087\u00ad\u0099èN&\u0007d\u0017¢íà\u009c\u001fs]3\u009báÙÁ\u0017\u0087R\u000b\u0090\u0007ÎÅ\f\u0081J×\u0089IÇ\u001e\u0005¶C\u00ad~c¼MúB8Æv¶µló:1\u0012oÅ\u00ad½ès&=d\u0015¢ÙàÈ\u0000CÂT\u0084\u0004F¸\b Ë)\u008dMO\u0016\u0011ÜÓý\u0096aX\"\u001a\u001bÜÜ\u009e\u0083au#$å¥§\u0097iÏ,mî\n°Ïr§4©÷X¹\u0003{û=¥\u0000uÂO\u0084KFó\b\u0091ËA\u008d\u001fO\u0003\u0011ÈÓ\u00ad\u00963X;\u001a\u0015ÜÇ\u009e\u0093ax#>åñ§ÕiÞ\u0000CÂT\u0084\u0004F¸\b Ë)\u008dMO\u0016\u0011ÜÓý\u0096qX(\u001a\u0012Ü×\u009e\u008fa|#på¨§\u009ai¦,wî\u0018°êr\u00924\u008d÷L¹\u000e{þ=¸\u0000xÂ\u0016\u00848Fä\b\u009eË*\u008dHO\u0015\u0011ÚÓþ\u0096`X \u001a\bÜÆ\u009e\u0083as#&åè§\u0095\u0014ãÖô\u0090¤R\u0018\u001c\u0000ß\u0089\u0099í[¶\u0005|Ç]\u0082ÑL\u0088\u000e²Èw\u008a/uÜ7Ðñ\b³:}\u00068×ú¸¤Jf2 -ãì\u00ad®o^)\u0018\u0014ØÖ¶\u0090\u0098RD\u001c>ß\u008a\u0099ö[§\u0005)Ç\u001f\u0082ßL\u009a\u000e¸Ès\u008a#uÅ7ÑñO³u}98ñú\u0093¤Nf\b 0ãô\u00ad¦o\\)C\u0000iÂR\u0084\u0004Fð\b¦Ël\u008daO\u0003\u0011ÚÓ¸\u0096MX.\u001a\u0012ÜØ\u009e\u0092aD#3åê§Ôi\u0089,Mî>", "ISO-8859-1", cArr, 0, 1987);
        f3087 = cArr;
        f3088 = 3119417411248898613L;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ as m3021(s sVar) {
        int i10 = f3090 + InterfaceC0435l1.d.b.f29109f;
        f3089 = i10 % 128;
        if (i10 % 2 != 0) {
            sVar.m3015();
            throw null;
        }
        as asVarM3015 = sVar.m3015();
        int i11 = f3090 + 67;
        f3089 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 70 / 0;
        }
        return asVarM3015;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ jj m3027(s sVar) {
        int i10 = f3090 + 13;
        int i11 = i10 % 128;
        f3089 = i11;
        int i12 = i10 % 2;
        jj jjVar = sVar.f3100;
        if (i12 != 0) {
            throw null;
        }
        int i13 = i11 + 117;
        f3090 = i13 % 128;
        if (i13 % 2 != 0) {
            return jjVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ ai m3033(s sVar, ai aiVar) {
        int i10 = f3089;
        int i11 = i10 + InterfaceC0435l1.d.b.f29107d;
        f3090 = i11 % 128;
        int i12 = i11 % 2;
        sVar.f3099 = aiVar;
        if (i12 == 0) {
            throw null;
        }
        f3090 = (i10 + 73) % 128;
        return aiVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Context m3041(s sVar, Context context) {
        int i10 = (f3089 + 65) % 128;
        f3090 = i10;
        sVar.f3103 = context;
        f3089 = (i10 + 125) % 128;
        return context;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m3055(s sVar) {
        int i10 = f3090 + 27;
        f3089 = i10 % 128;
        sVar.m3032(i10 % 2 == 0);
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void changeUserId(String str) {
        String str2;
        Exception exc;
        boolean z10;
        try {
            if (!m3052(str)) {
                return;
            }
            if (str.equals(m3015().m549())) {
                z10 = false;
            } else {
                f3089 = (f3090 + 123) % 128;
                z10 = true;
            }
            boolean zMo2735 = jt.m2734().mo2735();
            if (z10 && zMo2735) {
                try {
                    this.f3099.m379();
                    f3089 = (f3090 + 53) % 128;
                } catch (Exception e10) {
                    exc = e10;
                    str2 = str;
                }
            }
            str2 = str;
            try {
                m3029(this.f3103, str2, z10, true, zMo2735);
                return;
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            str2 = str;
        }
        exc = e;
        kl.m2893(m3028(11 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), Process.getGidForName("") + 75).intern(), f2.k(m3028(21 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (61598 - TextUtils.lastIndexOf("", '0', 0, 0)), 600 - (ViewConfiguration.getJumpTapTimeout() >> 16)), str2, new StringBuilder()), exc, true, false, true);
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str) throws Throwable {
        f3090 = (f3089 + 63) % 128;
        initialize(context, str, null);
        f3090 = (f3089 + 67) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        f3089 = (f3090 + 49) % 128;
        if (!m3060()) {
            if (m3006()) {
                this.f3093.m423(iSAdQualityCustomMediationRevenue);
                return;
            } else {
                m.m2968(m3028(12 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 74).intern(), m3028(Color.blue(0) + 73, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 32270), TextUtils.lastIndexOf("", '0') + 1738).intern());
                return;
            }
        }
        m.m2968(m3028(12 - TextUtils.getOffsetBefore("", 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 73 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), m3028(67 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (930 - (ViewConfiguration.getScrollBarSize() >> 8)), KeyEvent.keyCodeFromString("") + 1670).intern());
        int i10 = f3090 + 89;
        f3089 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setAdListener(ISAdQualityAdListener iSAdQualityAdListener) {
        if (m3060()) {
            f3089 = (f3090 + 121) % 128;
            m.m2968(m3028(12 - (Process.myPid() >> 22), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 74 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), m3028(Process.getGidForName("") + 54, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 18724), (-16775599) - Color.rgb(0, 0, 0)).intern());
            return;
        }
        this.f3098 = iSAdQualityAdListener;
        int i10 = f3090 + 19;
        f3089 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 83 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setConfig(ISAdQualityConfig iSAdQualityConfig) {
        f3090 = (f3089 + 51) % 128;
        if (m3060()) {
            m.m2968(m3028(13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 74 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), m3028(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 49, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 1859 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
            return;
        }
        if (!m3005()) {
            this.f3108 = iSAdQualityConfig;
            return;
        }
        f3089 = (f3090 + 93) % 128;
        m.m2968(m3028((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 12, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getEdgeSlop() >> 16) + 74).intern(), m3028(58 - View.resolveSizeAndState(0, 0, 0), (char) (5280 - (ViewConfiguration.getTouchSlop() >> 8)), ExpandableListView.getPackedPositionType(0L) + 1907).intern());
        int i10 = f3089 + 19;
        f3090 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setMetaData(String str, String str2) {
        String strIntern = m3028(Color.red(0) + 12, (char) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 74 - View.resolveSize(0, 0)).intern();
        try {
            if (m3060()) {
                m.m2968(strIntern, m3028(51 - TextUtils.getOffsetAfter("", 0), (char) (31201 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 621 - KeyEvent.keyCodeFromString("")).intern());
                return;
            }
            if (!m3006()) {
                m.m2968(strIntern, m3028(65 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), View.resolveSizeAndState(0, 0, 0) + 672).intern());
                return;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i10 = f3089 + 35;
            f3090 = i10 % 128;
            if (i10 % 2 == 0) {
                TextUtils.isEmpty(str2);
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            if (!am.m434(str)) {
                if (am.m439(m3015().m546(), str)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m3028(14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionType(0L) + 5935), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 735).intern());
                    sb2.append(str);
                    sb2.append(m3028(27 - Color.blue(0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 749).intern());
                    sb2.append(5);
                    sb2.append(m3028((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 44, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 776 - TextUtils.indexOf("", "", 0, 0)).intern());
                    m.m2968(strIntern, sb2.toString());
                    f3090 = (f3089 + 13) % 128;
                    return;
                }
                if (!am.m438(str, str2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m3028(13 - (KeyEvent.getMaxKeyCode() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 5936), 735 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
                    sb3.append(str);
                    sb3.append(m3028(74 - Process.getGidForName(""), (char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 820).intern());
                    sb3.append(1);
                    sb3.append(m3028(5 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (23938 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 895).intern());
                    sb3.append(64);
                    sb3.append(m3028(12 - TextUtils.indexOf("", "", 0, 0), (char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 900 - Color.blue(0)).intern());
                    m.m2968(strIntern, sb3.toString());
                    return;
                }
            }
            m3015().m552(str, str2);
            if (m3028(View.MeasureSpec.makeMeasureSpec(0, 0) + 18, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 42706), 912 - ExpandableListView.getPackedPositionGroup(0L)).intern().equals(str)) {
                m3015().m556(str2);
            }
            f3090 = (f3089 + 3) % 128;
        } catch (Exception e10) {
            kl.m2893(strIntern, f2.k(m3028(MotionEvent.axisFromString("") + 25, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 930 - Color.argb(0, 0, 0, 0)), str, new StringBuilder()), e10, true, false, true);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setSegment(final ISAdQualitySegment iSAdQualitySegment) {
        int i10 = f3090 + 29;
        f3089 = i10 % 128;
        if (i10 % 2 != 0) {
            m3060();
            throw null;
        }
        if (m3060()) {
            m.m2968(m3028((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, (char) ((Process.getThreadPriority(0) + 20) >> 6), 73 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m3028(MotionEvent.axisFromString("") + 50, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1809).intern());
            return;
        }
        p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f3166 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char[] f3167 = {' ', 'F', 'G', 'K', 'f', 'v', 'n', 'j', 'f', 'k', 'c', 'Z', '&', '8', '*', '*', 'N', 'u', 'm', 'm', 'n', 'j', 'p', 'M', 'N', 'p', 'p', 'M', 'N', 'Q', 'N', 'k', 'V', '<', 'M', 'h', 's', 'u', 'n', 'j', 'i', 'r', 'r', 'o', 'o', 'H', 'N', 'u', 'r', 'K', 'M', 'r', 'H', '9', 'K', 'O', B5.U, 'P', 'z', 'r', 'n', 'j', 'o', 'g', '^', 'V', 'N'};

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f3168 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m3069(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
                String str2;
                Object bytes = str;
                if (str != null) {
                    bytes = str.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                synchronized (h.f2261) {
                    try {
                        int i11 = iArr[0];
                        int i12 = iArr[1];
                        int i13 = iArr[2];
                        int i14 = iArr[3];
                        char[] cArr = new char[i12];
                        System.arraycopy(f3167, i11, cArr, 0, i12);
                        if (bArr != null) {
                            char[] cArr2 = new char[i12];
                            h.f2262 = 0;
                            char c4 = 0;
                            while (true) {
                                int i15 = h.f2262;
                                if (i15 >= i12) {
                                    break;
                                }
                                if (bArr[i15] == 1) {
                                    cArr2[i15] = (char) (((cArr[i15] << 1) + 1) - c4);
                                } else {
                                    cArr2[i15] = (char) ((cArr[i15] << 1) - c4);
                                }
                                c4 = cArr2[i15];
                                h.f2262 = i15 + 1;
                            }
                            cArr = cArr2;
                        }
                        if (i14 > 0) {
                            char[] cArr3 = new char[i12];
                            System.arraycopy(cArr, 0, cArr3, 0, i12);
                            int i16 = i12 - i14;
                            System.arraycopy(cArr3, 0, cArr, i16, i14);
                            System.arraycopy(cArr3, i14, cArr, 0, i16);
                        }
                        if (z10) {
                            char[] cArr4 = new char[i12];
                            h.f2262 = 0;
                            while (true) {
                                int i17 = h.f2262;
                                if (i17 >= i12) {
                                    break;
                                }
                                cArr4[i17] = cArr[(i12 - i17) - 1];
                                h.f2262 = i17 + 1;
                            }
                            cArr = cArr4;
                        }
                        if (i13 > 0) {
                            h.f2262 = 0;
                            while (true) {
                                int i18 = h.f2262;
                                if (i18 >= i12) {
                                    break;
                                }
                                cArr[i18] = (char) (cArr[i18] - iArr[2]);
                                h.f2262 = i18 + 1;
                            }
                        }
                        str2 = new String(cArr);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                f3166 = (f3168 + 83) % 128;
                if (!s.m3007(s.this)) {
                    f3166 = (f3168 + 63) % 128;
                    m.m2968(m3069(new int[]{0, 12, 0, 1}, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001", true).intern(), m3069(new int[]{12, 55, 4, 21}, "\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000", true).intern());
                } else if (s.m3002(s.this) != null) {
                    int i11 = f3166 + 43;
                    f3168 = i11 % 128;
                    if (i11 % 2 != 0) {
                        s.m3002(s.this).m411(iSAdQualitySegment);
                    } else {
                        s.m3002(s.this).m411(iSAdQualitySegment);
                        int i12 = 15 / 0;
                    }
                }
            }
        });
        int i11 = f3089 + 89;
        f3090 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    @Deprecated
    public void setUserConsent(boolean z10) {
        int i10 = f3089 + 9;
        f3090 = i10 % 128;
        int i11 = i10 % 2;
        m3015().m562(z10);
        if (i11 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public synchronized void shutdown() {
        f3090 = (f3089 + InterfaceC0435l1.d.b.f29109f) % 128;
        m3032(false);
        int i10 = f3090 + 55;
        f3089 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized boolean m3005() {
        boolean z10;
        int i10 = (f3089 + 87) % 128;
        f3090 = i10;
        z10 = this.f3107;
        f3089 = (i10 + 27) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private synchronized boolean m3006() {
        boolean z10;
        try {
            int i10 = f3090 + 41;
            f3089 = i10 % 128;
            if (i10 % 2 != 0) {
                z10 = this.f3110;
                int i11 = 75 / 0;
            } else {
                z10 = this.f3110;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private void m3011() {
        p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.s.4
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                for (ISAdQualityInitListener iSAdQualityInitListener : s.m3003(s.this)) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitSuccess();
                    }
                }
                s.m3003(s.this).clear();
            }
        });
        f3089 = (f3090 + 47) % 128;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private synchronized boolean m3013() {
        int i10 = f3090;
        boolean z10 = this.f3102;
        int i11 = i10 + 1;
        f3089 = i11 % 128;
        if (i11 % 2 == 0) {
            return z10;
        }
        int i12 = 52 / 0;
        return z10;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private synchronized as m3015() {
        as asVar;
        int i10 = f3090;
        int i11 = i10 + 1;
        f3089 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        asVar = this.f3109;
        f3089 = (i10 + 61) % 128;
        return asVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private JSONObject m3018() {
        f3090 = (f3089 + 77) % 128;
        Map<String, String> mapM546 = m3015().m546();
        if (mapM546 != null && mapM546.containsKey(m3028(13 - Color.argb(0, 0, 0, 0), (char) (View.MeasureSpec.getMode(0) + 48430), 1366 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
            try {
                JSONObject jSONObject = new JSONObject(mapM546.get(m3028((KeyEvent.getMaxKeyCode() >> 16) + 13, (char) (48430 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 1365).intern()));
                int i10 = f3090 + 39;
                f3089 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 78 / 0;
                }
                return jSONObject;
            } catch (JSONException unused) {
            }
        }
        f3089 = (f3090 + 43) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ av m3022(s sVar, av avVar) {
        int i10 = (f3089 + InterfaceC0435l1.d.b.f29105b) % 128;
        f3090 = i10;
        sVar.f3097 = avVar;
        int i11 = i10 + 85;
        f3089 = i11 % 128;
        if (i11 % 2 == 0) {
            return avVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m3030(s sVar, Context context) {
        f3089 = (f3090 + 91) % 128;
        sVar.m3048(context);
        int i10 = f3089 + 67;
        f3090 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ aj m3034(s sVar, aj ajVar) {
        int i10 = (f3090 + 7) % 128;
        f3089 = i10;
        sVar.f3092 = ajVar;
        f3090 = (i10 + 83) % 128;
        return ajVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ ak m3042(s sVar, ak akVar) {
        int i10 = f3089 + 43;
        f3090 = i10 % 128;
        int i11 = i10 % 2;
        sVar.f3093 = akVar;
        if (i11 != 0) {
            return akVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0062 A[PHI: r0
  0x0062: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v10 java.lang.String) binds: [B:8:0x0060, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m3053(Context context) {
        String strM2674;
        int i10 = f3089 + 51;
        f3090 = i10 % 128;
        if (i10 % 2 == 0) {
            strM2674 = this.f3095.m2674(m3028(TextUtils.lastIndexOf("", (char) 11) + 91, (char) TextUtils.getTrimmedLength(""), 12375 >> (ViewConfiguration.getMaximumFlingVelocity() % 60)).intern());
            if (!TextUtils.isEmpty(strM2674)) {
                new jm(context, m3028((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 44165), 1388 - TextUtils.getOffsetAfter("", 0)).intern(), m3028(24 - Color.red(0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 1412 - ImageFormat.getBitsPerPixel(0)).intern()).m2680(m3028((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.lastIndexOf("", '0') + 1379).intern(), strM2674);
                this.f3095.m2676(m3028(10 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1377).intern());
            }
        } else {
            strM2674 = this.f3095.m2674(m3028(TextUtils.lastIndexOf("", '0') + 11, (char) TextUtils.getTrimmedLength(""), 1378 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
            if (!TextUtils.isEmpty(strM2674)) {
                new jm(context, m3028((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 44165), 1388 - TextUtils.getOffsetAfter("", 0)).intern(), m3028(24 - Color.red(0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 1412 - ImageFormat.getBitsPerPixel(0)).intern()).m2680(m3028((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.lastIndexOf("", '0') + 1379).intern(), strM2674);
                this.f3095.m2676(m3028(10 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1377).intern());
            }
        }
        f3089 = (f3090 + 21) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig) throws Throwable {
        if (context instanceof Application) {
            m3047((Application) context, str, iSAdQualityConfig);
            return;
        }
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            f3089 = (f3090 + 95) % 128;
            m3047((Application) context.getApplicationContext(), str, iSAdQualityConfig);
            return;
        }
        Set<ISAdQualityInitListener> adQualityInitListeners = null;
        if (context instanceof Activity) {
            int i10 = f3089 + 3;
            f3090 = i10 % 128;
            if (i10 % 2 != 0) {
                m3024((Activity) context, str, iSAdQualityConfig);
                return;
            } else {
                m3024((Activity) context, str, iSAdQualityConfig);
                throw null;
            }
        }
        String strIntern = m3028(74 - TextUtils.getCapsMode("", 0, 0), (char) (13197 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1).intern();
        m.m2968(m3028((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, (char) View.MeasureSpec.getMode(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 74).intern(), strIntern);
        if (iSAdQualityConfig != null) {
            adQualityInitListeners = iSAdQualityConfig.getAdQualityInitListeners();
            f3090 = (f3089 + 47) % 128;
        }
        m3025(adQualityInitListeners, ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern);
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final synchronized av m3057() {
        av avVar;
        try {
            int i10 = f3089;
            int i11 = i10 + InterfaceC0435l1.d.b.f29112i;
            f3090 = i11 % 128;
            if (i11 % 2 == 0) {
                avVar = this.f3097;
                int i12 = 52 / 0;
            } else {
                avVar = this.f3097;
            }
            int i13 = i10 + 31;
            f3090 = i13 % 128;
            if (i13 % 2 != 0) {
                return avVar;
            }
            int i14 = 43 / 0;
            return avVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ jh m3023(s sVar, jh jhVar) {
        int i10 = f3090;
        f3089 = (i10 + 83) % 128;
        sVar.f3094 = jhVar;
        int i11 = i10 + 71;
        f3089 = i11 % 128;
        if (i11 % 2 == 0) {
            return jhVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m3031(s sVar, ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i10 = f3090 + 25;
        f3089 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m3049(iSAdQualityLogLevel);
        if (i11 != 0) {
            int i12 = 41 / 0;
        }
        int i13 = f3089 + 45;
        f3090 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 22 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m3036(s sVar, Context context) {
        int i10 = f3090 + 35;
        f3089 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m3053(context);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ al m3043(s sVar) {
        int i10 = (f3089 + 95) % 128;
        f3090 = i10;
        al alVar = sVar.f3101;
        int i11 = i10 + InterfaceC0435l1.d.b.f29112i;
        f3089 = i11 % 128;
        if (i11 % 2 == 0) {
            return alVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m3024(Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) throws Throwable {
        f3089 = (f3090 + 77) % 128;
        m3046(activity.getApplication(), activity, str, iSAdQualityConfig);
        f3089 = (f3090 + 31) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01e1 A[Catch: all -> 0x0065, Exception -> 0x0069, TryCatch #3 {Exception -> 0x0069, blocks: (B:5:0x000c, B:7:0x0015, B:21:0x006e, B:23:0x0074, B:26:0x00b5, B:28:0x00d8, B:29:0x0106, B:35:0x011d, B:40:0x0176, B:41:0x0196, B:43:0x01e1, B:44:0x0210, B:36:0x013b, B:37:0x0153, B:38:0x0158), top: B:58:0x000c, outer: #2 }] */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m3032(boolean z10) {
        String strM3028;
        String strIntern;
        String strMo501;
        f3089 = (f3090 + 75) % 128;
        try {
            if (m3060()) {
                m.m2968(m3028(11 - Process.getGidForName(""), (char) TextUtils.getOffsetBefore("", 0), KeyEvent.getDeadChar(0, 0) + 74).intern(), m3028((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 35, (char) ExpandableListView.getPackedPositionType(0L), 399 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
                int i10 = f3090 + 41;
                f3089 = i10 % 128;
                if (i10 % 2 == 0) {
                    return;
                } else {
                    throw null;
                }
            }
            if (!m3006()) {
                m.m2968(m3028(11 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 74 - TextUtils.getOffsetBefore("", 0)).intern(), m3028(59 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (AndroidCharacter.getMirror('0') + 51005), View.resolveSizeAndState(0, 0, 0) + 435).intern());
                return;
            }
            String strIntern2 = m3028(28 - (ViewConfiguration.getTapTimeout() >> 16), (char) (36060 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 542 - AndroidCharacter.getMirror('0')).intern();
            if (z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strIntern2);
                sb2.append(m3028(24 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (Color.rgb(0, 0, 0) + 16812662), Color.green(0) + 522).intern());
                strIntern2 = sb2.toString();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (z10) {
                    int i11 = f3090 + 9;
                    f3089 = i11 % 128;
                    if (i11 % 2 != 0) {
                        strIntern = m3028(82 % TextUtils.getOffsetAfter("", 0), (char) (40363 % Color.green(0)), 19574 - View.resolveSize(1, 1)).intern();
                    } else {
                        strM3028 = m3028(6 - TextUtils.getOffsetAfter("", 0), (char) (Color.green(0) + 40363), 546 - View.resolveSize(0, 0));
                    }
                    jSONObject.put(m3028((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 555).intern(), strIntern);
                    this.f3099.m385(m3028(5 - View.resolveSizeAndState(0, 0, 0), (char) View.getDefaultSize(0, 0), ExpandableListView.getPackedPositionType(0L) + 556).intern(), jSONObject);
                    strMo501 = ar.m468().mo501(m3028(View.resolveSize(0, 0) + 6, (char) (ViewConfiguration.getTapTimeout() >> 16), 561 - TextUtils.indexOf("", "", 0, 0)).intern());
                    if (!TextUtils.isEmpty(strMo501)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(strIntern2);
                        sb3.append(m3028('>' - AndroidCharacter.getMirror('0'), (char) TextUtils.getOffsetAfter("", 0), 566 - TextUtils.indexOf((CharSequence) "", '0')).intern());
                        sb3.append(strMo501);
                        strIntern2 = sb3.toString();
                    }
                    m.m2963(m3028(AndroidCharacter.getMirror('0') - '$', (char) (ViewConfiguration.getLongPressTimeout() >> 16), ImageFormat.getBitsPerPixel(0) + 75).intern(), strIntern2);
                    m3054(ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, strIntern2);
                    this.f3105 = true;
                    ar.m468().mo479();
                    iu.m2556(this.f3103).m2564();
                    this.f3097.m646();
                    this.f3100.m2629();
                    this.f3099.m383();
                    id.m2381();
                }
                strM3028 = m3028(3 - TextUtils.getOffsetBefore("", 0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 552);
                jSONObject.put(m3028((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 555).intern(), strIntern);
            } catch (JSONException unused) {
            }
            strIntern = strM3028.intern();
            this.f3099.m385(m3028(5 - View.resolveSizeAndState(0, 0, 0), (char) View.getDefaultSize(0, 0), ExpandableListView.getPackedPositionType(0L) + 556).intern(), jSONObject);
            strMo501 = ar.m468().mo501(m3028(View.resolveSize(0, 0) + 6, (char) (ViewConfiguration.getTapTimeout() >> 16), 561 - TextUtils.indexOf("", "", 0, 0)).intern());
            if (!TextUtils.isEmpty(strMo501)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(strIntern2);
                sb4.append(m3028('>' - AndroidCharacter.getMirror('0'), (char) TextUtils.getOffsetAfter("", 0), 566 - TextUtils.indexOf((CharSequence) "", '0')).intern());
                sb4.append(strMo501);
                strIntern2 = sb4.toString();
            }
            m.m2963(m3028(AndroidCharacter.getMirror('0') - '$', (char) (ViewConfiguration.getLongPressTimeout() >> 16), ImageFormat.getBitsPerPixel(0) + 75).intern(), strIntern2);
            m3054(ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, strIntern2);
            this.f3105 = true;
            ar.m468().mo479();
            iu.m2556(this.f3103).m2564();
            this.f3097.m646();
            this.f3100.m2629();
            this.f3099.m383();
            id.m2381();
        } catch (Exception e10) {
            kl.m2893(m3028(12 - TextUtils.indexOf("", "", 0), (char) View.resolveSizeAndState(0, 0, 0), 73 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), m3028(Color.red(0) + 19, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 581 - TextUtils.indexOf("", "", 0)).intern(), e10, true, false, true);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m3037(s sVar, Context context, String str) {
        f3089 = (f3090 + 31) % 128;
        sVar.m3029(context, str, true, false, true);
        f3089 = (f3090 + 119) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ jj m3044(s sVar, jj jjVar) {
        int i10 = (f3089 + 81) % 128;
        f3090 = i10;
        sVar.f3100 = jjVar;
        int i11 = i10 + 123;
        f3089 = i11 % 128;
        if (i11 % 2 == 0) {
            return jjVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m3038(s sVar, boolean z10) {
        int i10 = f3090 + 23;
        f3089 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m3051(z10);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f3089 + 31;
        f3090 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ jm m3045(s sVar, jm jmVar) {
        int i10 = f3089;
        int i11 = i10 + 71;
        f3090 = i11 % 128;
        int i12 = i11 % 2;
        sVar.f3095 = jmVar;
        if (i12 == 0) {
            int i13 = 55 / 0;
        }
        f3090 = (i10 + InterfaceC0435l1.d.b.f29105b) % 128;
        return jmVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m3058() {
        if (m3060()) {
            f3090 = (f3089 + 23) % 128;
            m.m2968(m3028(12 - (ViewConfiguration.getTapTimeout() >> 16), (char) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 73 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m3028(60 - TextUtils.getOffsetAfter("", 0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 65404), 1438 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        } else if (m3006()) {
            m.m2968(m3028(12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 74 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), m3028(48 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1496).intern());
        } else {
            this.f3106 = true;
            f3090 = (f3089 + 95) % 128;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3040(s sVar) {
        int i10 = f3089 + 35;
        f3090 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM3013 = sVar.m3013();
        if (i11 == 0) {
            int i12 = 50 / 0;
        }
        int i13 = f3090 + 121;
        f3089 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 4 / 0;
        }
        return zM3013;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m3050(s sVar, ISAdQualityInitError iSAdQualityInitError, String str) {
        f3089 = (f3090 + 27) % 128;
        sVar.m3054(iSAdQualityInitError, str);
        int i10 = f3089 + 3;
        f3090 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 33 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ av m3019(s sVar) {
        int i10 = f3090;
        f3089 = (i10 + 13) % 128;
        av avVar = sVar.f3097;
        f3089 = (i10 + 65) % 128;
        return avVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static s m3035() {
        synchronized (s.class) {
            try {
                if (f3091 == null) {
                    f3091 = new s();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f3091;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m3047(Application application, String str, ISAdQualityConfig iSAdQualityConfig) throws Throwable {
        int i10 = f3089 + 53;
        f3090 = i10 % 128;
        int i11 = i10 % 2;
        m3046(application, null, str, iSAdQualityConfig);
        if (i11 == 0) {
            int i12 = 97 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x011c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0184  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m3046(Application application, Activity activity, String str, @Nullable ISAdQualityConfig iSAdQualityConfig) throws Throwable {
        Throwable th2;
        ISAdQualityInitError iSAdQualityInitError;
        String strIntern;
        if (iSAdQualityConfig == null) {
            iSAdQualityConfig = new ISAdQualityConfig.Builder().build();
        }
        if (ay.m683().isEmpty()) {
            String strIntern2 = m3028(View.getDefaultSize(0, 0) + 57, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 86).intern();
            m.m2963(m3028(11 - TextUtils.indexOf((CharSequence) "", '0'), (char) KeyEvent.getDeadChar(0, 0), 74 - (Process.myPid() >> 22)).intern(), strIntern2);
            m3025(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.NO_AD_NETWORKS, strIntern2);
            return;
        }
        if (!m3056(iSAdQualityConfig)) {
            iSAdQualityConfig = ISAdQualityConfig.merge(this.f3108, iSAdQualityConfig);
        }
        ISAdQualityConfig iSAdQualityConfig2 = iSAdQualityConfig;
        synchronized (this) {
            try {
                try {
                    if (this.f3105) {
                        iSAdQualityInitError = ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN;
                        strIntern = m3028((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 48, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getWindowTouchSlop() >> 8) + 143).intern();
                    } else if (this.f3107) {
                        iSAdQualityInitError = ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED;
                        strIntern = m3028(40 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0), 191 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern();
                    } else {
                        if (this.f3110) {
                            iSAdQualityInitError = ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED;
                            strIntern = m3028((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 59, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6574), TextUtils.getOffsetAfter("", 0) + 231).intern();
                        } else {
                            this.f3107 = true;
                            iSAdQualityInitError = null;
                            strIntern = null;
                        }
                        if (iSAdQualityInitError != null) {
                            if (iSAdQualityInitError == ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN) {
                                m.m2968(m3028(TextUtils.lastIndexOf("", '0', 0) + 13, (char) View.combineMeasuredStates(0, 0), 74 - View.getDefaultSize(0, 0)).intern(), strIntern);
                            }
                            m3025(iSAdQualityConfig2.getAdQualityInitListeners(), iSAdQualityInitError, strIntern);
                            return;
                        }
                        if (!TextUtils.isEmpty(iSAdQualityConfig2.getUserId()) && iSAdQualityConfig2.isUserIdSet()) {
                            String strIntern3 = m3028(60 - View.MeasureSpec.getSize(0), (char) (34573 - Color.red(0)), Process.getGidForName("") + 291).intern();
                            m.m2968(m3028(12 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 74).intern(), strIntern3);
                            synchronized (this) {
                                this.f3107 = false;
                            }
                            m3025(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_USER_ID, strIntern3);
                            return;
                        }
                        if (TextUtils.isEmpty(str)) {
                            String strIntern4 = m3028(ExpandableListView.getPackedPositionType(0L) + 49, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 51381), 350 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern();
                            m.m2968(m3028(12 - Color.alpha(0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 74).intern(), strIntern4);
                            synchronized (this) {
                                this.f3107 = false;
                            }
                            m3025(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_APP_KEY, strIntern4);
                            return;
                        }
                        synchronized (this) {
                            this.f3096.addAll(iSAdQualityConfig2.getAdQualityInitListeners());
                        }
                        jt.m2734().mo2739(application, activity);
                        jo.m2696().m2698();
                        jq.m2720().m2731();
                        p.m2996(new AnonymousClass2(iSAdQualityConfig2, str, application, activity));
                    }
                    if (iSAdQualityInitError != null) {
                        if (iSAdQualityInitError == ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN) {
                            m.m2968(m3028(TextUtils.lastIndexOf("", '0', 0) + 13, (char) View.combineMeasuredStates(0, 0), 74 - View.getDefaultSize(0, 0)).intern(), strIntern);
                        }
                        m3025(iSAdQualityConfig2.getAdQualityInitListeners(), iSAdQualityInitError, strIntern);
                        return;
                    }
                    if (!TextUtils.isEmpty(iSAdQualityConfig2.getUserId())) {
                    }
                    if (TextUtils.isEmpty(str)) {
                        String strIntern5 = m3028(ExpandableListView.getPackedPositionType(0L) + 49, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 51381), 350 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern();
                        m.m2968(m3028(12 - Color.alpha(0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 74).intern(), strIntern5);
                        synchronized (this) {
                            this.f3107 = false;
                            m3025(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_APP_KEY, strIntern5);
                            return;
                        }
                    }
                    synchronized (this) {
                        this.f3096.addAll(iSAdQualityConfig2.getAdQualityInitListeners());
                        jt.m2734().mo2739(application, activity);
                        jo.m2696().m2698();
                        jq.m2720().m2731();
                        p.m2996(new AnonymousClass2(iSAdQualityConfig2, str, application, activity));
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized ISAdQualityLogLevel m3061() {
        ISAdQualityLogLevel iSAdQualityLogLevel;
        int i10 = f3089;
        int i11 = i10 + 73;
        f3090 = i11 % 128;
        try {
            if (i11 % 2 == 0) {
                throw null;
            }
            iSAdQualityLogLevel = this.f3104;
            int i12 = i10 + 13;
            f3090 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iSAdQualityLogLevel;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m3026(boolean z10) {
        int i10 = (f3089 + 79) % 128;
        f3090 = i10;
        this.f3107 = false;
        f3089 = (i10 + 5) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m3054(ISAdQualityInitError iSAdQualityInitError, String str) {
        int i10 = f3089 + 59;
        f3090 = i10 % 128;
        if (i10 % 2 != 0) {
            m3025(this.f3096, iSAdQualityInitError, str);
        } else {
            m3025(this.f3096, iSAdQualityInitError, str);
            int i11 = 59 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m3025(final Set<ISAdQualityInitListener> set, final ISAdQualityInitError iSAdQualityInitError, final String str) {
        int i10 = f3089 + 123;
        int i11 = i10 % 128;
        f3090 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (set == null) {
            int i12 = i11 + 73;
            f3089 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return;
        }
        p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.s.10
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                for (ISAdQualityInitListener iSAdQualityInitListener : set) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitFailed(iSAdQualityInitError, str);
                    }
                }
                set.clear();
            }
        });
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m3056(ISAdQualityConfig iSAdQualityConfig) {
        int i10 = f3089;
        int i11 = i10 + InterfaceC0435l1.d.b.f29105b;
        f3090 = i11 % 128;
        if (i11 % 2 != 0) {
            if (this.f3108 != null) {
                boolean zOptBoolean = false;
                try {
                    String str = iSAdQualityConfig.getMetaData().get(m3028(13 - TextUtils.getCapsMode("", 0, 0), (char) (48430 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 1365).intern());
                    if (!TextUtils.isEmpty(str)) {
                        zOptBoolean = new JSONObject(str).optBoolean(m3028(23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1965 - Color.argb(0, 0, 0, 0)).intern());
                        f3090 = (f3089 + 77) % 128;
                    }
                } catch (Throwable unused) {
                }
                return zOptBoolean;
            }
            f3090 = (i10 + 65) % 128;
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m3039(boolean z10) {
        int i10 = f3089;
        this.f3110 = true;
        int i11 = i10 + 69;
        f3090 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m3029(Context context, String str, boolean z10, boolean z11, boolean z12) {
        String strM549 = m3015().m549();
        m3015().m560(str);
        if (str == null) {
            f3090 = (f3089 + 7) % 128;
            m.m2968(m3028(View.getDefaultSize(0, 0) + 12, (char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.blue(0) + 74).intern(), m3028(93 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1104 - TextUtils.indexOf((CharSequence) "", '0')).intern());
        } else if (str.equals(m3028((ViewConfiguration.getJumpTapTimeout() >> 16) + 17, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 34254), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1197).intern())) {
            String strIntern = m3028((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 73 - TextUtils.lastIndexOf("", '0', 0)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3028(TextUtils.getTrimmedLength("") + 40, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.indexOf("", "") + 1215).intern());
            sb2.append(str);
            sb2.append(m3028((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 76, (char) (20484 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1254 - ExpandableListView.getPackedPositionChild(0L)).intern());
            m.m2968(strIntern, sb2.toString());
        } else {
            String strIntern2 = m3028(12 - KeyEvent.keyCodeFromString(""), (char) ExpandableListView.getPackedPositionGroup(0L), View.resolveSize(0, 0) + 74).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m3028((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22773), 1332 - TextUtils.getOffsetBefore("", 0)).intern());
            sb3.append(str);
            m.m2985(strIntern2, sb3.toString());
        }
        ar.m468().mo498(new AnonymousClass3(z10, context, z11, strM549, z12));
        JSONObject jSONObjectM3018 = m3018();
        if (jSONObjectM3018 != null) {
            f3090 = (f3089 + 43) % 128;
            ar.m468().mo495(jSONObjectM3018, m3015());
        } else {
            ar.m468().mo502(context, m3015(), true);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m3059() {
        int i10 = (f3089 + 87) % 128;
        f3090 = i10;
        boolean z10 = this.f3106;
        int i11 = i10 + 51;
        f3089 = i11 % 128;
        if (i11 % 2 == 0) {
            return z10;
        }
        int i12 = 99 / 0;
        return z10;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m3028(int i10, char c4, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i10];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((((long) f3087[i11 + i12]) ^ (((long) i12) * f3088)) ^ ((long) c4));
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized boolean m3060() {
        boolean z10;
        try {
            int i10 = f3090;
            int i11 = i10 + 115;
            f3089 = i11 % 128;
            if (i11 % 2 != 0) {
                z10 = this.f3105;
                int i12 = 17 / 0;
            } else {
                z10 = this.f3105;
            }
            int i13 = i10 + InterfaceC0435l1.d.b.f29107d;
            f3089 = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m3052(String str) {
        f3090 = (f3089 + 77) % 128;
        if (m3060()) {
            f3089 = (f3090 + 123) % 128;
            m.m2968(m3028(Color.argb(0, 0, 0, 0) + 12, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 74).intern(), m3028(TextUtils.indexOf((CharSequence) "", '0') + 53, (char) (KeyEvent.normalizeMetaState(0) + 57820), Color.argb(0, 0, 0, 0) + 954).intern());
            return false;
        }
        if (!m3006()) {
            m.m2968(m3028(12 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 74).intern(), m3028(64 - MotionEvent.axisFromString(""), (char) Color.green(0), KeyEvent.normalizeMetaState(0) + 1006).intern());
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        f3090 = (f3089 + 27) % 128;
        m.m2968(m3028((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 74 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), m3028(KeyEvent.normalizeMetaState(0) + 34, (char) (Color.red(0) + 48746), MotionEvent.axisFromString("") + 1072).intern());
        return false;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m3051(boolean z10) {
        int i10 = (f3089 + 89) % 128;
        f3090 = i10;
        this.f3102 = z10;
        int i11 = i10 + 121;
        f3089 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 40 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m3049(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i10 = f3090;
        this.f3104 = iSAdQualityLogLevel;
        f3089 = (i10 + 99) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m3048(Context context) {
        try {
            context.registerReceiver(new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.s.1
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    kf.m2818(intent);
                }
            }, new IntentFilter(m3028(TextUtils.lastIndexOf("", '0', 0, 0) + 38, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1545 - Color.blue(0)).intern()), null, p.m2995());
            int i10 = f3090 + 87;
            f3089 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            m.m2977(m3028((ViewConfiguration.getPressedStateDuration() >> 16) + 12, (char) (ViewConfiguration.getTapTimeout() >> 16), Color.green(0) + 74).intern(), m3028(35 - Color.blue(0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), Process.getGidForName("") + 1583).intern(), th2);
        }
    }
}

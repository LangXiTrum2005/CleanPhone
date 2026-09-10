package com.p004ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends w<Activity> implements jh {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f2976 = 0;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f2977 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f2978;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f2979;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f2980;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2981;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String f2982;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean f2983;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private e f2984;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean f2985;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f2986;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Class f2987;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f2988;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private jh f2989;

    public class e extends w.e {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f3018 = 1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f3020;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f3022 = false;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f3023;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private int f3024;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private boolean f3025;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f3026;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int[] f3019 = {-94124944, 976727494, 1731474252, -1526525249, -1590939251, -1987077971, -1189439085, 446393717, 838473903, 830317635, 893789095, 2129519560, -379001805, 1226087563, 355878119, -1163777740, 509679782, -306611102};

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static long f3021 = 3681616240420167750L;

        public e(v vVar, JSONObject jSONObject) {
            m2963(jSONObject.optString(m2970(new int[]{456581925, 333010295, -800874963, 526911697, -1411356241, -2079777307, 140116442, 1300303633}, TextUtils.lastIndexOf("", '0', 0, 0) + 15).intern()));
            m2965(jSONObject.optString(m2967("⋪⊝簇\udc24菒瀰쌼邴ꎛﴟ䈁ᆙ₶縳석鍁ꇬￋ䁫ᑏ⛚磰읛镤ꟻ梨", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()));
            m2962(jSONObject.optInt(m2970(new int[]{-206103785, -256930901, -425967560, -49619672, -643147075, 1145594547}, 9 - Color.blue(0)).intern(), -1));
            m2961(jSONObject.optBoolean(m2970(new int[]{-760978804, 259606547, 1434341283, 565787366, 2028595829, -329778709, -1281314267, -1587787302, 852642138, -409340621}, 17 - TextUtils.getOffsetAfter("", 0)).intern()));
            m2960(jSONObject.optBoolean(m2967("꒣꓂⽢轇嚹㛸ᙁ황◚깵靱坰꛲ⵒᑮ행➥겦锩劇ꂯ⮀ሬ", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern()));
            m2996(jSONObject.optString(m2967("锚镰㓔铡䟺ﻩܢṔᑋ뗑蘴齦靉㛣", Process.myPid() >> 22).intern()));
            m2997(TextUtils.isEmpty(jSONObject.optString(m2967("鶓鷦슇抳㎒䮁獲ꬃ᳹䎈\uf250⨂鿛", TextUtils.getCapsMode("", 0, 0)).intern())) ? null : Arrays.asList(jSONObject.optString(m2967("鶓鷦슇抳㎒䮁獲ꬃ᳹䎈\uf250⨂鿛", ViewConfiguration.getTapTimeout() >> 16).intern()).split(m2967("硆硪胜煻ḕ", ImageFormat.getBitsPerPixel(0) + 1).intern())));
            m2998(jSONObject.optBoolean(m2967("ꨀꩵ쁋恾◅\u0a61攬\ueae4⭽䅂\ue437毢ꡕ쉿朱\ue902⤻䎘", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1).intern()));
            m3000(jSONObject.optBoolean(m2967("썽쌈全\uf15d䜁蚷ߨ是䈄큵蛄\ue72e섮卙ה旅䁁", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), true));
            m2995(!TextUtils.isEmpty(jSONObject.optString(m2967("锚镰㓔铡䟺ﻩܢṔᑋ뗑蘴齦靉㛣", (Process.getThreadPriority(0) + 20) >> 6).intern())) || jSONObject.optBoolean(m2967("ꀑꁤ\ue778䝍曐几☹녥Ⅼ晱Ꜣっꉄ\ue54c\u242f늎⌰撦ꕪ㖎", ViewConfiguration.getWindowTouchSlop() >> 8).intern()) || jSONObject.optBoolean(m2970(new int[]{-1385728159, 894828185, 1202365761, 1127767880, -1839593392, -1600191352, 953546408, -126578760, -1818870947, -2110693073}, 18 - KeyEvent.getDeadChar(0, 0)).intern()));
            m2993(jSONObject.optBoolean(m2967("ꀑꁤ\ue778䝍曐几☹녥Ⅼ晱Ꜣっꉄ\ue54c\u242f늎⌰撦ꕪ㖎", KeyEvent.getMaxKeyCode() >> 16).intern()));
            m2991(jSONObject.optBoolean(m2970(new int[]{-1649939842, 731490116, -933750370, -1479160481, 163791369, -754909593}, 10 - TextUtils.getOffsetBefore("", 0)).intern()));
            m2999(jSONObject.optBoolean(m2967("옩왜绳\udec6뻔Ꞔ︽䝛䝄\ufff4缄왇쑩糜ﰍ䒑䔄ﴪ絖쎷숬稗碑", (-1) - MotionEvent.axisFromString("")).intern()));
            m2990(jSONObject.optBoolean(m2967("龜便ᆇ놴딦끶\uf5c6僐硹邚瓮퇹ﭱᎬ\uf7e9匀稡鉔皑퐉ﴛ", ViewConfiguration.getTouchSlop() >> 8).intern()));
            m2992(jSONObject.optBoolean(m2967("忂徫ᓵ듞穥ታ㪙\uf2ee\udeb4闐뮮珪嶆", ViewConfiguration.getEdgeSlop() >> 16).intern()));
            m2994(kc.m2769(jSONObject.optJSONArray(m2967("嵋崽௭ꯂ֔鲷䕽簒\udc20諈쑟ﴔ弜\u09da䝇翇\ude66", Process.getGidForName("") + 1).intern())));
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private e m2960(boolean z2) {
            int i2 = f3020;
            this.f3022 = z2;
            int i3 = i2 + 73;
            f3018 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 60 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private e m2961(boolean z2) {
            int i2 = (f3018 + 33) % 128;
            f3020 = i2;
            this.f3025 = z2;
            f3018 = (i2 + 77) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ boolean m2964(e eVar) {
            int i2 = f3018;
            f3020 = (i2 + 123) % 128;
            boolean z2 = eVar.f3022;
            f3020 = (i2 + 39) % 128;
            return z2;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ String m2966(e eVar) {
            int i2 = (f3020 + 51) % 128;
            f3018 = i2;
            String str = eVar.f3026;
            int i3 = i2 + 111;
            f3020 = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ boolean m2968(e eVar) {
            int i2 = (f3020 + 87) % 128;
            f3018 = i2;
            boolean z2 = eVar.f3025;
            int i3 = i2 + 73;
            f3020 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 22 / 0;
            }
            return z2;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ int m2969(e eVar) {
            int i2 = f3018;
            int i3 = i2 + 125;
            f3020 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = eVar.f3024;
            if (i4 != 0) {
                throw null;
            }
            int i6 = i2 + 87;
            f3020 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 98 / 0;
            }
            return i5;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ String m2971(e eVar) {
            int i2 = f3018;
            f3020 = (i2 + 35) % 128;
            String str = eVar.f3023;
            int i3 = i2 + 73;
            f3020 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 49 / 0;
            }
            return str;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private e m2963(String str) {
            int i2 = f3018 + 65;
            int i3 = i2 % 128;
            f3020 = i3;
            if (i2 % 2 != 0) {
                this.f3023 = str;
                throw null;
            }
            this.f3023 = str;
            int i4 = i3 + 41;
            f3018 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private e m2965(String str) {
            int i2 = (f3018 + 85) % 128;
            f3020 = i2;
            this.f3026 = str;
            int i3 = i2 + 59;
            f3018 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 59 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m2967(String str, int i2) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (f.f1955) {
                try {
                    char[] cArrM2116 = f.m2116(f3021, cArr, i2);
                    f.f1954 = 4;
                    while (true) {
                        int i3 = f.f1954;
                        if (i3 < cArrM2116.length) {
                            int i4 = i3 - 4;
                            f.f1953 = i4;
                            cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f3021));
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

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2970(int[] iArr, int i2) {
            String str;
            synchronized (d.f1586) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f3019.clone();
                    d.f1584 = 0;
                    while (true) {
                        int i3 = d.f1584;
                        if (i3 < iArr.length) {
                            int i4 = iArr[i3];
                            char c2 = (char) (i4 >> 16);
                            cArr[0] = c2;
                            char c3 = (char) i4;
                            cArr[1] = c3;
                            char c4 = (char) (iArr[i3 + 1] >> 16);
                            cArr[2] = c4;
                            char c5 = (char) iArr[i3 + 1];
                            cArr[3] = c5;
                            d.f1587 = (c2 << 16) + c3;
                            d.f1585 = (c4 << 16) + c5;
                            d.m1788(iArr2);
                            for (int i5 = 0; i5 < 16; i5++) {
                                int i6 = d.f1587 ^ iArr2[i5];
                                d.f1587 = i6;
                                int iM1787 = d.m1787(i6) ^ d.f1585;
                                int i7 = d.f1587;
                                d.f1587 = iM1787;
                                d.f1585 = i7;
                            }
                            int i8 = d.f1587;
                            int i9 = d.f1585;
                            d.f1587 = i9;
                            d.f1585 = i8;
                            int i10 = i8 ^ iArr2[16];
                            d.f1585 = i10;
                            int i11 = i9 ^ iArr2[17];
                            d.f1587 = i11;
                            cArr[0] = (char) (i11 >>> 16);
                            cArr[1] = (char) i11;
                            cArr[2] = (char) (i10 >>> 16);
                            cArr[3] = (char) i10;
                            d.m1788(iArr2);
                            int i12 = d.f1584;
                            cArr2[i12 << 1] = cArr[0];
                            cArr2[(i12 << 1) + 1] = cArr[1];
                            cArr2[(i12 << 1) + 2] = cArr[2];
                            cArr2[(i12 << 1) + 3] = cArr[3];
                            d.f1584 = i12 + 2;
                        } else {
                            str = new String(cArr2, 0, i2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private e m2962(int i2) {
            int i3 = f3018 + 53;
            int i4 = i3 % 128;
            f3020 = i4;
            if (i3 % 2 != 0) {
                this.f3024 = i2;
                int i5 = 73 / 0;
            } else {
                this.f3024 = i2;
            }
            f3018 = (i4 + 67) % 128;
            return this;
        }
    }

    static {
        m2932();
        f2982 = m2943("悠\ue81d⻄叕斌ᩬ捝⯉湾䈐\ud7ab풆┕뫂颼廥훀혛៲㧡\ue2c9ꃑ\ude23躑놇栯鯓洌놇栯鯓洌总蔦뛓ﵷ\uf8c3蛾ꢚ藹", 39 - ExpandableListView.getPackedPositionType(0L)).intern();
        int i2 = f2979 + 75;
        f2977 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public v(JSONObject jSONObject, iq iqVar) {
        super(iqVar);
        this.f2986 = false;
        this.f2988 = false;
        this.f2985 = false;
        this.f2983 = false;
        m2958(jSONObject);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m2928() {
        int i2 = f2979 + 97;
        f2977 = i2 % 128;
        if (i2 % 2 != 0) {
            return f2982;
        }
        int i3 = 82 / 0;
        return f2982;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2929(v vVar) {
        int i2 = (f2979 + 9) % 128;
        f2977 = i2;
        boolean z2 = vVar.f2985;
        int i3 = i2 + 57;
        f2979 = i3 % 128;
        if (i3 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private jh m2930() {
        int i2 = (f2979 + 101) % 128;
        f2977 = i2;
        jh jhVar = this.f2989;
        f2979 = (i2 + 109) % 128;
        return jhVar;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static void m2932() {
        f2978 = (char) 16736;
        f2980 = (char) 10434;
        f2976 = (char) 65313;
        f2981 = (char) 1798;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ jh m2934(v vVar) {
        int i2 = f2977 + 3;
        f2979 = i2 % 128;
        if (i2 % 2 == 0) {
            return vVar.m2930();
        }
        vVar.m2930();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2936(v vVar) {
        int i2 = f2979 + 65;
        f2977 = i2 % 128;
        int i3 = i2 % 2;
        boolean z2 = vVar.f2988;
        if (i3 != 0) {
            return z2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Class m2938(v vVar, Class cls) {
        int i2 = f2977 + 99;
        f2979 = i2 % 128;
        int i3 = i2 % 2;
        vVar.f2987 = cls;
        if (i3 == 0) {
            return cls;
        }
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        m2944(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.4
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (v.m2949(v.this, activity)) {
                    v.m2934(v.this).onActivityCreated(activity, bundle);
                    v.m2945();
                    v.m2935(v.this, false);
                    Bundle bundle2 = bundle;
                    if (bundle2 == null) {
                        v.m2940(v.this, false);
                        return;
                    }
                    v.m2940(v.this, bundle2.getBoolean(v.m2928()));
                    if (v.m2948(v.this)) {
                        v.m2935(v.this, true);
                    }
                    v.m2937(v.this, true);
                }
            }
        });
        int i2 = f2977 + 105;
        f2979 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(final Activity activity) {
        m2944(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.3
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (v.m2949(v.this, activity)) {
                    s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.3.4
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            v.m2934(v.this).onActivityDestroyed(activity);
                        }
                    });
                    if (v.m2936(v.this) && v.m2948(v.this) && activity.isFinishing()) {
                        v.this.m2952(activity);
                    }
                }
            }
        });
        f2979 = (f2977 + 19) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.8
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (v.m2949(v.this, activity)) {
                    v.m2934(v.this).onActivityPaused(activity);
                }
            }
        });
        f2979 = (f2977 + 93) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        m2944(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.10
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (v.m2949(v.this, activity)) {
                    s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.10.1
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            v.m2934(v.this).onActivityResumed(activity);
                        }
                    });
                    v.m2950(v.this, false);
                    v.m2935(v.this, true);
                    if ((!v.m2948(v.this) || v.m2939(v.this)) && !activity.isFinishing()) {
                        v vVar = v.this;
                        Activity activity2 = activity;
                        vVar.m2957(activity2, v.m2942(activity2));
                    }
                    v.m2937(v.this, false);
                }
            }
        });
        int i2 = f2977 + 63;
        f2979 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        m2944(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.9
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (v.m2949(v.this, activity)) {
                    v.m2934(v.this).onActivitySaveInstanceState(activity, bundle);
                    Bundle bundle2 = bundle;
                    if (bundle2 != null) {
                        bundle2.putBoolean(v.m2928(), v.m2948(v.this));
                    }
                    v.m2950(v.this, true);
                }
            }
        });
        int i2 = f2977 + 45;
        f2979 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity activity) {
        s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.6
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (v.m2949(v.this, activity)) {
                    v.m2934(v.this).onActivityStarted(activity);
                }
            }
        });
        int i2 = f2979 + 85;
        f2977 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final Activity activity) {
        m2944(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.7
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (v.m2949(v.this, activity)) {
                    s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.7.3
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            v.m2934(v.this).onActivityStopped(activity);
                        }
                    });
                    if (v.m2936(v.this) && !v.m2929(v.this) && activity.isFinishing()) {
                        v.this.m2952(activity);
                    }
                }
            }
        });
        int i2 = f2979 + 69;
        f2977 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾇ */
    public final /* synthetic */ View mo232(Activity activity) {
        f2977 = (f2979 + 39) % 128;
        View viewM2946 = m2946(activity);
        f2977 = (f2979 + 33) % 128;
        return viewM2946;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾒ */
    public final /* bridge */ /* synthetic */ void mo235(Activity activity, List list) {
        int i2 = f2979 + 5;
        f2977 = i2 % 128;
        int i3 = i2 % 2;
        m2947(activity, (List<WebView>) list);
        if (i3 == 0) {
            throw null;
        }
        f2979 = (f2977 + 9) % 128;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m2931(Activity activity) {
        int i2 = f2977 + 61;
        f2979 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = activity.hashCode();
        if (i3 == 0) {
            return Integer.toHexString(iHashCode);
        }
        Integer.toHexString(iHashCode);
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean m2933(Activity activity) {
        Class<?> cls = activity.getClass();
        if (this.f2987 == null) {
            return false;
        }
        if (e.m2968(this.f2984)) {
            boolean zEquals = this.f2987.equals(cls);
            int i2 = f2979 + 27;
            f2977 = i2 % 128;
            if (i2 % 2 != 0) {
                return zEquals;
            }
            throw null;
        }
        boolean zIsAssignableFrom = this.f2987.isAssignableFrom(cls);
        int i3 = f2977 + 71;
        f2979 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 23 / 0;
        }
        return zIsAssignableFrom;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2937(v vVar, boolean z2) {
        int i2 = f2977 + 21;
        int i3 = i2 % 128;
        f2979 = i3;
        int i4 = i2 % 2;
        vVar.f2983 = z2;
        if (i4 != 0) {
            int i5 = 21 / 0;
        }
        int i6 = i3 + 93;
        f2977 = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2939(v vVar) {
        int i2 = f2979;
        int i3 = i2 + 65;
        f2977 = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = vVar.f2983;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 93;
        f2977 = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ e m2941(v vVar) {
        int i2 = f2977;
        f2979 = (i2 + 21) % 128;
        e eVar = vVar.f2984;
        int i3 = i2 + 99;
        f2979 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 29 / 0;
        }
        return eVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2948(v vVar) {
        int i2 = (f2979 + 71) % 128;
        f2977 = i2;
        boolean z2 = vVar.f2986;
        int i3 = i2 + 111;
        f2979 = i3 % 128;
        if (i3 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void mo2953(Activity activity) {
        f2977 = (f2979 + 117) % 128;
        m2952(activity);
        f2979 = (f2977 + 81) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2940(v vVar, boolean z2) {
        int i2 = f2979;
        f2977 = (i2 + 59) % 128;
        vVar.f2986 = z2;
        f2977 = (i2 + 45) % 128;
        return z2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: avoid collision after fix types in other method and contains not printable characters */
    public static /* synthetic */ String m2942(Activity activity) {
        f2977 = (f2979 + 45) % 128;
        String strM2931 = m2931(activity);
        f2977 = (f2979 + 7) % 128;
        return strM2931;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2949(v vVar, Activity activity) {
        int i2 = f2979 + 11;
        f2977 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM2933 = vVar.m2933(activity);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        int i5 = f2977 + 39;
        f2979 = i5 % 128;
        if (i5 % 2 == 0) {
            return zM2933;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ void mo2954(Activity activity, String str) {
        f2979 = (f2977 + 121) % 128;
        m2957(activity, str);
        f2979 = (f2977 + 49) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2955(jh jhVar) {
        int i2 = f2977 + 83;
        f2979 = i2 % 128;
        int i3 = i2 % 2;
        this.f2989 = jhVar;
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2935(v vVar, boolean z2) {
        int i2 = f2979;
        int i3 = i2 + 33;
        f2977 = i3 % 128;
        int i4 = i3 % 2;
        vVar.f2988 = z2;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 77;
        f2977 = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2945() {
        f2979 = (f2977 + 103) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2950(v vVar, boolean z2) {
        int i2 = f2977;
        f2979 = (i2 + 21) % 128;
        vVar.f2985 = z2;
        int i3 = i2 + 17;
        f2979 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 6 / 0;
        }
        return z2;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﻛ */
    public final p<WebView, Activity> mo230() {
        f2979 = (f2977 + 51) % 128;
        return this;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2956() {
        int i2 = f2977 + 79;
        f2979 = i2 % 128;
        if (i2 % 2 != 0) {
            ji.m2594().m2597(this);
            throw null;
        }
        ji.m2594().m2597(this);
        f2979 = (f2977 + 103) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        com.p004ironsource.adqualitysdk.sdk.i.s.m2922(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.v.e.m2964(r2.f2984) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.v.e.m2964(r2.f2984) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        com.p004ironsource.adqualitysdk.sdk.i.s.m2924(r3);
        com.p004ironsource.adqualitysdk.sdk.i.v.f2979 = (com.p004ironsource.adqualitysdk.sdk.i.v.f2977 + 47) % 128;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m2944(com.p004ironsource.adqualitysdk.sdk.i.it r3) {
        /*
            r2 = this;
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.v.f2979
            int r0 = r0 + 83
            int r1 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.v.f2977 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L19
            com.ironsource.adqualitysdk.sdk.i.v$e r0 = r2.f2984
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.v.e.m2964(r0)
            r1 = 19
            int r1 = r1 / 0
            if (r0 == 0) goto L22
            goto L2e
        L19:
            com.ironsource.adqualitysdk.sdk.i.v$e r0 = r2.f2984
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.v.e.m2964(r0)
            r1 = 1
            if (r0 == r1) goto L2e
        L22:
            com.p004ironsource.adqualitysdk.sdk.i.s.m2924(r3)
            int r3 = com.p004ironsource.adqualitysdk.sdk.i.v.f2977
            int r3 = r3 + 47
            int r3 = r3 % 128
            com.p004ironsource.adqualitysdk.sdk.i.v.f2979 = r3
            return
        L2e:
            com.p004ironsource.adqualitysdk.sdk.i.s.m2922(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.v.m2944(com.ironsource.adqualitysdk.sdk.i.it):void");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2951() {
        f2977 = (f2979 + 31) % 128;
        m3006((p) null);
        m2955((jh) null);
        ji.m2594().m2596(this);
        int i2 = f2977 + 81;
        f2979 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.jh
    /* JADX INFO: renamed from: ﻛ */
    public final void mo394(final Activity activity) {
        s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.2
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (v.m2949(v.this, activity)) {
                    v.m2934(v.this).mo394(activity);
                }
            }
        });
        f2979 = (f2977 + 7) % 128;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.jh
    /* JADX INFO: renamed from: ｋ */
    public final void mo395(final Activity activity) {
        s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.5
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (v.m2949(v.this, activity)) {
                    v.m2934(v.this).mo395(activity);
                }
            }
        });
        int i2 = f2979 + 115;
        f2977 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2958(JSONObject jSONObject) {
        e eVar = new e(this, jSONObject);
        m2976((w.e) eVar);
        this.f2984 = eVar;
        s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.1

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f2990 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f2991 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f2992 = 4990807707552663920L;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m2959(String str, int i2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (f.f1955) {
                    try {
                        char[] cArrM2116 = f.m2116(f2992, cArr, i2);
                        f.f1954 = 4;
                        while (true) {
                            int i3 = f.f1954;
                            if (i3 < cArrM2116.length) {
                                int i4 = i3 - 4;
                                f.f1953 = i4;
                                cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f2992));
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

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                try {
                    v vVar = v.this;
                    v.m2938(vVar, Class.forName(e.m2971(v.m2941(vVar))));
                    s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.1.3
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            v.this.m2956();
                        }
                    });
                    f2991 = (f2990 + 31) % 128;
                } catch (ClassNotFoundException e2) {
                    String strIntern = m2959("ᕷၵ塡臱ᔶ奦쫵巈チ缬\ue0b5莘庶蓡虉Ꙁ摙ꪡ尭찄舅", TextUtils.getOffsetAfter("", 0)).intern();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m2959("呰ᔬ剿鿏吵尮샭䏰燂稼\ueab3鶶ᾃ膨豺롱╙꿲嘸퉿쌄\uf533箿\uecfa\ue8c6፹ᶱګ뚃㻼❰ⅹ尐", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern());
                    sb.append(e.m2971(v.m2941(v.this)));
                    sb.append(m2959("蠒镛駙⎖蠨\udc0b", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
                    sb.append(e2.getLocalizedMessage());
                    n.m2835(strIntern, sb.toString());
                }
            }
        });
        int i2 = f2977 + 71;
        f2979 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static View m2946(Activity activity) {
        f2979 = (f2977 + 105) % 128;
        View viewFindViewById = activity.findViewById(R.id.content);
        int i2 = f2977 + 7;
        f2979 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: ﻐ, reason: avoid collision after fix types in other method and contains not printable characters */
    public final void m2952(Activity activity) {
        boolean z2;
        int i2 = f2979 + 53;
        f2977 = i2 % 128;
        if (i2 % 2 == 0) {
            super.mo2953(activity);
            z2 = true;
        } else {
            super.mo2953(activity);
            z2 = false;
        }
        this.f2986 = z2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2957(Activity activity, String str) {
        if (this.f2986) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ik.f2420, true);
                f2977 = (f2979 + 105) % 128;
            } catch (JSONException e2) {
                String strIntern = m2943("칡饓ᛡ\ueec8\uf1f8黇\ude23躑总蔦\udc61\uebf2䦔旻줧뿦㱶鋌", (ViewConfiguration.getPressedStateDuration() >> 16) + 17).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m2943("\u0cf4\uea0f≳ꤙ㺛荋俊熘酋遛⑶櫆ᒺ㧂䕻\ue02aТ뽾㾁藘䦔旻쟤附䁅萡쎎㑄捝⯉㶲\ueba6", 33 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
                sb.append(e2.getLocalizedMessage());
                n.m2835(strIntern, sb.toString());
            }
            m2977(jSONObject, activity, str);
            return;
        }
        int i2 = f2977 + 125;
        f2979 = i2 % 128;
        int i3 = i2 % 2;
        this.f2986 = true;
        super.mo2954(activity, str);
    }

    /* JADX INFO: renamed from: ﾒ, reason: avoid collision after fix types in other method and contains not printable characters */
    private void m2947(Activity activity, List<WebView> list) {
        f2977 = (f2979 + 69) % 128;
        ke.m2787(activity, WebView.class, e.m2969(this.f2984), e.m2966(this.f2984), false, false, null, this.f2984.f3050, list);
        int i2 = f2979 + 31;
        f2977 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾒ */
    public final ab mo234() {
        ac acVar = new ac();
        int i2 = f2977 + 89;
        f2979 = i2 % 128;
        if (i2 % 2 == 0) {
            return acVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2943(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2870) {
            try {
                char[] cArr2 = new char[cArr.length];
                m.f2869 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = m.f2869;
                    if (i3 < cArr.length) {
                        cArr3[0] = cArr[i3];
                        cArr3[1] = cArr[i3 + 1];
                        int i4 = 58224;
                        for (int i5 = 0; i5 < 16; i5++) {
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f2978)) ^ ((c3 >>> 5) + f2976)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f2980) ^ ((c4 + i4) ^ ((c4 << 4) + f2981))));
                            i4 -= 40503;
                        }
                        int i6 = m.f2869;
                        cArr2[i6] = cArr3[0];
                        cArr2[i6 + 1] = cArr3[1];
                        m.f2869 = i6 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}

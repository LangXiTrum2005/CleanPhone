package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ad extends u<View, Activity> {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f75 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f76 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f77 = {'9', 'k', 'h', 'h', 'i', 'g', 'T', ']', 'k', 'R', '\\', 'n', 'g', '_', 16, 'C', 'j', 'k', 'n', 't', 'l', 'f', 'C', 'I', 'p', 'p', 'r', '[', '2', 'I', 's', 'j', 'f', 'g', '?', 132, 132, '`', 'Y', 155, 156, 23};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Class f79;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private View.OnLayoutChangeListener f82;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jv f83;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private jc f86;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final Map<WebView, z> f84 = new WeakHashMap();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final Map<View, ad> f85 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private final Map<View, View.OnLayoutChangeListener> f81 = new WeakHashMap();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private a f78 = new a();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final List<View> f80 = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a {

        /* JADX INFO: renamed from: リ, reason: contains not printable characters */
        private static int f98 = 0;

        /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
        private static int f99 = 1;

        /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
        private static short[] f100 = null;

        /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
        private static int f101 = 93;

        /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
        private static long f102 = 18995913069435934L;

        /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
        private static int f103 = 653552270;

        /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
        private static int f104 = 679993649;

        /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
        private static byte[] f105 = {-2, 6, -10, 8, 2, 17, -39, 18, -4, 19, -14, 3, 17, -2, -5, -4, 37, -38, 27, -31, 9, 6, 9, -4, -3, 41, -52, 18, -4, 19, -12, -3, 14, -14, -14, -2, 6, 9, -4, -3, 41, -34, -8, -2, -3, 10, 37, -31, -3, 14, -14, -14, -2, 4, 7, -9, 15, -16, 18, -21, 21, 23, -27, -14, -2, 41, -23, -17, -2, -4, 51, -32, -14, -2, 3, -4, -13, 10, 20, -26, 5, 8, 20, -33, 31, -36, -4, 18, -4, 19, -29, 0, 14, 2, -12, -3, 2, -13, 3, 1, 7, 30, -38, 27, -31, 14, -4, -11, 11, -13, 13, -11, 17, 2, 0, 0, 0, 0, 0, 0, 0, 0};

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private boolean f110;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private boolean f111;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private boolean f112;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f113;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f114;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f115;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f116;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private String f117;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f118;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean f119;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f120;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private List<Integer> f107 = new ArrayList();

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private List<String> f106 = new ArrayList();

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private List<String> f108 = new ArrayList();

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private List<String> f109 = new ArrayList();

        public a() {
        }

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        public static /* synthetic */ List m256(a aVar) {
            int i10 = f99 + 75;
            f98 = i10 % 128;
            int i11 = i10 % 2;
            List<String> list = aVar.f109;
            if (i11 == 0) {
                return list;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        public static /* synthetic */ boolean m257(a aVar) {
            int i10 = (f98 + InterfaceC0435l1.d.b.f29107d) % 128;
            f99 = i10;
            boolean z10 = aVar.f115;
            int i11 = i10 + 29;
            f98 = i11 % 128;
            if (i11 % 2 == 0) {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        public static /* synthetic */ String m258(a aVar) {
            int i10 = f98 + 89;
            f99 = i10 % 128;
            int i11 = i10 % 2;
            String str = aVar.f120;
            if (i11 == 0) {
                int i12 = 81 / 0;
            }
            return str;
        }

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        public static /* synthetic */ boolean m259(a aVar) {
            int i10 = f98;
            f99 = (i10 + 27) % 128;
            boolean z10 = aVar.f119;
            int i11 = i10 + InterfaceC0435l1.d.b.f29109f;
            f99 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 63 / 0;
            }
            return z10;
        }

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        public static /* synthetic */ boolean m260(a aVar) {
            int i10 = (f99 + 21) % 128;
            f98 = i10;
            boolean z10 = aVar.f111;
            int i11 = i10 + 91;
            f99 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 13 / 0;
            }
            return z10;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public static /* synthetic */ boolean m262(a aVar) {
            int i10 = f98 + 125;
            f99 = i10 % 128;
            int i11 = i10 % 2;
            boolean z10 = aVar.f114;
            if (i11 != 0) {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public static /* synthetic */ boolean m264(a aVar) {
            int i10 = (f98 + 77) % 128;
            f99 = i10;
            boolean z10 = aVar.f113;
            int i11 = i10 + 29;
            f98 = i11 % 128;
            if (i11 % 2 == 0) {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public static /* synthetic */ boolean m265(a aVar) {
            int i10 = f99;
            f98 = (i10 + 79) % 128;
            boolean z10 = aVar.f110;
            f98 = (i10 + 39) % 128;
            return z10;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public static /* synthetic */ String m266(a aVar) {
            int i10 = f98 + 33;
            int i11 = i10 % 128;
            f99 = i11;
            int i12 = i10 % 2;
            String str = aVar.f116;
            if (i12 == 0) {
                throw null;
            }
            f98 = (i11 + 53) % 128;
            return str;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        public static /* synthetic */ String m267(a aVar) {
            int i10 = (f98 + 9) % 128;
            f99 = i10;
            String str = aVar.f117;
            int i11 = i10 + 95;
            f98 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 36 / 0;
            }
            return str;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ List m271(a aVar) {
            int i10 = f99 + 1;
            int i11 = i10 % 128;
            f98 = i11;
            int i12 = i10 % 2;
            List<String> list = aVar.f106;
            if (i12 != 0) {
                int i13 = 78 / 0;
            }
            int i14 = i11 + 117;
            f99 = i14 % 128;
            if (i14 % 2 != 0) {
                return list;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ List m274(a aVar) {
            int i10 = f99;
            int i11 = i10 + 5;
            f98 = i11 % 128;
            int i12 = i11 % 2;
            List<String> list = aVar.f108;
            if (i12 != 0) {
                throw null;
            }
            int i13 = i10 + 107;
            f98 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 59 / 0;
            }
            return list;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ boolean m279(a aVar) {
            int i10 = (f99 + 93) % 128;
            f98 = i10;
            boolean z10 = aVar.f112;
            int i11 = i10 + InterfaceC0435l1.d.b.f29107d;
            f99 = i11 % 128;
            if (i11 % 2 != 0) {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ String m283(a aVar) {
            int i10 = f98 + 79;
            f99 = i10 % 128;
            int i11 = i10 % 2;
            String str = aVar.f118;
            if (i11 == 0) {
                int i12 = 46 / 0;
            }
            return str;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ List m287(a aVar) {
            int i10 = f98;
            int i11 = i10 + 59;
            f99 = i11 % 128;
            int i12 = i11 % 2;
            List<Integer> list = aVar.f107;
            if (i12 == 0) {
                int i13 = 25 / 0;
            }
            f99 = (i10 + 3) % 128;
            return list;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private a m261(boolean z10) {
            int i10 = f98 + 119;
            f99 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f110 = z10;
                return this;
            }
            this.f110 = z10;
            throw null;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private a m263(boolean z10) {
            int i10 = (f98 + 83) % 128;
            f99 = i10;
            this.f111 = z10;
            int i11 = i10 + 25;
            f98 = i11 % 128;
            if (i11 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private a m270(boolean z10) {
            int i10 = f98;
            this.f119 = z10;
            f99 = (i10 + 29) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private a m273(boolean z10) {
            int i10 = (f99 + InterfaceC0435l1.d.b.f29114k) % 128;
            f98 = i10;
            this.f112 = z10;
            int i11 = i10 + 89;
            f99 = i11 % 128;
            if (i11 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private a m275(String str) {
            int i10 = f99 + 63;
            int i11 = i10 % 128;
            f98 = i11;
            if (i10 % 2 != 0) {
                this.f118 = str;
                throw null;
            }
            this.f118 = str;
            f99 = (i11 + 89) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private a m280(String str) {
            int i10 = f99;
            int i11 = i10 + 57;
            f98 = i11 % 128;
            if (i11 % 2 != 0) {
                this.f117 = str;
                throw null;
            }
            this.f117 = str;
            int i12 = i10 + 121;
            f98 = i12 % 128;
            if (i12 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m284(String str) {
            int i10 = f99;
            this.f116 = str;
            int i11 = i10 + 75;
            f98 = i11 % 128;
            if (i11 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private a m268(String str) {
            int i10 = f98;
            this.f120 = str;
            int i11 = i10 + 29;
            f99 = i11 % 128;
            if (i11 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private a m272(List<String> list) {
            int i10 = f99;
            int i11 = i10 + 81;
            f98 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            if (list != null) {
                this.f109 = list;
            }
            f98 = (i10 + InterfaceC0435l1.d.b.f29110g) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m285(boolean z10) {
            int i10 = f99 + 39;
            f98 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f114 = z10;
                return this;
            }
            this.f114 = z10;
            throw null;
        }

        public a(JSONObject jSONObject) {
            m275(jSONObject.optString(m286("᱿鬑ኞ訶Ǘ륾ミ꾟✧\udeae噃췉䕻ﰜ管", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34666).intern()));
            m284(jSONObject.optString(m278((byte) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (-653552269) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-679993552) - (ViewConfiguration.getTapTimeout() >> 16), (short) Color.blue(0), AndroidCharacter.getMirror('0') - 128).intern()));
            m280(jSONObject.optString(m278((byte) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1), (-653552258) - ExpandableListView.getPackedPositionType(0L), KeyEvent.normalizeMetaState(0) - 679993543, (short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (Process.myTid() >> 22) - 83).intern()));
            m270(jSONObject.optBoolean(m278((byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.blue(0) - 653552249, View.resolveSize(0, 0) - 679993532, (short) (Process.myTid() >> 22), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 77).intern()));
            jSONObject.optBoolean(m278((byte) (ViewConfiguration.getTapTimeout() >> 16), (-653552234) - KeyEvent.getDeadChar(0, 0), (-679993533) - ImageFormat.getBitsPerPixel(0), (short) (TextUtils.lastIndexOf("", '0', 0) + 1), (-76) - Process.getGidForName("")).intern());
            m268(jSONObject.optString(m286("ᱫᦟប\u0d97\u0ba0Ǆ㿊㗒㏾", Color.red(0) + 1523).intern()));
            m277(jSONObject.optBoolean(m286("ᱷ\udd14麢堔ᦎ\udb2a钾嘴ភ턻", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 49529).intern()));
            m285(jSONObject.optBoolean(m286("ᱸ൜㸶⿺壏䦬筵摋锒蛊랰ꂝ퉇쌡\uec0d຺ᷓ㾐", (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 4397).intern()));
            m273(jSONObject.optBoolean(m286("ᱬ\\\u2433䠞泰邮뒝\ud979﵃", View.MeasureSpec.getMode(0) + 7207).intern()));
            m282(jSONObject.optBoolean(m278((byte) Color.green(0), KeyEvent.normalizeMetaState(0) - 653552217, (-679993532) - View.MeasureSpec.getSize(0), (short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-81) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), true));
            m263(jSONObject.optBoolean(m278((byte) Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) - 653552204, (-679993532) - Gravity.getAbsoluteGravity(0, 0), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (-83) - (Process.myPid() >> 22)).intern()));
            m261(jSONObject.optBoolean(m278((byte) View.combineMeasuredStates(0, 0), (-653552196) - Color.green(0), View.resolveSize(0, 0) - 679993537, (short) (ViewConfiguration.getEdgeSlop() >> 16), (-69) - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), true));
            m269(kj.m2852(jSONObject.optJSONArray(m286("ᱨ嵦鹙\udf5a᠓夯騋", TextUtils.getCapsMode("", 0, 0) + 16657).intern())));
            m276(kj.m2852(jSONObject.optJSONArray(m278((byte) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (-653552174) - MotionEvent.axisFromString(""), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 679993553, (short) (Color.rgb(0, 0, 0) + 16777216), (KeyEvent.getMaxKeyCode() >> 16) - 75).intern())));
            m281(kj.m2852(jSONObject.optJSONArray(m286("ᱨ䏄ꌝͰ抡숵≃膲\ue1e1䄻ꂏÝ怟", 24499 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())));
            m272(kj.m2852(jSONObject.optJSONArray(m286("ᱽ搡\uecd9璔ﴡ䗤춟嘏\udee9⚾꽅㟪뾊", View.resolveSize(0, 0) + 30803).intern())));
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private a m277(boolean z10) {
            int i10 = (f98 + 33) % 128;
            f99 = i10;
            this.f113 = z10;
            int i11 = i10 + 63;
            f98 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 5 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private a m282(boolean z10) {
            int i10 = f98 + 1;
            f99 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f115 = z10;
                int i11 = 29 / 0;
                return this;
            }
            this.f115 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private a m269(List<Integer> list) {
            int i10 = f98;
            int i11 = i10 + 29;
            f99 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (list == null) {
                return this;
            }
            int i12 = i10 + 63;
            f99 = i12 % 128;
            if (i12 % 2 != 0) {
                this.f107 = list;
                return this;
            }
            this.f107 = list;
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m286(String str, int i10) {
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
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f102);
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

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private a m276(List<String> list) {
            int i10 = f99 + InterfaceC0435l1.d.b.f29105b;
            int i11 = i10 % 128;
            f98 = i11;
            if (i10 % 2 == 0) {
                if (list != null) {
                    f99 = (i11 + 5) % 128;
                    this.f106 = list;
                }
                int i12 = i11 + 87;
                f99 = i12 % 128;
                if (i12 % 2 != 0) {
                    return this;
                }
                throw null;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private a m281(List<String> list) {
            if (list != null) {
                int i10 = f98;
                this.f108 = list;
                f99 = (i10 + 79) % 128;
            }
            int i11 = f99 + 81;
            f98 = i11 % 128;
            if (i11 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m278(byte b10, int i10, int i11, short s10, int i12) {
            String string;
            synchronized (n.f3070) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f101;
                    int i14 = i12 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f105;
                        if (bArr != null) {
                            i14 = (byte) (bArr[f103 + i10] + i13);
                        } else {
                            i14 = (short) (f100[f103 + i10] + i13);
                        }
                    }
                    if (i14 > 0) {
                        n.f3072 = ((i10 + i14) - 2) + f103 + i15;
                        n.f3073 = b10;
                        char c4 = (char) (i11 + f104);
                        n.f3074 = c4;
                        sb2.append(c4);
                        n.f3075 = n.f3074;
                        n.f3071 = 1;
                        while (n.f3071 < i14) {
                            byte[] bArr2 = f105;
                            if (bArr2 != null) {
                                int i16 = n.f3072;
                                n.f3072 = i16 - 1;
                                n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                            } else {
                                short[] sArr = f100;
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

    public ad(JSONObject jSONObject, jc jcVar) {
        m243(jSONObject, jcVar);
        m230();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ a m225(ad adVar) {
        int i10 = f75;
        f76 = (i10 + 119) % 128;
        a aVar = adVar.f78;
        f76 = (i10 + 41) % 128;
        return aVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ List m229(ad adVar) {
        int i10 = f75 + 83;
        int i11 = i10 % 128;
        f76 = i11;
        int i12 = i10 % 2;
        List<View> list = adVar.f80;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i11 + 43;
        f75 = i13 % 128;
        if (i13 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Class m233(ad adVar) {
        int i10 = f76;
        f75 = (i10 + InterfaceC0435l1.d.b.f29105b) % 128;
        Class cls = adVar.f79;
        int i11 = i10 + InterfaceC0435l1.d.b.f29112i;
        f75 = i11 % 128;
        if (i11 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ View.OnLayoutChangeListener m236(ad adVar) {
        int i10 = f76;
        f75 = (i10 + 97) % 128;
        View.OnLayoutChangeListener onLayoutChangeListener = adVar.f82;
        int i11 = i10 + InterfaceC0435l1.d.b.f29107d;
        f75 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 92 / 0;
        }
        return onLayoutChangeListener;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.u
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ String mo244(Activity activity) {
        int i10 = f75 + 93;
        f76 = i10 % 128;
        if (i10 % 2 == 0) {
            m226();
            throw null;
        }
        String strM226 = m226();
        int i11 = f75 + 81;
        f76 = i11 % 128;
        if (i11 % 2 != 0) {
            return strM226;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m226() {
        int i10 = f75 + 57;
        f76 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 10 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m235(ad adVar, List list) {
        int i10 = f75 + 125;
        f76 = i10 % 128;
        int i11 = i10 % 2;
        adVar.m231((List<View>) list);
        if (i11 == 0) {
            int i12 = 16 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static <E extends View> void m237(Activity activity, View view, Class<E> cls, boolean z10, List<Integer> list, List<String> list2, List<E> list3) {
        f75 = (f76 + 115) % 128;
        if (view == null) {
            kq.m2952(activity, cls, z10, list, list2, list3);
        } else {
            kq.m2953(view, cls, false, z10, list, list2, list3);
            f75 = (f76 + 13) % 128;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Map m239(ad adVar) {
        int i10 = f76 + 59;
        f75 = i10 % 128;
        int i11 = i10 % 2;
        Map<View, View.OnLayoutChangeListener> map = adVar.f81;
        if (i11 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m243(JSONObject jSONObject, jc jcVar) {
        this.f78 = new a(jSONObject);
        this.f86 = jcVar;
        f76 = (f75 + 99) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m228(View view, List<String> list) {
        if (list != null) {
            f76 = (f75 + 5) % 128;
            if (!list.isEmpty()) {
                String name = view.getClass().getPackage().getName();
                Iterator<String> it = list.iterator();
                f75 = (f76 + 21) % 128;
                while (it.hasNext()) {
                    f76 = (f75 + 51) % 128;
                    String strM234 = m234(it.next());
                    if (!TextUtils.isEmpty(strM234)) {
                        int i10 = f76 + 83;
                        f75 = i10 % 128;
                        if (i10 % 2 != 0) {
                            name.startsWith(strM234);
                            throw null;
                        }
                        if (name.startsWith(strM234)) {
                            f75 = (f76 + 49) % 128;
                            return true;
                        }
                    }
                }
                int i11 = f75 + 19;
                f76 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 84 / 0;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private t<WebView, Activity> m232() {
        ba.d dVar = new ba.d() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.2
            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo246(JSONObject jSONObject, Object obj, Object obj2) {
                ad.this.mo246(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo248(JSONObject jSONObject, Object obj, Object obj2) {
                ad.this.mo248(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo249(JSONObject jSONObject, Object obj, Object obj2) {
                ad.this.mo249(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo251(JSONObject jSONObject, Object obj, Object obj2) {
                ad.this.mo251(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo252(JSONObject jSONObject, Object obj, Object obj2) {
                ad.this.mo252(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo247(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                ad.this.mo247(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo250(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                ad.this.mo250(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo253(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                ad.this.mo253(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }
        };
        int i10 = f76 + 79;
        f75 = i10 % 128;
        if (i10 % 2 == 0) {
            return dVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m240(Activity activity, View view, Class cls, boolean z10, List list, List list2, List list3) {
        int i10 = f76 + 5;
        f75 = i10 % 128;
        int i11 = i10 % 2;
        m237(activity, view, cls, z10, list, list2, list3);
        if (i11 != 0) {
            throw null;
        }
        f76 = (f75 + InterfaceC0435l1.d.b.f29114k) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m230() {
        this.f82 = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.5

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f94 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char[] f95 = {'9', 'k', 'h', 'h', 'i', 'g', 'T', ']', 'k', 'R', '\\', 'n', 'g', '_', '0', 'g', 'j', 'f', 'U', '[', 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'G', 'n', ']', 'V', 'm', 't', 'r', 't', '[', 'U'};

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f96;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m255(boolean z10, String str, int[] iArr) throws UnsupportedEncodingException {
                String str2;
                Object bytes = str;
                if (str != null) {
                    bytes = str.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                synchronized (h.f2261) {
                    try {
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int i12 = iArr[2];
                        int i13 = iArr[3];
                        char[] cArr = new char[i11];
                        System.arraycopy(f95, i10, cArr, 0, i11);
                        if (bArr != null) {
                            char[] cArr2 = new char[i11];
                            h.f2262 = 0;
                            char c4 = 0;
                            while (true) {
                                int i14 = h.f2262;
                                if (i14 >= i11) {
                                    break;
                                }
                                if (bArr[i14] == 1) {
                                    cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                                } else {
                                    cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                                }
                                c4 = cArr2[i14];
                                h.f2262 = i14 + 1;
                            }
                            cArr = cArr2;
                        }
                        if (i13 > 0) {
                            char[] cArr3 = new char[i11];
                            System.arraycopy(cArr, 0, cArr3, 0, i11);
                            int i15 = i11 - i13;
                            System.arraycopy(cArr3, 0, cArr, i15, i13);
                            System.arraycopy(cArr3, i13, cArr, 0, i15);
                        }
                        if (z10) {
                            char[] cArr4 = new char[i11];
                            h.f2262 = 0;
                            while (true) {
                                int i16 = h.f2262;
                                if (i16 >= i11) {
                                    break;
                                }
                                cArr4[i16] = cArr[(i11 - i16) - 1];
                                h.f2262 = i16 + 1;
                            }
                            cArr = cArr4;
                        }
                        if (i12 > 0) {
                            h.f2262 = 0;
                            while (true) {
                                int i17 = h.f2262;
                                if (i17 >= i11) {
                                    break;
                                }
                                cArr[i17] = (char) (cArr[i17] - iArr[2]);
                                h.f2262 = i17 + 1;
                            }
                        }
                        str2 = new String(cArr);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                f96 = (f94 + 31) % 128;
                try {
                    ad.this.m242(view);
                    f96 = (f94 + 3) % 128;
                } catch (Throwable th2) {
                    kl.m2899(m255(true, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001", new int[]{0, 14, 0, 0}).intern(), m255(false, "\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001", new int[]{14, 23, 0, 4}).intern(), th2, false);
                }
            }
        };
        this.f83 = new jv() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.4
            @Override // com.ironsource.adqualitysdk.sdk.i.jv
            /* JADX INFO: renamed from: ﻛ */
            public final void mo210(View view) {
                view.removeOnLayoutChangeListener(ad.m236(ad.this));
                ad.m239(ad.this).remove(view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jv
            /* JADX INFO: renamed from: ｋ */
            public final void mo213(View view) {
                view.addOnLayoutChangeListener(ad.m236(ad.this));
                ad.m239(ad.this).put(view, ad.m236(ad.this));
            }
        };
        jp.m2705().m2710(this.f83);
        int i10 = f76 + 81;
        f75 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 92 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m234(String str) {
        List listAsList;
        f76 = (f75 + 25) % 128;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i10 = f75 + 87;
        f76 = i10 % 128;
        if (i10 % 2 == 0) {
            listAsList = Arrays.asList(str.split(m227(false, "\u0000\u0001\u0001", new int[]{38, 3, 87, 0}).intern()));
            if (listAsList.size() <= 2) {
                return str;
            }
        } else {
            listAsList = Arrays.asList(str.split(m227(false, "\u0000\u0001\u0001", new int[]{38, 3, 87, 0}).intern()));
            if (listAsList.size() <= 3) {
                return str;
            }
        }
        return TextUtils.join(m227(false, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{41, 1, 0, 0}).intern(), listAsList.subList(0, 3));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m245() {
        m3075((t) null);
        jp.m2705().m2709(this.f83);
        HashSet hashSet = new HashSet(this.f81.keySet());
        this.f81.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).removeOnLayoutChangeListener(this.f82);
            f75 = (f76 + InterfaceC0435l1.d.b.f29114k) % 128;
        }
        f76 = (f75 + 7) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r4 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r4.f86.mo1656(r5) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.ad.f76 + 57;
        com.ironsource.adqualitysdk.sdk.i.ad.f75 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if ((r4 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        r4 = 53 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m238(android.view.View r5) {
        /*
            r4 = this;
            com.ironsource.adqualitysdk.sdk.i.jc r0 = r4.f86
            r1 = 1
            if (r0 != 0) goto Le
            int r4 = com.ironsource.adqualitysdk.sdk.i.ad.f75
            int r4 = r4 + 23
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.ad.f76 = r4
            return r1
        Le:
            com.ironsource.adqualitysdk.sdk.i.ad$a r0 = r4.f78
            java.util.List r0 = com.ironsource.adqualitysdk.sdk.i.ad.a.m256(r0)
            boolean r0 = m228(r5, r0)
            r2 = 0
            if (r0 == 0) goto L4b
            int r0 = com.ironsource.adqualitysdk.sdk.i.ad.f75
            int r0 = r0 + 75
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ad.f76 = r3
            int r0 = r0 % 2
            if (r0 != 0) goto L33
            com.ironsource.adqualitysdk.sdk.i.jc r4 = r4.f86
            boolean r4 = r4.mo1656(r5)
            r5 = 37
            int r5 = r5 / r2
            if (r4 == 0) goto L4b
            goto L3b
        L33:
            com.ironsource.adqualitysdk.sdk.i.jc r4 = r4.f86
            boolean r4 = r4.mo1656(r5)
            if (r4 == 0) goto L4b
        L3b:
            int r4 = com.ironsource.adqualitysdk.sdk.i.ad.f76
            int r4 = r4 + 57
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.ad.f75 = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L4a
            r4 = 53
            int r4 = r4 / r2
        L4a:
            return r1
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ad.m238(android.view.View):boolean");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m242(final View view) {
        try {
            if (this.f79 == null) {
                this.f79 = Class.forName(a.m283(this.f78));
            }
            final Activity activityMo2738 = jt.m2734().mo2738();
            if (activityMo2738 == null) {
                int i10 = f76 + 29;
                f75 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                return;
            }
            if (!a.m271(this.f78).isEmpty()) {
                f75 = (f76 + 79) % 128;
                Activity activityM2955 = kq.m2955(view);
                if (activityM2955 != null) {
                    int i11 = f76 + InterfaceC0435l1.d.b.f29109f;
                    f75 = i11 % 128;
                    if (i11 % 2 == 0) {
                        if (a.m271(this.f78).contains(activityM2955.getClass().getName())) {
                            return;
                        }
                    } else {
                        a.m271(this.f78).contains(activityM2955.getClass().getName());
                        throw null;
                    }
                }
            }
            p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.3
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                public final void mo254() {
                    ad.m229(ad.this).clear();
                    ad.m240(activityMo2738, view, ad.m233(ad.this), a.m279(ad.m225(ad.this)), a.m287(ad.m225(ad.this)), a.m274(ad.m225(ad.this)), ad.m229(ad.this));
                    if (kq.m2950(view, ad.m233(ad.this), null, a.m287(ad.m225(ad.this)), a.m274(ad.m225(ad.this)))) {
                        ad.m229(ad.this).add(view);
                    }
                    final ArrayList arrayList = new ArrayList(ad.m229(ad.this));
                    if (a.m265(ad.m225(ad.this))) {
                        p.m2994(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.3.5
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* JADX INFO: renamed from: ｋ */
                            public final void mo254() {
                                ad.m235(ad.this, arrayList);
                            }
                        });
                    } else {
                        ad.m235(ad.this, arrayList);
                    }
                }
            });
        } catch (Throwable th2) {
            String strIntern = m227(true, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001", new int[]{0, 14, 0, 0}).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m227(true, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", new int[]{14, 20, 0, 14}).intern());
            sb2.append(a.m283(this.f78));
            sb2.append(m227(true, "\u0000\u0001\u0001", new int[]{34, 3, 94, 0}).intern());
            sb2.append(th2.getLocalizedMessage());
            m.m2972(strIntern, sb2.toString());
            m245();
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m241(View view, a aVar) {
        List<String> list;
        if (m238(view)) {
            f76 = (f75 + 21) % 128;
            if (a.m264(aVar)) {
                if (this.f85.get(view) == null) {
                    this.f85.put(view, this);
                    mo249(new JSONObject(), view, null);
                    return;
                } else {
                    if (a.m262(aVar)) {
                        mo249(new JSONObject(), view, null);
                        return;
                    }
                    return;
                }
            }
            ArrayList<WebView> arrayList = new ArrayList();
            kq.m2953(view, WebView.class, false, a.m279(aVar), a.m287(aVar), a.m274(aVar), arrayList);
            if (view instanceof WebView) {
                arrayList.add((WebView) view);
            }
            f76 = (f75 + 67) % 128;
            for (WebView webView : arrayList) {
                f75 = (f76 + 95) % 128;
                if (this.f85.get(webView) == null) {
                    f76 = (f75 + 43) % 128;
                    if (webView.getClass().getName().startsWith(a.m266(aVar))) {
                        ab abVar = new ab();
                        this.f84.put(webView, abVar);
                        String strM267 = a.m267(aVar);
                        if (TextUtils.isEmpty(a.m258(aVar))) {
                            f76 = (f75 + 51) % 128;
                            list = null;
                        } else {
                            List<String> listAsList = Arrays.asList(a.m258(aVar).split(m227(true, (String) null, new int[]{37, 1, 52, 1}).intern()));
                            f76 = (f75 + 35) % 128;
                            list = listAsList;
                        }
                        abVar.m3176(strM267, list, a.m257(aVar), a.m259(aVar), a.m260(aVar));
                        abVar.m3075(m232());
                        abVar.m3180(webView);
                        abVar.m3181(Integer.toHexString(webView.hashCode()));
                        this.f85.put(webView, this);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m227(boolean z10, String str, int[] iArr) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2261) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f77, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    h.f2262 = 0;
                    char c4 = 0;
                    while (true) {
                        int i14 = h.f2262;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                        }
                        c4 = cArr2[i14];
                        h.f2262 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    h.f2262 = 0;
                    while (true) {
                        int i16 = h.f2262;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        h.f2262 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    h.f2262 = 0;
                    while (true) {
                        int i17 = h.f2262;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        h.f2262 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m231(List<View> list) {
        f75 = (f76 + 45) % 128;
        for (int i10 = 0; i10 < list.size(); i10++) {
            f75 = (f76 + 93) % 128;
            m241(list.get(i10), this.f78);
        }
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z<T> extends u<WebView, T> implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f3276 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f3277 = 135;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f3278;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private jz f3279;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f3282;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f3283;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private kd f3284;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f3285;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<String> f3286;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private Map<WebView, kd> f3281 = new WeakHashMap();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private List<jy> f3280 = new ArrayList();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.z$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class AnonymousClass3 implements jy {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f3287 = 1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f3288 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f3289 = 63871;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f3290 = 48595;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char f3291 = 21192;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f3292 = 5221;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f3293 = 100;

        public AnonymousClass3() {
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ void m3182(AnonymousClass3 anonymousClass3, WebView webView, String str, boolean z10) {
            int i10 = f3288 + InterfaceC0435l1.d.b.f29110g;
            f3287 = i10 % 128;
            int i11 = i10 % 2;
            anonymousClass3.m3184(webView, str, z10);
            if (i11 == 0) {
                throw null;
            }
            f3288 = (f3287 + 67) % 128;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m3185(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (o.f3076) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    o.f3077 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i11 = o.f3077;
                        if (i11 < cArr.length) {
                            cArr3[0] = cArr[i11];
                            cArr3[1] = cArr[i11 + 1];
                            int i12 = 58224;
                            for (int i13 = 0; i13 < 16; i13++) {
                                char c4 = cArr3[1];
                                char c5 = cArr3[0];
                                char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f3291)) ^ ((c5 >>> 5) + f3289)));
                                cArr3[1] = c10;
                                cArr3[0] = (char) (c5 - (((c10 >>> 5) + f3290) ^ ((c10 + i12) ^ ((c10 << 4) + f3292))));
                                i12 -= 40503;
                            }
                            int i14 = o.f3077;
                            cArr2[i14] = cArr3[0];
                            cArr2[i14 + 1] = cArr3[1];
                            o.f3077 = i14 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jy
        /* JADX INFO: renamed from: ﻛ */
        public final void mo2765(WebView webView, String str, String str2) {
            f3288 = (f3287 + 7) % 128;
            String strSubstring = str2.substring(0, str2.indexOf(63));
            String strSubstring2 = str2.substring(str2.indexOf(63) + 1);
            if (strSubstring.equals(m3183(TextUtils.indexOf("", "") + 5, "\ufff9\ufffb\ufffa\f\u000b�", true, 6 - Color.argb(0, 0, 0, 0), View.combineMeasuredStates(0, 0) + 204).intern())) {
                z.m3170(z.this, webView);
                return;
            }
            if (strSubstring.equals(m3183(TextUtils.getOffsetBefore("", 0) + 5, "\ufffa￼\ufffb\r\f\ufffb", true, 7 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 204 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                f3288 = (f3287 + 63) % 128;
                JSONObject jSONObjectM3163 = z.m3163(strSubstring2);
                z zVar = z.this;
                zVar.m3178(jSONObjectM3163, webView, zVar.mo201(webView));
                return;
            }
            if (strSubstring.equals(m3185("령봂行䂼⃜헡", 6 - Color.alpha(0)).intern())) {
                JSONObject jSONObjectM3164 = z.m3163(strSubstring2);
                z zVar2 = z.this;
                zVar2.mo247(jSONObjectM3164, webView, z.m3162(zVar2), z.this.mo201(webView));
            } else {
                if (strSubstring.equals(m3185("령봂行䂼ꍛ膈", 6 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    JSONObject jSONObjectM3165 = z.m3163(strSubstring2);
                    jSONObjectM3165.remove(is.f2604);
                    z zVar3 = z.this;
                    zVar3.mo252(jSONObjectM3165, webView, zVar3.mo201(webView));
                    return;
                }
                if (strSubstring.equals(m3183(Color.green(0) + 6, "\u000b\f\ufffa\ufffb\ufff9￼", false, (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 6, ExpandableListView.getPackedPositionChild(0L) + InterfaceC0435l1.c.b.f29100f).intern())) {
                    f3287 = (f3288 + 123) % 128;
                    JSONObject jSONObjectM3166 = z.m3163(strSubstring2);
                    kl.m2901(jSONObjectM3166.optString(m3185("诊镫緕쁟", 3 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()), jSONObjectM3166.optString(m3185("笃\u2cf4瓋瘦緕쁟", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 5).intern()), jSONObjectM3166.optString(m3183((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3, "\u0007\ufffb\n��￼", true, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6, View.MeasureSpec.getSize(0) + 204).intern()), jSONObjectM3166.optString(m3185("笃\u2cf4령봂睎\ue4d0", 5 - ExpandableListView.getPackedPositionType(0L)).intern()));
                }
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jy
        /* JADX INFO: renamed from: ﾒ */
        public final void mo2766(final WebView webView, final String str, final boolean z10) {
            p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.z.3.5
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    if (z.m3169(z.this)) {
                        if (z.m3172(z.this) == null || z.m3172(z.this).isEmpty()) {
                            AnonymousClass3.m3182(AnonymousClass3.this, webView, str, z10);
                            return;
                        }
                        Iterator it = z.m3172(z.this).iterator();
                        while (it.hasNext()) {
                            if (str.startsWith((String) it.next())) {
                                AnonymousClass3.m3182(AnonymousClass3.this, webView, str, z10);
                                return;
                            }
                        }
                    }
                }
            });
            f3288 = (f3287 + 121) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jy
        /* JADX INFO: renamed from: ﻐ */
        public final void mo2763(WebView webView) {
            f3287 = (f3288 + 39) % 128;
            z.m3170(z.this, webView);
            f3288 = (f3287 + 33) % 128;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private void m3184(final WebView webView, final String str, final boolean z10) {
            p.m2994(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.z.3.2
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    final String originalUrl = webView.getOriginalUrl();
                    final Object objMo201 = z.this.mo201(webView);
                    p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.z.3.2.4

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static int f3299 = 1;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static long f3300 = -2112450525286472005L;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f3301;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static String m3186(String str2, int i10) {
                            String str3;
                            Object charArray = str2;
                            if (str2 != null) {
                                charArray = str2.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (g.f2127) {
                                try {
                                    char[] cArrM2229 = g.m2229(f3300, cArr, i10);
                                    g.f2129 = 4;
                                    while (true) {
                                        int i11 = g.f2129;
                                        if (i11 < cArrM2229.length) {
                                            int i12 = i11 - 4;
                                            g.f2128 = i12;
                                            cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f3300));
                                            g.f2129 = i11 + 1;
                                        } else {
                                            str3 = new String(cArrM2229, 4, cArrM2229.length - 4);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return str3;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(is.f2597, str);
                                jSONObject.put(is.f2593, m3186("촕慨쵢⠬ⷕ鳳\ue539", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
                                jSONObject.put(is.f2606, originalUrl);
                                if (z10) {
                                    f3299 = (f3301 + 97) % 128;
                                    jSONObject.put(is.f2605, true);
                                }
                                f3301 = (f3299 + 57) % 128;
                            } catch (JSONException e10) {
                                String strIntern = m3186("\ueb0a瘱\ueb5d捷櫙ჯ깣庾熏石ୢꖅ\udeb6\ueaea恘¾㮪䄢ﴨ湞", TextUtils.getTrimmedLength("") + 1).intern();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m3186("栝뒨桘\u2002좶퉡\ued06ﳨ\uf283딯䠃ߙ嶠⡚⌸ꋖ뢷莰븘찠ρ暪᥇圼溡\ud995\uf463\uf214짻병仜", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern());
                                sb2.append(e10.getLocalizedMessage());
                                m.m2972(strIntern, sb2.toString());
                            }
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            z zVar = z.this;
                            zVar.mo250(jSONObject, webView, z.m3162(zVar), objMo201);
                        }
                    });
                }
            });
            int i10 = f3287 + 27;
            f3288 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jy
        /* JADX INFO: renamed from: ﻛ */
        public final void mo2764(WebView webView, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(is.f2607, str);
                jSONObject.put(is.f2599, is.f2600);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(is.f2603, jSONObject);
                z zVar = z.this;
                zVar.mo253(jSONObject2, webView, this, zVar.mo201(webView));
                f3288 = (f3287 + 67) % 128;
            } catch (Exception e10) {
                kl.m2899(m3183(Gravity.getAbsoluteGravity(0, 0) + 16, "\ufff6\u0004\u0001\ufff5\b\u0004\u0016￠\u0003\uffe7\u0000\r\u0003\u000b\u0004\u0011", false, Drawable.resolveOpacity(0, 0) + 16, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 196).intern(), m3183(6 - Color.argb(0, 0, 0, 0), "\uffc0\u0012\u000f\u0012\u0012￥\u000e\u000f\u0013\n\uffc0\u0014\u000e\u0005\u0016\u0005\uffc0\u0003\u0003\u0017\uffc0\u0007\u000e\t\u0014\u0001\u0005\u0012\u0003", true, AndroidCharacter.getMirror('0') - 19, 195 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), e10, false);
            }
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m3183(int i10, String str, boolean z10, int i11, int i12) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (d.f1625) {
                try {
                    char[] cArr2 = new char[i11];
                    d.f1622 = 0;
                    while (true) {
                        int i13 = d.f1622;
                        if (i13 >= i11) {
                            break;
                        }
                        d.f1624 = cArr[i13];
                        cArr2[d.f1622] = (char) (d.f1624 + i12);
                        int i14 = d.f1622;
                        cArr2[i14] = (char) (cArr2[i14] - f3293);
                        d.f1622 = i14 + 1;
                    }
                    if (i10 > 0) {
                        d.f1623 = i10;
                        char[] cArr3 = new char[i11];
                        System.arraycopy(cArr2, 0, cArr3, 0, i11);
                        int i15 = d.f1623;
                        System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                        int i16 = d.f1623;
                        System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i11];
                        d.f1622 = 0;
                        while (true) {
                            int i17 = d.f1622;
                            if (i17 >= i11) {
                                break;
                            }
                            cArr4[i17] = cArr2[(i11 - i17) - 1];
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
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ ba.d m3162(z zVar) {
        int i10 = f3276 + 17;
        f3278 = i10 % 128;
        if (i10 % 2 == 0) {
            return zVar.m3171();
        }
        zVar.m3171();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m3170(z zVar, WebView webView) {
        f3276 = (f3278 + 55) % 128;
        zVar.m3167(webView);
        int i10 = f3278 + InterfaceC0435l1.d.b.f29109f;
        f3276 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ List m3172(z zVar) {
        int i10 = f3278 + 33;
        int i11 = i10 % 128;
        f3276 = i11;
        int i12 = i10 % 2;
        List<String> list = zVar.f3286;
        if (i12 == 0) {
            int i13 = 91 / 0;
        }
        int i14 = i11 + 95;
        f3278 = i14 % 128;
        if (i14 % 2 == 0) {
            return list;
        }
        throw null;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        try {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                if (this.f3281.containsKey(webView)) {
                    int i18 = f3276 + 79;
                    f3278 = i18 % 128;
                    if (i18 % 2 != 0) {
                        m3167(webView);
                        throw null;
                    }
                    m3167(webView);
                }
            }
            int i19 = f3278 + InterfaceC0435l1.d.b.f29105b;
            f3276 = i19 % 128;
            if (i19 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            kl.m2899(m3165(10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0003￠\u0016\u0004\b\ufff5\u0001\u0004\ufff6\u0011\u0004\u000b\u0003\r\u0000\uffe7", true, 16 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 232).intern(), m3165((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16, "\u0014\u000e\u0018\u0000￫\r\u000e\uffbf\r\b\uffbf\u0011\u000e\u0011\u0011￤\u0004\u0006\r\u0000\u0007￢\u0013", true, 23 - (ViewConfiguration.getTouchSlop() >> 8), 231 - TextUtils.indexOf((CharSequence) "", '0')).intern(), th2, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.t
    /* JADX INFO: renamed from: ﻐ */
    public final /* synthetic */ void mo246(JSONObject jSONObject, Object obj, Object obj2) {
        f3278 = (f3276 + 107) % 128;
        m3168(jSONObject, (WebView) obj, obj2);
        f3278 = (f3276 + 51) % 128;
    }

    /* JADX INFO: renamed from: ﻛ */
    public abstract T mo201(WebView webView);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.t
    /* JADX INFO: renamed from: ｋ */
    public final /* synthetic */ void mo249(JSONObject jSONObject, Object obj, Object obj2) {
        int i10 = f3278 + 95;
        f3276 = i10 % 128;
        int i11 = i10 % 2;
        m3178(jSONObject, (WebView) obj, obj2);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m3163(String str) {
        int i10 = f3276 + 89;
        f3278 = i10 % 128;
        if (i10 % 2 != 0) {
            m3166(str);
            throw null;
        }
        JSONObject jSONObjectM3166 = m3166(str);
        int i11 = f3278 + 95;
        f3276 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 48 / 0;
        }
        return jSONObjectM3166;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3169(z zVar) {
        int i10 = f3278;
        f3276 = (i10 + InterfaceC0435l1.d.b.f29107d) % 128;
        boolean z10 = zVar.f3283;
        int i11 = i10 + 13;
        f3276 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 64 / 0;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ba.d m3171() {
        int i10 = f3278;
        int i11 = i10 + 13;
        f3276 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        kd kdVar = this.f3284;
        if (kdVar == null) {
            return null;
        }
        int i12 = i10 + 33;
        f3276 = i12 % 128;
        if (i12 % 2 != 0) {
            return kdVar.m2789();
        }
        kdVar.m2789();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m3176(String str, List<String> list, boolean z10, boolean z11, boolean z12) {
        this.f3282 = z10;
        this.f3279 = new jz(str, z12);
        this.f3283 = z11;
        this.f3286 = list;
        f3278 = (f3276 + 71) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m3179() {
        int i10 = f3278 + 57;
        f3276 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f3281.keySet().iterator();
            throw null;
        }
        for (WebView webView : this.f3281.keySet()) {
            webView.removeOnLayoutChangeListener(this);
            kd kdVar = this.f3281.get(webView);
            Iterator<jy> it = this.f3280.iterator();
            f3276 = (f3278 + 29) % 128;
            while (it.hasNext()) {
                int i11 = f3276 + 13;
                f3278 = i11 % 128;
                if (i11 % 2 != 0) {
                    kdVar.m2794(it.next());
                    throw null;
                }
                kdVar.m2794(it.next());
            }
        }
        this.f3280.clear();
        this.f3284 = null;
        this.f3281.clear();
        f3276 = (f3278 + InterfaceC0435l1.d.b.f29107d) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private jy m3164() {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        f3278 = (f3276 + 35) % 128;
        return anonymousClass3;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m3178(JSONObject jSONObject, WebView webView, T t10) {
        f3278 = (f3276 + InterfaceC0435l1.d.b.f29109f) % 128;
        m3174(jSONObject, webView);
        super.mo249(jSONObject, webView, (Object) t10);
        f3276 = (f3278 + 43) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m3167(WebView webView) {
        kd kdVar = this.f3281.get(webView);
        if (this.f3282) {
            f3276 = (f3278 + 19) % 128;
            if (kdVar.m2792()) {
                if (!ko.m2932(webView)) {
                    kdVar.m2793();
                    f3278 = (f3276 + 99) % 128;
                }
                m3173(webView);
                f3276 = (f3278 + 47) % 128;
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final WebView m3175() {
        f3278 = (f3276 + 59) % 128;
        kd kdVar = this.f3284;
        if (kdVar == null) {
            return null;
        }
        WebView webViewM2795 = kdVar.m2795();
        int i10 = f3278 + InterfaceC0435l1.d.b.f29114k;
        f3276 = i10 % 128;
        if (i10 % 2 != 0) {
            return webViewM2795;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m3173(WebView webView) {
        f3278 = (f3276 + InterfaceC0435l1.d.b.f29112i) % 128;
        this.f3279.m2773(webView);
        f3278 = (f3276 + 99) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.u
    /* JADX INFO: renamed from: ﾒ */
    public final String mo244(T t10) {
        int i10 = f3278;
        String str = this.f3285;
        f3276 = (i10 + 63) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m3174(JSONObject jSONObject, WebView webView) {
        int i10 = f3276 + 17;
        f3278 = i10 % 128;
        boolean z10 = false;
        if (i10 % 2 != 0) {
            int i11 = 76 / 0;
            if (webView == null) {
                return;
            }
        } else if (webView == null) {
            return;
        }
        try {
            String str = is.f2567;
            if (webView.getWindowToken() != null) {
                f3278 = (f3276 + 7) % 128;
                z10 = true;
            }
            jSONObject.put(str, z10);
            f3276 = (f3278 + 89) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m3177(List<WebView> list) {
        if (list != null) {
            int i10 = f3276 + 81;
            f3278 = i10 % 128;
            if (i10 % 2 == 0) {
                Iterator<WebView> it = list.iterator();
                while (it.hasNext()) {
                    f3276 = (f3278 + 69) % 128;
                    m3180(it.next());
                }
                return;
            }
            list.iterator();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m3166(String str) {
        f3276 = (f3278 + 91) % 128;
        try {
            String strDecode = URLDecoder.decode(str, m3165(4 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "￩\u0002\u0010\u0011\ufff4", true, Color.rgb(0, 0, 0) + 16777221, 203 - TextUtils.getTrimmedLength("")).intern());
            if (!TextUtils.isEmpty(strDecode)) {
                JSONObject jSONObject = new JSONObject(strDecode);
                f3276 = (f3278 + 59) % 128;
                return jSONObject;
            }
        } catch (Exception e10) {
            m.m2983(m3165(View.MeasureSpec.getSize(0) + 9, "\u0003￠\u0016\u0004\b\ufff5\u0001\u0004\ufff6\u0011\u0004\u000b\u0003\r\u0000\uffe7", true, 17 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 232 - View.getDefaultSize(0, 0)).intern(), m3165((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9, "\b\r\u0006\uffbf\u0003\u0000\u0013\u0000￤\u0011\u0011\u000e\u0011\uffbf\u0006\u0004\u0013\u0013", false, 18 - (ViewConfiguration.getPressedStateDuration() >> 16), KeyEvent.getDeadChar(0, 0) + 232).intern(), e10);
        }
        return new JSONObject();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m3168(JSONObject jSONObject, WebView webView, T t10) {
        f3278 = (f3276 + 9) % 128;
        jSONObject.remove(is.f2604);
        super.mo246(jSONObject, webView, t10);
        f3278 = (f3276 + 21) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m3165(int i10, String str, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (d.f1625) {
            try {
                char[] cArr2 = new char[i11];
                d.f1622 = 0;
                while (true) {
                    int i13 = d.f1622;
                    if (i13 >= i11) {
                        break;
                    }
                    d.f1624 = cArr[i13];
                    cArr2[d.f1622] = (char) (d.f1624 + i12);
                    int i14 = d.f1622;
                    cArr2[i14] = (char) (cArr2[i14] - f3277);
                    d.f1622 = i14 + 1;
                }
                if (i10 > 0) {
                    d.f1623 = i10;
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr2, 0, cArr3, 0, i11);
                    int i15 = d.f1623;
                    System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                    int i16 = d.f1623;
                    System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    d.f1622 = 0;
                    while (true) {
                        int i17 = d.f1622;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i11 - i17) - 1];
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m3180(WebView webView) {
        if (webView != null) {
            f3276 = (f3278 + 107) % 128;
            if (this.f3281.containsKey(webView)) {
                return;
            }
            kd kdVarM2787 = kd.m2787(webView, m3165(1 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\rￛￛ￦\u0017\u000e\u0018\u000f\u0010", true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9, 219 - View.combineMeasuredStates(0, 0)).intern());
            if (this.f3284 == null) {
                this.f3284 = kdVarM2787;
            }
            this.f3281.put(webView, kdVarM2787);
            jy jyVarM3164 = m3164();
            this.f3280.add(jyVarM3164);
            kdVarM2787.m2791(jyVarM3164);
            m3167(webView);
            webView.addOnLayoutChangeListener(this);
            f3278 = (f3276 + InterfaceC0435l1.d.b.f29109f) % 128;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m3181(String str) {
        int i10 = f3278;
        this.f3285 = str;
        f3276 = (i10 + 123) % 128;
    }
}

package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ab<T> extends x<WebView, T> implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f83 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int[] f84 = {-1062384603, -323842024, -497061888, -559740433, -357214044, 1630483275, -1153396497, 1233357459, 996759772, -347832069, 1669280728, -501863502, 2117746409, 1931318882, -1949263467, 581231776, 904858614, -131371034};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f85;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private jp f86;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private Map<WebView, jq> f87 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private List<jk> f88 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f89;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jq f90;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f91;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<String> f92;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f93;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ab$3, reason: invalid class name */
    public class AnonymousClass3 implements jk {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static char f94 = 19704;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f95 = 0;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f96 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f97 = 52629;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char f98 = 15142;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f99 = 4386436876627656361L;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char f100 = 338;

        public AnonymousClass3() {
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m268(String str, int i2) {
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
                                char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f100)) ^ ((c3 >>> 5) + f94)));
                                cArr3[1] = c4;
                                cArr3[0] = (char) (c3 - (((c4 >>> 5) + f98) ^ ((c4 + i4) ^ ((c4 << 4) + f97))));
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

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ void m271(AnonymousClass3 anonymousClass3, WebView webView, String str, boolean z2) {
            f95 = (f96 + 75) % 128;
            anonymousClass3.m270(webView, str, z2);
            f95 = (f96 + 115) % 128;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void mo272(final WebView webView, final String str, final boolean z2) {
            s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.3.5
                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    if (ab.m256(ab.this)) {
                        if (ab.m245(ab.this) == null || ab.m245(ab.this).isEmpty()) {
                            AnonymousClass3.m271(AnonymousClass3.this, webView, str, z2);
                            return;
                        }
                        Iterator it = ab.m245(ab.this).iterator();
                        while (it.hasNext()) {
                            if (str.startsWith((String) it.next())) {
                                AnonymousClass3.m271(AnonymousClass3.this, webView, str, z2);
                                return;
                            }
                        }
                    }
                }
            });
            f96 = (f95 + 5) % 128;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p004ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void mo274(WebView webView, String str, String str2) {
            String strSubstring = str2.substring(0, str2.indexOf(63));
            String strSubstring2 = str2.substring(str2.indexOf(63) + 1);
            if (strSubstring.equals(m269("뻚娶眝ဋⵤ왛", View.resolveSize(0, 0) + 58603).intern())) {
                ab.m247(ab.this, webView);
                return;
            }
            if (strSubstring.equals(m268("\ue930橵享ﴥ꼷ꎾ", (ViewConfiguration.getWindowTouchSlop() >> 8) + 6).intern())) {
                JSONObject jSONObjectM252 = ab.m252(strSubstring2);
                ab abVar = ab.this;
                abVar.m257(jSONObjectM252, webView, abVar.mo259(webView));
                return;
            }
            if (strSubstring.equals(m268("\ue930橵享ﴥ 갞", (ViewConfiguration.getWindowTouchSlop() >> 8) + 6).intern())) {
                JSONObject jSONObjectM253 = ab.m252(strSubstring2);
                ab abVar2 = ab.this;
                abVar2.mo1643(jSONObjectM253, webView, ab.m248(abVar2), ab.this.mo259(webView));
                return;
            }
            if (!(!strSubstring.equals(m268("\ue930橵享ﴥ\ud7a7䩘", (ViewConfiguration.getWindowTouchSlop() >> 8) + 6).intern()))) {
                f96 = (f95 + 115) % 128;
                JSONObject jSONObjectM254 = ab.m252(strSubstring2);
                jSONObjectM254.remove(ik.f2465);
                ab abVar3 = ab.this;
                abVar3.mo1638(jSONObjectM254, webView, abVar3.mo259(webView));
                f96 = (f95 + 47) % 128;
                return;
            }
            if (strSubstring.equals(m268("\ue930橵享ﴥ俦哱", 5 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                JSONObject jSONObjectM255 = ab.m252(strSubstring2);
                kb.m2744(jSONObjectM255.optString(m269("뻝㍍ꗄ", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36228).intern()), jSONObjectM255.optString(m268("䰡퓶\ufae5챾杹棦", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 5).intern()), jSONObjectM255.optString(m268("䰡퓶䘰嘌㚳뮦", 6 - Drawable.resolveOpacity(0, 0)).intern()), jSONObjectM255.optString(m269("뻌褎텰ᦢ憖", (ViewConfiguration.getLongPressTimeout() >> 16) + 14293).intern()));
            }
            int i2 = f95 + 9;
            f96 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private void m270(final WebView webView, final String str, final boolean z2) {
            s.m2924(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.3.2
                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                public final void mo276() {
                    final String originalUrl = webView.getOriginalUrl();
                    final Object objMo259 = ab.this.mo259(webView);
                    s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.3.2.3

                        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                        private static int f106 = 1;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static long f107 = 7815998009041492461L;

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static int f108;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static String m277(String str2, int i2) {
                            String str3;
                            Object charArray = str2;
                            if (str2 != null) {
                                charArray = str2.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (g.f2055) {
                                try {
                                    g.f2056 = i2;
                                    char[] cArr2 = new char[cArr.length];
                                    g.f2054 = 0;
                                    while (true) {
                                        int i3 = g.f2054;
                                        if (i3 < cArr.length) {
                                            cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f107);
                                            g.f2054++;
                                        } else {
                                            str3 = new String(cArr2);
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return str3;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(ik.f2456, str);
                                jSONObject.put(ik.f2457, m277("ᦚᓎ̤", KeyEvent.keyCodeFromString("") + 3413).intern());
                                jSONObject.put(ik.f2464, originalUrl);
                                if (!(!z2)) {
                                    int i2 = f108 + 17;
                                    f106 = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        jSONObject.put(ik.f2467, false);
                                    } else {
                                        jSONObject.put(ik.f2467, true);
                                    }
                                }
                                f106 = (f108 + 45) % 128;
                            } catch (JSONException e2) {
                                String strIntern = m277("ᦺ얷ꇱ贆楸咳ムᰕ\uf871Ꞓ菺漶䭽㚲ዺ︮", 56383 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
                                StringBuilder sb = new StringBuilder();
                                sb.append(m277("ᦨ㠚媕納龋빔킐\uf33cᖠ㐡嚫椳访ꩋ첋\uef45Ǒ⁑䋔教螩ꙮ\uf8f0᭱㷻尪繏", 8581 - TextUtils.getTrimmedLength("")).intern());
                                sb.append(e2.getLocalizedMessage());
                                n.m2835(strIntern, sb.toString());
                            }
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            ab abVar = ab.this;
                            abVar.mo1635(jSONObject, webView, ab.m248(abVar), objMo259);
                        }
                    });
                }
            });
            int i2 = f95 + 69;
            f96 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p004ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void mo275(WebView webView, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ik.f2466, str);
                jSONObject.put(ik.f2462, ik.f2463);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ik.f2468, jSONObject);
                ab abVar = ab.this;
                abVar.mo1639(jSONObject2, webView, this, abVar.mo259(webView));
                int i2 = f96 + 85;
                f95 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            } catch (Exception e2) {
                kb.m2752(m269("뻾䖹䠡䲠匔垅婠廛敥槼汚烀瞱稴纪Ԁ", 64373 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m269("뻬屜篕ᥓ㓇툪\uf1e0轪ꫴ䡷枛ԍₓ㸕\uddeb\ufb37隺됽号滉\u0c53⯟쥝\ue4fc舡ꇬ뽬嫻砃", 57991 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), (Throwable) e2, false);
            }
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m269(String str, int i2) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2055) {
                try {
                    g.f2056 = i2;
                    char[] cArr2 = new char[cArr.length];
                    g.f2054 = 0;
                    while (true) {
                        int i3 = g.f2054;
                        if (i3 < cArr.length) {
                            cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f99);
                            g.f2054++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void mo273(WebView webView) {
            f95 = (f96 + 113) % 128;
            ab.m247(ab.this, webView);
            f95 = (f96 + 119) % 128;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ List m245(ab abVar) {
        int i2 = f85;
        f83 = (i2 + 107) % 128;
        List<String> list = abVar.f92;
        int i3 = i2 + 39;
        f83 = i3 % 128;
        if (i3 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ bb.e m248(ab abVar) {
        f85 = (f83 + 107) % 128;
        bb.e eVarM250 = abVar.m250();
        int i2 = f83 + 21;
        f85 = i2 % 128;
        if (i2 % 2 == 0) {
            return eVarM250;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m252(String str) {
        f85 = (f83 + 13) % 128;
        JSONObject jSONObjectM249 = m249(str);
        int i2 = f85 + 87;
        f83 = i2 % 128;
        if (i2 % 2 != 0) {
            return jSONObjectM249;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m255(WebView webView) {
        int i2 = f83 + 121;
        f85 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f86.m2638(webView);
        } else {
            this.f86.m2638(webView);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m256(ab abVar) {
        int i2 = f85 + 9;
        f83 = i2 % 128;
        int i3 = i2 % 2;
        boolean z2 = abVar.f93;
        if (i3 != 0) {
            return z2;
        }
        throw null;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        try {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                if (this.f87.containsKey(webView)) {
                    f83 = (f85 + 93) % 128;
                    m246(webView);
                    f85 = (f83 + 109) % 128;
                }
            }
        } catch (Throwable th) {
            kb.m2752(m251(new int[]{-1215712433, 1764370700, 700568335, 623014170, 231519827, 1130197701, -1853310940, 1150806973}, 17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), m251(new int[]{1595330199, -347820987, 1024045471, 897041808, 135806228, -589683021, -1841525177, -1539661940, 32349091, 798512107, -1275768687, 1339724219}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22).intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract T mo259(WebView webView);

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m247(ab abVar, WebView webView) {
        f83 = (f85 + 101) % 128;
        abVar.m246(webView);
        int i2 = f83 + 85;
        f85 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m260() {
        for (WebView webView : this.f87.keySet()) {
            f83 = (f85 + 63) % 128;
            webView.removeOnLayoutChangeListener(this);
            jq jqVar = this.f87.get(webView);
            Iterator<jk> it = this.f88.iterator();
            while (it.hasNext()) {
                int i2 = f83 + 71;
                f85 = i2 % 128;
                if (i2 % 2 != 0) {
                    jqVar.m2642(it.next());
                    throw null;
                }
                jqVar.m2642(it.next());
            }
        }
        this.f88.clear();
        this.f90 = null;
        this.f87.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.x, com.p004ironsource.adqualitysdk.sdk.i.p
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ void mo265(JSONObject jSONObject, Object obj, Object obj2) {
        f85 = (f83 + 35) % 128;
        m257(jSONObject, (WebView) obj, obj2);
        f83 = (f85 + 27) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m266(String str) {
        int i2 = (f85 + 97) % 128;
        f83 = i2;
        this.f91 = str;
        f85 = (i2 + 75) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final WebView m267() {
        jq jqVar = this.f90;
        if (jqVar == null) {
            f83 = (f85 + 3) % 128;
            return null;
        }
        f83 = (f85 + 69) % 128;
        WebView webViewM2644 = jqVar.m2644();
        int i2 = f85 + 93;
        f83 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 57 / 0;
        }
        return webViewM2644;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.x, com.p004ironsource.adqualitysdk.sdk.i.p
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ void mo258(JSONObject jSONObject, Object obj, Object obj2) {
        f85 = (f83 + 47) % 128;
        m254(jSONObject, (WebView) obj, obj2);
        int i2 = f83 + 19;
        f85 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m263(String str, List<String> list, boolean z2, boolean z3, boolean z4) {
        this.f89 = z2;
        this.f86 = new jp(str, z4);
        this.f93 = z3;
        this.f92 = list;
        int i2 = f85 + 49;
        f83 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private jk m244() {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        int i2 = f83 + 65;
        f85 = i2 % 128;
        if (i2 % 2 == 0) {
            return anonymousClass3;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m246(WebView webView) {
        jq jqVar = this.f87.get(webView);
        if (this.f89) {
            f85 = (f83 + 91) % 128;
            if (!(!jqVar.m2646())) {
                f85 = (f83 + 45) % 128;
                if (!kh.m2804(webView)) {
                    f83 = (f85 + 103) % 128;
                    jqVar.m2643();
                }
                m255(webView);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        return r3.f90.m2641();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r0 = r0 + 109;
        com.p004ironsource.adqualitysdk.sdk.i.ab.f83 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if ((r0 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        r0 = 81 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3.f90 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r3.f90 != null) goto L9;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.i.bb.e m250() {
        /*
            r3 = this;
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.ab.f85
            int r1 = r0 + 87
            int r2 = r1 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ab.f83 = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L15
            com.ironsource.adqualitysdk.sdk.i.jq r1 = r3.f90
            r2 = 89
            int r2 = r2 / 0
            if (r1 == 0) goto L20
            goto L19
        L15:
            com.ironsource.adqualitysdk.sdk.i.jq r1 = r3.f90
            if (r1 == 0) goto L20
        L19:
            com.ironsource.adqualitysdk.sdk.i.jq r0 = r3.f90
            com.ironsource.adqualitysdk.sdk.i.bb$e r0 = r0.m2641()
            return r0
        L20:
            int r0 = r0 + 109
            int r1 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ab.f83 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L2f
            r0 = 81
            int r0 = r0 / 0
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.ab.m250():com.ironsource.adqualitysdk.sdk.i.bb$e");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m262(WebView webView) {
        jq jqVarM2639;
        if (webView != null) {
            int i2 = f85 + 71;
            f83 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 65 / 0;
                if (!this.f87.containsKey(webView)) {
                    jqVarM2639 = jq.m2639(webView, m251(new int[]{-1955287396, -1128866343, -334314632, -1786782952, -331857369, 855412766}, 9 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
                    if (this.f90 == null) {
                        this.f90 = jqVarM2639;
                        f83 = (f85 + 5) % 128;
                    }
                    this.f87.put(webView, jqVarM2639);
                    jk jkVarM244 = m244();
                    this.f88.add(jkVarM244);
                    jqVarM2639.m2645(jkVarM244);
                    m246(webView);
                    webView.addOnLayoutChangeListener(this);
                }
            } else if (!this.f87.containsKey(webView)) {
                jqVarM2639 = jq.m2639(webView, m251(new int[]{-1955287396, -1128866343, -334314632, -1786782952, -331857369, 855412766}, 9 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
                if (this.f90 == null) {
                    this.f90 = jqVarM2639;
                    f83 = (f85 + 5) % 128;
                }
                this.f87.put(webView, jqVarM2639);
                jk jkVarM245 = m244();
                this.f88.add(jkVarM245);
                jqVarM2639.m2645(jkVarM245);
                m246(webView);
                webView.addOnLayoutChangeListener(this);
            }
        }
        f85 = (f83 + 5) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m257(JSONObject jSONObject, WebView webView, T t) {
        f85 = (f83 + 101) % 128;
        m253(jSONObject, webView);
        super.mo265(jSONObject, webView, (Object) t);
        int i2 = f83 + 61;
        f85 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L9;
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.json.JSONObject m249(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.ab.m249(java.lang.String):org.json.JSONObject");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m264(List<WebView> list) {
        int i2 = f85 + 47;
        f83 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (list != null) {
            Iterator<WebView> it = list.iterator();
            f85 = (f83 + 65) % 128;
            while (it.hasNext()) {
                f85 = (f83 + 37) % 128;
                m262(it.next());
            }
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.x
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String mo261(T t) {
        int i2 = f83 + 43;
        f85 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f91;
        }
        int i3 = 34 / 0;
        return this.f91;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m253(JSONObject jSONObject, WebView webView) {
        boolean z2 = true;
        int i2 = (f85 + 1) % 128;
        f83 = i2;
        if (webView != null) {
            f85 = (i2 + 1) % 128;
            try {
                String str = ik.f2427;
                if (webView.getWindowToken() != null) {
                    f85 = (f83 + 65) % 128;
                } else {
                    f85 = (f83 + 61) % 128;
                    z2 = false;
                }
                jSONObject.put(str, z2);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m254(JSONObject jSONObject, WebView webView, T t) {
        int i2 = f85 + 19;
        f83 = i2 % 128;
        if (i2 % 2 != 0) {
            jSONObject.remove(ik.f2465);
            super.mo258(jSONObject, webView, (Object) t);
            int i3 = f83 + 117;
            f85 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        jSONObject.remove(ik.f2465);
        super.mo258(jSONObject, webView, (Object) t);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m251(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f84.clone();
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
}

package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class kh {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2856 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static d f2857 = null;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2858 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static d f2859;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2860;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2861;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2862;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2863;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2864;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2865;

    static {
        m2806();
        f2862 = true;
        f2861 = true;
        f2864 = true;
        byte b2 = 0;
        f2865 = false;
        f2863 = false;
        f2857 = new d(b2);
        f2859 = new d(b2);
        int i2 = f2860 + 107;
        f2858 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m2804(WebView webView) {
        f2860 = (f2858 + 51) % 128;
        boolean z2 = m2812(webView) instanceof hh;
        int i2 = f2858 + 25;
        f2860 = i2 % 128;
        if (i2 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2806() {
        f2856 = 71;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2811(WebView webView, String str) {
        int i2 = f2860;
        f2858 = (i2 + 105) % 128;
        if (webView != null) {
            f2858 = (i2 + 11) % 128;
            if (webView.getHandler() == null && webView.getRootView() == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m2810((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, 22 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getJumpTapTimeout() >> 16) + 166, "\r\u0002\u0017\u0006ￛ\u0015\u0011\n\u0013\u0004\u0014\u0002\u0017\u0002\u000bￃ\uffc9\u0003\u0010\u0015\u0002\uffc9", true).intern());
            sb.append(str);
            sb.append(m2810(3 - TextUtils.getOffsetAfter("", 0), 5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 113, "\ufffe\ufffe\ufff7\u0010", true).intern());
            webView.loadUrl(sb.toString());
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static synchronized av m2813() {
        av avVarMo480;
        f2858 = (f2860 + 43) % 128;
        avVarMo480 = as.m467().mo480();
        f2858 = (f2860 + 61) % 128;
        return avVarMo480;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static ht<WebChromeClient> m2815(WebView webView) {
        int i2 = f2860 + 15;
        f2858 = i2 % 128;
        if (i2 % 2 != 0) {
            m2814(webView.getContext());
            return m2816(webView, m2809(), f2859);
        }
        m2814(webView.getContext());
        m2816(webView, m2809(), f2859);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2803(Context context) {
        boolean z2;
        if (f2861) {
            try {
                f2861 = false;
                WebView webView = new WebView(context);
                hh hhVar = new hh(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.4
                });
                webView.setWebViewClient(hhVar);
                if (hhVar == webView.getWebViewClient()) {
                    int i2 = f2858 + 95;
                    f2860 = i2 % 128;
                    if (i2 % 2 != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                f2865 = z2;
            } catch (Throwable th) {
                kb.m2752(m2810(4 - ImageFormat.getBitsPerPixel(0), 12 - (ViewConfiguration.getTouchSlop() >> 8), 174 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\uffef\u000e\u0003\u0006\r\ufff1\uffff￼\ufff0\u0003\uffff\u0011", false).intern(), m2810(((Process.getThreadPriority(0) + 20) >> 6) + 24, ExpandableListView.getPackedPositionGroup(0L) + 36, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 164, "\ufff9ￂ\u0007\u000f\u0003\u0015ￂ\b\u000bￂ\t\u0010\u000b\r\u0005\u0007\n\u0005ￂ\u0014\u0011\u0014\u0014\uffe7\u0016\u0010\u0007\u000b\u000e￥\u0019\u0007\u000b\ufff8\u0004\u0007", true).intern(), th, false);
            }
        }
        boolean z3 = f2865;
        f2860 = (f2858 + 101) % 128;
        return z3;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static ht<WebViewClient> m2805(WebView webView) {
        f2860 = (f2858 + 91) % 128;
        m2814(webView.getContext());
        ht<WebViewClient> htVarM2816 = m2816(webView, m2801(), f2857);
        int i2 = f2858 + 47;
        f2860 = i2 % 128;
        if (i2 % 2 == 0) {
            return htVarM2816;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static WebViewClient m2812(WebView webView) {
        ht<WebViewClient> htVarM2805;
        WebViewClient webViewClientMo2260;
        if (Build.VERSION.SDK_INT >= 26) {
            int i2 = f2860 + 19;
            f2858 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 57 / 0;
                if (m2813().m557()) {
                    f2860 = (f2858 + 33) % 128;
                    if (m2803(webView.getContext())) {
                        webViewClientMo2260 = webView.getWebViewClient();
                    }
                }
            } else if (m2813().m557()) {
                f2860 = (f2858 + 33) % 128;
                if (m2803(webView.getContext())) {
                    webViewClientMo2260 = webView.getWebViewClient();
                }
            }
            htVarM2805 = m2805(webView);
            if (htVarM2805 != null) {
                throw new RuntimeException(m2810(11 - TextUtils.lastIndexOf("", '0', 0), 33 - (ViewConfiguration.getWindowTouchSlop() >> 8), 165 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "￦\u000f\f\b\u0011\u0017ￃ\t\f\b\u000f\u0007￦\u0012\u0018\u000f\u0007\u0011ￊ\u0017ￃ\t\f\u0011\u0007ￃ\ufffa\b\u0005\ufff9\f\b\u001a", false).intern());
            }
            webViewClientMo2260 = htVarM2805.mo2260();
        } else {
            htVarM2805 = m2805(webView);
            if (htVarM2805 != null) {
                throw new RuntimeException(m2810(11 - TextUtils.lastIndexOf("", '0', 0), 33 - (ViewConfiguration.getWindowTouchSlop() >> 8), 165 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "￦\u000f\f\b\u0011\u0017ￃ\t\f\b\u000f\u0007￦\u0012\u0018\u000f\u0007\u0011ￊ\u0017ￃ\t\f\u0011\u0007ￃ\ufffa\b\u0005\ufff9\f\b\u001a", false).intern());
            }
            webViewClientMo2260 = htVarM2805.mo2260();
        }
        f2858 = (f2860 + 33) % 128;
        return webViewClientMo2260;
    }

    public static class d {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private boolean f2867;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private boolean f2868;

        private d() {
            this.f2868 = false;
            this.f2867 = false;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean m2820() {
            return this.f2868;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void m2821() {
            this.f2868 = true;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final boolean m2822() {
            return this.f2867;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final boolean m2823() {
            return m2820() || m2822();
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void m2824() {
            this.f2867 = true;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static WebChromeClient m2807(WebView webView) {
        ht<WebChromeClient> htVarM2815;
        WebChromeClient webChromeClientMo2260;
        f2860 = (f2858 + 15) % 128;
        if (Build.VERSION.SDK_INT >= 26) {
            f2860 = (f2858 + 101) % 128;
            if (m2813().m552() && m2819(webView.getContext())) {
                webChromeClientMo2260 = webView.getWebChromeClient();
            } else {
                htVarM2815 = m2815(webView);
                if (htVarM2815 != null) {
                    webChromeClientMo2260 = htVarM2815.mo2260();
                } else {
                    throw new RuntimeException(m2810(View.MeasureSpec.getSize(0) + 29, KeyEvent.getDeadChar(0, 0) + 35, Process.getGidForName("") + 166, "\u0016\u0010\u0007\u000b\u000e￥\u0007\u000f\u0011\u0014\n￥\u0004\u0007\ufff9ￂ\u0006\u0010\u000b\bￂ\u0016\uffc9\u0010\u0006\u000e\u0017\u0011￥\u0006\u000e\u0007\u000b\bￂ", true).intern());
                }
            }
        } else {
            htVarM2815 = m2815(webView);
            if (htVarM2815 != null) {
                webChromeClientMo2260 = htVarM2815.mo2260();
            } else {
                throw new RuntimeException(m2810(View.MeasureSpec.getSize(0) + 29, KeyEvent.getDeadChar(0, 0) + 35, Process.getGidForName("") + 166, "\u0016\u0010\u0007\u000b\u000e￥\u0007\u000f\u0011\u0014\n￥\u0004\u0007\ufff9ￂ\u0006\u0010\u000b\bￂ\u0016\uffc9\u0010\u0006\u000e\u0017\u0011￥\u0006\u000e\u0007\u000b\bￂ", true).intern());
            }
        }
        int i2 = f2860 + 117;
        f2858 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
        return webChromeClientMo2260;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m2819(Context context) {
        if (f2864) {
            boolean z2 = false;
            f2864 = false;
            WebView webView = new WebView(context);
            hl hlVar = new hl(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.2
            });
            webView.setWebChromeClient(hlVar);
            if (hlVar == webView.getWebChromeClient()) {
                f2860 = (f2858 + 21) % 128;
                z2 = true;
            } else {
                f2858 = (f2860 + 85) % 128;
            }
            f2863 = z2;
        }
        return f2863;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <T> d m2802(WebView webView, T t, hy hyVar) {
        d dVar = new d((byte) 0);
        ht htVarM2817 = m2817(webView, hyVar, m2813().m556(), m2813().m554());
        if (htVarM2817 != null) {
            f2858 = (f2860 + 59) % 128;
            Object objMo2260 = htVarM2817.mo2260();
            if (objMo2260 == t) {
                int i2 = f2858 + 95;
                f2860 = i2 % 128;
                if (i2 % 2 == 0) {
                    dVar.m2821();
                    return dVar;
                }
                dVar.m2821();
                throw null;
            }
            ht htVarM2808 = m2808(objMo2260, hyVar, m2813().m555(), m2813().m553());
            if (htVarM2808 != null && htVarM2808.mo2260() == t) {
                f2858 = (f2860 + 89) % 128;
                dVar.m2824();
            }
        }
        return dVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2814(Context context) {
        f2858 = (f2860 + 67) % 128;
        if (f2862) {
            f2862 = false;
            try {
                WebView webView = new WebView(context);
                hh hhVar = new hh(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.3
                });
                webView.setWebViewClient(hhVar);
                hl hlVar = new hl(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.1
                });
                webView.setWebChromeClient(hlVar);
                f2857 = m2802(webView, hhVar, m2801());
                f2859 = m2802(webView, hlVar, m2809());
                f2858 = (f2860 + 43) % 128;
            } catch (Throwable th) {
                kb.m2752(m2810(5 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollBarSize() >> 8) + 12, ImageFormat.getBitsPerPixel(0) + 174, "\uffef\u000e\u0003\u0006\r\ufff1\uffff￼\ufff0\u0003\uffff\u0011", false).intern(), m2810((ViewConfiguration.getWindowTouchSlop() >> 8) + 11, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31, Gravity.getAbsoluteGravity(0, 0) + 167, "\u000b\u0003\u0005\b\u0003\uffc0\u0012\u000f\u0012\u0012￥\u0013\u0014\u000e\u0005\t\f\u0003\uffc0\u0012\u0005\u000e\u000e\t\uffc0\u0012\u000f\u0006\uffc0\u0007\u000e\t", true).intern(), th, false);
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> ht<T> m2808(T t, hy hyVar, List<String> list, int i2) {
        f2860 = (f2858 + 87) % 128;
        ht<T> htVarM2818 = m2818(t, hyVar, list, i2);
        int i3 = f2860 + 57;
        f2858 = i3 % 128;
        if (i3 % 2 != 0) {
            return htVarM2818;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static hy m2809() {
        hy hyVar = new hy() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.9
            @Override // com.p004ironsource.adqualitysdk.sdk.i.hy
            /* JADX INFO: renamed from: ﾇ */
            public final boolean mo1822(ht htVar) {
                return WebChromeClient.class.equals(htVar.mo2261().getType());
            }
        };
        int i2 = f2860 + 65;
        f2858 = i2 % 128;
        if (i2 % 2 != 0) {
            return hyVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static <T> ht<T> m2816(WebView webView, hy hyVar, d dVar) {
        int i2 = f2860 + 115;
        f2858 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                if (dVar.m2823()) {
                    int i3 = f2858 + 107;
                    f2860 = i3 % 128;
                    if (i3 % 2 == 0) {
                        ht<T> htVarM2817 = m2817(webView, hyVar, m2813().m556(), m2813().m554());
                        if (dVar.m2822() && htVarM2817 != null) {
                            T tMo2260 = htVarM2817.mo2260();
                            if (tMo2260 == null || tMo2260.getClass().equals(htVarM2817.mo2261().getType())) {
                                return htVarM2817;
                            }
                            htVarM2817 = m2808(tMo2260, hyVar, m2813().m555(), m2813().m553());
                        }
                        int i4 = f2858 + 71;
                        f2860 = i4 % 128;
                        if (i4 % 2 == 0) {
                            return htVarM2817;
                        }
                        throw null;
                    }
                    m2817(webView, hyVar, m2813().m556(), m2813().m554());
                    dVar.m2822();
                    throw null;
                }
                int i5 = f2858 + 37;
                f2860 = i5 % 128;
                if (i5 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            dVar.m2823();
            throw null;
        } catch (Throwable th) {
            kb.m2752(m2810((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, 12 - TextUtils.getOffsetAfter("", 0), 173 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\uffef\u000e\u0003\u0006\r\ufff1\uffff￼\ufff0\u0003\uffff\u0011", false).intern(), m2810(1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 26 - (ViewConfiguration.getTouchSlop() >> 8), 169 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "￤\u0003\u000b\u0004\b\u0005\uffbf\u0013\r\u0004\b\u000b\u0002\uffbf\u0006\r\b\u0013\u0013\u0004\u0006\uffbf\u0011\u000e\u0011\u0011", true).intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2810(int i2, int i3, int i4, String str, boolean z2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f672) {
            try {
                char[] cArr2 = new char[i3];
                b.f673 = 0;
                while (true) {
                    int i5 = b.f673;
                    if (i5 >= i3) {
                        break;
                    }
                    b.f671 = cArr[i5];
                    cArr2[b.f673] = (char) (b.f671 + i4);
                    int i6 = b.f673;
                    cArr2[i6] = (char) (cArr2[i6] - f2856);
                    b.f673 = i6 + 1;
                }
                if (i2 > 0) {
                    b.f674 = i2;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    int i7 = b.f674;
                    System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                    int i8 = b.f674;
                    System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    b.f673 = 0;
                    while (true) {
                        int i9 = b.f673;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr4[i9] = cArr2[(i3 - i9) - 1];
                        b.f673 = i9 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static hy m2801() {
        hy hyVar = new hy() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.6
            @Override // com.p004ironsource.adqualitysdk.sdk.i.hy
            /* JADX INFO: renamed from: ﾇ */
            public final boolean mo1822(ht htVar) {
                return WebViewClient.class.equals(htVar.mo2261().getType());
            }
        };
        int i2 = f2858 + 67;
        f2860 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
        return hyVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static <T> ht<T> m2817(WebView webView, hy hyVar, List<String> list, int i2) {
        f2858 = (f2860 + 77) % 128;
        ht<T> htVarM2818 = m2818((Object) webView, hyVar, list, i2);
        int i3 = f2858 + 89;
        f2860 = i3 % 128;
        if (i3 % 2 == 0) {
            return htVarM2818;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static <T> ht<T> m2818(Object obj, hy hyVar, final List<String> list, int i2) {
        ht<T> htVarM2313 = hr.m2242().m2245().m2313(obj, hyVar, new hq() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.5
            @Override // com.p004ironsource.adqualitysdk.sdk.i.hq
            /* JADX INFO: renamed from: ﾒ */
            public final Field[] mo2241(Object obj2) {
                hr.m2242().m2244();
                return ho.m2214(obj2.getClass(), true, -1, list);
            }
        }, list, i2);
        f2858 = (f2860 + 55) % 128;
        return htVarM2313;
    }
}

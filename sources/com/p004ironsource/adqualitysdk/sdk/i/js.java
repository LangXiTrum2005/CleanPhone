package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public final class js {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f2771 = true;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2772 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2773 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f2774 = true;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2775 = {142, 156, 153, 141, 160, 174, '|', 175, 171, 165, 170, 166, 169, 'W', 158, 'z', 163, 159, 164};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2776 = 55;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private WeakReference<bb.e> f2777;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f2778;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private WeakReference<WebView> f2779;

    public js(WebView webView) {
        this.f2779 = new WeakReference<>(webView);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m2654(bb.e eVar) {
        new WeakReference(eVar);
        f2773 = (f2772 + 53) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2655(bb.e eVar) {
        this.f2777 = new WeakReference<>(eVar);
        f2772 = (f2773 + 99) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final bb.e m2656() {
        WeakReference<bb.e> weakReference = this.f2777;
        if (weakReference == null) {
            return null;
        }
        f2773 = (f2772 + 61) % 128;
        bb.e eVar = weakReference.get();
        int i2 = f2773 + 21;
        f2772 = i2 % 128;
        if (i2 % 2 == 0) {
            return eVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m2658() {
        int i2 = f2773;
        boolean z2 = this.f2778;
        f2772 = (i2 + 41) % 128;
        return z2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final WebView m2659() {
        WebView webView;
        int i2 = f2772 + 21;
        f2773 = i2 % 128;
        if (i2 % 2 == 0) {
            webView = this.f2779.get();
            int i3 = 90 / 0;
        } else {
            webView = this.f2779.get();
        }
        int i4 = f2772 + 59;
        f2773 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return webView;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2660(WebChromeClient webChromeClient) {
        WebView webViewM2659 = m2659();
        if (webViewM2659 != null) {
            f2773 = (f2772 + 85) % 128;
            try {
                WebChromeClient webChromeClientM2807 = kh.m2807(webViewM2659);
                if (webChromeClientM2807 != null) {
                    f2772 = (f2773 + 73) % 128;
                    if (webChromeClientM2807 == null) {
                        hl hlVar = new hl(webChromeClientM2807, webChromeClient);
                        m2654(hlVar);
                        webViewM2659.setWebChromeClient(hlVar);
                        f2773 = (f2772 + 45) % 128;
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e2) {
                kb.m2752(m2653(null, null, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u008a\u008c\u0085\u008b\u008a\u0082\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m2653(null, null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, "\u0089\u008a\u0082\u0085\u0091\u0090\u0082\u0093\u008c\u008d\u0092\u0090\u0083\u0082\u0081\u008e\u008f\u008a\u0085\u0089\u0089\u0082\u008f\u008e\u008d\u008c\u008d\u008d\u0087").intern(), (Throwable) e2, false);
            }
        }
        f2773 = (f2772 + 111) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2657(WebViewClient webViewClient) {
        int i2 = f2773 + 123;
        f2772 = i2 % 128;
        if (i2 % 2 == 0) {
            WebView webViewM2659 = m2659();
            if (webViewM2659 != null) {
                try {
                    hh hhVar = new hh(kh.m2812(webViewM2659), webViewClient);
                    m2655(hhVar);
                    webViewM2659.setWebViewClient(hhVar);
                    this.f2778 = true;
                    int i3 = f2772 + 69;
                    f2773 = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    return;
                } catch (Exception e2) {
                    kb.m2752(m2653(null, null, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, "\u008a\u008c\u0085\u008b\u008a\u0082\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m2653(null, null, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0089\u008a\u0082\u0085\u0091\u0090\u0086\u0082\u0085\u0084\u0083\u0082\u0081\u008e\u008f\u008a\u0085\u0089\u0089\u0082\u008f\u008e\u008d\u008c\u008d\u008d\u0087").intern(), (Throwable) e2, false);
                }
            }
            this.f2778 = false;
            return;
        }
        m2659();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2653(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f2877) {
            try {
                char[] cArr2 = f2775;
                int i3 = f2776;
                if (f2771) {
                    int length = bArr.length;
                    o.f2878 = length;
                    char[] cArr3 = new char[length];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i4 = o.f2879;
                        int i5 = o.f2878 - 1;
                        int i6 = o.f2879;
                        cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                        o.f2879 = i6 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2774) {
                    int length2 = cArr.length;
                    o.f2878 = length2;
                    char[] cArr4 = new char[length2];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i7 = o.f2879;
                        int i8 = o.f2878 - 1;
                        int i9 = o.f2879;
                        cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                        o.f2879 = i9 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                o.f2878 = length3;
                char[] cArr5 = new char[length3];
                o.f2879 = 0;
                while (o.f2879 < o.f2878) {
                    int i10 = o.f2879;
                    int i11 = o.f2878 - 1;
                    int i12 = o.f2879;
                    cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                    o.f2879 = i12 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

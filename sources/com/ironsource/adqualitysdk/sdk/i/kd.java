package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class kd implements jy {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Map<WebView, kd> f2960 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private kc f2961;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Set<jy> f2962 = new HashSet();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f2963;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.kd$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class AnonymousClass5 extends WebChromeClient {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f2968 = false;

        public AnonymousClass5() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            kd.this.mo2764(webView, str2);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            if (i10 != 100 || this.f2968) {
                return;
            }
            this.f2968 = true;
            kd.this.mo2763(webView);
        }
    }

    private kd(WebView webView, String str) {
        this.f2963 = str;
        kc kcVar = new kc(webView);
        this.f2961 = kcVar;
        kcVar.m2783(new AnonymousClass1());
        this.f2961.m2786(new AnonymousClass5());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static kd m2787(WebView webView, String str) {
        kd kdVar = f2960.get(webView);
        if (kdVar != null) {
            return kdVar;
        }
        kd kdVar2 = new kd(webView, str);
        f2960.put(webView, kdVar2);
        return kdVar2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2790() {
        this.f2961.m2786(new AnonymousClass5());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2791(jy jyVar) {
        this.f2962.add(jyVar);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2793() {
        this.f2961.m2783(new AnonymousClass1());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m2792() {
        return this.f2961.m2784();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final WebView m2795() {
        return this.f2961.m2785();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jy
    /* JADX INFO: renamed from: ﾒ */
    public final void mo2766(WebView webView, String str, boolean z10) {
        for (jy jyVar : new HashSet(this.f2962)) {
            if (jyVar != null) {
                jyVar.mo2766(webView, str, z10);
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ba.d m2789() {
        return this.f2961.m2782();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jy
    /* JADX INFO: renamed from: ﻛ */
    public final void mo2765(WebView webView, String str, String str2) {
        for (jy jyVar : new HashSet(this.f2962)) {
            if (jyVar != null) {
                jyVar.mo2765(webView, str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2794(jy jyVar) {
        this.f2962.remove(jyVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jy
    /* JADX INFO: renamed from: ﻐ */
    public final void mo2763(WebView webView) {
        for (jy jyVar : new HashSet(this.f2962)) {
            if (jyVar != null) {
                jyVar.mo2763(webView);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.kd$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class AnonymousClass1 extends WebViewClient {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f2965 = false;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean f2967 = false;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f2966 = null;

        public AnonymousClass1() {
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private boolean m2796(WebView webView, String str) {
            if (!str.startsWith(kd.this.f2963)) {
                return false;
            }
            this.f2966 = webView.getOriginalUrl();
            String strSubstring = str.substring(kd.this.f2963.length());
            kd kdVar = kd.this;
            kdVar.mo2765(webView, kdVar.f2963, strSubstring);
            return true;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean m2797(WebView webView) {
            if (this.f2965 && this.f2967) {
                return true;
            }
            return (webView.getOriginalUrl() == null || this.f2966 == null || webView.getOriginalUrl().equals(this.f2966)) ? false : true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            kd.this.mo2763(webView);
            this.f2965 = false;
            this.f2967 = true;
            if (this.f2966 == null) {
                this.f2966 = webView.getOriginalUrl();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            kd.this.mo2763(webView);
            this.f2965 = true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (m2796(webView, str)) {
                return true;
            }
            if (this.f2966 == null) {
                this.f2966 = webView.getOriginalUrl();
            }
            kd.this.mo2766(webView, str, m2797(webView));
            this.f2967 = true;
            this.f2965 = false;
            return false;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jy
    /* JADX INFO: renamed from: ﻛ */
    public final void mo2764(WebView webView, String str) {
        for (jy jyVar : new HashSet(this.f2962)) {
            if (jyVar != null) {
                jyVar.mo2764(webView, str);
            }
        }
    }
}

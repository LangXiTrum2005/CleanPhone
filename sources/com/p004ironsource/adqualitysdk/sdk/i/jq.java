package com.p004ironsource.adqualitysdk.sdk.i;

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

/* JADX INFO: loaded from: classes5.dex */
public class jq implements jk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<WebView, jq> f2752 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2753;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Set<jk> f2754 = new HashSet();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private js f2755;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jq$4, reason: invalid class name */
    public class AnonymousClass4 extends WebChromeClient {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean f2761 = false;

        public AnonymousClass4() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            jq.this.mo275(webView, str2);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i2) {
            if (i2 != 100 || this.f2761) {
                return;
            }
            this.f2761 = true;
            jq.this.mo273(webView);
        }
    }

    private jq(WebView webView, String str) {
        this.f2753 = str;
        js jsVar = new js(webView);
        this.f2755 = jsVar;
        jsVar.m2657(new AnonymousClass3());
        this.f2755.m2660(new AnonymousClass4());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2643() {
        this.f2755.m2657(new AnonymousClass3());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final WebView m2644() {
        return this.f2755.m2659();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2645(jk jkVar) {
        this.f2754.add(jkVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2647() {
        this.f2755.m2660(new AnonymousClass4());
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jq$3, reason: invalid class name */
    public class AnonymousClass3 extends WebViewClient {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f2757 = false;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private boolean f2758 = false;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f2759 = null;

        public AnonymousClass3() {
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean m2648(WebView webView) {
            if (this.f2757 && this.f2758) {
                return true;
            }
            return (webView.getOriginalUrl() == null || this.f2759 == null || webView.getOriginalUrl().equals(this.f2759)) ? false : true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            jq.this.mo273(webView);
            this.f2757 = false;
            this.f2758 = true;
            if (this.f2759 == null) {
                this.f2759 = webView.getOriginalUrl();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            jq.this.mo273(webView);
            this.f2757 = true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (m2649(webView, str)) {
                return true;
            }
            if (this.f2759 == null) {
                this.f2759 = webView.getOriginalUrl();
            }
            jq.this.mo272(webView, str, m2648(webView));
            this.f2758 = true;
            this.f2757 = false;
            return false;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean m2649(WebView webView, String str) {
            if (!str.startsWith(jq.this.f2753)) {
                return false;
            }
            this.f2759 = webView.getOriginalUrl();
            String strSubstring = str.substring(jq.this.f2753.length());
            jq jqVar = jq.this;
            jqVar.mo274(webView, jqVar.f2753, strSubstring);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static jq m2639(WebView webView, String str) {
        jq jqVar = f2752.get(webView);
        if (jqVar != null) {
            return jqVar;
        }
        jq jqVar2 = new jq(webView, str);
        f2752.put(webView, jqVar2);
        return jqVar2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m2646() {
        return this.f2755.m2658();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﾇ */
    public final void mo273(WebView webView) {
        for (jk jkVar : new HashSet(this.f2754)) {
            if (jkVar != null) {
                jkVar.mo273(webView);
            }
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﾒ */
    public final void mo275(WebView webView, String str) {
        for (jk jkVar : new HashSet(this.f2754)) {
            if (jkVar != null) {
                jkVar.mo275(webView, str);
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2642(jk jkVar) {
        this.f2754.remove(jkVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final bb.e m2641() {
        return this.f2755.m2656();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﾇ */
    public final void mo274(WebView webView, String str, String str2) {
        for (jk jkVar : new HashSet(this.f2754)) {
            if (jkVar != null) {
                jkVar.mo274(webView, str, str2);
            }
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﻐ */
    public final void mo272(WebView webView, String str, boolean z2) {
        for (jk jkVar : new HashSet(this.f2754)) {
            if (jkVar != null) {
                jkVar.mo272(webView, str, z2);
            }
        }
    }
}

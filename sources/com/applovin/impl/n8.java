package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f8854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f8855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f8857e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends v4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f8858a;

        public a(boolean z10) {
            this.f8858a = z10;
        }

        @Override // com.applovin.impl.v4
        public Map a() {
            return CollectionUtils.hashMap("name", "WebTrackerManagerWebViewClient");
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.f8858a) {
                com.applovin.impl.sdk.p unused = n8.this.f8854b;
                if (com.applovin.impl.sdk.p.a()) {
                    n8.this.f8854b.a("WebTrackerManager", "Successfully initialized web view for postbacks");
                }
                n8.this.f8856d = true;
            }
        }

        @Override // com.applovin.impl.v4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView == n8.this.f8855c) {
                AppLovinSdkUtils.runOnUiThread(new u9(this, 0));
            } else {
                n8.this.b(webView);
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            n8.this.f8855c.destroy();
            n8.this.f8855c = null;
        }
    }

    public n8(com.applovin.impl.sdk.l lVar) {
        this.f8853a = lVar;
        this.f8854b = lVar.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        WebView webViewA = a(str);
        if (webViewA != null) {
            this.f8857e.add(webViewA);
            AppLovinSdkUtils.runOnUiThreadDelayed(new x8(12, this, webViewA), ((Integer) this.f8853a.a(z4.O2)).intValue());
        } else if (com.applovin.impl.sdk.p.a()) {
            this.f8854b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
        }
    }

    public void b() {
        AppLovinSdkUtils.runOnUiThread(new u9(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.f8855c = webViewA;
        if (webViewA == null && com.applovin.impl.sdk.p.a()) {
            this.f8854b.b("WebTrackerManager", "Failed to preload postback web view");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        String strAppendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.f8853a.a(z4.n3)).booleanValue());
        if (this.f8855c == null) {
            WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.f8855c = webViewA;
            if (webViewA == null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8854b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
                return;
            }
        }
        if (c() && !this.f8856d) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8854b.b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "firePostback");
            mapHashMap.put("source", "webViewNotInitialized");
            mapHashMap.put("url", strAppendQueryParameters);
            this.f8853a.E().d(f2.f7860j1, mapHashMap);
            appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
            return;
        }
        String strO = defpackage.e.o("al_firePostback('", strAppendQueryParameters, "')");
        if (((Boolean) this.f8853a.a(z4.U2)).booleanValue()) {
            p8.a(this.f8855c, strO, this.f8853a).a(this.f8853a.s0().a("evaluateJavascriptPromise"), new ac.a(this, appLovinPostbackListener, strAppendQueryParameters, 2));
        } else {
            p8.a(this.f8855c, strO);
            appLovinPostbackListener.onPostbackSuccess(strAppendQueryParameters);
        }
    }

    public void a(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new androidx.fragment.app.d(this, eVar, appLovinPostbackListener, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinPostbackListener appLovinPostbackListener, String str, boolean z10, String str2, String str3) {
        if (z10) {
            appLovinPostbackListener.onPostbackSuccess(str);
            return;
        }
        appLovinPostbackListener.onPostbackFailure(str, -1);
        Map map = CollectionUtils.map("top_main_method", "firePostback");
        map.put("source", "evaluateJavascriptFailed");
        map.put("url", str);
        CollectionUtils.putStringIfValid("error_message", str3, map);
        this.f8853a.E().d(f2.f7860j1, map);
    }

    private boolean c() {
        return ((Boolean) this.f8853a.a(z4.T2)).booleanValue();
    }

    private WebView a(String str) {
        return a(str, false);
    }

    private WebView a(String str, boolean z10) {
        q7.b();
        WebView webViewB = q7.b(com.applovin.impl.sdk.l.p(), "web tracker");
        if (webViewB == null) {
            return null;
        }
        webViewB.getSettings().setJavaScriptEnabled(true);
        webViewB.setWebViewClient(new a(z10 && c()));
        webViewB.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return webViewB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(WebView webView) {
        if (webView == null || !this.f8857e.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new t9(webView, 0));
    }

    public void b(String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8854b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8854b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new x8(11, this, str));
        }
    }
}

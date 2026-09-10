package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.g8;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import com.applovin.impl.z4;
import defpackage.e;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f10445a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f10447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EventListener f10448d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface EventListener {
        void onReceivedEvent(String str);
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f10448d = eventListener;
        this.f10446b = str;
        this.f10445a.set(false);
        WebView webView = this.f10447c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.f10448d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (TextUtils.isEmpty(getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY))) {
            p.h("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        l lVarA = AppLovinSdk.getInstance(getApplicationContext()).a();
        g8.a(findViewById(android.R.id.content), lVarA);
        a(lVarA);
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        if (StringUtils.isValidString(stringExtra)) {
            this.f10446b = stringExtra;
        }
        if (StringUtils.isValidString(this.f10446b)) {
            this.f10447c.loadUrl(this.f10446b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(l lVar) {
        WebView webViewB = q7.b(this, "WebView Activity");
        this.f10447c = webViewB;
        if (webViewB == null) {
            finish();
            return;
        }
        setContentView(webViewB);
        WebSettings settings = this.f10447c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f10447c.setVerticalScrollBarEnabled(true);
        this.f10447c.setHorizontalScrollBarEnabled(true);
        this.f10447c.setScrollBarStyle(33554432);
        this.f10447c.setWebViewClient(new a(lVar));
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends v4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f10449a;

        public a(l lVar) {
            this.f10449a = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(l lVar) {
            if (!((Boolean) lVar.a(z4.Y5)).booleanValue() || !AppLovinWebViewActivity.this.f10445a.compareAndSet(false, true)) {
                AppLovinWebViewActivity.this.finish();
                return;
            }
            AppLovinWebViewActivity.this.a(lVar);
            if (StringUtils.isValidString(AppLovinWebViewActivity.this.f10446b)) {
                AppLovinWebViewActivity.this.f10447c.loadUrl(AppLovinWebViewActivity.this.f10446b);
            }
        }

        @Override // com.applovin.impl.v4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (AppLovinWebViewActivity.this.f10447c == webView) {
                AppLovinWebViewActivity.this.f10447c.destroy();
                AppLovinWebViewActivity.this.f10447c = null;
                AppLovinWebViewActivity appLovinWebViewActivity = AppLovinWebViewActivity.this;
                final l lVar = this.f10449a;
                appLovinWebViewActivity.runOnUiThread(new Runnable() { // from class: com.applovin.sdk.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10451a.a(lVar);
                    }
                });
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            this.f10449a.Q();
            if (p.a()) {
                e.A("Handling url load: ", str, this.f10449a.Q(), "AppLovinWebViewActivity");
            }
            if (!"applovin".equalsIgnoreCase(scheme) || !"com.applovin.sdk".equalsIgnoreCase(host) || AppLovinWebViewActivity.this.f10448d == null) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            if (!path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                return true;
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            String str2 = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
            if (!StringUtils.isValidString(str2)) {
                this.f10449a.Q();
                if (!p.a()) {
                    return true;
                }
                this.f10449a.Q().b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                return true;
            }
            String queryParameter = uri.getQueryParameter(str2);
            this.f10449a.Q();
            if (p.a()) {
                this.f10449a.Q().a("AppLovinWebViewActivity", d.g("Parsed WebView event parameter name: ", str2, " and value: ", queryParameter));
            }
            AppLovinWebViewActivity.this.f10448d.onReceivedEvent(queryParameter);
            return true;
        }

        @Override // com.applovin.impl.v4
        public Map a() {
            return CollectionUtils.hashMap("name", "AppLovinWebViewActivity");
        }
    }
}

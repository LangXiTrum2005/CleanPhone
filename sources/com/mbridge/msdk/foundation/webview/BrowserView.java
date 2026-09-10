package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class BrowserView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CampaignEx f34220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f34222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WebView f34223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ProgressBar f34224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ToolBar f34225f;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BrowserView.this.f34223d != null) {
                BrowserView.this.f34223d.stopLoading();
            }
            String str = (String) view.getTag();
            boolean z10 = false;
            if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD)) {
                BrowserView.this.f34225f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(true);
                if (BrowserView.this.f34223d != null && BrowserView.this.f34223d.canGoBack()) {
                    BrowserView.this.f34223d.goBack();
                }
                View item = BrowserView.this.f34225f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD);
                if (BrowserView.this.f34223d != null && BrowserView.this.f34223d.canGoBack()) {
                    z10 = true;
                }
                item.setEnabled(z10);
                return;
            }
            if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD)) {
                BrowserView.this.f34225f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
                if (BrowserView.this.f34223d != null && BrowserView.this.f34223d.canGoForward()) {
                    BrowserView.this.f34223d.goForward();
                }
                View item2 = BrowserView.this.f34225f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
                if (BrowserView.this.f34223d != null && BrowserView.this.f34223d.canGoForward()) {
                    z10 = true;
                }
                item2.setEnabled(z10);
                return;
            }
            if (!TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.REFRESH)) {
                if (!TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.EXITS) || BrowserView.this.f34222c == null) {
                    return;
                }
                BrowserView.this.f34222c.a();
                return;
            }
            BrowserView.this.f34225f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(BrowserView.this.f34223d != null && BrowserView.this.f34223d.canGoBack());
            View item3 = BrowserView.this.f34225f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
            if (BrowserView.this.f34223d != null && BrowserView.this.f34223d.canGoForward()) {
                z10 = true;
            }
            item3.setEnabled(z10);
            if (BrowserView.this.f34223d != null) {
                BrowserView.this.f34223d.loadUrl(BrowserView.this.f34221b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            q0.c("BrowserView", "onLoadResource 开始! = " + str);
            if (BrowserView.this.f34222c != null) {
                BrowserView.this.f34222c.a(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (BrowserView.this.f34222c != null) {
                BrowserView.this.f34222c.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.c("BrowserView", "开始! = " + str);
            BrowserView.this.f34221b = str;
            if (BrowserView.this.f34222c != null) {
                BrowserView.this.f34222c.onPageStarted(webView, str, bitmap);
            }
            BrowserView.this.f34224e.setVisible(true);
            BrowserView.this.f34224e.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            if (BrowserView.this.f34222c != null) {
                BrowserView.this.f34222c.onReceivedError(webView, i10, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                } catch (Throwable th2) {
                    q0.b("BrowserView", th2.getMessage());
                    return true;
                }
            }
            if (BrowserView.this.f34222c != null) {
                BrowserView.this.f34222c.a();
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            q0.c("BrowserView", "js大跳! = " + str);
            BrowserView.this.f34225f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
            BrowserView.this.f34225f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
            if (BrowserView.this.f34222c != null) {
                return BrowserView.this.f34222c.shouldOverrideUrlLoading(webView, str);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends WebChromeClient {

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BrowserView.this.f34224e.setVisible(false);
            }
        }

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                BrowserView.this.f34224e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d extends WebChromeClient {

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BrowserView.this.f34224e.setVisible(false);
            }
        }

        public d() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                BrowserView.this.f34224e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface e {
        void a();

        void a(WebView webView, String str);

        void onPageFinished(WebView webView, String str);

        void onPageStarted(WebView webView, String str, Bitmap bitmap);

        void onReceivedError(WebView webView, int i10, String str, String str2);

        boolean shouldOverrideUrlLoading(WebView webView, String str);
    }

    public BrowserView(Context context, CampaignEx campaignEx) {
        super(context);
        this.f34220a = campaignEx;
        init();
    }

    private WebView getWebView() {
        WebView webView = new WebView(getContext());
        try {
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setCacheMode(-1);
            settings.setAllowFileAccess(true);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            try {
                settings.setSafeBrowsingEnabled(false);
            } catch (Throwable th2) {
                q0.b("BrowserView", th2.getMessage());
            }
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            try {
                settings.setMixedContentMode(0);
            } catch (Exception e10) {
                q0.b("BrowserView", e10.getMessage());
            }
            settings.setDatabaseEnabled(true);
            String path = getContext().getDir("database", 0).getPath();
            settings.setDatabasePath(path);
            settings.setGeolocationEnabled(true);
            settings.setGeolocationDatabasePath(path);
            try {
                Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(settings, Boolean.FALSE);
            } catch (Exception e11) {
                q0.b("BrowserView", e11.getMessage());
            }
        } catch (Throwable th3) {
            q0.b("BrowserView", th3.getMessage());
        }
        webView.setDownloadListener(new com.mbridge.msdk.foundation.same.webview.a(this.f34220a));
        webView.setWebViewClient(new b());
        webView.setWebChromeClient(m0.s() <= 10 ? new c() : new d());
        return webView;
    }

    public void destroy() {
        try {
            WebView webView = this.f34223d;
            if (webView != null) {
                webView.setWebViewClient(null);
                this.f34223d.destroy();
                this.f34223d = null;
                removeAllViews();
            }
        } catch (Throwable th2) {
            q0.b("BrowserView", th2.getMessage());
        }
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        a();
        this.f34224e.initResource(true);
        this.f34225f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(false);
        this.f34225f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
        this.f34225f.setOnItemClickListener(new a());
    }

    public void loadUrl(String str) {
        WebView webView = this.f34223d;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public void setListener(e eVar) {
        this.f34222c = eVar;
    }

    public void setWebView(WebView webView) {
        this.f34223d = webView;
    }

    private void a() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f34224e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.f34223d == null) {
                this.f34223d = getWebView();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f34223d.setLayoutParams(layoutParams);
        } catch (Throwable th2) {
            q0.b("BrowserView", "webview is error", th2);
        }
        this.f34225f = new ToolBar(getContext());
        this.f34225f.setLayoutParams(new LinearLayout.LayoutParams(-1, v0.a(getContext(), 40.0f)));
        this.f34225f.setBackgroundColor(-1);
        addView(this.f34224e);
        WebView webView = this.f34223d;
        if (webView != null) {
            addView(webView);
        }
        addView(this.f34225f);
    }

    public BrowserView(Context context) {
        super(context);
        init();
    }

    public BrowserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}

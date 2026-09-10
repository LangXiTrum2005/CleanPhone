package com.smartdigimkt.expressad.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
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
import com.smartdigimkt.v0.n;
import com.smartdigimkt.v0.v;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public class BrowserView extends LinearLayout {
    private static final String k0 = "BrowserView";
    private String e0;
    private ProgressBar f0;
    private WebView g0;
    private ToolBar h0;
    private e i0;
    private com.smartdigimkt.x.d j0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BrowserView.this.g0 != null) {
                BrowserView.this.g0.stopLoading();
            }
            String str = (String) view.getTag();
            boolean z2 = false;
            if (TextUtils.equals(str, "backward")) {
                BrowserView.this.h0.getItem("forward").setEnabled(true);
                if (BrowserView.this.g0 != null && BrowserView.this.g0.canGoBack()) {
                    BrowserView.this.g0.goBack();
                }
                View item = BrowserView.this.h0.getItem("backward");
                if (BrowserView.this.g0 != null && BrowserView.this.g0.canGoBack()) {
                    z2 = true;
                }
                item.setEnabled(z2);
                return;
            }
            if (TextUtils.equals(str, "forward")) {
                BrowserView.this.h0.getItem("backward").setEnabled(true);
                if (BrowserView.this.g0 != null && BrowserView.this.g0.canGoForward()) {
                    BrowserView.this.g0.goForward();
                }
                View item2 = BrowserView.this.h0.getItem("forward");
                if (BrowserView.this.g0 != null && BrowserView.this.g0.canGoForward()) {
                    z2 = true;
                }
                item2.setEnabled(z2);
                return;
            }
            if (!TextUtils.equals(str, "refresh")) {
                if (!TextUtils.equals(str, "exits") || BrowserView.this.i0 == null) {
                    return;
                }
                BrowserView.this.i0.a();
                return;
            }
            BrowserView.this.h0.getItem("backward").setEnabled(BrowserView.this.g0 != null && BrowserView.this.g0.canGoBack());
            View item3 = BrowserView.this.h0.getItem("forward");
            if (BrowserView.this.g0 != null && BrowserView.this.g0.canGoForward()) {
                z2 = true;
            }
            item3.setEnabled(z2);
            if (BrowserView.this.g0 != null) {
                BrowserView.this.g0.loadUrl(BrowserView.this.e0);
            }
        }
    }

    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            if (BrowserView.this.i0 != null) {
                BrowserView.this.i0.a(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (BrowserView.this.i0 != null) {
                BrowserView.this.i0.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            BrowserView.this.e0 = str;
            if (BrowserView.this.i0 != null) {
                BrowserView.this.i0.onPageStarted(webView, str, bitmap);
            }
            BrowserView.this.f0.setVisible(true);
            BrowserView.this.f0.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            if (BrowserView.this.i0 != null) {
                BrowserView.this.i0.onReceivedError(webView, i2, str, str2);
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
                } catch (Throwable th) {
                    th.getMessage();
                    return true;
                }
            }
            if (BrowserView.this.i0 != null) {
                BrowserView.this.i0.a();
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            BrowserView.this.h0.getItem("backward").setEnabled(true);
            BrowserView.this.h0.getItem("forward").setEnabled(false);
            if (BrowserView.this.i0 != null) {
                return BrowserView.this.i0.shouldOverrideUrlLoading(webView, str);
            }
            return false;
        }
    }

    public class c extends WebChromeClient {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BrowserView.this.f0.setVisible(false);
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
        public void onProgressChanged(WebView webView, int i2) {
            if (i2 == 100) {
                BrowserView.this.f0.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    public class d extends WebChromeClient {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BrowserView.this.f0.setVisible(false);
            }
        }

        public d() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i2) {
            if (i2 == 100) {
                BrowserView.this.f0.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    public interface e {
        void a();

        void a(WebView webView, String str);

        void onPageFinished(WebView webView, String str);

        void onPageStarted(WebView webView, String str, Bitmap bitmap);

        void onReceivedError(WebView webView, int i2, String str, String str2);

        boolean shouldOverrideUrlLoading(WebView webView, String str);
    }

    public BrowserView(Context context, com.smartdigimkt.x.d dVar) {
        super(context);
        this.j0 = dVar;
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
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    settings.setSafeBrowsingEnabled(false);
                } catch (Throwable th) {
                    th.getMessage();
                }
                settings.setMediaPlaybackRequiresUserGesture(false);
                try {
                    settings.setAllowUniversalAccessFromFileURLs(false);
                } catch (Throwable th2) {
                    th2.getMessage();
                }
                try {
                    settings.setMixedContentMode(1);
                } catch (Exception e2) {
                    e2.getMessage();
                }
                try {
                    Method declaredMethod = WebSettings.class.getDeclaredMethod(com.smartdigimkt.n8.b.a("c2V0TWl4ZWRDb250ZW50TW9kZQ=="), Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(settings, 0);
                } catch (Throwable unused) {
                }
                settings.setDatabaseEnabled(true);
                String path = getContext().getDir("database", 0).getPath();
                settings.setDatabasePath(path);
                settings.setGeolocationEnabled(true);
                settings.setGeolocationDatabasePath(path);
                try {
                    Method declaredMethod2 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(settings, Boolean.FALSE);
                } catch (Exception e3) {
                    e3.getMessage();
                }
                try {
                    settings.setAllowFileAccessFromFileURLs(false);
                    settings.setAllowUniversalAccessFromFileURLs(false);
                } catch (Throwable unused2) {
                }
            } else {
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
                settings.setMixedContentMode(1);
                Method declaredMethod3 = WebSettings.class.getDeclaredMethod(com.smartdigimkt.n8.b.a("c2V0TWl4ZWRDb250ZW50TW9kZQ=="), Integer.TYPE);
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(settings, 0);
                settings.setDatabaseEnabled(true);
                String path2 = getContext().getDir("database", 0).getPath();
                settings.setDatabasePath(path2);
                settings.setGeolocationEnabled(true);
                settings.setGeolocationDatabasePath(path2);
                Method declaredMethod4 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
                declaredMethod4.setAccessible(true);
                declaredMethod4.invoke(settings, Boolean.FALSE);
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        } catch (Throwable th3) {
            th3.getMessage();
        }
        webView.setDownloadListener(new DownloadListener(this.j0));
        webView.setWebViewClient(new b());
        webView.setWebChromeClient(n.k() <= 10 ? new c() : new d());
        return webView;
    }

    public void destroy() {
        WebView webView = this.g0;
        if (webView != null) {
            webView.stopLoading();
            this.g0.setWebViewClient(null);
            this.g0.destroy();
            this.g0 = null;
            removeAllViews();
        }
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        a();
        this.f0.initResource(true);
        this.h0.getItem("backward").setEnabled(false);
        this.h0.getItem("forward").setEnabled(false);
        this.h0.setOnItemClickListener(new a());
    }

    public void loadUrl(String str) {
        WebView webView = this.g0;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public void setListener(e eVar) {
        this.i0 = eVar;
    }

    public void setWebView(WebView webView) {
        this.g0 = webView;
    }

    public static final class DownloadListener implements android.webkit.DownloadListener {
        private com.smartdigimkt.x.d campaignEx;
        private String title;

        public DownloadListener(com.smartdigimkt.x.d dVar) {
            this.campaignEx = dVar;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public DownloadListener() {
        }
    }

    private void a() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f0 = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.g0 == null) {
                this.g0 = getWebView();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.g0.setLayoutParams(layoutParams);
        } catch (Throwable unused) {
        }
        this.h0 = new ToolBar(getContext());
        this.h0.setLayoutParams(new LinearLayout.LayoutParams(-1, v.a(getContext(), 40.0f)));
        this.h0.setBackgroundColor(-1);
        addView(this.f0);
        WebView webView = this.g0;
        if (webView != null) {
            addView(webView);
        }
        addView(this.h0);
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

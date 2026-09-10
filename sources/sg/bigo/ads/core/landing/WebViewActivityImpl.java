package sg.bigo.ads.core.landing;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.api.core.BaseAdActivityImpl;
import sg.bigo.ads.api.core.e;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.h.c;
import sg.bigo.ads.core.h.d;

/* JADX INFO: loaded from: classes7.dex */
public class WebViewActivityImpl extends BaseAdActivityImpl implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected ImageView f48589A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected WebView f48590B;
    protected String C;
    protected long D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f48591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f48592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f48593c;
    private FileChooser d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private sg.bigo.ads.common.e.a.AbstractC0836a f48594e;
    private final b f;
    protected TextView x;
    protected ProgressBar y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f48595z;

    public class CustomWebChromeClient extends c {
        private CustomWebChromeClient() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i2) {
            super.onProgressChanged(webView, i2);
            WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
            if (webViewActivityImpl.y != null && !webViewActivityImpl.c()) {
                WebViewActivityImpl.this.y.setProgress(i2);
            }
            WebViewActivityImpl.this.a(i2);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            WebViewActivityImpl.this.b(str);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (WebViewActivityImpl.this.d == null) {
                WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
                webViewActivityImpl.d = new FileChooser(webViewActivityImpl.f47011I);
            }
            FileChooser fileChooser = WebViewActivityImpl.this.d;
            sg.bigo.ads.common.t.a.a(0, 3, "FileChooser", "onShowFileChooser");
            ValueCallback<Uri[]> valueCallback2 = fileChooser.f48588c;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
            }
            fileChooser.f48588c = valueCallback;
            fileChooser.a(fileChooserParams.getAcceptTypes());
            return true;
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            if (WebViewActivityImpl.this.d == null) {
                WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
                webViewActivityImpl.d = new FileChooser(webViewActivityImpl.f47011I);
            }
            WebViewActivityImpl.this.d.openFileChooser(valueCallback, str, str2);
        }

        public /* synthetic */ CustomWebChromeClient(WebViewActivityImpl webViewActivityImpl, byte b2) {
            this();
        }
    }

    public class a extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48599b;

        private a() {
        }

        @Override // sg.bigo.ads.core.h.d
        public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
            sg.bigo.ads.core.d.b.a(3002, 10105, "The render process was gone.");
            WebViewActivityImpl.this.b(0);
        }

        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            ProgressBar progressBar = WebViewActivityImpl.this.y;
            if (progressBar != null) {
                progressBar.setAlpha(0.0f);
            }
            p005e.a.d(0, 3, str, "onPageFinished  ", "WebView");
            WebViewActivityImpl.this.a(str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            boolean z2 = false;
            p005e.a.d(0, 3, str, "onPageStarted ", "WebView");
            ProgressBar progressBar = WebViewActivityImpl.this.y;
            if (progressBar != null) {
                progressBar.animate().alpha(1.0f).setDuration(100L).setListener(null);
                WebViewActivityImpl.this.y.setProgress(0);
            }
            WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
            if (webViewActivityImpl.D < 0) {
                webViewActivityImpl.D = SystemClock.elapsedRealtime();
                z2 = true;
            }
            WebViewActivityImpl.this.a(str, z2);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            sg.bigo.ads.common.t.a.b("WebView", "onReceivedError: " + i2 + " " + str);
            WebViewActivityImpl.this.a(i2, str, str2);
        }

        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                onReceivedError(webView, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceRequest.getUrl().toString());
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.f48599b++;
            WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
            return a(webView, str, !(webViewActivityImpl.D >= 0 && webViewActivityImpl.f48592b));
        }

        public /* synthetic */ a(WebViewActivityImpl webViewActivityImpl, byte b2) {
            this();
        }

        private void a(WebView webView, String str) {
            onPageFinished(webView, str);
            WebViewActivityImpl.this.b(0);
        }

        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest.isForMainFrame()) {
                onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
            }
        }

        private boolean a(WebView webView, String str, boolean z2) {
            boolean zA;
            if (WebViewActivityImpl.this.f48591a) {
                return true;
            }
            sg.bigo.ads.common.t.a.a(0, 3, "WebView", "shouldOverrideUrlLoading url= " + str + ", isRedirectOnStart=" + z2);
            if (z2 && this.f48599b > 1) {
                WebViewActivityImpl.this.c(str);
            }
            if (sg.bigo.ads.core.landing.a.a(str)) {
                boolean zA2 = a(str);
                if (zA2 && z2) {
                    a(webView, str);
                }
                return zA2;
            }
            if (str.startsWith("intent://")) {
                try {
                    Intent uri = Intent.parseUri(str, 1);
                    Uri data = uri.getData();
                    if (data != null && WebViewActivityImpl.this.a(data)) {
                        if (z2) {
                            a(webView, str);
                        }
                        return true;
                    }
                    uri.addCategory("android.intent.category.BROWSABLE");
                    uri.setComponent(null);
                    uri.setSelector(null);
                    if (WebViewActivityImpl.this.f47011I.startActivityIfNeeded(uri, -1)) {
                        if (z2) {
                            a(webView, str);
                        }
                        return true;
                    }
                    sg.bigo.ads.common.t.a.b("WebView", "queryIntentActivities: null");
                    String stringExtra = uri.getStringExtra("browser_fallback_url");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        if (sg.bigo.ads.core.landing.a.a(stringExtra)) {
                            zA = a(stringExtra);
                            if (zA && z2) {
                                a(webView, stringExtra);
                            }
                        } else {
                            zA = false;
                        }
                        if (!zA) {
                            webView.loadUrl(stringExtra);
                        }
                        return true;
                    }
                } catch (Exception e2) {
                    sg.bigo.ads.common.t.a.a(0, "WebView", "shouldOverrideUrlLoading: " + e2.getMessage());
                }
            } else if (!URLUtil.isValidUrl(str)) {
                if (WebViewActivityImpl.this.e(str) && z2) {
                    a(webView, str);
                }
                return true;
            }
            String strD = WebViewActivityImpl.this.d(str);
            if (str.equals(strD)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            webView.loadUrl(strD);
            return true;
        }

        private boolean a(String str) {
            e eVar = new e();
            boolean zA = sg.bigo.ads.core.landing.a.a(Uri.parse(str), WebViewActivityImpl.this.f47011I, eVar);
            WebViewActivityImpl.this.a(eVar);
            return zA;
        }
    }

    public class b implements View.OnTouchListener, sg.bigo.ads.core.h.e.a {
        private b() {
        }

        @Override // sg.bigo.ads.core.h.e.a
        public final void a(MotionEvent motionEvent) {
            onTouch(WebViewActivityImpl.this.f48590B, motionEvent);
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                WebViewActivityImpl.a(WebViewActivityImpl.this);
            }
            return WebViewActivityImpl.this.a(motionEvent);
        }

        public /* synthetic */ b(WebViewActivityImpl webViewActivityImpl, byte b2) {
            this();
        }
    }

    public WebViewActivityImpl(Activity activity) {
        super(activity);
        this.D = -1L;
        this.f48591a = false;
        this.f48592b = false;
        this.f48593c = new AtomicBoolean(true);
        this.f48594e = new sg.bigo.ads.common.e.a.AbstractC0836a() { // from class: sg.bigo.ads.core.landing.WebViewActivityImpl.1
            @Override // sg.bigo.ads.common.e.a.AbstractC0836a
            public final void a(boolean z2) {
                if (z2) {
                    WebViewActivityImpl.this.U();
                } else {
                    WebViewActivityImpl.this.V();
                }
            }
        };
        this.f = new b(this, (byte) 0);
        Intent intent = this.f47011I.getIntent();
        this.C = intent != null ? intent.getStringExtra("url") : "";
    }

    private void c(int i2) {
        if (this.f48590B == null || !v()) {
            d(i2);
        } else {
            this.f48590B.goBack();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void D() {
        WebView webView = this.f48590B;
        if (webView != null) {
            sg.bigo.ads.common.e.a.b(webView, this.f48594e);
            WebView webView2 = this.f48590B;
            if (webView2 instanceof sg.bigo.ads.core.h.e) {
                ((sg.bigo.ads.core.h.e) webView2).setOnWebViewTouchListener(null);
            } else {
                webView2.setOnTouchListener(null);
            }
            this.f48590B.destroy();
            this.f48590B = null;
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void N() {
        if (TextUtils.isEmpty(this.C)) {
            sg.bigo.ads.common.t.a.a(0, "WebView", "url is null.");
            b(0);
            return;
        }
        n(a());
        try {
            b();
        } catch (RuntimeException unused) {
        }
        s();
        if (q.a((CharSequence) this.C) || e(this.C)) {
            b(0);
        } else {
            t();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void U() {
        if (this.f48593c.compareAndSet(true, false)) {
            d();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void V() {
        if (this.f48593c.compareAndSet(false, true)) {
            e();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void W() {
        c(1);
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void X() {
    }

    public int a() {
        return R.layout.bigo_ad_activity_webview;
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    @Deprecated
    public final void ap() {
        d(0);
    }

    public void b() {
        this.y = (ProgressBar) o(R.id.inter_webview_progress_bar);
        this.x = (TextView) o(R.id.inter_webview_title);
        this.f48589A = (ImageView) o(R.id.inter_webview_back);
        this.f48595z = (ImageView) o(R.id.inter_webview_close);
        ImageView imageView = this.f48589A;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        ImageView imageView2 = this.f48595z;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        WebView webViewR = r();
        this.f48590B = webViewR;
        if (webViewR != null) {
            byte b2 = 0;
            webViewR.setWebViewClient(new a(this, b2));
            this.f48590B.setWebChromeClient(new CustomWebChromeClient(this, b2));
            u.a(this.f48590B, (ViewGroup) o(R.id.inter_webview_container), new ViewGroup.LayoutParams(-1, -1), -1);
            WebView webView = this.f48590B;
            if (webView instanceof sg.bigo.ads.core.h.e) {
                ((sg.bigo.ads.core.h.e) webView).setOnWebViewTouchListener(this.f);
            } else {
                webView.setOnTouchListener(this.f);
            }
            sg.bigo.ads.common.e.a.a(this.f48590B, this.f48594e);
        }
    }

    public void e() {
        WebView webView = this.f48590B;
        if (webView != null) {
            webView.onPause();
        }
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof String) {
            if (tag.equals(sg.bigo.ads.common.utils.a.a(this.f47011I, R.string.bigo_ad_tag_close, new Object[0]))) {
                d(3);
            } else if (tag.equals(sg.bigo.ads.common.utils.a.a(this.f47011I, R.string.bigo_ad_tag_back, new Object[0]))) {
                c(2);
            }
        }
    }

    public WebView r() {
        return sg.bigo.ads.core.h.e.a(this.f47011I);
    }

    public void s() {
    }

    public void t() {
        WebView webView = this.f48590B;
        if (webView != null) {
            webView.loadUrl(this.C);
        }
    }

    public boolean v() {
        WebView webView = this.f48590B;
        return webView != null && webView.canGoBack();
    }

    public void b(int i2) {
        this.f48591a = true;
        e(i2);
        WebView webView = this.f48590B;
        if (webView != null) {
            webView.stopLoading();
        }
        super.ap();
    }

    public void c(String str) {
        p005e.a.d(0, 3, str, "onAutoRedirectStart url= ", "WebView");
    }

    public String d(String str) {
        return str;
    }

    public void e(int i2) {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void g(boolean z2) {
    }

    public void a(int i2) {
    }

    public void b(String str) {
        TextView textView = this.x;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void d() {
        WebView webView = this.f48590B;
        if (webView != null) {
            webView.onResume();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str) {
        return a(Uri.parse(str));
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void a(int i2, int i3, Intent intent) {
        String dataString;
        FileChooser fileChooser = this.d;
        if (fileChooser != null) {
            Uri[] uriArr = (i3 != -1 || i2 != 101 || intent == null || intent.getData() == null || (dataString = intent.getDataString()) == null) ? null : new Uri[]{Uri.parse(dataString)};
            ValueCallback<Uri[]> valueCallback = fileChooser.f48588c;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(uriArr);
                fileChooser.f48588c = null;
            }
        }
    }

    public void d(int i2) {
        b(i2);
    }

    public void a(int i2, String str, String str2) {
    }

    public void a(String str) {
    }

    public boolean c() {
        return false;
    }

    public void a(String str, boolean z2) {
    }

    public void a(e eVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Uri uri) {
        e eVar = new e();
        boolean zA = sg.bigo.ads.core.landing.a.a(uri, this.f47011I, eVar, "");
        if (eVar.f47023b == 0 && eVar.f47024c == 0) {
            return zA;
        }
        a(eVar);
        return zA;
    }

    public boolean a(MotionEvent motionEvent) {
        return false;
    }

    public static /* synthetic */ boolean a(WebViewActivityImpl webViewActivityImpl) {
        webViewActivityImpl.f48592b = true;
        return true;
    }
}

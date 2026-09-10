package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.webview.ProgressBar;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ToolBar f34829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ToolBar f34830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ProgressBar f34831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RelativeLayout f34832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View.OnClickListener f34833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.b f34834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.a f34835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected BaseWebView f34836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View.OnClickListener f34837k;
    private View.OnClickListener l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View.OnClickListener f34838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View.OnClickListener f34839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f34840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f34841p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WebViewClient f34842q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f34843r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private i f34844s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f34845t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f34846u;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f34841p + "ms");
            if (CommonWebView.this.f34844s != null) {
                CommonWebView.this.f34845t = false;
                CommonWebView.this.f34844s.a(CommonWebView.this.f34843r);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.c("CommonWebView", "newProgress! 开始! = " + str);
            CommonWebView.this.f34831e.setVisible(true);
            CommonWebView.this.f34831e.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th2) {
                    q0.b("CommonWebView", th2.getMessage());
                }
            }
            return true;
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
                CommonWebView.this.f34831e.setVisible(false);
            }
        }

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            q0.c("CommonWebView", "newProgress! = " + i10);
            if (i10 == 100) {
                CommonWebView.this.f34831e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseWebView baseWebView = CommonWebView.this.f34836j;
            if (baseWebView != null) {
                baseWebView.stopLoading();
                String str = (String) view.getTag();
                if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                    CommonWebView.this.f34830d.getItem(ToolBar.FORWARD).setEnabled(true);
                    if (CommonWebView.this.f34836j.canGoBack()) {
                        CommonWebView.this.f34836j.goBack();
                    }
                    CommonWebView.this.f34830d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f34836j.canGoBack());
                    if (CommonWebView.this.f34837k != null) {
                        CommonWebView.this.f34837k.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.FORWARD)) {
                    CommonWebView.this.f34830d.getItem(ToolBar.BACKWARD).setEnabled(true);
                    if (CommonWebView.this.f34836j.canGoForward()) {
                        CommonWebView.this.f34836j.goForward();
                    }
                    CommonWebView.this.f34830d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f34836j.canGoForward());
                    if (CommonWebView.this.l != null) {
                        CommonWebView.this.l.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.REFRESH)) {
                    CommonWebView.this.f34830d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f34836j.canGoBack());
                    CommonWebView.this.f34830d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f34836j.canGoForward());
                    CommonWebView.this.f34836j.reload();
                    if (CommonWebView.this.f34838m != null) {
                        CommonWebView.this.f34838m.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.EXITS)) {
                    if (CommonWebView.this.f34833g != null) {
                        CommonWebView.this.f34833g.onClick(view);
                    }
                } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                    if (CommonWebView.this.f34839n != null) {
                        CommonWebView.this.f34839n.onClick(view);
                    }
                    com.mbridge.msdk.click.c.c(CommonWebView.this.getContext(), CommonWebView.this.f34836j.getUrl());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e extends WebViewClient {
        public e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f34830d.getItem(ToolBar.BACKWARD).setEnabled(true);
            CommonWebView.this.f34830d.getItem(ToolBar.FORWARD).setEnabled(false);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f extends WebViewClient {
        public f() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (u0.a.b(str)) {
                u0.a.a(CommonWebView.this.getContext(), str, null);
            }
            return CommonWebView.this.a(webView, str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g extends WebViewClient {
        public g() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            CommonWebView.this.f34845t = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            CommonWebView.this.f34843r = str;
            if (CommonWebView.this.f34845t) {
                return;
            }
            CommonWebView.this.f34845t = true;
            CommonWebView.this.c();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            CommonWebView.this.f34845t = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f34843r = str;
            if (CommonWebView.this.f34845t) {
                CommonWebView.this.a();
            }
            CommonWebView.this.f34845t = true;
            CommonWebView.this.c();
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface h {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface i {
        void a(String str);
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f34846u = new a();
        init();
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f34835i.a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f34834h.a(webViewClient);
    }

    public View findToolBarButton(String str) {
        ToolBar toolBar;
        ToolBar toolBar2 = this.f34829c;
        View item = toolBar2 != null ? toolBar2.getItem(str) : null;
        return (item != null || (toolBar = this.f34830d) == null) ? item : toolBar.getItem(str);
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f34836j;
        return baseWebView == null ? "" : baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f34836j;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f34829c;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.f34830d;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(8);
        }
    }

    public void hideToolBarTitle() {
        this.f34829c.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.f34832f = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.f34832f, layoutParams);
        this.f34827a = v0.a(getContext(), 40.0f);
        this.f34828b = v0.a(getContext(), 40.0f);
        this.f34834h = new com.mbridge.msdk.mbsignalcommon.commonwebview.b();
        this.f34835i = new com.mbridge.msdk.mbsignalcommon.commonwebview.a();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.f34836j == null) {
                this.f34836j = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f34836j.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f34836j;
            com.mbridge.msdk.mbsignalcommon.base.b bVar = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f34834h);
            this.f34836j.setWebChromeClient(this.f34835i);
            addWebViewClient(bVar);
        } catch (Throwable th2) {
            q0.b("CommonWebView", "webview is error", th2);
        }
        this.f34832f.addView(this.f34836j);
    }

    public void loadUrl(String str) {
        this.f34836j.loadUrl(str);
        if (this.f34842q != null) {
            c();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f34837k = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.l = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f34839n = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.f34838m = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f34835i.b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f34834h.b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f34829c.getParent()).removeView(this.f34829c);
        this.f34832f.addView(this.f34829c);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f34829c.getParent()).removeView(this.f34829c);
        addView(this.f34829c, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f34833g = onClickListener;
    }

    public void setPageLoadTimtout(int i10) {
        this.f34841p = i10;
        if (this.f34840o == null) {
            this.f34840o = new Handler(Looper.getMainLooper());
        }
        if (this.f34842q == null) {
            g gVar = new g();
            this.f34842q = gVar;
            addWebViewClient(gVar);
        }
    }

    public void setPageLoadTimtoutListener(i iVar) {
        this.f34844s = iVar;
    }

    public void setToolBarTitle(String str, int i10) {
        this.f34829c.setTitle(str, i10);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f34829c;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.f34830d;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(0);
        }
    }

    public void showToolBarTitle() {
        this.f34829c.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z10) {
        a(arrayList, z10);
    }

    public void useDeeplink() {
        addWebViewClient(new f());
    }

    public void useDefaultToolBar() {
        b();
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f34831e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new b());
        addWebChromeClient(new c());
        addView(this.f34831e);
        this.f34831e.initResource(true);
    }

    private void b() {
        if (this.f34830d != null) {
            return;
        }
        this.f34830d = new ToolBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f34828b);
        layoutParams.bottomMargin = 0;
        this.f34830d.setLayoutParams(layoutParams);
        this.f34830d.setBackgroundColor(-1);
        this.f34830d.setOnItemClickListener(new d());
        addWebViewClient(new e());
        addView(this.f34830d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f34840o.postDelayed(this.f34846u, this.f34841p);
    }

    public void setToolBarTitle(String str) {
        this.f34829c.setTitle(str);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34846u = new a();
        init();
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z10) {
        if (this.f34829c != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.a(40);
        aVar.b(80);
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.f34829c = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z10) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f34827a);
            layoutParams.addRule(10);
            this.f34829c.setLayoutParams(layoutParams);
            this.f34832f.addView(this.f34829c);
            return;
        }
        this.f34829c.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f34827a));
        addView(this.f34829c, 0);
    }

    public CommonWebView(Context context) {
        super(context);
        this.f34846u = new a();
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) {
                if (uri.getScheme().equals("intent")) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            uri2.setComponent(null);
                            uri2.setSelector(null);
                            uri2.setFlags(268435456);
                            getContext().startActivity(uri2);
                            return true;
                        }
                        try {
                            String stringExtra = uri2.getStringExtra("browser_fallback_url");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                Uri uri3 = Uri.parse(str);
                                if (!uri3.getScheme().equals("http") && !uri3.getScheme().equals("https")) {
                                    str = stringExtra;
                                }
                                webView.loadUrl(stringExtra);
                                return false;
                            }
                        } catch (Throwable th2) {
                            q0.b("CommonWebView", th2.getMessage());
                        }
                    } catch (Throwable th3) {
                        q0.b("CommonWebView", th3.getMessage());
                    }
                    q0.b("CommonWebView", th.getMessage());
                    return false;
                }
                if (com.mbridge.msdk.click.c.d(getContext(), str)) {
                    q0.b("CommonWebView", "openDeepLink");
                    return true;
                }
                if (!TextUtils.isEmpty(str)) {
                    return !(str.startsWith("http") || str.startsWith("https"));
                }
            }
            return false;
        } catch (Throwable th4) {
            q0.b("CommonWebView", th4.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f34840o.removeCallbacks(this.f34846u);
    }
}

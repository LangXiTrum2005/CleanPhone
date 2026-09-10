package com.smartdigimkt.expressad.atsignalcommon.commonwebview;

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
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.smartdigimkt.expressad.foundation.webview.ProgressBar;
import com.smartdigimkt.sdk.basead.express.web.BaseWebView;
import com.smartdigimkt.v0.u;
import com.smartdigimkt.v0.v;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class CommonWebView extends LinearLayout {
    private static final String A0 = "CommonWebView";
    public static int DEFAULT_JUMP_TIMEOUT = 10000;
    private ProgressBar e0;
    private int f0;
    private int g0;
    protected ToolBar h0;
    protected ToolBar i0;
    protected ProgressBar j0;
    private RelativeLayout k0;
    private View.OnClickListener l0;
    private com.smartdigimkt.i.b m0;
    private com.smartdigimkt.i.a n0;
    protected BaseWebView o0;
    private View.OnClickListener p0;
    private View.OnClickListener q0;
    private View.OnClickListener r0;
    private View.OnClickListener s0;
    private Handler t0;
    private int u0;
    private WebViewClient v0;
    private String w0;
    private i x0;
    private boolean y0;
    private final Runnable z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int unused = CommonWebView.this.u0;
            if (CommonWebView.this.x0 != null) {
                CommonWebView.this.y0 = false;
                CommonWebView.this.x0.a(CommonWebView.this.w0);
            }
        }
    }

    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            CommonWebView.this.j0.setVisible(true);
            CommonWebView.this.j0.setProgressState(5);
        }
    }

    public class c extends WebChromeClient {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CommonWebView.this.j0.setVisible(false);
            }
        }

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i2) {
            if (i2 == 100) {
                CommonWebView.this.j0.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseWebView baseWebView = CommonWebView.this.o0;
            if (baseWebView != null) {
                baseWebView.stopLoading();
                String str = (String) view.getTag();
                if (TextUtils.equals(str, "backward")) {
                    CommonWebView.this.i0.getItem("forward").setEnabled(true);
                    if (CommonWebView.this.o0.canGoBack()) {
                        CommonWebView.this.o0.goBack();
                    }
                    CommonWebView.this.i0.getItem("backward").setEnabled(CommonWebView.this.o0.canGoBack());
                    if (CommonWebView.this.p0 != null) {
                        CommonWebView.this.p0.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, "forward")) {
                    CommonWebView.this.i0.getItem("backward").setEnabled(true);
                    if (CommonWebView.this.o0.canGoForward()) {
                        CommonWebView.this.o0.goForward();
                    }
                    CommonWebView.this.i0.getItem("forward").setEnabled(CommonWebView.this.o0.canGoForward());
                    if (CommonWebView.this.q0 != null) {
                        CommonWebView.this.q0.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, "refresh")) {
                    CommonWebView.this.i0.getItem("backward").setEnabled(CommonWebView.this.o0.canGoBack());
                    CommonWebView.this.i0.getItem("forward").setEnabled(CommonWebView.this.o0.canGoForward());
                    CommonWebView.this.o0.reload();
                    if (CommonWebView.this.r0 != null) {
                        CommonWebView.this.r0.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, "exits")) {
                    if (CommonWebView.this.l0 != null) {
                        CommonWebView.this.l0.onClick(view);
                    }
                } else if (TextUtils.equals(str, "open_by_browser")) {
                    if (CommonWebView.this.s0 != null) {
                        CommonWebView.this.s0.onClick(view);
                    }
                    com.smartdigimkt.q3.d.b(CommonWebView.this.getContext(), CommonWebView.this.o0.getUrl());
                }
            }
        }
    }

    public class e extends WebViewClient {
        public e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.i0.getItem("backward").setEnabled(true);
            CommonWebView.this.i0.getItem("forward").setEnabled(false);
            return false;
        }
    }

    public class f extends WebViewClient {
        public f() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (u.a.b(str) && com.smartdigimkt.q3.d.a(webView.getContext(), str, (com.smartdigimkt.w6.f) null).f39602b) {
                return true;
            }
            return CommonWebView.this.a(webView, str);
        }
    }

    public class g extends WebViewClient {
        public g() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            CommonWebView.this.y0 = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            CommonWebView.this.w0 = str;
            if (CommonWebView.this.y0) {
                return;
            }
            CommonWebView.this.y0 = true;
            CommonWebView.this.c();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            CommonWebView.this.y0 = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.w0 = str;
            if (CommonWebView.this.y0) {
                CommonWebView.this.a();
            }
            CommonWebView.this.y0 = true;
            CommonWebView.this.c();
            return false;
        }
    }

    public interface h {
        void a();
    }

    public interface i {
        void a(String str);
    }

    public CommonWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.z0 = new a();
        init();
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.n0.a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.m0.a(webViewClient);
    }

    public View findToolBarButton(String str) {
        ToolBar toolBar;
        ToolBar toolBar2 = this.h0;
        View item = toolBar2 != null ? toolBar2.getItem(str) : null;
        return (item != null || (toolBar = this.i0) == null) ? item : toolBar.getItem(str);
    }

    public String getUrl() {
        BaseWebView baseWebView = this.o0;
        return baseWebView == null ? "" : baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.o0;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.h0;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.i0;
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
        this.h0.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.k0 = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.k0, layoutParams);
        this.f0 = v.a(getContext(), 40.0f);
        this.g0 = v.a(getContext(), 40.0f);
        this.m0 = new com.smartdigimkt.i.b();
        this.n0 = new com.smartdigimkt.i.a();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.o0 == null) {
                this.o0 = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.o0.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.o0;
            com.smartdigimkt.u4.b bVar = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.m0);
            this.o0.setWebChromeClient(this.n0);
            addWebViewClient(bVar);
        } catch (Throwable unused) {
        }
        this.k0.addView(this.o0);
    }

    public void loadUrl(String str) {
        this.o0.loadUrl(str);
        if (this.v0 != null) {
            c();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.p0 = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.q0 = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.s0 = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.r0 = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.n0.b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.m0.b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.h0.getParent()).removeView(this.h0);
        this.k0.addView(this.h0);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.h0.getParent()).removeView(this.h0);
        addView(this.h0, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.l0 = onClickListener;
    }

    public void setPageLoadTimtout(int i2) {
        this.u0 = i2;
        if (this.t0 == null) {
            this.t0 = new Handler(Looper.getMainLooper());
        }
        if (this.v0 == null) {
            g gVar = new g();
            this.v0 = gVar;
            addWebViewClient(gVar);
        }
    }

    public void setPageLoadTimtoutListener(i iVar) {
        this.x0 = iVar;
    }

    public void setToolBarTitle(String str, int i2) {
        this.h0.setTitle(str, i2);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.h0;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.i0;
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
        this.h0.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z2) {
        a(arrayList, z2);
    }

    public void useDeeplink() {
        addWebViewClient(new f());
    }

    public void useDefaultToolBar() {
        b();
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.j0 = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new b());
        addWebChromeClient(new c());
        addView(this.j0);
        this.j0.initResource(true);
    }

    private void b() {
        if (this.i0 != null) {
            return;
        }
        this.i0 = new ToolBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.g0);
        layoutParams.bottomMargin = 0;
        this.i0.setLayoutParams(layoutParams);
        this.i0.setBackgroundColor(-1);
        this.i0.setOnItemClickListener(new d());
        addWebViewClient(new e());
        addView(this.i0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.t0.postDelayed(this.z0, this.u0);
    }

    public void setToolBarTitle(String str) {
        this.h0.setTitle(str);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public CommonWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z0 = new a();
        init();
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z2) {
        if (this.h0 != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.a(40);
        aVar.c(80);
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.h0 = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z2) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f0);
            layoutParams.addRule(10);
            this.h0.setLayoutParams(layoutParams);
            this.k0.addView(this.h0);
            return;
        }
        this.h0.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f0));
        addView(this.h0, 0);
    }

    public CommonWebView(Context context) {
        super(context);
        this.z0 = new a();
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals("http") && !uri.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
                if (uri.getScheme().equals("intent")) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            uri2.addCategory("android.intent.category.BROWSABLE");
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
                                if (!uri3.getScheme().equals("http") && !uri3.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
                                    str = stringExtra;
                                }
                                webView.loadUrl(stringExtra);
                                return false;
                            }
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    th.getMessage();
                    return false;
                }
                if (com.smartdigimkt.q3.d.a(getContext(), str, "", "", false)) {
                    return true;
                }
                if (!TextUtils.isEmpty(str)) {
                    return !(str.startsWith("http") || str.startsWith(HttpRequest.DEFAULT_SCHEME));
                }
            }
            return false;
        } catch (Throwable th3) {
            th3.getMessage();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.t0.removeCallbacks(this.z0);
    }
}

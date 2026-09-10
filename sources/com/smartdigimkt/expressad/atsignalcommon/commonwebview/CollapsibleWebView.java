package com.smartdigimkt.expressad.atsignalcommon.commonwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class CollapsibleWebView extends CommonWebView {
    private static final String G0 = "CollapsibleWebView";
    private CopyOnWriteArrayList<CommonWebView.h> B0;
    private CopyOnWriteArrayList<CommonWebView.h> C0;
    private CopyOnWriteArrayList<e> D0;
    private String E0;
    private String F0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doCollapse");
            CollapsibleWebView.this.showToolBarButton("doSpand");
            CollapsibleWebView.this.d();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doSpand");
            CollapsibleWebView.this.showToolBarButton("doCollapse");
            CollapsibleWebView.this.e();
        }
    }

    public class c implements CommonWebView.i {
        public c() {
        }

        @Override // com.smartdigimkt.expressad.atsignalcommon.commonwebview.CommonWebView.i
        public void a(String str) {
            CollapsibleWebView collapsibleWebView = CollapsibleWebView.this;
            collapsibleWebView.b(collapsibleWebView.o0, str);
        }
    }

    public class d extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Boolean f34677a = Boolean.FALSE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f34678b = "";

        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.f34677a.booleanValue()) {
                return;
            }
            CollapsibleWebView.this.a((View) webView, str);
            this.f34677a = Boolean.FALSE;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f34678b = str;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            HashMap mapT = androidx.media3.extractor.text.ttml.a.t("type", "error", "url", str2);
            mapT.put("description", str);
            if (!this.f34677a.booleanValue() && this.f34678b.equals(str2)) {
                this.f34677a = Boolean.TRUE;
                CollapsibleWebView.this.b(webView, mapT);
            }
            CollapsibleWebView.this.a(webView, mapT);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            HashMap mapS = androidx.media3.extractor.text.ttml.a.s("type", "http");
            String str = webResourceRequest.getUrl() + "";
            mapS.put("url", str);
            mapS.put("statusCode", webResourceResponse.getStatusCode() + "");
            mapS.put("description", "http error");
            if (!this.f34677a.booleanValue() && (this.f34678b.equals(str) || TextUtils.isEmpty(this.f34678b))) {
                this.f34677a = Boolean.TRUE;
                CollapsibleWebView.this.b(webView, mapS);
            }
            CollapsibleWebView.this.a(webView, mapS);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            HashMap mapS = androidx.media3.extractor.text.ttml.a.s("type", "ssl");
            mapS.put("url", sslError.getUrl());
            mapS.put("description", "ssl error");
            if (!this.f34677a.booleanValue()) {
                if (this.f34678b.equals(sslError.getUrl() + "")) {
                    this.f34677a = Boolean.TRUE;
                    CollapsibleWebView.this.b(webView, mapS);
                }
            }
            CollapsibleWebView.this.a(webView, mapS);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return true;
        }
    }

    public interface e {
        void a(View view, String str);

        void a(View view, Map<String, String> map);

        void b(View view, String str);

        void b(View view, Map<String, String> map);
    }

    public CollapsibleWebView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Iterator<CommonWebView.h> it = this.B0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Iterator<CommonWebView.h> it = this.C0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private ToolBar.b getCollapseButton() {
        return new ToolBar.b("doCollapse").a(false).a("arrow_down_white_blackbg").a(new a());
    }

    private ToolBar.b getExpandButton() {
        return new ToolBar.b("doSpand").a("arrow_up_black").a(new b());
    }

    public String getCollapseIconName() {
        return this.E0;
    }

    public String getExpandIconName() {
        return this.F0;
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.commonwebview.CommonWebView
    public void init() {
        super.init();
        this.B0 = new CopyOnWriteArrayList<>();
        this.C0 = new CopyOnWriteArrayList<>();
        this.D0 = new CopyOnWriteArrayList<>();
        this.E0 = "arrow_down_white_blackbg";
        this.F0 = "arrow_up_white";
        useDeeplink();
        initWebViewListener();
        useProgressBar();
        ArrayList<ToolBar.b> arrayList = new ArrayList<>();
        arrayList.add(getCollapseButton());
        arrayList.add(getExpandButton());
        useDefaultToolBar();
        useCustomizedToolBar(arrayList, true);
    }

    public void initWebViewListener() {
        setPageLoadTimtoutListener(new c());
        setPageLoadTimtout(CommonWebView.DEFAULT_JUMP_TIMEOUT);
        addWebViewClient(new d());
    }

    public void setCollapseIconName(String str) {
        this.E0 = str;
    }

    public void setCollapseListener(CommonWebView.h hVar) {
        this.B0.add(hVar);
    }

    public void setCustomizedToolBarMarginWidthPixel(int i2, int i3, int i4, int i5) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.h0.getLayoutParams();
        layoutParams.setMargins(i2, i3, i4, i5);
        this.h0.setLayoutParams(layoutParams);
    }

    public void setExpandIconName(String str) {
        this.F0 = str;
    }

    public void setExpandListener(CommonWebView.h hVar) {
        this.C0.add(hVar);
    }

    public void setPageLoadListener(e eVar) {
        this.D0.add(eVar);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, String str) {
        Iterator<e> it = this.D0.iterator();
        while (it.hasNext()) {
            it.next().a(view, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, Map<String, String> map) {
        Iterator<e> it = this.D0.iterator();
        while (it.hasNext()) {
            it.next().b(view, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, Map<String, String> map) {
        Iterator<e> it = this.D0.iterator();
        while (it.hasNext()) {
            it.next().a(view, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, String str) {
        Iterator<e> it = this.D0.iterator();
        while (it.hasNext()) {
            it.next().b(view, str);
        }
    }
}

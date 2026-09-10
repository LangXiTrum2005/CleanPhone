package com.inmobi.media;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3187q2 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f23908a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3107l2 f23910c;
    public final /* synthetic */ Handler d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3202r2 f23911e;

    public C3187q2(C3107l2 c3107l2, C3202r2 c3202r2, Handler handler) {
        this.f23910c = c3107l2;
        this.d = handler;
        this.f23911e = c3202r2;
    }

    public static final void a(C3187q2 this$0, C3107l2 click, Handler handler, C3202r2 this$1, WebView webView) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(click, "$click");
        Intrinsics.f(handler, "$handler");
        Intrinsics.f(this$1, "this$1");
        try {
            AdConfig.ImaiConfig imaiConfig = C3298x2.g;
            Thread.sleep((imaiConfig != null ? imaiConfig.getPingInterval() : 0) * 1000);
        } catch (InterruptedException unused) {
        }
        if (this$0.f23908a.get()) {
            return;
        }
        Intrinsics.e(C3298x2.f(), "access$getTAG$p(...)");
        click.f23763i.set(true);
        handler.post(new A.q0(webView, 0));
        this$1.f23946a.a(click, EnumC3157o4.f23855e);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f23908a.set(true);
        if (this.f23909b || this.f23910c.f23763i.get()) {
            return;
        }
        this.f23911e.f23946a.a(this.f23910c);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f23909b = false;
        ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24144b.getX()).submit(new A.r0(this, this.f23910c, this.d, this.f23911e, webView, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i2, String description, String failingUrl) {
        Intrinsics.f(view, "view");
        Intrinsics.f(description, "description");
        Intrinsics.f(failingUrl, "failingUrl");
        this.f23909b = true;
        this.f23911e.f23946a.a(this.f23910c, EnumC3157o4.f23855e);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        Intrinsics.f(view, "view");
        Intrinsics.f(request, "request");
        Intrinsics.f(errorResponse, "errorResponse");
        this.f23909b = true;
        this.f23911e.f23946a.a(this.f23910c, EnumC3157o4.f23855e);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.f(view, "view");
        Intrinsics.f(detail, "detail");
        return xf.a(view, detail, "click_mgr");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.f(view, "view");
        Intrinsics.f(request, "request");
        return (this.f23910c.d || Intrinsics.a(request.getUrl().toString(), this.f23910c.f23759b)) ? false : true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.f(view, "view");
        Intrinsics.f(request, "request");
        Intrinsics.f(error, "error");
        this.f23909b = true;
        this.f23911e.f23946a.a(this.f23910c, EnumC3157o4.f23855e);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.f(view, "view");
        Intrinsics.f(url, "url");
        C3107l2 c3107l2 = this.f23910c;
        return (c3107l2.d || url.equals(c3107l2.f23759b)) ? false : true;
    }

    public static final void a(WebView webView) {
        try {
            uf ufVar = webView instanceof uf ? (uf) webView : null;
            if (ufVar == null || ufVar.f24040a) {
                return;
            }
            ((uf) webView).stopLoading();
        } catch (Throwable th) {
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(th));
        }
    }
}

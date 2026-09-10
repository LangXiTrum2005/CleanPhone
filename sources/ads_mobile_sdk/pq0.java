package ads_mobile_sdk;

import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.base.triweekly;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.gintrap;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.taiyuan;
import kurbash.formularize;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.MutablePropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import saneness.astigmatic;
import saneness.ferdelance;
import saneness.gerenuk;
import saneness.midian;
import saneness.strother;

/* JADX INFO: loaded from: classes.dex */
public abstract class pq0 extends WebViewClient {
    public final gerenuk a;
    public final gq0 b;
    public final saran c;
    public final ip0 d;
    public final g6 e;
    public final jk0 f;
    public final vw2 g;
    public final AtomicBoolean h;
    public final AtomicBoolean i;
    public final AtomicInteger j;
    public final vw2 k;
    public final vw2 l;
    public final vw2 m;
    public strother n;
    public ferdelance o;
    public final vw2 p;
    public final AtomicBoolean q;
    public volatile gk2 r;
    public static final /* synthetic */ formularize[] t = {polloi.competently(new MutablePropertyReference1Impl(pq0.class, "loadedDeferred", "getLoadedDeferred()Lkotlinx/coroutines/CompletableDeferred;", 0)), polloi.competently(new MutablePropertyReference1Impl(pq0.class, "encounteredError", "getEncounteredError()Lcom/google/android/libraries/ads/mobile/sdk/internal/util/GmaResult$WebError;", 0)), polloi.competently(new MutablePropertyReference1Impl(pq0.class, "followUrls", "getFollowUrls()Z", 0)), polloi.competently(new MutablePropertyReference1Impl(pq0.class, "adEventEmitter", "getAdEventEmitter()Lcom/google/android/libraries/ads/mobile/sdk/internal/event/InternalAdEventListener;", 0)), polloi.competently(new MutablePropertyReference1Impl(pq0.class, "onJavascriptReadyListener", "getOnJavascriptReadyListener()Lcom/google/android/libraries/ads/mobile/sdk/internal/webview/JavascriptReadyListener;", 0))};
    public static final midian s = new midian();

    public pq0(gerenuk jsContext, gq0 gmaWebView, saran backgroundScope, ip0 gmaUtil, g6 adSpamClient, jk0 flags) {
        Intrinsics.checkNotNullParameter(jsContext, "jsContext");
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = jsContext;
        this.b = gmaWebView;
        this.c = backgroundScope;
        this.d = gmaUtil;
        this.e = adSpamClient;
        this.f = flags;
        this.g = new vw2(null);
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.j = new AtomicInteger(0);
        this.k = new vw2(null);
        this.l = new vw2(Boolean.FALSE);
        this.m = new vw2(null);
        this.p = new vw2(null);
        this.q = new AtomicBoolean(false);
    }

    public final jk0 a() {
        return this.f;
    }

    public final gq0 b() {
        return this.b;
    }

    public final strother c() {
        return this.n;
    }

    public final gk2 d() {
        return this.r;
    }

    public final ferdelance e() {
        return this.o;
    }

    public final void f() {
        vw2 vw2Var = this.k;
        formularize[] formularizeVarArr = t;
        vn0 vn0Var = (vn0) vw2Var.getValue(this, formularizeVarArr[1]);
        if (vn0Var != null) {
            gintrap gintrapVar = (gintrap) this.g.getValue(this, formularizeVarArr[0]);
            if (gintrapVar != null) {
                gintrapVar.saran(vn0Var);
            }
            this.g.setValue(this, formularizeVarArr[0], null);
            return;
        }
        if (this.b.j.get()) {
            wn0 wn0Var = wn0.c;
            gintrap gintrapVar2 = (gintrap) this.g.getValue(this, formularizeVarArr[0]);
            if (gintrapVar2 != null) {
                gintrapVar2.saran(wn0Var);
            }
            this.g.setValue(this, formularizeVarArr[0], null);
            return;
        }
        if (this.i.get()) {
            wn0 wn0Var2 = wn0.c;
            gintrap gintrapVar3 = (gintrap) this.g.getValue(this, formularizeVarArr[0]);
            if (gintrapVar3 != null) {
                gintrapVar3.saran(wn0Var2);
            }
            this.g.setValue(this, formularizeVarArr[0], null);
            return;
        }
        if (!this.h.get() || this.j.get() > 0) {
            return;
        }
        tn0 tn0Var = new tn0(Unit.f29295attabal);
        gintrap gintrapVar4 = (gintrap) this.g.getValue(this, formularizeVarArr[0]);
        if (gintrapVar4 != null) {
            gintrapVar4.saran(tn0Var);
        }
        this.g.setValue(this, formularizeVarArr[0], null);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) throws InterruptedException {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Uri uri = Uri.parse(url);
        s.getClass();
        if (midian.attabal(uri)) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            taiyuan.saneness(null, new iq0(this, uri, null), 1, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String url) throws InterruptedException {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url, "url");
        this.h.set(true);
        astigmatic astigmaticVar = (astigmatic) this.p.getValue(this, t[4]);
        if (astigmaticVar != null) {
            oo1 oo1Var = (oo1) astigmaticVar;
            taiyuan.saneness(null, new no1(oo1Var.a, oo1Var.b, null), 1, null);
        }
        f();
        if (this.b.j.get()) {
            saran saranVar = this.c;
            lq0 block = new lq0(this, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.k.setValue(this, t[1], new vn0(i, str, str2));
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.b.a(detail.rendererPriorityAtExit(), detail.didCrash());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) throws InterruptedException {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        midian midianVar = s;
        Uri url = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        midianVar.getClass();
        if (midian.attabal(url)) {
            Uri uri = request.getUrl();
            Intrinsics.checkNotNullExpressionValue(uri, "getUrl(...)");
            Intrinsics.checkNotNullParameter(uri, "uri");
            taiyuan.saneness(null, new iq0(this, uri, null), 1, null);
        } else {
            if (((Boolean) this.l.getValue(this, t[2])).booleanValue()) {
                Uri url2 = request.getUrl();
                Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
                if (midian.saneness(url2)) {
                    if (!this.q.getAndSet(true)) {
                        y13.a(this.c, new mq0(this, request, null));
                    }
                    return super.shouldOverrideUrlLoading(view, request);
                }
            }
            if (this.b.willNotDraw()) {
                triweekly triweeklyVar = kn0.a;
                kn0.b("Non-creative WebView unable to handle URL: " + request.getUrl(), null);
                return true;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            g6 g6Var = this.e;
            Uri url3 = request.getUrl();
            Intrinsics.checkNotNullExpressionValue(url3, "getUrl(...)");
            intent.setData(g6Var.a(url3, this.b));
            gk2 gk2Var = this.r;
            if (gk2Var != null && !gk2Var.a()) {
                cutely.wireman(this.c, null, null, new nq0(this, request, null), 3, null);
                return true;
            }
            if (this.d.a(intent) && !this.q.getAndSet(true)) {
                y13.a(this.c, new oq0(this, request, null));
            }
        }
        return true;
    }
}

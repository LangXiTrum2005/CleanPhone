package ads_mobile_sdk;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.ironsource.X3;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.taiyuan;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.gerenuk;
import saneness.hobby;
import saneness.strother;
import saneness.tithonia;

/* JADX INFO: loaded from: classes.dex */
public final class uq0 extends pq0 {
    public final tithonia u;
    public final hobby v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(gerenuk jsContext, gq0 gmaWebView, saran backgroundScope, ip0 gmaUtil, g6 adSpamClient, jk0 flags, tithonia tithoniaVar, hobby httpClient) {
        super(jsContext, gmaWebView, backgroundScope, gmaUtil, adSpamClient, flags);
        Intrinsics.checkNotNullParameter(jsContext, "jsContext");
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.u = tithoniaVar;
        this.v = httpClient;
    }

    public final tithonia g() {
        return this.u;
    }

    public final hobby h() {
        return this.v;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null) {
            return null;
        }
        cutely.wireman(this.c, null, null, new qq0(url, webResourceRequest, this, null), 3, null);
        strother strotherVar = this.n;
        WebResourceResponse webResourceResponse = strotherVar != null ? (WebResourceResponse) taiyuan.saneness(null, new tq0(strotherVar, this, webResourceRequest, null), 1, null) : null;
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        jk0 jk0Var = this.f;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads_analytics_events_via_webview_requests", X3.i.W);
        return ((Boolean) jk0Var.a("gads_analytics_events_via_webview_requests", Boolean.FALSE, zk.b)).booleanValue() ? (WebResourceResponse) taiyuan.saneness(null, new rq0(url, webResourceRequest, this, null), 1, null) : (WebResourceResponse) taiyuan.saneness(null, new sq0(url, webResourceRequest, this, null), 1, null);
    }
}

package com.p004ironsource;

import android.support.v4.media.a;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.sdk.utils.Logger;

/* JADX INFO: loaded from: classes5.dex */
public class hh extends WebViewClient {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f25239b = "hh";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final di.a f25240a;

    public hh(di.a aVar) {
        this.f25240a = aVar;
    }

    private String a(String str, String str2) {
        return a.o("ISNAdViewWebClient | External Adunit failed to load.", str, " Status code: ", str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        try {
            this.f25240a.a(a("onReceivedError", String.valueOf(i2)));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        super.onReceivedError(webView, i2, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f25240a.a(a("onReceivedHttpError", String.valueOf(webResourceResponse.getStatusCode())));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            Logger.e(f25239b, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            this.f25240a.b(renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system");
            return true;
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f25240a.a(a("onReceivedErrorM", String.valueOf(webResourceError.getErrorCode())));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }
}

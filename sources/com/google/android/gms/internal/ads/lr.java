package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lr extends ar {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f17109d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebViewClient f17110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H5AdsRequestHandler f17111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebView f17112c;

    public lr(Context context, WebView webView) {
        context.getClass();
        webView.getClass();
        ps1.C("JavaScript must be enabled on the WebView.", webView.getSettings().getJavaScriptEnabled());
        this.f17112c = webView;
        this.f17111b = new H5AdsRequestHandler(context, new x11(webView, 6));
    }

    @Override // com.google.android.gms.internal.ads.ar
    public final WebViewClient a() {
        return this.f17110a;
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (!this.f17112c.equals(webView)) {
            zzo.zzf("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        } else {
            if (this.f17111b.handleH5AdsRequest(str)) {
                return;
            }
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object obj = this.f17112c;
        if (!obj.equals(obj)) {
            zzo.zzf("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
            return false;
        }
        if (this.f17111b.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f17112c.equals(webView)) {
            if (this.f17111b.handleH5AdsRequest(str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        zzo.zzf("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }
}

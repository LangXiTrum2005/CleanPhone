package com.codejoy.boom.clap.helper;

import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.A5;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WebViewInitHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/codejoy/boom/clap/helper/formularize;", "", "<init>", "()V", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebViewClient;", "webViewClient", "Landroid/webkit/WebChromeClient;", "webChromeClient", "", "attabal", "(Landroid/webkit/WebView;Landroid/webkit/WebViewClient;Landroid/webkit/WebChromeClient;)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final formularize f18261attabal = new formularize();

    public final void attabal(WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName(A5.O);
        settings.setNeedInitialFocus(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setTextZoom(100);
        settings.setDefaultFontSize(16);
        settings.setMinimumFontSize(12);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSavePassword(false);
        settings.setGeolocationEnabled(false);
        settings.setMixedContentMode(0);
        webView.setLayerType(2, null);
        settings.setLoadsImagesAutomatically(true);
        settings.setBlockNetworkImage(false);
        settings.setAllowFileAccess(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        if (webViewClient != null) {
            webView.setWebViewClient(webViewClient);
        }
        if (webChromeClient != null) {
            webView.setWebChromeClient(webChromeClient);
        }
    }
}

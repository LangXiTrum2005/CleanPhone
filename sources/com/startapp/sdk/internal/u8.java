package com.startapp.sdk.internal;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class u8 extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w8 f41538a;

    public u8(w8 w8Var) {
        this.f41538a = w8Var;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i2) {
        this.f41538a.y.setProgress(i2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        if (str == null || str.equals("")) {
            return;
        }
        this.f41538a.f41620w.a().setText(str);
    }
}

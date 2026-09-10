package com.applovin.impl;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f9808b;

    public /* synthetic */ t9(WebView webView, int i10) {
        this.f9807a = i10;
        this.f9808b = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9807a;
        WebView webView = this.f9808b;
        switch (i10) {
            case 0:
                webView.destroy();
                break;
            default:
                p8.a(webView);
                break;
        }
    }
}

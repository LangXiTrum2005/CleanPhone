package com.applovin.impl;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f9977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9978c;

    public /* synthetic */ w9(WebView webView, String str, int i10) {
        this.f9976a = i10;
        this.f9977b = webView;
        this.f9978c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9976a) {
            case 0:
                this.f9977b.loadUrl(this.f9978c);
                break;
            default:
                this.f9977b.evaluateJavascript(this.f9978c, null);
                break;
        }
    }
}

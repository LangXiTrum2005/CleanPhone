package com.startapp.sdk.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class wk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f41645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xk f41646c;

    public wk(xk xkVar, String str, WebView webView) {
        this.f41646c = xkVar;
        this.f41644a = str;
        this.f41645b = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41646c.g = this.f41644a;
        this.f41645b.setWebViewClient(new sk());
        xk xkVar = this.f41646c;
        WebView webView = this.f41645b;
        xkVar.getClass();
        try {
            xkVar.f.addLast(webView);
        } catch (Throwable th) {
            if (xkVar.a(4)) {
                g9.a(th);
            }
        }
    }
}

package com.startapp.sdk.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class ri implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f41454a;

    public ri(WebView webView) {
        this.f41454a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f41454a.destroy();
        } catch (Throwable unused) {
        }
    }
}

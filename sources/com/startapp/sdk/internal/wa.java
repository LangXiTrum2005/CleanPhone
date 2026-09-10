package com.startapp.sdk.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class wa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za f41630a;

    public wa(za zaVar) {
        this.f41630a = zaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.f41630a.v;
        if (webView != null) {
            webView.onPause();
        }
    }
}

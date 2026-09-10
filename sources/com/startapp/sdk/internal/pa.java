package com.startapp.sdk.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class pa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za f41358a;

    public pa(za zaVar) {
        this.f41358a = zaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        za zaVar = this.f41358a;
        zaVar.f41767A = true;
        WebView webView = zaVar.v;
        if (webView != null) {
            webView.setOnTouchListener(null);
        }
    }
}

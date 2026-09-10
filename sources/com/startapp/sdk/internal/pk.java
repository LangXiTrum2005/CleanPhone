package com.startapp.sdk.internal;

import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class pk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f41376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f41377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ti f41378c;
    public final /* synthetic */ rk d;

    public pk(rk rkVar, AtomicBoolean atomicBoolean, WebView webView, ti tiVar) {
        this.d = rkVar;
        this.f41376a = atomicBoolean;
        this.f41377b = webView;
        this.f41378c = tiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f41376a.compareAndSet(false, true)) {
            this.d.a(this.f41377b);
            this.f41378c.a("Unknown error");
        }
    }
}

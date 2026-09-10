package com.startapp.sdk.internal;

import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class qk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f41415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f41416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ti f41417c;
    public final /* synthetic */ AtomicLong d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk f41418e;

    public qk(rk rkVar, AtomicBoolean atomicBoolean, WebView webView, ti tiVar, AtomicLong atomicLong) {
        this.f41418e = rkVar;
        this.f41415a = atomicBoolean;
        this.f41416b = webView;
        this.f41417c = tiVar;
        this.d = atomicLong;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f41415a.compareAndSet(false, true)) {
            this.f41418e.a(this.f41416b);
            ti tiVar = this.f41417c;
            this.d.get();
            vi.b();
            tiVar.a();
        }
    }
}

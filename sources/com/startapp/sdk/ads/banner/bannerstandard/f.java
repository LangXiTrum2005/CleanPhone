package com.startapp.sdk.ads.banner.bannerstandard;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CloseableLayout f40463a;

    public f(CloseableLayout closeableLayout) {
        this.f40463a = closeableLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40463a.a(false);
    }
}

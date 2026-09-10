package com.kochava.tracker.init.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class InitResponseDeeplinks implements InitResponseDeeplinksApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f28190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f28191c;
    public final InitResponseDeeplinksDeferredPrefetch d;

    public InitResponseDeeplinks() {
        this.f28189a = true;
        this.f28190b = 0.25d;
        this.f28191c = 30.0d;
        this.d = null;
    }

    public InitResponseDeeplinks(boolean z2, double d, double d2, InitResponseDeeplinksDeferredPrefetch initResponseDeeplinksDeferredPrefetch) {
        this.f28189a = z2;
        this.f28190b = d;
        this.f28191c = d2;
        this.d = initResponseDeeplinksDeferredPrefetch;
    }
}

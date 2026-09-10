package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;

/* JADX INFO: renamed from: com.ironsource.v5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0618v5 implements Bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterstitialAdRequest f30842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A9 f30843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0560s1 f30844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IronSourceError f30845d;

    public C0618v5(InterstitialAdRequest adRequest, A9 adLoadTaskListener, InterfaceC0560s1 analytics, IronSourceError error) {
        kotlin.jvm.internal.n.f(adRequest, "adRequest");
        kotlin.jvm.internal.n.f(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(error, "error");
        this.f30842a = adRequest;
        this.f30843b = adLoadTaskListener;
        this.f30844c = analytics;
        this.f30845d = error;
    }

    public final IronSourceError a() {
        return this.f30845d;
    }

    @Override // com.ironsource.Bb
    public void start() {
        C0546r5 c0546r5 = new C0546r5(this.f30844c, this.f30842a.getAdId$mediationsdk_release(), this.f30842a.getProviderName$mediationsdk_release());
        c0546r5.a();
        c0546r5.a(this.f30845d);
        this.f30843b.b(this.f30845d);
    }
}

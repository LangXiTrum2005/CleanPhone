package com.ironsource;

import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class I2 implements H2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0560s1 f26272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f26273b;

    public I2(InterfaceC0560s1 analytics, Executor callbackExecutor) {
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(callbackExecutor, "callbackExecutor");
        this.f26272a = analytics;
        this.f26273b = callbackExecutor;
    }

    @Override // com.ironsource.H2
    public BannerAdView a(K9 adInstance, C0353g8 adContainer, Y1 auctionDataReporter) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(adContainer, "adContainer");
        kotlin.jvm.internal.n.f(auctionDataReporter, "auctionDataReporter");
        return new BannerAdView(new P2(adInstance, adContainer, auctionDataReporter, this.f26272a, null, null, null, null, null, 496, null));
    }
}

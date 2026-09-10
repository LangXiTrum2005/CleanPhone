package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;

/* JADX INFO: renamed from: com.ironsource.c3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0276c3 implements V<BannerAdView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0379hg f28341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerAdLoaderListener f28342b;

    public C0276c3(InterfaceC0379hg threadManager, BannerAdLoaderListener publisherListener) {
        kotlin.jvm.internal.n.f(threadManager, "threadManager");
        kotlin.jvm.internal.n.f(publisherListener, "publisherListener");
        this.f28341a = threadManager;
        this.f28342b = publisherListener;
    }

    @Override // com.ironsource.V
    public void a(BannerAdView adObject) {
        kotlin.jvm.internal.n.f(adObject, "adObject");
        this.f28341a.a(new ki(21, adObject, this));
    }

    @Override // com.ironsource.V
    public void b(IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f28341a.a(new ki(20, error, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BannerAdView adObject, C0276c3 this$0) {
        kotlin.jvm.internal.n.f(adObject, "$adObject");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f28342b.onBannerAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, C0276c3 this$0) {
        kotlin.jvm.internal.n.f(error, "$error");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + error);
        this$0.f28342b.onBannerAdLoadFailed(error);
    }
}

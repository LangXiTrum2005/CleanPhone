package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ironsource/e7;", "Lcom/ironsource/s0;", "Lcom/unity3d/ironsourceads/banner/BannerAdView;", "adObject", "", "a", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", sv.f27214b, "Lcom/ironsource/zv;", "Lcom/ironsource/zv;", "threadManager", "Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;", "b", "Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;", "publisherListener", "<init>", "(Lcom/ironsource/zv;Lcom/unity3d/ironsourceads/banner/BannerAdLoaderListener;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class e7 implements s0<BannerAdView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zv threadManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BannerAdLoaderListener publisherListener;

    public e7(zv threadManager, BannerAdLoaderListener publisherListener) {
        Intrinsics.f(threadManager, "threadManager");
        Intrinsics.f(publisherListener, "publisherListener");
        this.threadManager = threadManager;
        this.publisherListener = publisherListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, e7 this$0) {
        Intrinsics.f(error, "$error");
        Intrinsics.f(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + error);
        this$0.publisherListener.onBannerAdLoadFailed(error);
    }

    @Override // com.p004ironsource.s0
    public void onAdLoadFailed(IronSourceError error) {
        Intrinsics.f(error, "error");
        this.threadManager.a(new G0(10, error, this));
    }

    @Override // com.p004ironsource.s0
    public void a(BannerAdView adObject) {
        Intrinsics.f(adObject, "adObject");
        this.threadManager.a(new G0(9, adObject, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BannerAdView adObject, e7 this$0) {
        Intrinsics.f(adObject, "$adObject");
        Intrinsics.f(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.publisherListener.onBannerAdLoaded(adObject);
    }
}

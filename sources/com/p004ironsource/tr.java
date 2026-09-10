package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ironsource/tr;", "Lcom/ironsource/s0;", "Lcom/unity3d/ironsourceads/rewarded/RewardedAd;", "adObject", "", "a", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", sv.f27214b, "Lcom/ironsource/zv;", "Lcom/ironsource/zv;", "threadManager", "Lcom/unity3d/ironsourceads/rewarded/RewardedAdLoaderListener;", "b", "Lcom/unity3d/ironsourceads/rewarded/RewardedAdLoaderListener;", "publisherListener", "<init>", "(Lcom/ironsource/zv;Lcom/unity3d/ironsourceads/rewarded/RewardedAdLoaderListener;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class tr implements s0<RewardedAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zv threadManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final RewardedAdLoaderListener publisherListener;

    public tr(zv threadManager, RewardedAdLoaderListener publisherListener) {
        Intrinsics.f(threadManager, "threadManager");
        Intrinsics.f(publisherListener, "publisherListener");
        this.threadManager = threadManager;
        this.publisherListener = publisherListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(tr this$0, IronSourceError error) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(error, "$error");
        this$0.publisherListener.onRewardedAdLoadFailed(error);
    }

    @Override // com.p004ironsource.s0
    public void onAdLoadFailed(IronSourceError error) {
        Intrinsics.f(error, "error");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + error);
        this.threadManager.a(new G0(29, this, error));
    }

    @Override // com.p004ironsource.s0
    public void a(RewardedAd adObject) {
        Intrinsics.f(adObject, "adObject");
        this.threadManager.a(new G0(28, adObject, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RewardedAd adObject, tr this$0) {
        Intrinsics.f(adObject, "$adObject");
        Intrinsics.f(this$0, "this$0");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.publisherListener.onRewardedAdLoaded(adObject);
    }
}

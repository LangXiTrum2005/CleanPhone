package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;

/* JADX INFO: renamed from: com.ironsource.ae, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0251ae implements V<RewardedAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0379hg f28229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RewardedAdLoaderListener f28230b;

    public C0251ae(InterfaceC0379hg threadManager, RewardedAdLoaderListener publisherListener) {
        kotlin.jvm.internal.n.f(threadManager, "threadManager");
        kotlin.jvm.internal.n.f(publisherListener, "publisherListener");
        this.f28229a = threadManager;
        this.f28230b = publisherListener;
    }

    @Override // com.ironsource.V
    public void a(RewardedAd adObject) {
        kotlin.jvm.internal.n.f(adObject, "adObject");
        this.f28229a.a(new ki(19, adObject, this));
    }

    @Override // com.ironsource.V
    public void b(IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + error);
        this.f28229a.a(new ki(18, this, error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RewardedAd adObject, C0251ae this$0) {
        kotlin.jvm.internal.n.f(adObject, "$adObject");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f28230b.onRewardedAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0251ae this$0, IronSourceError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        this$0.f28230b.onRewardedAdLoadFailed(error);
    }
}

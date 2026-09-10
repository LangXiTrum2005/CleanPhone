package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class A9 implements V<InterstitialAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0379hg f25624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterstitialAdLoaderListener f25625b;

    public A9(InterfaceC0379hg threadManager, InterstitialAdLoaderListener publisherListener) {
        kotlin.jvm.internal.n.f(threadManager, "threadManager");
        kotlin.jvm.internal.n.f(publisherListener, "publisherListener");
        this.f25624a = threadManager;
        this.f25625b = publisherListener;
    }

    @Override // com.ironsource.V
    public void a(InterstitialAd adObject) {
        kotlin.jvm.internal.n.f(adObject, "adObject");
        this.f25624a.a(new ki(3, adObject, this));
    }

    @Override // com.ironsource.V
    public void b(IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f25624a.a(new ki(2, error, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterstitialAd adObject, A9 this$0) {
        kotlin.jvm.internal.n.f(adObject, "$adObject");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f25625b.onInterstitialAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, A9 this$0) {
        kotlin.jvm.internal.n.f(error, "$error");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + error);
        this$0.f25625b.onInterstitialAdLoadFailed(error);
    }
}

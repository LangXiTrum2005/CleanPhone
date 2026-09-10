package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3825x9 implements V<InterstitialAd> {
    private final Pf a;
    private final InterstitialAdLoaderListener b;

    public C3825x9(Pf threadManager, InterstitialAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.a = threadManager;
        this.b = publisherListener;
    }

    @Override // com.ironsource.V
    public void b(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a(new Runnable() { // from class: com.ironsource.polliwog
            @Override // java.lang.Runnable
            public final void run() {
                C3825x9.a(error, this);
            }
        });
    }

    @Override // com.ironsource.V
    public void a(final InterstitialAd adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.a.a(new Runnable() { // from class: com.ironsource.balance
            @Override // java.lang.Runnable
            public final void run() {
                C3825x9.a(adObject, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterstitialAd adObject, C3825x9 this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.b.onInterstitialAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, C3825x9 this$0) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + error);
        this$0.b.onInterstitialAdLoadFailed(error);
    }
}

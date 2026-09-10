package com.p004ironsource.mediationsdk.sdk;

import com.p004ironsource.mediationsdk.demandOnly.g;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public interface DemandOnlyIsManagerListener {
    void onInterstitialAdClicked(g gVar);

    void onInterstitialAdClosed(g gVar);

    void onInterstitialAdLoadFailed(IronSourceError ironSourceError, g gVar, long j);

    void onInterstitialAdOpened(g gVar);

    void onInterstitialAdReady(g gVar, long j);

    void onInterstitialAdShowFailed(IronSourceError ironSourceError, g gVar);

    void onInterstitialAdVisible(g gVar);
}

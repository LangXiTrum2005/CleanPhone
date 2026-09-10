package com.p004ironsource.mediationsdk.demandOnly;

import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public interface ISDemandOnlyInterstitialListener {
    void onInterstitialAdClicked(String str);

    void onInterstitialAdClosed(String str);

    void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError);

    void onInterstitialAdOpened(String str);

    void onInterstitialAdReady(String str);

    void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError);
}

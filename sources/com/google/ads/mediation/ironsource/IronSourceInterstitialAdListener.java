package com.google.ads.mediation.ironsource;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
public class IronSourceInterstitialAdListener implements ISDemandOnlyInterstitialListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        MediationInterstitialAdCallback mediationInterstitialAdCallbackSaneness;
        String str2 = IronSourceConstants.f18943attabal;
        String.format("IronSource interstitial ad clicked for instance ID: %s", str);
        IronSourceInterstitialAd ironSourceInterstitialAdAttabal = IronSourceInterstitialAd.attabal(str);
        if (ironSourceInterstitialAdAttabal == null || (mediationInterstitialAdCallbackSaneness = ironSourceInterstitialAdAttabal.saneness()) == null) {
            return;
        }
        mediationInterstitialAdCallbackSaneness.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        MediationInterstitialAdCallback mediationInterstitialAdCallbackSaneness;
        String str2 = IronSourceConstants.f18943attabal;
        String.format("IronSource interstitial ad closed for instance ID: %s", str);
        IronSourceInterstitialAd ironSourceInterstitialAdAttabal = IronSourceInterstitialAd.attabal(str);
        if (ironSourceInterstitialAdAttabal != null && (mediationInterstitialAdCallbackSaneness = ironSourceInterstitialAdAttabal.saneness()) != null) {
            mediationInterstitialAdCallbackSaneness.onAdClosed();
        }
        IronSourceInterstitialAd.competently(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        String str2 = IronSourceConstants.f18943attabal;
        IronSourceInterstitialAd ironSourceInterstitialAdAttabal = IronSourceInterstitialAd.attabal(str);
        if (ironSourceInterstitialAdAttabal != null && ironSourceInterstitialAdAttabal.getMediationAdLoadCallback() != null) {
            ironSourceInterstitialAdAttabal.getMediationAdLoadCallback().onFailure(adError);
        }
        IronSourceInterstitialAd.competently(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        MediationInterstitialAdCallback mediationInterstitialAdCallbackSaneness;
        String str2 = IronSourceConstants.f18943attabal;
        String.format("IronSource interstitial ad opened for instance ID: %s", str);
        IronSourceInterstitialAd ironSourceInterstitialAdAttabal = IronSourceInterstitialAd.attabal(str);
        if (ironSourceInterstitialAdAttabal == null || (mediationInterstitialAdCallbackSaneness = ironSourceInterstitialAdAttabal.saneness()) == null) {
            return;
        }
        mediationInterstitialAdCallbackSaneness.onAdOpened();
        mediationInterstitialAdCallbackSaneness.reportAdImpression();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        String str2 = IronSourceConstants.f18943attabal;
        String.format("IronSource interstitial ad is ready for instance ID: %s", str);
        IronSourceInterstitialAd ironSourceInterstitialAdAttabal = IronSourceInterstitialAd.attabal(str);
        if (ironSourceInterstitialAdAttabal == null || ironSourceInterstitialAdAttabal.getMediationAdLoadCallback() == null) {
            return;
        }
        ironSourceInterstitialAdAttabal.impromptu(ironSourceInterstitialAdAttabal.getMediationAdLoadCallback().onSuccess(ironSourceInterstitialAdAttabal));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        MediationInterstitialAdCallback mediationInterstitialAdCallbackSaneness;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        String str2 = IronSourceConstants.f18943attabal;
        IronSourceInterstitialAd ironSourceInterstitialAdAttabal = IronSourceInterstitialAd.attabal(str);
        if (ironSourceInterstitialAdAttabal != null && (mediationInterstitialAdCallbackSaneness = ironSourceInterstitialAdAttabal.saneness()) != null) {
            mediationInterstitialAdCallbackSaneness.onAdFailedToShow(adError);
        }
        IronSourceInterstitialAd.competently(str);
    }
}

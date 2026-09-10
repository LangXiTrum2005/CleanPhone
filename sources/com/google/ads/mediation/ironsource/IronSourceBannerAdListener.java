package com.google.ads.mediation.ironsource;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
public class IronSourceBannerAdListener implements ISDemandOnlyBannerListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdClicked(String str) {
        MediationBannerAdCallback mediationBannerAdCallbackDern;
        String str2 = IronSourceConstants.f18943attabal;
        String.format("IronSource banner ad clicked for instance ID: %s", str);
        IronSourceBannerAd ironSourceBannerAdWireman = IronSourceBannerAd.wireman(str);
        if (ironSourceBannerAdWireman == null || (mediationBannerAdCallbackDern = ironSourceBannerAdWireman.dern()) == null) {
            return;
        }
        mediationBannerAdCallbackDern.onAdOpened();
        mediationBannerAdCallbackDern.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdLeftApplication(String str) {
        MediationBannerAdCallback mediationBannerAdCallbackDern;
        String str2 = IronSourceConstants.f18943attabal;
        String.format("IronSource banner ad has caused user to leave the application for instance ID: %s", str);
        IronSourceBannerAd ironSourceBannerAdWireman = IronSourceBannerAd.wireman(str);
        if (ironSourceBannerAdWireman == null || (mediationBannerAdCallbackDern = ironSourceBannerAdWireman.dern()) == null) {
            return;
        }
        mediationBannerAdCallbackDern.onAdLeftApplication();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdLoadFailed(String str, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        String str2 = IronSourceConstants.f18943attabal;
        IronSourceBannerAd ironSourceBannerAdWireman = IronSourceBannerAd.wireman(str);
        if (ironSourceBannerAdWireman == null) {
            return;
        }
        MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallbackSaneness = ironSourceBannerAdWireman.saneness();
        if (mediationAdLoadCallbackSaneness != null) {
            mediationAdLoadCallbackSaneness.onFailure(adError);
        }
        if (ironSourceError.getErrorCode() == 1050 || ironSourceError.getErrorCode() == 619) {
            return;
        }
        IronSourceBannerAd.taiyuan(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdLoaded(String str) {
        String str2 = IronSourceConstants.f18943attabal;
        String.format("IronSource banner ad loaded for instance ID: %s", str);
        IronSourceBannerAd ironSourceBannerAdWireman = IronSourceBannerAd.wireman(str);
        if (ironSourceBannerAdWireman == null || ironSourceBannerAdWireman.marial() == null) {
            return;
        }
        ironSourceBannerAdWireman.marial().addView(ironSourceBannerAdWireman.beachfront());
        if (ironSourceBannerAdWireman.saneness() != null) {
            ironSourceBannerAdWireman.cutely(ironSourceBannerAdWireman.saneness().onSuccess(ironSourceBannerAdWireman));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdShown(String str) {
        MediationBannerAdCallback mediationBannerAdCallbackDern;
        String str2 = IronSourceConstants.f18943attabal;
        String.format("IronSource banner ad shown for instance ID: %s", str);
        IronSourceBannerAd ironSourceBannerAdWireman = IronSourceBannerAd.wireman(str);
        if (ironSourceBannerAdWireman != null && (mediationBannerAdCallbackDern = ironSourceBannerAdWireman.dern()) != null) {
            mediationBannerAdCallbackDern.reportAdImpression();
        }
        IronSourceBannerAd.attabal(str);
    }
}

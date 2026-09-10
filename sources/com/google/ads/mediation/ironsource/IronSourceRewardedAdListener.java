package com.google.ads.mediation.ironsource;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
public class IronSourceRewardedAdListener implements ISDemandOnlyRewardedVideoListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallbackDern;
        String str2 = IronSourceConstants.f18943attabal;
        String.format("IronSource rewarded ad clicked for instance ID: %s", str);
        IronSourceRewardedAd ironSourceRewardedAdAttabal = IronSourceRewardedAd.attabal(str);
        if (ironSourceRewardedAdAttabal == null || (mediationRewardedAdCallbackDern = ironSourceRewardedAdAttabal.dern()) == null) {
            return;
        }
        mediationRewardedAdCallbackDern.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallbackDern;
        String str2 = IronSourceConstants.f18943attabal;
        String.format("IronSource rewarded ad closed for instance ID: %s", str);
        IronSourceRewardedAd ironSourceRewardedAdAttabal = IronSourceRewardedAd.attabal(str);
        if (ironSourceRewardedAdAttabal != null && (mediationRewardedAdCallbackDern = ironSourceRewardedAdAttabal.dern()) != null) {
            mediationRewardedAdCallbackDern.onAdClosed();
        }
        IronSourceRewardedAd.competently(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        String str2 = IronSourceConstants.f18943attabal;
        IronSourceRewardedAd ironSourceRewardedAdAttabal = IronSourceRewardedAd.attabal(str);
        if (ironSourceRewardedAdAttabal != null && ironSourceRewardedAdAttabal.getMediationAdLoadCallback() != null) {
            ironSourceRewardedAdAttabal.getMediationAdLoadCallback().onFailure(adError);
        }
        IronSourceRewardedAd.competently(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        String str2 = IronSourceConstants.f18943attabal;
        String.format("IronSource rewarded ad loaded for instance ID: %s", str);
        IronSourceRewardedAd ironSourceRewardedAdAttabal = IronSourceRewardedAd.attabal(str);
        if (ironSourceRewardedAdAttabal == null || ironSourceRewardedAdAttabal.getMediationAdLoadCallback() == null) {
            return;
        }
        ironSourceRewardedAdAttabal.impromptu(ironSourceRewardedAdAttabal.getMediationAdLoadCallback().onSuccess(ironSourceRewardedAdAttabal));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallbackDern;
        String str2 = IronSourceConstants.f18943attabal;
        String.format("IronSource rewarded ad opened for instance ID: %s", str);
        IronSourceRewardedAd ironSourceRewardedAdAttabal = IronSourceRewardedAd.attabal(str);
        if (ironSourceRewardedAdAttabal == null || (mediationRewardedAdCallbackDern = ironSourceRewardedAdAttabal.dern()) == null) {
            return;
        }
        mediationRewardedAdCallbackDern.onAdOpened();
        mediationRewardedAdCallbackDern.onVideoStart();
        mediationRewardedAdCallbackDern.reportAdImpression();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallbackDern;
        String str2 = IronSourceConstants.f18943attabal;
        String.format("IronSource rewarded ad received reward for instance ID: %s", str);
        IronSourceRewardedAd ironSourceRewardedAdAttabal = IronSourceRewardedAd.attabal(str);
        if (ironSourceRewardedAdAttabal == null || (mediationRewardedAdCallbackDern = ironSourceRewardedAdAttabal.dern()) == null) {
            return;
        }
        mediationRewardedAdCallbackDern.onVideoComplete();
        mediationRewardedAdCallbackDern.onUserEarnedReward();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        MediationRewardedAdCallback mediationRewardedAdCallbackDern;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        String str2 = IronSourceConstants.f18943attabal;
        IronSourceRewardedAd ironSourceRewardedAdAttabal = IronSourceRewardedAd.attabal(str);
        if (ironSourceRewardedAdAttabal != null && (mediationRewardedAdCallbackDern = ironSourceRewardedAdAttabal.dern()) != null) {
            mediationRewardedAdCallbackDern.onAdFailedToShow(adError);
        }
        IronSourceRewardedAd.competently(str);
    }
}

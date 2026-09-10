package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.AppLovinExtras;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;

/* JADX INFO: loaded from: classes2.dex */
public class IronSourceRtbRewardedAd implements MediationRewardedAd, RewardedAdLoaderListener, RewardedAdListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f18963arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public MediationRewardedAdCallback f18964kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public RewardedAd f18965monoploid = null;

    public IronSourceRtbRewardedAd(MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f18963arytenoidectomy = mediationAdLoadCallback;
    }

    public final void attabal(AdError adError) {
        String str = IronSourceConstants.f18943attabal;
        adError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f18964kowloon;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    public void loadRtbAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("instanceId", "");
        if (TextUtils.isEmpty(string)) {
            this.f18963arytenoidectomy.onFailure(IronSourceAdapterUtils.buildAdErrorAdapterDomain(101, "Missing or invalid instance ID."));
        } else {
            String str = mediationRewardedAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String();
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinExtras.Keys.KEY_WATERMARK, str);
            RewardedAdLoader.loadAd(new RewardedAdRequest.Builder(string, mediationRewardedAdConfiguration.getBidResponse()).withExtraParams(bundle).build(), this);
        }
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdClicked(RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f18964kowloon;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdDismissed(RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f18964kowloon;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdClosed();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdFailedToShow(RewardedAd rewardedAd, IronSourceError ironSourceError) {
        attabal(IronSourceAdapterUtils.buildAdErrorIronSourceDomain(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
    public void onRewardedAdLoadFailed(IronSourceError ironSourceError) {
        this.f18963arytenoidectomy.onFailure(IronSourceAdapterUtils.buildAdErrorIronSourceDomain(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
    public void onRewardedAdLoaded(RewardedAd rewardedAd) {
        this.f18965monoploid = rewardedAd;
        this.f18964kowloon = this.f18963arytenoidectomy.onSuccess(this);
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdShown(RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f18964kowloon;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        this.f18964kowloon.onVideoStart();
        this.f18964kowloon.reportAdImpression();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onUserEarnedReward(RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f18964kowloon;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onVideoComplete();
        this.f18964kowloon.onUserEarnedReward();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        RewardedAd rewardedAd = this.f18965monoploid;
        if (rewardedAd == null) {
            attabal(IronSourceAdapterUtils.buildAdErrorAdapterDomain(107, "ad is null"));
            return;
        }
        try {
            String str = IronSourceConstants.f18943attabal;
            rewardedAd.setListener(this);
            this.f18965monoploid.show((Activity) context);
        } catch (ClassCastException unused) {
            attabal(IronSourceAdapterUtils.buildAdErrorAdapterDomain(102, "IronSource requires an Activity context to load ads."));
        }
    }
}

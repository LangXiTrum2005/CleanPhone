package com.google.ads.mediation.mintegral.mediation;

import com.google.ads.mediation.mintegral.FlagValueGetter;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralSlotIdentifier;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MintegralInterstitialAd extends NewInterstitialWithCodeListener implements MediationInterstitialAd {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public MintegralSlotIdentifier f18999arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f19000kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final FlagValueGetter f19001molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public MediationInterstitialAdCallback f19002monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final boolean f19003polloi;

    public MintegralInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, FlagValueGetter flagValueGetter) {
        this.f19003polloi = MintegralUtils.shouldMuteAudio(mediationInterstitialAdConfiguration.getMediationExtras());
        this.f19000kowloon = mediationAdLoadCallback;
        this.f19001molybdenite = flagValueGetter;
    }

    public abstract void loadAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration);

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdClicked(MBridgeIds mBridgeIds) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f19002monoploid;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f19002monoploid;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdShow(MBridgeIds mBridgeIds) {
        MintegralSlotIdentifier mintegralSlotIdentifier;
        if (this.f19001molybdenite.shouldRestrictMultipleAdLoads() && (mintegralSlotIdentifier = this.f18999arytenoidectomy) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(mintegralSlotIdentifier);
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f19002monoploid;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
            this.f19002monoploid.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public void onResourceLoadFailWithCode(MBridgeIds mBridgeIds, int i, String str) {
        MintegralSlotIdentifier mintegralSlotIdentifier;
        if (this.f19001molybdenite.shouldRestrictMultipleAdLoads() && (mintegralSlotIdentifier = this.f18999arytenoidectomy) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(mintegralSlotIdentifier);
        }
        AdError adErrorCreateSdkError = MintegralConstants.createSdkError(i, str);
        String str2 = MintegralMediationAdapter.TAG;
        adErrorCreateSdkError.toString();
        this.f19000kowloon.onFailure(adErrorCreateSdkError);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
        this.f19002monoploid = this.f19000kowloon.onSuccess(this);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public void onShowFailWithCode(MBridgeIds mBridgeIds, int i, String str) {
        MintegralSlotIdentifier mintegralSlotIdentifier;
        if (this.f19001molybdenite.shouldRestrictMultipleAdLoads() && (mintegralSlotIdentifier = this.f18999arytenoidectomy) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(mintegralSlotIdentifier);
        }
        AdError adErrorCreateSdkError = MintegralConstants.createSdkError(i, str);
        String str2 = MintegralMediationAdapter.TAG;
        adErrorCreateSdkError.toString();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f19002monoploid;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adErrorCreateSdkError);
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onVideoComplete(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }
}

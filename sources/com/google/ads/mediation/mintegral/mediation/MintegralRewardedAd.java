package com.google.ads.mediation.mintegral.mediation;

import com.google.ads.mediation.mintegral.FlagValueGetter;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralSlotIdentifier;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MintegralRewardedAd extends RewardVideoWithCodeListener implements MediationRewardedAd {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public MintegralSlotIdentifier f19015arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f19016kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final FlagValueGetter f19017molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public MediationRewardedAdCallback f19018monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final boolean f19019polloi;

    public MintegralRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, FlagValueGetter flagValueGetter) {
        this.f19019polloi = MintegralUtils.shouldMuteAudio(mediationRewardedAdConfiguration.getMediationExtras());
        this.f19016kowloon = mediationAdLoadCallback;
        this.f19017molybdenite = flagValueGetter;
    }

    public abstract void loadAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration);

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        if (this.f19018monoploid == null) {
            return;
        }
        if (rewardInfo == null || !rewardInfo.isCompleteView()) {
            String str = MintegralMediationAdapter.TAG;
        } else {
            this.f19018monoploid.onUserEarnedReward();
        }
        this.f19018monoploid.onAdClosed();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdShow(MBridgeIds mBridgeIds) {
        MintegralSlotIdentifier mintegralSlotIdentifier;
        if (this.f19017molybdenite.shouldRestrictMultipleAdLoads() && (mintegralSlotIdentifier = this.f19015arytenoidectomy) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(mintegralSlotIdentifier);
        }
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f19018monoploid;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.f19018monoploid.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onShowFailWithCode(MBridgeIds mBridgeIds, int i, String str) {
        MintegralSlotIdentifier mintegralSlotIdentifier;
        if (this.f19017molybdenite.shouldRestrictMultipleAdLoads() && (mintegralSlotIdentifier = this.f19015arytenoidectomy) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(mintegralSlotIdentifier);
        }
        AdError adErrorCreateSdkError = MintegralConstants.createSdkError(i, str);
        String str2 = MintegralMediationAdapter.TAG;
        adErrorCreateSdkError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f19018monoploid;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adErrorCreateSdkError);
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoAdClicked(MBridgeIds mBridgeIds) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f19018monoploid;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i, String str) {
        MintegralSlotIdentifier mintegralSlotIdentifier;
        if (this.f19017molybdenite.shouldRestrictMultipleAdLoads() && (mintegralSlotIdentifier = this.f19015arytenoidectomy) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(mintegralSlotIdentifier);
        }
        AdError adErrorCreateSdkError = MintegralConstants.createSdkError(i, str);
        String str2 = MintegralMediationAdapter.TAG;
        adErrorCreateSdkError.toString();
        this.f19016kowloon.onFailure(adErrorCreateSdkError);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        this.f19018monoploid = this.f19016kowloon.onSuccess(this);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onLoadSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoComplete(MBridgeIds mBridgeIds) {
    }
}

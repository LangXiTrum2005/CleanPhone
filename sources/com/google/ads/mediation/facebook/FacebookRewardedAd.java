package com.google.ads.mediation.facebook;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class FacebookRewardedAd implements MediationRewardedAd, RewardedVideoAdExtendedListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public RewardedVideoAd f18836arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final MetaFactory f18837graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f18838kowloon;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public MediationRewardedAdCallback f18841polloi;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final AtomicBoolean f18840monoploid = new AtomicBoolean();

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final AtomicBoolean f18839molybdenite = new AtomicBoolean();

    public FacebookRewardedAd(MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, MetaFactory metaFactory) {
        this.f18838kowloon = mediationAdLoadCallback;
        this.f18837graveside = metaFactory;
    }

    public AdExperienceType attabal() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f18841polloi;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f18838kowloon;
        if (mediationAdLoadCallback != null) {
            this.f18841polloi = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        if (this.f18840monoploid.get()) {
            String str = FacebookMediationAdapter.TAG;
            adError2.getMessage();
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f18841polloi;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError2);
            }
        } else {
            String str2 = FacebookMediationAdapter.TAG;
            adError2.getMessage();
            MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f18838kowloon;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError2);
            }
        }
        this.f18836arytenoidectomy.destroy();
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f18841polloi;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public void onRewardedVideoActivityDestroyed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f18839molybdenite.getAndSet(true) && (mediationRewardedAdCallback = this.f18841polloi) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f18836arytenoidectomy;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f18839molybdenite.getAndSet(true) && (mediationRewardedAdCallback = this.f18841polloi) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f18836arytenoidectomy;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
        this.f18841polloi.onVideoComplete();
        this.f18841polloi.onUserEarnedReward();
    }

    public void render(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Context context = mediationRewardedAdConfiguration.getContext();
        String placementID = FacebookMediationAdapter.getPlacementID(mediationRewardedAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            String str = FacebookMediationAdapter.TAG;
            adError.getMessage();
            this.f18838kowloon.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationRewardedAdConfiguration);
        this.f18836arytenoidectomy = this.f18837graveside.createRewardedAd(context, placementID);
        if (!TextUtils.isEmpty(mediationRewardedAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String())) {
            this.f18836arytenoidectomy.setExtraHints(new ExtraHints.Builder().mediationData(mediationRewardedAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String()).build());
        }
        RewardedVideoAd rewardedVideoAd = this.f18836arytenoidectomy;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(mediationRewardedAdConfiguration.getBidResponse()).withAdExperience(attabal()).build());
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.f18840monoploid.set(true);
        if (this.f18836arytenoidectomy.show()) {
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f18841polloi;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onVideoStart();
                this.f18841polloi.onAdOpened();
                return;
            }
            return;
        }
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Failed to present rewarded ad.", "com.google.ads.mediation.facebook");
        String str = FacebookMediationAdapter.TAG;
        adError.getMessage();
        MediationRewardedAdCallback mediationRewardedAdCallback2 = this.f18841polloi;
        if (mediationRewardedAdCallback2 != null) {
            mediationRewardedAdCallback2.onAdFailedToShow(adError);
        }
        this.f18836arytenoidectomy.destroy();
    }
}

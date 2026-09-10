package com.google.ads.mediation.inmobi.renderers;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.inmobi.InMobiAdFactory;
import com.google.ads.mediation.inmobi.InMobiAdapterUtils;
import com.google.ads.mediation.inmobi.InMobiConstants;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.ads.mediation.inmobi.InMobiInterstitialWrapper;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InMobiRewardedAd extends InterstitialAdEventListener implements MediationRewardedAd {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f18918arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public InMobiInterstitialWrapper f18919kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public InMobiAdFactory f18920molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public InMobiInitializer f18921monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public MediationRewardedAdCallback f18922polloi;

    public InMobiRewardedAd(MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        this.f18918arytenoidectomy = mediationAdLoadCallback;
        this.f18921monoploid = inMobiInitializer;
        this.f18920molybdenite = inMobiAdFactory;
    }

    public void attabal(Context context, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        this.f18919kowloon = this.f18920molybdenite.createInMobiInterstitialWrapper(context, Long.valueOf(InMobiAdapterUtils.getPlacementId(mediationRewardedAdConfiguration.getServerParameters())), this);
        InMobiAdapterUtils.setIsAgeRestricted();
        InMobiAdapterUtils.configureGlobalTargeting(mediationRewardedAdConfiguration.getMediationExtras());
        String str = mediationRewardedAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String();
        if (!TextUtils.isEmpty(str)) {
            this.f18919kowloon.setWatermarkData(new WatermarkData(str, 0.3f));
        }
        saneness(this.f18919kowloon, mediationRewardedAdConfiguration);
    }

    public abstract void loadAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration);

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdClicked(InMobiInterstitial inMobiInterstitial, Map map) {
        onAdClicked2(inMobiInterstitial, (Map<Object, Object>) map);
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f18922polloi;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
        AdError adErrorCreateAdapterError = InMobiConstants.createAdapterError(106, "InMobi rewarded ad failed to show.");
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        adErrorCreateAdapterError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f18922polloi;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adErrorCreateAdapterError);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f18922polloi;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.f18922polloi.onVideoStart();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f18922polloi;
        if (mediationRewardedAdCallback != null) {
            String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
            mediationRewardedAdCallback.onVideoComplete();
            this.f18922polloi.onUserEarnedReward();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
    }

    public abstract void saneness(InMobiInterstitialWrapper inMobiInterstitialWrapper, MediationRewardedAdConfiguration mediationRewardedAdConfiguration);

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        if (this.f18919kowloon.isReady().booleanValue()) {
            this.f18919kowloon.show();
            return;
        }
        AdError adErrorCreateAdapterError = InMobiConstants.createAdapterError(105, "InMobi rewarded ad is not yet ready to be shown.");
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        adErrorCreateAdapterError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f18922polloi;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adErrorCreateAdapterError);
        }
    }

    /* JADX INFO: renamed from: onAdClicked, reason: avoid collision after fix types in other method */
    public void onAdClicked2(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f18922polloi;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdImpression(InMobiInterstitial inMobiInterstitial) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f18922polloi;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adErrorCreateSdkError = InMobiConstants.createSdkError(InMobiAdapterUtils.getMediationErrorCode(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        adErrorCreateSdkError.toString();
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f18918arytenoidectomy;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adErrorCreateSdkError);
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f18918arytenoidectomy;
        if (mediationAdLoadCallback != null) {
            this.f18922polloi = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onRequestPayloadCreated(byte[] bArr) {
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
    }
}

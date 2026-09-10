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
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InMobiInterstitialAd extends InterstitialAdEventListener implements MediationInterstitialAd {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f18909arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public InMobiInterstitialWrapper f18910kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public InMobiAdFactory f18911molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public InMobiInitializer f18912monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public MediationInterstitialAdCallback f18913polloi;

    public InMobiInterstitialAd(MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        this.f18909arytenoidectomy = mediationAdLoadCallback;
        this.f18912monoploid = inMobiInitializer;
        this.f18911molybdenite = inMobiAdFactory;
    }

    public void attabal(Context context, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        this.f18910kowloon = this.f18911molybdenite.createInMobiInterstitialWrapper(context, Long.valueOf(InMobiAdapterUtils.getPlacementId(mediationInterstitialAdConfiguration.getServerParameters())), this);
        InMobiAdapterUtils.setIsAgeRestricted();
        InMobiAdapterUtils.configureGlobalTargeting(mediationInterstitialAdConfiguration.getMediationExtras());
        String str = mediationInterstitialAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String();
        if (!TextUtils.isEmpty(str)) {
            this.f18910kowloon.setWatermarkData(new WatermarkData(str, 0.3f));
        }
        saneness(this.f18910kowloon, mediationInterstitialAdConfiguration);
    }

    public abstract void loadAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration);

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdClicked(InMobiInterstitial inMobiInterstitial, Map map) {
        onAdClicked2(inMobiInterstitial, (Map<Object, Object>) map);
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18913polloi;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
        AdError adErrorCreateAdapterError = InMobiConstants.createAdapterError(106, "InMobi SDK failed to display an interstitial ad.");
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        adErrorCreateAdapterError.toString();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18913polloi;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adErrorCreateAdapterError);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18913polloi;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18913polloi;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    public abstract void saneness(InMobiInterstitialWrapper inMobiInterstitialWrapper, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration);

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        if (this.f18910kowloon.isReady().booleanValue()) {
            this.f18910kowloon.show();
            return;
        }
        AdError adErrorCreateAdapterError = InMobiConstants.createAdapterError(105, "InMobi interstitial ad is not yet ready to be shown.");
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        adErrorCreateAdapterError.toString();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18913polloi;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adErrorCreateAdapterError);
        }
    }

    /* JADX INFO: renamed from: onAdClicked, reason: avoid collision after fix types in other method */
    public void onAdClicked2(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18913polloi;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdImpression(InMobiInterstitial inMobiInterstitial) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18913polloi;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adErrorCreateSdkError = InMobiConstants.createSdkError(InMobiAdapterUtils.getMediationErrorCode(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        adErrorCreateSdkError.toString();
        MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback = this.f18909arytenoidectomy;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adErrorCreateSdkError);
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback = this.f18909arytenoidectomy;
        if (mediationAdLoadCallback != null) {
            this.f18913polloi = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
    }
}

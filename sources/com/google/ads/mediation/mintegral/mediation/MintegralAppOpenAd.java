package com.google.ads.mediation.mintegral.mediation;

import com.google.ads.mediation.mintegral.FlagValueGetter;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralSlotIdentifier;
import com.google.ads.mediation.mintegral.MintegralSplashAdWrapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MintegralAppOpenAd extends MBSplashLoadWithCodeListener implements MediationAppOpenAd, MBSplashShowListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public MintegralSlotIdentifier f18991arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> f18992kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final FlagValueGetter f18993molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public MediationAppOpenAdCallback f18994monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public MintegralSplashAdWrapper f18995polloi;

    public MintegralAppOpenAd(MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, FlagValueGetter flagValueGetter) {
        this.f18992kowloon = mediationAdLoadCallback;
        this.f18993molybdenite = flagValueGetter;
    }

    public abstract void loadAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onAdClicked(MBridgeIds mBridgeIds) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f18994monoploid;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onDismiss(MBridgeIds mBridgeIds, int i) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f18994monoploid;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
        MintegralSplashAdWrapper mintegralSplashAdWrapper = this.f18995polloi;
        if (mintegralSplashAdWrapper != null) {
            mintegralSplashAdWrapper.onDestroy();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadWithCodeListener
    public void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i, String str, int i2) {
        MintegralSlotIdentifier mintegralSlotIdentifier;
        if (this.f18993molybdenite.shouldRestrictMultipleAdLoads() && (mintegralSlotIdentifier = this.f18991arytenoidectomy) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(mintegralSlotIdentifier);
        }
        AdError adErrorCreateSdkError = MintegralConstants.createSdkError(i, str);
        String str2 = MintegralMediationAdapter.TAG;
        adErrorCreateSdkError.toString();
        this.f18992kowloon.onFailure(adErrorCreateSdkError);
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void onLoadSuccessed(MBridgeIds mBridgeIds, int i) {
        this.f18994monoploid = this.f18992kowloon.onSuccess(this);
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onShowFailed(MBridgeIds mBridgeIds, String str) {
        MintegralSlotIdentifier mintegralSlotIdentifier;
        if (this.f18993molybdenite.shouldRestrictMultipleAdLoads() && (mintegralSlotIdentifier = this.f18991arytenoidectomy) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(mintegralSlotIdentifier);
        }
        if (this.f18994monoploid != null) {
            AdError adErrorCreateSdkError = MintegralConstants.createSdkError(100, str);
            String str2 = MintegralMediationAdapter.TAG;
            adErrorCreateSdkError.toString();
            this.f18994monoploid.onAdFailedToShow(adErrorCreateSdkError);
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onShowSuccessed(MBridgeIds mBridgeIds) {
        MintegralSlotIdentifier mintegralSlotIdentifier;
        if (this.f18993molybdenite.shouldRestrictMultipleAdLoads() && (mintegralSlotIdentifier = this.f18991arytenoidectomy) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(mintegralSlotIdentifier);
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f18994monoploid;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
            this.f18994monoploid.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onZoomOutPlayFinish(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onZoomOutPlayStart(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onAdTick(MBridgeIds mBridgeIds, long j) {
    }
}

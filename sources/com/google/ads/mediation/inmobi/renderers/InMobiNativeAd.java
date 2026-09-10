package com.google.ads.mediation.inmobi.renderers;

import android.content.Context;
import com.google.ads.mediation.inmobi.InMobiAdFactory;
import com.google.ads.mediation.inmobi.InMobiAdapterUtils;
import com.google.ads.mediation.inmobi.InMobiConstants;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNativeWrapper;
import com.google.ads.mediation.inmobi.InMobiUnifiedNativeAdMapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InMobiNativeAd extends NativeAdEventListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f18914arytenoidectomy;
    public InMobiAdFactory inMobiAdFactory;
    public InMobiInitializer inMobiInitializer;
    public InMobiUnifiedNativeAdMapper inMobiUnifiedNativeAdMapper;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationNativeAdConfiguration f18915kowloon;
    public MediationNativeAdCallback mediationNativeAdCallback;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public InMobiNativeWrapper f18916monoploid;

    public class attabal extends VideoEventListener {
        public attabal() {
        }

        @Override // com.inmobi.ads.listeners.VideoEventListener
        public void onVideoCompleted(InMobiNative inMobiNative) {
            super.onVideoCompleted(inMobiNative);
            String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
            MediationNativeAdCallback mediationNativeAdCallback = InMobiNativeAd.this.mediationNativeAdCallback;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.onVideoComplete();
            }
        }

        @Override // com.inmobi.ads.listeners.VideoEventListener
        public void onVideoSkipped(InMobiNative inMobiNative) {
            super.onVideoSkipped(inMobiNative);
            String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        }
    }

    public InMobiNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        this.f18915kowloon = mediationNativeAdConfiguration;
        this.f18914arytenoidectomy = mediationAdLoadCallback;
        this.inMobiInitializer = inMobiInitializer;
        this.inMobiAdFactory = inMobiAdFactory;
    }

    public void attabal(Context context, long j) {
        InMobiNativeWrapper inMobiNativeWrapperCreateInMobiNativeWrapper = this.inMobiAdFactory.createInMobiNativeWrapper(context, Long.valueOf(j), this);
        this.f18916monoploid = inMobiNativeWrapperCreateInMobiNativeWrapper;
        inMobiNativeWrapperCreateInMobiNativeWrapper.setVideoEventListener(new attabal());
        InMobiAdapterUtils.setIsAgeRestricted();
        InMobiAdapterUtils.configureGlobalTargeting(this.f18915kowloon.getMediationExtras());
        internalLoadAd(this.f18916monoploid);
    }

    public abstract void internalLoadAd(InMobiNativeWrapper inMobiNativeWrapper);

    public abstract void loadAd();

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdClicked(InMobiNative inMobiNative) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdFullScreenDismissed(InMobiNative inMobiNative) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdFullScreenDisplayed(InMobiNative inMobiNative) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onUserWillLeaveApplication(InMobiNative inMobiNative) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdImpression(InMobiNative inMobiNative) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadFailed(InMobiNative inMobiNative, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adErrorCreateSdkError = InMobiConstants.createSdkError(InMobiAdapterUtils.getMediationErrorCode(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        adErrorCreateSdkError.toString();
        this.f18914arytenoidectomy.onFailure(adErrorCreateSdkError);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadSucceeded(InMobiNative inMobiNative, AdMetaInfo adMetaInfo) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        NativeAdOptions nativeAdOptions = this.f18915kowloon.getNativeAdOptions();
        InMobiUnifiedNativeAdMapper inMobiUnifiedNativeAdMapper = new InMobiUnifiedNativeAdMapper(this.inMobiAdFactory.createInMobiNativeWrapper(inMobiNative), Boolean.valueOf(nativeAdOptions != null ? nativeAdOptions.shouldReturnUrlsForImageAssets() : false), this.f18914arytenoidectomy, this);
        this.inMobiUnifiedNativeAdMapper = inMobiUnifiedNativeAdMapper;
        inMobiUnifiedNativeAdMapper.mapUnifiedNativeAd(this.f18915kowloon.getContext());
    }
}

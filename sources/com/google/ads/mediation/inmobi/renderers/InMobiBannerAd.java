package com.google.ads.mediation.inmobi.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.ads.mediation.inmobi.InMobiAdFactory;
import com.google.ads.mediation.inmobi.InMobiAdViewHolder;
import com.google.ads.mediation.inmobi.InMobiAdapterUtils;
import com.google.ads.mediation.inmobi.InMobiBannerWrapper;
import com.google.ads.mediation.inmobi.InMobiConstants;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InMobiBannerAd extends BannerAdEventListener implements MediationBannerAd {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public InMobiInitializer f18904arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f18905kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public InMobiAdFactory f18906molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public MediationBannerAdCallback f18907monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public InMobiAdViewHolder f18908polloi;

    public InMobiBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        this.f18905kowloon = mediationAdLoadCallback;
        this.f18904arytenoidectomy = inMobiInitializer;
        this.f18906molybdenite = inMobiAdFactory;
    }

    public void attabal(Context context, AdSize adSize, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        InMobiAdapterUtils.setIsAgeRestricted();
        InMobiAdapterUtils.configureGlobalTargeting(mediationBannerAdConfiguration.getMediationExtras());
        InMobiBannerWrapper inMobiBannerWrapperCreateInMobiBannerWrapper = this.f18906molybdenite.createInMobiBannerWrapper(context, Long.valueOf(InMobiAdapterUtils.getPlacementId(mediationBannerAdConfiguration.getServerParameters())));
        inMobiBannerWrapperCreateInMobiBannerWrapper.setEnableAutoRefresh(Boolean.FALSE);
        inMobiBannerWrapperCreateInMobiBannerWrapper.setAnimationType(InMobiBanner.AnimationType.ANIMATION_OFF);
        inMobiBannerWrapperCreateInMobiBannerWrapper.setListener(this);
        String str = mediationBannerAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String();
        if (!TextUtils.isEmpty(str)) {
            inMobiBannerWrapperCreateInMobiBannerWrapper.setWatermarkData(new WatermarkData(str, 0.3f));
        }
        InMobiAdViewHolder inMobiAdViewHolderCreateInMobiAdViewHolder = this.f18906molybdenite.createInMobiAdViewHolder(context);
        this.f18908polloi = inMobiAdViewHolderCreateInMobiAdViewHolder;
        inMobiAdViewHolderCreateInMobiAdViewHolder.setLayoutParams(new FrameLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context)));
        inMobiBannerWrapperCreateInMobiBannerWrapper.setLayoutParams(new LinearLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context)));
        this.f18908polloi.addView(inMobiBannerWrapperCreateInMobiBannerWrapper);
        internalLoadAd(inMobiBannerWrapperCreateInMobiBannerWrapper, mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f18908polloi.getFrameLayout();
    }

    public abstract void internalLoadAd(InMobiBannerWrapper inMobiBannerWrapper, MediationBannerAdConfiguration mediationBannerAdConfiguration);

    public abstract void loadAd(MediationBannerAdConfiguration mediationBannerAdConfiguration);

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdClicked(InMobiBanner inMobiBanner, Map map) {
        onAdClicked2(inMobiBanner, (Map<Object, Object>) map);
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onAdDismissed(InMobiBanner inMobiBanner) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18907monoploid;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onAdDisplayed(InMobiBanner inMobiBanner) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18907monoploid;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onUserLeftApplication(InMobiBanner inMobiBanner) {
        this.f18907monoploid.onAdLeftApplication();
    }

    /* JADX INFO: renamed from: onAdClicked, reason: avoid collision after fix types in other method */
    public void onAdClicked2(InMobiBanner inMobiBanner, Map<Object, Object> map) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18907monoploid;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdImpression(InMobiBanner inMobiBanner) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18907monoploid;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adErrorCreateSdkError = InMobiConstants.createSdkError(InMobiAdapterUtils.getMediationErrorCode(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        adErrorCreateSdkError.toString();
        this.f18905kowloon.onFailure(adErrorCreateSdkError);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadSucceeded(InMobiBanner inMobiBanner, AdMetaInfo adMetaInfo) {
        this.f18907monoploid = this.f18905kowloon.onSuccess(this);
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onRewardsUnlocked(InMobiBanner inMobiBanner, Map<Object, Object> map) {
    }
}

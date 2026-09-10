package com.google.ads.mediation.facebook.rtb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.Ad;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.facebook.MetaFactory;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.ironsource.If;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MetaRtbAppOpenAd.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u0016J\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010 R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101¨\u00065"}, d2 = {"Lcom/google/ads/mediation/facebook/rtb/MetaRtbAppOpenAd;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAd;", "Lcom/facebook/ads/InterstitialAdExtendedListener;", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdCallback;", "loadCallback", "Lcom/google/ads/mediation/facebook/MetaFactory;", "metaFactory", "<init>", "(Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Lcom/google/ads/mediation/facebook/MetaFactory;)V", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;", "adConfiguration", "", "loadAd", "(Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;)V", "Landroid/content/Context;", "context", "showAd", "(Landroid/content/Context;)V", "Lcom/facebook/ads/Ad;", "ad", "onInterstitialDisplayed", "(Lcom/facebook/ads/Ad;)V", "onInterstitialDismissed", "Lcom/facebook/ads/AdError;", "adError", "onError", "(Lcom/facebook/ads/Ad;Lcom/facebook/ads/AdError;)V", If.j, If.f, "onLoggingImpression", "onInterstitialActivityDestroyed", "()V", "onRewardedAdCompleted", "onRewardedAdServerSucceeded", "onRewardedAdServerFailed", "kowloon", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "arytenoidectomy", "Lcom/google/ads/mediation/facebook/MetaFactory;", "Lcom/facebook/ads/InterstitialAd;", "monoploid", "Lcom/facebook/ads/InterstitialAd;", "appOpenAd", "polloi", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdCallback;", "appOpenAdCallback", "Ljava/util/concurrent/atomic/AtomicBoolean;", "molybdenite", "Ljava/util/concurrent/atomic/AtomicBoolean;", "showAdCalled", "graveside", "didAppOpenAdClose", "meta_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MetaRtbAppOpenAd implements MediationAppOpenAd, InterstitialAdExtendedListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final MetaFactory metaFactory;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final AtomicBoolean didAppOpenAdClose;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> loadCallback;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final AtomicBoolean showAdCalled;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public InterstitialAd appOpenAd;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public MediationAppOpenAdCallback appOpenAdCallback;

    public MetaRtbAppOpenAd(MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> loadCallback, MetaFactory metaFactory) {
        Intrinsics.checkNotNullParameter(loadCallback, "loadCallback");
        Intrinsics.checkNotNullParameter(metaFactory, "metaFactory");
        this.loadCallback = loadCallback;
        this.metaFactory = metaFactory;
        this.showAdCalled = new AtomicBoolean();
        this.didAppOpenAdClose = new AtomicBoolean();
    }

    public final void loadAd(MediationAppOpenAdConfiguration adConfiguration) {
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderBuildLoadAdConfig;
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderWithBid;
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderWithAdListener;
        InterstitialAd interstitialAd;
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Bundle serverParameters = adConfiguration.getServerParameters();
        Intrinsics.checkNotNullExpressionValue(serverParameters, "getServerParameters(...)");
        String placementID = FacebookMediationAdapter.getPlacementID(serverParameters);
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty. ", "com.google.ads.mediation.facebook");
            String str = FacebookMediationAdapter.TAG;
            adError.getMessage();
            this.loadCallback.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(adConfiguration);
        this.appOpenAd = this.metaFactory.createAppOpenAd(adConfiguration.getContext(), placementID);
        if (!TextUtils.isEmpty(adConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String()) && (interstitialAd = this.appOpenAd) != null) {
            interstitialAd.setExtraHints(new ExtraHints.Builder().mediationData(adConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String()).build());
        }
        InterstitialAd interstitialAd2 = this.appOpenAd;
        if (interstitialAd2 != null) {
            interstitialAd2.loadAd((interstitialAd2 == null || (interstitialAdLoadConfigBuilderBuildLoadAdConfig = interstitialAd2.buildLoadAdConfig()) == null || (interstitialAdLoadConfigBuilderWithBid = interstitialAdLoadConfigBuilderBuildLoadAdConfig.withBid(adConfiguration.getBidResponse())) == null || (interstitialAdLoadConfigBuilderWithAdListener = interstitialAdLoadConfigBuilderWithBid.withAdListener(this)) == null) ? null : interstitialAdLoadConfigBuilderWithAdListener.build());
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.appOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.appOpenAdCallback = this.loadCallback.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, com.facebook.ads.AdError adError) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(adError, "adError");
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Intrinsics.checkNotNullExpressionValue(adError2, "getAdError(...)");
        String str = FacebookMediationAdapter.TAG;
        adError2.getMessage();
        if (!this.showAdCalled.get()) {
            this.loadCallback.onFailure(adError2);
            return;
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.appOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError2);
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        MediationAppOpenAdCallback mediationAppOpenAdCallback;
        if (this.didAppOpenAdClose.getAndSet(true) || (mediationAppOpenAdCallback = this.appOpenAdCallback) == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(Ad ad) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback;
        Intrinsics.checkNotNullParameter(ad, "ad");
        if (this.didAppOpenAdClose.getAndSet(true) || (mediationAppOpenAdCallback = this.appOpenAdCallback) == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(Ad ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.appOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.appOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.showAdCalled.set(true);
        InterstitialAd interstitialAd = this.appOpenAd;
        if (interstitialAd == null || interstitialAd.show()) {
            return;
        }
        AdError adError = new AdError(110, "Failed to present app open ad.", "com.google.ads.mediation.facebook");
        String str = FacebookMediationAdapter.TAG;
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.appOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
    }
}

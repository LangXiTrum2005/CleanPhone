package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.AppLovinExtras;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;

/* JADX INFO: loaded from: classes2.dex */
public class IronSourceRtbInterstitialAd implements MediationInterstitialAd, InterstitialAdLoaderListener, InterstitialAdListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f18960arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public MediationInterstitialAdCallback f18961kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public InterstitialAd f18962monoploid = null;

    public IronSourceRtbInterstitialAd(MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f18960arytenoidectomy = mediationAdLoadCallback;
    }

    private void attabal(AdError adError) {
        String str = IronSourceConstants.f18943attabal;
        adError.toString();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18961kowloon;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    public void loadRtbAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", "");
        if (TextUtils.isEmpty(string)) {
            this.f18960arytenoidectomy.onFailure(IronSourceAdapterUtils.buildAdErrorAdapterDomain(101, "Missing or invalid instance ID."));
        } else {
            String str = mediationInterstitialAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String();
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinExtras.Keys.KEY_WATERMARK, str);
            InterstitialAdLoader.loadAd(new InterstitialAdRequest.Builder(string, mediationInterstitialAdConfiguration.getBidResponse()).withExtraParams(bundle).build(), this);
        }
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdClicked(InterstitialAd interstitialAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18961kowloon;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdDismissed(InterstitialAd interstitialAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18961kowloon;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdFailedToShow(InterstitialAd interstitialAd, IronSourceError ironSourceError) {
        attabal(IronSourceAdapterUtils.buildAdErrorIronSourceDomain(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        String str = IronSourceConstants.f18943attabal;
        ironSourceError.toString();
        this.f18960arytenoidectomy.onFailure(IronSourceAdapterUtils.buildAdErrorIronSourceDomain(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
    public void onInterstitialAdLoaded(InterstitialAd interstitialAd) {
        this.f18962monoploid = interstitialAd;
        this.f18961kowloon = this.f18960arytenoidectomy.onSuccess(this);
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdShown(InterstitialAd interstitialAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18961kowloon;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdOpened();
        this.f18961kowloon.reportAdImpression();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        InterstitialAd interstitialAd = this.f18962monoploid;
        if (interstitialAd == null) {
            attabal(IronSourceAdapterUtils.buildAdErrorAdapterDomain(107, "ad is null"));
            return;
        }
        try {
            String str = IronSourceConstants.f18943attabal;
            interstitialAd.setListener(this);
            this.f18962monoploid.show((Activity) context);
        } catch (ClassCastException unused) {
            attabal(IronSourceAdapterUtils.buildAdErrorAdapterDomain(102, "IronSource requires an Activity context to load ads."));
        }
    }
}

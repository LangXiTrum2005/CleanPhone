package com.google.ads.mediation.ironsource;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.mediation.AppLovinExtras;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.banner.BannerAdViewListener;

/* JADX INFO: loaded from: classes2.dex */
public class IronSourceRtbBannerAd implements MediationBannerAd, BannerAdLoaderListener, BannerAdViewListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f18957arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public MediationBannerAdCallback f18958kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public FrameLayout f18959monoploid;

    public IronSourceRtbBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.f18957arytenoidectomy = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f18959monoploid;
    }

    public void loadRtbAd(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        String string = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "");
        if (TextUtils.isEmpty(string)) {
            this.f18957arytenoidectomy.onFailure(IronSourceAdapterUtils.buildAdErrorAdapterDomain(101, "Missing or invalid instance ID."));
            return;
        }
        String str = mediationBannerAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String();
        Bundle bundle = new Bundle();
        bundle.putString(AppLovinExtras.Keys.KEY_WATERMARK, str);
        Context context = mediationBannerAdConfiguration.getContext();
        BannerAdRequest bannerAdRequestBuild = new BannerAdRequest.Builder(context, string, mediationBannerAdConfiguration.getBidResponse(), IronSourceAdapterUtils.getAdSizeFromGoogleAdSize(context, mediationBannerAdConfiguration.getCom.ironsource.X3.i.O java.lang.String())).withExtraParams(bundle).build();
        this.f18959monoploid = new FrameLayout(context);
        BannerAdLoader.loadAd(bannerAdRequestBuild, this);
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
    public void onBannerAdClicked(BannerAdView bannerAdView) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18958kowloon;
        if (mediationBannerAdCallback == null) {
            return;
        }
        mediationBannerAdCallback.onAdOpened();
        this.f18958kowloon.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        if (this.f18957arytenoidectomy == null) {
            return;
        }
        this.f18957arytenoidectomy.onFailure(new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN));
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
    public void onBannerAdLoaded(BannerAdView bannerAdView) {
        if (this.f18959monoploid == null || this.f18957arytenoidectomy == null) {
            return;
        }
        bannerAdView.setListener(this);
        this.f18959monoploid.addView(bannerAdView);
        this.f18958kowloon = this.f18957arytenoidectomy.onSuccess(this);
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
    public void onBannerAdShown(BannerAdView bannerAdView) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18958kowloon;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}

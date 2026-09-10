package com.google.ads.mediation.pangle.renderer;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleFactory;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.google.ads.mediation.pangle.PangleSdkWrapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class PangleBannerAd implements MediationBannerAd, PAGBannerAdInteractionListener {
    public static final String ERROR_MESSAGE_BANNER_SIZE_MISMATCH = "Failed to request banner ad from Pangle. Invalid banner size.";

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final PangleInitializer f19058arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public FrameLayout f19059graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f19060kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public MediationBannerAdCallback f19061molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final PangleSdkWrapper f19062monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final PangleFactory f19063polloi;

    public class attabal implements PangleInitializer.Listener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ MediationBannerAdConfiguration f19064attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ String f19065dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Context f19067saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ String f19068wireman;

        /* JADX INFO: renamed from: com.google.ads.mediation.pangle.renderer.PangleBannerAd$attabal$attabal, reason: collision with other inner class name */
        public class C0287attabal implements PAGBannerAdLoadListener {
            public C0287attabal() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGBannerAd pAGBannerAd) {
                pAGBannerAd.setAdInteractionListener(PangleBannerAd.this);
                PangleBannerAd.this.f19059graveside.addView(pAGBannerAd.getBannerView());
                PangleBannerAd pangleBannerAd = PangleBannerAd.this;
                pangleBannerAd.f19061molybdenite = (MediationBannerAdCallback) pangleBannerAd.f19060kowloon.onSuccess(PangleBannerAd.this);
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
            public void onError(int i, String str) {
                AdError adErrorCreateSdkError = PangleConstants.createSdkError(i, str);
                String str2 = PangleMediationAdapter.TAG;
                adErrorCreateSdkError.toString();
                PangleBannerAd.this.f19060kowloon.onFailure(adErrorCreateSdkError);
            }
        }

        public attabal(MediationBannerAdConfiguration mediationBannerAdConfiguration, Context context, String str, String str2) {
            this.f19064attabal = mediationBannerAdConfiguration;
            this.f19067saneness = context;
            this.f19065dern = str;
            this.f19068wireman = str2;
        }

        @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
        public void onInitializeError(AdError adError) {
            String str = PangleMediationAdapter.TAG;
            adError.toString();
            PangleBannerAd.this.f19060kowloon.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
        public void onInitializeSuccess() {
            PAGBannerSize pAGBannerSizeMarial = PangleBannerAd.marial(this.f19067saneness, this.f19064attabal.getCom.ironsource.X3.i.O java.lang.String());
            if (pAGBannerSizeMarial == null) {
                AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(102, PangleBannerAd.ERROR_MESSAGE_BANNER_SIZE_MISMATCH);
                String str = PangleMediationAdapter.TAG;
                adErrorCreateAdapterError.toString();
                PangleBannerAd.this.f19060kowloon.onFailure(adErrorCreateAdapterError);
                return;
            }
            PangleBannerAd.this.f19059graveside = new FrameLayout(this.f19067saneness);
            PAGBannerRequest pAGBannerRequestCreatePagBannerRequest = PangleBannerAd.this.f19063polloi.createPagBannerRequest(pAGBannerSizeMarial);
            pAGBannerRequestCreatePagBannerRequest.setAdString(this.f19065dern);
            PangleRequestHelper.setWatermarkString(pAGBannerRequestCreatePagBannerRequest, this.f19065dern, this.f19064attabal);
            PangleBannerAd.this.f19062monoploid.loadBannerAd(this.f19068wireman, pAGBannerRequestCreatePagBannerRequest, new C0287attabal());
        }
    }

    public PangleBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper, PangleFactory pangleFactory) {
        this.f19060kowloon = mediationAdLoadCallback;
        this.f19058arytenoidectomy = pangleInitializer;
        this.f19062monoploid = pangleSdkWrapper;
        this.f19063polloi = pangleFactory;
    }

    public static PAGBannerSize marial(Context context, AdSize adSize) {
        if (adSize == null) {
            return null;
        }
        int width = adSize.getWidth();
        PAGBannerSize pAGBannerSize = PAGBannerSize.BANNER_W_320_H_50;
        if (width == pAGBannerSize.getWidth() && adSize.getHeight() == pAGBannerSize.getHeight()) {
            return pAGBannerSize;
        }
        int width2 = adSize.getWidth();
        PAGBannerSize pAGBannerSize2 = PAGBannerSize.BANNER_W_300_H_250;
        if (width2 == pAGBannerSize2.getWidth() && adSize.getHeight() == pAGBannerSize2.getHeight()) {
            return pAGBannerSize2;
        }
        int width3 = adSize.getWidth();
        PAGBannerSize pAGBannerSize3 = PAGBannerSize.BANNER_W_728_H_90;
        if (width3 == pAGBannerSize3.getWidth() && adSize.getHeight() == pAGBannerSize3.getHeight()) {
            return pAGBannerSize3;
        }
        PAGBannerSize currentOrientationAnchoredAdaptiveBannerAdSize = PAGBannerSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, adSize.getWidth());
        return (adSize.getWidth() == currentOrientationAnchoredAdaptiveBannerAdSize.getWidth() && adSize.getHeight() == currentOrientationAnchoredAdaptiveBannerAdSize.getHeight()) ? currentOrientationAnchoredAdaptiveBannerAdSize : PAGBannerSize.getInlineAdaptiveBannerAdSize(adSize.getWidth(), adSize.getHeight());
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f19059graveside;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        MediationBannerAdCallback mediationBannerAdCallback = this.f19061molybdenite;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        MediationBannerAdCallback mediationBannerAdCallback = this.f19061molybdenite;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    public void render(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            String str = PangleMediationAdapter.TAG;
            adErrorCreateAdapterError.toString();
            this.f19060kowloon.onFailure(adErrorCreateAdapterError);
            return;
        }
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        Context context = mediationBannerAdConfiguration.getContext();
        this.f19058arytenoidectomy.initialize(context, serverParameters.getString("appid"), new attabal(mediationBannerAdConfiguration, context, bidResponse, string));
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }
}

package com.google.ads.mediation.pangle.renderer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleFactory;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.google.ads.mediation.pangle.PangleSdkWrapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class PangleInterstitialAd implements MediationInterstitialAd {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final PangleInitializer f19070arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public PAGInterstitialAd f19071graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f19072kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public MediationInterstitialAdCallback f19073molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final PangleSdkWrapper f19074monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final PangleFactory f19075polloi;

    public class attabal implements PangleInitializer.Listener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ String f19076attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ String f19077dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ MediationInterstitialAdConfiguration f19078saneness;

        /* JADX INFO: renamed from: com.google.ads.mediation.pangle.renderer.PangleInterstitialAd$attabal$attabal, reason: collision with other inner class name */
        public class C0288attabal implements PAGInterstitialAdLoadListener {
            public C0288attabal() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
                PangleInterstitialAd pangleInterstitialAd = PangleInterstitialAd.this;
                pangleInterstitialAd.f19073molybdenite = (MediationInterstitialAdCallback) pangleInterstitialAd.f19072kowloon.onSuccess(PangleInterstitialAd.this);
                PangleInterstitialAd.this.f19071graveside = pAGInterstitialAd;
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
            public void onError(int i, String str) {
                AdError adErrorCreateSdkError = PangleConstants.createSdkError(i, str);
                String str2 = PangleMediationAdapter.TAG;
                adErrorCreateSdkError.toString();
                PangleInterstitialAd.this.f19072kowloon.onFailure(adErrorCreateSdkError);
            }
        }

        public attabal(String str, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, String str2) {
            this.f19076attabal = str;
            this.f19078saneness = mediationInterstitialAdConfiguration;
            this.f19077dern = str2;
        }

        @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
        public void onInitializeError(AdError adError) {
            String str = PangleMediationAdapter.TAG;
            adError.toString();
            PangleInterstitialAd.this.f19072kowloon.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
        public void onInitializeSuccess() {
            PAGInterstitialRequest pAGInterstitialRequestCreatePagInterstitialRequest = PangleInterstitialAd.this.f19075polloi.createPagInterstitialRequest();
            pAGInterstitialRequestCreatePagInterstitialRequest.setAdString(this.f19076attabal);
            PangleRequestHelper.setWatermarkString(pAGInterstitialRequestCreatePagInterstitialRequest, this.f19076attabal, this.f19078saneness);
            PangleInterstitialAd.this.f19074monoploid.loadInterstitialAd(this.f19077dern, pAGInterstitialRequestCreatePagInterstitialRequest, new C0288attabal());
        }
    }

    public class saneness implements PAGInterstitialAdInteractionListener {
        public saneness() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (PangleInterstitialAd.this.f19073molybdenite != null) {
                PangleInterstitialAd.this.f19073molybdenite.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            if (PangleInterstitialAd.this.f19073molybdenite != null) {
                PangleInterstitialAd.this.f19073molybdenite.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (PangleInterstitialAd.this.f19073molybdenite != null) {
                PangleInterstitialAd.this.f19073molybdenite.onAdOpened();
                PangleInterstitialAd.this.f19073molybdenite.reportAdImpression();
            }
        }
    }

    public PangleInterstitialAd(MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper, PangleFactory pangleFactory) {
        this.f19072kowloon = mediationAdLoadCallback;
        this.f19070arytenoidectomy = pangleInitializer;
        this.f19074monoploid = pangleSdkWrapper;
        this.f19075polloi = pangleFactory;
    }

    public void render(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(101, "Failed to load interstitial ad from Pangle. Missing or invalid Placement ID.");
            String str = PangleMediationAdapter.TAG;
            adErrorCreateAdapterError.toString();
            this.f19072kowloon.onFailure(adErrorCreateAdapterError);
            return;
        }
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        this.f19070arytenoidectomy.initialize(mediationInterstitialAdConfiguration.getContext(), serverParameters.getString("appid"), new attabal(bidResponse, mediationInterstitialAdConfiguration, string));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f19071graveside.setAdInteractionListener(new saneness());
        if (context instanceof Activity) {
            this.f19071graveside.show((Activity) context);
        } else {
            this.f19071graveside.show(null);
        }
    }
}

package com.google.ads.mediation.pangle.renderer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleFactory;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.google.ads.mediation.pangle.PangleSdkWrapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class PangleAppOpenAd implements MediationAppOpenAd {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final PangleInitializer f19046arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public PAGAppOpenAd f19047graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> f19048kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public MediationAppOpenAdCallback f19049molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final PangleSdkWrapper f19050monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final PangleFactory f19051polloi;

    public class attabal implements PangleInitializer.Listener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ String f19052attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ String f19053dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ MediationAppOpenAdConfiguration f19054saneness;

        /* JADX INFO: renamed from: com.google.ads.mediation.pangle.renderer.PangleAppOpenAd$attabal$attabal, reason: collision with other inner class name */
        public class C0286attabal implements PAGAppOpenAdLoadListener {
            public C0286attabal() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
                PangleAppOpenAd pangleAppOpenAd = PangleAppOpenAd.this;
                pangleAppOpenAd.f19049molybdenite = (MediationAppOpenAdCallback) pangleAppOpenAd.f19048kowloon.onSuccess(PangleAppOpenAd.this);
                PangleAppOpenAd.this.f19047graveside = pAGAppOpenAd;
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
            public void onError(int i, String str) {
                AdError adErrorCreateSdkError = PangleConstants.createSdkError(i, str);
                String str2 = PangleMediationAdapter.TAG;
                adErrorCreateSdkError.toString();
                PangleAppOpenAd.this.f19048kowloon.onFailure(adErrorCreateSdkError);
            }
        }

        public attabal(String str, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, String str2) {
            this.f19052attabal = str;
            this.f19054saneness = mediationAppOpenAdConfiguration;
            this.f19053dern = str2;
        }

        @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
        public void onInitializeError(AdError adError) {
            String str = PangleMediationAdapter.TAG;
            adError.toString();
            PangleAppOpenAd.this.f19048kowloon.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
        public void onInitializeSuccess() {
            PAGAppOpenRequest pAGAppOpenRequestCreatePagAppOpenRequest = PangleAppOpenAd.this.f19051polloi.createPagAppOpenRequest();
            pAGAppOpenRequestCreatePagAppOpenRequest.setAdString(this.f19052attabal);
            PangleRequestHelper.setWatermarkString(pAGAppOpenRequestCreatePagAppOpenRequest, this.f19052attabal, this.f19054saneness);
            PangleAppOpenAd.this.f19050monoploid.loadAppOpenAd(this.f19053dern, pAGAppOpenRequestCreatePagAppOpenRequest, new C0286attabal());
        }
    }

    public class saneness implements PAGAppOpenAdInteractionListener {
        public saneness() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (PangleAppOpenAd.this.f19049molybdenite != null) {
                PangleAppOpenAd.this.f19049molybdenite.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            if (PangleAppOpenAd.this.f19049molybdenite != null) {
                PangleAppOpenAd.this.f19049molybdenite.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (PangleAppOpenAd.this.f19049molybdenite != null) {
                PangleAppOpenAd.this.f19049molybdenite.onAdOpened();
                PangleAppOpenAd.this.f19049molybdenite.reportAdImpression();
            }
        }
    }

    public PangleAppOpenAd(MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper, PangleFactory pangleFactory) {
        this.f19048kowloon = mediationAdLoadCallback;
        this.f19046arytenoidectomy = pangleInitializer;
        this.f19050monoploid = pangleSdkWrapper;
        this.f19051polloi = pangleFactory;
    }

    public void render(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(101, "Failed to load app open ad from Pangle. Missing or invalid Placement ID.");
            String str = PangleMediationAdapter.TAG;
            adErrorCreateAdapterError.toString();
            this.f19048kowloon.onFailure(adErrorCreateAdapterError);
            return;
        }
        String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
        this.f19046arytenoidectomy.initialize(mediationAppOpenAdConfiguration.getContext(), serverParameters.getString("appid"), new attabal(bidResponse, mediationAppOpenAdConfiguration, string));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        this.f19047graveside.setAdInteractionListener(new saneness());
        if (context instanceof Activity) {
            this.f19047graveside.show((Activity) context);
        } else {
            this.f19047graveside.show(null);
        }
    }
}

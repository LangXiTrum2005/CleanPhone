package com.google.ads.mediation.pangle.renderer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleFactory;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.google.ads.mediation.pangle.PangleSdkWrapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class PangleRewardedAd implements MediationRewardedAd {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final PangleInitializer f19099arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public PAGRewardedAd f19100graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f19101kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public MediationRewardedAdCallback f19102molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final PangleSdkWrapper f19103monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final PangleFactory f19104polloi;

    public class attabal implements PangleInitializer.Listener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ String f19105attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ String f19106dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ MediationRewardedAdConfiguration f19107saneness;

        /* JADX INFO: renamed from: com.google.ads.mediation.pangle.renderer.PangleRewardedAd$attabal$attabal, reason: collision with other inner class name */
        public class C0290attabal implements PAGRewardedAdLoadListener {
            public C0290attabal() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
                PangleRewardedAd pangleRewardedAd = PangleRewardedAd.this;
                pangleRewardedAd.f19102molybdenite = (MediationRewardedAdCallback) pangleRewardedAd.f19101kowloon.onSuccess(PangleRewardedAd.this);
                PangleRewardedAd.this.f19100graveside = pAGRewardedAd;
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
            public void onError(int i, String str) {
                AdError adErrorCreateSdkError = PangleConstants.createSdkError(i, str);
                String str2 = PangleMediationAdapter.TAG;
                adErrorCreateSdkError.toString();
                PangleRewardedAd.this.f19101kowloon.onFailure(adErrorCreateSdkError);
            }
        }

        public attabal(String str, MediationRewardedAdConfiguration mediationRewardedAdConfiguration, String str2) {
            this.f19105attabal = str;
            this.f19107saneness = mediationRewardedAdConfiguration;
            this.f19106dern = str2;
        }

        @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
        public void onInitializeError(AdError adError) {
            String str = PangleMediationAdapter.TAG;
            adError.toString();
            PangleRewardedAd.this.f19101kowloon.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
        public void onInitializeSuccess() {
            PAGRewardedRequest pAGRewardedRequestCreatePagRewardedRequest = PangleRewardedAd.this.f19104polloi.createPagRewardedRequest();
            pAGRewardedRequestCreatePagRewardedRequest.setAdString(this.f19105attabal);
            PangleRequestHelper.setWatermarkString(pAGRewardedRequestCreatePagRewardedRequest, this.f19105attabal, this.f19107saneness);
            PangleRewardedAd.this.f19103monoploid.loadRewardedAd(this.f19106dern, pAGRewardedRequestCreatePagRewardedRequest, new C0290attabal());
        }
    }

    public class saneness implements PAGRewardedAdInteractionListener {
        public saneness() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (PangleRewardedAd.this.f19102molybdenite != null) {
                PangleRewardedAd.this.f19102molybdenite.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            if (PangleRewardedAd.this.f19102molybdenite != null) {
                PangleRewardedAd.this.f19102molybdenite.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (PangleRewardedAd.this.f19102molybdenite != null) {
                PangleRewardedAd.this.f19102molybdenite.onAdOpened();
                PangleRewardedAd.this.f19102molybdenite.reportAdImpression();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
            if (PangleRewardedAd.this.f19102molybdenite != null) {
                PangleRewardedAd.this.f19102molybdenite.onUserEarnedReward();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public void onUserEarnedRewardFail(int i, String str) {
            AdError adErrorCreateSdkError = PangleConstants.createSdkError(i, String.format("Failed to reward user: %s", str));
            String str2 = PangleMediationAdapter.TAG;
            adErrorCreateSdkError.toString();
        }
    }

    public PangleRewardedAd(MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper, PangleFactory pangleFactory) {
        this.f19101kowloon = mediationAdLoadCallback;
        this.f19099arytenoidectomy = pangleInitializer;
        this.f19103monoploid = pangleSdkWrapper;
        this.f19104polloi = pangleFactory;
    }

    public void render(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(101, "Failed to load rewarded ad from Pangle. Missing or invalid Placement ID.");
            String str = PangleMediationAdapter.TAG;
            adErrorCreateAdapterError.toString();
            this.f19101kowloon.onFailure(adErrorCreateAdapterError);
            return;
        }
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        this.f19099arytenoidectomy.initialize(mediationRewardedAdConfiguration.getContext(), serverParameters.getString("appid"), new attabal(bidResponse, mediationRewardedAdConfiguration, string));
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.f19100graveside.setAdInteractionListener(new saneness());
        if (context instanceof Activity) {
            this.f19100graveside.show((Activity) context);
        } else {
            this.f19100graveside.show(null);
        }
    }
}

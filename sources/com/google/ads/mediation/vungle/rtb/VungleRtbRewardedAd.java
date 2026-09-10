package com.google.ads.mediation.vungle.rtb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleError;
import com.vungle.ads.cord;
import com.vungle.ads.preprohormone;
import com.vungle.ads.saneness;

/* JADX INFO: loaded from: classes2.dex */
public class VungleRtbRewardedAd implements MediationRewardedAd, cord {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public MediationRewardedAdCallback f19217arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f19218kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public preprohormone f19219monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final VungleFactory f19220polloi;

    public class attabal implements VungleInitializer.VungleInitializationListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f19221attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ saneness f19223dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ String f19224marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ String f19225saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ String f19226wireman;

        public attabal(Context context, String str, saneness sanenessVar, String str2, String str3) {
            this.f19221attabal = context;
            this.f19225saneness = str;
            this.f19223dern = sanenessVar;
            this.f19226wireman = str2;
            this.f19224marial = str3;
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeError(AdError adError) {
            String str = VungleMediationAdapter.TAG;
            adError.toString();
            VungleRtbRewardedAd.this.f19218kowloon.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeSuccess() {
            VungleRtbRewardedAd vungleRtbRewardedAd = VungleRtbRewardedAd.this;
            vungleRtbRewardedAd.f19219monoploid = vungleRtbRewardedAd.f19220polloi.createRewardedAd(this.f19221attabal, this.f19225saneness, this.f19223dern);
            VungleRtbRewardedAd.this.f19219monoploid.setAdListener(VungleRtbRewardedAd.this);
            if (!TextUtils.isEmpty(this.f19226wireman)) {
                VungleRtbRewardedAd.this.f19219monoploid.setUserId(this.f19226wireman);
            }
            VungleRtbRewardedAd.this.f19219monoploid.load(this.f19224marial);
        }
    }

    public VungleRtbRewardedAd(MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        this.f19218kowloon = mediationAdLoadCallback;
        this.f19220polloi = vungleFactory;
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdClicked(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f19217arytenoidectomy;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdEnd(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f19217arytenoidectomy;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        String str = VungleMediationAdapter.TAG;
        adError.toString();
        this.f19218kowloon.onFailure(adError);
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        String str = VungleMediationAdapter.TAG;
        adError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f19217arytenoidectomy;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdImpression(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f19217arytenoidectomy;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
            this.f19217arytenoidectomy.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdLoaded(BaseAd baseAd) {
        this.f19217arytenoidectomy = this.f19218kowloon.onSuccess(this);
    }

    @Override // com.vungle.ads.cord
    public void onAdRewarded(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f19217arytenoidectomy;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.f19217arytenoidectomy.onUserEarnedReward();
        }
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdStart(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f19217arytenoidectomy;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    public void render(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = mediationExtras.getString("userId");
        String string2 = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string2)) {
            AdError adError = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            String str = VungleMediationAdapter.TAG;
            this.f19218kowloon.onFailure(adError);
            return;
        }
        String string3 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string3)) {
            AdError adError2 = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            String str2 = VungleMediationAdapter.TAG;
            this.f19218kowloon.onFailure(adError2);
            return;
        }
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        saneness sanenessVarCreateAdConfig = this.f19220polloi.createAdConfig();
        if (mediationExtras.containsKey(VungleConstants.KEY_ORIENTATION)) {
            sanenessVarCreateAdConfig.setAdOrientation(mediationExtras.getInt(VungleConstants.KEY_ORIENTATION, 2));
        }
        String str3 = mediationRewardedAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String();
        if (!TextUtils.isEmpty(str3)) {
            sanenessVarCreateAdConfig.setWatermark(str3);
        }
        Context context = mediationRewardedAdConfiguration.getContext();
        VungleInitializer.getInstance().initialize(string2, context, new attabal(context, string3, sanenessVarCreateAdConfig, string, bidResponse));
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        preprohormone preprohormoneVar = this.f19219monoploid;
        if (preprohormoneVar != null) {
            preprohormoneVar.play(context);
        } else if (this.f19217arytenoidectomy != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewardedad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            String str = VungleMediationAdapter.TAG;
            this.f19217arytenoidectomy.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdLeftApplication(BaseAd baseAd) {
    }
}

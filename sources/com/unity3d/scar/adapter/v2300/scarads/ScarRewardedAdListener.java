package com.unity3d.scar.adapter.v2300.scarads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;

/* JADX INFO: loaded from: classes6.dex */
public class ScarRewardedAdListener extends ScarAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScarRewardedAd f42844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScarRewardedAdHandler f42845c;
    public final RewardedAdLoadCallback d = new RewardedAdLoadCallback() { // from class: com.unity3d.scar.adapter.v2300.scarads.ScarRewardedAdListener.1
        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            ScarRewardedAdListener.this.f42845c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(RewardedAd rewardedAd) {
            RewardedAd rewardedAd2 = rewardedAd;
            super.onAdLoaded(rewardedAd2);
            ScarRewardedAdListener scarRewardedAdListener = ScarRewardedAdListener.this;
            scarRewardedAdListener.f42845c.onAdLoaded();
            rewardedAd2.setFullScreenContentCallback(scarRewardedAdListener.f);
            scarRewardedAdListener.f42844b.f42832a = rewardedAd2;
            IScarLoadListener iScarLoadListener = scarRewardedAdListener.f42836a;
            if (iScarLoadListener != null) {
                iScarLoadListener.onAdLoaded();
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OnUserEarnedRewardListener f42846e = new OnUserEarnedRewardListener() { // from class: com.unity3d.scar.adapter.v2300.scarads.ScarRewardedAdListener.2
        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public final void onUserEarnedReward(RewardItem rewardItem) {
            ScarRewardedAdListener.this.f42845c.onUserEarnedReward();
        }
    };
    public final FullScreenContentCallback f = new FullScreenContentCallback() { // from class: com.unity3d.scar.adapter.v2300.scarads.ScarRewardedAdListener.3
        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdClicked() {
            super.onAdClicked();
            ScarRewardedAdListener.this.f42845c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            ScarRewardedAdListener.this.f42845c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            ScarRewardedAdListener.this.f42845c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdImpression() {
            super.onAdImpression();
            ScarRewardedAdListener.this.f42845c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            ScarRewardedAdListener.this.f42845c.onAdOpened();
        }
    };

    public ScarRewardedAdListener(ScarRewardedAdHandler scarRewardedAdHandler, ScarRewardedAd scarRewardedAd) {
        this.f42845c = scarRewardedAdHandler;
        this.f42844b = scarRewardedAd;
    }
}

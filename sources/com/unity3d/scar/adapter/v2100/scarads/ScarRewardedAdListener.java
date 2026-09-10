package com.unity3d.scar.adapter.v2100.scarads;

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
    public final ScarRewardedAd f42819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScarRewardedAdHandler f42820c;
    public final RewardedAdLoadCallback d = new RewardedAdLoadCallback() { // from class: com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.1
        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            ScarRewardedAdListener.this.f42820c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(RewardedAd rewardedAd) {
            RewardedAd rewardedAd2 = rewardedAd;
            super.onAdLoaded(rewardedAd2);
            ScarRewardedAdListener scarRewardedAdListener = ScarRewardedAdListener.this;
            scarRewardedAdListener.f42820c.onAdLoaded();
            rewardedAd2.setFullScreenContentCallback(scarRewardedAdListener.f);
            scarRewardedAdListener.f42819b.f42807a = rewardedAd2;
            IScarLoadListener iScarLoadListener = scarRewardedAdListener.f42811a;
            if (iScarLoadListener != null) {
                iScarLoadListener.onAdLoaded();
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OnUserEarnedRewardListener f42821e = new OnUserEarnedRewardListener() { // from class: com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.2
        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public final void onUserEarnedReward(RewardItem rewardItem) {
            ScarRewardedAdListener.this.f42820c.onUserEarnedReward();
        }
    };
    public final FullScreenContentCallback f = new FullScreenContentCallback() { // from class: com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener.3
        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdClicked() {
            super.onAdClicked();
            ScarRewardedAdListener.this.f42820c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            ScarRewardedAdListener.this.f42820c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            ScarRewardedAdListener.this.f42820c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdImpression() {
            super.onAdImpression();
            ScarRewardedAdListener.this.f42820c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            ScarRewardedAdListener.this.f42820c.onAdOpened();
        }
    };

    public ScarRewardedAdListener(ScarRewardedAdHandler scarRewardedAdHandler, ScarRewardedAd scarRewardedAd) {
        this.f42820c = scarRewardedAdHandler;
        this.f42819b = scarRewardedAd;
    }
}

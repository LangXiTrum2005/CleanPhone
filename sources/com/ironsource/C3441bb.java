package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3441bb {

    /* JADX INFO: renamed from: com.ironsource.bb$a */
    public static final class a implements Wa {
        final /* synthetic */ LevelPlayInterstitialAdListener a;

        public a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
            this.a = levelPlayInterstitialAdListener;
        }

        @Override // com.ironsource.Wa
        public void onAdClicked(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClicked() adInfo: " + adInfo);
            this.a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.Wa
        public void onAdClosed(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClosed() adInfo: " + adInfo);
            this.a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.Wa
        public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.Wa
        public void onAdDisplayed(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.Wa
        public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.Wa
        public void onAdLoadFailed(LevelPlayAdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() error: " + error);
            this.a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.Wa
        public void onAdLoaded(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() adInfo: " + adInfo);
            this.a.onAdLoaded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Wa b(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        return new a(levelPlayInterstitialAdListener);
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;

/* JADX INFO: renamed from: com.ironsource.eb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0320eb {

    /* JADX INFO: renamed from: com.ironsource.eb$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements Za {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayInterstitialAdListener f28525a;

        public a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
            this.f28525a = levelPlayInterstitialAdListener;
        }

        @Override // com.ironsource.Za
        public void onAdClicked(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClicked() adInfo: " + adInfo);
            this.f28525a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdClosed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClosed() adInfo: " + adInfo);
            this.f28525a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(error, "error");
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.f28525a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdDisplayed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.f28525a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.f28525a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdLoadFailed(LevelPlayAdError error) {
            kotlin.jvm.internal.n.f(error, "error");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() error: " + error);
            this.f28525a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.Za
        public void onAdLoaded(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() adInfo: " + adInfo);
            this.f28525a.onAdLoaded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Za b(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        return new a(levelPlayInterstitialAdListener);
    }
}

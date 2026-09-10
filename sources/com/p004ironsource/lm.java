package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAdListener;", "Lcom/ironsource/im;", "b", "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
public final class lm {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"com/ironsource/lm$a", "Lcom/ironsource/im;", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "", sv.j, "Lcom/unity3d/mediation/LevelPlayAdError;", "error", sv.f27214b, "onAdDisplayed", "onAdDisplayFailed", sv.f, sv.g, "onAdInfoChanged", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements im {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayInterstitialAdListener f25627a;

        public a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
            this.f25627a = levelPlayInterstitialAdListener;
        }

        @Override // com.p004ironsource.im
        public void onAdClicked(LevelPlayAdInfo adInfo) {
            Intrinsics.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClicked() adInfo: " + adInfo);
            this.f25627a.onAdClicked(adInfo);
        }

        @Override // com.p004ironsource.im
        public void onAdClosed(LevelPlayAdInfo adInfo) {
            Intrinsics.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClosed() adInfo: " + adInfo);
            this.f25627a.onAdClosed(adInfo);
        }

        @Override // com.p004ironsource.im
        public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
            Intrinsics.f(error, "error");
            Intrinsics.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.f25627a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.p004ironsource.im
        public void onAdDisplayed(LevelPlayAdInfo adInfo) {
            Intrinsics.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.f25627a.onAdDisplayed(adInfo);
        }

        @Override // com.p004ironsource.im
        public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
            Intrinsics.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.f25627a.onAdInfoChanged(adInfo);
        }

        @Override // com.p004ironsource.im
        public void onAdLoadFailed(LevelPlayAdError error) {
            Intrinsics.f(error, "error");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() error: " + error);
            this.f25627a.onAdLoadFailed(error);
        }

        @Override // com.p004ironsource.im
        public void onAdLoaded(LevelPlayAdInfo adInfo) {
            Intrinsics.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() adInfo: " + adInfo);
            this.f25627a.onAdLoaded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final im b(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        return new a(levelPlayInterstitialAdListener);
    }
}

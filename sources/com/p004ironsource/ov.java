package com.p004ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/ironsource/ov;", "Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAdListener;", "Lcom/unity3d/mediation/LevelPlayAdError;", "error", "", sv.f27214b, "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", sv.j, sv.f, "onAdDisplayed", "onAdDisplayFailed", sv.g, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ov implements LevelPlayInterstitialAdListener {
    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClicked(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        ah.a().b(vv.f27547a.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClosed(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        ah.a().c(vv.f27547a.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        Intrinsics.f(error, "error");
        Intrinsics.f(adInfo, "adInfo");
        ah ahVarA = ah.a();
        vv vvVar = vv.f27547a;
        ahVarA.a(vvVar.a(error), vvVar.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        ah.a().f(vv.f27547a.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.f(error, "error");
        ah.a().a(vv.f27547a.a(error));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        ah.a().e(vv.f27547a.a(adInfo));
    }
}

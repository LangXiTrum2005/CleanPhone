package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.ads.mediation.unity.UnityRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes2.dex */
public final class Qf0 implements IUnityAdsLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityRewardedAd f3613a;

    public Qf0(UnityRewardedAd unityRewardedAd) {
        this.f3613a = unityRewardedAd;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsAdLoaded(String str) {
        new StringBuilder("Unity Ads rewarded ad successfully loaded placement ID: ").append(str);
        UnityRewardedAd unityRewardedAd = this.f3613a;
        unityRewardedAd.f = str;
        unityRewardedAd.e = (MediationRewardedAdCallback) unityRewardedAd.b.onSuccess(unityRewardedAd);
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        UnityRewardedAd unityRewardedAd = this.f3613a;
        unityRewardedAd.f = str;
        AdError adErrorC = UnityAdsAdapterUtils.c(unityAdsLoadError, str2);
        adErrorC.toString();
        unityRewardedAd.b.onFailure(adErrorC);
    }
}

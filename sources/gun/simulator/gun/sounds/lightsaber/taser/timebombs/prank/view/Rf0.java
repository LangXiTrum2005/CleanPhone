package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.ads.mediation.unity.UnityReward;
import com.google.ads.mediation.unity.UnityRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes2.dex */
public final class Rf0 implements IUnityAdsShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityRewardedAd f3668a;

    public Rf0(UnityRewardedAd unityRewardedAd) {
        this.f3668a = unityRewardedAd;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowClick(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f3668a.e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        UnityRewardedAd unityRewardedAd = this.f3668a;
        MediationRewardedAdCallback mediationRewardedAdCallback = unityRewardedAd.e;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.COMPLETED) {
            mediationRewardedAdCallback.onVideoComplete();
            unityRewardedAd.e.onUserEarnedReward(new UnityReward());
        }
        unityRewardedAd.e.onAdClosed();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        UnityRewardedAd unityRewardedAd = this.f3668a;
        if (unityRewardedAd.e != null) {
            unityRewardedAd.e.onAdFailedToShow(UnityAdsAdapterUtils.d(unityAdsShowError, str2));
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowStart(String str) {
        UnityRewardedAd unityRewardedAd = this.f3668a;
        MediationRewardedAdCallback mediationRewardedAdCallback = unityRewardedAd.e;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        unityRewardedAd.e.reportAdImpression();
        unityRewardedAd.e.onVideoStart();
    }
}

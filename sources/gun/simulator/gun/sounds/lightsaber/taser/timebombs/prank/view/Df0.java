package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.ads.mediation.unity.UnityAdapter;
import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.AdError;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes2.dex */
public final class Df0 implements IUnityAdsInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2980a;
    public final /* synthetic */ UnityAdapter b;

    public Df0(UnityAdapter unityAdapter, String str) {
        this.b = unityAdapter;
        this.f2980a = str;
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationComplete() {
        String str = this.b.placementId;
        StringBuilder sb = new StringBuilder("Unity Ads is initialized for game ID '");
        sb.append(this.f2980a);
        sb.append("' and can now load interstitial ad with placement ID: ");
        sb.append(str);
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        AdError adErrorB = UnityAdsAdapterUtils.b(unityAdsInitializationError, "Unity Ads initialization failed for game ID '" + this.f2980a + "' with error message: " + str);
        adErrorB.toString();
        UnityAdapter unityAdapter = this.b;
        if (unityAdapter.mediationInterstitialListener != null) {
            unityAdapter.mediationInterstitialListener.onAdFailedToLoad(unityAdapter, adErrorB);
        }
    }
}

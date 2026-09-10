package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes2.dex */
public final class Of0 implements IUnityAdsInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InitializationCompleteCallback f3513a;

    public Of0(InitializationCompleteCallback initializationCompleteCallback) {
        this.f3513a = initializationCompleteCallback;
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationComplete() {
        this.f3513a.onInitializationSucceeded();
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        AdError adErrorB = UnityAdsAdapterUtils.b(unityAdsInitializationError, "Unity Ads initialization failed: [" + unityAdsInitializationError + "] " + str);
        adErrorB.toString();
        this.f3513a.onInitializationFailed(adErrorB.toString());
    }
}

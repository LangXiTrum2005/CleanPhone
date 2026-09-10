package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.ads.mediation.unity.UnityInterstitialAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class Mf0 implements IUnityAdsInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3414a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ UnityInterstitialAd d;

    public Mf0(UnityInterstitialAd unityInterstitialAd, String str, Context context, String str2) {
        this.d = unityInterstitialAd;
        this.f3414a = str;
        this.b = context;
        this.c = str2;
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationComplete() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        UnityInterstitialAd unityInterstitialAd = this.d;
        String str = unityInterstitialAd.g;
        UnityAdsAdapterUtils.setCoppa(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment(), this.b);
        String string = UUID.randomUUID().toString();
        unityInterstitialAd.f782a = string;
        Hf0 hf0 = unityInterstitialAd.e;
        hf0.getClass();
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        unityAdsLoadOptions.setObjectId(string);
        String str2 = this.c;
        if (str2 != null) {
            unityAdsLoadOptions.setAdMarkup(str2);
        }
        String str3 = unityInterstitialAd.g;
        hf0.getClass();
        UnityAds.load(str3, unityAdsLoadOptions, unityInterstitialAd);
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        AdError adErrorB = UnityAdsAdapterUtils.b(unityAdsInitializationError, "Unity Ads initialization failed for game ID '" + this.f3414a + "' with error message: " + str);
        adErrorB.toString();
        this.d.c.onFailure(adErrorB);
    }
}

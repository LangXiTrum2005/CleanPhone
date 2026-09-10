package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.ads.mediation.unity.UnityRewardedAd;
import com.google.android.gms.ads.AdError;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class Sf0 implements IUnityAdsInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3726a;
    public final String b;
    public final String c;
    public final String d;
    public final /* synthetic */ UnityRewardedAd e;

    public Sf0(UnityRewardedAd unityRewardedAd, Context context, String str, String str2, String str3) {
        this.e = unityRewardedAd;
        this.f3726a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationComplete() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        UnityRewardedAd unityRewardedAd = this.e;
        UnityAdsAdapterUtils.setCoppa(unityRewardedAd.f783a.taggedForChildDirectedTreatment(), this.f3726a);
        String string = UUID.randomUUID().toString();
        unityRewardedAd.g = string;
        Hf0 hf0 = unityRewardedAd.d;
        hf0.getClass();
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        unityAdsLoadOptions.setObjectId(string);
        String str = this.d;
        if (str != null) {
            unityAdsLoadOptions.setAdMarkup(str);
        }
        hf0.getClass();
        UnityAds.load(this.c, unityAdsLoadOptions, unityRewardedAd.h);
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        AdError adErrorB = UnityAdsAdapterUtils.b(unityAdsInitializationError, "Unity Ads initialization failed for game ID '" + this.b + "' with error message: " + str);
        adErrorB.toString();
        this.e.b.onFailure(adErrorB);
    }
}

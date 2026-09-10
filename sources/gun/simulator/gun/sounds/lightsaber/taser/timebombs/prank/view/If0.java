package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.ads.mediation.unity.UnityBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class If0 implements IUnityAdsInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f3231a;
    public final /* synthetic */ UnityBannerSize b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ UnityBannerAd d;

    public If0(UnityBannerAd unityBannerAd, Activity activity, UnityBannerSize unityBannerSize, Context context) {
        this.d = unityBannerAd;
        this.f3231a = activity;
        this.b = unityBannerSize;
        this.c = context;
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationComplete() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        UnityBannerAd unityBannerAd = this.d;
        String str = unityBannerAd.gameId;
        String str2 = unityBannerAd.bannerPlacementId;
        StringBuilder sb = new StringBuilder("Unity Ads is initialized for game ID '");
        sb.append(str);
        sb.append("' and can now load banner ad with placement ID: ");
        sb.append(str2);
        if (unityBannerAd.bannerView == null) {
            unityBannerAd.bannerView = new BannerView(this.f3231a, unityBannerAd.bannerPlacementId, this.b);
        }
        UnityAdsAdapterUtils.setCoppa(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment(), this.c);
        unityBannerAd.bannerView.setListener(unityBannerAd.unityBannerListener);
        unityBannerAd.bannerView.load();
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        UnityBannerAd unityBannerAd = this.d;
        AdError adErrorB = UnityAdsAdapterUtils.b(unityAdsInitializationError, "Unity Ads initialization failed for game ID '" + unityBannerAd.gameId + "' with error message: " + str);
        adErrorB.toString();
        if (unityBannerAd.mediationBannerListener != null) {
            unityBannerAd.mediationBannerListener.onAdFailedToLoad(unityBannerAd, adErrorB);
        }
    }
}

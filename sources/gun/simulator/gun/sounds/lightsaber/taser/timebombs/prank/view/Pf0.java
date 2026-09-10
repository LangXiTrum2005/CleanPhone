package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.ads.mediation.unity.UnityMediationBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class Pf0 implements IUnityAdsInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3563a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ UnityBannerSize c;
    public final /* synthetic */ String d;
    public final /* synthetic */ UnityMediationBannerAd e;

    public Pf0(UnityMediationBannerAd unityMediationBannerAd, Context context, Activity activity, UnityBannerSize unityBannerSize, String str) {
        this.e = unityMediationBannerAd;
        this.f3563a = context;
        this.b = activity;
        this.c = unityBannerSize;
        this.d = str;
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationComplete() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        UnityMediationBannerAd unityMediationBannerAd = this.e;
        String unused = unityMediationBannerAd.gameId;
        String unused2 = unityMediationBannerAd.bannerPlacementId;
        UnityAdsAdapterUtils.setCoppa(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment(), this.f3563a);
        if (unityMediationBannerAd.unityBannerViewWrapper == null) {
            Kf0 kf0 = unityMediationBannerAd.unityBannerViewFactory;
            String str = unityMediationBannerAd.bannerPlacementId;
            kf0.getClass();
            unityMediationBannerAd.unityBannerViewWrapper = new Lf0(new BannerView(this.b, str, this.c));
        }
        unityMediationBannerAd.unityBannerViewWrapper.f3366a.setListener(unityMediationBannerAd);
        String string = UUID.randomUUID().toString();
        unityMediationBannerAd.unityAdsLoader.getClass();
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        unityAdsLoadOptions.setObjectId(string);
        unityAdsLoadOptions.set(MBridgeConstans.EXTRA_KEY_WM, unityMediationBannerAd.mediationBannerAdConfiguration.getWatermark());
        String str2 = this.d;
        if (str2 != null) {
            unityAdsLoadOptions.setAdMarkup(str2);
        }
        unityMediationBannerAd.unityBannerViewWrapper.f3366a.load(unityAdsLoadOptions);
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        UnityMediationBannerAd unityMediationBannerAd = this.e;
        AdError adErrorB = UnityAdsAdapterUtils.b(unityAdsInitializationError, "Unity Ads initialization failed for game ID '" + unityMediationBannerAd.gameId + "' with error message: " + str);
        adErrorB.toString();
        unityMediationBannerAd.mediationBannerAdLoadCallback.onFailure(adErrorB);
    }
}

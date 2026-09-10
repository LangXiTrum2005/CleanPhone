package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.unity.eventadapters.UnityBannerEventAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.If0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class UnityBannerAd extends UnityMediationAdapter implements MediationBannerAdapter {
    private String bannerPlacementId;
    private BannerView bannerView;
    private UnityBannerEventAdapter eventAdapter;
    private String gameId;
    private MediationBannerListener mediationBannerListener;
    private BannerView.IListener unityBannerListener = new c(this);

    /* JADX INFO: Access modifiers changed from: private */
    public void sendBannerFailedToLoad(int i, String str) {
        AdError adErrorA = UnityAdsAdapterUtils.a(i, str);
        adErrorA.toString();
        MediationBannerListener mediationBannerListener = this.mediationBannerListener;
        if (mediationBannerListener != null) {
            mediationBannerListener.onAdFailedToLoad(this, adErrorA);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        return this.bannerView;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        BannerView bannerView = this.bannerView;
        if (bannerView != null) {
            bannerView.destroy();
        }
        this.bannerView = null;
        this.mediationBannerListener = null;
        this.unityBannerListener = null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull MediationBannerListener mediationBannerListener, @NonNull Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        this.mediationBannerListener = mediationBannerListener;
        this.eventAdapter = new UnityBannerEventAdapter(mediationBannerListener, this);
        this.gameId = bundle.getString(AndroidGetAdPlayerContext.KEY_GAME_ID);
        String string = bundle.getString("zoneId");
        this.bannerPlacementId = string;
        if (!UnityAdsAdapterUtils.areValidIds(this.gameId, string)) {
            sendBannerFailedToLoad(101, "Missing or invalid server parameters.");
            return;
        }
        if (!(context instanceof Activity)) {
            sendBannerFailedToLoad(105, "Unity Ads requires an Activity context to load ads.");
            return;
        }
        Activity activity = (Activity) context;
        UnityBannerSize unityBannerSize = UnityAdsAdapterUtils.getUnityBannerSize(context, adSize);
        if (unityBannerSize != null) {
            UnityInitializer.a().initializeUnityAds(context, this.gameId, new If0(this, activity, unityBannerSize, context));
            return;
        }
        sendBannerFailedToLoad(110, "There is no matching Unity Ads ad size for Google ad size: " + adSize);
    }
}

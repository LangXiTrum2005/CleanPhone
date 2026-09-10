package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.unity.eventadapters.UnityInterstitialEventAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.metadata.MetaData;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class UnityAdapter extends UnityMediationAdapter implements MediationInterstitialAdapter {
    private WeakReference<Activity> activityWeakReference;
    private UnityInterstitialEventAdapter eventAdapter;
    private MediationInterstitialListener mediationInterstitialListener;
    private String objectId;
    private String placementId;
    private final IUnityAdsLoadListener unityLoadListener = new attabal();
    private final IUnityAdsShowListener unityShowListener = new dern();

    public class attabal implements IUnityAdsLoadListener {
        public attabal() {
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(String str) {
            String.format("Unity Ads interstitial ad successfully loaded for placement ID: %s", str);
            String str2 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            UnityAdapter.this.placementId = str;
            UnityAdapter.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.LOADED);
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            UnityAdapter.this.placementId = str;
            AdError adErrorDern = UnityAdsAdapterUtils.dern(unityAdsLoadError, str2);
            String str3 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            adErrorDern.toString();
            if (UnityAdapter.this.mediationInterstitialListener != null) {
                UnityAdapter.this.mediationInterstitialListener.onAdFailedToLoad(UnityAdapter.this, adErrorDern);
            }
        }
    }

    public class dern implements IUnityAdsShowListener {
        public dern() {
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowClick(String str) {
            String.format("Unity Ads interstitial ad was clicked for placement ID: %s", UnityAdapter.this.placementId);
            String str2 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            UnityAdapter.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLICKED);
            UnityAdapter.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            String.format("Unity Ads interstitial ad finished playing for placement ID: %s", UnityAdapter.this.placementId);
            String str2 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            UnityAdapter.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLOSED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            AdError adErrorWireman = UnityAdsAdapterUtils.wireman(unityAdsShowError, str2);
            String str3 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            adErrorWireman.toString();
            UnityAdapter.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.OPENED);
            UnityAdapter.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLOSED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowStart(String str) {
            String.format("Unity Ads interstitial ad started for placement ID: %s", UnityAdapter.this.placementId);
            String str2 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            UnityAdapter.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.OPENED);
        }
    }

    public class saneness implements IUnityAdsInitializationListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ String f19113attabal;

        public saneness(String str) {
            this.f19113attabal = str;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() {
            String.format("Unity Ads is initialized for game ID '%s' and can now load interstitial ad with placement ID: %s", this.f19113attabal, UnityAdapter.this.placementId);
            String str = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError adErrorSaneness = UnityAdsAdapterUtils.saneness(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", this.f19113attabal, str));
            String str2 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            adErrorSaneness.toString();
            if (UnityAdapter.this.mediationInterstitialListener != null) {
                UnityAdapter.this.mediationInterstitialListener.onAdFailedToLoad(UnityAdapter.this, adErrorSaneness);
            }
        }
    }

    private void sendAdFailedToLoad(int i, String str) {
        AdError adErrorAttabal = UnityAdsAdapterUtils.attabal(i, str);
        adErrorAttabal.toString();
        MediationInterstitialListener mediationInterstitialListener = this.mediationInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener.onAdFailedToLoad(this, adErrorAttabal);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        this.mediationInterstitialListener = null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mediationInterstitialListener = mediationInterstitialListener;
        this.eventAdapter = new UnityInterstitialEventAdapter(mediationInterstitialListener, this);
        String string = bundle.getString(AndroidGetAdPlayerContext.KEY_GAME_ID);
        String string2 = bundle.getString("zoneId");
        this.placementId = string2;
        if (!UnityAdsAdapterUtils.areValidIds(string, string2)) {
            sendAdFailedToLoad(101, "Missing or invalid server parameters.");
            return;
        }
        if (!(context instanceof Activity)) {
            sendAdFailedToLoad(105, "Unity Ads requires an Activity context to load ads.");
            return;
        }
        this.activityWeakReference = new WeakReference<>((Activity) context);
        UnityInitializer.attabal().initializeUnityAds(context, string, new saneness(string));
        UnityAdsAdapterUtils.setUnityAdsPrivacy(MobileAds.getRequestConfiguration(), new MetaData(context));
        this.objectId = UUID.randomUUID().toString();
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        unityAdsLoadOptions.setObjectId(this.objectId);
        UnityAds.load(this.placementId, unityAdsLoadOptions, this.unityLoadListener);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        WeakReference<Activity> weakReference = this.activityWeakReference;
        Activity activity = weakReference == null ? null : weakReference.get();
        if (activity == null) {
            this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLOSED);
            return;
        }
        UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
        unityAdsShowOptions.setObjectId(this.objectId);
        UnityAds.show(activity, this.placementId, unityAdsShowOptions, this.unityShowListener);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }
}

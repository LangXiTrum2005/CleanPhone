package com.google.ads.mediation.unity;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: compiled from: UnityAdsWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class saneness {
    public MediationMetaData attabal(Context context) {
        return new MediationMetaData(context);
    }

    public boolean beachfront() {
        return UnityAds.isInitialized();
    }

    public void dern(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener) {
        UnityAds.getToken(tokenConfiguration, iUnityAdsTokenListener);
    }

    public void marial(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAds.initialize(context, str, false, iUnityAdsInitializationListener);
    }

    public void saneness(IUnityAdsTokenListener iUnityAdsTokenListener) {
        UnityAds.getToken(iUnityAdsTokenListener);
    }

    public String wireman() {
        return UnityAds.getVersion();
    }
}

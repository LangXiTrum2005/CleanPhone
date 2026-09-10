package com.google.ads.mediation.unity;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes2.dex */
public class UnityInitializer {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static UnityInitializer f19120saneness;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saneness f19121attabal = new saneness();

    public static synchronized UnityInitializer attabal() {
        try {
            if (f19120saneness == null) {
                f19120saneness = new UnityInitializer();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19120saneness;
    }

    public void initializeUnityAds(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (this.f19121attabal.beachfront()) {
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        MediationMetaData mediationMetaDataAttabal = this.f19121attabal.attabal(context);
        mediationMetaDataAttabal.setName("AdMob");
        mediationMetaDataAttabal.setVersion(this.f19121attabal.wireman());
        mediationMetaDataAttabal.set("adapter_version", BuildConfig.ADAPTER_VERSION);
        mediationMetaDataAttabal.commit();
        this.f19121attabal.marial(context, str, iUnityAdsInitializationListener);
    }
}

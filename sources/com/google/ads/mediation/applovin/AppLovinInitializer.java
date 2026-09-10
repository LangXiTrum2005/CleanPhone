package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.mediation.BuildConfig;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class AppLovinInitializer {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static AppLovinInitializer f18798saneness;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final AppLovinSdkWrapper f18799attabal = new AppLovinSdkWrapper();

    public interface OnInitializeSuccessListener {
        void onInitializeSuccess();
    }

    public class attabal implements AppLovinSdk.SdkInitializationListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ OnInitializeSuccessListener f18800attabal;

        public attabal(OnInitializeSuccessListener onInitializeSuccessListener) {
            this.f18800attabal = onInitializeSuccessListener;
        }

        @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
        public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
            this.f18800attabal.onInitializeSuccess();
        }
    }

    public static AppLovinInitializer getInstance() {
        if (f18798saneness == null) {
            f18798saneness = new AppLovinInitializer();
        }
        return f18798saneness;
    }

    public void initialize(Context context, String str, OnInitializeSuccessListener onInitializeSuccessListener) {
        this.f18799attabal.getInstance(context).initialize(AppLovinSdkInitializationConfiguration.builder(str).setMediationProvider(AppLovinMediationProvider.ADMOB).setPluginVersion(BuildConfig.ADAPTER_VERSION).build(), new attabal(onInitializeSuccessListener));
    }

    public AppLovinSdk retrieveSdk(Context context) {
        return this.f18799attabal.getInstance(context);
    }
}

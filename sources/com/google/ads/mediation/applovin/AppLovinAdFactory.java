package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdSize;

/* JADX INFO: loaded from: classes2.dex */
public class AppLovinAdFactory {
    public attabal attabal(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, AdSize adSize, Context context) {
        return attabal.saneness(appLovinSdk, appLovinAdSize, adSize, context);
    }

    public AppLovinIncentivizedInterstitial createIncentivizedInterstitial(AppLovinSdk appLovinSdk) {
        return AppLovinIncentivizedInterstitial.create(appLovinSdk);
    }

    public AppLovinInterstitialAdDialog createInterstitialAdDialog(AppLovinSdk appLovinSdk, Context context) {
        return AppLovinInterstitialAd.create(appLovinSdk, context);
    }

    public MaxAppOpenAd saneness(String str) {
        return new MaxAppOpenAd(str);
    }

    public AppLovinIncentivizedInterstitial createIncentivizedInterstitial(String str, AppLovinSdk appLovinSdk) {
        return AppLovinIncentivizedInterstitial.create(str, appLovinSdk);
    }
}

package com.applovin.adview;

import android.content.Context;
import com.applovin.impl.p2;
import com.applovin.impl.sdk.l;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinInterstitialAd {
    public static AppLovinInterstitialAdDialog create() {
        return create(AppLovinSdk.getInstance(l.p()), l.p());
    }

    public String toString() {
        return "AppLovinInterstitialAd{}";
    }

    @Deprecated
    public static AppLovinInterstitialAdDialog create(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context != null) {
            return new p2(appLovinSdk, context);
        }
        throw new IllegalArgumentException("No context specified");
    }
}

package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes2.dex */
public class AppLovinSdkWrapper {
    public AppLovinSdk getInstance(Context context) {
        return AppLovinSdk.getInstance(context);
    }

    public String getSdkVersion() {
        return AppLovinSdk.VERSION;
    }
}

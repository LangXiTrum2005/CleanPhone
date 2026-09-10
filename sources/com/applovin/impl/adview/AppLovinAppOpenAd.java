package com.applovin.impl.adview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinAppOpenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppLovinInterstitialAdDialog f7410a = AppLovinInterstitialAd.create();

    public void setAdClickListener(@Nullable AppLovinAdClickListener appLovinAdClickListener) {
        this.f7410a.setAdClickListener(appLovinAdClickListener);
    }

    public void setAdDisplayListener(@Nullable AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f7410a.setAdDisplayListener(appLovinAdDisplayListener);
    }

    public void setAdVideoPlaybackListener(@Nullable AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f7410a.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
    }

    public void show(@NonNull AppLovinAd appLovinAd) {
        this.f7410a.showAndRender(appLovinAd);
    }

    @NonNull
    public String toString() {
        return "AppLovinAppOpenAd{}";
    }
}

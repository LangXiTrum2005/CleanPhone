package com.google.ads.mediation.applovin;

import android.content.Context;
import android.widget.FrameLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdSize;

/* JADX INFO: compiled from: AppLovinAdViewWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final AppLovinAdView f18824attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final FrameLayout f18825saneness;

    public attabal(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, FrameLayout frameLayout, Context context) {
        AppLovinAdView appLovinAdView = new AppLovinAdView(appLovinSdk, appLovinAdSize, context);
        this.f18824attabal = appLovinAdView;
        this.f18825saneness = frameLayout;
        frameLayout.addView(appLovinAdView);
    }

    public static attabal saneness(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, AdSize adSize, Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        return new attabal(appLovinSdk, appLovinAdSize, frameLayout, context);
    }

    public FrameLayout attabal() {
        return this.f18825saneness;
    }

    public void beachfront(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f18824attabal.setAdViewEventListener(appLovinAdViewEventListener);
    }

    public void dern(AppLovinAd appLovinAd) {
        this.f18824attabal.renderAd(appLovinAd);
    }

    public void marial(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f18824attabal.setAdDisplayListener(appLovinAdDisplayListener);
    }

    public void wireman(AppLovinAdClickListener appLovinAdClickListener) {
        this.f18824attabal.setAdClickListener(appLovinAdClickListener);
    }
}

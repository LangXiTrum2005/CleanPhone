package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.sdk.l;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f10365a;

    public MaxNativeAdLoader(String str) {
        this(str, l.p());
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f10365a.logApiCall("a()");
        this.f10365a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.f10365a.logApiCall("b()");
        this.f10365a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.f10365a.logApiCall("destroy()");
        this.f10365a.destroy();
    }

    public String getAdUnitId() {
        return this.f10365a.getAdUnitId();
    }

    public String getPlacement() {
        this.f10365a.logApiCall("getPlacement()");
        return this.f10365a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.f10365a.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f10365a.render(maxNativeAdView, maxAd);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f10365a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f10365a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.f10365a.logApiCall("setCustomData(value=" + str + ")");
        this.f10365a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f10365a.logApiCall(d.h("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f10365a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f10365a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f10365a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f10365a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f10365a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.f10365a.logApiCall("setPlacement(placement=" + str + ")");
        this.f10365a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f10365a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f10365a.setRevenueListener(maxAdRevenueListener);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f10365a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f10365a.loadAd(maxNativeAdView);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        com.applovin.impl.mediation.ads.a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (appLovinSdk == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            if (context != null) {
                this.f10365a = new MaxNativeAdLoaderImpl(str, appLovinSdk.a());
                return;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void destroy(MaxAd maxAd) {
        this.f10365a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f10365a.destroy(maxAd);
    }
}

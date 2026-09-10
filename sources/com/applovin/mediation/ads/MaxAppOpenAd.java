package com.applovin.mediation.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxAppOpenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f10345a;

    public MaxAppOpenAd(@NonNull String str) {
        this(str, l.p());
    }

    public void destroy() {
        this.f10345a.logApiCall("destroy()");
        this.f10345a.destroy();
    }

    @NonNull
    public String getAdUnitId() {
        return this.f10345a.getAdUnitId();
    }

    public boolean isLoading() {
        boolean zIsLoading = this.f10345a.isLoading();
        this.f10345a.logApiCall("isLoading() " + zIsLoading + " for ad unit id " + this.f10345a.getAdUnitId());
        return zIsLoading;
    }

    public boolean isReady() {
        boolean zIsReady = this.f10345a.isReady();
        this.f10345a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f10345a.getAdUnitId());
        return zIsReady;
    }

    public boolean isShowing() {
        boolean zIsShowing = this.f10345a.isShowing();
        this.f10345a.logApiCall("isShowing() " + zIsShowing + " for ad unit id " + this.f10345a.getAdUnitId());
        return zIsShowing;
    }

    public void loadAd() {
        this.f10345a.logApiCall("loadAd()");
        this.f10345a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f10345a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f10345a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f10345a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f10345a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(@NonNull String str, @Nullable String str2) {
        this.f10345a.logApiCall(d.h("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f10345a.setExtraParameter(str, str2);
    }

    public void setListener(@Nullable MaxAdListener maxAdListener) {
        this.f10345a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f10345a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(@NonNull String str, @Nullable Object obj) {
        this.f10345a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f10345a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f10345a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f10345a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(@Nullable MaxAdRevenueListener maxAdRevenueListener) {
        this.f10345a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f10345a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    @NonNull
    public String toString() {
        return "" + this.f10345a;
    }

    @Deprecated
    public MaxAppOpenAd(@NonNull String str, @NonNull Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(@Nullable String str) {
        showAd(str, null);
    }

    @Deprecated
    public MaxAppOpenAd(@NonNull String str, @NonNull AppLovinSdk appLovinSdk) {
        this(str, appLovinSdk, l.p());
    }

    public void showAd(@Nullable String str, @Nullable String str2) {
        this.f10345a.logApiCall(d.h("showAd(placement=", str, ", customData=", str2, ")"));
        q7.b(str2, "MaxAppOpenAd");
        this.f10345a.showAd(str, str2, null);
    }

    private MaxAppOpenAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        this.f10345a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.a(), context);
    }
}

package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.lifecycle.o;
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
import defpackage.e;
import java.lang.ref.WeakReference;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WeakReference f10346b = new WeakReference(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f10347a;

    public MaxInterstitialAd(String str) {
        this(str, l.p());
    }

    public void destroy() {
        this.f10347a.logApiCall("destroy()");
        this.f10347a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f10347a.logApiCall("getActivity()");
        return (Activity) f10346b.get();
    }

    public String getAdUnitId() {
        return this.f10347a.getAdUnitId();
    }

    public boolean isLoading() {
        boolean zIsLoading = this.f10347a.isLoading();
        this.f10347a.logApiCall("isLoading() " + zIsLoading + " for ad unit id " + this.f10347a.getAdUnitId());
        return zIsLoading;
    }

    public boolean isReady() {
        boolean zIsReady = this.f10347a.isReady();
        this.f10347a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f10347a.getAdUnitId());
        return zIsReady;
    }

    public boolean isShowing() {
        boolean zIsShowing = this.f10347a.isShowing();
        this.f10347a.logApiCall("isShowing() " + zIsShowing + " for ad unit id " + this.f10347a.getAdUnitId());
        return zIsShowing;
    }

    public void loadAd() {
        this.f10347a.logApiCall("loadAd()");
        this.f10347a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f10347a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f10347a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(@Nullable MaxAdExpirationListener maxAdExpirationListener) {
        this.f10347a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f10347a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f10347a.logApiCall(d.h("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f10347a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f10347a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f10347a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f10347a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f10347a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f10347a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f10347a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f10347a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f10347a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f10347a;
    }

    @Deprecated
    public MaxInterstitialAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    f10346b = new WeakReference((Activity) context);
                }
                this.f10347a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.a(), context);
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f10347a;
        StringBuilder sbV = e.v("showAd(placement=", str, ", customData=", str2, ", activity=");
        sbV.append(activity);
        sbV.append(")");
        maxFullscreenAdImpl.logApiCall(sbV.toString());
        q7.b(str2, "MaxInterstitialAd");
        this.f10347a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, o oVar, Activity activity) {
        showAd((String) null, viewGroup, oVar, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, o oVar, Activity activity) {
        showAd(str, null, viewGroup, oVar, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, o oVar, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f10347a;
        StringBuilder sbV = e.v("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbV.append(viewGroup);
        sbV.append(", lifecycle=");
        sbV.append(oVar);
        sbV.append(", activity=");
        sbV.append(activity);
        sbV.append(")");
        maxFullscreenAdImpl.logApiCall(sbV.toString());
        this.f10347a.showAd(str, str2, viewGroup, oVar, activity);
    }

    @Deprecated
    public void showAd() {
        showAd((String) null);
    }

    @Deprecated
    public void showAd(String str) {
        showAd(str, (String) null);
    }

    @Deprecated
    public void showAd(String str, String str2) {
        this.f10347a.logApiCall(d.h("showAd(placement=", str, ", customData=", str2, ")"));
        q7.b(str2, "MaxInterstitialAd");
        this.f10347a.showAd(str, str2, getActivity());
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, o oVar) {
        showAd((String) null, viewGroup, oVar);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, o oVar) {
        showAd(str, (String) null, viewGroup, oVar);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, o oVar) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f10347a;
        StringBuilder sbV = e.v("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbV.append(viewGroup);
        sbV.append(", lifecycle=");
        sbV.append(oVar);
        sbV.append(")");
        maxFullscreenAdImpl.logApiCall(sbV.toString());
        this.f10347a.showAd(str, str2, viewGroup, oVar, getActivity());
    }
}

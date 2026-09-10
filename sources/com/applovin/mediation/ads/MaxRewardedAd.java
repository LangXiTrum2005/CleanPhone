package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.lifecycle.o;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxRewardedAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import defpackage.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f10348b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f10349c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static WeakReference f10350d = new WeakReference(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxRewardedAdImpl f10351a;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk, Context context) {
        this.f10351a = new MaxRewardedAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.a(), context);
    }

    public static MaxRewardedAd getInstance(String str) {
        return getInstance(str, l.p());
    }

    public void destroy() {
        this.f10351a.logApiCall("destroy()");
        synchronized (f10349c) {
            f10348b.remove(this.f10351a.getAdUnitId());
        }
        this.f10351a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f10351a.logApiCall("getActivity()");
        return (Activity) f10350d.get();
    }

    public String getAdUnitId() {
        return this.f10351a.getAdUnitId();
    }

    public boolean isLoading() {
        boolean zIsLoading = this.f10351a.isLoading();
        this.f10351a.logApiCall("isLoading() " + zIsLoading + " for ad unit id " + this.f10351a.getAdUnitId());
        return zIsLoading;
    }

    public boolean isReady() {
        boolean zIsReady = this.f10351a.isReady();
        this.f10351a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f10351a.getAdUnitId());
        return zIsReady;
    }

    public boolean isShowing() {
        boolean zIsShowing = this.f10351a.isShowing();
        this.f10351a.logApiCall("isShowing() " + zIsShowing + " for ad unit id " + this.f10351a.getAdUnitId());
        return zIsShowing;
    }

    public void loadAd() {
        this.f10351a.logApiCall("loadAd()");
        this.f10351a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f10351a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f10351a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(@Nullable MaxAdExpirationListener maxAdExpirationListener) {
        this.f10351a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f10351a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f10351a.logApiCall(d.h("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f10351a.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f10351a.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f10351a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f10351a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f10351a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f10351a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f10351a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f10351a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f10351a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f10351a;
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, Context context) {
        return getInstance(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    f10350d = new WeakReference((Activity) context);
                }
                synchronized (f10349c) {
                    try {
                        Map map = f10348b;
                        MaxRewardedAd maxRewardedAd = (MaxRewardedAd) map.get(str);
                        if (maxRewardedAd != null) {
                            return maxRewardedAd;
                        }
                        MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk, context);
                        map.put(str, maxRewardedAd2);
                        return maxRewardedAd2;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f10351a;
        StringBuilder sbV = e.v("showAd(placement=", str, ", customData=", str2, ", activity=");
        sbV.append(activity);
        sbV.append(")");
        maxRewardedAdImpl.logApiCall(sbV.toString());
        q7.b(str2, "MaxRewardedAd");
        this.f10351a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, o oVar, Activity activity) {
        showAd((String) null, viewGroup, oVar, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, o oVar, Activity activity) {
        showAd(str, null, viewGroup, oVar, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, o oVar, Activity activity) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f10351a;
        StringBuilder sbV = e.v("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbV.append(viewGroup);
        sbV.append(", lifecycle=");
        sbV.append(oVar);
        sbV.append(", activity=");
        sbV.append(activity);
        sbV.append(")");
        maxRewardedAdImpl.logApiCall(sbV.toString());
        this.f10351a.showAd(str, str2, viewGroup, oVar, activity);
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
        this.f10351a.logApiCall(d.h("showAd(placement=", str, ", customData=", str2, ")"));
        q7.b(str2, "MaxRewardedAd");
        this.f10351a.showAd(str, str2, getActivity());
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
        MaxRewardedAdImpl maxRewardedAdImpl = this.f10351a;
        StringBuilder sbV = e.v("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbV.append(viewGroup);
        sbV.append(", lifecycle=");
        sbV.append(oVar);
        sbV.append(")");
        maxRewardedAdImpl.logApiCall(sbV.toString());
        this.f10351a.showAd(str, str2, viewGroup, oVar, getActivity());
    }
}

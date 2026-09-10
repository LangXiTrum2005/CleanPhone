package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.O6;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class IronSource {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        REWARDED_VIDEO(O6.H0),
        INTERSTITIAL("interstitial"),
        BANNER("banner"),
        NATIVE_AD("nativeAd");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29281a;

        a(String str) {
            this.f29281a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f29281a;
        }
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        return p.h().a(activity, iSBannerSize);
    }

    public static void destroyISDemandOnlyBanner(String str) {
        p.h().e(str);
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        return p.h().a(context);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return p.h().d(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return p.h().h(str);
    }

    public static void loadISDemandOnlyBanner(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        p.h().a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        p.h().a(activity, str);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        p.h().b(activity, str);
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        p.h().a(str, jSONObject);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        p.h().a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        p.h().a(iSDemandOnlyRewardedVideoListener);
    }

    public static void setMediationType(String str) {
        p.h().f(str);
    }

    public static void showISDemandOnlyInterstitial(String str) {
        p.h().c(str);
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        p.h().a(str);
    }
}

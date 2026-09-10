package com.p004ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.p004ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.LogListener;
import com.p004ironsource.mediationsdk.model.InterstitialPlacement;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.sdk.InitializationListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.p004ironsource.mediationsdk.sdk.SegmentListener;
import com.p004ironsource.ne;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class IronSource {

    @Deprecated
    public enum AD_UNIT {
        REWARDED_VIDEO(ne.E0),
        INTERSTITIAL("interstitial"),
        BANNER("banner"),
        NATIVE_AD("nativeAd");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25715a;

        AD_UNIT(String str) {
            this.f25715a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f25715a;
        }
    }

    @Deprecated
    public static void addImpressionDataListener(ImpressionDataListener impressionDataListener) {
        p.j().b(impressionDataListener);
    }

    @Deprecated
    public static void clearRewardedVideoServerParameters() {
        p.j().clearRewardedVideoServerParameters();
    }

    @Deprecated
    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        return p.j().b(activity, iSBannerSize);
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        return p.j().a(activity, iSBannerSize);
    }

    @Deprecated
    public static void destroyBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        p.j().a(ironSourceBannerLayout);
    }

    public static void destroyISDemandOnlyBanner(String str) {
        p.j().c(str);
    }

    @Deprecated
    public static String getAdvertiserId(Context context) {
        return p.j().getAdvertiserId(context);
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        return p.j().a(context);
    }

    @Deprecated
    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return p.j().getInterstitialPlacementInfo(str);
    }

    @Deprecated
    public static Placement getRewardedVideoPlacementInfo(String str) {
        return p.j().getRewardedVideoPlacementInfo(str);
    }

    @Deprecated
    public static void init(Context context, String str) {
        init(context, str, (AD_UNIT[]) null);
    }

    @Deprecated
    public static void initISDemandOnly(Context context, String str, AD_UNIT... ad_unitArr) {
        p.j().a(context, str, ad_unitArr);
    }

    @Deprecated
    public static boolean isBannerPlacementCapped(String str) {
        return p.j().m(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return p.j().e(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return p.j().f(str);
    }

    @Deprecated
    public static boolean isInterstitialPlacementCapped(String str) {
        return p.j().n(str);
    }

    @Deprecated
    public static boolean isInterstitialReady() {
        return p.j().D();
    }

    @Deprecated
    public static boolean isRewardedVideoAvailable() {
        return p.j().I();
    }

    @Deprecated
    public static boolean isRewardedVideoPlacementCapped(String str) {
        return p.j().o(str);
    }

    @Deprecated
    public static void launchTestSuite(Context context) {
        IronLog.API.info("");
        p.j().b(context);
    }

    @Deprecated
    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        p.j().b(ironSourceBannerLayout);
    }

    public static void loadISDemandOnlyBanner(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        p.j().a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        p.j().a(activity, iSDemandOnlyBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        p.j().a(activity, str);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(Activity activity, String str, String str2) {
        p.j().b(activity, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        p.j().b(activity, str);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(Activity activity, String str, String str2) {
        p.j().a(activity, str, str2);
    }

    @Deprecated
    public static void loadInterstitial() {
        p.j().N();
    }

    @Deprecated
    public static void loadRewardedVideo() {
        p.j().O();
    }

    @Deprecated
    public static void onPause(Activity activity) {
        p.j().a(activity);
    }

    @Deprecated
    public static void onResume(Activity activity) {
        p.j().b(activity);
    }

    @Deprecated
    public static void removeImpressionDataListener(ImpressionDataListener impressionDataListener) {
        p.j().a(impressionDataListener);
    }

    @Deprecated
    public static void removeInterstitialListener() {
        p.j().removeInterstitialListener();
    }

    @Deprecated
    public static void removeRewardedVideoListener() {
        p.j().removeRewardedVideoListener();
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        p.j().a(str, jSONObject);
    }

    @Deprecated
    public static void setAdaptersDebug(boolean z2) {
        p.j().setAdaptersDebug(z2);
    }

    @Deprecated
    public static void setConsent(boolean z2) {
        IronLog.API.info("consent = " + z2);
        p.j().a(z2);
    }

    @Deprecated
    public static boolean setDynamicUserId(String str) {
        IronLog.API.info("dynamicUserId: " + str);
        return p.j().setDynamicUserId(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        p.j().a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        p.j().a(iSDemandOnlyRewardedVideoListener);
    }

    @Deprecated
    public static void setLevelPlayInterstitialListener(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        p.j().a(levelPlayInterstitialListener);
    }

    @Deprecated
    public static void setLevelPlayRewardedVideoListener(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        p.j().a(levelPlayRewardedVideoListener);
    }

    @Deprecated
    public static void setLevelPlayRewardedVideoManualListener(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        p.j().a(levelPlayRewardedVideoManualListener);
    }

    @Deprecated
    public static void setLogListener(LogListener logListener) {
        p.j().a(logListener);
    }

    public static void setMediationType(String str) {
        p.j().setMediationType(str);
    }

    @Deprecated
    public static void setMetaData(String str, String str2) {
        IronLog.API.info("key = " + str + ", value = " + str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        p.j().a(str, arrayList);
    }

    @Deprecated
    public static void setNetworkData(String str, JSONObject jSONObject) {
        IronLog.API.info("networkKey = " + str + ", networkData = " + jSONObject);
        p.j().b(str, jSONObject);
    }

    @Deprecated
    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        p.j().setRewardedVideoServerParameters(map);
    }

    @Deprecated
    public static void setSegment(IronSourceSegment ironSourceSegment) {
        IronLog.API.info("");
        p.j().a(ironSourceSegment);
    }

    @Deprecated
    public static void setSegmentListener(SegmentListener segmentListener) {
        p.j().a(segmentListener);
    }

    @Deprecated
    public static void setUserId(String str) {
        p.j().p(str);
    }

    @Deprecated
    public static void setWaterfallConfiguration(WaterfallConfiguration waterfallConfiguration, AD_UNIT ad_unit) {
        p.j().a(ad_unit, waterfallConfiguration);
    }

    @Deprecated
    public static void shouldTrackNetworkState(Context context, boolean z2) {
        p.j().shouldTrackNetworkState(context, z2);
    }

    public static void showISDemandOnlyInterstitial(String str) {
        p.j().b(str);
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        p.j().a(str);
    }

    @Deprecated
    public static void showInterstitial() {
        p.j().c((Activity) null);
    }

    @Deprecated
    public static void showRewardedVideo() {
        p.j().d((Activity) null);
    }

    @Deprecated
    public static void init(Context context, String str, InitializationListener initializationListener) {
        init(context, str, initializationListener, null);
    }

    @Deprecated
    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        p.j().a(ironSourceBannerLayout, str);
    }

    @Deprecated
    public static void setMetaData(String str, List<String> list) {
        IronLog.API.info("key = " + str + ", values = " + list);
        p.j().a(str, list);
    }

    @Deprecated
    public static void showInterstitial(Activity activity) {
        p.j().c(activity);
    }

    @Deprecated
    public static void showRewardedVideo(Activity activity) {
        p.j().d(activity);
    }

    @Deprecated
    public static void init(Context context, String str, InitializationListener initializationListener, AD_UNIT... ad_unitArr) {
        p.j().a(context, str, false, initializationListener, ad_unitArr);
    }

    @Deprecated
    public static void showInterstitial(Activity activity, String str) {
        p.j().c(activity, str);
    }

    @Deprecated
    public static void showRewardedVideo(Activity activity, String str) {
        p.j().f(activity, str);
    }

    @Deprecated
    public static void init(Context context, String str, AD_UNIT... ad_unitArr) {
        p.j().a(context, str, false, (InitializationListener) null, ad_unitArr);
    }

    @Deprecated
    public static void showInterstitial(String str) {
        p.j().c(null, str);
    }

    @Deprecated
    public static void showRewardedVideo(String str) {
        p.j().f(null, str);
    }
}

package com.applovin.applovin_max;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cj.h;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.Pf;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import d5.u;
import defpackage.e;
import fc.f;
import io.flutter.plugin.platform.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l1.d;
import ti.b;
import ui.a;
import xi.m;
import xi.n;
import xi.o;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinMAX implements b, n, a, MaxAdListener, MaxAdViewAdListener, MaxRewardedAdListener, MaxAdRevenueListener {
    private static final Map<String, String> ALCompatibleNativeSdkVersions;
    private static final String BOTTOM_CENTER = "bottom_center";
    private static final String BOTTOM_LEFT = "bottom_left";
    private static final String BOTTOM_RIGHT = "bottom_right";
    private static final String CENTERED = "centered";
    private static final String CENTER_LEFT = "center_left";
    private static final String CENTER_RIGHT = "center_right";
    private static final String PLUGIN_VERSION = "4.6.3";
    private static final String SDK_TAG = "AppLovinSdk";
    public static final String TAG = "AppLovinMAX";
    private static final String TOP_CENTER = "top_center";
    private static final String TOP_LEFT = "top_left";
    private static final String TOP_RIGHT = "top_right";
    private static final String USER_GEOGRAPHY_GDPR = "G";
    private static final String USER_GEOGRAPHY_OTHER = "O";
    private static final String USER_GEOGRAPHY_UNKNOWN = "U";
    public static AppLovinMAX instance;
    private Context applicationContext;
    private List<String> initializationAdUnitIdsToSet;
    private boolean isPluginInitialized;
    private boolean isSdkInitialized;
    private ui.b lastActivityPluginBinding;
    private AppLovinSdk sdk;
    private AppLovinSdkConfiguration sdkConfiguration;
    private p sharedChannel;
    private List<String> testDeviceAdvertisingIdsToSet;
    private final MaxSegmentCollection.Builder segmentCollectionBuilder = MaxSegmentCollection.builder();
    private final Map<String, MaxInterstitialAd> mInterstitials = new HashMap(2);
    private final Map<String, MaxRewardedAd> mRewardedAds = new HashMap(2);
    private final Map<String, MaxAppOpenAd> mAppOpenAds = new HashMap(2);
    private final Map<String, MaxAdView> mAdViews = new HashMap(2);
    private final Map<String, MaxAdFormat> mAdViewAdFormats = new HashMap(2);
    private final Map<String, String> mAdViewPositions = new HashMap(2);
    private final List<String> mAdUnitIdsToShowAfterCreate = new ArrayList(2);
    private final Set<String> mDisabledAutoRefreshAdViewAdUnitIds = new HashSet(2);
    private final Map<String, Integer> mAdViewWidths = new HashMap(2);
    private final Set<String> mDisabledAdaptiveBannerAdUnitIds = new HashSet(2);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class AdViewSize {
        public final int heightDp;
        public final int widthDp;

        private AdViewSize(int i10, int i11) {
            this.widthDp = i10;
            this.heightDp = i11;
        }
    }

    static {
        HashMap map = new HashMap();
        ALCompatibleNativeSdkVersions = map;
        map.put(PLUGIN_VERSION, "13.6.1");
        map.put("4.6.2", "13.6.0");
        map.put("4.6.1", "13.5.1");
        map.put("4.6.0", "13.5.0");
        map.put("4.5.2", "13.4.0");
        map.put("4.5.1", "13.3.1");
        map.put("4.5.0", "13.3.0");
        map.put("4.4.0", "13.2.0");
        map.put("4.3.1", "13.0.1");
        map.put("4.3.0", "13.0.1");
        map.put("4.2.1", "13.0.1");
        map.put("4.2.0", "13.0.1");
        map.put("4.1.2", "13.0.1");
        map.put("4.1.1", "13.0.1");
        map.put("4.1.0", "13.0.1");
        map.put("4.0.2", "13.0.0");
        map.put("4.0.1", "13.0.0");
        map.put("4.0.0", "13.0.0");
    }

    private void createAdView(String str, MaxAdFormat maxAdFormat, String str2, boolean z10) {
        d("Creating " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" and position: \"" + str2 + "\"");
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat, str2, z10);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        maxAdViewRetrieveAdView.setVisibility(8);
        if (maxAdViewRetrieveAdView.getParent() == null) {
            Activity currentActivity = getCurrentActivity();
            RelativeLayout relativeLayout = new RelativeLayout(currentActivity);
            currentActivity.addContentView(relativeLayout, new LinearLayout.LayoutParams(-1, -1));
            relativeLayout.addView(maxAdViewRetrieveAdView);
            this.mAdViewAdFormats.put(str, maxAdFormat);
            positionAdView(str, maxAdFormat);
        }
        maxAdViewRetrieveAdView.loadAd();
        if (this.mDisabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            maxAdViewRetrieveAdView.stopAutoRefresh();
        }
        if (this.mAdUnitIdsToShowAfterCreate.contains(str)) {
            showAdView(str, maxAdFormat);
            this.mAdUnitIdsToShowAfterCreate.remove(str);
        }
    }

    private Map<String, Object> createAdWaterfallInfo(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        HashMap map = new HashMap();
        if (maxAdWaterfallInfo == null) {
            return map;
        }
        map.put("name", maxAdWaterfallInfo.getName());
        map.put("testName", maxAdWaterfallInfo.getTestName());
        ArrayList arrayList = new ArrayList();
        Iterator<MaxNetworkResponseInfo> it = maxAdWaterfallInfo.getNetworkResponses().iterator();
        while (it.hasNext()) {
            arrayList.add(createNetworkResponseInfo(it.next()));
        }
        map.put("networkResponses", arrayList);
        map.put("latencyMillis", Long.valueOf(maxAdWaterfallInfo.getLatencyMillis()));
        return map;
    }

    private Map<String, Object> createNetworkResponseInfo(MaxNetworkResponseInfo maxNetworkResponseInfo) {
        HashMap map = new HashMap();
        map.put("adLoadState", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
        MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
        if (mediatedNetwork != null) {
            HashMap map2 = new HashMap(4);
            map2.put("name", mediatedNetwork.getName());
            map2.put("adapterClassName", mediatedNetwork.getAdapterClassName());
            map2.put(Pf.f27049b, mediatedNetwork.getAdapterVersion());
            map2.put("sdkVersion", mediatedNetwork.getSdkVersion());
            map.put("mediatedNetwork", map2);
        }
        Bundle credentials = maxNetworkResponseInfo.getCredentials();
        HashMap map3 = new HashMap();
        for (String str : credentials.keySet()) {
            Object obj = credentials.get(str);
            if (obj instanceof String) {
                map3.put(str, (String) obj);
            }
        }
        map.put("credentials", map3);
        MaxError error = maxNetworkResponseInfo.getError();
        if (error != null) {
            map.put("error", getAdLoadFailedInfo("", error));
        }
        map.put("latencyMillis", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()));
        return map;
    }

    public static void d(String str) {
        Log.d(SDK_TAG, "[AppLovinMAX] " + str);
    }

    private void destroyAdView(String str, MaxAdFormat maxAdFormat) {
        d("Destroying " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        ViewParent parent = maxAdViewRetrieveAdView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(maxAdViewRetrieveAdView);
        }
        maxAdViewRetrieveAdView.setListener(null);
        maxAdViewRetrieveAdView.setRevenueListener(null);
        maxAdViewRetrieveAdView.destroy();
        this.mAdViews.remove(str);
        this.mAdViewAdFormats.remove(str);
        this.mAdViewPositions.remove(str);
    }

    public static void e(String str) {
        Log.e(SDK_TAG, "[AppLovinMAX] " + str);
    }

    private static AdViewSize getAdViewSize(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.LEADER == maxAdFormat) {
            return new AdViewSize(728, 90);
        }
        if (MaxAdFormat.BANNER == maxAdFormat) {
            return new AdViewSize(320, 50);
        }
        if (MaxAdFormat.MREC == maxAdFormat) {
            return new AdViewSize(300, 250);
        }
        throw new IllegalArgumentException("Invalid ad format");
    }

    private static AppLovinSdkConfiguration.ConsentFlowUserGeography getAppLovinConsentFlowUserGeography(String str) {
        if ("G".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        return USER_GEOGRAPHY_OTHER.equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER : AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    private void getConfiguration(o oVar) {
        oVar.a(getInitializationMessage());
    }

    private Activity getCurrentActivity() {
        ui.b bVar = this.lastActivityPluginBinding;
        if (bVar != null) {
            return (Activity) ((f) bVar).f40780b;
        }
        return null;
    }

    private Map<String, Object> getInitializationMessage() {
        HashMap map = new HashMap(4);
        AppLovinSdkConfiguration appLovinSdkConfiguration = this.sdkConfiguration;
        if (appLovinSdkConfiguration != null) {
            map.put("countryCode", appLovinSdkConfiguration.getCountryCode());
            map.put("isTestModeEnabled", Boolean.valueOf(this.sdkConfiguration.isTestModeEnabled()));
            map.put("consentFlowUserGeography", getRawAppLovinConsentFlowUserGeography(this.sdkConfiguration.getConsentFlowUserGeography()));
        }
        return map;
    }

    public static AppLovinMAX getInstance() {
        return instance;
    }

    private String getLocalExtraParameterKeyForAmazonResult(Object obj) {
        return "DTBAdResponse".equalsIgnoreCase(obj.getClass().getSimpleName()) ? "amazon_ad_response" : "amazon_ad_error";
    }

    private static String getRawAppLovinConsentFlowUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        if (AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR == consentFlowUserGeography) {
            return "G";
        }
        return AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER == consentFlowUserGeography ? USER_GEOGRAPHY_OTHER : USER_GEOGRAPHY_UNKNOWN;
    }

    private void hideAdView(String str, MaxAdFormat maxAdFormat) {
        d("Hiding " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        this.mAdUnitIdsToShowAfterCreate.remove(str);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setVisibility(8);
            maxAdViewRetrieveAdView.stopAutoRefresh();
        } else {
            e(maxAdFormat.getLabel() + " does not exist");
        }
    }

    private void initialize(String str, String str2, o oVar) {
        if (this.isPluginInitialized) {
            return;
        }
        this.isPluginInitialized = true;
        d("Initializing AppLovin MAX Flutter v" + str + "...");
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalStateException("Unable to initialize AppLovin SDK - no SDK key provided!");
        }
        AppLovinSdkInitializationConfiguration.Builder builder = AppLovinSdkInitializationConfiguration.builder(str2, this.applicationContext);
        builder.setPluginVersion("Flutter-" + str);
        builder.setMediationProvider(AppLovinMediationProvider.MAX);
        builder.setSegmentCollection(this.segmentCollectionBuilder.build());
        List<String> list = this.initializationAdUnitIdsToSet;
        if (list != null) {
            builder.setAdUnitIds(list);
            this.initializationAdUnitIdsToSet = null;
        }
        List<String> list2 = this.testDeviceAdvertisingIdsToSet;
        if (list2 != null) {
            builder.setTestDeviceAdvertisingIds(list2);
            this.testDeviceAdvertisingIdsToSet = null;
        }
        this.sdk.initialize(builder.build(), new h(10, this, oVar));
    }

    private boolean isInclusiveVersion(String str, @Nullable String str2, @Nullable String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int versionCode = toVersionCode(str);
        if (TextUtils.isEmpty(str2) || versionCode >= toVersionCode(str2)) {
            return TextUtils.isEmpty(str3) || versionCode <= toVersionCode(str3);
        }
        return false;
    }

    private void isInitialized(@Nullable o oVar) {
        boolean z10 = this.isPluginInitialized && this.isSdkInitialized;
        if (oVar != null) {
            oVar.a(Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$0(o oVar, AppLovinSdkConfiguration appLovinSdkConfiguration) {
        d("SDK initialized");
        this.sdkConfiguration = appLovinSdkConfiguration;
        this.isSdkInitialized = true;
        oVar.a(getInitializationMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showCmpForExistingUser$1(o oVar, AppLovinCmpError appLovinCmpError) {
        if (appLovinCmpError == null) {
            oVar.a(null);
            return;
        }
        HashMap map = new HashMap(4);
        map.put("code", Integer.valueOf(appLovinCmpError.getCode().getValue()));
        map.put("message", appLovinCmpError.getMessage());
        map.put("cmpCode", Integer.valueOf(appLovinCmpError.getCmpCode()));
        map.put("cmpMessage", appLovinCmpError.getCmpMessage());
        oVar.a(map);
    }

    private void loadAdView(String str, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        if (this.mDisabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            maxAdViewRetrieveAdView.loadAd();
            return;
        }
        if (maxAdViewRetrieveAdView.getVisibility() != 0) {
            e("Auto-refresh will resume when the " + maxAdFormat.getLabel() + " ad is shown. You should only call LoadBanner() or LoadMRec() if you explicitly pause auto-refresh and want to manually load an ad.");
            return;
        }
        e("You must stop auto-refresh if you want to manually load " + maxAdFormat.getLabel() + " ads.");
    }

    private void logInvalidAdFormat(MaxAdFormat maxAdFormat) {
        logStackTrace(new IllegalStateException("invalid ad format: " + maxAdFormat));
    }

    private void logStackTrace(Exception exc) {
        e(Log.getStackTraceString(exc));
    }

    private static void logUninitializedAccessError(String str) {
        logUninitializedAccessError(str, null);
    }

    private void positionAdView(MaxAd maxAd) {
        positionAdView(maxAd.getAdUnitId(), maxAd.getFormat());
    }

    private MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat) {
        return retrieveAdView(str, maxAdFormat, null, true);
    }

    private MaxAppOpenAd retrieveAppOpenAd(String str) {
        MaxAppOpenAd maxAppOpenAd = this.mAppOpenAds.get(str);
        if (maxAppOpenAd != null) {
            return maxAppOpenAd;
        }
        MaxAppOpenAd maxAppOpenAd2 = new MaxAppOpenAd(str, this.sdk);
        maxAppOpenAd2.setListener(this);
        maxAppOpenAd2.setRevenueListener(this);
        this.mAppOpenAds.put(str, maxAppOpenAd2);
        return maxAppOpenAd2;
    }

    private MaxInterstitialAd retrieveInterstitial(String str) {
        MaxInterstitialAd maxInterstitialAd = this.mInterstitials.get(str);
        if (maxInterstitialAd != null) {
            return maxInterstitialAd;
        }
        MaxInterstitialAd maxInterstitialAd2 = new MaxInterstitialAd(str, this.sdk, getCurrentActivity());
        maxInterstitialAd2.setListener(this);
        maxInterstitialAd2.setRevenueListener(this);
        this.mInterstitials.put(str, maxInterstitialAd2);
        return maxInterstitialAd2;
    }

    private MaxRewardedAd retrieveRewardedAd(String str) {
        MaxRewardedAd maxRewardedAd = this.mRewardedAds.get(str);
        if (maxRewardedAd != null) {
            return maxRewardedAd;
        }
        MaxRewardedAd maxRewardedAd2 = MaxRewardedAd.getInstance(str, this.sdk, getCurrentActivity());
        maxRewardedAd2.setListener(this);
        maxRewardedAd2.setRevenueListener(this);
        this.mRewardedAds.put(str, maxRewardedAd2);
        return maxRewardedAd2;
    }

    private void setAdViewBackgroundColor(String str, MaxAdFormat maxAdFormat, String str2) {
        d("Setting " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" to color: " + str2);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setBackgroundColor(Color.parseColor(str2));
            return;
        }
        e(maxAdFormat.getLabel() + " does not exist");
    }

    private void setAdViewExtraParameters(String str, MaxAdFormat maxAdFormat, String str2, String str3) {
        d("Setting " + maxAdFormat.getLabel() + " extra with key: \"" + str2 + "\" value: " + str3);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        maxAdViewRetrieveAdView.setExtraParameter(str2, str3);
        if ("force_banner".equalsIgnoreCase(str2) && MaxAdFormat.MREC != maxAdFormat) {
            MaxAdFormat deviceSpecificBannerAdViewAdFormat = Boolean.parseBoolean(str3) ? MaxAdFormat.BANNER : getDeviceSpecificBannerAdViewAdFormat();
            this.mAdViewAdFormats.put(str, deviceSpecificBannerAdViewAdFormat);
            positionAdView(str, deviceSpecificBannerAdViewAdFormat);
        } else if ("adaptive_banner".equalsIgnoreCase(str2)) {
            e("Setting adaptive banners via extra parameters is deprecated and will be removed in a future plugin version. Please use the AppLovinMAX.createBanner(String adUnitId, AdViewPosition position, [bool isAdaptive = true]) API to properly configure adaptive banners.");
            if (Boolean.parseBoolean(str3)) {
                this.mDisabledAdaptiveBannerAdUnitIds.remove(str);
            } else {
                this.mDisabledAdaptiveBannerAdUnitIds.add(str);
            }
            positionAdView(str, maxAdFormat);
        }
    }

    private void setAdViewPlacement(String str, MaxAdFormat maxAdFormat, String str2) {
        StringBuilder sbK = u.k("Setting placement \"", str2, "\" for ");
        sbK.append(maxAdFormat.getLabel());
        sbK.append(" with ad unit id \"");
        sbK.append(str);
        sbK.append("\"");
        d(sbK.toString());
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setPlacement(str2);
            return;
        }
        e(maxAdFormat.getLabel() + " does not exist");
    }

    private void setAdViewWidth(String str, int i10, MaxAdFormat maxAdFormat) {
        d("Setting width " + i10 + " for \"" + maxAdFormat + "\" with ad unit identifier \"" + str + "\"");
        int width = maxAdFormat.getSize().getWidth();
        if (i10 < width) {
            StringBuilder sbL = d.l("The provided width: ", i10, "dp is smaller than the minimum required width: ", width, "dp for ad format: ");
            sbL.append(maxAdFormat);
            sbL.append(". Please set the width higher than the minimum required.");
            e(sbL.toString());
        }
        this.mAdViewWidths.put(str, Integer.valueOf(i10));
        positionAdView(str, maxAdFormat);
    }

    private void setAmazonResult(Object obj, String str, MaxAdFormat maxAdFormat) {
        if (this.sdk == null) {
            logUninitializedAccessError(e.n("Failed to set Amazon result - SDK not initialized: ", str));
            return;
        }
        if (obj == null) {
            e("Failed to set Amazon result - null value");
            return;
        }
        String localExtraParameterKeyForAmazonResult = getLocalExtraParameterKeyForAmazonResult(obj);
        if (maxAdFormat == MaxAdFormat.INTERSTITIAL) {
            retrieveInterstitial(str).setLocalExtraParameter(localExtraParameterKeyForAmazonResult, obj);
            return;
        }
        if (maxAdFormat == MaxAdFormat.REWARDED) {
            retrieveRewardedAd(str).setLocalExtraParameter(localExtraParameterKeyForAmazonResult, obj);
            return;
        }
        MaxAdView appLovinMAXAdView = AppLovinMAXAdView.getInstance(str);
        if (appLovinMAXAdView == null) {
            appLovinMAXAdView = retrieveAdView(str, maxAdFormat);
        }
        if (appLovinMAXAdView != null) {
            appLovinMAXAdView.setLocalExtraParameter(localExtraParameterKeyForAmazonResult, obj);
            return;
        }
        e("Failed to set Amazon result - unable to find " + maxAdFormat);
    }

    private void showAdView(String str, MaxAdFormat maxAdFormat) {
        d("Showing " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.setVisibility(0);
            maxAdViewRetrieveAdView.startAutoRefresh();
            if (this.mDisabledAutoRefreshAdViewAdUnitIds.contains(str)) {
                return;
            }
            maxAdViewRetrieveAdView.startAutoRefresh();
            return;
        }
        e(maxAdFormat.getLabel() + " does not exist for ad unit id " + str);
        this.mAdUnitIdsToShowAfterCreate.add(str);
    }

    private void startAdViewAutoRefresh(String str, MaxAdFormat maxAdFormat) {
        d("Starting " + maxAdFormat.getLabel() + " auto refresh for ad unit identifier \"" + str + "\"");
        this.mDisabledAutoRefreshAdViewAdUnitIds.remove(str);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.startAutoRefresh();
            return;
        }
        e(maxAdFormat.getLabel() + " does not exist for ad unit identifier \"" + str + "\"");
    }

    private void stopAdViewAutoRefresh(String str, MaxAdFormat maxAdFormat) {
        d("Stopping " + maxAdFormat.getLabel() + " auto refresh for ad unit identifier \"" + str + "\"");
        this.mDisabledAutoRefreshAdViewAdUnitIds.add(str);
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView != null) {
            maxAdViewRetrieveAdView.stopAutoRefresh();
            return;
        }
        e(maxAdFormat.getLabel() + " does not exist for ad unit identifier \"" + str + "\"");
    }

    private static int toVersionCode(String str) {
        int i10 = 0;
        for (String str2 : str.split("\\.")) {
            if (str2.length() > 2) {
                w("Version number components cannot be longer than two digits -> ".concat(str));
                return i10;
            }
            i10 = (i10 * 100) + Integer.parseInt(str2);
        }
        return i10;
    }

    private void updateAdViewPosition(String str, String str2, MaxAdFormat maxAdFormat) {
        d("Updating " + maxAdFormat.getLabel() + " position to \"" + str2 + "\" for ad unit id \"" + str + "\"");
        if (retrieveAdView(str, maxAdFormat) == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        String str3 = this.mAdViewPositions.get(str);
        if (str2 == null || str2.equals(str3)) {
            return;
        }
        this.mAdViewPositions.put(str, str2);
        positionAdView(str, maxAdFormat);
    }

    public static void w(String str) {
        Log.w(SDK_TAG, "[AppLovinMAX] " + str);
    }

    public void addSegment(Integer num, List<Integer> list) {
        if (this.isPluginInitialized) {
            e("A segment must be added before calling 'AppLovinMAX.initialize(...);'");
        } else {
            this.segmentCollectionBuilder.addSegment(new MaxSegment(num.intValue(), list));
        }
    }

    public void createBanner(String str, String str2, boolean z10) {
        createAdView(str, getDeviceSpecificBannerAdViewAdFormat(), str2, z10);
    }

    public void createMRec(String str, String str2) {
        createAdView(str, MaxAdFormat.MREC, str2, false);
    }

    public void destroyBanner(String str) {
        destroyAdView(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void destroyMRec(String str) {
        destroyAdView(str, MaxAdFormat.MREC);
    }

    public void fireCallback(String str, Map<String, Object> map, p pVar) {
        pVar.a(str, map, null);
    }

    public Map<String, Object> getAdDisplayFailedInfo(MaxAd maxAd, MaxError maxError) {
        HashMap map = new HashMap(2);
        map.put("ad", getAdInfo(maxAd));
        map.put("error", getAdLoadFailedInfo(maxAd.getAdUnitId(), maxError));
        return map;
    }

    public Map<String, Object> getAdInfo(MaxAd maxAd) {
        HashMap map = new HashMap(7);
        map.put("adUnitId", maxAd.getAdUnitId());
        map.put("adFormat", maxAd.getFormat().getLabel());
        map.put("networkName", maxAd.getNetworkName());
        map.put("networkPlacement", maxAd.getNetworkPlacement());
        map.put("creativeId", AppLovinSdkUtils.isValidString(maxAd.getCreativeId()) ? maxAd.getCreativeId() : "");
        map.put("placement", AppLovinSdkUtils.isValidString(maxAd.getPlacement()) ? maxAd.getPlacement() : "");
        map.put("revenue", Double.valueOf(maxAd.getRevenue()));
        map.put("revenuePrecision", maxAd.getRevenuePrecision());
        map.put(com.ironsource.mediationsdk.d.f29337h, createAdWaterfallInfo(maxAd.getWaterfall()));
        map.put("latencyMillis", Long.valueOf(maxAd.getRequestLatencyMillis()));
        map.put("dspName", AppLovinSdkUtils.isValidString(maxAd.getDspName()) ? maxAd.getDspName() : "");
        map.put("width", Integer.valueOf(maxAd.getSize().getWidth()));
        map.put("height", Integer.valueOf(maxAd.getSize().getHeight()));
        return map;
    }

    public Map<String, Object> getAdLoadFailedInfo(String str, @Nullable MaxError maxError) {
        HashMap map = new HashMap(4);
        map.put("adUnitId", str);
        if (maxError == null) {
            map.put("code", -1);
            return map;
        }
        map.put("code", Integer.valueOf(maxError.getCode()));
        map.put("message", maxError.getMessage());
        map.put(com.ironsource.mediationsdk.d.f29337h, createAdWaterfallInfo(maxError.getWaterfall()));
        return map;
    }

    public void getAdaptiveBannerHeightForWidth(double d10, o oVar) {
        oVar.a(Double.valueOf(getDeviceSpecificBannerAdViewAdFormat().getAdaptiveSize((int) d10, this.applicationContext).getHeight()));
    }

    public MaxAdFormat getDeviceSpecificBannerAdViewAdFormat() {
        return getDeviceSpecificBannerAdViewAdFormat(this.applicationContext);
    }

    public AppLovinSdk getSdk() {
        return this.sdk;
    }

    public void getSegments(o oVar) {
        if (!this.isSdkInitialized) {
            oVar.b(TAG, "Segments cannot be retrieved before calling 'AppLovinMAX.initialize(...).'", null);
            return;
        }
        List<MaxSegment> segments = this.sdk.getSegmentCollection().getSegments();
        if (segments.isEmpty()) {
            oVar.a(null);
            return;
        }
        HashMap map = new HashMap(segments.size());
        for (MaxSegment maxSegment : segments) {
            map.put(Integer.valueOf(maxSegment.getKey()), maxSegment.getValues());
        }
        oVar.a(map);
    }

    public void hasSupportedCmp(o oVar) {
        if (this.isPluginInitialized) {
            oVar.a(Boolean.valueOf(this.sdk.getCmpService().hasSupportedCmp()));
        } else {
            logUninitializedAccessError("hasSupportedCmp", oVar);
        }
    }

    public void hasUserConsent(o oVar) {
        oVar.a(Boolean.valueOf(AppLovinPrivacySettings.hasUserConsent(this.applicationContext)));
    }

    public void hideBanner(String str) {
        hideAdView(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void hideMRec(String str) {
        hideAdView(str, MaxAdFormat.MREC);
    }

    public void isAppOpenAdReady(String str, o oVar) {
        oVar.a(Boolean.valueOf(retrieveAppOpenAd(str).isReady()));
    }

    public void isDoNotSell(o oVar) {
        oVar.a(Boolean.valueOf(AppLovinPrivacySettings.isDoNotSell(this.applicationContext)));
    }

    public void isInterstitialReady(String str, o oVar) {
        oVar.a(Boolean.valueOf(retrieveInterstitial(str).isReady()));
    }

    public void isRewardedAdReady(String str, o oVar) {
        oVar.a(Boolean.valueOf(retrieveRewardedAd(str).isReady()));
    }

    public void isTablet(o oVar) {
        oVar.a(Boolean.valueOf(AppLovinSdkUtils.isTablet(this.applicationContext)));
    }

    public void loadAppOpenAd(String str) {
        retrieveAppOpenAd(str).loadAd();
    }

    public void loadBanner(String str) {
        loadAdView(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void loadInterstitial(String str) {
        retrieveInterstitial(str).loadAd();
    }

    public void loadMRec(String str) {
        loadAdView(str, MaxAdFormat.MREC);
    }

    public void loadRewardedAd(String str) {
        retrieveRewardedAd(str).loadAd();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format) {
            str = "OnBannerAdClickedEvent";
        } else if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdClickedEvent";
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialClickedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdClickedEvent";
        } else {
            if (MaxAdFormat.APP_OPEN != format) {
                logInvalidAdFormat(format);
                return;
            }
            str = "OnAppOpenAdClickedEvent";
        }
        fireCallback(str, getAdInfo(maxAd));
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        if (format.isAdViewAd()) {
            fireCallback(MaxAdFormat.MREC == format ? "OnMRecAdCollapsedEvent" : "OnBannerAdCollapsedEvent", getAdInfo(maxAd));
        } else {
            logInvalidAdFormat(format);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, @NonNull MaxError maxError) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (format == maxAdFormat || format == MaxAdFormat.REWARDED || format == MaxAdFormat.APP_OPEN) {
            if (maxAdFormat == format) {
                str = "OnInterstitialAdFailedToDisplayEvent";
            } else {
                str = MaxAdFormat.REWARDED == format ? "OnRewardedAdFailedToDisplayEvent" : "OnAppOpenAdFailedToDisplayEvent";
            }
            fireCallback(str, getAdDisplayFailedInfo(maxAd, maxError));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (format == maxAdFormat || format == MaxAdFormat.REWARDED || format == MaxAdFormat.APP_OPEN) {
            if (maxAdFormat == format) {
                str = "OnInterstitialDisplayedEvent";
            } else {
                str = MaxAdFormat.REWARDED == format ? "OnRewardedAdDisplayedEvent" : "OnAppOpenAdDisplayedEvent";
            }
            fireCallback(str, getAdInfo(maxAd));
        }
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        if (format.isAdViewAd()) {
            fireCallback(MaxAdFormat.MREC == format ? "OnMrecAdExpandedEvent" : "OnBannerAdExpandedEvent", getAdInfo(maxAd));
        } else {
            logInvalidAdFormat(format);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (format == maxAdFormat || format == MaxAdFormat.REWARDED || format == MaxAdFormat.APP_OPEN) {
            if (maxAdFormat == format) {
                str = "OnInterstitialHiddenEvent";
            } else {
                str = MaxAdFormat.REWARDED == format ? "OnRewardedAdHiddenEvent" : "OnAppOpenAdHiddenEvent";
            }
            fireCallback(str, getAdInfo(maxAd));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            logStackTrace(new IllegalArgumentException("adUnitId cannot be null"));
            return;
        }
        if (this.mAdViews.containsKey(str)) {
            str2 = MaxAdFormat.MREC == this.mAdViewAdFormats.get(str) ? "OnMRecAdLoadFailedEvent" : "OnBannerAdLoadFailedEvent";
        } else if (this.mInterstitials.containsKey(str)) {
            str2 = "OnInterstitialLoadFailedEvent";
        } else if (this.mRewardedAds.containsKey(str)) {
            str2 = "OnRewardedAdLoadFailedEvent";
        } else {
            if (!this.mAppOpenAds.containsKey(str)) {
                logStackTrace(new IllegalStateException(e.n("invalid adUnitId: ", str)));
                return;
            }
            str2 = "OnAppOpenAdLoadFailedEvent";
        }
        fireCallback(str2, getAdLoadFailedInfo(str, maxError));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (format.isAdViewAd()) {
            str = MaxAdFormat.MREC == format ? "OnMRecAdLoadedEvent" : "OnBannerAdLoadedEvent";
            if (AppLovinSdkUtils.isValidString(this.mAdViewPositions.get(maxAd.getAdUnitId()))) {
                positionAdView(maxAd);
            }
            MaxAdView maxAdViewRetrieveAdView = retrieveAdView(maxAd.getAdUnitId(), format);
            if (maxAdViewRetrieveAdView != null && maxAdViewRetrieveAdView.getVisibility() != 0) {
                maxAdViewRetrieveAdView.stopAutoRefresh();
            }
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialLoadedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdLoadedEvent";
        } else {
            if (MaxAdFormat.APP_OPEN != format) {
                logInvalidAdFormat(format);
                return;
            }
            str = "OnAppOpenAdLoadedEvent";
        }
        fireCallback(str, getAdInfo(maxAd));
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format) {
            str = "OnBannerAdRevenuePaid";
        } else if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdRevenuePaid";
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialAdRevenuePaid";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdRevenuePaid";
        } else {
            if (MaxAdFormat.APP_OPEN != format) {
                logInvalidAdFormat(format);
                return;
            }
            str = "OnAppOpenAdRevenuePaid";
        }
        fireCallback(str, getAdInfo(maxAd));
    }

    @Override // ui.a
    public void onAttachedToActivity(@NonNull ui.b bVar) {
        instance = this;
        this.lastActivityPluginBinding = bVar;
    }

    @Override // ti.b
    public void onAttachedToEngine(@NonNull ti.a aVar) {
        String str = ALCompatibleNativeSdkVersions.get(PLUGIN_VERSION);
        String str2 = AppLovinSdk.VERSION;
        if (!isInclusiveVersion(str2, str, null)) {
            throw new RuntimeException(e.o("Incompatible native SDK version ", str2, " found for plugin 4.6.3"));
        }
        Context context = aVar.f50787a;
        l lVar = aVar.f50791e;
        xi.f fVar = aVar.f50789c;
        this.applicationContext = context;
        this.sdk = AppLovinSdk.getInstance(context);
        p pVar = new p(fVar, "applovin_max");
        this.sharedChannel = pVar;
        pVar.b(this);
        lVar.e("applovin_max/adview", new AppLovinMAXAdViewFactory(fVar));
        lVar.e("applovin_max/nativeadview", new AppLovinMAXNativeAdViewFactory(fVar));
    }

    @Override // ti.b
    public void onDetachedFromEngine(@NonNull ti.a aVar) {
        this.sharedChannel.b(null);
    }

    @Override // xi.n
    public void onMethodCall(@NonNull m mVar, @NonNull o oVar) {
        MaxAdFormat deviceSpecificBannerAdViewAdFormat;
        String str = mVar.f53822a;
        String str2 = mVar.f53822a;
        if (MobileAdsBridgeBase.initializeMethodName.equals(str)) {
            initialize((String) mVar.a("plugin_version"), (String) mVar.a(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY), oVar);
            return;
        }
        if ("isInitialized".equals(str2)) {
            isInitialized(oVar);
            return;
        }
        if ("getConfiguration".equals(str2)) {
            getConfiguration(oVar);
            return;
        }
        if ("isTablet".equals(str2)) {
            isTablet(oVar);
            return;
        }
        if ("showMediationDebugger".equals(str2)) {
            showMediationDebugger();
            oVar.a(null);
            return;
        }
        if ("setHasUserConsent".equals(str2)) {
            setHasUserConsent(((Boolean) mVar.a(X3.i.X)).booleanValue());
            oVar.a(null);
            return;
        }
        if ("hasUserConsent".equals(str2)) {
            hasUserConsent(oVar);
            return;
        }
        if ("setDoNotSell".equals(str2)) {
            setDoNotSell(((Boolean) mVar.a(X3.i.X)).booleanValue());
            oVar.a(null);
            return;
        }
        if ("isDoNotSell".equals(str2)) {
            isDoNotSell(oVar);
            return;
        }
        if ("setUserId".equals(str2)) {
            setUserId((String) mVar.a(X3.i.X));
            oVar.a(null);
            return;
        }
        if ("setMuted".equals(str2)) {
            setMuted(((Boolean) mVar.a(X3.i.X)).booleanValue());
            oVar.a(null);
            return;
        }
        if ("setVerboseLogging".equals(str2)) {
            setVerboseLogging(((Boolean) mVar.a(X3.i.X)).booleanValue());
            oVar.a(null);
            return;
        }
        if ("setCreativeDebuggerEnabled".equals(str2)) {
            setCreativeDebuggerEnabled(((Boolean) mVar.a(X3.i.X)).booleanValue());
            oVar.a(null);
            return;
        }
        if ("setTestDeviceAdvertisingIds".equals(str2)) {
            setTestDeviceAdvertisingIds((List) mVar.a(X3.i.X));
            oVar.a(null);
            return;
        }
        if ("setExtraParameter".equals(str2)) {
            setExtraParameter((String) mVar.a(X3.i.W), (String) mVar.a(X3.i.X));
            oVar.a(null);
            return;
        }
        if ("setInitializationAdUnitIds".equals(str2)) {
            setInitializationAdUnitIds((List) mVar.a(X3.i.X));
            oVar.a(null);
            return;
        }
        if ("setTermsAndPrivacyPolicyFlowEnabled".equals(str2)) {
            setTermsAndPrivacyPolicyFlowEnabled(((Boolean) mVar.a(X3.i.X)).booleanValue());
            oVar.a(null);
            return;
        }
        if ("setPrivacyPolicyUrl".equals(str2)) {
            setPrivacyPolicyUrl((String) mVar.a(X3.i.X));
            oVar.a(null);
            return;
        }
        if ("setTermsOfServiceUrl".equals(str2)) {
            setTermsOfServiceUrl((String) mVar.a(X3.i.X));
            oVar.a(null);
            return;
        }
        if ("setConsentFlowDebugUserGeography".equals(str2)) {
            setConsentFlowDebugUserGeography((String) mVar.a(X3.i.X));
            oVar.a(null);
            return;
        }
        if ("showCmpForExistingUser".equals(str2)) {
            showCmpForExistingUser(oVar);
            return;
        }
        if ("hasSupportedCmp".equals(str2)) {
            hasSupportedCmp(oVar);
            return;
        }
        if ("createBanner".equals(str2)) {
            createBanner((String) mVar.a("ad_unit_id"), (String) mVar.a(X3.i.L), ((Boolean) mVar.a("is_adaptive")).booleanValue());
            oVar.a(null);
            return;
        }
        if ("setBannerBackgroundColor".equals(str2)) {
            setBannerBackgroundColor((String) mVar.a("ad_unit_id"), (String) mVar.a("hex_color_code"));
            oVar.a(null);
            return;
        }
        if ("setBannerPlacement".equals(str2)) {
            setBannerPlacement((String) mVar.a("ad_unit_id"), (String) mVar.a("placement"));
            oVar.a(null);
            return;
        }
        if ("setBannerWidth".equals(str2)) {
            setBannerWidth((String) mVar.a("ad_unit_id"), ((Integer) mVar.a("width")).intValue());
            oVar.a(null);
            return;
        }
        if ("updateBannerPosition".equals(str2)) {
            updateBannerPosition((String) mVar.a("ad_unit_id"), (String) mVar.a(X3.i.L));
            oVar.a(null);
            return;
        }
        if ("setBannerExtraParameter".equals(str2)) {
            setBannerExtraParameter((String) mVar.a("ad_unit_id"), (String) mVar.a(X3.i.W), (String) mVar.a(X3.i.X));
            oVar.a(null);
            return;
        }
        if ("showBanner".equals(str2)) {
            showBanner((String) mVar.a("ad_unit_id"));
            oVar.a(null);
            return;
        }
        if ("hideBanner".equals(str2)) {
            hideBanner((String) mVar.a("ad_unit_id"));
            oVar.a(null);
            return;
        }
        if ("startBannerAutoRefresh".equals(str2)) {
            startBannerAutoRefresh((String) mVar.a("ad_unit_id"));
            oVar.a(null);
            return;
        }
        if ("stopBannerAutoRefresh".equals(str2)) {
            stopBannerAutoRefresh((String) mVar.a("ad_unit_id"));
            oVar.a(null);
            return;
        }
        if (X3.h.N.equals(str2)) {
            loadBanner((String) mVar.a("ad_unit_id"));
            oVar.a(null);
            return;
        }
        if (X3.h.S.equals(str2)) {
            destroyBanner((String) mVar.a("ad_unit_id"));
            oVar.a(null);
            return;
        }
        if ("getAdaptiveBannerHeightForWidth".equals(str2)) {
            getAdaptiveBannerHeightForWidth(((Double) mVar.a("width")).doubleValue(), oVar);
            return;
        }
        if ("createMRec".equals(str2)) {
            createMRec((String) mVar.a("ad_unit_id"), (String) mVar.a(X3.i.L));
            oVar.a(null);
            return;
        }
        if ("setMRecPlacement".equals(str2)) {
            setMRecPlacement((String) mVar.a("ad_unit_id"), (String) mVar.a("placement"));
            oVar.a(null);
            return;
        }
        if ("updateMRecPosition".equals(str2)) {
            updateMRecPosition((String) mVar.a("ad_unit_id"), (String) mVar.a(X3.i.L));
            oVar.a(null);
            return;
        }
        if ("setMRecExtraParameter".equals(str2)) {
            setMRecExtraParameter((String) mVar.a("ad_unit_id"), (String) mVar.a(X3.i.W), (String) mVar.a(X3.i.X));
            oVar.a(null);
            return;
        }
        if ("showMRec".equals(str2)) {
            showMRec((String) mVar.a("ad_unit_id"));
            oVar.a(null);
            return;
        }
        if ("hideMRec".equals(str2)) {
            hideMRec((String) mVar.a("ad_unit_id"));
            oVar.a(null);
            return;
        }
        if ("startMRecAutoRefresh".equals(str2)) {
            startMRecAutoRefresh((String) mVar.a("ad_unit_id"));
            oVar.a(null);
            return;
        }
        if ("stopMRecAutoRefresh".equals(str2)) {
            stopMRecAutoRefresh((String) mVar.a("ad_unit_id"));
            oVar.a(null);
            return;
        }
        if ("loadMRec".equals(str2)) {
            loadMRec((String) mVar.a("ad_unit_id"));
            oVar.a(null);
            return;
        }
        if ("destroyMRec".equals(str2)) {
            destroyMRec((String) mVar.a("ad_unit_id"));
            oVar.a(null);
            return;
        }
        if (X3.h.E.equals(str2)) {
            loadInterstitial((String) mVar.a("ad_unit_id"));
            oVar.a(null);
            return;
        }
        if ("isInterstitialReady".equals(str2)) {
            isInterstitialReady((String) mVar.a("ad_unit_id"), oVar);
            return;
        }
        if (X3.h.H.equals(str2)) {
            showInterstitial((String) mVar.a("ad_unit_id"), (String) mVar.a("placement"), (String) mVar.a("custom_data"));
            oVar.a(null);
            return;
        }
        if ("setInterstitialExtraParameter".equals(str2)) {
            setInterstitialExtraParameter((String) mVar.a("ad_unit_id"), (String) mVar.a(X3.i.W), (String) mVar.a(X3.i.X));
            oVar.a(null);
            return;
        }
        if ("loadRewardedAd".equals(str2)) {
            loadRewardedAd((String) mVar.a("ad_unit_id"));
            oVar.a(null);
            return;
        }
        if ("isRewardedAdReady".equals(str2)) {
            isRewardedAdReady((String) mVar.a("ad_unit_id"), oVar);
            return;
        }
        if ("showRewardedAd".equals(str2)) {
            showRewardedAd((String) mVar.a("ad_unit_id"), (String) mVar.a("placement"), (String) mVar.a("custom_data"));
            oVar.a(null);
            return;
        }
        if ("setRewardedAdExtraParameter".equals(str2)) {
            setRewardedAdExtraParameter((String) mVar.a("ad_unit_id"), (String) mVar.a(X3.i.W), (String) mVar.a(X3.i.X));
            oVar.a(null);
            return;
        }
        if ("loadAppOpenAd".equals(str2)) {
            loadAppOpenAd((String) mVar.a("ad_unit_id"));
            oVar.a(null);
            return;
        }
        if ("isAppOpenAdReady".equals(str2)) {
            isAppOpenAdReady((String) mVar.a("ad_unit_id"), oVar);
            return;
        }
        if ("showAppOpenAd".equals(str2)) {
            showAppOpenAd((String) mVar.a("ad_unit_id"), (String) mVar.a("placement"), (String) mVar.a("custom_data"));
            oVar.a(null);
            return;
        }
        if ("setAppOpenAdExtraParameter".equals(str2)) {
            setAppOpenAdExtraParameter((String) mVar.a("ad_unit_id"), (String) mVar.a(X3.i.W), (String) mVar.a(X3.i.X));
            oVar.a(null);
            return;
        }
        if (!"preloadWidgetAdView".equals(str2)) {
            if ("destroyWidgetAdView".equals(str2)) {
                AppLovinMAXAdView.destroyWidgetAdView(((Integer) mVar.a("ad_view_id")).intValue(), oVar);
                return;
            }
            if ("addSegment".equals(str2)) {
                addSegment((Integer) mVar.a(X3.i.W), (List) mVar.a("values"));
                oVar.a(null);
                return;
            } else if ("getSegments".equals(str2)) {
                getSegments(oVar);
                return;
            } else {
                oVar.c();
                return;
            }
        }
        String str3 = (String) mVar.a("ad_unit_id");
        String str4 = (String) mVar.a("ad_format");
        boolean zBooleanValue = ((Boolean) mVar.a("is_adaptive")).booleanValue();
        String str5 = (String) mVar.a("placement");
        String str6 = (String) mVar.a("custom_data");
        Map map = (Map) mVar.a("extra_parameters");
        Map map2 = (Map) mVar.a("local_extra_parameters");
        if (MaxAdFormat.BANNER.getLabel().equalsIgnoreCase(str4)) {
            deviceSpecificBannerAdViewAdFormat = getDeviceSpecificBannerAdViewAdFormat(this.applicationContext);
        } else {
            MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
            if (!maxAdFormat.getLabel().equalsIgnoreCase(str4)) {
                oVar.b(TAG, "Invalid ad format: " + str4, null);
                return;
            }
            deviceSpecificBannerAdViewAdFormat = maxAdFormat;
        }
        AppLovinMAXAdView.preloadWidgetAdView(str3, deviceSpecificBannerAdViewAdFormat, zBooleanValue, str5, str6, map, map2, oVar, this.applicationContext);
    }

    @Override // ui.a
    public void onReattachedToActivityForConfigChanges(@NonNull ui.b bVar) {
        instance = this;
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, @NonNull MaxReward maxReward) {
        MaxAdFormat format = maxAd.getFormat();
        if (format != MaxAdFormat.REWARDED) {
            logInvalidAdFormat(format);
            return;
        }
        String label = maxReward.getLabel();
        int amount = maxReward.getAmount();
        try {
            Map<String, Object> adInfo = getAdInfo(maxAd);
            adInfo.put("rewardLabel", label);
            adInfo.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(amount));
            fireCallback("OnRewardedAdReceivedRewardEvent", adInfo);
        } catch (Throwable unused) {
        }
    }

    public void setAmazonBannerResult(Object obj, String str) {
        setAmazonResult(obj, str, MaxAdFormat.BANNER);
    }

    public void setAmazonInterstitialResult(Object obj, String str) {
        setAmazonResult(obj, str, MaxAdFormat.INTERSTITIAL);
    }

    public void setAmazonMRecResult(Object obj, String str) {
        setAmazonResult(obj, str, MaxAdFormat.MREC);
    }

    public void setAmazonRewardedResult(Object obj, String str) {
        setAmazonResult(obj, str, MaxAdFormat.REWARDED);
    }

    public void setAppOpenAdExtraParameter(String str, String str2, String str3) {
        retrieveAppOpenAd(str).setExtraParameter(str2, str3);
    }

    public void setBannerBackgroundColor(String str, String str2) {
        setAdViewBackgroundColor(str, getDeviceSpecificBannerAdViewAdFormat(), str2);
    }

    public void setBannerExtraParameter(String str, String str2, String str3) {
        setAdViewExtraParameters(str, getDeviceSpecificBannerAdViewAdFormat(), str2, str3);
    }

    public void setBannerPlacement(String str, String str2) {
        setAdViewPlacement(str, getDeviceSpecificBannerAdViewAdFormat(), str2);
    }

    public void setBannerWidth(String str, int i10) {
        setAdViewWidth(str, i10, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void setConsentFlowDebugUserGeography(String str) {
        this.sdk.getSettings().getTermsAndPrivacyPolicyFlowSettings().setDebugUserGeography(getAppLovinConsentFlowUserGeography(str));
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        this.sdk.getSettings().setCreativeDebuggerEnabled(z10);
    }

    public void setDoNotSell(boolean z10) {
        AppLovinPrivacySettings.setDoNotSell(z10, this.applicationContext);
    }

    public void setExtraParameter(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.sdk.getSettings().setExtraParameter(str, str2);
            return;
        }
        e("ERROR: Failed to set extra parameter for null or empty key: " + str);
    }

    public void setHasUserConsent(boolean z10) {
        AppLovinPrivacySettings.setHasUserConsent(z10, this.applicationContext);
    }

    public void setInitializationAdUnitIds(List<String> list) {
        this.initializationAdUnitIdsToSet = new ArrayList(list);
    }

    public void setInterstitialExtraParameter(String str, String str2, String str3) {
        retrieveInterstitial(str).setExtraParameter(str2, str3);
    }

    public void setMRecExtraParameter(String str, String str2, String str3) {
        setAdViewExtraParameters(str, MaxAdFormat.MREC, str2, str3);
    }

    public void setMRecPlacement(String str, String str2) {
        setAdViewPlacement(str, MaxAdFormat.MREC, str2);
    }

    public void setMuted(boolean z10) {
        this.sdk.getSettings().setMuted(z10);
    }

    public void setPrivacyPolicyUrl(String str) {
        this.sdk.getSettings().getTermsAndPrivacyPolicyFlowSettings().setPrivacyPolicyUri(Uri.parse(str));
    }

    public void setRewardedAdExtraParameter(String str, String str2, String str3) {
        retrieveRewardedAd(str).setExtraParameter(str2, str3);
    }

    public void setTermsAndPrivacyPolicyFlowEnabled(boolean z10) {
        this.sdk.getSettings().getTermsAndPrivacyPolicyFlowSettings().setEnabled(z10);
    }

    public void setTermsOfServiceUrl(String str) {
        this.sdk.getSettings().getTermsAndPrivacyPolicyFlowSettings().setTermsOfServiceUri(Uri.parse(str));
    }

    public void setTestDeviceAdvertisingIds(List<String> list) {
        this.testDeviceAdvertisingIdsToSet = new ArrayList(list);
    }

    public void setUserId(String str) {
        this.sdk.getSettings().setUserIdentifier(str);
    }

    public void setVerboseLogging(boolean z10) {
        this.sdk.getSettings().setVerboseLogging(z10);
    }

    public void showAppOpenAd(String str, String str2, String str3) {
        retrieveAppOpenAd(str).showAd(str2, str3);
    }

    public void showBanner(String str) {
        showAdView(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void showCmpForExistingUser(o oVar) {
        if (this.isPluginInitialized) {
            this.sdk.getCmpService().showCmpForExistingUser(getCurrentActivity(), new a4.a(oVar, 8));
        } else {
            logUninitializedAccessError("showCmpForExistingUser", oVar);
        }
    }

    public void showInterstitial(String str, String str2, String str3) {
        retrieveInterstitial(str).showAd(str2, str3);
    }

    public void showMRec(String str) {
        showAdView(str, MaxAdFormat.MREC);
    }

    public void showMediationDebugger() {
        if (this.isSdkInitialized) {
            this.sdk.showMediationDebugger();
        } else {
            logUninitializedAccessError("showMediationDebugger");
        }
    }

    public void showRewardedAd(String str, String str2, String str3) {
        retrieveRewardedAd(str).showAd(str2, str3);
    }

    public void startBannerAutoRefresh(String str) {
        startAdViewAutoRefresh(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void startMRecAutoRefresh(String str) {
        startAdViewAutoRefresh(str, MaxAdFormat.MREC);
    }

    public void stopBannerAutoRefresh(String str) {
        stopAdViewAutoRefresh(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void stopMRecAutoRefresh(String str) {
        stopAdViewAutoRefresh(str, MaxAdFormat.MREC);
    }

    public void updateBannerPosition(String str, String str2) {
        updateAdViewPosition(str, str2, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void updateMRecPosition(String str, String str2) {
        updateAdViewPosition(str, str2, MaxAdFormat.MREC);
    }

    public static MaxAdFormat getDeviceSpecificBannerAdViewAdFormat(Context context) {
        return AppLovinSdkUtils.isTablet(context) ? MaxAdFormat.LEADER : MaxAdFormat.BANNER;
    }

    private static void logUninitializedAccessError(String str, @Nullable o oVar) {
        String strO = e.o("ERROR: Failed to execute ", str, "() - please ensure the AppLovin MAX Flutter plugin has been initialized by calling 'AppLovinMAX.initialize(...);'!");
        if (oVar == null) {
            e(strO);
        } else {
            oVar.b(TAG, strO, null);
        }
    }

    private void positionAdView(String str, MaxAdFormat maxAdFormat) {
        int iPxToDp;
        MaxAdView maxAdViewRetrieveAdView = retrieveAdView(str, maxAdFormat);
        if (maxAdViewRetrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) maxAdViewRetrieveAdView.getParent();
        if (relativeLayout == null) {
            e(maxAdFormat.getLabel() + "'s parent does not exist");
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getCurrentActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        String str2 = this.mAdViewPositions.get(str);
        AdViewSize adViewSize = getAdViewSize(maxAdFormat);
        boolean zContains = this.mDisabledAdaptiveBannerAdUnitIds.contains(str);
        if (this.mAdViewWidths.containsKey(str)) {
            iPxToDp = this.mAdViewWidths.get(str).intValue();
        } else if (TOP_CENTER.equalsIgnoreCase(str2) || BOTTOM_CENTER.equalsIgnoreCase(str2)) {
            iPxToDp = AppLovinSdkUtils.pxToDp(getCurrentActivity(), displayMetrics.widthPixels);
        } else {
            iPxToDp = adViewSize.widthDp;
        }
        int height = ((maxAdFormat == MaxAdFormat.BANNER || maxAdFormat == MaxAdFormat.LEADER) && !zContains) ? maxAdFormat.getAdaptiveSize(iPxToDp, getCurrentActivity()).getHeight() : adViewSize.heightDp;
        int iDpToPx = AppLovinSdkUtils.dpToPx(getCurrentActivity(), iPxToDp);
        int iDpToPx2 = AppLovinSdkUtils.dpToPx(getCurrentActivity(), height);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) maxAdViewRetrieveAdView.getLayoutParams();
        layoutParams.height = iDpToPx2;
        maxAdViewRetrieveAdView.setLayoutParams(layoutParams);
        maxAdViewRetrieveAdView.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        maxAdViewRetrieveAdView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i10 = 0;
        layoutParams.setMargins(0, 0, 0, 0);
        if (CENTERED.equalsIgnoreCase(str2)) {
            i10 = 17;
        } else {
            if (str2.contains(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                i10 = 48;
            } else if (str2.contains("bottom")) {
                i10 = 80;
            }
            if (str2.contains(TtmlNode.CENTER)) {
                i10 |= 1;
                if (MaxAdFormat.MREC != maxAdFormat) {
                    iDpToPx = -1;
                }
                layoutParams.width = iDpToPx;
            } else {
                layoutParams.width = iDpToPx;
                if (str2.contains("left")) {
                    i10 |= 3;
                } else if (str2.contains(TtmlNode.RIGHT)) {
                    i10 |= 5;
                }
            }
        }
        relativeLayout.setGravity(i10);
    }

    public void fireCallback(String str, MaxAd maxAd, p pVar) {
        fireCallback(str, getAdInfo(maxAd), pVar);
    }

    public MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat, String str2, boolean z10) {
        MaxAdView maxAdView = this.mAdViews.get(str);
        if (maxAdView != null || str2 == null) {
            return maxAdView;
        }
        MaxAdViewConfiguration.Builder builder = MaxAdViewConfiguration.builder();
        if (maxAdFormat.isBannerOrLeaderAd()) {
            if (z10) {
                builder.setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.ANCHORED);
            } else {
                builder.setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.NONE);
                this.mDisabledAdaptiveBannerAdUnitIds.add(str);
            }
        }
        MaxAdView maxAdView2 = new MaxAdView(str, maxAdFormat, builder.build());
        maxAdView2.setListener(this);
        maxAdView2.setRevenueListener(this);
        this.mAdViews.put(str, maxAdView2);
        this.mAdViewPositions.put(str, str2);
        maxAdView2.setExtraParameter("allow_pause_auto_refresh_immediately", com.ironsource.mediationsdk.metadata.a.f29610g);
        return maxAdView2;
    }

    public void fireCallback(String str, Map<String, Object> map) {
        fireCallback(str, map, this.sharedChannel);
    }

    @Override // ui.a
    public void onDetachedFromActivity() {
    }

    @Override // ui.a
    public void onDetachedFromActivityForConfigChanges() {
    }
}

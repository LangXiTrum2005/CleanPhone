package com.p004ironsource.adapters.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter;
import com.p004ironsource.ak;
import com.p004ironsource.bh;
import com.p004ironsource.c1;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.ii;
import com.p004ironsource.mediationsdk.AbstractAdapter;
import com.p004ironsource.mediationsdk.AdapterUtils;
import com.p004ironsource.mediationsdk.ISBannerSize;
import com.p004ironsource.mediationsdk.IntegrationData;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.IronSourceBannerLayout;
import com.p004ironsource.mediationsdk.LoadWhileShowSupportState;
import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.p;
import com.p004ironsource.mediationsdk.sdk.BannerSmashListener;
import com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.nh;
import com.p004ironsource.on;
import com.p004ironsource.pp;
import com.p004ironsource.q9;
import com.p004ironsource.qo;
import com.p004ironsource.ro;
import com.p004ironsource.sdk.IronSourceNetwork;
import com.p004ironsource.sdk.utils.SDKUtils;
import com.p004ironsource.zj;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceAdapter extends AbstractAdapter implements ContextProvider.a {
    public static final String IRONSOURCE_BIDDING_TOKEN_KEY = "token";
    public static final String IRONSOURCE_ONE_FLOW_KEY = "isOneFlow";
    private static final int IS_LOAD_EXCEPTION = 1000;
    private static final int IS_SHOW_EXCEPTION = 1001;
    private static final int RV_LOAD_EXCEPTION = 1002;
    private static final int RV_SHOW_EXCEPTION = 1003;
    private static final String VERSION = "8.10.0";
    public final String ADM_KEY;
    private final String DEMAND_SOURCE_NAME;
    private final String DYNAMIC_CONTROLLER_CONFIG;
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE;
    private final String DYNAMIC_CONTROLLER_URL;
    private final String LWS_SUPPORT_STATE;
    private final String SDK_PLUGIN_TYPE;
    private final String SESSION_ID;
    ConcurrentHashMap<String, ArrayList<zj>> mDemandSourceToBnAd;
    ConcurrentHashMap<String, zj> mDemandSourceToISAd;
    ConcurrentHashMap<String, zj> mDemandSourceToRvAd;
    private final ro mNetworkGlobalDataWriter;
    private final ii sessionDepthService;
    private static AtomicBoolean mDidInitSdk = new AtomicBoolean(false);
    private static c1 mBaseAdPlayerExtraParams = new c1();

    private IronSourceAdapter(String str) {
        super(str);
        this.DYNAMIC_CONTROLLER_URL = "controllerUrl";
        this.DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
        this.DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
        this.SESSION_ID = "sessionid";
        this.SDK_PLUGIN_TYPE = qo.a.SDK_PLUGIN_TYPE;
        this.ADM_KEY = "adm";
        this.DEMAND_SOURCE_NAME = "demandSourceName";
        this.LWS_SUPPORT_STATE = "isSupportedLWS";
        this.mNetworkGlobalDataWriter = new ro();
        this.sessionDepthService = on.U().k();
        this.mDemandSourceToRvAd = new ConcurrentHashMap<>();
        this.mDemandSourceToISAd = new ConcurrentHashMap<>();
        this.mDemandSourceToBnAd = new ConcurrentHashMap<>();
        setNativeAdAdapter(new IronSourceNativeAdAdapter(this));
        ContextProvider.getInstance().registerLifeCycleListener(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x005c A[PHI: r4
  0x005c: PHI (r4v5 int) = (r4v0 int), (r4v3 int) binds: [B:25:0x004d, B:36:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    private bh convertBannerSize(Context context, ISBannerSize iSBannerSize) {
        String description = iSBannerSize.getDescription();
        description.getClass();
        int i2 = 90;
        int i3 = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        switch (description) {
            case "RECTANGLE":
                i3 = 300;
                i2 = 250;
                return new bh(AdapterUtils.dpToPixels(context, i3), AdapterUtils.dpToPixels(context, i2), description);
            case "LARGE":
                return new bh(AdapterUtils.dpToPixels(context, i3), AdapterUtils.dpToPixels(context, i2), description);
            case "SMART":
                boolean zIsLargeScreen = AdapterUtils.isLargeScreen(context);
                if (zIsLargeScreen) {
                    i3 = 728;
                }
                if (!zIsLargeScreen) {
                    i2 = 50;
                }
                return new bh(AdapterUtils.dpToPixels(context, i3), AdapterUtils.dpToPixels(context, i2), description);
            case "BANNER":
                i2 = 50;
                return new bh(AdapterUtils.dpToPixels(context, i3), AdapterUtils.dpToPixels(context, i2), description);
            case "CUSTOM":
                int height = iSBannerSize.getHeight();
                if (height != 50 && height != 90) {
                    return null;
                }
                i2 = height;
                return new bh(AdapterUtils.dpToPixels(context, i3), AdapterUtils.dpToPixels(context, i2), description);
            default:
                return null;
        }
    }

    private zj createBannerAdInstance(String str, bh bhVar, JSONObject jSONObject, LoadAdData loadAdData, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("creating banner ad instance for " + str);
        return new ak(str, new IronSourceBannerListener(this, bannerSmashListener, str)).a(mBaseAdPlayerExtraParams.get()).a(jSONObject.optInt("instanceType", 2) == 2).c(jSONObject.optBoolean("isOneFlow")).a(bhVar).b(loadAdData.isMultipleAdObjectsFlow()).b(loadAdData.adUnitId()).a();
    }

    private zj createInterstitialAdInstance(String str, JSONObject jSONObject, LoadAdData loadAdData, InterstitialSmashListener interstitialSmashListener) {
        boolean zOptBoolean = jSONObject.optBoolean("isOneFlow");
        boolean z2 = jSONObject.optInt("instanceType", 2) == 2;
        IronLog.ADAPTER_API.verbose("creating ad instance for " + str + " isBidder=" + z2);
        return new ak(str, new IronSourceInterstitialListener(interstitialSmashListener, str)).a(mBaseAdPlayerExtraParams.get()).c(zOptBoolean).a(z2).b(loadAdData.isMultipleAdObjectsFlow()).b(loadAdData.adUnitId()).a();
    }

    private zj createRewardedVideoAdInstance(String str, boolean z2, JSONObject jSONObject, LoadAdData loadAdData, RewardedVideoSmashListener rewardedVideoSmashListener) {
        boolean zOptBoolean = jSONObject.optBoolean("isOneFlow");
        boolean z3 = jSONObject.optInt("instanceType", 2) == 2;
        IronLog.ADAPTER_API.verbose("creating ad instance for " + str + " isDemandOnly=" + z2 + " isBidder=" + z3);
        return new ak(str, new IronSourceRewardedVideoListener(rewardedVideoSmashListener, str, z2)).a(mBaseAdPlayerExtraParams.get()).c().c(zOptBoolean).b(loadAdData.isMultipleAdObjectsFlow()).a(z3).b(loadAdData.adUnitId()).a();
    }

    public static String getAdapterSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static IntegrationData getIntegrationData(Context context) {
        return new IntegrationData("IronSource", "8.10.0");
    }

    private void initInterstitialInternal(String str, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str2) {
        initSDK(str, jSONObject);
        interstitialSmashListener.onInterstitialInitSuccess();
    }

    private void initRewardedVideoInternal(String str, JSONObject jSONObject) {
        initSDK(str, jSONObject);
    }

    private boolean isMultipleAdObjectsFlow(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.optBoolean("isMultipleAdUnits", false);
    }

    private void loadBannerInternal(Activity activity, ISBannerSize iSBannerSize, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str, LoadAdData loadAdData) {
        BannerSmashListener bannerSmashListener2;
        Exception exc;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            bh bhVarConvertBannerSize = convertBannerSize(ContextProvider.getInstance().getApplicationContext(), iSBannerSize);
            if (bhVarConvertBannerSize == null) {
                try {
                    bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
                    return;
                } catch (Exception e2) {
                    exc = e2;
                    bannerSmashListener2 = bannerSmashListener;
                }
            } else {
                bannerSmashListener2 = bannerSmashListener;
                try {
                    IronSourceNetwork.loadAdView(activity, createBannerAdInstance(demandSourceName, bhVarConvertBannerSize, jSONObject, loadAdData, bannerSmashListener2), new IronSourceLoadParameters.WithLog(new IronSourceLoadParameters.Base(jSONObject, str)).value());
                    return;
                } catch (Exception e3) {
                    e = e3;
                }
            }
        } catch (Exception e4) {
            e = e4;
            bannerSmashListener2 = bannerSmashListener;
        }
        exc = e;
        StringBuilder sbO = a.o(exc, "Banner Load Fail, ");
        sbO.append(getProviderName());
        sbO.append(" - ");
        sbO.append(exc.getMessage());
        bannerSmashListener2.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(sbO.toString()));
    }

    private void loadInterstitialAdInternal(String str, String str2, JSONObject jSONObject, LoadAdData loadAdData, InterstitialSmashListener interstitialSmashListener) throws Exception {
        IronSourceLoadParameters.WithLog withLog = new IronSourceLoadParameters.WithLog(new IronSourceLoadParameters.Base(jSONObject, str2));
        zj zjVarCreateInterstitialAdInstance = this.mDemandSourceToISAd.get(str);
        if (zjVarCreateInterstitialAdInstance == null) {
            zjVarCreateInterstitialAdInstance = createInterstitialAdInstance(str, jSONObject, loadAdData, interstitialSmashListener);
            this.mDemandSourceToISAd.put(str, zjVarCreateInterstitialAdInstance);
        }
        IronSourceNetwork.loadAd(zjVarCreateInterstitialAdInstance, withLog.value());
    }

    private void loadRewardedVideoAdInternal(JSONObject jSONObject, String str, String str2, LoadAdData loadAdData, RewardedVideoSmashListener rewardedVideoSmashListener) throws Exception {
        IronSourceLoadParameters.WithLog withLog = new IronSourceLoadParameters.WithLog(new IronSourceLoadParameters.Base(jSONObject, str2));
        zj zjVarCreateRewardedVideoAdInstance = this.mDemandSourceToRvAd.get(str);
        if (zjVarCreateRewardedVideoAdInstance == null) {
            zjVarCreateRewardedVideoAdInstance = createRewardedVideoAdInstance(str, withLog.demandOnly(), jSONObject, loadAdData, rewardedVideoSmashListener);
            this.mDemandSourceToRvAd.put(str, zjVarCreateRewardedVideoAdInstance);
        }
        IronSourceNetwork.loadAd(zjVarCreateRewardedVideoAdInstance, withLog.value());
    }

    private void showAdInternal(zj zjVar, IronSource.AD_UNIT ad_unit) throws Exception {
        int iA = this.sessionDepthService.a(ad_unit);
        HashMap map = new HashMap();
        map.put("sessionDepth", String.valueOf(iA));
        IronLog.ADAPTER_API.verbose("demandSourceName=" + zjVar.g() + " showParams=" + map);
        IronSourceNetwork.showAd(ContextProvider.getInstance().getCurrentActiveActivity(), zjVar, map);
    }

    public static IronSourceAdapter startAdapter(String str) {
        return new IronSourceAdapter(str);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(JSONObject jSONObject) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose(demandSourceName + ": destroyBanner()");
        ArrayList<zj> arrayList = this.mDemandSourceToBnAd.get(demandSourceName);
        if (arrayList != null) {
            try {
                Iterator<zj> it = arrayList.iterator();
                while (it.hasNext()) {
                    IronSourceNetwork.destroyAd(it.next());
                }
                this.mDemandSourceToBnAd.remove(demandSourceName);
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.ADAPTER_API.verbose("destroyBanner failed: " + e2.getMessage());
            }
        }
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter
    public void earlyInit(String str, String str2, JSONObject jSONObject) {
        if (p.j().k() == null) {
            IronLog.ADAPTER_API.error("Appkey is null for early init");
            return;
        }
        IronSourceUtils.sendAutomationLog(getDemandSourceName(jSONObject) + ": earlyInit");
        initSDK(p.j().k(), jSONObject);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return new HashMap();
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    public String getDemandSourceName(JSONObject jSONObject) {
        return !TextUtils.isEmpty(jSONObject.optString("demandSourceName")) ? jSONObject.optString("demandSourceName") : getProviderName();
    }

    public HashMap<String, String> getInitParams() {
        HashMap<String, String> map = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            map.put(qo.a.SDK_PLUGIN_TYPE, pluginType);
        }
        if (!TextUtils.isEmpty(p.j().r())) {
            map.put("sessionid", p.j().r());
        }
        return map;
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return new HashMap();
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter
    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.optBoolean("isSupportedLWS")) ? this.mLWSSupportState : LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return new HashMap();
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "8.10.0";
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initRewardedVideoInternal(str, jSONObject);
        loadRewardedVideo(jSONObject, jSONObject2, rewardedVideoSmashListener);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        initSDK(str, jSONObject);
        bannerSmashListener.onBannerInitSuccess();
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initRewardedVideoInternal(str, jSONObject);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initRewardedVideoInternal(str, jSONObject);
        rewardedVideoSmashListener.onRewardedVideoInitSuccess();
    }

    public void initSDK(String str, JSONObject jSONObject) {
        if (mDidInitSdk.compareAndSet(false, true)) {
            String mediationUserId = IronSourceUtils.getMediationUserId();
            int iOptInt = jSONObject.optInt("debugMode", 0);
            if (isAdaptersDebugEnabled()) {
                iOptInt = 3;
            }
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("setting debug mode to " + iOptInt);
            SDKUtils.setDebugMode(iOptInt);
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            ironLog.verbose("IronSourceNetwork setting controller url to " + jSONObject.optString("controllerUrl"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("controllerConfig");
            String string = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : "";
            SDKUtils.setControllerConfig(string);
            ironLog.verbose("IronSourceNetwork setting controller config to " + string);
            HashMap<String, String> initParams = getInitParams();
            mBaseAdPlayerExtraParams.a(initParams);
            String strK = p.j().k();
            StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("with appKey=", strK, " userId=", mediationUserId, " parameters ");
            sbQ.append(initParams);
            ironLog.verbose(sbQ.toString());
            IronSourceNetwork.addInitListener(new pp() { // from class: com.ironsource.adapters.ironsource.IronSourceAdapter.1
                @Override // com.p004ironsource.pp
                public void onFail(nh nhVar) {
                    IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener fail - code:" + nhVar.a() + " message:" + nhVar.b());
                }

                @Override // com.p004ironsource.pp
                public void onSuccess() {
                    IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener success");
                }
            });
            IronSourceNetwork.initSDK(ContextProvider.getInstance().getApplicationContext(), strK, mediationUserId, initParams);
        }
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(JSONObject jSONObject) {
        zj zjVar = this.mDemandSourceToISAd.get(getDemandSourceName(jSONObject));
        return zjVar != null && IronSourceNetwork.isAdAvailableForInstance(zjVar);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        zj zjVar = this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject));
        return zjVar != null && IronSourceNetwork.isAdAvailableForInstance(zjVar);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(IronSource.AD_UNIT ad_unit) {
        return false;
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, IronSourceBannerLayout ironSourceBannerLayout, BannerSmashListener bannerSmashListener) {
        if (ironSourceBannerLayout != null) {
            loadBannerInternal(ContextProvider.getInstance().getCurrentActiveActivity(), ironSourceBannerLayout.getSize(), jSONObject, bannerSmashListener, str, new LoadAdData(jSONObject2));
            return;
        }
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner is null"));
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForDemandOnlyForBidding(JSONObject jSONObject, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, BannerSmashListener bannerSmashListener) {
        if (iSDemandOnlyBannerLayout != null) {
            loadBannerInternal(iSDemandOnlyBannerLayout.getActivity(), iSDemandOnlyBannerLayout.getSize(), jSONObject, bannerSmashListener, str, new LoadAdData());
            return;
        }
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner is null"));
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        InterstitialSmashListener interstitialSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            interstitialSmashListener2 = interstitialSmashListener;
            try {
                loadInterstitialAdInternal(demandSourceName, null, jSONObject, new LoadAdData(jSONObject2), interstitialSmashListener2);
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                q9.d().a(exc);
                IronLog.ADAPTER_API.error("exception " + exc.getMessage());
                interstitialSmashListener2.onInterstitialAdLoadFailed(new IronSourceError(1000, exc.getMessage()));
            }
        } catch (Exception e3) {
            e = e3;
            interstitialSmashListener2 = interstitialSmashListener;
        }
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, InterstitialSmashListener interstitialSmashListener) {
        InterstitialSmashListener interstitialSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            interstitialSmashListener2 = interstitialSmashListener;
            try {
                loadInterstitialAdInternal(demandSourceName, str, jSONObject, new LoadAdData(jSONObject2), interstitialSmashListener2);
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                q9.d().a(exc);
                IronLog.ADAPTER_API.error("for bidding exception " + exc.getMessage());
                interstitialSmashListener2.onInterstitialAdLoadFailed(new IronSourceError(1000, exc.getMessage()));
            }
        } catch (Exception e3) {
            e = e3;
            interstitialSmashListener2 = interstitialSmashListener;
        }
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoSmashListener rewardedVideoSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
            try {
                loadRewardedVideoAdInternal(jSONObject, demandSourceName, null, new LoadAdData(jSONObject2), rewardedVideoSmashListener2);
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                q9.d().a(exc);
                IronLog.ADAPTER_API.error("exception " + exc.getMessage());
                rewardedVideoSmashListener2.onRewardedVideoAvailabilityChanged(false);
                rewardedVideoSmashListener2.onRewardedVideoLoadFailed(new IronSourceError(1002, exc.getMessage()));
            }
        } catch (Exception e3) {
            e = e3;
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
        }
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoSmashListener rewardedVideoSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
            try {
                loadRewardedVideoAdInternal(jSONObject, demandSourceName, str, new LoadAdData(jSONObject2), rewardedVideoSmashListener2);
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                q9.d().a(exc);
                IronLog.ADAPTER_API.error("exception " + exc.getMessage());
                rewardedVideoSmashListener2.onRewardedVideoAvailabilityChanged(false);
                rewardedVideoSmashListener2.onRewardedVideoLoadFailed(new IronSourceError(1002, exc.getMessage()));
            }
        } catch (Exception e3) {
            e = e3;
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
        }
    }

    @Override // com.ironsource.environment.ContextProvider.a
    public void onPause(Activity activity) {
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onPause");
        IronSourceNetwork.onPause(activity);
    }

    @Override // com.ironsource.environment.ContextProvider.a
    public void onResume(Activity activity) {
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onResume");
        IronSourceNetwork.onResume(activity);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter
    public void setConsent(boolean z2) {
        a.y(new StringBuilder("("), z2 ? com.p004ironsource.mediationsdk.metadata.a.g : "false", ")", IronLog.ADAPTER_API);
        this.mNetworkGlobalDataWriter.a(z2);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter
    public void setMetaData(String str, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        mBaseAdPlayerExtraParams.b(str, list.get(0));
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            showAdInternal(this.mDemandSourceToISAd.get(demandSourceName), IronSource.AD_UNIT.INTERSTITIAL);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.ADAPTER_API.error("exception " + e2.getMessage());
            interstitialSmashListener.onInterstitialAdShowFailed(new IronSourceError(1001, e2.getMessage()));
        }
    }

    @Override // com.p004ironsource.mediationsdk.AbstractAdapter, com.p004ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            showAdInternal(this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject)), IronSource.AD_UNIT.REWARDED_VIDEO);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.ADAPTER_API.error("exception " + e2.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(new IronSourceError(1003, e2.getMessage()));
        }
    }
}

package com.thinkup.network.admob;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDK;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AdmobTURewardedVideoAdapter extends CustomRewardVideoAdapter {
    private static final String on = "AdmobTURewardedVideoAdapter";
    private RewardedAdLoadCallback mn;
    private String mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    RewardedInterstitialAd f42499n;
    private FullScreenContentCallback n0;
    private RewardedInterstitialAdLoadCallback nm;
    private OnUserEarnedRewardListener no;
    RewardedAd o;
    Map<String, Object> om;
    AdRequest m = null;
    private String m0 = "";
    private int mm = 1;
    boolean o0 = false;
    boolean oo = false;
    private boolean nn = false;
    private boolean o00 = false;

    /* JADX INFO: renamed from: com.thinkup.network.admob.AdmobTURewardedVideoAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ Context o;

        public AnonymousClass2(Context context) {
            this.o = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                AdmobTURewardedVideoAdapter.this.mn = new RewardedAdLoadCallback() { // from class: com.thinkup.network.admob.AdmobTURewardedVideoAdapter.2.1
                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public final void onAdFailedToLoad(LoadAdError loadAdError) {
                        AdmobTURewardedVideoAdapter admobTURewardedVideoAdapter = AdmobTURewardedVideoAdapter.this;
                        admobTURewardedVideoAdapter.o = null;
                        if (((TUBaseAdInternalAdapter) admobTURewardedVideoAdapter).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) AdmobTURewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
                        }
                    }

                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public final void onAdLoaded(RewardedAd rewardedAd) {
                        AdmobTURewardedVideoAdapter.this.o = rewardedAd;
                        ResponseInfo responseInfo = rewardedAd.getResponseInfo();
                        if (responseInfo != null) {
                            AdmobTURewardedVideoAdapter.this.om.put("response_info", responseInfo);
                        }
                        AdmobTURewardedVideoAdapter admobTURewardedVideoAdapter = AdmobTURewardedVideoAdapter.this;
                        admobTURewardedVideoAdapter.oo = true;
                        if (admobTURewardedVideoAdapter.nn) {
                            AdmobTURewardedVideoAdapter.this.o.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.thinkup.network.admob.AdmobTURewardedVideoAdapter.2.1.1
                                @Override // com.google.android.gms.ads.OnPaidEventListener
                                public final void onPaidEvent(AdValue adValue) {
                                    if (AdmobTURewardedVideoAdapter.this.o00) {
                                        return;
                                    }
                                    AdmobTURewardedVideoAdapter.on(AdmobTURewardedVideoAdapter.this);
                                    AdMobTUInitManager.getInstance();
                                    AdMobTUInitManager.o(AdmobTURewardedVideoAdapter.this.om, adValue);
                                    if (((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener != null) {
                                        ((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                                    }
                                }
                            });
                        }
                        if (((TUBaseAdInternalAdapter) AdmobTURewardedVideoAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) AdmobTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        }
                    }
                };
                Context context = this.o;
                String str = AdmobTURewardedVideoAdapter.this.m0;
                AdmobTURewardedVideoAdapter admobTURewardedVideoAdapter = AdmobTURewardedVideoAdapter.this;
                RewardedAd.load(context, str, admobTURewardedVideoAdapter.m, admobTURewardedVideoAdapter.mn);
            } catch (Throwable th) {
                if (((TUBaseAdInternalAdapter) AdmobTURewardedVideoAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) AdmobTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.admob.AdmobTURewardedVideoAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ Context o;

        public AnonymousClass3(Context context) {
            this.o = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                AdmobTURewardedVideoAdapter.this.nm = new RewardedInterstitialAdLoadCallback() { // from class: com.thinkup.network.admob.AdmobTURewardedVideoAdapter.3.1
                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public final void onAdFailedToLoad(LoadAdError loadAdError) {
                        if (((TUBaseAdInternalAdapter) AdmobTURewardedVideoAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) AdmobTURewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
                        }
                    }

                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public final void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
                        AdmobTURewardedVideoAdapter.this.f42499n = rewardedInterstitialAd;
                        ResponseInfo responseInfo = rewardedInterstitialAd.getResponseInfo();
                        if (responseInfo != null) {
                            AdmobTURewardedVideoAdapter.this.om.put("response_info", responseInfo);
                        }
                        AdmobTURewardedVideoAdapter admobTURewardedVideoAdapter = AdmobTURewardedVideoAdapter.this;
                        admobTURewardedVideoAdapter.oo = true;
                        if (admobTURewardedVideoAdapter.nn) {
                            AdmobTURewardedVideoAdapter.this.f42499n.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.thinkup.network.admob.AdmobTURewardedVideoAdapter.3.1.1
                                @Override // com.google.android.gms.ads.OnPaidEventListener
                                public final void onPaidEvent(AdValue adValue) {
                                    if (AdmobTURewardedVideoAdapter.this.o00) {
                                        return;
                                    }
                                    AdmobTURewardedVideoAdapter.on(AdmobTURewardedVideoAdapter.this);
                                    AdMobTUInitManager.getInstance();
                                    AdMobTUInitManager.o(AdmobTURewardedVideoAdapter.this.om, adValue);
                                    if (((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener != null) {
                                        ((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                                    }
                                }
                            });
                        }
                        if (((TUBaseAdInternalAdapter) AdmobTURewardedVideoAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) AdmobTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        }
                    }
                };
                Context context = this.o;
                String str = AdmobTURewardedVideoAdapter.this.m0;
                AdmobTURewardedVideoAdapter admobTURewardedVideoAdapter = AdmobTURewardedVideoAdapter.this;
                RewardedInterstitialAd.load(context, str, admobTURewardedVideoAdapter.m, admobTURewardedVideoAdapter.nm);
            } catch (Throwable th) {
                if (((TUBaseAdInternalAdapter) AdmobTURewardedVideoAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) AdmobTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    public static /* synthetic */ boolean on(AdmobTURewardedVideoAdapter admobTURewardedVideoAdapter) {
        admobTURewardedVideoAdapter.o00 = true;
        return true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        try {
            RewardedAd rewardedAd = this.o;
            if (rewardedAd != null) {
                rewardedAd.setFullScreenContentCallback(null);
                this.o = null;
            }
            this.mn = null;
            this.n0 = null;
            this.no = null;
            this.nm = null;
            this.m = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        if (map.containsKey("unit_type")) {
            this.mm = Integer.parseInt(map.get("unit_type").toString());
        }
        AdFormat adFormat = AdFormat.REWARDED;
        if (this.mm == 2) {
            adFormat = AdFormat.REWARDED_INTERSTITIAL;
        }
        AdMobTUInitManager.getInstance().o(context, map, map2, adFormat, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(3, AdmobTUInterstitialAdapter.class);
        return map;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.om;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return AdMobTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.m0;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        int i2;
        return this.oo && (((i2 = this.mm) == 1 && this.o != null) || (i2 == 2 && this.f42499n != null));
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.m0 = TUInitMediation.getStringFromMap(map, "unit_id");
        this.mo = TUInitMediation.getStringFromMap(map, "payload");
        this.nn = TUInitMediation.getIntFromMap(map, "admob_show_with_pay_info", 2) == 1;
        if (TextUtils.isEmpty(this.m0)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "unitId is empty.");
                return;
            }
            return;
        }
        if (map.containsKey("unit_type")) {
            this.mm = Integer.parseInt(map.get("unit_type").toString());
        }
        final Context applicationContext = context.getApplicationContext();
        AdMobTUInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.thinkup.network.admob.AdmobTURewardedVideoAdapter.1
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                if (((TUBaseAdInternalAdapter) AdmobTURewardedVideoAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) AdmobTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", str);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                AdmobTURewardedVideoAdapter.this.startLoadAd(applicationContext, map, map2);
            }
        });
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return AdMobTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            if (activity == null) {
                Log.e(on, "Admob: show(), activity = null");
                return;
            }
            this.oo = false;
            this.n0 = new FullScreenContentCallback() { // from class: com.thinkup.network.admob.AdmobTURewardedVideoAdapter.4
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdClicked() {
                    if (((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdDismissedFullScreenContent() {
                    try {
                        AdMobTUInitManager.getInstance().o(AdmobTURewardedVideoAdapter.this.getTrackingInfo().omm());
                    } catch (Throwable unused) {
                    }
                    if (((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdFailedToShowFullScreenContent(AdError adError) {
                    if (((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(String.valueOf(adError.getCode()), adError.getMessage());
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (AdmobTURewardedVideoAdapter.this.f42499n != null) {
                            AdMobTUInitManager.getInstance().o(AdmobTURewardedVideoAdapter.this.getTrackingInfo().omm(), AdmobTURewardedVideoAdapter.this.f42499n);
                        }
                        if (AdmobTURewardedVideoAdapter.this.o != null) {
                            AdMobTUInitManager.getInstance().o(AdmobTURewardedVideoAdapter.this.getTrackingInfo().omm(), AdmobTURewardedVideoAdapter.this.o);
                        }
                    } catch (Throwable unused) {
                    }
                    AdmobTURewardedVideoAdapter admobTURewardedVideoAdapter = AdmobTURewardedVideoAdapter.this;
                    admobTURewardedVideoAdapter.o0 = false;
                    if (admobTURewardedVideoAdapter.nn) {
                        AdmobTURewardedVideoAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.thinkup.network.admob.AdmobTURewardedVideoAdapter.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (AdmobTURewardedVideoAdapter.this.o00) {
                                    return;
                                }
                                AdmobTURewardedVideoAdapter.on(AdmobTURewardedVideoAdapter.this);
                                if (((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener != null) {
                                    ((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                                }
                            }
                        }, 500L);
                    } else if (((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                    }
                }
            };
            this.no = new OnUserEarnedRewardListener() { // from class: com.thinkup.network.admob.AdmobTURewardedVideoAdapter.5
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                    AdmobTURewardedVideoAdapter admobTURewardedVideoAdapter = AdmobTURewardedVideoAdapter.this;
                    if (!admobTURewardedVideoAdapter.o0) {
                        admobTURewardedVideoAdapter.o0 = true;
                        if (((CustomRewardVideoAdapter) admobTURewardedVideoAdapter).mImpressionListener != null) {
                            ((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                        }
                    }
                    try {
                        AdmobTURewardedVideoAdapter admobTURewardedVideoAdapter2 = AdmobTURewardedVideoAdapter.this;
                        if (admobTURewardedVideoAdapter2.om == null) {
                            admobTURewardedVideoAdapter2.om = new HashMap();
                        }
                        if (rewardItem != null) {
                            HashMap map = new HashMap();
                            map.put(AdmobTUConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_AMOUNT, Integer.valueOf(rewardItem.getAmount()));
                            map.put(AdmobTUConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_TYPE, rewardItem.getType());
                            AdmobTURewardedVideoAdapter.this.om.put(TUAdConst.REWARD_EXTRA.REWARD_INFO, map);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobTURewardedVideoAdapter.this).mImpressionListener.onReward();
                    }
                }
            };
            if (this.mm == 2) {
                this.f42499n.setFullScreenContentCallback(this.n0);
                ServerSideVerificationOptions serverSideVerificationOptionsBuild = new ServerSideVerificationOptions.Builder().setUserId(this.mUserId).setCustomData(this.mUserData).build();
                this.f42499n.setServerSideVerificationOptions(serverSideVerificationOptionsBuild);
                if (TUSDK.isNetworkLogDebug()) {
                    Log.i(on, "ServerSideVerificationOptions: userId:" + serverSideVerificationOptionsBuild.getUserId() + "||userCustomData:" + serverSideVerificationOptionsBuild.getCustomData());
                }
                this.f42499n.show(activity, this.no);
                return;
            }
            if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                this.mUserData = this.mUserData.replace(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.m0);
            }
            ServerSideVerificationOptions serverSideVerificationOptionsBuild2 = new ServerSideVerificationOptions.Builder().setUserId(this.mUserId).setCustomData(this.mUserData).build();
            this.o.setServerSideVerificationOptions(serverSideVerificationOptionsBuild2);
            if (TUSDK.isNetworkLogDebug()) {
                Log.i(on, "ServerSideVerificationOptions: userId:" + serverSideVerificationOptionsBuild2.getUserId() + "||userCustomData:" + serverSideVerificationOptionsBuild2.getCustomData());
            }
            this.o.setFullScreenContentCallback(this.n0);
            this.o.show(activity, this.no);
        }
    }

    public void startLoadAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.om = new HashMap();
        if (this.mm != 2) {
            AdRequest.Builder builderO = AdMobTUInitManager.getInstance().o(context, map, map2, AdFormat.REWARDED, !TextUtils.isEmpty(this.mo));
            if (!TextUtils.isEmpty(this.mo)) {
                builderO.setAdString(this.mo);
            }
            this.m = builderO.build();
            startLoadRewardedVideoAd(context);
            return;
        }
        AdRequest.Builder builderO2 = AdMobTUInitManager.getInstance().o(context, map, map2, AdFormat.REWARDED_INTERSTITIAL, !TextUtils.isEmpty(this.mo));
        if (!TextUtils.isEmpty(this.mo)) {
            builderO2.setAdString(this.mo);
        }
        this.m = builderO2.build();
        startLoadInterstitlalRewardAd(context);
    }

    public void startLoadInterstitlalRewardAd(Context context) {
        postOnMainThread(new AnonymousClass3(context));
    }

    public void startLoadRewardedVideoAd(Context context) {
        postOnMainThread(new AnonymousClass2(context));
    }

    private void m(Activity activity) {
        if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
            this.mUserData = this.mUserData.replace(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.m0);
        }
        ServerSideVerificationOptions serverSideVerificationOptionsBuild = new ServerSideVerificationOptions.Builder().setUserId(this.mUserId).setCustomData(this.mUserData).build();
        this.o.setServerSideVerificationOptions(serverSideVerificationOptionsBuild);
        if (TUSDK.isNetworkLogDebug()) {
            Log.i(on, "ServerSideVerificationOptions: userId:" + serverSideVerificationOptionsBuild.getUserId() + "||userCustomData:" + serverSideVerificationOptionsBuild.getCustomData());
        }
        this.o.setFullScreenContentCallback(this.n0);
        this.o.show(activity, this.no);
    }

    private void o(Activity activity) {
        this.f42499n.setFullScreenContentCallback(this.n0);
        ServerSideVerificationOptions serverSideVerificationOptionsBuild = new ServerSideVerificationOptions.Builder().setUserId(this.mUserId).setCustomData(this.mUserData).build();
        this.f42499n.setServerSideVerificationOptions(serverSideVerificationOptionsBuild);
        if (TUSDK.isNetworkLogDebug()) {
            Log.i(on, "ServerSideVerificationOptions: userId:" + serverSideVerificationOptionsBuild.getUserId() + "||userCustomData:" + serverSideVerificationOptionsBuild.getCustomData());
        }
        this.f42499n.show(activity, this.no);
    }
}

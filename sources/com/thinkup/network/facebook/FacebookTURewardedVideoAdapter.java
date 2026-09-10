package com.thinkup.network.facebook;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.RewardedInterstitialAdListener;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationBidManager;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class FacebookTURewardedVideoAdapter extends CustomRewardVideoAdapter {
    public static final String TAG = "FacebookTURewardedVideoAdapter";
    private static final int om = 2;
    private static final int oo = 1;
    String m;
    private o m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Map<String, Object> f42554n;
    String o;
    boolean o0;
    private int on = 1;

    public class o {
        private RewardedVideoAd m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private RewardedInterstitialAd f42555n;

        /* JADX INFO: renamed from: com.thinkup.network.facebook.FacebookTURewardedVideoAdapter$o$1, reason: invalid class name */
        public class AnonymousClass1 implements RewardedInterstitialAdListener {
            public AnonymousClass1() {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(Ad ad) {
                if (((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(Ad ad) {
                if (((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(Ad ad, AdError adError) {
                if (((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mLoadListener != null) {
                    TUCustomLoadListener tUCustomLoadListener = ((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mLoadListener;
                    StringBuilder sb = new StringBuilder();
                    sb.append(adError.getErrorCode());
                    tUCustomLoadListener.onAdLoadError(sb.toString(), adError.getErrorMessage());
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(Ad ad) {
                FacebookTURewardedVideoAdapter facebookTURewardedVideoAdapter = FacebookTURewardedVideoAdapter.this;
                if (facebookTURewardedVideoAdapter.o0) {
                    return;
                }
                facebookTURewardedVideoAdapter.o0 = true;
                if (((CustomRewardVideoAdapter) facebookTURewardedVideoAdapter).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }

            @Override // com.facebook.ads.RewardedInterstitialAdListener
            public final void onRewardedInterstitialClosed() {
                if (((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.facebook.ads.RewardedInterstitialAdListener
            public final void onRewardedInterstitialCompleted() {
                if (((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                }
                if (((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener.onReward();
                }
            }
        }

        /* JADX INFO: renamed from: com.thinkup.network.facebook.FacebookTURewardedVideoAdapter$o$2, reason: invalid class name */
        public class AnonymousClass2 implements S2SRewardedVideoAdListener {
            public AnonymousClass2() {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(Ad ad) {
                if (((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(Ad ad) {
                if (((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(Ad ad, AdError adError) {
                if (((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mLoadListener != null) {
                    TUCustomLoadListener tUCustomLoadListener = ((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mLoadListener;
                    StringBuilder sb = new StringBuilder();
                    sb.append(adError.getErrorCode());
                    tUCustomLoadListener.onAdLoadError(sb.toString(), adError.getErrorMessage());
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(Ad ad) {
                FacebookTURewardedVideoAdapter facebookTURewardedVideoAdapter = FacebookTURewardedVideoAdapter.this;
                if (facebookTURewardedVideoAdapter.o0) {
                    return;
                }
                facebookTURewardedVideoAdapter.o0 = true;
                if (((CustomRewardVideoAdapter) facebookTURewardedVideoAdapter).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }

            @Override // com.facebook.ads.S2SRewardedVideoAdListener
            public final void onRewardServerFailed() {
                Log.e(FacebookTURewardedVideoAdapter.TAG, "Facebook: onRewardServerFailed() ");
            }

            @Override // com.facebook.ads.S2SRewardedVideoAdListener
            public final void onRewardServerSuccess() {
                Log.e(FacebookTURewardedVideoAdapter.TAG, "Facebook: onRewardServerSuccess() ");
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoClosed() {
                if (((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoCompleted() {
                if (((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                }
                if (((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookTURewardedVideoAdapter.this).mImpressionListener.onReward();
                }
            }
        }

        private o() {
        }

        private void m(Context context) {
            this.m = new RewardedVideoAd(context.getApplicationContext(), FacebookTURewardedVideoAdapter.this.o);
            RewardedVideoAd.RewardedVideoAdLoadConfigBuilder rewardedVideoAdLoadConfigBuilderWithFailOnCacheFailureEnabled = this.m.buildLoadAdConfig().withAdListener(new AnonymousClass2()).withFailOnCacheFailureEnabled(true);
            if (!TextUtils.isEmpty(((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserData) && ((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserData.contains(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                FacebookTURewardedVideoAdapter facebookTURewardedVideoAdapter = FacebookTURewardedVideoAdapter.this;
                ((TUBaseAdInternalAdapter) facebookTURewardedVideoAdapter).mUserData = ((TUBaseAdInternalAdapter) facebookTURewardedVideoAdapter).mUserData.replace(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, FacebookTURewardedVideoAdapter.this.o);
            }
            rewardedVideoAdLoadConfigBuilderWithFailOnCacheFailureEnabled.withRewardData(new RewardData(((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserId, ((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserData));
            if (!TextUtils.isEmpty(FacebookTURewardedVideoAdapter.this.m)) {
                rewardedVideoAdLoadConfigBuilderWithFailOnCacheFailureEnabled.withBid(FacebookTURewardedVideoAdapter.this.m);
            }
            this.m.loadAd(rewardedVideoAdLoadConfigBuilderWithFailOnCacheFailureEnabled.build());
        }

        private void o(Context context) {
            this.f42555n = new RewardedInterstitialAd(context.getApplicationContext(), FacebookTURewardedVideoAdapter.this.o);
            RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder rewardedInterstitialAdLoadConfigBuilderWithFailOnCacheFailureEnabled = this.f42555n.buildLoadAdConfig().withAdListener(new AnonymousClass1()).withFailOnCacheFailureEnabled(true);
            if (!TextUtils.isEmpty(((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserData) && ((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserData.contains(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                FacebookTURewardedVideoAdapter facebookTURewardedVideoAdapter = FacebookTURewardedVideoAdapter.this;
                ((TUBaseAdInternalAdapter) facebookTURewardedVideoAdapter).mUserData = ((TUBaseAdInternalAdapter) facebookTURewardedVideoAdapter).mUserData.replace(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, FacebookTURewardedVideoAdapter.this.o);
            }
            rewardedInterstitialAdLoadConfigBuilderWithFailOnCacheFailureEnabled.withRewardData(new RewardData(((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserId, ((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserData));
            if (!TextUtils.isEmpty(FacebookTURewardedVideoAdapter.this.m)) {
                rewardedInterstitialAdLoadConfigBuilderWithFailOnCacheFailureEnabled.withBid(FacebookTURewardedVideoAdapter.this.m);
            }
            this.f42555n.loadAd(rewardedInterstitialAdLoadConfigBuilderWithFailOnCacheFailureEnabled.build());
        }

        public final void destroy() {
            RewardedVideoAd rewardedVideoAd = this.m;
            if (rewardedVideoAd != null) {
                rewardedVideoAd.destroy();
                this.m = null;
            }
            RewardedInterstitialAd rewardedInterstitialAd = this.f42555n;
            if (rewardedInterstitialAd != null) {
                rewardedInterstitialAd.destroy();
                this.f42555n = null;
            }
        }

        public final boolean isAdInvalidated() {
            RewardedInterstitialAd rewardedInterstitialAd;
            RewardedVideoAd rewardedVideoAd;
            if (FacebookTURewardedVideoAdapter.this.on == 1 && (rewardedVideoAd = this.m) != null) {
                return rewardedVideoAd.isAdInvalidated();
            }
            if (FacebookTURewardedVideoAdapter.this.on != 2 || (rewardedInterstitialAd = this.f42555n) == null) {
                return false;
            }
            return rewardedInterstitialAd.isAdInvalidated();
        }

        public final boolean isAdLoaded() {
            RewardedInterstitialAd rewardedInterstitialAd;
            RewardedVideoAd rewardedVideoAd;
            if (FacebookTURewardedVideoAdapter.this.on == 1 && (rewardedVideoAd = this.m) != null) {
                return rewardedVideoAd.isAdLoaded();
            }
            if (FacebookTURewardedVideoAdapter.this.on != 2 || (rewardedInterstitialAd = this.f42555n) == null) {
                return false;
            }
            return rewardedInterstitialAd.isAdLoaded();
        }

        public final void loadAd(Context context) {
            if (FacebookTURewardedVideoAdapter.this.on == 1) {
                this.m = new RewardedVideoAd(context.getApplicationContext(), FacebookTURewardedVideoAdapter.this.o);
                RewardedVideoAd.RewardedVideoAdLoadConfigBuilder rewardedVideoAdLoadConfigBuilderWithFailOnCacheFailureEnabled = this.m.buildLoadAdConfig().withAdListener(new AnonymousClass2()).withFailOnCacheFailureEnabled(true);
                if (!TextUtils.isEmpty(((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserData) && ((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserData.contains(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                    FacebookTURewardedVideoAdapter facebookTURewardedVideoAdapter = FacebookTURewardedVideoAdapter.this;
                    ((TUBaseAdInternalAdapter) facebookTURewardedVideoAdapter).mUserData = ((TUBaseAdInternalAdapter) facebookTURewardedVideoAdapter).mUserData.replace(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, FacebookTURewardedVideoAdapter.this.o);
                }
                rewardedVideoAdLoadConfigBuilderWithFailOnCacheFailureEnabled.withRewardData(new RewardData(((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserId, ((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserData));
                if (!TextUtils.isEmpty(FacebookTURewardedVideoAdapter.this.m)) {
                    rewardedVideoAdLoadConfigBuilderWithFailOnCacheFailureEnabled.withBid(FacebookTURewardedVideoAdapter.this.m);
                }
                this.m.loadAd(rewardedVideoAdLoadConfigBuilderWithFailOnCacheFailureEnabled.build());
                return;
            }
            this.f42555n = new RewardedInterstitialAd(context.getApplicationContext(), FacebookTURewardedVideoAdapter.this.o);
            RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder rewardedInterstitialAdLoadConfigBuilderWithFailOnCacheFailureEnabled = this.f42555n.buildLoadAdConfig().withAdListener(new AnonymousClass1()).withFailOnCacheFailureEnabled(true);
            if (!TextUtils.isEmpty(((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserData) && ((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserData.contains(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                FacebookTURewardedVideoAdapter facebookTURewardedVideoAdapter2 = FacebookTURewardedVideoAdapter.this;
                ((TUBaseAdInternalAdapter) facebookTURewardedVideoAdapter2).mUserData = ((TUBaseAdInternalAdapter) facebookTURewardedVideoAdapter2).mUserData.replace(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, FacebookTURewardedVideoAdapter.this.o);
            }
            rewardedInterstitialAdLoadConfigBuilderWithFailOnCacheFailureEnabled.withRewardData(new RewardData(((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserId, ((TUBaseAdInternalAdapter) FacebookTURewardedVideoAdapter.this).mUserData));
            if (!TextUtils.isEmpty(FacebookTURewardedVideoAdapter.this.m)) {
                rewardedInterstitialAdLoadConfigBuilderWithFailOnCacheFailureEnabled.withBid(FacebookTURewardedVideoAdapter.this.m);
            }
            this.f42555n.loadAd(rewardedInterstitialAdLoadConfigBuilderWithFailOnCacheFailureEnabled.build());
        }

        public final void show() {
            RewardedInterstitialAd rewardedInterstitialAd;
            RewardedVideoAd rewardedVideoAd;
            if (FacebookTURewardedVideoAdapter.this.on == 1 && (rewardedVideoAd = this.m) != null) {
                rewardedVideoAd.show();
            } else {
                if (FacebookTURewardedVideoAdapter.this.on != 2 || (rewardedInterstitialAd = this.f42555n) == null) {
                    return;
                }
                rewardedInterstitialAd.show();
            }
        }

        public /* synthetic */ o(FacebookTURewardedVideoAdapter facebookTURewardedVideoAdapter, byte b2) {
            this();
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        try {
            o oVar = this.m0;
            if (oVar != null) {
                oVar.destroy();
                this.m0 = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public MediationBidManager getBidManager() {
        return FacebookBidkitManager.getInstance();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        try {
            this.o = (String) map.get("unit_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FacebookTUInitManager.getInstance().o(context, map, false, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(3, FacebookTUInterstitialAdapter.class);
        return map;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public TUInitMediation getMediationInitManager() {
        return FacebookTUInitManager.getInstance();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f42554n;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return FacebookTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return FacebookTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        o oVar = this.m0;
        return (oVar == null || !oVar.isAdLoaded() || this.m0.isAdInvalidated()) ? false : true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (!map.containsKey("unit_id")) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "facebook sdkkey is empty.");
                return;
            }
            return;
        }
        this.o = (String) map.get("unit_id");
        if (map.containsKey("payload")) {
            this.m = (String) map.get("payload");
            HashMap map3 = new HashMap();
            this.f42554n = map3;
            FacebookTUInitManager.getInstance();
            map3.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookTUInitManager.o(this.m));
        }
        if (map.containsKey("unit_type")) {
            try {
                Object obj = map.get("unit_type");
                if (obj != null) {
                    this.on = Integer.parseInt(obj.toString());
                }
            } catch (Exception unused) {
            }
        }
        final Context applicationContext = context.getApplicationContext();
        FacebookTUInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.thinkup.network.facebook.FacebookTURewardedVideoAdapter.1
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                FacebookTURewardedVideoAdapter.this.runOnNetworkRequestThread(new Runnable() { // from class: com.thinkup.network.facebook.FacebookTURewardedVideoAdapter.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        FacebookTURewardedVideoAdapter.o(FacebookTURewardedVideoAdapter.this, applicationContext);
                    }
                });
            }
        });
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return false;
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        o oVar = this.m0;
        if (oVar != null) {
            oVar.show();
        }
    }

    private void o(Context context) {
        o oVar = this.m0;
        if (oVar != null) {
            oVar.destroy();
        }
        o oVar2 = new o(this, (byte) 0);
        this.m0 = oVar2;
        oVar2.loadAd(context);
    }

    public static /* synthetic */ void o(FacebookTURewardedVideoAdapter facebookTURewardedVideoAdapter, Context context) {
        o oVar = facebookTURewardedVideoAdapter.m0;
        if (oVar != null) {
            oVar.destroy();
        }
        o oVar2 = new o(facebookTURewardedVideoAdapter, (byte) 0);
        facebookTURewardedVideoAdapter.m0 = oVar2;
        oVar2.loadAd(context);
    }
}

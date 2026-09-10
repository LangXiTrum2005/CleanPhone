package com.thinkup.network.admob;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class GoogleAdTURewardedVideoAdapter extends CustomRewardVideoAdapter {
    private static final String oo = "GoogleAdTURewardedVideoAdapter";
    private FullScreenContentCallback m0;
    private OnUserEarnedRewardListener mo;
    RewardedAd o;
    private RewardedAdLoadCallback on;
    AdManagerAdRequest m = null;
    private String om = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f42509n = false;
    boolean o0 = false;
    private Map<String, Object> mm = new HashMap();

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        try {
            RewardedAd rewardedAd = this.o;
            if (rewardedAd != null) {
                rewardedAd.setFullScreenContentCallback(null);
                this.o = null;
            }
            this.on = null;
            this.m0 = null;
            this.mo = null;
            this.m = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.mm;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return AdMobTUInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.om;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        return this.o != null && this.o0;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "unit_id");
        this.om = stringFromMap;
        if (!TextUtils.isEmpty(stringFromMap)) {
            startLoadAd(context.getApplicationContext(), map, map2);
            return;
        }
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdLoadError("", "unitId is empty.");
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return AdMobTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            if (activity == null) {
                Log.e(oo, "show(), activity = null");
                return;
            }
            this.o0 = false;
            if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                this.mUserData = this.mUserData.replace(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.om);
            }
            this.o.setServerSideVerificationOptions(new ServerSideVerificationOptions.Builder().setUserId(this.mUserId).setCustomData(this.mUserData).build());
            FullScreenContentCallback fullScreenContentCallback = new FullScreenContentCallback() { // from class: com.thinkup.network.admob.GoogleAdTURewardedVideoAdapter.2
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdClicked() {
                    if (((CustomRewardVideoAdapter) GoogleAdTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdDismissedFullScreenContent() {
                    try {
                        if (GoogleAdTURewardedVideoAdapter.this.o != null) {
                            AdMobTUInitManager.getInstance().o(GoogleAdTURewardedVideoAdapter.this.getTrackingInfo().omm());
                        }
                    } catch (Throwable unused) {
                    }
                    if (((CustomRewardVideoAdapter) GoogleAdTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdFailedToShowFullScreenContent(AdError adError) {
                    if (((CustomRewardVideoAdapter) GoogleAdTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(String.valueOf(adError.getCode()), adError.getMessage());
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (GoogleAdTURewardedVideoAdapter.this.o != null) {
                            AdMobTUInitManager.getInstance().o(GoogleAdTURewardedVideoAdapter.this.getTrackingInfo().omm(), GoogleAdTURewardedVideoAdapter.this.o);
                        }
                    } catch (Throwable unused) {
                    }
                    GoogleAdTURewardedVideoAdapter googleAdTURewardedVideoAdapter = GoogleAdTURewardedVideoAdapter.this;
                    googleAdTURewardedVideoAdapter.f42509n = false;
                    if (((CustomRewardVideoAdapter) googleAdTURewardedVideoAdapter).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                    }
                }
            };
            this.m0 = fullScreenContentCallback;
            this.o.setFullScreenContentCallback(fullScreenContentCallback);
            OnUserEarnedRewardListener onUserEarnedRewardListener = new OnUserEarnedRewardListener() { // from class: com.thinkup.network.admob.GoogleAdTURewardedVideoAdapter.3
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                    GoogleAdTURewardedVideoAdapter googleAdTURewardedVideoAdapter = GoogleAdTURewardedVideoAdapter.this;
                    if (!googleAdTURewardedVideoAdapter.f42509n) {
                        googleAdTURewardedVideoAdapter.f42509n = true;
                        if (((CustomRewardVideoAdapter) googleAdTURewardedVideoAdapter).mImpressionListener != null) {
                            ((CustomRewardVideoAdapter) GoogleAdTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                        }
                    }
                    if (rewardItem != null) {
                        try {
                            if (GoogleAdTURewardedVideoAdapter.this.mm == null) {
                                GoogleAdTURewardedVideoAdapter.this.mm = new HashMap();
                            }
                            HashMap map = new HashMap();
                            map.put(GoogleAdTUConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_AMOUNT, Integer.valueOf(rewardItem.getAmount()));
                            map.put(GoogleAdTUConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_TYPE, rewardItem.getType());
                            GoogleAdTURewardedVideoAdapter.this.mm.put(TUAdConst.REWARD_EXTRA.REWARD_INFO, map);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    if (((CustomRewardVideoAdapter) GoogleAdTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdTURewardedVideoAdapter.this).mImpressionListener.onReward();
                    }
                }
            };
            this.mo = onUserEarnedRewardListener;
            this.o.show(activity, onUserEarnedRewardListener);
        }
    }

    public void startLoadAd(final Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.m = AdMobTUInitManager.getInstance().o(context, map, map2, AdFormat.REWARDED).build();
        postOnMainThread(new Runnable() { // from class: com.thinkup.network.admob.GoogleAdTURewardedVideoAdapter.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    GoogleAdTURewardedVideoAdapter.this.on = new RewardedAdLoadCallback() { // from class: com.thinkup.network.admob.GoogleAdTURewardedVideoAdapter.1.1
                        @Override // com.google.android.gms.ads.AdLoadCallback
                        public final void onAdFailedToLoad(LoadAdError loadAdError) {
                            GoogleAdTURewardedVideoAdapter googleAdTURewardedVideoAdapter = GoogleAdTURewardedVideoAdapter.this;
                            googleAdTURewardedVideoAdapter.o = null;
                            if (((TUBaseAdInternalAdapter) googleAdTURewardedVideoAdapter).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) GoogleAdTURewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
                            }
                        }

                        @Override // com.google.android.gms.ads.AdLoadCallback
                        public final void onAdLoaded(RewardedAd rewardedAd) {
                            GoogleAdTURewardedVideoAdapter.this.o = rewardedAd;
                            ResponseInfo responseInfo = rewardedAd.getResponseInfo();
                            if (responseInfo != null) {
                                GoogleAdTURewardedVideoAdapter.this.mm.put("response_info", responseInfo);
                            }
                            GoogleAdTURewardedVideoAdapter googleAdTURewardedVideoAdapter = GoogleAdTURewardedVideoAdapter.this;
                            googleAdTURewardedVideoAdapter.o0 = true;
                            if (((TUBaseAdInternalAdapter) googleAdTURewardedVideoAdapter).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) GoogleAdTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }
                    };
                    Context context2 = context;
                    String str = GoogleAdTURewardedVideoAdapter.this.om;
                    GoogleAdTURewardedVideoAdapter googleAdTURewardedVideoAdapter = GoogleAdTURewardedVideoAdapter.this;
                    RewardedAd.load(context2, str, googleAdTURewardedVideoAdapter.m, googleAdTURewardedVideoAdapter.on);
                } catch (Throwable th) {
                    if (((TUBaseAdInternalAdapter) GoogleAdTURewardedVideoAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) GoogleAdTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                    }
                }
            }
        });
    }
}

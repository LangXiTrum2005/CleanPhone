package com.thinkup.network.pangle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class PangleTURewardedVideoAdapter extends CustomRewardVideoAdapter {
    boolean m;
    private String m0;
    private PAGRewardedAd om;
    private Map<String, Object> on;
    private final String oo = getClass().getSimpleName();
    String o = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    PAGRewardedAdLoadListener f42618n = new PAGRewardedAdLoadListener() { // from class: com.thinkup.network.pangle.PangleTURewardedVideoAdapter.1
        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
        public final void onError(int i2, String str) {
            if (((TUBaseAdInternalAdapter) PangleTURewardedVideoAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) PangleTURewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(i2), str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public final void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            PangleTURewardedVideoAdapter.this.om = pAGRewardedAd;
            try {
                Map<String, Object> mediaExtraInfo = PangleTURewardedVideoAdapter.this.om.getMediaExtraInfo();
                if (mediaExtraInfo != null) {
                    if (PangleTURewardedVideoAdapter.this.on == null) {
                        PangleTURewardedVideoAdapter.this.on = new HashMap(3);
                    }
                    PangleTURewardedVideoAdapter.this.on.putAll(mediaExtraInfo);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (((TUBaseAdInternalAdapter) PangleTURewardedVideoAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) PangleTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    };
    PAGRewardedAdInteractionListener o0 = new PAGRewardedAdInteractionListener() { // from class: com.thinkup.network.pangle.PangleTURewardedVideoAdapter.2
        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdClicked() {
            if (((CustomRewardVideoAdapter) PangleTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) PangleTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdDismissed() {
            if (((CustomRewardVideoAdapter) PangleTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) PangleTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdShowed() {
            try {
                PangleTUInitManager.getInstance().o(PangleTURewardedVideoAdapter.this.getTrackingInfo().omm(), new WeakReference(PangleTURewardedVideoAdapter.this.om));
            } catch (Throwable unused) {
            }
            if (((CustomRewardVideoAdapter) PangleTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) PangleTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public final void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
            Log.i(PangleTURewardedVideoAdapter.this.oo, "onUserEarnedReward()");
            PangleTURewardedVideoAdapter pangleTURewardedVideoAdapter = PangleTURewardedVideoAdapter.this;
            if (pangleTURewardedVideoAdapter.m) {
                return;
            }
            pangleTURewardedVideoAdapter.m = true;
            if (((CustomRewardVideoAdapter) pangleTURewardedVideoAdapter).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) PangleTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
            }
            if (pAGRewardItem != null) {
                try {
                    if (PangleTURewardedVideoAdapter.this.on == null) {
                        PangleTURewardedVideoAdapter.this.on = new HashMap();
                    }
                    HashMap map = new HashMap();
                    map.put(PangleTUConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_AMOUNT, Integer.valueOf(pAGRewardItem.getRewardAmount()));
                    map.put(PangleTUConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_NAME, pAGRewardItem.getRewardName());
                    PangleTURewardedVideoAdapter.this.on.put(TUAdConst.REWARD_EXTRA.REWARD_INFO, map);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (((CustomRewardVideoAdapter) PangleTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) PangleTURewardedVideoAdapter.this).mImpressionListener.onReward();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public final void onUserEarnedRewardFail(int i2, String str) {
            Log.i(PangleTURewardedVideoAdapter.this.oo, "onUserEarnedRewardFail(), " + i2 + ", " + str);
        }
    };

    /* JADX INFO: renamed from: com.thinkup.network.pangle.PangleTURewardedVideoAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ Map o;

        public AnonymousClass3(Map map) {
            this.o = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!TextUtils.isEmpty(((TUBaseAdInternalAdapter) PangleTURewardedVideoAdapter.this).mUserData) && ((TUBaseAdInternalAdapter) PangleTURewardedVideoAdapter.this).mUserData.contains(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                PangleTURewardedVideoAdapter pangleTURewardedVideoAdapter = PangleTURewardedVideoAdapter.this;
                ((TUBaseAdInternalAdapter) pangleTURewardedVideoAdapter).mUserData = ((TUBaseAdInternalAdapter) pangleTURewardedVideoAdapter).mUserData.replace(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, PangleTURewardedVideoAdapter.this.o);
            }
            PAGRewardedRequest pAGRewardedRequest = new PAGRewardedRequest();
            if (!TextUtils.isEmpty(PangleTURewardedVideoAdapter.this.m0)) {
                pAGRewardedRequest.setAdString(PangleTURewardedVideoAdapter.this.m0);
            }
            HashMap map = new HashMap();
            map.put("user_id", ((TUBaseAdInternalAdapter) PangleTURewardedVideoAdapter.this).mUserId);
            map.put("media_extra", ((TUBaseAdInternalAdapter) PangleTURewardedVideoAdapter.this).mUserData);
            pAGRewardedRequest.setExtraInfo(map);
            PangleTUInitManager.setPangleUserData(this.o);
            PangleTURewardedVideoAdapter pangleTURewardedVideoAdapter2 = PangleTURewardedVideoAdapter.this;
            PAGRewardedAd.loadAd(pangleTURewardedVideoAdapter2.o, pAGRewardedRequest, pangleTURewardedVideoAdapter2.f42618n);
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        PAGRewardedAd pAGRewardedAd = this.om;
        if (pAGRewardedAd != null) {
            pAGRewardedAd.setAdInteractionListener(null);
            this.om = null;
        }
        this.f42618n = null;
        this.o0 = null;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        this.o = TUInitMediation.getStringFromMap(map, "slot_id");
        PangleTUInitManager.getInstance().o(context, map, map2, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(3, PangleTUInterstitialAdapter.class);
        return map;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public TUInitMediation getMediationInitManager() {
        return PangleTUInitManager.getInstance();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.on;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return PangleTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return PangleTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        return this.om != null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        this.o = TUInitMediation.getStringFromMap(map, "slot_id");
        if (!TextUtils.isEmpty(stringFromMap) && !TextUtils.isEmpty(this.o)) {
            this.m0 = TUInitMediation.getStringFromMap(map, "payload");
            PangleTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.pangle.PangleTURewardedVideoAdapter.4
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) PangleTURewardedVideoAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) PangleTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    try {
                        PangleTURewardedVideoAdapter.m(PangleTURewardedVideoAdapter.this, map);
                    } catch (Throwable th) {
                        if (((TUBaseAdInternalAdapter) PangleTURewardedVideoAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) PangleTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                        }
                    }
                }
            });
        } else {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "app_id or slot_id is empty!");
            }
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return PangleTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        PAGRewardedAd pAGRewardedAd;
        if (activity == null || (pAGRewardedAd = this.om) == null) {
            return;
        }
        pAGRewardedAd.setAdInteractionListener(this.o0);
        this.om.show(activity);
    }

    public static /* synthetic */ void m(PangleTURewardedVideoAdapter pangleTURewardedVideoAdapter, Map map) {
        pangleTURewardedVideoAdapter.postOnMainThread(pangleTURewardedVideoAdapter.new AnonymousClass3(map));
    }

    private void o(Map<String, Object> map) {
        postOnMainThread(new AnonymousClass3(map));
    }

    private static int o(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }
}

package com.thinkup.network.gtm;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDKGlobalSetting;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class GTMTURewardedVideoAdapter extends CustomRewardVideoAdapter implements RewardVideoListener {
    MBBidRewardVideoHandler m;
    MBRewardVideoHandler o;
    String om;
    Map<String, Object> on;
    String oo;
    private final String m0 = "GTMTURewardedVideoAdapter";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42571n = "";
    String o0 = "";

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        if (this.m != null) {
            GTMTUHandlerManager.getInstance().removeAdapter(this.o0, this);
            this.m = null;
        }
        if (this.o != null) {
            GTMTUHandlerManager.getInstance().removeAdapter(this.o0, this);
            this.o = null;
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        this.o0 = GTMTUInitManager.getStringByMap(map, "unitid");
        GTMTUInitManager.getInstance().o(context, map, map2, 1, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(3, GTMTUInterstitialAdapter.class);
        return map;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public TUInitMediation getMediationInitManager() {
        return GTMTUInitManager.getInstance();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.on;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return GTMTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o0;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return GTMTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map == null || !map.containsKey("appid") || !map.containsKey("appkey") || !map.containsKey("unitid")) {
            return false;
        }
        this.o0 = map.get("unitid").toString();
        if (map.containsKey("placement_id")) {
            this.f42571n = map.get("placement_id").toString();
        }
        o(context);
        return true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        MBRewardVideoHandler mBRewardVideoHandler = this.o;
        if (mBRewardVideoHandler != null) {
            return mBRewardVideoHandler.isReady();
        }
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.m;
        if (mBBidRewardVideoHandler != null) {
            return mBBidRewardVideoHandler.isBidReady();
        }
        return false;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, Map<String, Object> map2) {
        String str = (String) map.get("appid");
        String str2 = (String) map.get("appkey");
        this.o0 = (String) map.get("unitid");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(this.o0)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "gtm appid, appkey or unitid is empty!");
                return;
            }
            return;
        }
        if (map.containsKey("payload")) {
            this.oo = map.get("payload").toString();
        }
        if (map.containsKey("placement_id")) {
            this.f42571n = map.get("placement_id").toString();
        }
        if (map.containsKey("video_muted")) {
            this.om = map.get("video_muted").toString();
        }
        Boolean bool = TUSDKGlobalSetting.isGlobalMute;
        if (bool != null) {
            if (bool.booleanValue()) {
                this.om = "0";
            } else {
                this.om = "1";
            }
        }
        GTMTUInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.thinkup.network.gtm.GTMTURewardedVideoAdapter.1
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str3) {
                if (((TUBaseAdInternalAdapter) GTMTURewardedVideoAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) GTMTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", str3);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                GTMTURewardedVideoAdapter.this.o(context);
                GTMTURewardedVideoAdapter.this.startLoad(map);
            }
        });
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        if (this.mImpressionListener != null) {
            if (rewardInfo.isCompleteView()) {
                try {
                    HashMap map = new HashMap();
                    map.put(GTMTUConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_AMOUNT, rewardInfo.getRewardAmount());
                    map.put(GTMTUConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_NAME, rewardInfo.getRewardName());
                    map.put(GTMTUConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_ALERT_STATUS, Integer.valueOf(rewardInfo.getRewardAlertStatus()));
                    this.on.put(TUAdConst.REWARD_EXTRA.REWARD_INFO, map);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                this.mImpressionListener.onReward();
            }
            this.mImpressionListener.onRewardedVideoAdClosed();
        }
        try {
            GTMTUInitManager.getInstance().o(getTrackingInfo().mon());
        } catch (Exception unused) {
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdShow(MBridgeIds mBridgeIds) {
        try {
            if (this.o != null) {
                GTMTUInitManager.getInstance().o(getTrackingInfo().omm(), new WeakReference(this.o));
            }
            if (this.m != null) {
                GTMTUInitManager.getInstance().o(getTrackingInfo().omm(), new WeakReference(this.m));
            }
        } catch (Throwable unused) {
        }
        CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
        if (customRewardedVideoEventListener != null) {
            customRewardedVideoEventListener.onRewardedVideoAdPlayStart();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onLoadSuccess(MBridgeIds mBridgeIds) {
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdDataLoaded();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("campaing is show progressing")) {
                if (this.o != null) {
                    GTMTUHandlerManager.getInstance().removeMBRewardVideoHandler(this.o0);
                }
                if (this.m != null) {
                    GTMTUHandlerManager.getInstance().removeMBBidRewardVideoHandler(this.o0);
                }
            }
        } catch (Throwable unused) {
        }
        CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
        if (customRewardedVideoEventListener != null) {
            customRewardedVideoEventListener.onRewardedVideoAdPlayFailed("", str);
        }
        try {
            GTMTUInitManager.getInstance().o(getTrackingInfo().mon());
        } catch (Exception unused2) {
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoAdClicked(MBridgeIds mBridgeIds) {
        CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
        if (customRewardedVideoEventListener != null) {
            customRewardedVideoEventListener.onRewardedVideoAdPlayClicked();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoComplete(MBridgeIds mBridgeIds) {
        CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
        if (customRewardedVideoEventListener != null) {
            customRewardedVideoEventListener.onRewardedVideoAdPlayEnd();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdLoadError("", str);
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        try {
            if (this.o != null) {
                GTMTUInitManager.getInstance().o(getTrackingInfo().mon(), this.o);
            }
            if (this.m != null) {
                GTMTUInitManager.getInstance().o(getTrackingInfo().mon(), this.m);
            }
        } catch (Throwable unused) {
        }
        if (this.on == null) {
            this.on = new HashMap(3);
        }
        MBRewardVideoHandler mBRewardVideoHandler = this.o;
        if (mBRewardVideoHandler != null) {
            this.on.put("request_id", mBRewardVideoHandler.getRequestId());
        }
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.m;
        if (mBBidRewardVideoHandler != null) {
            this.on.put("request_id", mBBidRewardVideoHandler.getRequestId());
        }
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdCacheLoaded(new BaseAd[0]);
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return GTMTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        if (this.o != null) {
            GTMTUHandlerManager.getInstance().setShowAdapter(this.o0, this);
            if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                this.mUserData = this.mUserData.replace(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.o0);
            }
            this.o.show(this.mUserId, this.mUserData);
        }
        if (this.m != null) {
            GTMTUHandlerManager.getInstance().setShowAdapter(this.o0, this);
            if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                this.mUserData = this.mUserData.replace(TUAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.o0);
            }
            this.m.showFromBid(this.mUserId, this.mUserData);
        }
    }

    public void startLoad(Map<String, Object> map) {
        if (this.o != null) {
            GTMTUInitManager.getInstance().setCustomInfo(8, map);
            GTMTUHandlerManager.getInstance().addLoadAdapter(this.o0, this);
            this.o.load();
        }
        if (this.m != null) {
            GTMTUInitManager.getInstance().setCustomInfo(7, map);
            GTMTUHandlerManager.getInstance().addLoadAdapter(this.o0, this);
            this.m.loadFromBid(this.oo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Context context) {
        GTMTUHandlerManager.InitParams initParams = new GTMTUHandlerManager.InitParams();
        initParams.o = context.getApplicationContext();
        initParams.m = this.f42571n;
        initParams.f42564n = this.o0;
        if (TextUtils.isEmpty(this.oo)) {
            this.o = GTMTUHandlerManager.getInstance().getMBRewardVideoHandler(initParams);
            if (TextUtils.isEmpty(this.om)) {
                return;
            }
            String str = this.om;
            str.getClass();
            if (!str.equals("0")) {
                if (str.equals("1")) {
                    this.o.playVideoMute(2);
                    return;
                }
                return;
            }
            this.o.playVideoMute(1);
            return;
        }
        this.m = GTMTUHandlerManager.getInstance().getMBBidRewardVideoHandler(initParams);
        if (TextUtils.isEmpty(this.om)) {
            return;
        }
        String str2 = this.om;
        str2.getClass();
        if (!str2.equals("0")) {
            if (str2.equals("1")) {
                this.m.playVideoMute(2);
                return;
            }
            return;
        }
        this.m.playVideoMute(1);
    }
}

package com.thinkup.network.gtm;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newinterstitial.out.MBBidInterstitialVideoHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.InterstitialListener;
import com.mbridge.msdk.out.MBInterstitialHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.RewardInfo;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDKGlobalSetting;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class GTMTUInterstitialAdapter extends CustomInterstitialAdapter implements NewInterstitialListener {
    MBNewInterstitialHandler m;
    String m0;
    String mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    MBBidInterstitialVideoHandler f42568n;
    MBInterstitialHandler o;
    boolean om;
    boolean on;
    private final String mn = "GTMTUInterstitialAdapter";
    String o0 = "";
    String oo = "";
    NewInterstitialListener mm = new NewInterstitialListener() { // from class: com.thinkup.network.gtm.GTMTUInterstitialAdapter.1
        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onAdClicked(MBridgeIds mBridgeIds) {
            if (((CustomInterstitialAdapter) GTMTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) GTMTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            if (((CustomInterstitialAdapter) GTMTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) GTMTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onAdShow(MBridgeIds mBridgeIds) {
            try {
                if (GTMTUInterstitialAdapter.this.m != null) {
                    GTMTUInitManager.getInstance().o(GTMTUInterstitialAdapter.this.getTrackingInfo().omm(), new WeakReference(GTMTUInterstitialAdapter.this.m));
                }
                if (GTMTUInterstitialAdapter.this.f42568n != null) {
                    GTMTUInitManager.getInstance().o(GTMTUInterstitialAdapter.this.getTrackingInfo().omm(), new WeakReference(GTMTUInterstitialAdapter.this.f42568n));
                }
            } catch (Throwable unused) {
            }
            if (((CustomInterstitialAdapter) GTMTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) GTMTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onEndcardShow(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
            if (((TUBaseAdInternalAdapter) GTMTUInterstitialAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GTMTUInterstitialAdapter.this).mLoadListener.onAdDataLoaded();
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onResourceLoadFail(MBridgeIds mBridgeIds, String str) {
            if (((TUBaseAdInternalAdapter) GTMTUInterstitialAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GTMTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", str);
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
            if (((TUBaseAdInternalAdapter) GTMTUInterstitialAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GTMTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onShowFail(MBridgeIds mBridgeIds, String str) {
            if (((CustomInterstitialAdapter) GTMTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) GTMTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError("", str);
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onVideoComplete(MBridgeIds mBridgeIds) {
            if (((CustomInterstitialAdapter) GTMTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) GTMTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoEnd();
            }
        }
    };

    /* JADX INFO: renamed from: com.thinkup.network.gtm.GTMTUInterstitialAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements InterstitialListener {
        public AnonymousClass3() {
        }

        @Override // com.mbridge.msdk.out.InterstitialListener
        public final void onInterstitialAdClick(MBridgeIds mBridgeIds) {
            if (((CustomInterstitialAdapter) GTMTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) GTMTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
            }
        }

        @Override // com.mbridge.msdk.out.InterstitialListener
        public final void onInterstitialClosed(MBridgeIds mBridgeIds) {
            if (((CustomInterstitialAdapter) GTMTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) GTMTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
            }
        }

        @Override // com.mbridge.msdk.out.InterstitialListener
        public final void onInterstitialLoadFail(MBridgeIds mBridgeIds, String str) {
            if (((TUBaseAdInternalAdapter) GTMTUInterstitialAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GTMTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", str);
            }
        }

        @Override // com.mbridge.msdk.out.InterstitialListener
        public final void onInterstitialLoadSuccess(MBridgeIds mBridgeIds) {
            GTMTUInterstitialAdapter gTMTUInterstitialAdapter = GTMTUInterstitialAdapter.this;
            gTMTUInterstitialAdapter.on = true;
            if (((TUBaseAdInternalAdapter) gTMTUInterstitialAdapter).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GTMTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.mbridge.msdk.out.InterstitialListener
        public final void onInterstitialShowFail(MBridgeIds mBridgeIds, String str) {
            Log.e(GTMTUInterstitialAdapter.this.mn, "onInterstitialShowFail".concat(String.valueOf(str)));
            GTMTUInterstitialAdapter.omm(GTMTUInterstitialAdapter.this);
        }

        @Override // com.mbridge.msdk.out.InterstitialListener
        public final void onInterstitialShowSuccess(MBridgeIds mBridgeIds) {
            try {
                if (GTMTUInterstitialAdapter.this.o != null) {
                    GTMTUInitManager.getInstance().o(GTMTUInterstitialAdapter.this.getTrackingInfo().omm(), new WeakReference(GTMTUInterstitialAdapter.this.o));
                }
            } catch (Throwable unused) {
            }
            GTMTUInterstitialAdapter gTMTUInterstitialAdapter = GTMTUInterstitialAdapter.this;
            gTMTUInterstitialAdapter.on = false;
            if (((CustomInterstitialAdapter) gTMTUInterstitialAdapter).mImpressListener != null) {
                ((CustomInterstitialAdapter) GTMTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
            }
        }
    }

    public static /* synthetic */ int omm(GTMTUInterstitialAdapter gTMTUInterstitialAdapter) {
        gTMTUInterstitialAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        MBInterstitialHandler mBInterstitialHandler = this.o;
        if (mBInterstitialHandler != null) {
            mBInterstitialHandler.setInterstitialListener(null);
            this.o = null;
        }
        if (this.m != null) {
            GTMTUHandlerManager.getInstance().removeAdapter(this.oo, this);
        }
        if (this.f42568n != null) {
            GTMTUHandlerManager.getInstance().removeAdapter(this.oo, this);
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        this.oo = GTMTUInitManager.getStringByMap(map, "unitid");
        GTMTUInitManager.getInstance().o(context, map, map2, 3, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public TUInitMediation getMediationInitManager() {
        return GTMTUInitManager.getInstance();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return GTMTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.oo;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return GTMTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        MBNewInterstitialHandler mBNewInterstitialHandler = this.m;
        if (mBNewInterstitialHandler != null) {
            return mBNewInterstitialHandler.isReady();
        }
        MBBidInterstitialVideoHandler mBBidInterstitialVideoHandler = this.f42568n;
        return mBBidInterstitialVideoHandler != null ? mBBidInterstitialVideoHandler.isBidReady() : this.on;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, Map<String, Object> map2) {
        this.on = false;
        this.om = false;
        String str = (String) map.get("appid");
        String str2 = (String) map.get("appkey");
        this.oo = (String) map.get("unitid");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(this.oo)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "gtm appid, appkey or unitid is empty!");
                return;
            }
            return;
        }
        if (map.containsKey("is_video")) {
            this.om = !map.get("is_video").toString().equals("0");
        }
        if (map.containsKey("payload")) {
            this.m0 = map.get("payload").toString();
        }
        if (map.containsKey("placement_id")) {
            this.o0 = map.get("placement_id").toString();
        }
        if (map.containsKey("video_muted")) {
            this.mo = map.get("video_muted").toString();
        }
        Boolean bool = TUSDKGlobalSetting.isGlobalMute;
        if (bool != null) {
            if (bool.booleanValue()) {
                this.mo = "0";
            } else {
                this.mo = "1";
            }
        }
        GTMTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.gtm.GTMTUInterstitialAdapter.2
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str3) {
                if (((TUBaseAdInternalAdapter) GTMTUInterstitialAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) GTMTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", str3);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                GTMTUInterstitialAdapter.o(GTMTUInterstitialAdapter.this, context);
                GTMTUInterstitialAdapter.this.startLoad(map);
            }
        });
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdClicked(MBridgeIds mBridgeIds) {
        CustomInterstitialEventListener customInterstitialEventListener = this.mImpressListener;
        if (customInterstitialEventListener != null) {
            customInterstitialEventListener.onInterstitialAdClicked();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        CustomInterstitialEventListener customInterstitialEventListener = this.mImpressListener;
        if (customInterstitialEventListener != null) {
            customInterstitialEventListener.onInterstitialAdClose();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdShow(MBridgeIds mBridgeIds) {
        try {
            if (this.m != null) {
                GTMTUInitManager.getInstance().o(getTrackingInfo().omm(), new WeakReference(this.m));
            }
            if (this.f42568n != null) {
                GTMTUInitManager.getInstance().o(getTrackingInfo().omm(), new WeakReference(this.f42568n));
            }
        } catch (Throwable unused) {
        }
        CustomInterstitialEventListener customInterstitialEventListener = this.mImpressListener;
        if (customInterstitialEventListener != null) {
            customInterstitialEventListener.onInterstitialAdShow();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdDataLoaded();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onResourceLoadFail(MBridgeIds mBridgeIds, String str) {
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdLoadError("", str);
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdCacheLoaded(new BaseAd[0]);
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("campaing is show progressing")) {
                if (this.m != null) {
                    GTMTUHandlerManager.getInstance().removeMBNewInterstitialHandler(this.oo);
                }
                if (this.f42568n != null) {
                    GTMTUHandlerManager.getInstance().removeMBBidInterstitialVideoHandler(this.oo);
                }
            }
        } catch (Throwable unused) {
        }
        CustomInterstitialEventListener customInterstitialEventListener = this.mImpressListener;
        if (customInterstitialEventListener != null) {
            customInterstitialEventListener.onInterstitialAdVideoError("", str);
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onVideoComplete(MBridgeIds mBridgeIds) {
        CustomInterstitialEventListener customInterstitialEventListener = this.mImpressListener;
        if (customInterstitialEventListener != null) {
            customInterstitialEventListener.onInterstitialAdVideoEnd();
        }
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        MBInterstitialHandler mBInterstitialHandler = this.o;
        if (mBInterstitialHandler != null) {
            mBInterstitialHandler.show();
        }
        if (this.m != null) {
            GTMTUHandlerManager.getInstance().setShowAdapter(this.oo, this);
            MBridgeSDKFactory.getMBridgeSDK().updateDialogWeakActivity(new WeakReference<>(activity));
            this.m.show();
        }
        if (this.f42568n != null) {
            GTMTUHandlerManager.getInstance().setShowAdapter(this.oo, this);
            MBridgeSDKFactory.getMBridgeSDK().updateDialogWeakActivity(new WeakReference<>(activity));
            this.f42568n.showFromBid();
        }
    }

    public void startLoad(Map<String, Object> map) {
        if (this.o != null) {
            GTMTUInitManager.getInstance().setCustomInfo(8, map);
            this.o.preload();
        }
        if (this.m != null) {
            GTMTUInitManager.getInstance().setCustomInfo(8, map);
            if (!TextUtils.isEmpty(this.mo)) {
                String str = this.mo;
                str.getClass();
                if (str.equals("0")) {
                    this.m.playVideoMute(1);
                } else if (str.equals("1")) {
                    this.m.playVideoMute(2);
                }
            }
            GTMTUHandlerManager.getInstance().addLoadAdapter(this.oo, this);
            this.m.load();
        }
        if (this.f42568n != null) {
            GTMTUInitManager.getInstance().setCustomInfo(7, map);
            if (!TextUtils.isEmpty(this.mo)) {
                String str2 = this.mo;
                str2.getClass();
                if (str2.equals("0")) {
                    this.f42568n.playVideoMute(1);
                } else if (str2.equals("1")) {
                    this.f42568n.playVideoMute(2);
                }
            }
            GTMTUHandlerManager.getInstance().addLoadAdapter(this.oo, this);
            this.f42568n.loadFromBid(this.m0);
        }
    }

    private void o(Context context) {
        if (!this.om) {
            HashMap map = new HashMap();
            map.put("unit_id", this.oo);
            map.put(MBridgeConstans.PLACEMENT_ID, this.o0);
            MBInterstitialHandler mBInterstitialHandler = new MBInterstitialHandler(context.getApplicationContext(), map);
            this.o = mBInterstitialHandler;
            mBInterstitialHandler.setInterstitialListener(new AnonymousClass3());
            return;
        }
        GTMTUHandlerManager.InitParams initParams = new GTMTUHandlerManager.InitParams();
        initParams.o = context.getApplicationContext();
        initParams.m = this.o0;
        initParams.f42564n = this.oo;
        if (TextUtils.isEmpty(this.m0)) {
            this.m = GTMTUHandlerManager.getInstance().getMBNewInterstitialHandler(initParams);
        } else {
            this.f42568n = GTMTUHandlerManager.getInstance().getMBBidInterstitialVideoHandler(initParams);
        }
    }

    public static /* synthetic */ void o(GTMTUInterstitialAdapter gTMTUInterstitialAdapter, Context context) {
        if (gTMTUInterstitialAdapter.om) {
            GTMTUHandlerManager.InitParams initParams = new GTMTUHandlerManager.InitParams();
            initParams.o = context.getApplicationContext();
            initParams.m = gTMTUInterstitialAdapter.o0;
            initParams.f42564n = gTMTUInterstitialAdapter.oo;
            if (TextUtils.isEmpty(gTMTUInterstitialAdapter.m0)) {
                gTMTUInterstitialAdapter.m = GTMTUHandlerManager.getInstance().getMBNewInterstitialHandler(initParams);
                return;
            } else {
                gTMTUInterstitialAdapter.f42568n = GTMTUHandlerManager.getInstance().getMBBidInterstitialVideoHandler(initParams);
                return;
            }
        }
        HashMap map = new HashMap();
        map.put("unit_id", gTMTUInterstitialAdapter.oo);
        map.put(MBridgeConstans.PLACEMENT_ID, gTMTUInterstitialAdapter.o0);
        MBInterstitialHandler mBInterstitialHandler = new MBInterstitialHandler(context.getApplicationContext(), map);
        gTMTUInterstitialAdapter.o = mBInterstitialHandler;
        mBInterstitialHandler.setInterstitialListener(gTMTUInterstitialAdapter.new AnonymousClass3());
    }
}

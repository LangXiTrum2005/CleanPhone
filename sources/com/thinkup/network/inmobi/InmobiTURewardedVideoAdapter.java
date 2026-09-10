package com.thinkup.network.inmobi;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class InmobiTURewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42590n = "InmobiTURewardedVideoAdapter";
    Map<String, Object> m;
    String o;
    private InMobiInterstitial o0;
    private boolean om;
    private Long oo;

    /* JADX INFO: renamed from: com.thinkup.network.inmobi.InmobiTURewardedVideoAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements MediationInitCallback {
        final /* synthetic */ Context o;

        public AnonymousClass1(Context context) {
            this.o = context;
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onFail(String str) {
            InmobiTURewardedVideoAdapter.this.notifyATLoadFail("", str);
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onSuccess() {
            try {
                InmobiTURewardedVideoAdapter.o(InmobiTURewardedVideoAdapter.this, this.o);
            } catch (Throwable th) {
                InmobiTURewardedVideoAdapter.this.notifyATLoadFail("", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.inmobi.InmobiTURewardedVideoAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends InterstitialAdEventListener {
        public AnonymousClass2() {
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public final /* bridge */ /* synthetic */ void onAdClicked(InMobiInterstitial inMobiInterstitial, Map map) {
            onAdClicked2(inMobiInterstitial, (Map<Object, Object>) map);
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public final void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
            InmobiTUInitManager.getInstance().removeInmobiAd(InmobiTURewardedVideoAdapter.this.o0);
            if (((CustomRewardVideoAdapter) InmobiTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) InmobiTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
            }
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public final void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
            InmobiTUInitManager.getInstance().removeInmobiAd(InmobiTURewardedVideoAdapter.this.o0);
            if (((CustomRewardVideoAdapter) InmobiTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) InmobiTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed("", "AdDisplayFailed");
            }
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public final void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public final void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
            if (((CustomRewardVideoAdapter) InmobiTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) InmobiTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
            }
            if (map != null) {
                try {
                    InmobiTURewardedVideoAdapter inmobiTURewardedVideoAdapter = InmobiTURewardedVideoAdapter.this;
                    if (inmobiTURewardedVideoAdapter.m == null) {
                        inmobiTURewardedVideoAdapter.m = new HashMap();
                    }
                    HashMap map2 = new HashMap();
                    map2.put(InmobiTUConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_MAP, map);
                    InmobiTURewardedVideoAdapter.this.m.put(TUAdConst.REWARD_EXTRA.REWARD_INFO, map2);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (((CustomRewardVideoAdapter) InmobiTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) InmobiTURewardedVideoAdapter.this).mImpressionListener.onReward();
            }
        }

        /* JADX INFO: renamed from: onAdClicked, reason: avoid collision after fix types in other method */
        public final void onAdClicked2(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
            if (((CustomRewardVideoAdapter) InmobiTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) InmobiTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
            }
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public final void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            if (((TUBaseAdInternalAdapter) InmobiTURewardedVideoAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) InmobiTURewardedVideoAdapter.this).mLoadListener.onAdDataLoaded();
            }
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public final void onAdImpression(InMobiInterstitial inMobiInterstitial) {
            super.onAdImpression(inMobiInterstitial);
            if (((CustomRewardVideoAdapter) InmobiTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) InmobiTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
            }
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public final void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
            InmobiTUInitManager.getInstance().removeInmobiAd(InmobiTURewardedVideoAdapter.this.o0);
            if (inMobiAdRequestStatus != null) {
                InmobiTURewardedVideoAdapter.this.notifyATLoadFail(inMobiAdRequestStatus.getStatusCode().name(), inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
            } else {
                InmobiTURewardedVideoAdapter.this.notifyATLoadFail("", "Inmobi load InterstitialAd failed.");
            }
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public final void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            InmobiTUInitManager.getInstance().onAdFetchSuccessful(InmobiTURewardedVideoAdapter.this.om, adMetaInfo, ((TUBaseAdInternalAdapter) InmobiTURewardedVideoAdapter.this).mLoadListener, InmobiTURewardedVideoAdapter.this.mBiddingListener);
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        this.o0 = null;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) throws Throwable {
        try {
            this.oo = Long.valueOf(Long.parseLong(TUInitMediation.getStringFromMap(map, "unit_id")));
        } catch (NumberFormatException unused) {
        }
        InmobiTUInitManager.getInstance().getBidRequestInfo(context, map, false, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.m;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return InmobiTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        try {
            return String.valueOf(this.oo);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return InmobiTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        InMobiInterstitial inMobiInterstitial = this.o0;
        if (inMobiInterstitial != null) {
            return inMobiInterstitial.isReady();
        }
        return false;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) throws Throwable {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        String stringFromMap2 = TUInitMediation.getStringFromMap(map, "unit_id");
        if (map.containsKey("payload")) {
            this.o = map.get("payload").toString();
        }
        if (TextUtils.isEmpty(stringFromMap) || TextUtils.isEmpty(stringFromMap2)) {
            notifyATLoadFail("", "inmobi account_id or unit_id is empty!");
        } else {
            try {
                this.oo = Long.valueOf(Long.parseLong(stringFromMap2));
            } catch (NumberFormatException unused) {
            }
            InmobiTUInitManager.getInstance().initSDK(context.getApplicationContext(), map, new AnonymousClass1(context));
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return InmobiTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        InMobiInterstitial inMobiInterstitial = this.o0;
        if (inMobiInterstitial != null) {
            inMobiInterstitial.show();
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean startBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, TUBiddingListener tUBiddingListener) throws Throwable {
        this.om = true;
        loadCustomNetworkAd(context, map, map2);
        return true;
    }

    private void o(Context context, Map<String, Object> map) throws Throwable {
        InmobiTUInitManager.getInstance().initSDK(context.getApplicationContext(), map, new AnonymousClass1(context));
    }

    private void o(Context context) {
        this.o0 = new InMobiInterstitial(context.getApplicationContext(), this.oo.longValue(), new AnonymousClass2());
        InmobiTUInitManager.getInstance().addInmobiAd(this.o0);
        this.o0.setExtras(InmobiTUInitManager.getInstance().getTopOnInfoExtraMap());
        if (TextUtils.isEmpty(this.o)) {
            this.o0.load();
        } else {
            this.o0.load(this.o.getBytes());
        }
    }

    private InterstitialAdEventListener o() {
        return new AnonymousClass2();
    }

    public static /* synthetic */ void o(InmobiTURewardedVideoAdapter inmobiTURewardedVideoAdapter, Context context) {
        inmobiTURewardedVideoAdapter.o0 = new InMobiInterstitial(context.getApplicationContext(), inmobiTURewardedVideoAdapter.oo.longValue(), inmobiTURewardedVideoAdapter.new AnonymousClass2());
        InmobiTUInitManager.getInstance().addInmobiAd(inmobiTURewardedVideoAdapter.o0);
        inmobiTURewardedVideoAdapter.o0.setExtras(InmobiTUInitManager.getInstance().getTopOnInfoExtraMap());
        if (TextUtils.isEmpty(inmobiTURewardedVideoAdapter.o)) {
            inmobiTURewardedVideoAdapter.o0.load();
        } else {
            inmobiTURewardedVideoAdapter.o0.load(inmobiTURewardedVideoAdapter.o.getBytes());
        }
    }
}

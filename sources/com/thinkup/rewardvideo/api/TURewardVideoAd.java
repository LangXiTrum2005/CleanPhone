package com.thinkup.rewardvideo.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdMultipleLoadedListener;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUAdRevenueListener;
import com.thinkup.core.api.TUAdSourceStatusListener;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUEventInterface;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.api.TURequestingInfo;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.core.basead.adx.api.TUAdxBidFloorInfo;
import com.thinkup.core.common.n.mn;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.n;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo;
import com.thinkup.core.common.ooo.m0;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.core.oo.n0;
import com.thinkup.core.oo.nm;
import com.thinkup.rewardvideo.o.o;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class TURewardVideoAd {
    WeakReference<Activity> mActivityWef;
    o mAdLoadManager;
    TUAdRevenueListener mAdRevenueListener;
    n mAdSourceEventListener;
    Context mContext;
    TUAdSourceStatusListener mDeveloperStatusListener;
    TUEventInterface mDownloadListener;
    TURewardVideoListener mListener;
    TUAdMultipleLoadedListener mMultipleLoadedListener;
    private TUNativeAdCustomRender mNativeAdCustomRender;
    String mPlacementId;
    Map<String, Object> mTKExtraMap;
    final String TAG = getClass().getSimpleName();
    private TURewardVideoExListener mInterListener = new TURewardVideoExListener() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1
        @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
        public void onAgainReward(final TUAdInfo tUAdInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1.13
                @Override // java.lang.Runnable
                public final void run() {
                    TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                    if (tURewardVideoListener == null || !(tURewardVideoListener instanceof TURewardVideoExListener)) {
                        return;
                    }
                    ((TURewardVideoExListener) tURewardVideoListener).onAgainReward(tUAdInfo);
                }
            });
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
        public void onAgainRewardFailed(final TUAdInfo tUAdInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1.14
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                        if (tURewardVideoListener == null || !(tURewardVideoListener instanceof TURewardVideoExListener)) {
                            return;
                        }
                        ((TURewardVideoExListener) tURewardVideoListener).onAgainRewardFailed(tUAdInfo);
                    } catch (Throwable th) {
                        Log.w(mo.oo0, "onAgainRewardFailed: " + th.getMessage());
                    }
                }
            });
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
        public void onDeeplinkCallback(final TUAdInfo tUAdInfo, final boolean z2) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                    if (tURewardVideoListener == null || !(tURewardVideoListener instanceof TURewardVideoExListener)) {
                        return;
                    }
                    ((TURewardVideoExListener) tURewardVideoListener).onDeeplinkCallback(tUAdInfo, z2);
                }
            });
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
        public void onDownloadConfirm(final Context context, final TUAdInfo tUAdInfo, final TUNetworkConfirmInfo tUNetworkConfirmInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1.8
                @Override // java.lang.Runnable
                public final void run() {
                    TURewardVideoAd tURewardVideoAd = TURewardVideoAd.this;
                    TURewardVideoListener tURewardVideoListener = tURewardVideoAd.mListener;
                    if (tURewardVideoListener == null || !(tURewardVideoListener instanceof TURewardVideoExListener)) {
                        return;
                    }
                    TURewardVideoExListener tURewardVideoExListener = (TURewardVideoExListener) tURewardVideoListener;
                    Context context2 = context;
                    if (context2 == null) {
                        context2 = tURewardVideoAd.mContext;
                    }
                    tURewardVideoExListener.onDownloadConfirm(context2, tUAdInfo, tUNetworkConfirmInfo);
                }
            });
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public void onReward(final TUAdInfo tUAdInfo) {
            final boolean z2 = tUAdInfo == null;
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1.7
                @Override // java.lang.Runnable
                public final void run() {
                    m0.o(TURewardVideoAd.this.mPlacementId, "onReward", tUAdInfo, z2);
                    TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                    if (tURewardVideoListener != null) {
                        tURewardVideoListener.onReward(tUAdInfo);
                    }
                }
            });
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
        public void onRewardFailed(final TUAdInfo tUAdInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1.15
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                        if (tURewardVideoListener == null || !(tURewardVideoListener instanceof TURewardVideoExListener)) {
                            return;
                        }
                        ((TURewardVideoExListener) tURewardVideoListener).onRewardFailed(tUAdInfo);
                    } catch (Throwable th) {
                        Log.w(mo.oo0, "onRewardFailed: " + th.getMessage());
                    }
                }
            });
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
        public void onRewardedVideoAdAgainPlayClicked(final TUAdInfo tUAdInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1.12
                @Override // java.lang.Runnable
                public final void run() {
                    TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                    if (tURewardVideoListener == null || !(tURewardVideoListener instanceof TURewardVideoExListener)) {
                        return;
                    }
                    ((TURewardVideoExListener) tURewardVideoListener).onRewardedVideoAdAgainPlayClicked(tUAdInfo);
                }
            });
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
        public void onRewardedVideoAdAgainPlayEnd(final TUAdInfo tUAdInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1.10
                @Override // java.lang.Runnable
                public final void run() {
                    TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                    if (tURewardVideoListener == null || !(tURewardVideoListener instanceof TURewardVideoExListener)) {
                        return;
                    }
                    ((TURewardVideoExListener) tURewardVideoListener).onRewardedVideoAdAgainPlayEnd(tUAdInfo);
                }
            });
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
        public void onRewardedVideoAdAgainPlayFailed(final AdError adError, final TUAdInfo tUAdInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1.11
                @Override // java.lang.Runnable
                public final void run() {
                    TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                    if (tURewardVideoListener == null || !(tURewardVideoListener instanceof TURewardVideoExListener)) {
                        return;
                    }
                    ((TURewardVideoExListener) tURewardVideoListener).onRewardedVideoAdAgainPlayFailed(adError, tUAdInfo);
                }
            });
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
        public void onRewardedVideoAdAgainPlayStart(final TUAdInfo tUAdInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1.9
                @Override // java.lang.Runnable
                public final void run() {
                    TUAdRevenueListener tUAdRevenueListener = TURewardVideoAd.this.mAdRevenueListener;
                    if (tUAdRevenueListener != null) {
                        tUAdRevenueListener.onAdRevenuePaid(tUAdInfo);
                    }
                    TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                    if (tURewardVideoListener == null || !(tURewardVideoListener instanceof TURewardVideoExListener)) {
                        return;
                    }
                    ((TURewardVideoExListener) tURewardVideoListener).onRewardedVideoAdAgainPlayStart(tUAdInfo);
                }
            });
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public void onRewardedVideoAdClosed(final TUAdInfo tUAdInfo) {
            final boolean z2 = tUAdInfo == null;
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1.5
                @Override // java.lang.Runnable
                public final void run() {
                    m0.o(TURewardVideoAd.this.mPlacementId, "onRewardedVideoAdClosed", tUAdInfo, z2);
                    TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                    if (tURewardVideoListener != null) {
                        tURewardVideoListener.onRewardedVideoAdClosed(tUAdInfo);
                    }
                }
            });
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public void onRewardedVideoAdFailed(AdError adError) {
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public void onRewardedVideoAdLoaded() {
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public void onRewardedVideoAdPlayClicked(final TUAdInfo tUAdInfo) {
            final boolean z2 = tUAdInfo == null;
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1.6
                @Override // java.lang.Runnable
                public final void run() {
                    m0.o(TURewardVideoAd.this.mPlacementId, "onRewardedVideoAdPlayClicked", tUAdInfo, z2);
                    TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                    if (tURewardVideoListener != null) {
                        tURewardVideoListener.onRewardedVideoAdPlayClicked(tUAdInfo);
                    }
                }
            });
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public void onRewardedVideoAdPlayEnd(final TUAdInfo tUAdInfo) {
            final boolean z2 = tUAdInfo == null;
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1.3
                @Override // java.lang.Runnable
                public final void run() {
                    m0.o(TURewardVideoAd.this.mPlacementId, "onRewardedVideoAdPlayEnd", tUAdInfo, z2);
                    TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                    if (tURewardVideoListener != null) {
                        tURewardVideoListener.onRewardedVideoAdPlayEnd(tUAdInfo);
                    }
                }
            });
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public void onRewardedVideoAdPlayFailed(final AdError adError, final TUAdInfo tUAdInfo) {
            final boolean z2 = tUAdInfo == null;
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1.4
                @Override // java.lang.Runnable
                public final void run() {
                    m0.o(TURewardVideoAd.this.mPlacementId, "onRewardedVideoAdPlayFailed", tUAdInfo, z2);
                    TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                    if (tURewardVideoListener != null) {
                        tURewardVideoListener.onRewardedVideoAdPlayFailed(adError, tUAdInfo);
                    }
                }
            });
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public void onRewardedVideoAdPlayStart(final TUAdInfo tUAdInfo) {
            final boolean z2 = tUAdInfo == null;
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    m0.o(TURewardVideoAd.this.mPlacementId, "onRewardedVideoAdPlayStart", tUAdInfo, z2);
                    TUAdRevenueListener tUAdRevenueListener = TURewardVideoAd.this.mAdRevenueListener;
                    if (tUAdRevenueListener != null) {
                        tUAdRevenueListener.onAdRevenuePaid(tUAdInfo);
                    }
                    TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                    if (tURewardVideoListener != null) {
                        tURewardVideoListener.onRewardedVideoAdPlayStart(tUAdInfo);
                    }
                }
            });
        }
    };
    com.thinkup.core.common.n.o adLoadListener = new com.thinkup.core.common.n.o() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.2
        @Override // com.thinkup.core.common.n.o
        public void onAdLoadFail(final AdError adError) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.2.2
                @Override // java.lang.Runnable
                public final void run() {
                    TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                    if (tURewardVideoListener != null) {
                        tURewardVideoListener.onRewardedVideoAdFailed(adError);
                    }
                }
            });
        }

        @Override // com.thinkup.core.common.n.o
        public void onAdLoaded() {
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        o0n.m();
                    } catch (Throwable unused) {
                    }
                    TURewardVideoListener tURewardVideoListener = TURewardVideoAd.this.mListener;
                    if (tURewardVideoListener != null) {
                        tURewardVideoListener.onRewardedVideoAdLoaded();
                    }
                }
            });
        }
    };
    public TUAdMultipleLoadedListener adMultipleLoadedListener = new TUAdMultipleLoadedListener() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.3
        @Override // com.thinkup.core.api.TUAdMultipleLoadedListener
        public void onAdMultipleLoaded(final TURequestingInfo tURequestingInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.api.TURewardVideoAd.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    TUAdMultipleLoadedListener tUAdMultipleLoadedListener = TURewardVideoAd.this.mMultipleLoadedListener;
                    if (tUAdMultipleLoadedListener != null) {
                        tUAdMultipleLoadedListener.onAdMultipleLoaded(tURequestingInfo);
                    }
                }
            });
        }
    };

    public TURewardVideoAd(Context context, String str) {
        this.mPlacementId = str;
        this.mContext = context.getApplicationContext();
        if (context instanceof Activity) {
            this.mActivityWef = new WeakReference<>((Activity) context);
        }
        this.mAdLoadManager = o.o(context, str);
    }

    private void controlShow(Activity activity, TUShowConfig tUShowConfig) {
        omn.m(this.mPlacementId, mo.o0m.o0m, mo.o0m.omn, mo.o0m.nn, "");
        if (o0n.m().on() == null || TextUtils.isEmpty(o0n.m().o00()) || TextUtils.isEmpty(o0n.m().o0o())) {
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", "sdk init error");
            TURewardVideoListener tURewardVideoListener = this.mListener;
            if (tURewardVideoListener != null) {
                tURewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, mn.o((TUBaseAdAdapter) null));
            }
            Log.e(this.TAG, "SDK init error!");
            return;
        }
        if (activity == null) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
        }
        Activity activity2 = activity;
        if (activity2 == null) {
            Log.e(this.TAG, "RewardedVideo Show Activity is null.");
        }
        o oVar = this.mAdLoadManager;
        if (oVar != null) {
            oVar.o(activity2, tUShowConfig, this.mInterListener, this.mDownloadListener, this.mTKExtraMap, this.mNativeAdCustomRender);
            return;
        }
        TURewardVideoListener tURewardVideoListener2 = this.mListener;
        if (tURewardVideoListener2 != null) {
            tURewardVideoListener2.onRewardedVideoAdPlayFailed(ErrorCode.getErrorCode(ErrorCode.exception, "", "adLoadManager is null"), mn.o((TUBaseAdAdapter) null));
        }
    }

    public static void entryAdScenario(String str, String str2) {
        o0n.m().o(str, str2, "1", (Map<String, Object>) null);
    }

    private TUAdStatusInfo getAdStatus() {
        if (o0n.m().on() == null || TextUtils.isEmpty(o0n.m().o00()) || TextUtils.isEmpty(o0n.m().o0o())) {
            Log.e(this.TAG, "SDK init error!");
            return null;
        }
        o oVar = this.mAdLoadManager;
        if (oVar != null) {
            return oVar.o(this.mContext, this.mTKExtraMap);
        }
        Log.e(this.TAG, "PlacementId is empty!");
        return new TUAdStatusInfo(false, false, null);
    }

    private Context getRequestContext() {
        WeakReference<Activity> weakReference = this.mActivityWef;
        Activity activity = weakReference != null ? weakReference.get() : null;
        return activity != null ? activity : this.mContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.thinkup.core.common.on.o getRewardCache() {
        o oVar = this.mAdLoadManager;
        if (oVar != null) {
            return oVar.o(this.mTKExtraMap);
        }
        return null;
    }

    private boolean isPlaceStrategyNeedAutoLoad() {
        if (TextUtils.isEmpty(this.mPlacementId)) {
            Log.e(this.TAG, "You must set unit Id first.");
            return false;
        }
        n0 n0VarO = nm.o(o0n.m().on()).o(this.mPlacementId);
        return n0VarO != null && n0VarO.o00o() == 1;
    }

    public TUAdStatusInfo checkAdStatus() {
        TUAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return new TUAdStatusInfo(false, false, null);
        }
        omn.m(this.mPlacementId, mo.o0m.o0m, mo.o0m.ono, adStatus.toString(), "");
        return adStatus;
    }

    public List<TUAdInfo> checkValidAdCaches() {
        o oVar = this.mAdLoadManager;
        if (oVar != null) {
            return oVar.o(this.mContext);
        }
        return null;
    }

    public boolean isAdReady() {
        TUAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return false;
        }
        boolean zIsReady = adStatus.isReady();
        omn.m(this.mPlacementId, mo.o0m.o0m, mo.o0m.on0, String.valueOf(zIsReady), "");
        return zIsReady;
    }

    public void load() {
        load(null);
    }

    public void setAdDownloadListener(TUEventInterface tUEventInterface) {
        this.mDownloadListener = tUEventInterface;
    }

    public void setAdListener(TURewardVideoListener tURewardVideoListener) {
        this.mListener = tURewardVideoListener;
    }

    public void setAdMultipleLoadedListener(TUAdMultipleLoadedListener tUAdMultipleLoadedListener) {
        this.mMultipleLoadedListener = tUAdMultipleLoadedListener;
    }

    public void setAdRevenueListener(TUAdRevenueListener tUAdRevenueListener) {
        this.mAdRevenueListener = tUAdRevenueListener;
    }

    public void setAdSourceStatusListener(TUAdSourceStatusListener tUAdSourceStatusListener) {
        if (this.mAdSourceEventListener == null) {
            this.mAdSourceEventListener = new n();
        }
        this.mDeveloperStatusListener = tUAdSourceStatusListener;
        this.mAdSourceEventListener.setAdSourceStatusListener(tUAdSourceStatusListener);
    }

    public void setLocalExtra(Map<String, Object> map) {
        if (TextUtils.isEmpty(this.mPlacementId)) {
            Log.e(this.TAG, "You must set unit Id first.");
        } else {
            ooo.o().o(this.mPlacementId, map);
        }
    }

    public void setNativeAdCustomRender(TUNativeAdCustomRender tUNativeAdCustomRender) {
        this.mNativeAdCustomRender = tUNativeAdCustomRender;
    }

    public void setTKExtra(Map<String, Object> map) {
        if (this.mTKExtraMap == null) {
            this.mTKExtraMap = new ConcurrentHashMap();
        }
        this.mTKExtraMap.clear();
        this.mTKExtraMap.putAll(map);
    }

    @Deprecated
    public void show(Activity activity, String str) {
        controlShow(activity, nn.oo(str));
    }

    public static void entryAdScenario(String str, String str2, Map<String, Object> map) {
        o0n.m().o(str, str2, "1", map);
    }

    public void load(Context context) {
        load(context, (TUAdRequest) null);
    }

    public void show(Activity activity) {
        show(activity, (TUShowConfig) null);
    }

    @Deprecated
    public void load(Context context, TUAdxBidFloorInfo tUAdxBidFloorInfo) {
        TUAdRequest tUAdRequestBuild = tUAdxBidFloorInfo != null ? new TUAdRequest.Builder().setTUAdxBidFloorInfo(tUAdxBidFloorInfo).build() : null;
        if (context == null) {
            context = getRequestContext();
        }
        load(context, tUAdRequestBuild, 0);
    }

    public void show(Activity activity, TUShowConfig tUShowConfig) {
        controlShow(activity, tUShowConfig);
    }

    public void load(Context context, TUAdRequest tUAdRequest) {
        if (context == null) {
            context = getRequestContext();
        }
        load(context, tUAdRequest, 0);
    }

    private void load(Context context, TUAdRequest tUAdRequest, int i2) {
        omn.o(this.mPlacementId, mo.o0m.o0m, mo.o0m.omo, mo.o0m.nn, "", true);
        o oVar = this.mAdLoadManager;
        if (oVar != null) {
            oVar.o(context, i2, this.adLoadListener, this.mAdSourceEventListener, this.adMultipleLoadedListener, this.mTKExtraMap, tUAdRequest);
            return;
        }
        TURewardVideoListener tURewardVideoListener = this.mListener;
        if (tURewardVideoListener != null) {
            tURewardVideoListener.onRewardedVideoAdFailed(ErrorCode.getErrorCode(ErrorCode.exception, "", "placementId maybe is null"));
        }
    }
}

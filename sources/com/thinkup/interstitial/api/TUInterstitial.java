package com.thinkup.interstitial.api;

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
import com.thinkup.core.api.TUEventInterface;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.api.TURequestingInfo;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.core.basead.adx.api.TUAdxBidFloorInfo;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.n;
import com.thinkup.core.common.n.o;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.interstitial.o.m;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class TUInterstitial {
    public static final String TAG = "TUInterstitial";
    WeakReference<Activity> mActivityWef;
    m mAdLoadManager;
    private TUAdRevenueListener mAdRevenueListener;
    n mAdSourceEventListener;
    public Context mContext;
    TUAdSourceStatusListener mDeveloperStatusListener;
    TUEventInterface mDownloadListener;
    public TUInterstitialListener mInterstitialListener;
    TUAdMultipleLoadedListener mMultipleLoadedListener;
    public String mPlacementId;
    Map<String, Object> mTKExtraMap;
    private TUNativeAdCustomRender mixNativeAdListener;
    private TUInterstitialExListener mInterListener = new TUInterstitialExListener() { // from class: com.thinkup.interstitial.api.TUInterstitial.1
        @Override // com.thinkup.interstitial.api.TUInterstitialExListener
        public void onDeeplinkCallback(final TUAdInfo tUAdInfo, final boolean z2) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.api.TUInterstitial.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    TUInterstitialListener tUInterstitialListener = TUInterstitial.this.mInterstitialListener;
                    if (tUInterstitialListener == null || !(tUInterstitialListener instanceof TUInterstitialExListener)) {
                        return;
                    }
                    ((TUInterstitialExListener) tUInterstitialListener).onDeeplinkCallback(tUAdInfo, z2);
                }
            });
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialExListener
        public void onDownloadConfirm(final Context context, final TUAdInfo tUAdInfo, final TUNetworkConfirmInfo tUNetworkConfirmInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.api.TUInterstitial.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    TUInterstitial tUInterstitial = TUInterstitial.this;
                    TUInterstitialListener tUInterstitialListener = tUInterstitial.mInterstitialListener;
                    if (tUInterstitialListener == null || !(tUInterstitialListener instanceof TUInterstitialExListener)) {
                        return;
                    }
                    TUInterstitialExListener tUInterstitialExListener = (TUInterstitialExListener) tUInterstitialListener;
                    Context context2 = context;
                    if (context2 == null) {
                        context2 = tUInterstitial.mContext;
                    }
                    tUInterstitialExListener.onDownloadConfirm(context2, tUAdInfo, tUNetworkConfirmInfo);
                }
            });
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public void onInterstitialAdClicked(final TUAdInfo tUAdInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.api.TUInterstitial.1.7
                @Override // java.lang.Runnable
                public final void run() {
                    TUInterstitialListener tUInterstitialListener = TUInterstitial.this.mInterstitialListener;
                    if (tUInterstitialListener != null) {
                        tUInterstitialListener.onInterstitialAdClicked(tUAdInfo);
                    }
                }
            });
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public void onInterstitialAdClose(final TUAdInfo tUAdInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.api.TUInterstitial.1.6
                @Override // java.lang.Runnable
                public final void run() {
                    TUInterstitialListener tUInterstitialListener = TUInterstitial.this.mInterstitialListener;
                    if (tUInterstitialListener != null) {
                        tUInterstitialListener.onInterstitialAdClose(tUAdInfo);
                    }
                }
            });
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public void onInterstitialAdLoadFail(AdError adError) {
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public void onInterstitialAdLoaded() {
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public void onInterstitialAdShow(final TUAdInfo tUAdInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.api.TUInterstitial.1.8
                @Override // java.lang.Runnable
                public final void run() {
                    if (TUInterstitial.this.mAdRevenueListener != null) {
                        TUInterstitial.this.mAdRevenueListener.onAdRevenuePaid(tUAdInfo);
                    }
                    TUInterstitialListener tUInterstitialListener = TUInterstitial.this.mInterstitialListener;
                    if (tUInterstitialListener != null) {
                        tUInterstitialListener.onInterstitialAdShow(tUAdInfo);
                    }
                }
            });
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public void onInterstitialAdVideoEnd(final TUAdInfo tUAdInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.api.TUInterstitial.1.4
                @Override // java.lang.Runnable
                public final void run() {
                    TUInterstitialListener tUInterstitialListener = TUInterstitial.this.mInterstitialListener;
                    if (tUInterstitialListener != null) {
                        tUInterstitialListener.onInterstitialAdVideoEnd(tUAdInfo);
                    }
                }
            });
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public void onInterstitialAdVideoError(final AdError adError) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.api.TUInterstitial.1.5
                @Override // java.lang.Runnable
                public final void run() {
                    TUInterstitialListener tUInterstitialListener = TUInterstitial.this.mInterstitialListener;
                    if (tUInterstitialListener != null) {
                        tUInterstitialListener.onInterstitialAdVideoError(adError);
                    }
                }
            });
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public void onInterstitialAdVideoStart(final TUAdInfo tUAdInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.api.TUInterstitial.1.3
                @Override // java.lang.Runnable
                public final void run() {
                    TUInterstitialListener tUInterstitialListener = TUInterstitial.this.mInterstitialListener;
                    if (tUInterstitialListener != null) {
                        tUInterstitialListener.onInterstitialAdVideoStart(tUAdInfo);
                    }
                }
            });
        }
    };
    o adLoadListener = new o() { // from class: com.thinkup.interstitial.api.TUInterstitial.2
        @Override // com.thinkup.core.common.n.o
        public void onAdLoadFail(final AdError adError) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.api.TUInterstitial.2.2
                @Override // java.lang.Runnable
                public final void run() {
                    TUInterstitialListener tUInterstitialListener = TUInterstitial.this.mInterstitialListener;
                    if (tUInterstitialListener != null) {
                        tUInterstitialListener.onInterstitialAdLoadFail(adError);
                    }
                }
            });
        }

        @Override // com.thinkup.core.common.n.o
        public void onAdLoaded() {
            o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.api.TUInterstitial.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        o0n.m();
                    } catch (Throwable unused) {
                    }
                    TUInterstitialListener tUInterstitialListener = TUInterstitial.this.mInterstitialListener;
                    if (tUInterstitialListener != null) {
                        tUInterstitialListener.onInterstitialAdLoaded();
                    }
                }
            });
        }
    };
    public TUAdMultipleLoadedListener adMultipleLoadedListener = new TUAdMultipleLoadedListener() { // from class: com.thinkup.interstitial.api.TUInterstitial.3
        @Override // com.thinkup.core.api.TUAdMultipleLoadedListener
        public void onAdMultipleLoaded(final TURequestingInfo tURequestingInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.api.TUInterstitial.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    TUAdMultipleLoadedListener tUAdMultipleLoadedListener = TUInterstitial.this.mMultipleLoadedListener;
                    if (tUAdMultipleLoadedListener != null) {
                        tUAdMultipleLoadedListener.onAdMultipleLoaded(tURequestingInfo);
                    }
                }
            });
        }
    };

    public TUInterstitial(Context context, String str) {
        this.mContext = context.getApplicationContext();
        if (context instanceof Activity) {
            this.mActivityWef = new WeakReference<>((Activity) context);
        }
        this.mPlacementId = str;
        this.mAdLoadManager = m.o(context, str);
    }

    private void controlShow(Activity activity, TUShowConfig tUShowConfig) {
        omn.m(this.mPlacementId, mo.o0m.o0o, mo.o0m.omn, mo.o0m.nn, "");
        if (o0n.m().on() == null || TextUtils.isEmpty(o0n.m().o00()) || TextUtils.isEmpty(o0n.m().o0o())) {
            Log.e(TAG, "Show error: SDK init error!");
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
            Log.e(TAG, "Interstitial Show Activity is null.");
        }
        m mVar = this.mAdLoadManager;
        if (mVar != null) {
            mVar.o(activity2, tUShowConfig, this.mInterListener, this.mDownloadListener, this.mTKExtraMap, this.mixNativeAdListener);
            return;
        }
        TUInterstitialListener tUInterstitialListener = this.mInterstitialListener;
        if (tUInterstitialListener != null) {
            tUInterstitialListener.onInterstitialAdVideoError(ErrorCode.getErrorCode(ErrorCode.exception, "", "adLoadManager is null"));
        }
    }

    public static void entryAdScenario(String str, String str2) {
        o0n.m().o(str, str2, "3", (Map<String, Object>) null);
    }

    private TUAdStatusInfo getAdStatus() {
        if (o0n.m().on() == null || TextUtils.isEmpty(o0n.m().o00()) || TextUtils.isEmpty(o0n.m().o0o())) {
            Log.e(TAG, "SDK init error!");
            return null;
        }
        m mVar = this.mAdLoadManager;
        if (mVar != null) {
            return mVar.o(this.mContext, this.mTKExtraMap);
        }
        Log.e(TAG, "PlacementId is empty!");
        return new TUAdStatusInfo(false, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.thinkup.core.common.on.o getInterstitialCache() {
        m mVar = this.mAdLoadManager;
        if (mVar != null) {
            return mVar.o(this.mTKExtraMap);
        }
        return null;
    }

    private Context getRequestContext() {
        WeakReference<Activity> weakReference = this.mActivityWef;
        Activity activity = weakReference != null ? weakReference.get() : null;
        return activity != null ? activity : this.mContext;
    }

    public TUAdStatusInfo checkAdStatus() {
        TUAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return new TUAdStatusInfo(false, false, null);
        }
        omn.m(this.mPlacementId, mo.o0m.o0o, mo.o0m.ono, adStatus.toString(), "");
        return adStatus;
    }

    public List<TUAdInfo> checkValidAdCaches() {
        m mVar = this.mAdLoadManager;
        if (mVar != null) {
            return mVar.o(this.mContext);
        }
        return null;
    }

    public boolean isAdReady() {
        TUAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return false;
        }
        boolean zIsReady = adStatus.isReady();
        omn.m(this.mPlacementId, mo.o0m.o0o, mo.o0m.on0, String.valueOf(zIsReady), "");
        return zIsReady;
    }

    public void load() {
        load(null);
    }

    public void setAdDownloadListener(TUEventInterface tUEventInterface) {
        this.mDownloadListener = tUEventInterface;
    }

    public void setAdListener(TUInterstitialListener tUInterstitialListener) {
        this.mInterstitialListener = tUInterstitialListener;
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
            Log.e(TAG, "You must set unit Id first.");
        } else {
            ooo.o().o(this.mPlacementId, map);
        }
    }

    public void setNativeAdCustomRender(TUNativeAdCustomRender tUNativeAdCustomRender) {
        this.mixNativeAdListener = tUNativeAdCustomRender;
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
        o0n.m().o(str, str2, "3", map);
    }

    public void load(Context context) {
        load(context, (TUAdRequest) null);
    }

    public void show(Activity activity) {
        show(activity, "");
    }

    public void load(Context context, TUAdRequest tUAdRequest) {
        if (context == null) {
            context = getRequestContext();
        }
        load(context, tUAdRequest, 0);
    }

    public void show(Activity activity, TUShowConfig tUShowConfig) {
        controlShow(activity, tUShowConfig);
    }

    @Deprecated
    public void load(Context context, TUAdxBidFloorInfo tUAdxBidFloorInfo) {
        TUAdRequest tUAdRequestBuild = tUAdxBidFloorInfo != null ? new TUAdRequest.Builder().setTUAdxBidFloorInfo(tUAdxBidFloorInfo).build() : null;
        if (context == null) {
            context = getRequestContext();
        }
        load(context, tUAdRequestBuild, 0);
    }

    private void load(Context context, TUAdRequest tUAdRequest, int i2) {
        omn.o(this.mPlacementId, mo.o0m.o0o, mo.o0m.omo, mo.o0m.nn, "", true);
        m mVar = this.mAdLoadManager;
        if (mVar != null) {
            mVar.o(context, i2, this.adLoadListener, this.mAdSourceEventListener, this.adMultipleLoadedListener, this.mTKExtraMap, tUAdRequest);
            return;
        }
        TUInterstitialListener tUInterstitialListener = this.mInterstitialListener;
        if (tUInterstitialListener != null) {
            tUInterstitialListener.onInterstitialAdLoadFail(ErrorCode.getErrorCode(ErrorCode.exception, "", "placementId maybe is null"));
        }
    }
}

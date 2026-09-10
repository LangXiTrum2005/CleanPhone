package com.thinkup.nativead.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdMultipleLoadedListener;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUAdSourceStatusListener;
import com.thinkup.core.api.TUAdStatusInfo;
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
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class TUNative {
    private final String TAG = "TUNative";
    o adLoadListener = new o() { // from class: com.thinkup.nativead.api.TUNative.1
        @Override // com.thinkup.core.common.n.o
        public void onAdLoadFail(final AdError adError) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.nativead.api.TUNative.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    TUNativeNetworkListener tUNativeNetworkListener = TUNative.this.mListener;
                    if (tUNativeNetworkListener != null) {
                        tUNativeNetworkListener.onNativeAdLoadFail(adError);
                    }
                }
            });
        }

        @Override // com.thinkup.core.common.n.o
        public void onAdLoaded() {
            o0n.m().m(new Runnable() { // from class: com.thinkup.nativead.api.TUNative.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        o0n.m();
                    } catch (Throwable unused) {
                    }
                    TUNativeNetworkListener tUNativeNetworkListener = TUNative.this.mListener;
                    if (tUNativeNetworkListener != null) {
                        tUNativeNetworkListener.onNativeAdLoaded();
                    }
                }
            });
        }
    };
    public TUAdMultipleLoadedListener adMultipleLoadedListener = new TUAdMultipleLoadedListener() { // from class: com.thinkup.nativead.api.TUNative.2
        @Override // com.thinkup.core.api.TUAdMultipleLoadedListener
        public void onAdMultipleLoaded(final TURequestingInfo tURequestingInfo) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.nativead.api.TUNative.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    TUAdMultipleLoadedListener tUAdMultipleLoadedListener = TUNative.this.mMultipleLoadedListener;
                    if (tUAdMultipleLoadedListener != null) {
                        tUAdMultipleLoadedListener.onAdMultipleLoaded(tURequestingInfo);
                    }
                }
            });
        }
    };
    WeakReference<Activity> mActivityRef;
    com.thinkup.nativead.o.o mAdLoadManager;
    n mAdSourceEventListener;
    Context mContext;
    TUAdSourceStatusListener mDeveloperStatusListener;
    TUNativeNetworkListener mListener;
    TUAdMultipleLoadedListener mMultipleLoadedListener;
    String mPlacementId;
    Map<String, Object> mTKExtraMap;

    public TUNative(Context context, String str, TUNativeNetworkListener tUNativeNetworkListener) {
        this.mContext = context.getApplicationContext();
        if (context instanceof Activity) {
            this.mActivityRef = new WeakReference<>((Activity) context);
        }
        this.mPlacementId = str;
        this.mListener = tUNativeNetworkListener;
        this.mAdLoadManager = com.thinkup.nativead.o.o.o(context, str);
    }

    public static void entryAdScenario(String str, String str2) {
        o0n.m().o(str, str2, "0", (Map<String, Object>) null);
    }

    private Context getContext() {
        Activity activity;
        WeakReference<Activity> weakReference = this.mActivityRef;
        return (weakReference == null || (activity = weakReference.get()) == null) ? this.mContext : activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.thinkup.core.common.on.o getNativeCache() {
        com.thinkup.nativead.o.o oVar = this.mAdLoadManager;
        if (oVar != null) {
            return oVar.o(this.mTKExtraMap);
        }
        return null;
    }

    public TUAdStatusInfo checkAdStatus() {
        if (o0n.m().on() == null || TextUtils.isEmpty(o0n.m().o00()) || TextUtils.isEmpty(o0n.m().o0o())) {
            Log.e(this.TAG, "SDK init error!");
            return new TUAdStatusInfo(false, false, null);
        }
        com.thinkup.nativead.o.o oVar = this.mAdLoadManager;
        if (oVar == null) {
            Log.e(this.TAG, "PlacementId is empty!");
            return new TUAdStatusInfo(false, false, null);
        }
        TUAdStatusInfo tUAdStatusInfoO = oVar.o(getContext(), this.mTKExtraMap);
        omn.m(this.mPlacementId, mo.o0m.o0n, mo.o0m.ono, tUAdStatusInfoO.toString(), "");
        return tUAdStatusInfoO;
    }

    public List<TUAdInfo> checkValidAdCaches() {
        com.thinkup.nativead.o.o oVar = this.mAdLoadManager;
        if (oVar != null) {
            return oVar.o(getContext());
        }
        return null;
    }

    public NativeAd getNativeAd() {
        return getNativeAd((TUShowConfig) null);
    }

    public void makeAdRequest() {
        makeAdRequest((TUAdRequest) null);
    }

    public void setAdListener(TUNativeNetworkListener tUNativeNetworkListener) {
        this.mListener = tUNativeNetworkListener;
    }

    public void setAdMultipleLoadedListener(TUAdMultipleLoadedListener tUAdMultipleLoadedListener) {
        this.mMultipleLoadedListener = tUAdMultipleLoadedListener;
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

    public void setTKExtra(Map<String, Object> map) {
        if (this.mTKExtraMap == null) {
            this.mTKExtraMap = new ConcurrentHashMap();
        }
        this.mTKExtraMap.clear();
        this.mTKExtraMap.putAll(map);
    }

    public static void entryAdScenario(String str, String str2, Map<String, Object> map) {
        o0n.m().o(str, str2, "0", map);
    }

    @Deprecated
    public NativeAd getNativeAd(String str) {
        return getNativeAd(nn.oo(str));
    }

    @Deprecated
    public void makeAdRequest(TUAdxBidFloorInfo tUAdxBidFloorInfo) {
        makeAdRequest(tUAdxBidFloorInfo != null ? new TUAdRequest.Builder().setTUAdxBidFloorInfo(tUAdxBidFloorInfo).build() : null);
    }

    public NativeAd getNativeAd(TUShowConfig tUShowConfig) {
        com.thinkup.core.common.on.o oVarO;
        com.thinkup.nativead.o.o oVar = this.mAdLoadManager;
        if (oVar == null || (oVarO = oVar.o(tUShowConfig, this.mTKExtraMap)) == null) {
            return null;
        }
        return new NativeAd(getContext(), this.mPlacementId, oVarO);
    }

    public void makeAdRequest(TUAdRequest tUAdRequest) {
        omn.o(this.mPlacementId, mo.o0m.o0n, mo.o0m.omo, mo.o0m.nn, "", true);
        com.thinkup.nativead.o.o oVar = this.mAdLoadManager;
        if (oVar != null) {
            oVar.o(getContext(), this.adLoadListener, this.mAdSourceEventListener, this.adMultipleLoadedListener, this.mTKExtraMap, tUAdRequest);
            return;
        }
        TUNativeNetworkListener tUNativeNetworkListener = this.mListener;
        if (tUNativeNetworkListener != null) {
            tUNativeNetworkListener.onNativeAdLoadFail(ErrorCode.getErrorCode(ErrorCode.exception, "", "placementId maybe is null"));
        }
    }
}

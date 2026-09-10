package com.thinkup.network.pangle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.splashad.unitgroup.api.CustomSplashAdapter;
import com.thinkup.splashad.unitgroup.api.CustomSplashEventListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class PangleTUSplashAdapter extends CustomSplashAdapter implements PAGAppOpenAdInteractionListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    PAGAppOpenAd f42619n;
    Map<String, Object> o0;
    private String oo;
    String o = "";
    String m = "";

    /* JADX INFO: renamed from: com.thinkup.network.pangle.PangleTUSplashAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ Map o;

        public AnonymousClass2(Map map) {
            this.o = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                PAGAppOpenRequest pAGAppOpenRequest = new PAGAppOpenRequest();
                pAGAppOpenRequest.setTimeout(((TUBaseAdInternalAdapter) PangleTUSplashAdapter.this).mFetchAdTimeout);
                if (!TextUtils.isEmpty(PangleTUSplashAdapter.this.oo)) {
                    pAGAppOpenRequest.setAdString(PangleTUSplashAdapter.this.oo);
                }
                PangleTUInitManager.setPangleUserData(this.o);
                PAGAppOpenAd.loadAd(PangleTUSplashAdapter.this.m, pAGAppOpenRequest, new PAGAppOpenAdLoadListener() { // from class: com.thinkup.network.pangle.PangleTUSplashAdapter.2.1
                    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
                    public final void onError(int i2, String str) {
                        if (((TUBaseAdInternalAdapter) PangleTUSplashAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) PangleTUSplashAdapter.this).mLoadListener.onAdLoadError(String.valueOf(i2), str);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
                    public final void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
                        PangleTUSplashAdapter.this.f42619n = pAGAppOpenAd;
                        try {
                            Map<String, Object> mediaExtraInfo = pAGAppOpenAd.getMediaExtraInfo();
                            if (mediaExtraInfo != null) {
                                PangleTUSplashAdapter pangleTUSplashAdapter = PangleTUSplashAdapter.this;
                                if (pangleTUSplashAdapter.o0 == null) {
                                    pangleTUSplashAdapter.o0 = new HashMap(3);
                                }
                                PangleTUSplashAdapter.this.o0.putAll(mediaExtraInfo);
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        if (((TUBaseAdInternalAdapter) PangleTUSplashAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) PangleTUSplashAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        }
                    }
                });
            } catch (Exception e2) {
                if (((TUBaseAdInternalAdapter) PangleTUSplashAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) PangleTUSplashAdapter.this).mLoadListener.onAdLoadError("", e2.getMessage());
                }
            }
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        this.f42619n = null;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        this.m = TUInitMediation.getStringFromMap(map, "slot_id");
        PangleTUInitManager.getInstance().o(context, map, map2, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(0, PangleTUAdapter.class);
        map.put(3, PangleTUInterstitialAdapter.class);
        return map;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public TUInitMediation getMediationInitManager() {
        return PangleTUInitManager.getInstance();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.o0;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return PangleTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.m;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return PangleTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        return this.f42619n != null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, Map<String, Object> map2) {
        this.o = TUInitMediation.getStringFromMap(map, "app_id");
        this.m = TUInitMediation.getStringFromMap(map, "slot_id");
        if (!TextUtils.isEmpty(this.o) && !TextUtils.isEmpty(this.m)) {
            this.oo = TUInitMediation.getStringFromMap(map, "payload");
            PangleTUInitManager.getInstance().initSDK(context, map, map2, new MediationInitCallback() { // from class: com.thinkup.network.pangle.PangleTUSplashAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) PangleTUSplashAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) PangleTUSplashAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    try {
                        PangleTUSplashAdapter.o(PangleTUSplashAdapter.this, map);
                    } catch (Throwable th) {
                        if (((TUBaseAdInternalAdapter) PangleTUSplashAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) PangleTUSplashAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
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

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        CustomSplashEventListener customSplashEventListener = this.mImpressionListener;
        if (customSplashEventListener != null) {
            customSplashEventListener.onSplashAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
        CustomSplashEventListener customSplashEventListener = this.mImpressionListener;
        if (customSplashEventListener != null) {
            customSplashEventListener.onSplashAdDismiss();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        try {
            PangleTUInitManager.getInstance().o(getTrackingInfo().omm(), new WeakReference(this.f42619n));
        } catch (Throwable unused) {
        }
        CustomSplashEventListener customSplashEventListener = this.mImpressionListener;
        if (customSplashEventListener != null) {
            customSplashEventListener.onSplashAdShow();
        }
    }

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        PAGAppOpenAd pAGAppOpenAd = this.f42619n;
        if (pAGAppOpenAd != null) {
            pAGAppOpenAd.setAdInteractionListener(this);
            this.f42619n.show(activity);
        }
    }

    private void o(Map<String, Object> map) {
        postOnMainThread(new AnonymousClass2(map));
    }

    public static /* synthetic */ void o(PangleTUSplashAdapter pangleTUSplashAdapter, Map map) {
        pangleTUSplashAdapter.postOnMainThread(pangleTUSplashAdapter.new AnonymousClass2(map));
    }
}

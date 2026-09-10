package com.thinkup.network.pangle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class PangleTUInterstitialAdapter extends CustomInterstitialAdapter {
    private String om;
    private Map<String, Object> on;
    private PAGInterstitialAd oo;
    private final String o0 = getClass().getSimpleName();
    String o = "";
    PAGInterstitialAdLoadListener m = new PAGInterstitialAdLoadListener() { // from class: com.thinkup.network.pangle.PangleTUInterstitialAdapter.1
        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
        public final void onError(int i2, String str) {
            if (((TUBaseAdInternalAdapter) PangleTUInterstitialAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) PangleTUInterstitialAdapter.this).mLoadListener.onAdLoadError(String.valueOf(i2), str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public final void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            PangleTUInterstitialAdapter.this.oo = pAGInterstitialAd;
            try {
                Map<String, Object> mediaExtraInfo = PangleTUInterstitialAdapter.this.oo.getMediaExtraInfo();
                if (mediaExtraInfo != null) {
                    if (PangleTUInterstitialAdapter.this.on == null) {
                        PangleTUInterstitialAdapter.this.on = new HashMap(3);
                    }
                    PangleTUInterstitialAdapter.this.on.putAll(mediaExtraInfo);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (((TUBaseAdInternalAdapter) PangleTUInterstitialAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) PangleTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    PAGInterstitialAdInteractionListener f42616n = new PAGInterstitialAdInteractionListener() { // from class: com.thinkup.network.pangle.PangleTUInterstitialAdapter.2
        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdClicked() {
            if (((CustomInterstitialAdapter) PangleTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) PangleTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdDismissed() {
            if (((CustomInterstitialAdapter) PangleTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) PangleTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdShowed() {
            try {
                PangleTUInitManager.getInstance().o(PangleTUInterstitialAdapter.this.getTrackingInfo().omm(), new WeakReference(PangleTUInterstitialAdapter.this.oo));
            } catch (Throwable unused) {
            }
            if (((CustomInterstitialAdapter) PangleTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) PangleTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
            }
        }
    };

    /* JADX INFO: renamed from: com.thinkup.network.pangle.PangleTUInterstitialAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ Map o;

        public AnonymousClass3(Map map) {
            this.o = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PAGInterstitialRequest pAGInterstitialRequest = new PAGInterstitialRequest();
            if (!TextUtils.isEmpty(PangleTUInterstitialAdapter.this.om)) {
                pAGInterstitialRequest.setAdString(PangleTUInterstitialAdapter.this.om);
            }
            PangleTUInitManager.setPangleUserData(this.o);
            PangleTUInterstitialAdapter pangleTUInterstitialAdapter = PangleTUInterstitialAdapter.this;
            PAGInterstitialAd.loadAd(pangleTUInterstitialAdapter.o, pAGInterstitialRequest, pangleTUInterstitialAdapter.m);
        }
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        PAGInterstitialAd pAGInterstitialAd = this.oo;
        if (pAGInterstitialAd != null) {
            pAGInterstitialAd.setAdInteractionListener(null);
            this.oo = null;
        }
        this.f42616n = null;
        this.m = null;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        this.o = TUInitMediation.getStringFromMap(map, "slot_id");
        PangleTUInitManager.getInstance().o(context, map, map2, tUBidRequestInfoListener);
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
        return this.oo != null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        this.o = TUInitMediation.getStringFromMap(map, "slot_id");
        if (!TextUtils.isEmpty(stringFromMap) && !TextUtils.isEmpty(this.o)) {
            this.om = TUInitMediation.getStringFromMap(map, "payload");
            PangleTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.pangle.PangleTUInterstitialAdapter.4
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) PangleTUInterstitialAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) PangleTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    try {
                        PangleTUInterstitialAdapter.m(PangleTUInterstitialAdapter.this, map);
                    } catch (Throwable th) {
                        if (((TUBaseAdInternalAdapter) PangleTUInterstitialAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) PangleTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
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

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        PAGInterstitialAd pAGInterstitialAd = this.oo;
        if (pAGInterstitialAd == null || activity == null) {
            return;
        }
        pAGInterstitialAd.setAdInteractionListener(this.f42616n);
        this.oo.show(activity);
    }

    public static /* synthetic */ void m(PangleTUInterstitialAdapter pangleTUInterstitialAdapter, Map map) {
        pangleTUInterstitialAdapter.postOnMainThread(pangleTUInterstitialAdapter.new AnonymousClass3(map));
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

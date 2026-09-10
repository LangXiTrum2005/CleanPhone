package com.thinkup.network.pangle;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class PangleTUBannerAdapter extends CustomBannerAdapter {
    View m;
    private Map<String, Object> mn;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f42611n;
    int o0;
    boolean om;
    PAGBannerAd on;
    String oo;
    private final String mm = getClass().getSimpleName();
    String o = "";
    PAGBannerAdLoadListener m0 = new PAGBannerAdLoadListener() { // from class: com.thinkup.network.pangle.PangleTUBannerAdapter.1
        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
        public final void onError(int i2, String str) {
            if (((TUBaseAdInternalAdapter) PangleTUBannerAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) PangleTUBannerAdapter.this).mLoadListener.onAdLoadError(String.valueOf(i2), str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public final void onAdLoaded(PAGBannerAd pAGBannerAd) {
            if (pAGBannerAd == null) {
                if (((TUBaseAdInternalAdapter) PangleTUBannerAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) PangleTUBannerAdapter.this).mLoadListener.onAdLoadError("", "TTAD is null!");
                    return;
                }
                return;
            }
            View bannerView = pAGBannerAd.getBannerView();
            if (bannerView == null) {
                if (((TUBaseAdInternalAdapter) PangleTUBannerAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) PangleTUBannerAdapter.this).mLoadListener.onAdLoadError("", "TTBannerView is null!");
                    return;
                }
                return;
            }
            PangleTUBannerAdapter pangleTUBannerAdapter = PangleTUBannerAdapter.this;
            pangleTUBannerAdapter.on = pAGBannerAd;
            pangleTUBannerAdapter.m = bannerView;
            pAGBannerAd.setAdInteractionListener(pangleTUBannerAdapter.mo);
            try {
                Map<String, Object> mediaExtraInfo = PangleTUBannerAdapter.this.on.getMediaExtraInfo();
                if (mediaExtraInfo != null) {
                    if (PangleTUBannerAdapter.this.mn == null) {
                        PangleTUBannerAdapter.this.mn = new HashMap(3);
                    }
                    PangleTUBannerAdapter.this.mn.putAll(mediaExtraInfo);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            PangleTUBannerAdapter pangleTUBannerAdapter2 = PangleTUBannerAdapter.this;
            pangleTUBannerAdapter2.om = false;
            if (((TUBaseAdInternalAdapter) pangleTUBannerAdapter2).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) PangleTUBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    };
    PAGBannerAdInteractionListener mo = new PAGBannerAdInteractionListener() { // from class: com.thinkup.network.pangle.PangleTUBannerAdapter.2
        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdClicked() {
            CustomBannerEventListener customBannerEventListener = PangleTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdDismissed() {
            CustomBannerEventListener customBannerEventListener = PangleTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdClose();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdShowed() {
            try {
                PangleTUInitManager.getInstance().o(PangleTUBannerAdapter.this.getTrackingInfo().omm(), new WeakReference(PangleTUBannerAdapter.this.on));
            } catch (Throwable unused) {
            }
            PangleTUBannerAdapter pangleTUBannerAdapter = PangleTUBannerAdapter.this;
            CustomBannerEventListener customBannerEventListener = pangleTUBannerAdapter.mImpressionEventListener;
            if (customBannerEventListener == null || pangleTUBannerAdapter.om) {
                return;
            }
            customBannerEventListener.onBannerAdShow();
            PangleTUBannerAdapter.this.om = true;
        }
    };

    /* JADX INFO: renamed from: com.thinkup.network.pangle.PangleTUBannerAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ Map m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Map f42612n;
        final /* synthetic */ Context o;

        public AnonymousClass3(Context context, Map map, Map map2) {
            this.o = context;
            this.m = map;
            this.f42612n = map2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PangleTUBannerAdapter pangleTUBannerAdapter = PangleTUBannerAdapter.this;
            pangleTUBannerAdapter.f42611n = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
            pangleTUBannerAdapter.o0 = 50;
            PAGBannerSize bannerSize = PangleTUInitManager.getInstance().getBannerSize(this.o, this.m, this.f42612n);
            if (bannerSize != null) {
                PangleTUBannerAdapter.this.f42611n = bannerSize.getWidth();
                PangleTUBannerAdapter.this.o0 = bannerSize.getHeight();
            }
            PAGBannerRequest pAGBannerRequest = new PAGBannerRequest(bannerSize);
            if (!TextUtils.isEmpty(PangleTUBannerAdapter.this.oo)) {
                pAGBannerRequest.setAdString(PangleTUBannerAdapter.this.oo);
            }
            PangleTUInitManager.setPangleUserData(this.m);
            PangleTUBannerAdapter pangleTUBannerAdapter2 = PangleTUBannerAdapter.this;
            PAGBannerAd.loadAd(pangleTUBannerAdapter2.o, pAGBannerRequest, pangleTUBannerAdapter2.m0);
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        this.m = null;
        PAGBannerAd pAGBannerAd = this.on;
        if (pAGBannerAd != null) {
            pAGBannerAd.setAdInteractionListener(null);
            this.on.destroy();
            this.on = null;
        }
        this.mo = null;
        this.m0 = null;
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.m;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        this.o = TUInitMediation.getStringFromMap(map, "slot_id");
        PangleTUInitManager.getInstance().o(context, map, map2, tUBidRequestInfoListener, true);
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(0, PangleTUAdapter.class);
        return map;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public TUInitMediation getMediationInitManager() {
        return PangleTUInitManager.getInstance();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.mn;
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
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        this.o = TUInitMediation.getStringFromMap(map, "slot_id");
        if (!TextUtils.isEmpty(stringFromMap) && !TextUtils.isEmpty(this.o)) {
            this.oo = TUInitMediation.getStringFromMap(map, "payload");
            PangleTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.pangle.PangleTUBannerAdapter.4
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) PangleTUBannerAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) PangleTUBannerAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    try {
                        PangleTUBannerAdapter.o(PangleTUBannerAdapter.this, context, map, map2);
                    } catch (Throwable th) {
                        if (((TUBaseAdInternalAdapter) PangleTUBannerAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) PangleTUBannerAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
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

    private void o(Context context, Map<String, Object> map, Map<String, Object> map2) {
        postOnMainThread(new AnonymousClass3(context.getApplicationContext(), map, map2));
    }

    public static /* synthetic */ void o(PangleTUBannerAdapter pangleTUBannerAdapter, Context context, Map map, Map map2) {
        pangleTUBannerAdapter.postOnMainThread(pangleTUBannerAdapter.new AnonymousClass3(context.getApplicationContext(), map, map2));
    }
}

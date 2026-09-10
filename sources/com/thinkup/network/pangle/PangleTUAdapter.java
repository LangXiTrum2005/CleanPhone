package com.thinkup.network.pangle;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import com.thinkup.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class PangleTUAdapter extends CustomNativeAdapter {
    String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42608n;
    String o;
    Map<String, Object> o0;
    private final String oo = getClass().getSimpleName();

    /* JADX INFO: renamed from: com.thinkup.network.pangle.PangleTUAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ Context m;
        final /* synthetic */ Map o;

        public AnonymousClass2(Map map, Context context) {
            this.o = map;
            this.m = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
            if (!TextUtils.isEmpty(PangleTUAdapter.this.f42608n)) {
                pAGNativeRequest.setAdString(PangleTUAdapter.this.f42608n);
            }
            PangleTUInitManager.setPangleUserData(this.o);
            PAGNativeAd.loadAd(PangleTUAdapter.this.o, pAGNativeRequest, new PAGNativeAdLoadListener() { // from class: com.thinkup.network.pangle.PangleTUAdapter.2.1
                @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
                public final void onError(int i2, String str) {
                    if (((TUBaseAdInternalAdapter) PangleTUAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) PangleTUAdapter.this).mLoadListener.onAdLoadError(String.valueOf(i2), str);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
                public final void onAdLoaded(PAGNativeAd pAGNativeAd) {
                    if (pAGNativeAd == null) {
                        if (((TUBaseAdInternalAdapter) PangleTUAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) PangleTUAdapter.this).mLoadListener.onAdLoadError("", "Pangle: pagNativeAd = null");
                            return;
                        }
                        return;
                    }
                    try {
                        Map<String, Object> mediaExtraInfo = pAGNativeAd.getMediaExtraInfo();
                        if (mediaExtraInfo != null) {
                            PangleTUAdapter pangleTUAdapter = PangleTUAdapter.this;
                            if (pangleTUAdapter.o0 == null) {
                                pangleTUAdapter.o0 = new HashMap(3);
                            }
                            PangleTUAdapter.this.o0.putAll(mediaExtraInfo);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    ArrayList arrayList = new ArrayList();
                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                    arrayList.add(new PangleTUNativeAd(anonymousClass2.m, PangleTUAdapter.this.o, pAGNativeAd, anonymousClass2.o));
                    if (((TUBaseAdInternalAdapter) PangleTUAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) PangleTUAdapter.this).mLoadListener.onAdCacheLoaded((CustomNativeAd[]) arrayList.toArray(new CustomNativeAd[arrayList.size()]));
                    }
                }
            });
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
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
        return this.o0;
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
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        this.o = TUInitMediation.getStringFromMap(map, "slot_id");
        if (TextUtils.isEmpty(stringFromMap) || TextUtils.isEmpty(this.o)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "toutiao app_id or slot_id is empty!");
                return;
            }
            return;
        }
        this.f42608n = TUInitMediation.getStringFromMap(map, "payload");
        this.m = TUInitMediation.getStringFromMap(map, MBridgeConstans.PROPERTIES_LAYOUT_TYPE, "0");
        if (this.mRequestNum > 3) {
            this.mRequestNum = 3;
        }
        PangleTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.pangle.PangleTUAdapter.1
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                if (((TUBaseAdInternalAdapter) PangleTUAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) PangleTUAdapter.this).mLoadListener.onAdLoadError("", str);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                PangleTUAdapter.o(PangleTUAdapter.this, context, map);
            }
        });
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return PangleTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    private void o(Context context, Map<String, Object> map) {
        postOnMainThread(new AnonymousClass2(map, context.getApplicationContext()));
    }

    public static /* synthetic */ void o(PangleTUAdapter pangleTUAdapter, Context context, Map map) {
        pangleTUAdapter.postOnMainThread(pangleTUAdapter.new AnonymousClass2(map, context.getApplicationContext()));
    }
}

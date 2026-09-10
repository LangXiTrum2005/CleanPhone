package com.thinkup.network.adx;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.format.SDMNative;
import com.smartdigimkt.sdk.api.format.SDMNativeAd;
import com.smartdigimkt.sdk.api.format.SDMNativeLoadListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AdxTUAdapter extends CustomNativeAdapter {
    String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    AdxTUNativeAd f42513n;
    SDMNative o;
    private Map<String, Object> o0 = new HashMap();

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        SDMNative sDMNative = this.o;
        if (sDMNative != null) {
            sDMNative.destroy();
            this.o = null;
        }
        if (this.f42513n != null) {
            this.f42513n = null;
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public Map<String, Object> getAdExtraInfoMap() {
        return this.o0;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public BaseAd getBaseAdObject(Context context) {
        AdxTUNativeAd adxTUNativeAd = this.f42513n;
        if (adxTUNativeAd == null || !adxTUNativeAd.isValid()) {
            return null;
        }
        return this.f42513n;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        AdxTUInitManager.getInstance().o(context, map, map2, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return AdxTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.m;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdxTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.o0.put(SDMAdConst.EXTRA_PARAMS.E_L_PARAMS, 1);
        loadCustomNetworkAd(context, map, map2);
        return true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        final Context applicationContext = context.getApplicationContext();
        String stringFromMap = TUInitMediation.getStringFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PLACEMENT_ID);
        this.m = stringFromMap;
        if (TextUtils.isEmpty(stringFromMap)) {
            notifyATLoadFail("", "placement id is empty");
        } else {
            AdxTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.adx.AdxTUAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    AdxTUAdapter.this.notifyATLoadFail("", str);
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    String stringFromMap2;
                    int i2;
                    Map map3 = map2;
                    int i3 = 0;
                    if (map3 != null) {
                        int intFromMap = TUInitMediation.getIntFromMap(map3, "key_width", 0);
                        int intFromMap2 = TUInitMediation.getIntFromMap(map2, "key_height", 0);
                        stringFromMap2 = TUInitMediation.getStringFromMap(map2, AdxTUConst.NATIVE_VIDEO_AUTO_PLAY, "1");
                        i3 = intFromMap;
                        i2 = intFromMap2;
                    } else {
                        stringFromMap2 = "";
                        i2 = 0;
                    }
                    AdxTUAdapter adxTUAdapter = AdxTUAdapter.this;
                    adxTUAdapter.o = new SDMNative(context, adxTUAdapter.m);
                    SDMAdRequest.Builder customEventMap = new SDMAdRequest.Builder().setExtraMap(map).setCustomEventMap(AdxTUAdapter.this.o0);
                    if (!TextUtils.isEmpty(stringFromMap2)) {
                        customEventMap.setNativeVideoAutoPlay(stringFromMap2);
                    }
                    if (i3 > 0) {
                        customEventMap.setAdWidth(i3);
                    }
                    if (i2 > 0) {
                        customEventMap.setAdHeight(i2);
                    }
                    AdxTUAdapter.this.o.setListener(new SDMNativeLoadListener() { // from class: com.thinkup.network.adx.AdxTUAdapter.1.1
                        @Override // com.smartdigimkt.sdk.api.format.SDMNativeLoadListener
                        public final void onAdLoadFail(AdError adError) {
                            AdxTUAdapter.this.notifyATLoadFail(adError.getCode(), adError.getMessage());
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMNativeLoadListener
                        public final void onAdLoaded(SDMNativeAd sDMNativeAd) {
                            if (sDMNativeAd == null) {
                                AdxTUAdapter.this.notifyATLoadFail("", "return empty");
                                return;
                            }
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            AdxTUNativeAd adxTUNativeAd = new AdxTUNativeAd(applicationContext, sDMNativeAd, AdxTUAdapter.this);
                            if (sDMNativeAd.getSDMAd() != null) {
                                adxTUNativeAd.setNetworkInfoMap(sDMNativeAd.getSDMAd().getExtraInfo());
                            }
                            adxTUNativeAd.setAdObject(AdxTUAdapter.this.o0);
                            if (((TUBaseAdInternalAdapter) AdxTUAdapter.this).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) AdxTUAdapter.this).mLoadListener.onAdCacheLoaded(adxTUNativeAd);
                            } else {
                                AdxTUAdapter.this.f42513n = adxTUNativeAd;
                            }
                        }
                    });
                    AdxTUAdapter.this.o.load(customEventMap.build());
                }
            });
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter
    public void notifyWLInfo(int i2, Map<String, Object> map) {
        SDMNative sDMNative = this.o;
        AdxTUInitManager.getInstance().notifyWLInfo(i2, map, sDMNative != null ? sDMNative.getNativeAd() : null);
    }
}

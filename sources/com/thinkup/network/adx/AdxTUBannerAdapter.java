package com.thinkup.network.adx;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.format.SDMBannerListener;
import com.smartdigimkt.sdk.api.format.SDMBannerView;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUInitMediation;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AdxTUBannerAdapter extends CustomBannerAdapter {
    String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, Object> f42515n = new HashMap();
    SDMBannerView o;

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        SDMBannerView sDMBannerView = this.o;
        if (sDMBannerView != null) {
            sDMBannerView.destroy();
            this.o = null;
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public Map<String, Object> getAdExtraInfoMap() {
        return this.f42515n;
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.o;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        AdxTUInitManager.getInstance().o(context, map, map2, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        SDMBannerView sDMBannerView = this.o;
        if (sDMBannerView == null || sDMBannerView.getSDMAd() == null) {
            return null;
        }
        return this.o.getSDMAd().getExtraInfo();
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
        this.f42515n.put(SDMAdConst.EXTRA_PARAMS.E_L_PARAMS, 1);
        loadCustomNetworkAd(context, map, map2);
        return true;
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        SDMBannerView sDMBannerView = this.o;
        if (sDMBannerView != null) {
            return sDMBannerView.isAdReady();
        }
        return false;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PLACEMENT_ID);
        this.m = stringFromMap;
        if (TextUtils.isEmpty(stringFromMap)) {
            notifyATLoadFail("", "placement id is empty");
        } else {
            final Context applicationContext = context.getApplicationContext();
            AdxTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.adx.AdxTUBannerAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    AdxTUBannerAdapter.this.notifyATLoadFail("", str);
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdxTUBannerAdapter.this.o = new SDMBannerView(applicationContext);
                    AdxTUBannerAdapter adxTUBannerAdapter = AdxTUBannerAdapter.this;
                    adxTUBannerAdapter.o.setPlacementId(adxTUBannerAdapter.m);
                    SDMAdRequest sDMAdRequestBuild = new SDMAdRequest.Builder().setExtraMap(map).setCustomEventMap(AdxTUBannerAdapter.this.f42515n).setAdWidth(TUInitMediation.getIntFromMap(map2, "key_width", 0)).setAdHeight(TUInitMediation.getIntFromMap(map2, "key_height", 0)).setBannerRefresh(false).build();
                    AdxTUBannerAdapter.this.o.setListener(new SDMBannerListener() { // from class: com.thinkup.network.adx.AdxTUBannerAdapter.1.1
                        @Override // com.smartdigimkt.sdk.api.format.SDMBannerListener
                        public final void onAdClick() {
                            CustomBannerEventListener customBannerEventListener = AdxTUBannerAdapter.this.mImpressionEventListener;
                            if (customBannerEventListener != null) {
                                customBannerEventListener.onBannerAdClicked();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMBannerListener
                        public final void onAdClose() {
                            CustomBannerEventListener customBannerEventListener = AdxTUBannerAdapter.this.mImpressionEventListener;
                            if (customBannerEventListener != null) {
                                customBannerEventListener.onBannerAdClose();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMBannerListener
                        public final void onAdLoadFail(AdError adError) {
                            AdxTUBannerAdapter.this.notifyATLoadFail(adError.getCode(), adError.getMessage());
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMBannerListener
                        public final void onAdLoaded() {
                            if (((TUBaseAdInternalAdapter) AdxTUBannerAdapter.this).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) AdxTUBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMBannerListener
                        public final void onAdShow() {
                            CustomBannerEventListener customBannerEventListener = AdxTUBannerAdapter.this.mImpressionEventListener;
                            if (customBannerEventListener != null) {
                                customBannerEventListener.onBannerAdShow();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMBannerListener
                        public final void onDeeplinkCallback(boolean z2) {
                            CustomBannerEventListener customBannerEventListener = AdxTUBannerAdapter.this.mImpressionEventListener;
                            if (customBannerEventListener != null) {
                                customBannerEventListener.onDeeplinkCallback(z2);
                            }
                        }
                    });
                    AdxTUBannerAdapter.this.o.load(sDMAdRequestBuild);
                }
            });
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter
    public void notifyWLInfo(int i2, Map<String, Object> map) {
        AdxTUInitManager.getInstance().notifyWLInfo(i2, map, this.o);
    }
}

package com.thinkup.network.adx;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.x4;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.format.SDMInterstitialAd;
import com.smartdigimkt.sdk.api.format.SDMInterstitialListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AdxTUInterstitialAdapter extends CustomInterstitialAdapter {
    String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, Object> f42519n = new HashMap();
    SDMInterstitialAd o;

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        SDMInterstitialAd sDMInterstitialAd = this.o;
        if (sDMInterstitialAd != null) {
            sDMInterstitialAd.destroy();
            this.o = null;
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public Map<String, Object> getAdExtraInfoMap() {
        return this.f42519n;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        AdxTUInitManager.getInstance().o(context, map, map2, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        SDMInterstitialAd sDMInterstitialAd = this.o;
        if (sDMInterstitialAd == null || sDMInterstitialAd.getSDMAd() == null) {
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
        this.f42519n.put(SDMAdConst.EXTRA_PARAMS.E_L_PARAMS, 1);
        loadCustomNetworkAd(context, map, map2);
        return true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        SDMInterstitialAd sDMInterstitialAd = this.o;
        if (sDMInterstitialAd != null) {
            return sDMInterstitialAd.isAdReady();
        }
        return false;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PLACEMENT_ID);
        this.m = stringFromMap;
        if (TextUtils.isEmpty(stringFromMap)) {
            notifyATLoadFail("", "placement id is empty");
        } else {
            AdxTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.adx.AdxTUInterstitialAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    AdxTUInterstitialAdapter.this.notifyATLoadFail("", str);
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdxTUInterstitialAdapter adxTUInterstitialAdapter = AdxTUInterstitialAdapter.this;
                    adxTUInterstitialAdapter.o = new SDMInterstitialAd(context, adxTUInterstitialAdapter.m);
                    SDMAdRequest sDMAdRequestBuild = new SDMAdRequest.Builder().setExtraMap(map).setCustomEventMap(AdxTUInterstitialAdapter.this.f42519n).build();
                    AdxTUInterstitialAdapter.this.o.setListener(new SDMInterstitialListener() { // from class: com.thinkup.network.adx.AdxTUInterstitialAdapter.1.1
                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdClick() {
                            if (((CustomInterstitialAdapter) AdxTUInterstitialAdapter.this).mImpressListener != null) {
                                ((CustomInterstitialAdapter) AdxTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdClose() {
                            if (((CustomInterstitialAdapter) AdxTUInterstitialAdapter.this).mImpressListener != null) {
                                ((CustomInterstitialAdapter) AdxTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdLoadFail(AdError adError) {
                            AdxTUInterstitialAdapter.this.notifyATLoadFail(adError.getCode(), adError.getMessage());
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdLoaded() {
                            if (((TUBaseAdInternalAdapter) AdxTUInterstitialAdapter.this).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) AdxTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdShow() {
                            if (((CustomInterstitialAdapter) AdxTUInterstitialAdapter.this).mImpressListener != null) {
                                ((CustomInterstitialAdapter) AdxTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdShowFail(AdError adError) {
                            if (((CustomInterstitialAdapter) AdxTUInterstitialAdapter.this).mImpressListener != null) {
                                ((CustomInterstitialAdapter) AdxTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError(adError.getCode(), adError.getMessage());
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdVideoEnd() {
                            if (((CustomInterstitialAdapter) AdxTUInterstitialAdapter.this).mImpressListener != null) {
                                ((CustomInterstitialAdapter) AdxTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoEnd();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdVideoStart() {
                            if (((CustomInterstitialAdapter) AdxTUInterstitialAdapter.this).mImpressListener != null) {
                                ((CustomInterstitialAdapter) AdxTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoStart();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onDeeplinkCallback(boolean z2) {
                            if (((CustomInterstitialAdapter) AdxTUInterstitialAdapter.this).mImpressListener != null) {
                                ((CustomInterstitialAdapter) AdxTUInterstitialAdapter.this).mImpressListener.onDeeplinkCallback(z2);
                            }
                        }
                    });
                    AdxTUInterstitialAdapter.this.o.load(sDMAdRequestBuild);
                }
            });
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter
    public void notifyWLInfo(int i2, Map<String, Object> map) {
        AdxTUInitManager.getInstance().notifyWLInfo(i2, map, this.o);
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        if (this.o != null) {
            this.f42519n.put("extra_scenario", this.mScenario);
            this.o.show(activity);
        } else {
            CustomInterstitialEventListener customInterstitialEventListener = this.mImpressListener;
            if (customInterstitialEventListener != null) {
                customInterstitialEventListener.onInterstitialAdVideoError(x4.DISABLED_AUCTION_FALLBACK_ID, "sdmInterstitialAd is empty");
            }
        }
    }
}

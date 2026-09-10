package com.thinkup.network.adx;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.format.SDMSplashAd;
import com.smartdigimkt.sdk.api.format.SDMSplashAdExtraInfo;
import com.smartdigimkt.sdk.api.format.SDMSplashListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AdxTUSplashAdapter extends CustomSplashAdapter {
    String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, Object> f42524n = new HashMap();
    SDMSplashAd o;

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        SDMSplashAd sDMSplashAd = this.o;
        if (sDMSplashAd != null) {
            sDMSplashAd.destroy();
            this.o = null;
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public Map<String, Object> getAdExtraInfoMap() {
        return this.f42524n;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        AdxTUInitManager.getInstance().o(context, map, map2, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        SDMSplashAd sDMSplashAd = this.o;
        if (sDMSplashAd == null || sDMSplashAd == null) {
            return null;
        }
        return sDMSplashAd.getSDMAd().getExtraInfo();
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
        this.f42524n.put(SDMAdConst.EXTRA_PARAMS.E_L_PARAMS, 1);
        loadCustomNetworkAd(context, map, map2);
        return true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        SDMSplashAd sDMSplashAd = this.o;
        if (sDMSplashAd != null) {
            return sDMSplashAd.isAdReady();
        }
        return false;
    }

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashAdapter
    public boolean isSupportCustomSkipView() {
        SDMSplashAd sDMSplashAd = this.o;
        return sDMSplashAd != null && sDMSplashAd.isSupportCustomSkipView();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PLACEMENT_ID);
        this.m = stringFromMap;
        if (TextUtils.isEmpty(stringFromMap)) {
            notifyATLoadFail("", "placement id is empty");
        } else {
            AdxTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.adx.AdxTUSplashAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    AdxTUSplashAdapter.this.notifyATLoadFail("", str);
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdxTUSplashAdapter adxTUSplashAdapter = AdxTUSplashAdapter.this;
                    adxTUSplashAdapter.o = new SDMSplashAd(context, adxTUSplashAdapter.m, ((TUBaseAdInternalAdapter) adxTUSplashAdapter).mFetchAdTimeout);
                    SDMAdRequest sDMAdRequestBuild = new SDMAdRequest.Builder().setExtraMap(map).setCustomEventMap(AdxTUSplashAdapter.this.f42524n).setAdWidth(TUInitMediation.getIntFromMap(map2, "key_width", 0)).setAdHeight(TUInitMediation.getIntFromMap(map2, "key_height", 0)).build();
                    AdxTUSplashAdapter.this.o.setListener(new SDMSplashListener() { // from class: com.thinkup.network.adx.AdxTUSplashAdapter.1.1
                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onAdClick() {
                            if (((CustomSplashAdapter) AdxTUSplashAdapter.this).mImpressionListener != null) {
                                ((CustomSplashAdapter) AdxTUSplashAdapter.this).mImpressionListener.onSplashAdClicked();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onAdClose(SDMSplashAdExtraInfo sDMSplashAdExtraInfo) {
                            if (sDMSplashAdExtraInfo != null) {
                                ((TUBaseAdInternalAdapter) AdxTUSplashAdapter.this).mDismissType = sDMSplashAdExtraInfo.getDismissType();
                            }
                            if (((CustomSplashAdapter) AdxTUSplashAdapter.this).mImpressionListener != null) {
                                ((CustomSplashAdapter) AdxTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onAdLoadFail(AdError adError) {
                            AdxTUSplashAdapter.this.notifyATLoadFail(adError.getCode(), adError.getMessage());
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onAdLoadTimeout() {
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onAdLoaded(boolean z2) {
                            if (((TUBaseAdInternalAdapter) AdxTUSplashAdapter.this).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) AdxTUSplashAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onAdShow() {
                            if (((CustomSplashAdapter) AdxTUSplashAdapter.this).mImpressionListener != null) {
                                ((CustomSplashAdapter) AdxTUSplashAdapter.this).mImpressionListener.onSplashAdShow();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onAdShowFail(AdError adError) {
                            if (((CustomSplashAdapter) AdxTUSplashAdapter.this).mImpressionListener != null) {
                                ((CustomSplashAdapter) AdxTUSplashAdapter.this).mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, adError.getCode(), adError.getMessage()));
                                ((CustomSplashAdapter) AdxTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onDeeplinkCallback(boolean z2) {
                            if (((CustomSplashAdapter) AdxTUSplashAdapter.this).mImpressionListener != null) {
                                ((CustomSplashAdapter) AdxTUSplashAdapter.this).mImpressionListener.onDeeplinkCallback(z2);
                            }
                        }
                    });
                    AdxTUSplashAdapter.this.o.load(sDMAdRequestBuild);
                }
            });
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter
    public void notifyWLInfo(int i2, Map<String, Object> map) {
        AdxTUInitManager.getInstance().notifyWLInfo(i2, map, this.o);
    }

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        if (this.o != null) {
            if (isCustomSkipView()) {
                this.f42524n.put(SDMAdConst.EXTRA_PARAMS.SHOW_HIDE_SPLASH_SKIP_VIEW, Boolean.TRUE);
            }
            this.o.show(viewGroup);
        }
    }
}

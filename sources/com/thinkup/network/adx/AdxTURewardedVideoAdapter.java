package com.thinkup.network.adx;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.x4;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.format.SDMRewardVideoListener;
import com.smartdigimkt.sdk.api.format.SDMRewardedVideoAd;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AdxTURewardedVideoAdapter extends CustomRewardVideoAdapter {
    String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, Object> f42522n = new HashMap();
    SDMRewardedVideoAd o;

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        SDMRewardedVideoAd sDMRewardedVideoAd = this.o;
        if (sDMRewardedVideoAd != null) {
            sDMRewardedVideoAd.destroy();
            this.o = null;
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public Map<String, Object> getAdExtraInfoMap() {
        return this.f42522n;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        AdxTUInitManager.getInstance().o(context, map, map2, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        SDMRewardedVideoAd sDMRewardedVideoAd = this.o;
        if (sDMRewardedVideoAd == null || sDMRewardedVideoAd.getSDMAd() == null) {
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
        this.f42522n.put(SDMAdConst.EXTRA_PARAMS.E_L_PARAMS, 1);
        loadCustomNetworkAd(context, map, map2);
        return true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        SDMRewardedVideoAd sDMRewardedVideoAd = this.o;
        if (sDMRewardedVideoAd != null) {
            return sDMRewardedVideoAd.isAdReady();
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
            AdxTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.adx.AdxTURewardedVideoAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    AdxTURewardedVideoAdapter.this.notifyATLoadFail("", str);
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdxTURewardedVideoAdapter adxTURewardedVideoAdapter = AdxTURewardedVideoAdapter.this;
                    adxTURewardedVideoAdapter.o = new SDMRewardedVideoAd(context, adxTURewardedVideoAdapter.m);
                    SDMAdRequest sDMAdRequestBuild = new SDMAdRequest.Builder().setExtraMap(map).setCustomEventMap(AdxTURewardedVideoAdapter.this.f42522n).build();
                    AdxTURewardedVideoAdapter.this.o.setListener(new SDMRewardVideoListener() { // from class: com.thinkup.network.adx.AdxTURewardedVideoAdapter.1.1
                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdClick() {
                            if (((CustomRewardVideoAdapter) AdxTURewardedVideoAdapter.this).mImpressionListener != null) {
                                ((CustomRewardVideoAdapter) AdxTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdClose() {
                            if (((CustomRewardVideoAdapter) AdxTURewardedVideoAdapter.this).mImpressionListener != null) {
                                ((CustomRewardVideoAdapter) AdxTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdLoadFail(AdError adError) {
                            AdxTURewardedVideoAdapter.this.notifyATLoadFail(adError.getCode(), adError.getMessage());
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdLoaded() {
                            if (((TUBaseAdInternalAdapter) AdxTURewardedVideoAdapter.this).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) AdxTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdPlayEnd() {
                            if (((CustomRewardVideoAdapter) AdxTURewardedVideoAdapter.this).mImpressionListener != null) {
                                ((CustomRewardVideoAdapter) AdxTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdPlayFailed(AdError adError) {
                            if (((CustomRewardVideoAdapter) AdxTURewardedVideoAdapter.this).mImpressionListener != null) {
                                ((CustomRewardVideoAdapter) AdxTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(adError.getCode(), adError.getMessage());
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdPlayStart() {
                            if (((CustomRewardVideoAdapter) AdxTURewardedVideoAdapter.this).mImpressionListener != null) {
                                ((CustomRewardVideoAdapter) AdxTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdReward() {
                            if (((CustomRewardVideoAdapter) AdxTURewardedVideoAdapter.this).mImpressionListener != null) {
                                ((CustomRewardVideoAdapter) AdxTURewardedVideoAdapter.this).mImpressionListener.onReward();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onDeeplinkCallback(boolean z2) {
                            if (((CustomRewardVideoAdapter) AdxTURewardedVideoAdapter.this).mImpressionListener != null) {
                                ((CustomRewardVideoAdapter) AdxTURewardedVideoAdapter.this).mImpressionListener.onDeeplinkCallback(z2);
                            }
                        }
                    });
                    AdxTURewardedVideoAdapter.this.o.load(sDMAdRequestBuild);
                }
            });
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter
    public void notifyWLInfo(int i2, Map<String, Object> map) {
        AdxTUInitManager.getInstance().notifyWLInfo(i2, map, this.o);
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        if (this.o != null) {
            this.f42522n.put("extra_scenario", this.mScenario);
            this.o.show(activity);
        } else {
            CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
            if (customRewardedVideoEventListener != null) {
                customRewardedVideoEventListener.onRewardedVideoAdPlayFailed(x4.DISABLED_AUCTION_FALLBACK_ID, "sdmRewardedVideoAd is empty");
            }
        }
    }
}

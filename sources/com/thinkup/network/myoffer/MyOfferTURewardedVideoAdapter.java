package com.thinkup.network.myoffer;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.x4;
import com.smartdigimkt.s8.a;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.format.SDMRewardVideoListener;
import com.smartdigimkt.sdk.api.format.myoffer.SDMMyOfferRewardedVideoAd;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.network.adx.AdxTUInitManager;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MyOfferTURewardedVideoAdapter extends CustomRewardVideoAdapter {
    String m;
    SDMMyOfferRewardedVideoAd o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42604n = "";
    private Map<String, Object> o0 = new HashMap();

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        SDMMyOfferRewardedVideoAd sDMMyOfferRewardedVideoAd = this.o;
        if (sDMMyOfferRewardedVideoAd != null) {
            sDMMyOfferRewardedVideoAd.destroy();
            this.o = null;
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        SDMMyOfferRewardedVideoAd sDMMyOfferRewardedVideoAd = this.o;
        if (sDMMyOfferRewardedVideoAd != null) {
            return sDMMyOfferRewardedVideoAd.getExtraInfoMap();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f42604n;
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
    public boolean isAdReady() {
        SDMMyOfferRewardedVideoAd sDMMyOfferRewardedVideoAd = this.o;
        if (sDMMyOfferRewardedVideoAd != null) {
            return sDMMyOfferRewardedVideoAd.isAdReady();
        }
        return false;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, Map<String, Object> map2) {
        this.f42604n = TUInitMediation.getStringFromMap(map, a.C0584a.f38219e, "");
        String stringFromMap = TUInitMediation.getStringFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PLACEMENT_ID);
        this.m = stringFromMap;
        if (TextUtils.isEmpty(stringFromMap)) {
            notifyATLoadFail("", "placement id is empty");
        } else {
            AdxTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.myoffer.MyOfferTURewardedVideoAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    MyOfferTURewardedVideoAdapter.this.notifyATLoadFail("", str);
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    MyOfferTURewardedVideoAdapter myOfferTURewardedVideoAdapter = MyOfferTURewardedVideoAdapter.this;
                    myOfferTURewardedVideoAdapter.o = new SDMMyOfferRewardedVideoAd(context, myOfferTURewardedVideoAdapter.m);
                    SDMAdRequest sDMAdRequestBuild = new SDMAdRequest.Builder().setExtraMap(map).setCustomEventMap(MyOfferTURewardedVideoAdapter.this.o0).build();
                    MyOfferTURewardedVideoAdapter.this.o.setListener(new SDMRewardVideoListener() { // from class: com.thinkup.network.myoffer.MyOfferTURewardedVideoAdapter.1.1
                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdClick() {
                            if (((CustomRewardVideoAdapter) MyOfferTURewardedVideoAdapter.this).mImpressionListener != null) {
                                ((CustomRewardVideoAdapter) MyOfferTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdClose() {
                            if (((CustomRewardVideoAdapter) MyOfferTURewardedVideoAdapter.this).mImpressionListener != null) {
                                ((CustomRewardVideoAdapter) MyOfferTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdLoadFail(AdError adError) {
                            MyOfferTURewardedVideoAdapter.this.notifyATLoadFail(adError.getCode(), adError.getMessage());
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdLoaded() {
                            if (((TUBaseAdInternalAdapter) MyOfferTURewardedVideoAdapter.this).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) MyOfferTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdPlayEnd() {
                            if (((CustomRewardVideoAdapter) MyOfferTURewardedVideoAdapter.this).mImpressionListener != null) {
                                ((CustomRewardVideoAdapter) MyOfferTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdPlayFailed(AdError adError) {
                            if (((CustomRewardVideoAdapter) MyOfferTURewardedVideoAdapter.this).mImpressionListener != null) {
                                ((CustomRewardVideoAdapter) MyOfferTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(adError.getCode(), adError.getMessage());
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdPlayStart() {
                            if (((CustomRewardVideoAdapter) MyOfferTURewardedVideoAdapter.this).mImpressionListener != null) {
                                ((CustomRewardVideoAdapter) MyOfferTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onAdReward() {
                            if (((CustomRewardVideoAdapter) MyOfferTURewardedVideoAdapter.this).mImpressionListener != null) {
                                ((CustomRewardVideoAdapter) MyOfferTURewardedVideoAdapter.this).mImpressionListener.onReward();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMRewardVideoListener
                        public final void onDeeplinkCallback(boolean z2) {
                            if (((CustomRewardVideoAdapter) MyOfferTURewardedVideoAdapter.this).mImpressionListener != null) {
                                ((CustomRewardVideoAdapter) MyOfferTURewardedVideoAdapter.this).mImpressionListener.onDeeplinkCallback(z2);
                            }
                        }
                    });
                    MyOfferTURewardedVideoAdapter.this.o.load(sDMAdRequestBuild);
                }
            });
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        if (this.o != null) {
            this.o0.put("extra_scenario", this.mScenario);
            this.o.show(activity);
        } else {
            CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
            if (customRewardedVideoEventListener != null) {
                customRewardedVideoEventListener.onRewardedVideoAdPlayFailed(x4.DISABLED_AUCTION_FALLBACK_ID, "sdmRewardedVideoAd is empty");
            }
        }
    }
}

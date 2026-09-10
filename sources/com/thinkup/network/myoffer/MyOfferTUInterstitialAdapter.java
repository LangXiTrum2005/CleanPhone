package com.thinkup.network.myoffer;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.s8.a;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.format.SDMInterstitialListener;
import com.smartdigimkt.sdk.api.format.myoffer.SDMMyOfferInterstitialAd;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.thinkup.network.adx.AdxTUInitManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MyOfferTUInterstitialAdapter extends CustomInterstitialAdapter {
    String m;
    SDMMyOfferInterstitialAd o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42601n = "";
    private Map<String, Object> o0 = new HashMap();

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        SDMMyOfferInterstitialAd sDMMyOfferInterstitialAd = this.o;
        if (sDMMyOfferInterstitialAd != null) {
            sDMMyOfferInterstitialAd.destroy();
            this.o = null;
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        SDMMyOfferInterstitialAd sDMMyOfferInterstitialAd = this.o;
        if (sDMMyOfferInterstitialAd != null) {
            return sDMMyOfferInterstitialAd.getExtraInfoMap();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f42601n;
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
        SDMMyOfferInterstitialAd sDMMyOfferInterstitialAd = this.o;
        if (sDMMyOfferInterstitialAd != null) {
            return sDMMyOfferInterstitialAd.isAdReady();
        }
        return false;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, Map<String, Object> map2) {
        this.f42601n = TUInitMediation.getStringFromMap(map, a.C0584a.f38219e, "");
        String stringFromMap = TUInitMediation.getStringFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PLACEMENT_ID);
        this.m = stringFromMap;
        if (TextUtils.isEmpty(stringFromMap)) {
            notifyATLoadFail("", "placement id is empty");
        } else {
            AdxTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.myoffer.MyOfferTUInterstitialAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    MyOfferTUInterstitialAdapter.this.notifyATLoadFail("", str);
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    MyOfferTUInterstitialAdapter myOfferTUInterstitialAdapter = MyOfferTUInterstitialAdapter.this;
                    myOfferTUInterstitialAdapter.o = new SDMMyOfferInterstitialAd(context, myOfferTUInterstitialAdapter.m);
                    SDMAdRequest sDMAdRequestBuild = new SDMAdRequest.Builder().setExtraMap(map).setCustomEventMap(MyOfferTUInterstitialAdapter.this.o0).build();
                    MyOfferTUInterstitialAdapter.this.o.setListener(new SDMInterstitialListener() { // from class: com.thinkup.network.myoffer.MyOfferTUInterstitialAdapter.1.1
                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdClick() {
                            if (((CustomInterstitialAdapter) MyOfferTUInterstitialAdapter.this).mImpressListener != null) {
                                ((CustomInterstitialAdapter) MyOfferTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdClose() {
                            if (((CustomInterstitialAdapter) MyOfferTUInterstitialAdapter.this).mImpressListener != null) {
                                ((CustomInterstitialAdapter) MyOfferTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdLoadFail(AdError adError) {
                            MyOfferTUInterstitialAdapter.this.notifyATLoadFail(adError.getCode(), adError.getMessage());
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdLoaded() {
                            if (((TUBaseAdInternalAdapter) MyOfferTUInterstitialAdapter.this).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) MyOfferTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdShow() {
                            if (((CustomInterstitialAdapter) MyOfferTUInterstitialAdapter.this).mImpressListener != null) {
                                ((CustomInterstitialAdapter) MyOfferTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdShowFail(AdError adError) {
                            if (((CustomInterstitialAdapter) MyOfferTUInterstitialAdapter.this).mImpressListener != null) {
                                ((CustomInterstitialAdapter) MyOfferTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError(adError.getCode(), adError.getMessage());
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdVideoEnd() {
                            if (((CustomInterstitialAdapter) MyOfferTUInterstitialAdapter.this).mImpressListener != null) {
                                ((CustomInterstitialAdapter) MyOfferTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoEnd();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onAdVideoStart() {
                            if (((CustomInterstitialAdapter) MyOfferTUInterstitialAdapter.this).mImpressListener != null) {
                                ((CustomInterstitialAdapter) MyOfferTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoStart();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMInterstitialListener
                        public final void onDeeplinkCallback(boolean z2) {
                            if (((CustomInterstitialAdapter) MyOfferTUInterstitialAdapter.this).mImpressListener != null) {
                                ((CustomInterstitialAdapter) MyOfferTUInterstitialAdapter.this).mImpressListener.onDeeplinkCallback(z2);
                            }
                        }
                    });
                    MyOfferTUInterstitialAdapter.this.o.load(sDMAdRequestBuild);
                }
            });
        }
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            this.o0.put("extra_scenario", this.mScenario);
            this.o.show(activity);
        }
    }
}

package com.thinkup.network.myoffer;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.smartdigimkt.s8.a;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.format.SDMBannerListener;
import com.smartdigimkt.sdk.api.format.myoffer.SDMMyOfferBannerView;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.network.adx.AdxTUInitManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MyOfferTUBannerAdapter extends CustomBannerAdapter {
    String m;
    SDMMyOfferBannerView o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42599n = "";
    private Map<String, Object> o0 = new HashMap();

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        SDMMyOfferBannerView sDMMyOfferBannerView = this.o;
        if (sDMMyOfferBannerView != null) {
            sDMMyOfferBannerView.destroy();
            this.o = null;
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.o;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        SDMMyOfferBannerView sDMMyOfferBannerView = this.o;
        if (sDMMyOfferBannerView != null) {
            return sDMMyOfferBannerView.getExtraInfoMap();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f42599n;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return nn.o();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.o0.put(SDMAdConst.EXTRA_PARAMS.E_L_PARAMS, 1);
        loadCustomNetworkAd(context, map, map2);
        return true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.f42599n = TUInitMediation.getStringFromMap(map, a.C0584a.f38219e, "");
        String stringFromMap = TUInitMediation.getStringFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PLACEMENT_ID);
        this.m = stringFromMap;
        if (TextUtils.isEmpty(stringFromMap)) {
            notifyATLoadFail("", "placement id is empty");
        } else {
            AdxTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.myoffer.MyOfferTUBannerAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    MyOfferTUBannerAdapter.this.notifyATLoadFail("", str);
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    MyOfferTUBannerAdapter.this.o = new SDMMyOfferBannerView(context);
                    MyOfferTUBannerAdapter myOfferTUBannerAdapter = MyOfferTUBannerAdapter.this;
                    myOfferTUBannerAdapter.o.setPlacementId(myOfferTUBannerAdapter.m);
                    SDMAdRequest sDMAdRequestBuild = new SDMAdRequest.Builder().setExtraMap(map).setCustomEventMap(MyOfferTUBannerAdapter.this.o0).setAdWidth(TUInitMediation.getIntFromMap(map2, "key_width", 0)).setAdHeight(TUInitMediation.getIntFromMap(map2, "key_height", 0)).setBannerRefresh(false).build();
                    MyOfferTUBannerAdapter.this.o.setListener(new SDMBannerListener() { // from class: com.thinkup.network.myoffer.MyOfferTUBannerAdapter.1.1
                        @Override // com.smartdigimkt.sdk.api.format.SDMBannerListener
                        public final void onAdClick() {
                            CustomBannerEventListener customBannerEventListener = MyOfferTUBannerAdapter.this.mImpressionEventListener;
                            if (customBannerEventListener != null) {
                                customBannerEventListener.onBannerAdClicked();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMBannerListener
                        public final void onAdClose() {
                            CustomBannerEventListener customBannerEventListener = MyOfferTUBannerAdapter.this.mImpressionEventListener;
                            if (customBannerEventListener != null) {
                                customBannerEventListener.onBannerAdClose();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMBannerListener
                        public final void onAdLoadFail(AdError adError) {
                            MyOfferTUBannerAdapter.this.notifyATLoadFail(adError.getCode(), adError.getMessage());
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMBannerListener
                        public final void onAdLoaded() {
                            if (((TUBaseAdInternalAdapter) MyOfferTUBannerAdapter.this).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) MyOfferTUBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMBannerListener
                        public final void onAdShow() {
                            CustomBannerEventListener customBannerEventListener = MyOfferTUBannerAdapter.this.mImpressionEventListener;
                            if (customBannerEventListener != null) {
                                customBannerEventListener.onBannerAdShow();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMBannerListener
                        public final void onDeeplinkCallback(boolean z2) {
                            CustomBannerEventListener customBannerEventListener = MyOfferTUBannerAdapter.this.mImpressionEventListener;
                            if (customBannerEventListener != null) {
                                customBannerEventListener.onDeeplinkCallback(z2);
                            }
                        }
                    });
                    MyOfferTUBannerAdapter.this.o.load(sDMAdRequestBuild);
                }
            });
        }
    }
}

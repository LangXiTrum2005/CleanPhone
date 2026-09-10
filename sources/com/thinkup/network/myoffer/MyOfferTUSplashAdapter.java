package com.thinkup.network.myoffer;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.smartdigimkt.s8.a;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.format.SDMSplashAdExtraInfo;
import com.smartdigimkt.sdk.api.format.SDMSplashListener;
import com.smartdigimkt.sdk.api.format.myoffer.SDMMyOfferSplashAd;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.network.adx.AdxTUInitManager;
import com.thinkup.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MyOfferTUSplashAdapter extends CustomSplashAdapter {
    String m;
    SDMMyOfferSplashAd o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42606n = "";
    private Map<String, Object> o0 = new HashMap();

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        SDMMyOfferSplashAd sDMMyOfferSplashAd = this.o;
        if (sDMMyOfferSplashAd != null) {
            sDMMyOfferSplashAd.destroy();
            this.o = null;
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        SDMMyOfferSplashAd sDMMyOfferSplashAd = this.o;
        if (sDMMyOfferSplashAd != null) {
            return sDMMyOfferSplashAd.getExtraInfoMap();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f42606n;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdxTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        SDMMyOfferSplashAd sDMMyOfferSplashAd = this.o;
        if (sDMMyOfferSplashAd != null) {
            return sDMMyOfferSplashAd.isAdReady();
        }
        return false;
    }

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashAdapter
    public boolean isSupportCustomSkipView() {
        return true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.f42606n = TUInitMediation.getStringFromMap(map, a.C0584a.f38219e, "");
        String stringFromMap = TUInitMediation.getStringFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PLACEMENT_ID);
        this.m = stringFromMap;
        if (TextUtils.isEmpty(stringFromMap)) {
            notifyATLoadFail("", "placement id is empty");
        } else {
            AdxTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.myoffer.MyOfferTUSplashAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    MyOfferTUSplashAdapter.this.notifyATLoadFail("", str);
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    MyOfferTUSplashAdapter myOfferTUSplashAdapter = MyOfferTUSplashAdapter.this;
                    myOfferTUSplashAdapter.o = new SDMMyOfferSplashAd(context, myOfferTUSplashAdapter.m, ((TUBaseAdInternalAdapter) myOfferTUSplashAdapter).mFetchAdTimeout);
                    SDMAdRequest sDMAdRequestBuild = new SDMAdRequest.Builder().setExtraMap(map).setCustomEventMap(MyOfferTUSplashAdapter.this.o0).setAdWidth(TUInitMediation.getIntFromMap(map2, "key_width", 0)).setAdHeight(TUInitMediation.getIntFromMap(map2, "key_height", 0)).build();
                    MyOfferTUSplashAdapter.this.o.setListener(new SDMSplashListener() { // from class: com.thinkup.network.myoffer.MyOfferTUSplashAdapter.1.1
                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onAdClick() {
                            if (((CustomSplashAdapter) MyOfferTUSplashAdapter.this).mImpressionListener != null) {
                                ((CustomSplashAdapter) MyOfferTUSplashAdapter.this).mImpressionListener.onSplashAdClicked();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onAdClose(SDMSplashAdExtraInfo sDMSplashAdExtraInfo) {
                            if (sDMSplashAdExtraInfo != null) {
                                ((TUBaseAdInternalAdapter) MyOfferTUSplashAdapter.this).mDismissType = sDMSplashAdExtraInfo.getDismissType();
                            }
                            if (((CustomSplashAdapter) MyOfferTUSplashAdapter.this).mImpressionListener != null) {
                                ((CustomSplashAdapter) MyOfferTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onAdLoadFail(AdError adError) {
                            MyOfferTUSplashAdapter.this.notifyATLoadFail(adError.getCode(), adError.getMessage());
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onAdLoadTimeout() {
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onAdLoaded(boolean z2) {
                            if (((TUBaseAdInternalAdapter) MyOfferTUSplashAdapter.this).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) MyOfferTUSplashAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onAdShow() {
                            if (((CustomSplashAdapter) MyOfferTUSplashAdapter.this).mImpressionListener != null) {
                                ((CustomSplashAdapter) MyOfferTUSplashAdapter.this).mImpressionListener.onSplashAdShow();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onAdShowFail(AdError adError) {
                            if (((CustomSplashAdapter) MyOfferTUSplashAdapter.this).mImpressionListener != null) {
                                ((CustomSplashAdapter) MyOfferTUSplashAdapter.this).mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, adError.getCode(), adError.getMessage()));
                                ((CustomSplashAdapter) MyOfferTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                            }
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMSplashListener
                        public final void onDeeplinkCallback(boolean z2) {
                            if (((CustomSplashAdapter) MyOfferTUSplashAdapter.this).mImpressionListener != null) {
                                ((CustomSplashAdapter) MyOfferTUSplashAdapter.this).mImpressionListener.onDeeplinkCallback(z2);
                            }
                        }
                    });
                    MyOfferTUSplashAdapter.this.o.load(sDMAdRequestBuild);
                }
            });
        }
    }

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        if (this.o != null) {
            if (isCustomSkipView()) {
                this.o0.put(SDMAdConst.EXTRA_PARAMS.SHOW_HIDE_SPLASH_SKIP_VIEW, Boolean.TRUE);
            }
            this.o.show(viewGroup);
        }
    }
}

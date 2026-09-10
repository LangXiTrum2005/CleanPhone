package com.thinkup.network.myoffer;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.s8.a;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.format.SDMNativeAd;
import com.smartdigimkt.sdk.api.format.SDMNativeLoadListener;
import com.smartdigimkt.sdk.api.format.myoffer.SDMMyOfferNative;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.nativead.unitgroup.api.CustomNativeAdapter;
import com.thinkup.network.adx.AdxTUConst;
import com.thinkup.network.adx.AdxTUInitManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MyOfferTUAdapter extends CustomNativeAdapter {
    String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    MyOfferTUNativeAd f42597n;
    SDMMyOfferNative o;
    private String o0 = "";
    private Map<String, Object> oo = new HashMap();

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        SDMMyOfferNative sDMMyOfferNative = this.o;
        if (sDMMyOfferNative != null) {
            sDMMyOfferNative.destroy();
            this.o = null;
        }
        if (this.f42597n != null) {
            this.f42597n = null;
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public BaseAd getBaseAdObject(Context context) {
        MyOfferTUNativeAd myOfferTUNativeAd = this.f42597n;
        if (myOfferTUNativeAd == null || !myOfferTUNativeAd.isValid()) {
            return null;
        }
        return this.f42597n;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o0;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdxTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.oo.put(SDMAdConst.EXTRA_PARAMS.E_L_PARAMS, 1);
        loadCustomNetworkAd(context, map, map2);
        return true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.o0 = TUInitMediation.getStringFromMap(map, a.C0584a.f38219e, "");
        String stringFromMap = TUInitMediation.getStringFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PLACEMENT_ID);
        this.m = stringFromMap;
        if (TextUtils.isEmpty(stringFromMap)) {
            notifyATLoadFail("", "placement id is empty");
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        String stringFromMap2 = TUInitMediation.getStringFromMap(map, TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PLACEMENT_ID);
        this.m = stringFromMap2;
        if (TextUtils.isEmpty(stringFromMap2)) {
            notifyATLoadFail("", "placement id is empty");
        } else {
            AdxTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.myoffer.MyOfferTUAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    MyOfferTUAdapter.this.notifyATLoadFail("", str);
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    String stringFromMap3;
                    int i2;
                    Map map3 = map2;
                    int i3 = 0;
                    if (map3 != null) {
                        int intFromMap = TUInitMediation.getIntFromMap(map3, "key_width", 0);
                        int intFromMap2 = TUInitMediation.getIntFromMap(map2, "key_height", 0);
                        stringFromMap3 = TUInitMediation.getStringFromMap(map2, AdxTUConst.NATIVE_VIDEO_AUTO_PLAY, "1");
                        i3 = intFromMap;
                        i2 = intFromMap2;
                    } else {
                        stringFromMap3 = "";
                        i2 = 0;
                    }
                    MyOfferTUAdapter myOfferTUAdapter = MyOfferTUAdapter.this;
                    myOfferTUAdapter.o = new SDMMyOfferNative(context, myOfferTUAdapter.m);
                    SDMAdRequest.Builder customEventMap = new SDMAdRequest.Builder().setExtraMap(map).setCustomEventMap(MyOfferTUAdapter.this.oo);
                    if (!TextUtils.isEmpty(stringFromMap3)) {
                        customEventMap.setNativeVideoAutoPlay(stringFromMap3);
                    }
                    if (i3 > 0) {
                        customEventMap.setAdWidth(i3);
                    }
                    if (i2 > 0) {
                        customEventMap.setAdHeight(i2);
                    }
                    MyOfferTUAdapter.this.o.setListener(new SDMNativeLoadListener() { // from class: com.thinkup.network.myoffer.MyOfferTUAdapter.1.1
                        @Override // com.smartdigimkt.sdk.api.format.SDMNativeLoadListener
                        public final void onAdLoadFail(AdError adError) {
                            MyOfferTUAdapter.this.notifyATLoadFail(adError.getCode(), adError.getMessage());
                        }

                        @Override // com.smartdigimkt.sdk.api.format.SDMNativeLoadListener
                        public final void onAdLoaded(SDMNativeAd sDMNativeAd) {
                            if (sDMNativeAd == null) {
                                MyOfferTUAdapter.this.notifyATLoadFail("", "return empty");
                                return;
                            }
                            MyOfferTUNativeAd myOfferTUNativeAd = new MyOfferTUNativeAd(applicationContext, sDMNativeAd);
                            myOfferTUNativeAd.setNetworkInfoMap(MyOfferTUAdapter.this.o.getExtraInfoMap());
                            if (((TUBaseAdInternalAdapter) MyOfferTUAdapter.this).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) MyOfferTUAdapter.this).mLoadListener.onAdCacheLoaded(myOfferTUNativeAd);
                            } else {
                                MyOfferTUAdapter.this.f42597n = myOfferTUNativeAd;
                            }
                        }
                    });
                    MyOfferTUAdapter.this.o.load(customEventMap.build());
                }
            });
        }
    }
}

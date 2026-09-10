package com.thinkup.network.startapp;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.sdk.ads.nativead.NativeAdDetails;
import com.startapp.sdk.ads.nativead.NativeAdPreferences;
import com.startapp.sdk.ads.nativead.StartAppNativeAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import com.thinkup.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class StartAppTUAdapter extends CustomNativeAdapter {
    String o = "";
    String m = "";

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        StartAppTUInitManager.getInstance().o(context, map, map2, tUBidRequestInfoListener, 0);
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return StartAppTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return StartAppTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        this.o = TUInitMediation.getStringFromMap(map, "ad_tag");
        this.m = TUInitMediation.getStringFromMap(map, "payload");
        if (!TextUtils.isEmpty(stringFromMap)) {
            StartAppTUInitManager.getInstance().initSDK(context, map);
            startAdLoad(context, map, map2);
        } else {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "app_id could not be null.");
            }
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return StartAppTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    public void startAdLoad(Context context, Map<String, Object> map, Map<String, Object> map2) {
        final StartAppNativeAd startAppNativeAd = new StartAppNativeAd(context.getApplicationContext());
        NativeAdPreferences adsNumber = new NativeAdPreferences().setAdsNumber(this.mRequestNum);
        if (!TextUtils.isEmpty(this.o)) {
            adsNumber.setAdTag(this.o);
        }
        StartAppTUInitManager.getInstance();
        StartAppTUInitManager.o(adsNumber, map);
        try {
            if (map2.containsKey(TUAdConst.KEY.START_APP_PRIMARY_IMAGE_SIZE)) {
                adsNumber.setPrimaryImageSize(Integer.parseInt(map2.get(TUAdConst.KEY.START_APP_PRIMARY_IMAGE_SIZE).toString()));
            }
        } catch (Throwable unused) {
        }
        try {
            if (map2.containsKey(TUAdConst.KEY.START_APP_SECONDARY_IMAGE_SIZE)) {
                adsNumber.setSecondaryImageSize(Integer.parseInt(map2.get(TUAdConst.KEY.START_APP_SECONDARY_IMAGE_SIZE).toString()));
            }
        } catch (Throwable unused2) {
        }
        startAppNativeAd.loadAd(adsNumber, new AdEventListener() { // from class: com.thinkup.network.startapp.StartAppTUAdapter.1
            @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
            public final void onFailedToReceiveAd(Ad ad) {
                if (((TUBaseAdInternalAdapter) StartAppTUAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) StartAppTUAdapter.this).mLoadListener.onAdLoadError("", ad != null ? ad.getErrorMessage() : "StartApp load failed");
                }
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
            public final void onReceiveAd(Ad ad) {
                ArrayList<NativeAdDetails> nativeAds = startAppNativeAd.getNativeAds();
                if (nativeAds.size() <= 0) {
                    if (((TUBaseAdInternalAdapter) StartAppTUAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) StartAppTUAdapter.this).mLoadListener.onAdLoadError("", "StartApp return no ad");
                        return;
                    }
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<NativeAdDetails> it = nativeAds.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StartAppATNAd(it.next()));
                }
                if (((TUBaseAdInternalAdapter) StartAppTUAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) StartAppTUAdapter.this).mLoadListener.onAdCacheLoaded((CustomNativeAd[]) arrayList.toArray(new CustomNativeAd[arrayList.size()]));
                }
            }
        }, !TextUtils.isEmpty(this.m) ? this.m : null);
    }
}

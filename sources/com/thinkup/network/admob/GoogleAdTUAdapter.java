package com.thinkup.network.admob;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import com.thinkup.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class GoogleAdTUAdapter extends CustomNativeAdapter {
    private String o;

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return AdMobTUInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "unit_id");
        String stringFromMap2 = TUInitMediation.getStringFromMap(map, "media_ratio");
        if (TextUtils.isEmpty(stringFromMap)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "unitId is empty.");
                return;
            }
            return;
        }
        this.o = stringFromMap;
        boolean z2 = false;
        if (map != null) {
            try {
                if (map.containsKey(CustomNativeAd.IS_AUTO_PLAY_KEY)) {
                    z2 = Boolean.parseBoolean(map.get(CustomNativeAd.IS_AUTO_PLAY_KEY).toString());
                }
            } catch (Exception unused) {
            }
        }
        GoogleAdTUNativeAd.LoadCallbackListener loadCallbackListener = new GoogleAdTUNativeAd.LoadCallbackListener() { // from class: com.thinkup.network.admob.GoogleAdTUAdapter.1
            @Override // com.thinkup.network.admob.GoogleAdTUNativeAd.LoadCallbackListener
            public final void onFail(String str, String str2) {
                if (((TUBaseAdInternalAdapter) GoogleAdTUAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) GoogleAdTUAdapter.this).mLoadListener.onAdLoadError(str, str2);
                }
            }

            @Override // com.thinkup.network.admob.GoogleAdTUNativeAd.LoadCallbackListener
            public final void onSuccess(CustomNativeAd customNativeAd) {
                if (((TUBaseAdInternalAdapter) GoogleAdTUAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) GoogleAdTUAdapter.this).mLoadListener.onAdCacheLoaded(customNativeAd);
                }
            }
        };
        Context applicationContext = context.getApplicationContext();
        GoogleAdTUNativeAd googleAdTUNativeAd = new GoogleAdTUNativeAd(applicationContext, stringFromMap2, stringFromMap, loadCallbackListener, map2);
        googleAdTUNativeAd.setIsAutoPlay(z2);
        googleAdTUNativeAd.loadAd(applicationContext, map, map2);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return AdMobTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }
}

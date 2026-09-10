package com.thinkup.network.helium;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HeliumTUSplashAdapter extends CustomSplashAdapter {
    private String o;

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(3, HeliumTUInterstitialAdapter.class);
        return map;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return HeliumTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return HeliumTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        return false;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.o = TUInitMediation.getStringFromMap(map, "placement_name");
        notifyATLoadFail("", "not support helium splash");
    }

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
    }
}

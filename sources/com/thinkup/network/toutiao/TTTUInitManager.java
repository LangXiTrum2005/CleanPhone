package com.thinkup.network.toutiao;

import android.content.Context;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.network.pangle.PangleTUInitManager;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class TTTUInitManager extends TUInitMediation {
    public static synchronized PangleTUInitManager getInstance() {
        return PangleTUInitManager.getInstance();
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.36";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkName() {
        return PangleTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkSDKClass() {
        return PangleTUInitManager.getInstance().getNetworkSDKClass();
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkVersion() {
        return PangleTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public List getProviderStatus() {
        return PangleTUInitManager.getInstance().getProviderStatus();
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        PangleTUInitManager.getInstance().initSDK(context, map, mediationInitCallback);
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return PangleTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }
}

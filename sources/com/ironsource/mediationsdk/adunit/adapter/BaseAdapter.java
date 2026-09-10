package com.ironsource.mediationsdk.adunit.adapter;

import com.ironsource.mediationsdk.AdapterNetworkData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.unity3d.mediation.LevelPlay;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseAdapter implements AdapterBaseInterface, AdapterConsentInterface, AdapterDebugInterface, AdapterSettingsInterface, AdapterNetworkDataInterface {
    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public boolean isUsingActivityBeforeImpression(LevelPlay.AdFormat adFormat) {
        return true;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z10) {
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z10) {
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(AdapterNetworkData adapterNetworkData) {
    }
}

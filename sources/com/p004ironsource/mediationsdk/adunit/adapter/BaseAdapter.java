package com.p004ironsource.mediationsdk.adunit.adapter;

import com.p004ironsource.mediationsdk.AdapterNetworkData;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.LoadWhileShowSupportState;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseAdapter implements AdapterBaseInterface, AdapterMetaDataInterface, AdapterConsentInterface, AdapterDebugInterface, AdapterSettingsInterface, AdapterNetworkDataInterface {
    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    @Deprecated
    public LoadWhileShowSupportState getBannerLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    @Deprecated
    public LoadWhileShowSupportState getLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        return LoadWhileShowSupportState.NONE;
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public boolean isUsingActivityBeforeImpression(IronSource.AD_UNIT ad_unit) {
        return true;
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z2) {
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z2) {
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    @Deprecated
    public void setMetaData(String str, List<String> list) {
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(AdapterNetworkData adapterNetworkData) {
    }
}

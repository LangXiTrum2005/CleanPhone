package com.p004ironsource.mediationsdk.adunit.adapter.internal;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.LoadWhileShowSupportState;
import com.p004ironsource.mediationsdk.model.NetworkSettings;

/* JADX INFO: loaded from: classes5.dex */
public interface AdapterSettingsInterface {
    LoadWhileShowSupportState getBannerLoadWhileShowSupportedState(NetworkSettings networkSettings);

    LoadWhileShowSupportState getLoadWhileShowSupportedState(NetworkSettings networkSettings);

    boolean isUsingActivityBeforeImpression(IronSource.AD_UNIT ad_unit);
}

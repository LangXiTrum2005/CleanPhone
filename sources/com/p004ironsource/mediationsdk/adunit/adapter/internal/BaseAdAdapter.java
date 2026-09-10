package com.p004ironsource.mediationsdk.adunit.adapter.internal;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.c;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseAdAdapter<NetworkAdapter extends AdapterBaseInterface, Listener> {
    private final IronSource.AD_UNIT mAdUnit;
    protected final UUID mAdUnitObjectId;
    protected final NetworkSettings mNetworkSettings;

    public BaseAdAdapter(IronSource.AD_UNIT ad_unit, NetworkSettings networkSettings) {
        this(ad_unit, networkSettings, null);
    }

    public NetworkAdapter getNetworkAdapter() {
        NetworkAdapter networkadapter = (NetworkAdapter) c.b().b(this.mNetworkSettings, this.mAdUnit, this.mAdUnitObjectId);
        if (networkadapter != null) {
            return networkadapter;
        }
        return null;
    }

    public NetworkSettings getNetworkSettings() {
        return this.mNetworkSettings;
    }

    public void releaseMemory() {
    }

    public BaseAdAdapter(IronSource.AD_UNIT ad_unit, NetworkSettings networkSettings, UUID uuid) {
        this.mAdUnit = ad_unit;
        this.mNetworkSettings = networkSettings;
        this.mAdUnitObjectId = uuid;
    }
}

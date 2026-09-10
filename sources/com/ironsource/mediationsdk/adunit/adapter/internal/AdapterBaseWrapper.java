package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.mediationsdk.model.NetworkSettings;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class AdapterBaseWrapper {
    AdapterBaseInterface adapterBaseInterface;
    NetworkSettings settings;

    public AdapterBaseWrapper(AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        this.adapterBaseInterface = adapterBaseInterface;
        this.settings = networkSettings;
    }

    public AdapterBaseInterface getAdapterBaseInterface() {
        return this.adapterBaseInterface;
    }

    public NetworkSettings getSettings() {
        return this.settings;
    }
}

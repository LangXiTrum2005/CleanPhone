package com.p004ironsource.mediationsdk.adunit.adapter.internal;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.model.NetworkSettings;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseAdInteractionAdapter<NetworkAdapter extends AdapterBaseInterface, Listener extends AdapterAdInteractionListener> extends BaseAdAdapter<NetworkAdapter, Listener> implements AdapterAdFullScreenInterface<Listener> {
    public BaseAdInteractionAdapter(IronSource.AD_UNIT ad_unit, NetworkSettings networkSettings) {
        super(ad_unit, networkSettings);
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void disposeAd(AdData adData) {
    }
}

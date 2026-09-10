package com.p004ironsource.mediationsdk.adunit.adapter;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.p004ironsource.mediationsdk.model.NetworkSettings;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseNativeAd<NetworkAdapter extends BaseAdapter> extends BaseAdAdapter<NetworkAdapter, NativeAdListener> implements AdapterNativeAdInterface<NativeAdListener> {
    public BaseNativeAd(NetworkSettings networkSettings) {
        super(IronSource.AD_UNIT.NATIVE_AD, networkSettings);
    }
}

package com.p004ironsource.mediationsdk.adunit.adapter;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.p004ironsource.mediationsdk.model.NetworkSettings;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseBanner<NetworkAdapter extends BaseAdapter> extends BaseAdAdapter<NetworkAdapter, BannerAdListener> implements AdapterBannerInterface<BannerAdListener> {
    public BaseBanner(NetworkSettings networkSettings) {
        super(IronSource.AD_UNIT.BANNER, networkSettings);
    }
}

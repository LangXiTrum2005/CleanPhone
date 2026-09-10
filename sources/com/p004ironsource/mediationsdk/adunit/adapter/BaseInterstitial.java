package com.p004ironsource.mediationsdk.adunit.adapter;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.p004ironsource.mediationsdk.model.NetworkSettings;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseInterstitial<NetworkAdapter extends BaseAdapter> extends BaseAdInteractionAdapter<NetworkAdapter, InterstitialAdListener> {
    public BaseInterstitial(NetworkSettings networkSettings) {
        super(IronSource.AD_UNIT.INTERSTITIAL, networkSettings);
    }
}

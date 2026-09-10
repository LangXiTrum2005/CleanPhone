package com.p004ironsource.mediationsdk.adunit.adapter.internal;

import android.content.Context;
import com.p004ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;

/* JADX INFO: loaded from: classes5.dex */
public interface AdapterBaseInterface {
    String getAdapterVersion();

    String getNetworkSDKVersion();

    void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener);
}

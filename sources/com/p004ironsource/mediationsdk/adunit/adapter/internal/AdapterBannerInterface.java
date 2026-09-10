package com.p004ironsource.mediationsdk.adunit.adapter.internal;

import android.app.Activity;
import com.p004ironsource.mediationsdk.ISBannerSize;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;

/* JADX INFO: loaded from: classes5.dex */
public interface AdapterBannerInterface<Listener extends AdapterAdListener> {
    void destroyAd(AdData adData);

    void loadAd(AdData adData, Activity activity, ISBannerSize iSBannerSize, Listener listener);
}

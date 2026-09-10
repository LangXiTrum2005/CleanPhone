package com.p004ironsource.mediationsdk.adunit.adapter.internal;

import android.app.Activity;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;

/* JADX INFO: loaded from: classes5.dex */
public interface AdapterAdFullScreenInterface<Listener extends AdapterAdListener> {
    void disposeAd(AdData adData);

    boolean isAdAvailable(AdData adData);

    void loadAd(AdData adData, Activity activity, Listener listener);

    void showAd(AdData adData, Listener listener);
}

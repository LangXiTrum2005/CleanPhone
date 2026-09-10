package com.ironsource.mediationsdk.adunit.adapter.internal;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface AdapterAdFullScreenInterface<Listener extends AdapterAdListener> {
    void destroyAd(AdData adData);

    boolean isAdAvailable(AdData adData);

    void loadAd(AdData adData, Context context, Listener listener);

    void showAd(AdData adData, Activity activity, Listener listener);
}

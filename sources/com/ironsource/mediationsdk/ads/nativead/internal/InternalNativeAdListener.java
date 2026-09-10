package com.ironsource.mediationsdk.ads.nativead.internal;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InternalNativeAdListener {
    void onNativeAdClicked(AdInfo adInfo);

    void onNativeAdImpression(AdInfo adInfo);

    void onNativeAdLoadFailed(IronSourceError ironSourceError);

    void onNativeAdLoaded(AdInfo adInfo, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder);
}

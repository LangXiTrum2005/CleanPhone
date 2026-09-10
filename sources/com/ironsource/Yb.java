package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Yb extends L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InternalNativeAdListener f28028a;

    public Yb(InternalNativeAdListener mNativeAdListener) {
        kotlin.jvm.internal.n.f(mNativeAdListener, "mNativeAdListener");
        this.f28028a = mNativeAdListener;
    }

    @Override // com.ironsource.L0
    public void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder, AdInfo adInfo) {
        kotlin.jvm.internal.n.f(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.n.f(nativeAdViewBinder, "nativeAdViewBinder");
        this.f28028a.onNativeAdLoaded(adInfo, adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.L0
    public void d(AdInfo adInfo) {
        this.f28028a.onNativeAdImpression(adInfo);
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.f28028a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.L0
    public void a(C0358gd placement, AdInfo adInfo) {
        kotlin.jvm.internal.n.f(placement, "placement");
        this.f28028a.onNativeAdClicked(adInfo);
    }
}

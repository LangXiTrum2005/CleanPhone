package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.D8;
import com.ironsource.F8;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class IronSourceNativeAdListener implements F8.a {
    private final IronSourceNativeAdViewBinder binder;
    private final NativeAdSmashListener smashListener;

    public IronSourceNativeAdListener(IronSourceNativeAdViewBinder binder, NativeAdSmashListener smashListener) {
        n.f(binder, "binder");
        n.f(smashListener, "smashListener");
        this.binder = binder;
        this.smashListener = smashListener;
    }

    @Override // com.ironsource.F8.a
    public void onNativeAdClicked() {
        this.smashListener.onNativeAdClicked();
    }

    @Override // com.ironsource.F8.a
    public void onNativeAdLoadFailed(String reason) {
        n.f(reason, "reason");
        this.smashListener.onNativeAdLoadFailed(new IronSourceError(510, "Load failed - ".concat(reason)));
    }

    @Override // com.ironsource.F8.a
    public void onNativeAdLoadSuccess(D8 adData) {
        n.f(adData, "adData");
        this.smashListener.onNativeAdLoaded(new IronSourceNativeAdData(adData), this.binder);
    }

    @Override // com.ironsource.F8.a
    public void onNativeAdShown() {
        this.smashListener.onNativeAdShown();
    }
}

package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.D8;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class IronSourceNativeAdData extends AdapterNativeAdData {
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final NativeAdDataInterface.Image icon;
    private final String title;

    public IronSourceNativeAdData(D8 nativeAdData) {
        n.f(nativeAdData, "nativeAdData");
        this.title = nativeAdData.n();
        this.advertiser = nativeAdData.h();
        this.body = nativeAdData.i();
        this.callToAction = nativeAdData.j();
        this.icon = new NativeAdDataInterface.Image(nativeAdData.k(), null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getBody() {
        return this.body;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getCallToAction() {
        return this.callToAction;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public NativeAdDataInterface.Image getIcon() {
        return this.icon;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getTitle() {
        return this.title;
    }
}

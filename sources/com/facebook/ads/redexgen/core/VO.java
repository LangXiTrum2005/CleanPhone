package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class VO implements AdView.AdViewLoadConfigBuilder, AdView.AdViewLoadConfig {
    public String A00;
    public final C1661Rd A01;

    public VO(C1661Rd c1661Rd) {
        this.A01 = c1661Rd;
    }

    public final String A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final AdView.AdViewLoadConfig build() {
        return this;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder
    public final AdView.AdViewLoadConfigBuilder withAdListener(AdListener adListener) {
        this.A01.A0C(adListener);
        return this;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final AdView.AdViewLoadConfigBuilder withBid(String str) {
        this.A00 = str;
        return this;
    }
}

package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.NativeAdViewTypeApi;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class S5 implements NativeAdViewTypeApi {
    public final EnumC1765Ve A00;

    public S5(int i2) {
        this.A00 = EnumC1765Ve.A00(i2);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getHeight() {
        return this.A00.A04();
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getValue() {
        return this.A00.A05();
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getWidth() {
        return this.A00.A06();
    }
}

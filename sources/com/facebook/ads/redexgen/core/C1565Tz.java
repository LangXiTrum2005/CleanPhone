package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1565Tz implements AdSizeApi {
    public final /* synthetic */ DynamicLoaderImpl A00;
    public final /* synthetic */ EnumC1605Vp A01;

    public C1565Tz(DynamicLoaderImpl dynamicLoaderImpl, EnumC1605Vp enumC1605Vp) {
        this.A00 = dynamicLoaderImpl;
        this.A01 = enumC1605Vp;
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getHeight() {
        return this.A01.A03();
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getWidth() {
        return this.A01.A04();
    }
}

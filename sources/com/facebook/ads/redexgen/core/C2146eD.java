package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2146eD extends AbstractRunnableC1787Wc {
    public final /* synthetic */ C2296ge A00;

    public C2146eD(C2296ge c2296ge) {
        this.A00 = c2296ge;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}

package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.internal.api.BidderTokenProviderApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1671Rn implements BidderTokenProviderApi {
    public final C1697So A00 = new C1697So();

    public final C1697So A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final String getBidderToken(Context context) {
        return this.A00.A06(C1673Rp.A09(context));
    }
}

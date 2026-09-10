package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.internal.api.BidderTokenProviderApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1502Rn implements BidderTokenProviderApi {
    public final C1528So A00 = new C1528So();

    public final C1528So A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final String getBidderToken(Context context) {
        return this.A00.A06(C1504Rp.A09(context));
    }
}

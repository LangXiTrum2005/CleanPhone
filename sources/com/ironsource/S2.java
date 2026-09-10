package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class S2 extends C0559s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ISBannerSize f27168b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(C0363h0 adProperties, ISBannerSize iSBannerSize) {
        super(adProperties);
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        this.f27168b = iSBannerSize;
    }

    @Override // com.ironsource.C0559s0, com.ironsource.InterfaceC0418k2
    public void a(com.ironsource.mediationsdk.h auctionRequestParams) {
        kotlin.jvm.internal.n.f(auctionRequestParams, "auctionRequestParams");
        super.a(auctionRequestParams);
        auctionRequestParams.a(this.f27168b);
    }
}

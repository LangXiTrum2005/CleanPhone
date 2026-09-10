package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3731s0 implements InterfaceC3593k2 {
    private final C3538h0 a;

    public C3731s0(C3538h0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.a = adProperties;
    }

    @Override // com.ironsource.InterfaceC3593k2
    public void a(com.ironsource.mediationsdk.h auctionRequestParams) {
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        auctionRequestParams.b(this.a.c());
        auctionRequestParams.a(this.a.a().toString());
        auctionRequestParams.a(Boolean.TRUE);
    }
}

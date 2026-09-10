package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0559s0 implements InterfaceC0418k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0363h0 f30190a;

    public C0559s0(C0363h0 adProperties) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        this.f30190a = adProperties;
    }

    @Override // com.ironsource.InterfaceC0418k2
    public void a(com.ironsource.mediationsdk.h auctionRequestParams) {
        kotlin.jvm.internal.n.f(auctionRequestParams, "auctionRequestParams");
        auctionRequestParams.b(this.f30190a.c());
        auctionRequestParams.a(this.f30190a.a().toString());
        auctionRequestParams.a(Boolean.TRUE);
    }
}

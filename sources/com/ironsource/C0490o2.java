package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0490o2 implements InterfaceC0508p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ed f29910b;

    public C0490o2(String encryptedAuctionResponse, Ed providerName) {
        kotlin.jvm.internal.n.f(encryptedAuctionResponse, "encryptedAuctionResponse");
        kotlin.jvm.internal.n.f(providerName, "providerName");
        this.f29909a = encryptedAuctionResponse;
        this.f29910b = providerName;
    }

    @Override // com.ironsource.InterfaceC0508p2
    public Object a() {
        Object objC;
        String strC = C0421k5.b().c();
        kotlin.jvm.internal.n.e(strC, "getInstance().mediationKey");
        try {
            objC = new C0534qa(new F4(this.f29909a, strC)).a();
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        Throwable thA = wj.h.a(objC);
        if (thA == null) {
            return C0454m2.f29224h.a((JSONObject) objC, this.f29910b.value());
        }
        C0474n4.d().a(thA);
        return thA instanceof IllegalArgumentException ? t9.e.c(new C0263b8(C0600u5.f30795a.d())) : t9.e.c(new C0263b8(C0600u5.f30795a.h()));
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.r5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0546r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0560s1 f30135a;

    public C0546r5(InterfaceC0560s1 analytics, String adRequestAdId, Ed adRequestProviderName) {
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(adRequestAdId, "adRequestAdId");
        kotlin.jvm.internal.n.f(adRequestProviderName, "adRequestProviderName");
        this.f30135a = analytics;
        analytics.a(new C0489o1.s(adRequestProviderName.value()), new C0489o1.b(adRequestAdId));
    }

    public final void a() {
        InterfaceC0435l1.c.f29094a.a().a(this.f30135a);
    }

    public final void a(IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        InterfaceC0435l1.c.f29094a.a(new C0489o1.j(error.getErrorCode()), new C0489o1.k(error.getErrorMessage()), new C0489o1.f(0L)).a(this.f30135a);
    }
}

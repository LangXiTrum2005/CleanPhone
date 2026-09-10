package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3703q5 {
    private final InterfaceC3732s1 a;

    public C3703q5(InterfaceC3732s1 analytics, String adRequestAdId, InterfaceC3727rd adRequestProviderName) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adRequestAdId, "adRequestAdId");
        Intrinsics.checkNotNullParameter(adRequestProviderName, "adRequestProviderName");
        this.a = analytics;
        analytics.a(new C3664o1.s(adRequestProviderName.value()), new C3664o1.b(adRequestAdId));
    }

    public final void a() {
        InterfaceC3610l1.c.a.a().a(this.a);
    }

    public final void a(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC3610l1.c.a.a(new C3664o1.j(error.getErrorCode()), new C3664o1.k(error.getErrorMessage()), new C3664o1.f(0L)).a(this.a);
    }
}

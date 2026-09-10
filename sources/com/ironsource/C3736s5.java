package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3736s5 implements InterfaceC3827xb {
    private final IronSourceError a;
    private final C3451c3 b;
    private final InterfaceC3732s1 c;

    public C3736s5(IronSourceError error, C3451c3 adLoadTaskListener, InterfaceC3732s1 analytics) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.a = error;
        this.b = adLoadTaskListener;
        this.c = analytics;
    }

    public final IronSourceError a() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC3827xb
    public void start() {
        InterfaceC3610l1.c.a aVar = InterfaceC3610l1.c.a;
        aVar.a().a(this.c);
        aVar.a(new C3664o1.j(this.a.getErrorCode()), new C3664o1.k(this.a.getErrorMessage()), new C3664o1.f(0L)).a(this.c);
        this.b.b(this.a);
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.t5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0582t5 implements Bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSourceError f30724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0276c3 f30725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0560s1 f30726c;

    public C0582t5(IronSourceError error, C0276c3 adLoadTaskListener, InterfaceC0560s1 analytics) {
        kotlin.jvm.internal.n.f(error, "error");
        kotlin.jvm.internal.n.f(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        this.f30724a = error;
        this.f30725b = adLoadTaskListener;
        this.f30726c = analytics;
    }

    public final IronSourceError a() {
        return this.f30724a;
    }

    @Override // com.ironsource.Bb
    public void start() {
        InterfaceC0435l1.c.a aVar = InterfaceC0435l1.c.f29094a;
        aVar.a().a(this.f30726c);
        aVar.a(new C0489o1.j(this.f30724a.getErrorCode()), new C0489o1.k(this.f30724a.getErrorMessage()), new C0489o1.f(0L)).a(this.f30726c);
        this.f30725b.b(this.f30724a);
    }
}

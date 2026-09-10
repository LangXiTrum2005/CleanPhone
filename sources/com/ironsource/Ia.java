package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ia implements Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ca f26286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L2 f26287b;

    public Ia(Ca strategy, L2 currentAdUnit) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        this.f26286a = strategy;
        this.f26287b = currentAdUnit;
    }

    @Override // com.ironsource.M0
    public void a(C0595u0 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        this.f26286a.a("Received load success while paused");
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.f26286a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ma
    public void c() {
        this.f26287b.a(true);
        Ca ca2 = this.f26286a;
        ca2.a((Ma) new Fa(ca2));
    }

    @Override // com.ironsource.Ma
    public void f() {
        Ca.a(this.f26286a, this.f26287b, (AbstractC0330f3) new AbstractC0330f3.a(AbstractC0330f3.b.c.f28614a), false, 4, (Object) null);
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.f26286a.a("Received load failed while paused");
    }

    @Override // com.ironsource.Ma
    public void d() {
    }
}

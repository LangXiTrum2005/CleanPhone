package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ha implements Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ca f26239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L2 f26240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26241c;

    public Ha(Ca strategy, L2 currentAdUnit, boolean z10) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        this.f26239a = strategy;
        this.f26240b = currentAdUnit;
        this.f26241c = z10;
    }

    @Override // com.ironsource.M0
    public void a(C0595u0 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        this.f26239a.a(adUnitCallback, this.f26240b, (L2) null, new AbstractC0330f3.a(AbstractC0330f3.b.C0070b.f28613a), this.f26241c, (Long) null);
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.f26239a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Ma
    public void c() {
        this.f26240b.a(true);
        Ca ca2 = this.f26239a;
        ca2.a((Ma) new Fa(ca2));
    }

    @Override // com.ironsource.Ma
    public void d() {
        this.f26241c = true;
    }

    @Override // com.ironsource.Ma
    public void f() {
        this.f26241c = false;
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.f26239a.a(ironSourceError, this.f26240b, (AbstractC0330f3) new AbstractC0330f3.a(AbstractC0330f3.b.a.f28612a), false, this.f26241c, (Long) null);
    }
}

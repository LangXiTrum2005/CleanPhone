package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ea implements Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ca f26013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26014b;

    public Ea(Ca strategy, boolean z10) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        this.f26013a = strategy;
        this.f26014b = z10;
    }

    @Override // com.ironsource.M0
    public void a(C0595u0 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        this.f26013a.a("Received load success before load");
    }

    @Override // com.ironsource.Ma
    public void b() {
        L2 l2A = this.f26013a.j().a(true);
        this.f26013a.a((Ma) new Ha(this.f26013a, l2A, this.f26014b));
        l2A.a(this.f26013a.g());
    }

    @Override // com.ironsource.Ma
    public void c() {
        Ca ca2 = this.f26013a;
        ca2.a((Ma) new Fa(ca2));
    }

    @Override // com.ironsource.Ma
    public void d() {
        this.f26014b = true;
    }

    @Override // com.ironsource.Ma
    public void f() {
        this.f26014b = false;
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.f26013a.a("Received load failed before load");
    }

    public /* synthetic */ Ea(Ca ca2, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
        this(ca2, (i10 & 2) != 0 ? false : z10);
    }
}

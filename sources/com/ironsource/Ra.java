package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ra implements Ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Oa f27144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L2 f27145b;

    public Ra(Oa strategy, L2 adUnit) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f27144a = strategy;
        this.f27145b = adUnit;
    }

    @Override // com.ironsource.Ta
    public void a(C0595u0 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        this.f27144a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.Ta
    public void b() {
        this.f27144a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ta
    public void c() {
        this.f27145b.a(true);
        this.f27144a.a((L2) null);
        Oa oa2 = this.f27144a;
        oa2.a(new Qa(oa2));
    }

    @Override // com.ironsource.Ta
    public void a(IronSourceError ironSourceError) {
        this.f27144a.a("Ad unit is already loaded");
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Sa implements Ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Oa f27181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L2 f27182b;

    public Sa(Oa strategy, L2 adUnit) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f27181a = strategy;
        this.f27182b = adUnit;
    }

    @Override // com.ironsource.Ta
    public void a(C0595u0 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        this.f27181a.a(adUnitCallback, this.f27182b);
        Oa oa2 = this.f27181a;
        oa2.a(new Ra(oa2, this.f27182b));
    }

    @Override // com.ironsource.Ta
    public void b() {
        this.f27181a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Ta
    public void c() {
        this.f27182b.a(true);
        this.f27181a.a((L2) null);
        Oa oa2 = this.f27181a;
        oa2.a(new Qa(oa2));
    }

    @Override // com.ironsource.Ta
    public void a(IronSourceError ironSourceError) {
        this.f27181a.a(ironSourceError);
        this.f27182b.a(false);
        this.f27181a.a((L2) null);
        Oa oa2 = this.f27181a;
        oa2.a(new Qa(oa2));
    }
}

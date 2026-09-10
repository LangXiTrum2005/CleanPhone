package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Qa implements Ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Oa f27092a;

    public Qa(Oa strategy) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        this.f27092a = strategy;
    }

    @Override // com.ironsource.Ta
    public void a(C0595u0 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        this.f27092a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Ta
    public void b() {
        this.f27092a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Ta
    public void c() {
        this.f27092a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Ta
    public void a(IronSourceError ironSourceError) {
        this.f27092a.a("Received load failed on a destroyed ad");
    }
}

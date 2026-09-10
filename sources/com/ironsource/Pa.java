package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Pa implements Ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Oa f27040a;

    public Pa(Oa strategy) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        this.f27040a = strategy;
    }

    @Override // com.ironsource.Ta
    public void a(C0595u0 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        this.f27040a.a("Received load success before load called");
    }

    @Override // com.ironsource.Ta
    public void b() {
        L2 l2A = this.f27040a.i().a(true);
        this.f27040a.a(l2A);
        Oa oa2 = this.f27040a;
        oa2.a(new Sa(oa2, l2A));
        l2A.a(this.f27040a.g());
    }

    @Override // com.ironsource.Ta
    public void c() {
        L2 l2K = this.f27040a.k();
        if (l2K != null) {
            l2K.a(false);
        }
        this.f27040a.a((L2) null);
        Oa oa2 = this.f27040a;
        oa2.a(new Qa(oa2));
    }

    @Override // com.ironsource.Ta
    public void a(IronSourceError ironSourceError) {
        this.f27040a.a("Received load failed before load called");
    }
}

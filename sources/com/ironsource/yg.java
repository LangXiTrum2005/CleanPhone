package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Yg implements bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ug f28058a;

    public Yg(Ug waterfallOperations) {
        kotlin.jvm.internal.n.f(waterfallOperations, "waterfallOperations");
        this.f28058a = waterfallOperations;
    }

    @Override // com.ironsource.bh
    public void a() {
    }

    @Override // com.ironsource.bh
    public Nd b() {
        return Nd.FEATURE_DISABLED;
    }

    @Override // com.ironsource.bh
    public B c() {
        return this.f28058a.a(0);
    }

    @Override // com.ironsource.bh
    public void a(B it) {
        kotlin.jvm.internal.n.f(it, "it");
        this.f28058a.a(it);
        this.f28058a.a();
    }
}

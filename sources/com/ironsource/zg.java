package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Zg implements bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ug f28132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28133b;

    public Zg(Ug waterfallOperations) {
        kotlin.jvm.internal.n.f(waterfallOperations, "waterfallOperations");
        this.f28132a = waterfallOperations;
    }

    @Override // com.ironsource.bh
    public void a(B it) {
        kotlin.jvm.internal.n.f(it, "it");
        this.f28133b++;
        this.f28132a.a(it);
    }

    @Override // com.ironsource.bh
    public Nd b() {
        if (this.f28133b >= 2) {
            return Nd.MAX_ATTEMPTS_REACHED;
        }
        return !this.f28132a.b() ? Nd.NO_LOADED_ADS : Nd.CAN_RECOVER;
    }

    @Override // com.ironsource.bh
    public B c() {
        return this.f28132a.a(this.f28133b);
    }

    @Override // com.ironsource.bh
    public void a() {
        this.f28132a.a();
    }
}

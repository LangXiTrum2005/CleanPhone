package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class W6 implements X6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC0244a7 f27528b;

    public W6(long j10, EnumC0244a7 recoveryStrategy) {
        kotlin.jvm.internal.n.f(recoveryStrategy, "recoveryStrategy");
        this.f27527a = j10;
        this.f27528b = recoveryStrategy;
    }

    @Override // com.ironsource.X6
    public long a() {
        return this.f27527a;
    }

    @Override // com.ironsource.X6
    public EnumC0244a7 b() {
        return this.f27528b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W6(Z6 feature) {
        this(feature.a(), feature.c());
        kotlin.jvm.internal.n.f(feature, "feature");
    }
}

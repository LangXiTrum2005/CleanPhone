package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.gf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0360gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P f28750a;

    public AbstractC0360gf(P p10) {
        this.f28750a = p10;
    }

    public final P a() {
        return this.f28750a;
    }

    public abstract EnumC0485nf b();

    public final C0630w a(Jb<AbstractC0360gf, C0630w> mapper) {
        kotlin.jvm.internal.n.f(mapper, "mapper");
        return mapper.a(this);
    }
}

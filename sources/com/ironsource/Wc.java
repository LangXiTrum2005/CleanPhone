package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H3 f27595b;

    public Wc(long j10, H3 unit) {
        kotlin.jvm.internal.n.f(unit, "unit");
        this.f27594a = j10;
        this.f27595b = unit;
    }

    public final long a() {
        return this.f27594a;
    }

    public final H3 b() {
        return this.f27595b;
    }

    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.f27594a + " unit=" + this.f27595b + ")";
    }

    public /* synthetic */ Wc(long j10, H3 h7, int i10, kotlin.jvm.internal.g gVar) {
        this(j10, (i10 & 2) != 0 ? H3.Second : h7);
    }
}

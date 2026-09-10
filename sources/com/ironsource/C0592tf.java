package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.tf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0592tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H3 f30732b;

    public C0592tf(int i10, H3 unit) {
        kotlin.jvm.internal.n.f(unit, "unit");
        this.f30731a = i10;
        this.f30732b = unit;
    }

    public final int a() {
        return this.f30731a;
    }

    public final H3 b() {
        return this.f30732b;
    }

    public String toString() {
        return "ShowCountCappingConfig(maxImpressions=" + this.f30731a + ", unit=" + this.f30732b + ")";
    }
}

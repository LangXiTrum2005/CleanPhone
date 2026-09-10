package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3535gf {
    private final int a;
    private final H3 b;

    public C3535gf(int i, H3 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.a = i;
        this.b = unit;
    }

    public final int a() {
        return this.a;
    }

    public final H3 b() {
        return this.b;
    }

    public String toString() {
        return "ShowCountCappingConfig(maxImpressions=" + this.a + ", unit=" + this.b + ")";
    }
}

package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.sf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0574sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30701b;

    public C0574sf(String identifier, String baseConst) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        kotlin.jvm.internal.n.f(baseConst, "baseConst");
        this.f30700a = identifier;
        this.f30701b = baseConst;
    }

    public final String a() {
        return wi.d.i(this.f30700a, "_", this.f30701b);
    }
}

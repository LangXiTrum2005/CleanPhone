package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.gd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0358gd extends AbstractC0473n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f28748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28749f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0358gd(int i10, String placementName, boolean z10, String rewardName, int i11, C0376hd c0376hd) {
        super(i10, placementName, z10, c0376hd);
        kotlin.jvm.internal.n.f(placementName, "placementName");
        kotlin.jvm.internal.n.f(rewardName, "rewardName");
        this.f28749f = i11;
        this.f28748e = rewardName;
    }

    public final int e() {
        return this.f28749f;
    }

    public final String f() {
        return this.f28748e;
    }

    @Override // com.ironsource.AbstractC0473n3
    public String toString() {
        return super.toString() + ", reward name: " + this.f28748e + " , amount: " + this.f28749f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0358gd(AbstractC0473n3 placement) {
        super(placement.b(), placement.c(), placement.d(), placement.a());
        kotlin.jvm.internal.n.f(placement, "placement");
        this.f28748e = "";
    }
}

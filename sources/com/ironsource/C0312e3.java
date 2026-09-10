package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.e3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0312e3 extends AbstractC0473n3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0312e3(int i10, String placementName, boolean z10, C0376hd c0376hd) {
        super(i10, placementName, z10, c0376hd);
        kotlin.jvm.internal.n.f(placementName, "placementName");
    }

    @Override // com.ironsource.AbstractC0473n3
    public String toString() {
        return super.toString() + ", placementId: " + b();
    }
}

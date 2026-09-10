package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u42 extends h32 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f5 f20626c;

    public u42(ci ciVar, f5 f5Var) {
        super(ciVar);
        this.f20626c = f5Var;
    }

    @Override // com.google.android.gms.internal.ads.h32, com.google.android.gms.internal.ads.ci
    public final ih b(int i10, ih ihVar, long j10) {
        this.f15101b.b(i10, ihVar, j10);
        f5 f5Var = this.f20626c;
        ihVar.f15745b = f5Var;
        l2 l2Var = f5Var.f14214b;
        return ihVar;
    }
}

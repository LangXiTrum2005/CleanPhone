package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 extends t2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a3 f14195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.c f14196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(androidx.recyclerview.widget.c cVar, a3 a3Var, a3 a3Var2) {
        super(a3Var);
        this.f14195b = a3Var2;
        this.f14196c = cVar;
    }

    @Override // com.google.android.gms.internal.ads.t2, com.google.android.gms.internal.ads.a3
    public final z2 b(long j10) {
        z2 z2VarB = this.f14195b.b(j10);
        b3 b3Var = z2VarB.f22469a;
        long j11 = b3Var.f12619a;
        long j12 = b3Var.f12620b;
        long j13 = this.f14196c.f4728b;
        b3 b3Var2 = new b3(j11, j12 + j13);
        b3 b3Var3 = z2VarB.f22470b;
        return new z2(b3Var2, new b3(b3Var3.f12619a, b3Var3.f12620b + j13));
    }
}

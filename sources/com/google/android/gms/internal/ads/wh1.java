package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wh1 extends vh1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f21519d;

    /* JADX WARN: Illegal instructions before constructor call */
    public wh1(iw0 iw0Var) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        super(jArr, jArr2, jArr4);
        this.f21519d = jArr3;
        ay0 ay0Var = (ay0) iw0Var.f15864b;
        ps1.w(jArr, (long[]) ay0Var.f12538c, (long[]) ay0Var.f12537b);
        ps1.E(jArr2, (long[]) ay0Var.f12538c, (long[]) ay0Var.f12537b);
        System.arraycopy((long[]) ay0Var.f12539d, 0, jArr3, 0, 10);
        ps1.S(jArr4, (long[]) iw0Var.f15865c, xh1.f21899b);
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void a(long[] jArr, long[] jArr2) {
        ps1.S(jArr, jArr2, this.f21519d);
    }
}

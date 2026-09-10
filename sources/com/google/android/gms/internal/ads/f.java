package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14125b;

    public f(g22 g22Var, int i10) {
        this.f14124a = 1 == (g22Var.f14669e & 1);
        this.f14125b = ux1.s(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        return v91.f21141a.d(this.f14125b, fVar.f14125b).d(this.f14124a, fVar.f14124a).e();
    }
}

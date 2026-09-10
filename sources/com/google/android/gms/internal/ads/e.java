package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13790f;

    public e(int i10, ni niVar, int i11, h hVar, int i12) {
        int i13;
        super(i10, niVar, i11);
        this.f13789e = ux1.s(i12, hVar.B) ? 1 : 0;
        g22 g22Var = this.f16231d;
        int i14 = g22Var.f14685v;
        int i15 = -1;
        if (i14 != -1 && (i13 = g22Var.f14686w) != -1) {
            i15 = i14 * i13;
        }
        this.f13790f = i15;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final int a() {
        return this.f13789e;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final /* bridge */ /* synthetic */ boolean b(k kVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f13790f, ((e) obj).f13790f);
    }
}

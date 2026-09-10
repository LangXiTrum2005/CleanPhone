package zl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f55068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55069c;

    public l(int i10, i0 i0Var, boolean z10) {
        this.f55067a = i10;
        this.f55068b = i0Var;
        this.f55069c = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f55067a - ((l) obj).f55067a;
    }
}

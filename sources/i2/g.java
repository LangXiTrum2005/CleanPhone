package i2;

import oa.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f42773b;

    public g(i1.p pVar, int i10) {
        this.f42772a = (pVar.f42635e & 1) != 0;
        this.f42773b = p1.a.k(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return y.f47346a.c(this.f42773b, gVar.f42773b).c(this.f42772a, gVar.f42772a).e();
    }
}

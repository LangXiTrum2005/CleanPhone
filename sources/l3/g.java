package l3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k3.i implements Comparable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f45011k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (c(4) != gVar.c(4)) {
            return c(4) ? 1 : -1;
        }
        long j10 = this.f47037g - gVar.f47037g;
        if (j10 == 0) {
            j10 = this.f45011k - gVar.f45011k;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}

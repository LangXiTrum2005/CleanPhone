package n2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface a0 {
    void a(long j10, int i10, int i11, int i12, z zVar);

    void b(i1.p pVar);

    default int c(i1.i iVar, int i10, boolean z10) {
        return f(iVar, i10, z10);
    }

    void d(l1.q qVar, int i10, int i11);

    int f(i1.i iVar, int i10, boolean z10);

    default void g(int i10, l1.q qVar) {
        d(qVar, i10, 0);
    }

    default void e(long j10) {
    }
}

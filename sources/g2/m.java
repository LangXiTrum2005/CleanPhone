package g2;

import i1.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f41413j;

    public m(n1.h hVar, n1.k kVar, p pVar, int i10, Object obj, long j10, long j11, long j12) {
        super(hVar, kVar, 1, pVar, i10, obj, j10, j11);
        pVar.getClass();
        this.f41413j = j12;
    }

    public long a() {
        long j10 = this.f41413j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean b();
}

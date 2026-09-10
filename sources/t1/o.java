package t1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f50401j;

    public o(j jVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
        super(jVar, j10, j11, j12, j13, list, j14, j15, j16);
        this.f50401j = list2;
    }

    @Override // t1.n
    public final long d(long j10) {
        return this.f50401j.size();
    }

    @Override // t1.n
    public final j h(k kVar, long j10) {
        return (j) this.f50401j.get((int) (j10 - this.f50395d));
    }

    @Override // t1.n
    public final boolean i() {
        return true;
    }
}

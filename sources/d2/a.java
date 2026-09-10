package d2;

import s1.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g2.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38620d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f38621e;

    public a(e2.b bVar, int i10) {
        super(i10, bVar.f39033k - 1);
        this.f38621e = bVar;
    }

    @Override // g2.n
    public final long c() {
        switch (this.f38620d) {
            case 0:
                a();
                e2.b bVar = (e2.b) this.f38621e;
                return bVar.f39036o[(int) this.f41346c];
            default:
                a();
                return ((h) this.f38621e).e(this.f41346c);
        }
    }

    @Override // g2.n
    public final long d() {
        switch (this.f38620d) {
            case 0:
                return ((e2.b) this.f38621e).b((int) this.f41346c) + c();
            default:
                a();
                return ((h) this.f38621e).d(this.f41346c);
        }
    }

    public a(h hVar, long j10, long j11) {
        super(j10, j11);
        this.f38621e = hVar;
    }
}

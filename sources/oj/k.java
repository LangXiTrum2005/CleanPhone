package oj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements fn.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fn.e f47497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0.d f47498c;

    public /* synthetic */ k(fn.e eVar, w0.d dVar, int i10) {
        this.f47496a = i10;
        this.f47497b = eVar;
        this.f47498c = dVar;
    }

    @Override // fn.e
    public final Object collect(fn.f fVar, ak.f fVar2) {
        switch (this.f47496a) {
            case 0:
                Object objCollect = this.f47497b.collect(new j(fVar, this.f47498c, 0), fVar2);
                return objCollect == bk.a.f5708a ? objCollect : wj.r.f53297a;
            case 1:
                Object objCollect2 = this.f47497b.collect(new j(fVar, this.f47498c, 1), fVar2);
                return objCollect2 == bk.a.f5708a ? objCollect2 : wj.r.f53297a;
            case 2:
                Object objCollect3 = this.f47497b.collect(new j(fVar, this.f47498c, 2), fVar2);
                return objCollect3 == bk.a.f5708a ? objCollect3 : wj.r.f53297a;
            default:
                Object objCollect4 = this.f47497b.collect(new j(fVar, this.f47498c, 3), fVar2);
                return objCollect4 == bk.a.f5708a ? objCollect4 : wj.r.f53297a;
        }
    }
}

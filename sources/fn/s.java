package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f41145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41146c;

    public /* synthetic */ s(e eVar, jk.c cVar, int i10) {
        this.f41144a = i10;
        this.f41145b = eVar;
        this.f41146c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    @Override // fn.e
    public final Object collect(f fVar, ak.f fVar2) {
        y yVar;
        p pVar;
        switch (this.f41144a) {
            case 0:
                Object objCollect = ((s) this.f41145b).collect(new u(new kotlin.jvm.internal.y(), fVar, (androidx.lifecycle.p) this.f41146c, 0), fVar2);
                return objCollect == bk.a.f5708a ? objCollect : wj.r.f53297a;
            case 1:
                if (fVar2 instanceof y) {
                    yVar = (y) fVar2;
                    int i10 = yVar.f41188g;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        yVar.f41188g = i10 - Integer.MIN_VALUE;
                    } else {
                        yVar = new y(this, fVar2);
                    }
                } else {
                    yVar = new y(this, fVar2);
                }
                Object obj = yVar.f41187f;
                int i11 = yVar.f41188g;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = yVar.f41190i;
                    try {
                        t9.e.z(obj);
                    } catch (gn.a e10) {
                        e = e10;
                        if (e.f41980a == pVar) {
                            throw e;
                        }
                        cn.d0.m(yVar.getContext());
                    }
                    break;
                } else {
                    t9.e.z(obj);
                    k kVar = (k) this.f41145b;
                    p pVar2 = new p((jh.f) this.f41146c, fVar, 2);
                    try {
                        yVar.f41190i = pVar2;
                        yVar.f41188g = 1;
                        Object objCollect2 = kVar.collect(pVar2, yVar);
                        bk.a aVar = bk.a.f5708a;
                        if (objCollect2 == aVar) {
                            return aVar;
                        }
                    } catch (gn.a e11) {
                        e = e11;
                        pVar = pVar2;
                        if (e.f41980a == pVar) {
                            throw e;
                        }
                        cn.d0.m(yVar.getContext());
                    }
                }
                return wj.r.f53297a;
            default:
                Object objCollect3 = this.f41145b.collect(new p(5, fVar, this.f41146c), fVar2);
                return objCollect3 == bk.a.f5708a ? objCollect3 : wj.r.f53297a;
        }
    }
}

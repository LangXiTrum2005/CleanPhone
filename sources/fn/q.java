package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f41138b;

    public /* synthetic */ q(e eVar, int i10) {
        this.f41137a = i10;
        this.f41138b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    @Override // fn.e
    public final Object collect(f fVar, ak.f fVar2) {
        w wVar;
        Object obj;
        switch (this.f41137a) {
            case 0:
                Object objCollect = this.f41138b.collect(new p(new kotlin.jvm.internal.a0(), fVar, 1), fVar2);
                return objCollect == bk.a.f5708a ? objCollect : wj.r.f53297a;
            case 1:
                if (fVar2 instanceof w) {
                    wVar = (w) fVar2;
                    int i10 = wVar.f41179g;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        wVar.f41179g = i10 - Integer.MIN_VALUE;
                    } else {
                        wVar = new w(this, fVar2);
                    }
                } else {
                    wVar = new w(this, fVar2);
                }
                Object obj2 = wVar.f41178f;
                int i11 = wVar.f41179g;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = wVar.f41181i;
                    try {
                        t9.e.z(obj2);
                    } catch (gn.a e10) {
                        e = e10;
                        if (e.f41980a != obj) {
                            throw e;
                        }
                    }
                    break;
                } else {
                    t9.e.z(obj2);
                    Object obj3 = new Object();
                    kotlin.jvm.internal.a0 a0Var = new kotlin.jvm.internal.a0();
                    try {
                        e eVar = this.f41138b;
                        u uVar = new u(a0Var, fVar, obj3, 1);
                        wVar.f41181i = obj3;
                        wVar.f41179g = 1;
                        Object objCollect2 = eVar.collect(uVar, wVar);
                        bk.a aVar = bk.a.f5708a;
                        if (objCollect2 == aVar) {
                            return aVar;
                        }
                    } catch (gn.a e11) {
                        e = e11;
                        obj = obj3;
                        if (e.f41980a != obj) {
                            throw e;
                        }
                    }
                }
                return wj.r.f53297a;
            case 2:
                Object objCollect3 = this.f41138b.collect(new i0(fVar, 0, false), fVar2);
                return objCollect3 == bk.a.f5708a ? objCollect3 : wj.r.f53297a;
            default:
                Object objCollect4 = this.f41138b.collect(new i0(fVar, 3, false), fVar2);
                return objCollect4 == bk.a.f5708a ? objCollect4 : wj.r.f53297a;
        }
    }
}

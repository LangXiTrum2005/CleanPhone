package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41139a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f41140b;

    public q0(s sVar) {
        this.f41140b = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Type inference failed for: r4v4, types: [ck.i, jk.c] */
    @Override // fn.e
    public final Object collect(f fVar, ak.f fVar2) throws Throwable {
        a aVar;
        gn.o oVar;
        switch (this.f41139a) {
            case 0:
                if (fVar2 instanceof a) {
                    aVar = (a) fVar2;
                    int i10 = aVar.f41024i;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        aVar.f41024i = i10 - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(this, fVar2);
                    }
                } else {
                    aVar = new a(this, fVar2);
                }
                Object obj = aVar.f41022g;
                int i11 = aVar.f41024i;
                wj.r rVar = wj.r.f53297a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = aVar.f41021f;
                    try {
                        t9.e.z(obj);
                        oVar.releaseIntercepted();
                        return rVar;
                    } catch (Throwable th2) {
                        th = th2;
                        oVar.releaseIntercepted();
                        throw th;
                    }
                }
                t9.e.z(obj);
                gn.o oVar2 = new gn.o(fVar, aVar.getContext());
                try {
                    aVar.f41021f = oVar2;
                    aVar.f41024i = 1;
                    try {
                        Object objInvoke = ((ck.i) this.f41140b).invoke(oVar2, aVar);
                        bk.a aVar2 = bk.a.f5708a;
                        if (objInvoke != aVar2) {
                            objInvoke = rVar;
                        }
                        if (objInvoke == aVar2) {
                            return aVar2;
                        }
                        oVar = oVar2;
                        oVar.releaseIntercepted();
                        return rVar;
                    } catch (Throwable th3) {
                        th = th3;
                        oVar = oVar2;
                        oVar.releaseIntercepted();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
            default:
                Object objCollect = ((s) this.f41140b).collect(new i0(fVar, 4, false), fVar2);
                return objCollect == bk.a.f5708a ? objCollect : wj.r.f53297a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q0(jk.c cVar) {
        this.f41140b = (ck.i) cVar;
    }
}

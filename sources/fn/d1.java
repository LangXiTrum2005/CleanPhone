package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d1 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f41055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ck.i f41056b;

    /* JADX WARN: Multi-variable type inference failed */
    public d1(f fVar, jk.c cVar) {
        this.f41055a = fVar;
        this.f41056b = (ck.i) cVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v3, types: [ck.i, jk.c] */
    public final Object b(ck.c cVar) throws Throwable {
        c1 c1Var;
        Throwable th2;
        gn.o oVar;
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i10 = c1Var.f41045i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1Var.f41045i = i10 - Integer.MIN_VALUE;
            } else {
                c1Var = new c1(this, cVar);
            }
        } else {
            c1Var = new c1(this, cVar);
        }
        Object obj = c1Var.f41043g;
        int i11 = c1Var.f41045i;
        wj.r rVar = wj.r.f53297a;
        f fVar = this.f41055a;
        bk.a aVar = bk.a.f5708a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return rVar;
            }
            oVar = c1Var.f41042f;
            try {
                t9.e.z(obj);
                oVar.releaseIntercepted();
                if (fVar instanceof d1) {
                    c1Var.f41042f = null;
                    c1Var.f41045i = 2;
                    if (((d1) fVar).b(c1Var) == aVar) {
                    }
                }
                return rVar;
            } catch (Throwable th3) {
                th2 = th3;
                oVar.releaseIntercepted();
                throw th2;
            }
        }
        t9.e.z(obj);
        gn.o oVar2 = new gn.o(fVar, c1Var.getContext());
        try {
            ?? r10 = this.f41056b;
            c1Var.f41042f = oVar2;
            c1Var.f41045i = 1;
            if (r10.invoke(oVar2, c1Var) != aVar) {
                oVar = oVar2;
                oVar.releaseIntercepted();
                if (fVar instanceof d1) {
                    c1Var.f41042f = null;
                    c1Var.f41045i = 2;
                    if (((d1) fVar).b(c1Var) == aVar) {
                    }
                }
                return rVar;
            }
        } catch (Throwable th4) {
            th2 = th4;
            oVar = oVar2;
            oVar.releaseIntercepted();
            throw th2;
        }
        return aVar;
    }

    @Override // fn.f
    public final Object emit(Object obj, ak.f fVar) {
        return this.f41055a.emit(obj, fVar);
    }
}

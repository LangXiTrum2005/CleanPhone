package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f49878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e0 f49880h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(e0 e0Var, ak.f fVar, int i10) {
        super(2, fVar);
        this.f49878f = i10;
        this.f49880h = e0Var;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f49878f) {
            case 0:
                return new p(this.f49880h, fVar, 0);
            case 1:
                return new p(this.f49880h, fVar, 1);
            default:
                return new p(this.f49880h, fVar, 2);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f49878f) {
            case 0:
                return ((p) create((fn.f) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            case 1:
                return ((p) create((cn.a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            default:
                return ((p) create((cn.a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
        }
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f49878f) {
            case 0:
                int i10 = this.f49879g;
                if (i10 == 0) {
                    t9.e.z(obj);
                    this.f49879g = 1;
                    Object objD = e0.d(this.f49880h, this);
                    bk.a aVar = bk.a.f5708a;
                    if (objD == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                return wj.r.f53297a;
            case 1:
                int i11 = this.f49879g;
                wj.r rVar = wj.r.f53297a;
                e0 e0Var = this.f49880h;
                bk.a aVar2 = bk.a.f5708a;
                if (i11 == 0) {
                    t9.e.z(obj);
                    k5.g gVar = e0Var.f49790i;
                    this.f49879g = 1;
                    Object objS = ((cn.r) gVar.f44326b).s(this);
                    if (objS != aVar2) {
                        objS = rVar;
                    }
                    if (objS != aVar2) {
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return rVar;
                }
                t9.e.z(obj);
                fn.e eVarH = fn.g.h(e0Var.g().b(), -1);
                v vVar = new v(e0Var, 0);
                this.f49879g = 2;
                if (eVarH.collect(vVar, this) != aVar2) {
                    return rVar;
                }
                return aVar2;
            default:
                e0 e0Var2 = this.f49880h;
                qj.x xVar = e0Var2.f49789h;
                int i12 = this.f49879g;
                bk.a aVar3 = bk.a.f5708a;
                try {
                    if (i12 != 0) {
                        if (i12 == 1) {
                            t9.e.z(obj);
                        } else {
                            if (i12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t9.e.z(obj);
                        }
                        return (f1) obj;
                    }
                    t9.e.z(obj);
                    if (xVar.u() instanceof o0) {
                        return xVar.u();
                    }
                    this.f49879g = 1;
                    if (e0Var2.h(this) == aVar3) {
                        return aVar3;
                    }
                    this.f49879g = 2;
                    obj = e0.e(e0Var2, false, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    return (f1) obj;
                } catch (Throwable th2) {
                    return new y0(th2, -1);
                }
        }
    }
}

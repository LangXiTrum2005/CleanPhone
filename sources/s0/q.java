package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ck.i implements jk.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f49881f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f49883h;

    public /* synthetic */ q(int i10, ak.f fVar) {
        super(i10, fVar);
    }

    @Override // jk.d
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f49881f) {
            case 0:
                return new q((e0) this.f49883h, (ak.f) obj3).invokeSuspend(wj.r.f53297a);
            default:
                ((Boolean) obj2).getClass();
                q qVar = new q(3, (ak.f) obj3);
                qVar.f49883h = (g0) obj;
                return qVar.invokeSuspend(wj.r.f53297a);
        }
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f49881f) {
            case 0:
                int i10 = this.f49882g;
                if (i10 == 0) {
                    t9.e.z(obj);
                    e0 e0Var = (e0) this.f49883h;
                    this.f49882g = 1;
                    Object objB = e0.b(e0Var, this);
                    bk.a aVar = bk.a.f5708a;
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                return wj.r.f53297a;
            default:
                int i11 = this.f49882g;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return obj;
                }
                t9.e.z(obj);
                g0 g0Var = (g0) this.f49883h;
                this.f49882g = 1;
                g0Var.getClass();
                Object objA = g0.a(g0Var, this);
                bk.a aVar2 = bk.a.f5708a;
                return objA == aVar2 ? aVar2 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e0 e0Var, ak.f fVar) {
        super(3, fVar);
        this.f49883h = e0Var;
    }
}

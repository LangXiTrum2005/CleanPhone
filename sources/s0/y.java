package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends ck.i implements jk.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Throwable f49952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e0 f49954h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(e0 e0Var, ak.f fVar) {
        super(1, fVar);
        this.f49954h = e0Var;
    }

    @Override // ck.a
    public final ak.f create(ak.f fVar) {
        return new y(this.f49954h, fVar);
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        return ((y) create((ak.f) obj)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        f1 y0Var;
        int i10 = this.f49953g;
        e0 e0Var = this.f49954h;
        bk.a aVar = bk.a.f5708a;
        try {
            if (i10 == 0) {
                t9.e.z(obj);
                this.f49953g = 1;
                obj = e0.f(e0Var, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = this.f49952f;
                    t9.e.z(obj);
                    y0Var = new y0(th2, ((Number) obj).intValue());
                    return new wj.f(y0Var, Boolean.TRUE);
                }
                t9.e.z(obj);
            }
            y0Var = (f1) obj;
        } catch (Throwable th3) {
            p0 p0VarG = e0Var.g();
            this.f49952f = th3;
            this.f49953g = 2;
            Object objA = p0VarG.a(this);
            if (objA != aVar) {
                obj = objA;
                th2 = th3;
            }
            return aVar;
        }
        return new wj.f(y0Var, Boolean.TRUE);
    }
}

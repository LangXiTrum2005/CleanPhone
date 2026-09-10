package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ck.i implements jk.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f49806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f49808h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, ak.f fVar, int i10) {
        super(1, fVar);
        this.f49806f = i10;
        this.f49808h = obj;
    }

    @Override // ck.a
    public final ak.f create(ak.f fVar) {
        switch (this.f49806f) {
            case 0:
                return new g((e) this.f49808h, fVar, 0);
            default:
                return new g((b0) this.f49808h, fVar, 1);
        }
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        ak.f fVar = (ak.f) obj;
        switch (this.f49806f) {
            case 0:
                break;
        }
        return ((g) create(fVar)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f49806f) {
            case 0:
                int i10 = this.f49807g;
                if (i10 == 0) {
                    t9.e.z(obj);
                    e eVar = (e) this.f49808h;
                    this.f49807g = 1;
                    Object objCleanUp = eVar.cleanUp(this);
                    bk.a aVar = bk.a.f5708a;
                    if (objCleanUp == aVar) {
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
                int i11 = this.f49807g;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return obj;
                }
                t9.e.z(obj);
                b0 b0Var = (b0) this.f49808h;
                this.f49807g = 1;
                Object objInvoke = b0Var.invoke(this);
                bk.a aVar2 = bk.a.f5708a;
                return objInvoke == aVar2 ? aVar2 : objInvoke;
        }
    }
}

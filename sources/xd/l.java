package xd;

import cn.a0;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f53761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f53763h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, ak.f fVar, int i10) {
        super(2, fVar);
        this.f53761f = i10;
        this.f53763h = nVar;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f53761f) {
            case 0:
                return new l(this.f53763h, fVar, 0);
            default:
                return new l(this.f53763h, fVar, 1);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f53761f) {
            case 0:
                break;
        }
        return ((l) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f53761f) {
            case 0:
                int i10 = this.f53762g;
                if (i10 == 0) {
                    t9.e.z(obj);
                    n nVar = this.f53763h;
                    fn.e data = nVar.f53768b.getData();
                    k kVar = new k(nVar.f53769c);
                    this.f53762g = 1;
                    Object objCollect = data.collect(kVar, this);
                    bk.a aVar = bk.a.f5708a;
                    if (objCollect == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                return r.f53297a;
            default:
                int i11 = this.f53762g;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return obj;
                }
                t9.e.z(obj);
                fn.e data2 = this.f53763h.f53768b.getData();
                this.f53762g = 1;
                Object objK = fn.g.k(data2, this);
                bk.a aVar2 = bk.a.f5708a;
                return objK == aVar2 ? aVar2 : objK;
        }
    }
}

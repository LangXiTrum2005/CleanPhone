package s5;

import cn.a0;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f50171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi.j f50172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f50173h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(wi.j jVar, Object obj, ak.f fVar, int i10) {
        super(2, fVar);
        this.f50171f = i10;
        this.f50172g = jVar;
        this.f50173h = obj;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f50171f) {
            case 0:
                return new l(this.f50172g, this.f50173h, fVar, 0);
            default:
                return new l(this.f50172g, this.f50173h, fVar, 1);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f50171f) {
            case 0:
                l lVar = (l) create(a0Var, fVar);
                r rVar = r.f53297a;
                lVar.invokeSuspend(rVar);
                return rVar;
            default:
                l lVar2 = (l) create(a0Var, fVar);
                r rVar2 = r.f53297a;
                lVar2.invokeSuspend(rVar2);
                return rVar2;
        }
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f50171f) {
            case 0:
                t9.e.z(obj);
                this.f50172g.a(this.f50173h);
                break;
            default:
                t9.e.z(obj);
                this.f50172g.a(this.f50173h);
                break;
        }
        return r.f53297a;
    }
}

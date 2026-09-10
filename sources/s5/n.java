package s5;

import cn.a0;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f50177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f50178g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(boolean z10, ak.f fVar, int i10) {
        super(2, fVar);
        this.f50177f = i10;
        this.f50178g = z10;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f50177f) {
            case 0:
                return new n(this.f50178g, fVar, 0);
            case 1:
                return new n(this.f50178g, fVar, 1);
            default:
                return new n(this.f50178g, fVar, 2);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f50177f) {
            case 0:
                n nVar = (n) create(a0Var, fVar);
                r rVar = r.f53297a;
                nVar.invokeSuspend(rVar);
                return rVar;
            case 1:
                n nVar2 = (n) create(a0Var, fVar);
                r rVar2 = r.f53297a;
                nVar2.invokeSuspend(rVar2);
                return rVar2;
            default:
                return ((n) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f50177f;
        r rVar = r.f53297a;
        boolean z10 = this.f50178g;
        switch (i10) {
            case 0:
                t9.e.z(obj);
                wi.j jVar = o.f50182f;
                if (jVar != null) {
                    jVar.a(Boolean.valueOf(z10));
                }
                o.f50182f = null;
                return rVar;
            case 1:
                t9.e.z(obj);
                wi.j jVar2 = o.f50182f;
                if (jVar2 != null) {
                    jVar2.a(Boolean.valueOf(z10));
                }
                o.f50182f = null;
                return rVar;
            default:
                t9.e.z(obj);
                xi.g gVar = zg.a.f54954b;
                if (gVar == null) {
                    return null;
                }
                gVar.b(Boolean.valueOf(z10));
                return rVar;
        }
    }
}

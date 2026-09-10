package s5;

import cn.a0;
import java.util.Map;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f50174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Map f50175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wi.j f50176h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Map map, wi.j jVar, ak.f fVar, int i10) {
        super(2, fVar);
        this.f50174f = i10;
        this.f50175g = map;
        this.f50176h = jVar;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f50174f) {
            case 0:
                return new m(this.f50175g, this.f50176h, fVar, 0);
            case 1:
                return new m(this.f50175g, this.f50176h, fVar, 1);
            default:
                return new m(this.f50176h, this.f50175g, fVar);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f50174f) {
            case 0:
                m mVar = (m) create(a0Var, fVar);
                r rVar = r.f53297a;
                mVar.invokeSuspend(rVar);
                return rVar;
            case 1:
                m mVar2 = (m) create(a0Var, fVar);
                r rVar2 = r.f53297a;
                mVar2.invokeSuspend(rVar2);
                return rVar2;
            default:
                m mVar3 = (m) create(a0Var, fVar);
                r rVar3 = r.f53297a;
                mVar3.invokeSuspend(rVar3);
                return rVar3;
        }
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f50174f) {
            case 0:
                t9.e.z(obj);
                wi.j jVar = this.f50176h;
                Map map = this.f50175g;
                if (map != null) {
                    jVar.a(map);
                } else {
                    jVar.b("", "failed to create contact", "");
                }
                break;
            case 1:
                t9.e.z(obj);
                wi.j jVar2 = this.f50176h;
                Map map2 = this.f50175g;
                if (map2 != null) {
                    jVar2.a(map2);
                } else {
                    jVar2.b("", "failed to update contact", "");
                }
                break;
            default:
                t9.e.z(obj);
                this.f50176h.a(this.f50175g);
                break;
        }
        return r.f53297a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(wi.j jVar, Map map, ak.f fVar) {
        super(2, fVar);
        this.f50174f = 2;
        this.f50176h = jVar;
        this.f50175g = map;
    }
}

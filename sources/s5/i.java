package s5;

import cn.a0;
import cn.d0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f50162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi.j f50163g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(wi.j jVar, ak.f fVar, int i10) {
        super(2, fVar);
        this.f50162f = i10;
        this.f50163g = jVar;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f50162f) {
            case 0:
                return new i(this.f50163g, fVar, 0);
            case 1:
                return new i(this.f50163g, fVar, 1);
            case 2:
                return new i(this.f50163g, fVar, 2);
            case 3:
                return new i(this.f50163g, fVar, 3);
            case 4:
                return new i(this.f50163g, fVar, 4);
            default:
                return new i(this.f50163g, fVar, 5);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f50162f) {
            case 0:
                i iVar = (i) create(a0Var, fVar);
                r rVar = r.f53297a;
                iVar.invokeSuspend(rVar);
                return rVar;
            case 1:
                i iVar2 = (i) create(a0Var, fVar);
                r rVar2 = r.f53297a;
                iVar2.invokeSuspend(rVar2);
                return rVar2;
            case 2:
                i iVar3 = (i) create(a0Var, fVar);
                r rVar3 = r.f53297a;
                iVar3.invokeSuspend(rVar3);
                return rVar3;
            case 3:
                i iVar4 = (i) create(a0Var, fVar);
                r rVar4 = r.f53297a;
                iVar4.invokeSuspend(rVar4);
                return rVar4;
            case 4:
                i iVar5 = (i) create(a0Var, fVar);
                r rVar5 = r.f53297a;
                iVar5.invokeSuspend(rVar5);
                return rVar5;
            default:
                i iVar6 = (i) create(a0Var, fVar);
                r rVar6 = r.f53297a;
                iVar6.invokeSuspend(rVar6);
                return rVar6;
        }
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f50162f;
        r rVar = r.f53297a;
        wi.j jVar = this.f50163g;
        switch (i10) {
            case 0:
                t9.e.z(obj);
                jVar.a(Boolean.FALSE);
                break;
            case 1:
                t9.e.z(obj);
                jVar.a(Boolean.TRUE);
                break;
            case 2:
                t9.e.z(obj);
                an.g gVar = h.f50155a;
                x7.a.G(o.f50179c, o.f50180d, false, null);
                o.f50185i = jVar;
                break;
            case 3:
                t9.e.z(obj);
                jVar.a(null);
                break;
            case 4:
                t9.e.z(obj);
                jVar.a(null);
                break;
            default:
                t9.e.z(obj);
                kh.e.f44649c = true;
                ConcurrentHashMap concurrentHashMap = ch.f.f6431a;
                ug.a aVar = kh.e.f44650d;
                CancellationException cancellationException = new CancellationException("cancel request");
                cancellationException.initCause(aVar);
                ch.c cVar = (ch.c) ch.f.f6431a.remove(ch.e.f6427f);
                if (cVar != null) {
                    d0.i(cVar.f6421b.f42424a, cancellationException);
                    cVar.f6420a.close();
                }
                jVar.a(Boolean.TRUE);
                break;
        }
        return rVar;
    }
}

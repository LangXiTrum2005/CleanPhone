package jc;

import ak.f;
import an.g;
import ck.i;
import cn.a0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import s5.h;
import s5.o;
import t9.e;
import w0.d;
import wi.j;
import wj.r;
import xi.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f43808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f43809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f43810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f43811i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, f fVar, int i10) {
        super(2, fVar);
        this.f43808f = i10;
        this.f43810h = obj;
        this.f43811i = obj2;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        switch (this.f43808f) {
            case 0:
                b bVar = new b((d) this.f43810h, (Long) this.f43811i, fVar, 0);
                bVar.f43809g = obj;
                return bVar;
            case 1:
                b bVar2 = new b((d) this.f43810h, (String) this.f43811i, fVar, 1);
                bVar2.f43809g = obj;
                return bVar2;
            default:
                b bVar3 = new b((m) this.f43810h, (j) this.f43811i, fVar, 2);
                bVar3.f43809g = obj;
                return bVar3;
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43808f) {
            case 0:
                b bVar = (b) create((w0.b) obj, (f) obj2);
                r rVar = r.f53297a;
                bVar.invokeSuspend(rVar);
                return rVar;
            case 1:
                b bVar2 = (b) create((w0.b) obj, (f) obj2);
                r rVar2 = r.f53297a;
                bVar2.invokeSuspend(rVar2);
                return rVar2;
            default:
                b bVar3 = (b) create((a0) obj, (f) obj2);
                r rVar3 = r.f53297a;
                bVar3.invokeSuspend(rVar3);
                return rVar3;
        }
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f43808f;
        r rVar = r.f53297a;
        Object obj2 = this.f43811i;
        Object obj3 = this.f43810h;
        switch (i10) {
            case 0:
                e.z(obj);
                ((w0.b) this.f43809g).e((d) obj3, (Long) obj2);
                break;
            case 1:
                w0.b bVar = (w0.b) this.f43809g;
                e.z(obj);
                bVar.e((d) obj3, (String) obj2);
                break;
            default:
                e.z(obj);
                Object obj4 = ((m) obj3).f53823b;
                n.d(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                Object objR0 = xj.n.r0(0, (List) obj4);
                Map map = null;
                if (objR0 != null) {
                    Map map2 = objR0 instanceof Map ? (Map) objR0 : null;
                    if (map2 != null) {
                        map = map2;
                    }
                }
                g gVar = h.f50155a;
                x7.a.G(o.f50179c, o.f50180d, true, map);
                o.f50186j = (j) obj2;
                break;
        }
        return rVar;
    }
}

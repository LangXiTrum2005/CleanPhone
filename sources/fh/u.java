package fh;

import cn.a0;
import cn.d0;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f40926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Map f40928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f40929i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Map map, List list, ak.f fVar, int i10) {
        super(2, fVar);
        this.f40926f = i10;
        this.f40928h = map;
        this.f40929i = list;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f40926f) {
            case 0:
                return new u(this.f40928h, this.f40929i, fVar, 0);
            default:
                return new u(this.f40928h, this.f40929i, fVar, 1);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f40926f) {
            case 0:
                break;
        }
        return ((u) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f40926f) {
            case 0:
                int i10 = this.f40927g;
                ak.f fVar = null;
                wj.r rVar = wj.r.f53297a;
                bk.a aVar = bk.a.f5708a;
                if (i10 == 0) {
                    t9.e.z(obj);
                    gh.b bVar = v.f40931b;
                    this.f40927g = 1;
                    bVar.getClass();
                    Object objF = android.support.v4.media.session.a.f(new d(this.f40928h, fVar, 1), this);
                    if (objF != aVar) {
                        objF = rVar;
                    }
                    if (objF != aVar) {
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return rVar;
                }
                t9.e.z(obj);
                gh.b bVar2 = v.f40931b;
                this.f40927g = 2;
                bVar2.getClass();
                Object objF2 = android.support.v4.media.session.a.f(new a(this.f40929i, fVar, 2), this);
                if (objF2 != aVar) {
                    objF2 = rVar;
                }
                if (objF2 != aVar) {
                    return rVar;
                }
                return aVar;
            default:
                int i11 = this.f40927g;
                if (i11 == 0) {
                    t9.e.z(obj);
                    ch.c cVar = v.f40932c;
                    u uVar = new u(this.f40928h, this.f40929i, null, 0);
                    this.f40927g = 1;
                    Object objJ = d0.J(cVar.f6421b.f42424a, uVar, this);
                    bk.a aVar2 = bk.a.f5708a;
                    if (objJ == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                return wj.r.f53297a;
        }
    }
}

package zm;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends ck.h implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f55119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f55120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f55121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f55122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ wj.f f55123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ hk.i f55124k;
    public final /* synthetic */ jk.c l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wj.f fVar, hk.i iVar, jk.c cVar, ak.f fVar2) {
        super(2, fVar2);
        this.f55123j = fVar;
        this.f55124k = iVar;
        this.l = cVar;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        p pVar = new p(this.f55123j, this.f55124k, this.l, fVar);
        pVar.f55122i = obj;
        return pVar;
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((k) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        k kVar = (k) this.f55122i;
        int i10 = this.f55121h;
        Object obj2 = this.f55123j;
        bk.a aVar = bk.a.f5708a;
        if (i10 == 0) {
            t9.e.z(obj);
            this.f55122i = kVar;
            this.f55121h = 1;
            kVar.a(obj2, this);
            return aVar;
        }
        if (i10 == 1) {
            t9.e.z(obj);
            it = this.f55124k.iterator();
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f55120g;
            obj2 = this.f55119f;
            t9.e.z(obj);
        }
        if (!it.hasNext()) {
            return wj.r.f53297a;
        }
        Object objInvoke = this.l.invoke(obj2, it.next());
        this.f55122i = kVar;
        this.f55119f = objInvoke;
        this.f55120g = it;
        this.f55121h = 2;
        kVar.a(objInvoke, this);
        return aVar;
    }
}

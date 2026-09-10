package vg;

import cn.a0;
import java.util.ArrayList;
import java.util.List;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f52618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f52619g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(List list, ak.f fVar, int i10) {
        super(2, fVar);
        this.f52618f = i10;
        this.f52619g = list;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f52618f) {
            case 0:
                return new k(this.f52619g, fVar, 0);
            default:
                return new k(this.f52619g, fVar, 1);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f52618f) {
            case 0:
                k kVar = (k) create(a0Var, fVar);
                r rVar = r.f53297a;
                kVar.invokeSuspend(rVar);
                return rVar;
            default:
                k kVar2 = (k) create(a0Var, fVar);
                r rVar2 = r.f53297a;
                kVar2.invokeSuspend(rVar2);
                return rVar2;
        }
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f52618f) {
            case 0:
                t9.e.z(obj);
                List list = this.f52619g;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    dh.a aVar = (dh.a) obj2;
                    if (aVar.f38870b == ah.c.DUPLICATES && aVar.f38871c.size() >= aVar.f38870b.d()) {
                        arrayList.add(obj2);
                    }
                }
                android.support.v4.media.session.a.B(new j(com.bumptech.glide.c.J(arrayList), arrayList, null, 0));
                break;
            default:
                t9.e.z(obj);
                List list2 = this.f52619g;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    dh.a aVar2 = (dh.a) obj3;
                    if (aVar2.f38870b == ah.c.SIMILAR && aVar2.f38871c.size() >= aVar2.f38870b.d()) {
                        arrayList2.add(obj3);
                    }
                }
                android.support.v4.media.session.a.B(new j(com.bumptech.glide.c.J(arrayList2), arrayList2, null, 1));
                break;
        }
        return r.f53297a;
    }
}

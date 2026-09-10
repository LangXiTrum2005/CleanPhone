package tk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f51070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f51071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f51072g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(w wVar, z zVar, int i10) {
        super(0);
        this.f51070e = i10;
        this.f51071f = wVar;
        this.f51072g = zVar;
    }

    @Override // jk.a
    public final Object invoke() {
        int i10 = this.f51070e;
        z zVar = this.f51072g;
        w wVar = this.f51071f;
        switch (i10) {
            case 0:
                Collection<pm.y> collectionF = wVar.a().n().f();
                kotlin.jvm.internal.n.e(collectionF, "descriptor.typeConstructor.supertypes");
                ArrayList arrayList = new ArrayList(collectionF.size());
                for (pm.y kotlinType : collectionF) {
                    kotlin.jvm.internal.n.e(kotlinType, "kotlinType");
                    arrayList.add(new k1(kotlinType, new androidx.fragment.app.o(kotlinType, wVar, zVar, 5)));
                }
                zk.e eVarA = wVar.a();
                yl.f fVar = wk.h.f53310e;
                if (!wk.h.b(eVarA, wk.l.f53335a) && !wk.h.b(eVarA, wk.l.f53337b)) {
                    if (arrayList.isEmpty()) {
                        arrayList.add(new k1(fm.e.e(wVar.a()).e(), u.f51066e));
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int iL0 = bm.e.c(((k1) it.next()).f51002a).l0();
                            d5.u.u(iL0, "getClassDescriptorForType(it.type).kind");
                            if (iL0 == 2 || iL0 == 5) {
                            }
                        }
                        arrayList.add(new k1(fm.e.e(wVar.a()).e(), u.f51066e));
                    }
                }
                return ym.l.d(arrayList);
            default:
                List listI = wVar.a().i();
                kotlin.jvm.internal.n.e(listI, "descriptor.declaredTypeParameters");
                List<zk.m0> list = listI;
                ArrayList arrayList2 = new ArrayList(xj.p.W(list, 10));
                for (zk.m0 descriptor : list) {
                    kotlin.jvm.internal.n.e(descriptor, "descriptor");
                    arrayList2.add(new l1(zVar, descriptor));
                }
                return arrayList2;
        }
    }
}

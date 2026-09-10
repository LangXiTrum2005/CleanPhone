package ml;

import com.google.android.gms.internal.ads.hx0;
import com.google.android.gms.internal.measurement.nf;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import pm.y0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends cl.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nf f46188k;
    public final fl.b0 l;

    /* JADX WARN: Illegal instructions before constructor call */
    public g0(nf nfVar, fl.b0 javaTypeParameter, int i10, zk.k kVar) {
        kotlin.jvm.internal.n.f(javaTypeParameter, "javaTypeParameter");
        ll.a aVar = (ll.a) nfVar.f23782b;
        super(aVar.f45485a, kVar, new ll.c(nfVar, javaTypeParameter, false), yl.f.e(javaTypeParameter.f40979a.getName()), 1, false, i10, aVar.f45496m);
        this.f46188k = nfVar;
        this.l = javaTypeParameter;
    }

    @Override // cl.k
    public final List J0(List list) {
        g0 g0Var;
        ql.c cVar;
        nf nfVar = this.f46188k;
        ql.c cVar2 = ((ll.a) nfVar.f23782b).f45501r;
        cVar2.getClass();
        List<pm.y> list2 = list;
        ArrayList arrayList = new ArrayList(xj.p.W(list2, 10));
        for (pm.y yVarA : list2) {
            ql.m mVar = ql.m.f49163i;
            kotlin.jvm.internal.n.f(yVarA, "<this>");
            if (y0.c(yVarA, mVar, null)) {
                g0Var = this;
                cVar = cVar2;
            } else {
                g0Var = this;
                cVar = cVar2;
                yVarA = cVar.a(new hx0(g0Var, false, nfVar, il.a.TYPE_PARAMETER_BOUNDS, false), yVarA, xj.v.f53866a, null, false);
                if (yVarA == null) {
                    yVarA = yVarA;
                }
            }
            arrayList.add(yVarA);
            this = g0Var;
            cVar2 = cVar;
        }
        return arrayList;
    }

    @Override // cl.k
    public final List K0() {
        Type[] bounds = this.l.f40979a.getBounds();
        kotlin.jvm.internal.n.e(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new fl.p(type));
        }
        fl.p pVar = (fl.p) xj.n.H0(arrayList);
        Collection collection = arrayList;
        if (kotlin.jvm.internal.n.a(pVar != null ? pVar.f41003a : null, Object.class)) {
            collection = xj.v.f53866a;
        }
        Collection collection2 = collection;
        boolean zIsEmpty = collection2.isEmpty();
        nf nfVar = this.f46188k;
        if (zIsEmpty) {
            return j1.f.C(pm.f.j(((ll.a) nfVar.f23782b).f45498o.d().e(), ((ll.a) nfVar.f23782b).f45498o.d().o()));
        }
        Collection collection3 = collection2;
        ArrayList arrayList2 = new ArrayList(xj.p.W(collection3, 10));
        Iterator it = collection3.iterator();
        while (it.hasNext()) {
            arrayList2.add(((v9.e) nfVar.f23786f).L((fl.p) it.next(), android.support.v4.media.session.a.I(2, false, this, 3)));
        }
        return arrayList2;
    }
}
